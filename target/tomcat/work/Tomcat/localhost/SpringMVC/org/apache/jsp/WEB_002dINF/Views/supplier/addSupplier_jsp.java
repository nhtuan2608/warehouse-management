/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-06-29 16:14:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.Views.supplier;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.logging.Logger;

public final class addSupplier_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
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
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');

	Logger logger = Logger.getLogger(this.getClass().getName());

      out.write("\r\n");
      out.write("<div style=\"margin-left: 20px\">\r\n");
      out.write("\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${urlShowSupplier}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"> <span class=\"fas fa-angle-double-left\">\r\n");
      out.write("\t\t\t<u> List Supplier </u>\r\n");
      out.write("\t</span>\r\n");
      out.write("\t</a>\r\n");
      out.write("\t<br/>\r\n");
      out.write("\r\n");
      out.write("\t<form autocomplete=\"on\" name=\"userForm\" action=\"saveSupplier\"\r\n");
      out.write("\t\tmethod=\"POST\" modelAttribute=\"supplier,address\" id=\"formAddSupplier\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-sm\">\r\n");
      out.write("\t\t\t\t\t<div><hr style=\"border: 1px solid red;\"><h3>Supplier</h3></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col\">\r\n");
      out.write("\t\t\t\t\t\t\t<label>Supplier's ID:</label>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-6\">\r\n");
      out.write("\t\t\t\t\t\t\t<input id=\"id\" name=\"id\" style=\"font-size: 15px; width: 100%;\"\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${supplier.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" readonly=\"true\" />\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"id\" style=\"font-size: 13px; color: red;\"></label>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col\">\r\n");
      out.write("\t\t\t\t\t\t\t<label>Supplier's name:</label>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-6\">\r\n");
      out.write("\t\t\t\t\t\t\t<input id=\"name\" type=\"text\" name=\"name\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"font-size: 15px;width: 100%;\" autofocus=\"true\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Supplier's name\" />\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"name\" class=\"error\" style=\"font-size: 13px; color: red;\"></label>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col\">\r\n");
      out.write("\t\t\t\t\t\t\t<label>Phone number:</label>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-6\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"number\" name=\"phoneNumber\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Phone number\" style=\"font-size: 15px;width: 100%;\"\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"phoneNumber\" />\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"phoneNumber\" class=\"error\" style=\"font-size: 13px; color: red;\"></label>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col\">\r\n");
      out.write("\t\t\t\t\t\t\t<label>Email:</label>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-6\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"email\" name=\"email\" placeholder=\"Email\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"font-size: 15px;width: 100%;\" id=\"email\" />\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"email\" class=\"error\" style=\"font-size: 13px; color: red;\"></label>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t<div class=\"col-sm\">\r\n");
      out.write("\t\t\t\t\t<div><hr style=\"border: 1px solid red;\"><h3>Address</h3></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col\">\r\n");
      out.write("\t\t\t\t\t\t\t<label>Street:</label>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-6\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"street\" placeholder=\"Street\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"font-size: 15px;width: 100%;\" id=\"street\" />\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"street\" style=\"font-size: 13px; color: red;\"></label>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col\">\r\n");
      out.write("\t\t\t\t\t\t\t<label>Ward:</label>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-6\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"ward\" placeholder=\"Ward\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"font-size: 15px;width: 100%;\" id=\"ward\" />\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"ward\" style=\"font-size: 13px; color: red;\"></label>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col\">\r\n");
      out.write("\t\t\t\t\t\t\t<label>District:</label>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-6\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"dicstrict\" placeholder=\"District\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"font-size: 15px;width: 100%;\" id=\"district\" />\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"district\" style=\"font-size: 13px; color: red;\"></label>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col\">\r\n");
      out.write("\t\t\t\t\t\t\t<label>City:</label>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-6\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"city\" placeholder=\"City\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"font-size: 15px;width: 100%;\" id=\"city\" />\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"city\" style=\"font-size: 13px; color: red;\"></label>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col\">\r\n");
      out.write("\t\t\t\t\t\t\t<label>Country:</label>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-6\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"country\" placeholder=\"Country\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"font-size: 15px;width: 100%;\" id=\"country\" />\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"country\" style=\"font-size: 13px; color: red;\"></label>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col\">\r\n");
      out.write("\t\t\t\t\t\t\t<label>Postal Code:</label>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-6\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"number\" id=\"postalCode\" name=\"postalCode\" placeholder=\"Postal Code\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"font-size: 15px;width: 100%;\" />\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"postalCode\" style=\"font-size: 13px; color: red;\"></label>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm\"></div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm\"><input type=\"submit\" value=\"Add Supplier\" name=\"btnSubmit\" /></div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t</form>\r\n");
      out.write("\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</div>\r\n");

	String message = "Suppliers = " + pageContext.findAttribute("listSuppliers") + ", Address = "
			+ pageContext.findAttribute("address");
	logger.info(message);

    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /WEB-INF/Views/supplier/addSupplier.jsp(5,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/showSupplier");
    // /WEB-INF/Views/supplier/addSupplier.jsp(5,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setVar("urlShowSupplier");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/Views/supplier/addSupplier.jsp(140,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty userExisted}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t");
        out.write("\r\n");
        out.write("\t\t<script type=\"text/javascript\">\r\n");
        out.write("\t\t\tdocument.getElementById(\"email-error-dialog\").innerHTML = \"Error\";\r\n");
        out.write("\t\t\tdocument.getElementById(\"email-error-dialog\").style.color = \"red\";\r\n");
        out.write("\t\t</script>\r\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }
}
