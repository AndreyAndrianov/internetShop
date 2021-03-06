<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<t:mainLayout title="${product.name}">
    <h2>Сделай валидацию!</h2>
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-9">
                <h3>${product.name}</h3><br>
                <p>${product.description}</p>
            </div>
            <div class="col-md-3">
                <sf:form action="" modelAttribute="product" method="post" id="form">
                    <sf:hidden path="prodId"></sf:hidden>
                    <sf:label path="cost">Cost: ${product.cost}$</sf:label>
                    <br>
                    <sf:label path="amount">Good's amount</sf:label>
                    <sf:input path="amount" />
                    <security:authorize access="hasRole('ROLE_ADMIN') || hasRole('ROLE_USER')">
                        <input type="button" onclick="AjaxRequest()" value="Go"/>
                    </security:authorize>
                    <security:authorize access="hasRole('ROLE_ANONYMOUS')">
                        <a href="/login">Log in</a>
                    </security:authorize>
                    <label id="error"></label>
                </sf:form>
            </div>
        </div>
    </div>

    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.2.6/jquery.js"></script>
    <script type="text/javascript">
        function AjaxRequest() {
            jQuery.ajax({
                url: "/product/add",
                type: "POST",
                data: jQuery("#form").serialize(),
                success: function (response) {
                    if(response == 'We do not have enough products'){
                        document.getElementById("error").innerHTML = 'We do not have enough products';
                    }else {
                        document.getElementById("shoppingCart").innerHTML = response;
                    }
                },
                error: function () {
                    document.getElementById("error").innerHTML = 'We do not have enough products';
                }
            })
            
        }
    </script>
</t:mainLayout>

