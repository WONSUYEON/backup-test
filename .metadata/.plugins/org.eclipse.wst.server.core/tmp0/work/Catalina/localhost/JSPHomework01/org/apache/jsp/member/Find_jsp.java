/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.55
 * Generated at: 2021-12-09 01:02:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Find_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

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
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Document</title>\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.min.js\"></script>\r\n");
      out.write("    <style>\r\n");
      out.write("        *{padding: 0;font-size: 12px;}\r\n");
      out.write("        h2{font-size: 25px;font-family: 굴림;}\r\n");
      out.write("        #AllWrap{margin:0 auto; text-align:center;}\r\n");
      out.write("        #RadioBox{margin:0 auto;text-align:left;width: 600px;margin-bottom: 10px;}\r\n");
      out.write("        #IdBox{margin:0 auto;border:10px solid rgb(218, 218, 218);padding: 10px;width: 700px;}\r\n");
      out.write("        #InputTable{border:0px solid red; border-spacing: 0; border-collapse: collapse;width: 500px;}        \r\n");
      out.write("        #InputTable th{text-align:left; padding: 10px;}\r\n");
      out.write("        #InputTable td{text-align:left; padding: 10px;}\r\n");
      out.write("        #InputTable input{border:1px solid gray;height: 26px;padding:0 0 0 3px;}\r\n");
      out.write("        #InputTable select{border:1px solid gray;height: 25px;padding: 4px;width:90px;}\r\n");
      out.write("        #btn{\r\n");
      out.write("            background-color: rgb(212, 0, 0);color: white;padding: 5px 20px;border:0;\r\n");
      out.write("            font-size: 13px;font-weight: bold;border-radius: 5px;\r\n");
      out.write("        }\r\n");
      out.write("        .bullet{color: red;font-weight: bold;margin-right: 5px;font-size: 16px;}\r\n");
      out.write("    </style>\r\n");
      out.write("    <script>\r\n");
      out.write("    $(function(){\r\n");
      out.write("        $('#idFind').click(function(){\r\n");
      out.write("            $('#item01').hide();\r\n");
      out.write("            $('#item02').show();\r\n");
      out.write("            $('#item03').show();\r\n");
      out.write("            //$('#item04').show();\r\n");
      out.write("            //$('#item05').hide();\r\n");
      out.write("        });\r\n");
      out.write("        $('#pwFind').click(function(){\r\n");
      out.write("            $('#item01').show();\r\n");
      out.write("            $('#item02').show();\r\n");
      out.write("            $('#item03').show();\r\n");
      out.write("            //$('#item04').show();\r\n");
      out.write("            //$('#item05').hide();\r\n");
      out.write("        });\r\n");
      out.write("        $('#choice').change(function(){\r\n");
      out.write("            if($('#choice').val()=='mobile'){\r\n");
      out.write("                $('#item04').show();\r\n");
      out.write("                $('#item05').hide();\r\n");
      out.write("            }\r\n");
      out.write("            else{\r\n");
      out.write("                $('#item04').hide();\r\n");
      out.write("                $('#item05').show();\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"AllWrap\">\r\n");
      out.write("    <h2>아이디/비밀번호 찾기</h2>\r\n");
      out.write("    <div id=\"RadioBox\">\r\n");
      out.write("        <input type=\"radio\" name=\"find\" id=\"idFind\" checked>아이디찾기\r\n");
      out.write("        &nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("        <input type=\"radio\" name=\"find\" id=\"pwFind\">비밀번호찾기\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"IdBox\" class=\"\">\r\n");
      out.write("        <table align=\"center\" id=\"InputTable\">\r\n");
      out.write("            <colgroup>\r\n");
      out.write("                <col width=\"30%\" />\r\n");
      out.write("                <col width=\"70%\" />\r\n");
      out.write("            </colgroup>\r\n");
      out.write("            <tr id=\"item01\" style=\"display:none;\">\r\n");
      out.write("                <th><span class=\"bullet\">&gt;</span><strong>아 이 디</strong></th>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <input type=\"text\" name=\"name\" style=\"width:200px;\">\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr id=\"item02\">\r\n");
      out.write("                <th><span class=\"bullet\">&gt;</span><strong>이 름</strong></th>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <input type=\"text\" name=\"name\" style=\"width:200px;\">\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr id=\"item03\">\r\n");
      out.write("                <th>\r\n");
      out.write("                    <span class=\"bullet\">&gt;</span><select id=\"choice\">\r\n");
      out.write("                        <option value=\"mobile\" selected>휴대전화</option>\r\n");
      out.write("                        <option value=\"email\">이메일</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                </th>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <div id=\"item04\">\r\n");
      out.write("                        <input type=\"text\" name=\"mobile1\" style=\"width:40px;\" maxlength=\"3\"> -\r\n");
      out.write("                        <input type=\"text\" name=\"mobile2\" style=\"width:50px;\" maxlength=\"4\"> -\r\n");
      out.write("                        <input type=\"text\" name=\"mobile3\" style=\"width:50px;\" maxlength=\"4\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div id=\"item05\" style=\"display:none;\">\r\n");
      out.write("                        <input type=\"text\" name=\"email1\" style=\"width:100px;\"> @\r\n");
      out.write("                        <input type=\"text\" name=\"email2\" style=\"width:100px;\">\r\n");
      out.write("                        <select name=\"\" id=\"\">\r\n");
      out.write("                            <option value=\"\">-- 선택 --</option>\r\n");
      out.write("                            <option value=\"naver.com\">naver.com</option>\r\n");
      out.write("                            <option value=\"nate.com\">nate.com</option>\r\n");
      out.write("                            <option value=\"gmail.com\">gmail.com</option>\r\n");
      out.write("                            <option value=\"daum.net\">daum.net</option>\r\n");
      out.write("                            <option value=\"hanmail.net\">hanmail.net</option>\r\n");
      out.write("                            <option value=\"직접입력\" selected>직접입력</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("        <div>\r\n");
      out.write("            <img src=\"./images/g_line.gif\" width=\"400\" height=\"1\" border=\"0\" />\r\n");
      out.write("            <br><br><br>\r\n");
      out.write("            아이디를 찾기 위해서 이름과 휴대번호 혹은 이메일을 입력하세요.\r\n");
      out.write("            <br><br><br>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>    \r\n");
      out.write("    <div style=\"margin-top:20px;\">\r\n");
      out.write("        <input type=\"button\" value=\"아이디 찾기 &gt;\" id=\"btn\">\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
}
