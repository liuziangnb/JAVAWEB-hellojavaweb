/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-03-25 14:26:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <title>欢迎注册</title>\r\n");
      out.write("  <link href=\"css/register.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"form-div\">\r\n");
      out.write("  <div class=\"reg-content\">\r\n");
      out.write("    <h1>欢迎注册</h1>\r\n");
      out.write("    <span>已有帐号？</span> <a href=\"login.html\">登录</a>\r\n");
      out.write("  </div>\r\n");
      out.write("  <form id=\"reg-form\" action=\"/brand_demo/registerServlet\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("    <table>\r\n");
      out.write("\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>用户名</td>\r\n");
      out.write("        <td class=\"inputs\">\r\n");
      out.write("          <input name=\"username\" type=\"text\" id=\"username\">\r\n");
      out.write("          <br>\r\n");
      out.write("          <span id=\"username_err\" class=\"err_msg\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${register_msg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span>\r\n");
      out.write("        </td>\r\n");
      out.write("\r\n");
      out.write("      </tr>\r\n");
      out.write("\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>密码</td>\r\n");
      out.write("        <td class=\"inputs\">\r\n");
      out.write("          <input name=\"password\" type=\"password\" id=\"password\">\r\n");
      out.write("          <br>\r\n");
      out.write("          <span id=\"password_err\" class=\"err_msg\" style=\"display: none\">密码格式有误</span>\r\n");
      out.write("        </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>验证码</td>\r\n");
      out.write("        <td class=\"inputs\">\r\n");
      out.write("          <input name=\"checkCode\" type=\"text\" id=\"checkCode\">\r\n");
      out.write("          <img id=\"checkCodeImage\" src=\"/brand_demo/checkCodeServlet\">\r\n");
      out.write("          <a href=\"#\" id=\"changeImg\" >看不清？</a>\r\n");
      out.write("        </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("\r\n");
      out.write("    </table>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"buttons\">\r\n");
      out.write("      <input value=\"注 册\" type=\"submit\" id=\"reg_btn\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <br class=\"clear\">\r\n");
      out.write("  </form>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("  document.getElementById(\"changeImg\").onclick=function (){\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    document.getElementById(\"checkCodeImage\").src=\"/brand_demo/checkCodeServlet?\"+new Date().getMilliseconds();\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
}
