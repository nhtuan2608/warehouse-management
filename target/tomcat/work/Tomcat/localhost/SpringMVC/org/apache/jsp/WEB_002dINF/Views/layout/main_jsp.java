/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-06-29 15:57:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.Views.layout;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.logging.Logger;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.release();
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html\"; charset=\"UTF-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"author\" content=\"\">\r\n");
      if (_jspx_meth_tiles_005fimportAttribute_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<title>");
      if (_jspx_meth_spring_005fmessage_005f0(_jspx_page_context))
        return;
      out.write("</title>\r\n");
      out.write("<title>Spring MVC 5</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/sb-admin-2.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/vendor/fontawesome-free/css/all.min.css\"\r\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"//cdnjs.cloudflare.com/ajax/libs/jquery-form-validator/2.3.26/theme-default.min.css\"\r\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/vendor/datatables/dataTables.bootstrap4.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.datatables.net/1.10.19/css/jquery.dataTables.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(".titleTable {\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tbackground-color: #c3d0e5;\r\n");
      out.write("\tcolor: #181919;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".actionCol {\r\n");
      out.write("\tmax-width: 42px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("td .td_Id {\r\n");
      out.write("\tmax-width: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#btnAddUser {\r\n");
      out.write("\tmargin-left: 225px;\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\tflex: auto;\r\n");
      out.write("}\r\n");
      out.write(".error{\r\n");
      out.write("\tfont-size: 13px;\r\n");
      out.write("\tcolor: red;\r\n");
      out.write("}\r\n");
      out.write("label.error{\r\n");
      out.write("\tmargin-left: 16px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("select#role {\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 28.4px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("select#dropBox {\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 28.4px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("select#dropBox1 {\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 28.4px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("#strongDetailSupplier{\r\n");
      out.write("\tpadding-left: 10px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");

	Logger logger = Logger.getLogger(this.getClass().getName());

      out.write("\r\n");
      out.write("<body id=\"page-top\">\r\n");
      out.write("\t<div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_tiles_005finsertAttribute_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_tiles_005finsertAttribute_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_tiles_005finsertAttribute_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<a class=\"scroll-to-top rounded\" href=\"#page-top\"> <i\r\n");
      out.write("\t\tclass=\"fas fa-angle-up\"></i>\r\n");
      out.write("\t</a>\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" charset=\"utf8\"\r\n");
      out.write("\t\tsrc=\"https://cdn.datatables.net/1.10.19/js/jquery.dataTables.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Core plugin JavaScript-->\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/vendor/jquery-easing/jquery.easing.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Custom scripts for all pages-->\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/sb-admin-2.min.js\"></script>\r\n");
      out.write(" \t<script>\r\n");
      out.write("\t\t$(document).ready(function() {\r\n");
      out.write("\t\t\t$('#table_id').DataTable();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script> \r\n");
      out.write("\t<script>\r\n");
      out.write("\tfunction submitDropBox()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar x = document.getElementById(\"dropBox\").value;\r\n");
      out.write("\t\tvar y = document.getElementById(\"dropBox1\").value;\r\n");
      out.write("\t\tif(x === \"\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tdocument.getElementById(\"errorDropBox\").innerHTML = \"This field is required.\";\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(y === \"\")\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"errorDropBox1\").innerHTML = \"This field is required.\";\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse if(x !== \"\" && y !== \"\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tdocument.getElementById(\"errorDropBox\").innerHTML = \"\";\r\n");
      out.write("\t\t\tdocument.getElementById(\"errorDropBox1\").innerHTML = \"\";\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse if(x !== \"\" && y === \"\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tdocument.getElementById(\"errorDropBox\").innerHTML = \"\";\r\n");
      out.write("\t\t\tdocument.getElementById(\"errorDropBox1\").innerHTML = \"This field is required.\";\r\n");
      out.write("\t\t\treturn false\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/* function submitDropBox_addMerchandise()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar x = document.getElementById(\"dropBox\").value;\r\n");
      out.write("\t\tvar y = document.getElementById(\"dropBox1\").value;\r\n");
      out.write("\t\tconsole.log(x + \", \" + y)\r\n");
      out.write("\t\tif(x === \"\" && y === \"\" || x !== \"\" && y === \"\" || x === \"\" && y !== \"\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tdocument.getElementById(\"errorDropBox\").innerHTML = \"This field is required.\";\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("\t} */\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<script src=\"http://ajax.aspnetcdn.com/ajax/jquery.validate/1.11.1/jquery.validate.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write(" \r\n");
      out.write("    $(document).ready(function() {\r\n");
      out.write(" \r\n");
      out.write("        //Khi bàn phím được nhấn và thả ra thì sẽ chạy phương thức này\r\n");
      out.write("        $(\"#formDemo\").validate({\r\n");
      out.write("            rules: {\r\n");
      out.write("                userName: {\r\n");
      out.write("                \trequired: true,\r\n");
      out.write("                \tminlength: 4,\r\n");
      out.write("                \tmaxlength: 20\r\n");
      out.write("                },\r\n");
      out.write("                id: \"required\",\r\n");
      out.write("                password: \"required\",\r\n");
      out.write("                role: \"required\",\r\n");
      out.write("            },\r\n");
      out.write("            messages: {\r\n");
      out.write("/*              \tuserName: {\r\n");
      out.write("            \t\trequired: \"Please enter username\",\r\n");
      out.write("                \tminlength: \"Ký tự tối thiểu là 4\",\r\n");
      out.write("                \tmaxlength: \"Ký tự tối đa là 20\"\r\n");
      out.write("            \t}, */\r\n");
      out.write("            \t/*id: \"Vui lòng nhập tên\" */\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("        \r\n");
      out.write("        $(\"#formAddSupplier\").validate({\r\n");
      out.write("            rules: {\r\n");
      out.write("                name: {\r\n");
      out.write("                \trequired: true,\r\n");
      out.write("                \tminlength: 4,\r\n");
      out.write("                \tmaxlength: 20\r\n");
      out.write("                },\r\n");
      out.write("                id: \"required\",\r\n");
      out.write("                phoneNumber: \"required\",\r\n");
      out.write("                email: \"required\"\r\n");
      out.write("            },\r\n");
      out.write("            messages: {\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("        $(\"#form_merchandise_type\").validate({\r\n");
      out.write("            rules: {\r\n");
      out.write("                name: {\r\n");
      out.write("                \trequired: true,\r\n");
      out.write("                \tminlength: 4,\r\n");
      out.write("                \tmaxlength: 20\r\n");
      out.write("                },\r\n");
      out.write("                id: \"required\"\r\n");
      out.write("            },\r\n");
      out.write("            messages: {\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("        \r\n");
      out.write("        $(\"#formAddMerchandise\").validate({\r\n");
      out.write("            rules: {\r\n");
      out.write("                name: {\r\n");
      out.write("                \trequired: true,\r\n");
      out.write("                \tminlength: 4,\r\n");
      out.write("                \tmaxlength: 20,\r\n");
      out.write("                \t\r\n");
      out.write("                },\r\n");
      out.write("                id: \"required\",\r\n");
      out.write("                dropBox: \"required\",\r\n");
      out.write("                dropBox1: \"required\"\r\n");
      out.write("            },\r\n");
      out.write("            messages: {\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("        /* $(\"a\").click(function(){\r\n");
      out.write("            $(\"footer\").addClass(\"sticky-footer bg-white fixed-bottom\");\r\n");
      out.write("          }); */\r\n");
      out.write("    });\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_tiles_005fimportAttribute_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tiles:importAttribute
    org.apache.tiles.jsp.taglib.ImportAttributeTag _jspx_th_tiles_005fimportAttribute_005f0 = (new org.apache.tiles.jsp.taglib.ImportAttributeTag());
    _jsp_instancemanager.newInstance(_jspx_th_tiles_005fimportAttribute_005f0);
    _jspx_th_tiles_005fimportAttribute_005f0.setJspContext(_jspx_page_context);
    // /WEB-INF/Views/layout/main.jsp(15,0) name = name type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_tiles_005fimportAttribute_005f0.setName("title");
    _jspx_th_tiles_005fimportAttribute_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_tiles_005fimportAttribute_005f0);
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f0 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f0.setParent(null);
    // /WEB-INF/Views/layout/main.jsp(16,7) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f0.setCode((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int[] _jspx_push_body_count_spring_005fmessage_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f0 = _jspx_th_spring_005fmessage_005f0.doStartTag();
      if (_jspx_th_spring_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f0.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /WEB-INF/Views/layout/main.jsp(20,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/Views/layout/main.jsp(20,0) '/SpringMVC'",_el_expressionfactory.createValueExpression("/SpringMVC",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/Views/layout/main.jsp(20,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("path");
    // /WEB-INF/Views/layout/main.jsp(20,0) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setScope("session");
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_tiles_005finsertAttribute_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_tiles_005finsertAttribute_005f0 = (new org.apache.tiles.jsp.taglib.InsertAttributeTag());
    _jsp_instancemanager.newInstance(_jspx_th_tiles_005finsertAttribute_005f0);
    _jspx_th_tiles_005finsertAttribute_005f0.setJspContext(_jspx_page_context);
    // /WEB-INF/Views/layout/main.jsp(92,2) name = name type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_tiles_005finsertAttribute_005f0.setName("header");
    _jspx_th_tiles_005finsertAttribute_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_tiles_005finsertAttribute_005f0);
    return false;
  }

  private boolean _jspx_meth_tiles_005finsertAttribute_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_tiles_005finsertAttribute_005f1 = (new org.apache.tiles.jsp.taglib.InsertAttributeTag());
    _jsp_instancemanager.newInstance(_jspx_th_tiles_005finsertAttribute_005f1);
    _jspx_th_tiles_005finsertAttribute_005f1.setJspContext(_jspx_page_context);
    // /WEB-INF/Views/layout/main.jsp(93,2) name = name type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_tiles_005finsertAttribute_005f1.setName("body");
    _jspx_th_tiles_005finsertAttribute_005f1.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_tiles_005finsertAttribute_005f1);
    return false;
  }

  private boolean _jspx_meth_tiles_005finsertAttribute_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_tiles_005finsertAttribute_005f2 = (new org.apache.tiles.jsp.taglib.InsertAttributeTag());
    _jsp_instancemanager.newInstance(_jspx_th_tiles_005finsertAttribute_005f2);
    _jspx_th_tiles_005finsertAttribute_005f2.setJspContext(_jspx_page_context);
    // /WEB-INF/Views/layout/main.jsp(94,2) name = name type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_tiles_005finsertAttribute_005f2.setName("footer");
    _jspx_th_tiles_005finsertAttribute_005f2.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_tiles_005finsertAttribute_005f2);
    return false;
  }
}
