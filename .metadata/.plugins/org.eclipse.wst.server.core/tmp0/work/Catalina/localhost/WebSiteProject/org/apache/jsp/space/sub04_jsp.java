/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.55
 * Generated at: 2021-12-19 07:20:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.space;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sub04_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/space/../include/space_leftmenu.jsp", Long.valueOf(1639730173680L));
    _jspx_dependants.put("/space/../include/global_head.jsp", Long.valueOf(1639730173674L));
    _jspx_dependants.put("/space/../include/footer.jsp", Long.valueOf(1639730173673L));
    _jspx_dependants.put("/space/../include/quick.jsp", Long.valueOf(1639730173678L));
    _jspx_dependants.put("/space/../include/top.jsp", Long.valueOf(1639730173682L));
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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"ko\" lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta http-equiv=\"Content-Script-Type\" content=\"text/javascript\" />\r\n");
      out.write("<title>마포구립장애인 직업재활센터</title>\r\n");
      out.write("<style type=\"text/css\" media=\"screen\">\r\n");
      out.write("@import url(\"../css/common.css\");\r\n");
      out.write("@import url(\"../css/main.css\");\r\n");
      out.write("@import url(\"../css/sub.css\");\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<link href=\"../bootstrap3.3.7/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"../bootstrap3.3.7/jquery/jquery-3.2.1.min.js\"></script>				\r\n");
      out.write("<script src=\"../bootstrap3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" <body>\r\n");
      out.write("	<center>\r\n");
      out.write("	<div id=\"wrap\">\r\n");
      out.write("		");
      out.write("\r\n");
      out.write("<div id=\"top\" style=\"border:0px solid #000;\"> \r\n");
      out.write("	<a href=\"../main/main.jsp\"><img src=\"../images/logo.gif\" alt=\"마포구립장애인 직업재활센터\" id=\"top_logo\" /></a>\r\n");
      out.write("	<ul id=\"lnb\">\r\n");
      out.write("		<!-- 로그인전 -->\r\n");
      out.write("		<li><a href=\"../member/login.jsp\"><img src=\"../images/lnb01.gif\" alt=\"LOGIN\" /></a></li>\r\n");
      out.write("		<li><a href=\"../member/join01.jsp\"><img src=\"../images/lnb02.gif\" alt=\"JOIN\" /></a></li>\r\n");
      out.write("		\r\n");
      out.write("		<!-- 로그인후 -->\r\n");
      out.write("		<!-- <li><a href=\"../center/sub07.jsp\"><img src=\"../images/lnb05.gif\" alt=\"LOG OUT\" /></a></li>\r\n");
      out.write("		<li><a href=\"../center/sub07.jsp\"><img src=\"../images/lnb06.gif\" alt=\"MODIFY\" /></a></li> -->\r\n");
      out.write("		\r\n");
      out.write("		<li><a href=\"../member/sitemap.jsp\"><img src=\"../images/lnb03.gif\" alt=\"SITEMAP\" /></a></li>\r\n");
      out.write("		<li><a href=\"../center/sub06.jsp\"><img src=\"../images/lnb04.gif\" alt=\"CONTACT US\" /></a></li>\r\n");
      out.write("		\r\n");
      out.write("	</ul>	 \r\n");
      out.write("	\r\n");
      out.write("	<!-- <a href=\"../center/sub01.jsp\"><img src=\"../images/navi.jpg\" id=\"navigation\" /></a> -->\r\n");
      out.write("	<img src=\"../images/gnb.jpg\" id=\"navigation\"  width=\"753\" height=\"65\" usemap=\"#GNB\"/>\r\n");
      out.write("	<map name=\"GNB\">\r\n");
      out.write("		<area shape=\"rect\" alt=\"\" title=\"\" coords=\"0,0,80,33\" href=\"../center/sub01.jsp\" target=\"\" />\r\n");
      out.write("		<area shape=\"rect\" alt=\"\" title=\"\" coords=\"86,0,188,33\" href=\"../business/sub01.jsp\" target=\"\" />\r\n");
      out.write("		<area shape=\"rect\" alt=\"\" title=\"\" coords=\"193,0,316,33\" href=\"../product/sub01.jsp\" target=\"\" />\r\n");
      out.write("		<area shape=\"rect\" alt=\"\" title=\"\" coords=\"321,0,420,33\" href=\"../market/sub01.jsp\" target=\"\" />\r\n");
      out.write("		<area shape=\"rect\" alt=\"\" title=\"\" coords=\"428,0,529,33\" href=\"../space/sub01.jsp\" target=\"\" />\r\n");
      out.write("		<area shape=\"rect\" alt=\"\" title=\"\" coords=\"536,0,638,33\" href=\"../community/sub01.jsp\" target=\"\" />\r\n");
      out.write("		<area shape=\"rect\" alt=\"\" title=\"\" coords=\"641,0,749,33\" href=\"../volunteer/sub01.jsp\" target=\"\" />\r\n");
      out.write("	</map>\r\n");
      out.write("	\r\n");
      out.write("	<!--  <div style=\"position:absolute; margin:-25px 0 0 200px;  border:0px solid #000;\">	\r\n");
      out.write("		<object type=\"application/x-shockwave-flash\" data=\"../swf/navi.swf\" width=\"753\" height=\"65\">\r\n");
      out.write("			<param name=\"wmode\" value=\"transparent\" />\r\n");
      out.write("		</object>		\r\n");
      out.write("	</div>  -->\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<img src=\"../images/space/sub_image.jpg\" id=\"main_visual\" />\r\n");
      out.write("\r\n");
      out.write("		<div class=\"contents_box\">\r\n");
      out.write("			<div class=\"left_contents\">\r\n");
      out.write("				\r\n");
      out.write("				");
      out.write("\r\n");
      out.write("<img src=\"../images/space/left_title.gif\" alt=\"센터소개 space Introduction\" class=\"left_title\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- <object type=\"application/x-shockwave-flash\" data=\"../swf/submenu05.swf\" width=\"152\" height=\"255\">\r\n");
      out.write("<param name=\"wmode\" value=\"transparent\" />\r\n");
      out.write("</object> -->\r\n");
      out.write("<img src=\"../images/menu/5.jpg\" alt=\"\" usemap=\"#LNB\"/>\r\n");
      out.write("<map name=\"LNB\">\r\n");
      out.write("	<area shape=\"rect\" alt=\"\" title=\"\" coords=\"10,9,134,44\" href=\"../space/sub01.jsp\" target=\"\" />\r\n");
      out.write("	<area shape=\"rect\" alt=\"\" title=\"\" coords=\"10,48,134,86\" href=\"../space/sub02.jsp\" target=\"\" />\r\n");
      out.write("	<area shape=\"rect\" alt=\"\" title=\"\" coords=\"10,90,134,125\" href=\"../space/sub03.jsp\" target=\"\" />\r\n");
      out.write("	<area shape=\"rect\" alt=\"\" title=\"\" coords=\"10,132,134,166\" href=\"../space/sub04.jsp\" target=\"\" />\r\n");
      out.write("	<area shape=\"rect\" alt=\"\" title=\"\" coords=\"10,172,134,207\" href=\"../space/sub05.jsp\" target=\"\" />\r\n");
      out.write("</map>\r\n");
      out.write("<!-- <ul>\r\n");
      out.write("	<li><a href=\"../space/sub01.jsp\">메뉴1</a></li>\r\n");
      out.write("	<li><a href=\"../space/sub02.jsp\">메뉴2</a></li>\r\n");
      out.write("	<li><a href=\"../space/sub03.jsp\">메뉴3</a></li>\r\n");
      out.write("	<li><a href=\"../space/sub04.jsp\">메뉴4</a></li>\r\n");
      out.write("	<li><a href=\"../space/sub05.jsp\">메뉴5</a></li>\r\n");
      out.write("</ul>\r\n");
      out.write(" -->");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"right_contents\">\r\n");
      out.write("				<div class=\"top_title\">\r\n");
      out.write("					<img src=\"../images/space/sub04_title.gif\" alt=\"사진게시판\" class=\"con_title\" />\r\n");
      out.write("					<p class=\"location\"><img src=\"../images/center/house.gif\" />&nbsp;&nbsp;열린공간&nbsp;>&nbsp;사진게시판<p>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		");
      out.write("\r\n");
      out.write("<div id=\"quick\" style=\"position: absolute; top: 60px; right:0px;\">\r\n");
      out.write("<ul>\r\n");
      out.write("	<li><a href=\"../market/sub01.jsp\"><img src=\"../images/quick01.gif\" alt=\"열린장터\" border=\"0\" /></a></li>\r\n");
      out.write("	<li><a href=\"../center/sub05.jsp\"><img src=\"../images/quick02.gif\" alt=\"입소안내\" border=\"0\" /></a></li>\r\n");
      out.write("	<li><a href=\"../volunteer/sub01.jsp\"><img src=\"../images/quick03.gif\" alt=\"후원,자원봉사\" border=\"0\" /></a></li>\r\n");
      out.write("	<li><a href=\"../center/sub06.jsp\"><img src=\"../images/quick04.gif\" alt=\"오시는 길\" border=\"0\" /></a></li>\r\n");
      out.write("	<li><a href=\"http://blog.naver.com/mapowork\" target=\"_blank\"><img src=\"../images/quick05.gif\" alt=\"블로그\" border=\"0\" style=\"margin-bottom:11px;\" /></a></li>\r\n");
      out.write("	</ul>\r\n");
      out.write("	<a href=\"#top\"><img alt=\"top\" src=\"../images/top_btn.gif\" /></a>\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\" language=\"javascript\">\r\n");
      out.write("function initMoving(target, position, topLimit, btmLimit) {\r\n");
      out.write("	if (!target)\r\n");
      out.write("	return false;\r\n");
      out.write("	\r\n");
      out.write("	var obj = target;\r\n");
      out.write("	obj.initTop = position;\r\n");
      out.write("	obj.topLimit = topLimit;\r\n");
      out.write("	obj.bottomLimit = document.documentElement.scrollHeight - btmLimit;\r\n");
      out.write("	\r\n");
      out.write("	 obj.style.position = \"absolute\";\r\n");
      out.write("	 obj.top = obj.initTop;\r\n");
      out.write("	 obj.left = obj.initLeft;\r\n");
      out.write("	\r\n");
      out.write("	 if (typeof(window.pageYOffset) == \"number\") {\r\n");
      out.write("	 obj.getTop = function() {\r\n");
      out.write("	 return window.pageYOffset;\r\n");
      out.write("	 }\r\n");
      out.write("	 } else if (typeof(document.documentElement.scrollTop) == \"number\") {\r\n");
      out.write("	 obj.getTop = function() {\r\n");
      out.write("	 return document.documentElement.scrollTop;\r\n");
      out.write("	 }\r\n");
      out.write("	 } else {\r\n");
      out.write("	 obj.getTop = function() {\r\n");
      out.write("	 return 0;\r\n");
      out.write("	 }\r\n");
      out.write("	 }\r\n");
      out.write("	\r\n");
      out.write("	 if (self.innerHeight) {\r\n");
      out.write("	 obj.getHeight = function() {\r\n");
      out.write("	 return self.innerHeight;\r\n");
      out.write("	 }\r\n");
      out.write("	 } else if(document.documentElement.clientHeight) {\r\n");
      out.write("	 obj.getHeight = function() {\r\n");
      out.write("	 return document.documentElement.clientHeight;\r\n");
      out.write("	 }\r\n");
      out.write("	 } else {\r\n");
      out.write("	 obj.getHeight = function() {\r\n");
      out.write("	 return 500;\r\n");
      out.write("	 }\r\n");
      out.write("	 }\r\n");
      out.write("	\r\n");
      out.write("	 obj.move = setInterval(function() {\r\n");
      out.write("	 if (obj.initTop > 0) {\r\n");
      out.write("	 pos = obj.getTop() + obj.initTop;\r\n");
      out.write("	 } else {\r\n");
      out.write("	 pos = obj.getTop() + obj.getHeight() + obj.initTop;\r\n");
      out.write("	 //pos = obj.getTop() + obj.getHeight() / 2 - 15;\r\n");
      out.write("	 }\r\n");
      out.write("	\r\n");
      out.write("	 if (pos > obj.bottomLimit)\r\n");
      out.write("	 pos = obj.bottomLimit;\r\n");
      out.write("	 if (pos < obj.topLimit)\r\n");
      out.write("	 pos = obj.topLimit;\r\n");
      out.write("	\r\n");
      out.write("	 interval = obj.top - pos;\r\n");
      out.write("	 obj.top = obj.top - interval / 3;\r\n");
      out.write("	 obj.style.top = obj.top + \"px\";\r\n");
      out.write("	 }, 30)\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	initMoving(document.getElementById(\"quick\"), 170,0);\r\n");
      out.write("	/* function initMoving(target, position, topLimit, btmLimit) */ \r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("	<div id=\"footer_wrap\">\r\n");
      out.write("		<ul>\r\n");
      out.write("			<li><img src=\"../images/link_title.gif\" alt=\"유관기관 링크\" /></li>\r\n");
      out.write("			<li><a href=\"http://www.ewhawelfare.or.kr/shop/index.php\" target=\"_blank\"><img src=\"../images/link01.gif\" alt=\"이화여자대학교 사회복지관\" /></a></li>\r\n");
      out.write("			<li><a href=\"http://www.sungsan21.org/\" target=\"_blank\"><img src=\"../images/link02.gif\" alt=\"이화여자대학교 성산복지관\" /></a></li>\r\n");
      out.write("			<li><a href=\"http://www.mapoworkfare.or.kr/\" target=\"_blank\"><img src=\"../images/link03.gif\" alt=\"고용복지지원센터\" /></a></li>\r\n");
      out.write("			<li><a href=\"http://www.mapojahwal.or.kr/\" target=\"_blank\"><img src=\"../images/link04.gif\" alt=\"마포자활센터\" /></a></li>\r\n");
      out.write("			<li><a href=\"http://www.seojahwal.or.kr/\" target=\"_blank\"><img src=\"../images/link05.gif\" alt=\"서대문자활센터\" /></a></li>\r\n");
      out.write("			<li><a href=\"http://kavrd.drsp.co.kr/\" target=\"_blank\"><img src=\"../images/link06.gif\" alt=\"한.직.협\" /></a></li>\r\n");
      out.write("			<li><a href=\"http://savrd.or.kr\" target=\"_blank\"><img src=\"../images/link07.gif\" alt=\"서.직.협\" /></a></li>\r\n");
      out.write("			<li><a href=\"http://www.mapo.go.kr/CmsWeb/main.jsp\" target=\"_blank\"><img src=\"../images/link08.gif\" alt=\"마포구청\" /></a></li>\r\n");
      out.write("		</ul>\r\n");
      out.write("		<div id=\"footer_bottom\">\r\n");
      out.write("			<img src=\"../images/footer_logo.gif\" alt=\"\" style=\"margin-right:15px;\" />\r\n");
      out.write("			<img src=\"../images/address.gif\" alt=\"\" style=\"margin-right:20px;\" />\r\n");
      out.write("			<a href=\"javascript:;\" onClick=\"javascript:window.open('../member/foot_1.jsp', 'open','width=800,height=600,statusbar=0,scrollbars=1')\"><img src=\"../images/footer_list01.gif\" alt=\"\" style=\"margin-right:10px; vertical-align:top; margin-top:15px;\" /></a>\r\n");
      out.write("			<a href=\"javascript:;\" onClick=\"javascript:window.open('../member/foot_2.jsp', 'open','width=800,height=600,statusbar=0,scrollbars=1')\"><img src=\"../images/footer_list02.gif\" alt=\"\" style=\"vertical-align:top; margin-top:15px;\" /></a>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("	</center>\r\n");
      out.write(" </body>\r\n");
      out.write("</html>\r\n");
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
