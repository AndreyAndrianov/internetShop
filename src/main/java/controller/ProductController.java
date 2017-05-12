package controller;

import form.OrderConfirmationForm;
import form.ProductForm;
import model.Product;
import model.ProductsOnWarehouses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import pojo.Confirmation;
import pojo.ProductCounter;
import service.ProductService;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrey on 28.04.2017.
 */


@Controller
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/product")
    public String getProductPage(Model model, @RequestParam long id){
        Product currentProduct = new Product();
        int amount = 0;
        for(ProductsOnWarehouses pow : currentProduct.getProductsOnWarehouses()){
            if(pow.getProduct() == currentProduct.getId())
                amount += pow.getAmount();
        }
        currentProduct = productService.findOneById(id);
        ProductForm form = new ProductForm(currentProduct.getName(), currentProduct.getPrice(),
                amount, currentProduct.getDescription(), currentProduct.getId());
        model.addAttribute("product", form);
        return "product/product";
    }


    @RequestMapping(value = "/product/add", method = RequestMethod.POST)
    @ResponseBody
    public String addProduct(@ModelAttribute("product")ProductForm form, BindingResult res, Model model, HttpServletRequest request){
//        TODO:Проверку на авторизованного пользователя
        if(SecurityContextHolder.getContext().getAuthentication().getPrincipal() == null){
            return "redirect:/login";
        }
        List<ProductCounter> cart;
        if(request.getSession().getAttribute("shoppingCart") == null){
            cart = new ArrayList<>();
        }else {
            cart = (List<ProductCounter>)request.getSession().getAttribute("shoppingCart");
        }
        //добавить класс, соотносящий айдишник и количество товара
        cart.add(new ProductCounter(form.getAmount(), form.getProdId()));
        request.getSession().setAttribute("shoppingCart", cart);
        return "In your cart " + cart.size() + " products  <a href=\"/confirm_order\">Buy</a>";
    }

    @RequestMapping(value = "/confirm_order", method = RequestMethod.GET)
    public String getOrderConfirmationPage(Model model, HttpServletRequest request){
        OrderConfirmationForm form = new OrderConfirmationForm();
        ArrayList<ProductCounter> cart = (ArrayList<ProductCounter>)request.getSession().getAttribute("shoppingCart");
        ArrayList<Confirmation> confirmations = new ArrayList<>();
        for (ProductCounter pc : cart){
            Confirmation c = new Confirmation();
            c.setAmount(pc.getAmount());
            Product currentProduct = productService.findOneById(pc.getProdId());
            c.setCost(currentProduct.getPrice());
            c.setName(currentProduct.getName());
            c.setId(currentProduct.getId());
            confirmations.add(c);
        }
        form.setConfirmations(confirmations);
        model.addAttribute("c", confirmations);
        return "product/orderConfirm";
    }

    @RequestMapping(value = "/remove_product", method = RequestMethod.POST)
    public String removeProduct(@RequestParam long id, HttpServletRequest request){
        ArrayList<ProductCounter> cart = (ArrayList<ProductCounter>)request.getSession().getAttribute("shoppingCart");
        int deletedNum = 0;
        for(ProductCounter pc : cart){
            if(pc.getProdId() == id){
                break;
            }
            deletedNum++;
        }
        cart.remove(deletedNum);
        request.getSession().setAttribute("shoppingCart", cart);
        return "redirect:/confirm_order";
    }
}