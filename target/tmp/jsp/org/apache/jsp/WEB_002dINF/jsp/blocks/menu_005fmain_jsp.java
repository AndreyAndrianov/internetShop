/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.5.v20170502
 * Generated at: 2017-05-20 22:51:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.blocks;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import pojo.ProductCounter;

public final class menu_005fmain_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(7);
    _jspx_dependants.put("file:/F:/Progr/Java/InternetShop/target/InternetShop/WEB-INF/lib/spring-webmvc-4.3.8.RELEASE.jar", Long.valueOf(1494801506000L));
    _jspx_dependants.put("jar:file:/F:/Progr/Java/InternetShop/target/InternetShop/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153367082000L));
    _jspx_dependants.put("jar:file:/F:/Progr/Java/InternetShop/target/InternetShop/WEB-INF/lib/spring-security-taglibs-4.2.2.RELEASE.jar!/META-INF/security.tld", Long.valueOf(1488424532000L));
    _jspx_dependants.put("file:/F:/Progr/Java/InternetShop/target/InternetShop/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1461183016000L));
    _jspx_dependants.put("file:/F:/Progr/Java/InternetShop/target/InternetShop/WEB-INF/lib/spring-security-taglibs-4.2.2.RELEASE.jar", Long.valueOf(1492755564000L));
    _jspx_dependants.put("jar:file:/F:/Progr/Java/InternetShop/target/InternetShop/WEB-INF/lib/spring-webmvc-4.3.8.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1492511252000L));
    _jspx_dependants.put("jar:file:/F:/Progr/Java/InternetShop/target/InternetShop/WEB-INF/lib/spring-webmvc-4.3.8.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1492511252000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("pojo.ProductCounter");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005faction;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.release();
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005faction.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-inverse navbar-fixed-top\">\r\n");
      out.write("    <div>\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("            <div>\r\n");
      out.write("                <ul class=\"navbar navbar-nav\">\r\n");
      out.write("                    <li class=\"active\"><a href=\"/\" class=\"navbar-brand\">Магазин</a></li>\r\n");
      out.write("                    ");
      if (_jspx_meth_security_005fauthorize_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    ");
      //  security:authorize
      org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_security_005fauthorize_005f1 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
      try {
        _jspx_th_security_005fauthorize_005f1.setPageContext(_jspx_page_context);
        _jspx_th_security_005fauthorize_005f1.setParent(null);
        // /WEB-INF/jsp/blocks/menu_main.jsp(19,20) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_security_005fauthorize_005f1.setAccess("hasRole('ROLE_USER')");
        int _jspx_eval_security_005fauthorize_005f1 = _jspx_th_security_005fauthorize_005f1.doStartTag();
        if (_jspx_eval_security_005fauthorize_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\r\n");
          out.write("                        <li>\r\n");
          out.write("                            ");
          if (_jspx_meth_form_005fform_005f0(_jspx_th_security_005fauthorize_005f1, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("                        </li>\r\n");
          out.write("                        <li>\r\n");
          out.write("                            <label style=\"color: white\" id=\"shoppingCart\">  In your cart ");
          out.print(request.getSession().getAttribute("shoppingCart") == null ? 0 : ((ArrayList<ProductCounter>)(request.getSession().getAttribute("shoppingCart"))).size());
          out.write(" products</label>\r\n");
          out.write("                            ");
 if (request.getSession().getAttribute("shoppingCart") != null && ((ArrayList)(request.getSession().getAttribute("shoppingCart"))).size() != 0){ 
          out.write("\r\n");
          out.write("                                <a href=\"/confirm_order\">Buy</a>\r\n");
          out.write("                            ");
 } 
          out.write("\r\n");
          out.write("                        </li>\r\n");
          out.write("                        <li>\r\n");
          out.write("                            <a href=\"/myOrders\">My orders</a>\r\n");
          out.write("                        </li>\r\n");
          out.write("                    ");
        }
        if (_jspx_th_security_005fauthorize_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } finally {
        _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.reuse(_jspx_th_security_005fauthorize_005f1);
      }
      out.write("\r\n");
      out.write("                    ");
      if (_jspx_meth_security_005fauthorize_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("    ");
      out.write('\r');
      out.write('\n');
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_security_005fauthorize_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  security:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_security_005fauthorize_005f0 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    try {
      _jspx_th_security_005fauthorize_005f0.setPageContext(_jspx_page_context);
      _jspx_th_security_005fauthorize_005f0.setParent(null);
      // /WEB-INF/jsp/blocks/menu_main.jsp(15,20) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_security_005fauthorize_005f0.setAccess("hasRole('ROLE_ANONYMOUS')");
      int _jspx_eval_security_005fauthorize_005f0 = _jspx_th_security_005fauthorize_005f0.doStartTag();
      if (_jspx_eval_security_005fauthorize_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\r\n");
        out.write("                        <li><a href=\"/register\">Register</a></li>\r\n");
        out.write("                        <li><a href=\"/login\">Log in</a></li>\r\n");
        out.write("                    ");
      }
      if (_jspx_th_security_005fauthorize_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.reuse(_jspx_th_security_005fauthorize_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fform_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_security_005fauthorize_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
    try {
      _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_form_005fform_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_security_005fauthorize_005f1);
      // /WEB-INF/jsp/blocks/menu_main.jsp(21,28) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setAction("/logout");
      // /WEB-INF/jsp/blocks/menu_main.jsp(21,28) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setMethod("POST");
      int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
        if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                                <input type=\"submit\" value=\"Logout\" />\r\n");
            out.write("                            ");
            int evalDoAfterBody = _jspx_th_form_005fform_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_form_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_005fform_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_005fform_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_005fform_005f0.doFinally();
      }
    } finally {
      _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005faction.reuse(_jspx_th_form_005fform_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_security_005fauthorize_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  security:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_security_005fauthorize_005f2 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    try {
      _jspx_th_security_005fauthorize_005f2.setPageContext(_jspx_page_context);
      _jspx_th_security_005fauthorize_005f2.setParent(null);
      // /WEB-INF/jsp/blocks/menu_main.jsp(35,20) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_security_005fauthorize_005f2.setAccess("hasRole('ROLE_ADMIN')");
      int _jspx_eval_security_005fauthorize_005f2 = _jspx_th_security_005fauthorize_005f2.doStartTag();
      if (_jspx_eval_security_005fauthorize_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\r\n");
        out.write("                        <li>\r\n");
        out.write("                            ");
        if (_jspx_meth_form_005fform_005f1(_jspx_th_security_005fauthorize_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                        </li>\r\n");
        out.write("                    ");
      }
      if (_jspx_th_security_005fauthorize_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.reuse(_jspx_th_security_005fauthorize_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fform_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_security_005fauthorize_005f2, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f1 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
    try {
      _jspx_th_form_005fform_005f1.setPageContext(_jspx_page_context);
      _jspx_th_form_005fform_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_security_005fauthorize_005f2);
      // /WEB-INF/jsp/blocks/menu_main.jsp(37,28) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f1.setAction("/logout");
      // /WEB-INF/jsp/blocks/menu_main.jsp(37,28) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f1.setMethod("POST");
      int[] _jspx_push_body_count_form_005fform_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_form_005fform_005f1 = _jspx_th_form_005fform_005f1.doStartTag();
        if (_jspx_eval_form_005fform_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                                <input type=\"submit\" value=\"Logout\" />\r\n");
            out.write("                            ");
            int evalDoAfterBody = _jspx_th_form_005fform_005f1.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_form_005fform_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_005fform_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_005fform_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_005fform_005f1.doFinally();
      }
    } finally {
      _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005faction.reuse(_jspx_th_form_005fform_005f1);
    }
    return false;
  }
}
