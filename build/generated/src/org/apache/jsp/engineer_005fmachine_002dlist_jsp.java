package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import model.Complaint;
import dao.ComplaintDAO;

public final class engineer_005fmachine_002dlist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>Engineer Dashboard</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, Helvetica, sans-serif;\n");
      out.write("            background-color: #f8f9fa;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .sidebar {\n");
      out.write("            position: fixed;\n");
      out.write("            top: 0;\n");
      out.write("            left: 0;\n");
      out.write("            height: 100%;\n");
      out.write("            width: 250px;\n");
      out.write("            background-color: #343a40;\n");
      out.write("            padding-top: 70px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .nav-link {\n");
      out.write("            color: #fff;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .nav-link:hover {\n");
      out.write("            color: #f8f9fa !important;\n");
      out.write("            background-color: #343a40;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .main-content {\n");
      out.write("            margin-left: 250px;\n");
      out.write("            padding: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .home-button {\n");
      out.write("            position: absolute;\n");
      out.write("            top: 10px;\n");
      out.write("            left: 10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .graph-container {\n");
      out.write("            border: 1px solid #ced4da;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            padding: 20px;\n");
      out.write("            background-color: #fff;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<a href=\"index.html\" class=\"btn btn-outline-primary home-button\">Home</a>\n");
      out.write("\n");
      out.write("<div class=\"sidebar\">\n");
      out.write("    <ul class=\"nav flex-column\">\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"index.html\">Home</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <form action=\"LogoutServlet\" method=\"post\" id=\"logoutForm\">\n");
      out.write("                <input type=\"hidden\" name=\"logout\" value=\"true\">\n");
      out.write("                <a class=\"nav-link\" href=\"#\" onclick=\"document.getElementById('logoutForm').submit();\">Logout</a>\n");
      out.write("            </form>\n");
      out.write("        </li>\n");
      out.write("    </ul>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"main-content\">\n");
      out.write("    <h2>Welcome to the Engineer Dashboard</h2>\n");
      out.write(" \n");
      out.write("\n");
      out.write("    <h1 class=\"mb-4\">Complaints Assigned to Engineer ID: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${engineerId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("    <table class=\"table table-bordered mt-3\">\n");
      out.write("        <thead>\n");
      out.write("        <tr>\n");
      out.write("            <th>ID</th>\n");
      out.write("            <th>Machine ID</th>\n");
      out.write("            <th>Status</th>\n");
      out.write("            <th>Date Posted</th>\n");
      out.write("            <th>Feedback</th>\n");
      out.write("            <th>Complaint Type</th>\n");
      out.write("            <th>Date Closed</th>\n");
      out.write("        </tr>\n");
      out.write("        </thead>\n");
      out.write("        <tbody>\n");
      out.write("        <c:forEach var=\"complaint\" items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${complaints}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${complaint.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${complaint.machineId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${complaint.status}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                <td><fmt:formatDate value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${complaint.datePosted}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" pattern=\"yyyy-MM-dd\"/></td>\n");
      out.write("                <td>\n");
      out.write("                    <c:choose>\n");
      out.write("                        <c:when test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty complaint.feedback}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                            <span class=\"red-mark\">&#10008;</span> <!-- Red cross mark -->\n");
      out.write("                        </c:when>\n");
      out.write("                        <c:otherwise>\n");
      out.write("                            <span class=\"green-mark\">&#10004;</span> <!-- Green tick mark -->\n");
      out.write("                        </c:otherwise>\n");
      out.write("                    </c:choose>\n");
      out.write("                </td>\n");
      out.write("                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${complaint.complaintType}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                <td><fmt:formatDate value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${complaint.dateClosed}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" pattern=\"yyyy-MM-dd\"/></td>\n");
      out.write("            </tr>\n");
      out.write("        </c:forEach>\n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
