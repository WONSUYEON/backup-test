/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.55
 * Generated at: 2021-12-08 07:48:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class listT_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/board/./commons/left.jsp", Long.valueOf(1638322750643L));
    _jspx_dependants.put("/board/./commons/top.jsp", Long.valueOf(1638322750647L));
    _jspx_dependants.put("/board/./commons/header.jsp", Long.valueOf(1638322750641L));
    _jspx_dependants.put("/board/./commons/copyright.jsp", Long.valueOf(1638322750638L));
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Document</title>\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.1/font/bootstrap-icons.css\">\r\n");
      out.write("    <style>\r\n");
      out.write("        div{border:0px solid blueviolet;}\r\n");
      out.write("        *{font-size: 12px;}\r\n");
      out.write("    </style>\r\n");
      out.write("</head>");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <!-- Top영역 -->\r\n");
      out.write("   ");
      out.write("\r\n");
      out.write(" <div class=\"row\">\r\n");
      out.write("        <div class=\"col-12\">\r\n");
      out.write("            <nav class=\"navbar navbar-expand-sm bg-dark navbar-dark\">\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("                    <!-- 회사로고(logo) -->\r\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\">\r\n");
      out.write("                        <img src=\"https://www.ikosmo.co.kr/images/common/logo_center_v2.jpg\" style=\"width: 120px;\">\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <!-- GNB(Global Navigation Bar : 해당 웹사이트의 전체(global) 메뉴) -->\r\n");
      out.write("                    <ul class=\"navbar-nav\">\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link active\" href=\"#\">자유게시판</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"#\">자료실</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item dropdown\">\r\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\" href=\"#\">드롭다운</a>\r\n");
      out.write("                            <ul class=\"dropdown-menu\">\r\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"#\">Link 1</a></li>\r\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"#\">Link 2</a></li>\r\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"#\">Link 3</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <!-- 검색폼 -->\r\n");
      out.write("                    <form class=\"mt-3\" method=\"get\" action=\"\">\r\n");
      out.write("                    <div class=\"input-group mb-3\">\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Search\" style=\"width: 200px;\">\r\n");
      out.write("                        <button class=\"btn btn-warning\" type=\"submit\">\r\n");
      out.write("                            <i class=\"bi-search\" style=\"font-size: 1rem; color: white;\"></i>\r\n");
      out.write("                        </button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    <!-- 회원가입/로그인 링크 -->\r\n");
      out.write("                    <ul class=\"navbar-nav\">\r\n");
      out.write("                        <!-- 로그인전 -->\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"#\">\r\n");
      out.write("                                <i class=\"bi-person-plus-fill\" style=\"font-size: 1rem;\"></i>\r\n");
      out.write("                                회원가입\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"#\">\r\n");
      out.write("                                <i class=\"bi-box-arrow-in-right\" style=\"font-size: 1rem;\"></i>\r\n");
      out.write("                                로그인\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <!-- 로그인후 -->\r\n");
      out.write("                        <!-- <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"#\">\r\n");
      out.write("                                <i class=\"bi-person-lines-fill\" style=\"font-size: 1rem;\"></i>\r\n");
      out.write("                                회원정보수정\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"#\">\r\n");
      out.write("                                <i class=\"bi-box-arrow-right\" style=\"font-size: 1rem;\"></i>\r\n");
      out.write("                                로그아웃\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li> -->\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>");
      out.write("\r\n");
      out.write("    <!-- Body영역 -->\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <!-- Left메뉴영역 -->\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("<div class=\"col-3\">\r\n");
      out.write("            <div style=\"height: 100px;line-height: 100px;text-align: center;background-color: cadetblue;\r\n");
      out.write("                border-radius: 10px;margin: 10px 0;font-size: 1.5em;color: #ffffff;\">\r\n");
      out.write("                웹사이트제작\r\n");
      out.write("            </div>\r\n");
      out.write("            <ul class=\"nav nav-pills flex-column\">\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link active\" href=\"#\">자유게시판</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item bg-light\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"#\">자료실</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item bg-light dropdown dropend\">\r\n");
      out.write("                    <a class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\" href=\"#\">드롭다운</a>\r\n");
      out.write("                    <ul class=\"dropdown-menu\">\r\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"#\">Link 1</a></li>\r\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"#\">Link 2</a></li>\r\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"#\">Link 3</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>");
      out.write("\r\n");
      out.write("        <!-- Contents영역 -->\r\n");
      out.write("        <div class=\"col-9 pt-3\">\r\n");
      out.write("            <h3>게시판 목록 - <small>자유게시판</small></h3>\r\n");
      out.write("            <!-- 검색 -->\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <form action=\"\">\r\n");
      out.write("                    <div class=\"input-group ms-auto\" style=\"width: 400px;\">\r\n");
      out.write("                        <select name=\"\" class=\"form-control\">\r\n");
      out.write("                            <option value=\"\">제목</option>\r\n");
      out.write("                            <option value=\"\">내용</option>\r\n");
      out.write("                            <option value=\"\">작성자</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Search\" style=\"width: 200px;\">\r\n");
      out.write("                        <button class=\"btn btn-success\" type=\"submit\">\r\n");
      out.write("                            <i class=\"bi-search\" style=\"font-size: 1rem; color: white;\"></i>\r\n");
      out.write("                        </button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- 게시판 리스트 -->\r\n");
      out.write("            <div class=\"row mt-3 mx-1\">\r\n");
      out.write("                <table class=\"table table-bordered table-hover table-striped\">\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr class=\"text-center\">\r\n");
      out.write("                        <th>번호</th>\r\n");
      out.write("                        <th>제목</th>\r\n");
      out.write("                        <th>작성자</th>\r\n");
      out.write("                        <th>작성일</th>\r\n");
      out.write("                        <th>조회수</th>\r\n");
      out.write("                        <th>첨부</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("                <tbody>\r\n");
      out.write("\r\n");
      out.write("                    <tr class=\"text-center\">\r\n");
      out.write("                        <td>100</td>\r\n");
      out.write("                        <td class=\"text-start\"><a href=\"./viewT.jsp\">자유게시판 많은 이용 부탁드려요</a></td>\r\n");
      out.write("                        <td>낙자쌤</td>\r\n");
      out.write("                        <td>21-11-25</td>\r\n");
      out.write("                        <td>88</td>\r\n");
      out.write("                        <td><i class=\"bi-pin-angle-fill\" style=\"font-size: 1rem;\"></i></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr class=\"text-center\">\r\n");
      out.write("                        <td>100</td>\r\n");
      out.write("                        <td class=\"text-start\"><a href=\"./viewT.jsp\">자유게시판 많은 이용 부탁드려요</a></td>\r\n");
      out.write("                        <td>낙자쌤</td>\r\n");
      out.write("                        <td>21-11-25</td>\r\n");
      out.write("                        <td>88</td>\r\n");
      out.write("                        <td><i class=\"bi-pin-angle-fill\" style=\"font-size: 1rem;\"></i></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr class=\"text-center\">\r\n");
      out.write("                        <td>100</td>\r\n");
      out.write("                        <td class=\"text-start\"><a href=\"./viewT.jsp\">자유게시판 많은 이용 부탁드려요</a></td>\r\n");
      out.write("                        <td>낙자쌤</td>\r\n");
      out.write("                        <td>21-11-25</td>\r\n");
      out.write("                        <td>88</td>\r\n");
      out.write("                        <td><i class=\"bi-pin-angle-fill\" style=\"font-size: 1rem;\"></i></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr class=\"text-center\">\r\n");
      out.write("                        <td>100</td>\r\n");
      out.write("                        <td class=\"text-start\"><a href=\"./viewT.jsp\">자유게시판 많은 이용 부탁드려요</a></td>\r\n");
      out.write("                        <td>낙자쌤</td>\r\n");
      out.write("                        <td>21-11-25</td>\r\n");
      out.write("                        <td>88</td>\r\n");
      out.write("                        <td><i class=\"bi-pin-angle-fill\" style=\"font-size: 1rem;\"></i></td>\r\n");
      out.write("                    </tr>                    \r\n");
      out.write("                    \r\n");
      out.write("                </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- 각종버튼 -->\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col d-flex justify-content-end\">\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-primary\" onclick=\"location.href='writeT.jsp';\">글쓰기</button>\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-secondary\">수정하기</button>\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-success\">삭제하기</button>\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-info\">답글쓰기</button>\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-warning\">목록보기</button>\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-danger\">전송하기</button>\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-dark\">다시쓰기</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- 페이지 번호 -->\r\n");
      out.write("            <div class=\"row mt-3\">\r\n");
      out.write("                <div class=\"col\">\r\n");
      out.write("                    <ul class=\"pagination justify-content-center\">\r\n");
      out.write("                        <li class=\"page-item\"><a class=\"page-link\" href=\"#\">\r\n");
      out.write("                            <i class='bi bi-skip-backward-fill'></i>\r\n");
      out.write("                        </a></li>\r\n");
      out.write("                        <li class=\"page-item\"><a class=\"page-link\" href=\"#\">\r\n");
      out.write("                            <i class='bi bi-skip-start-fill'></i>\r\n");
      out.write("                        </a></li>\r\n");
      out.write("                        <li class=\"page-item active\"><a class=\"page-link\" href=\"#\">1</a></li>\r\n");
      out.write("                        <li class=\"page-item\"><a class=\"page-link\" href=\"#\">2</a></li>\r\n");
      out.write("                        <li class=\"page-item\"><a class=\"page-link\" href=\"#\">3</a></li>\r\n");
      out.write("                        <li class=\"page-item\"><a class=\"page-link\" href=\"#\">\r\n");
      out.write("                            <i class='bi bi-skip-end-fill'></i>\r\n");
      out.write("                        </a></li>\r\n");
      out.write("                        <li class=\"page-item\"><a class=\"page-link\" href=\"#\">\r\n");
      out.write("                            <i class='bi bi-skip-forward-fill'></i>\r\n");
      out.write("                        </a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Copyright영역 -->\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("<div class=\"row border border-dark border-bottom-0 border-start-0 border-end-0 pt-2\">\r\n");
      out.write("        <div class=\"col-2\">\r\n");
      out.write("            <h2>원총총&trade;</h2>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-10\">\r\n");
      out.write("            Email : 본인의&nbsp;&nbsp;\r\n");
      out.write("            Mobile : 정보를&nbsp;&nbsp;\r\n");
      out.write("            Address : 쓰세요\r\n");
      out.write("            <br>\r\n");
      out.write("            copyright &copy; 2021 \r\n");
      out.write("            All right reserved.\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>");
      out.write("\r\n");
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
