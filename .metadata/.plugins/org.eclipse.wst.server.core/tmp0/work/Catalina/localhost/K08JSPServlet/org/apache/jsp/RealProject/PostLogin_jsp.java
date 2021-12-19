/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.55
 * Generated at: 2021-12-15 06:14:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.RealProject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PostLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1639039344974L));
    _jspx_dependants.put("jar:file:/C:/02WorkspaceWSY/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/K08JSPServlet/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

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
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.6.0.js\"></script>\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\r\n");
      out.write("<script>\r\n");
      out.write("	$(function(){\r\n");
      out.write("		$('#btnLogin2').click(function(){\r\n");
      out.write("			//요청할 서버의 URL\r\n");
      out.write("			var s_url =\"../realproject/PostLogin.do\";\r\n");
      out.write("			/*\r\n");
      out.write("			jQuery의 Ajax관련 메소드의 파라미터는 JSON형태로 조립한 후 서버로\r\n");
      out.write("			전송해야 한다. 이때 <form>태그 하위의 모든 폼값을 한꺼번에 JSON으로\r\n");
      out.write("			만들고 싶다면 srialize()메소드를 사용하면 된다.\r\n");
      out.write("			*/\r\n");
      out.write("			var s_params = $('#loginFrm').serialize();\r\n");
      out.write("			//Post방식으로 서버로 요청한다\r\n");
      out.write("			$.post(\r\n");
      out.write("				s_url,\r\n");
      out.write("				s_params,\r\n");
      out.write("				function(resData){\r\n");
      out.write("					/*\r\n");
      out.write("					$.ajax()메소드는 콜백데이터의 형식을 지정할 수 있지만\r\n");
      out.write("					$.post()메소드는 형식을 지정할 수 없어 무조건 text형식으로만\r\n");
      out.write("					콜백 받을 수 있다. 따라서 JSON데이터를 콜백 받았다면 파싱을 위해\r\n");
      out.write("					JSON.parse()메소드를 한번 실행한 후 파싱해야 한다.\r\n");
      out.write("					*/\r\n");
      out.write("					var d = JSON.parse(resData);\r\n");
      out.write("					\r\n");
      out.write("					if(d.result==1){//로그인에 성공한 경우...\r\n");
      out.write("					console.log(d.message);\r\n");
      out.write("					//콜백받은 HTML태그를 해당 위치에 삽입한다.\r\n");
      out.write("					$('#loginFrm').html(d.html);\r\n");
      out.write("					//로그인 버튼은 숨김처리 한다.\r\n");
      out.write("					$('#btnLogin2').hide();\r\n");
      out.write("					alert(d.message);\r\n");
      out.write("				}\r\n");
      out.write("				else{\r\n");
      out.write("					alert(d.message);\r\n");
      out.write("				}\r\n");
      out.write("			}\r\n");
      out.write("		);\r\n");
      out.write("	});\r\n");
      out.write("});\r\n");
      out.write("	\r\n");
      out.write("function checkFrm(){\r\n");
      out.write("	var f = document.getElementById(\"loginFrm\");\r\n");
      out.write("	f.method = \"post\";\r\n");
      out.write("	f.action = \"../realproject/PostLogin.do\";\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("	<h2>$.post() : 비동기 로그인 구현하기</h2>\r\n");
      out.write("	<div class=\"row\" id=\"loginTable\">\r\n");
      out.write("		<form id=\"loginFrm\" onsubmit=\"return checkFrm();\">\r\n");
      out.write("			<table class=\"table table-bordered\">\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td>아이디</td>\r\n");
      out.write("					<td>\r\n");
      out.write("						<input type=\"text\" name=\"user_id\" value=\"\" />\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td>패스워드</td>\r\n");
      out.write("					<td>\r\n");
      out.write("						<input type=\"password\" name=\"user_pw\" value=\"\" />\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("			</table>\r\n");
      out.write("			<div>\r\n");
      out.write("				<button type=\"submit\" class=\"btn btn-danger\" id=\"btnLogin1\">\r\n");
      out.write("					로그인하기(HTML의submit사용)</button>				\r\n");
      out.write("				<button type=\"button\" class=\"btn btn-success\" id=\"btnLogin2\">\r\n");
      out.write("					로그인하기(jQuery의 $.post()사용)</button>\r\n");
      out.write("			</div>						 \r\n");
      out.write("		</form>\r\n");
      out.write("	</div> \r\n");
      out.write("</div>	\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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