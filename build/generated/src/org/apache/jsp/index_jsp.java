package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/./navbar.jsp");
  }

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Phoenix Airline</title>\r\n");
      out.write("        \r\n");
      out.write("        <!-- Font Awesome -->\r\n");
      out.write("        <link\r\n");
      out.write("          href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css\"\r\n");
      out.write("          rel=\"stylesheet\"\r\n");
      out.write("        />\r\n");
      out.write("        <!-- Google Fonts -->\r\n");
      out.write("        <link\r\n");
      out.write("          href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap\"\r\n");
      out.write("          rel=\"stylesheet\"\r\n");
      out.write("        />\r\n");
      out.write("        <!-- MDB -->\r\n");
      out.write("        <link\r\n");
      out.write("          href=\"https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/3.3.0/mdb.min.css\"\r\n");
      out.write("          rel=\"stylesheet\"\r\n");
      out.write("        />\r\n");
      out.write("        \r\n");
      out.write("        <!-- MDB -->\r\n");
      out.write("        <script\r\n");
      out.write("          type=\"text/javascript\"\r\n");
      out.write("          src=\"https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/3.3.0/mdb.min.js\"\r\n");
      out.write("        ></script>\r\n");
      out.write("        \r\n");
      out.write("        <!-- CSS Links -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./home.css\">\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("    .nav-logo{\r\n");
      out.write("    width: 25px;\r\n");
      out.write("    margin-left: 5px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-dark bg-dark navbar-expand-lg\">\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"#\">\r\n");
      out.write("            <image src=\"./images/Logo.png\" class=\"nav-logo\"/>\r\n");
      out.write("            <span class=\"nav-name\"> Phoenix Airlines </span>\r\n");
      out.write("        </a> \r\n");
      out.write("        <button\r\n");
      out.write("          class=\"navbar-toggler\"\r\n");
      out.write("          type=\"button\"\r\n");
      out.write("          data-mdb-toggle=\"collapse\"\r\n");
      out.write("          data-mdb-target=\"#navbarNavAltMarkup\"\r\n");
      out.write("          aria-controls=\"navbarNavAltMarkup\"\r\n");
      out.write("          aria-expanded=\"false\"\r\n");
      out.write("          aria-label=\"Toggle navigation\"\r\n");
      out.write("        >\r\n");
      out.write("          <i class=\"fas fa-bars\"></i>\r\n");
      out.write("        </button>\r\n");
      out.write("        <div class=\"collapse navbar-collapse justify-content-end\" id=\"navbarNavAltMarkup\">\r\n");
      out.write("          <div class=\"navbar-nav\">\r\n");
      out.write("            <a class=\"nav-link active\" aria-current=\"page\" href=\"#\">Home</a>\r\n");
      out.write("            <a class=\"nav-link\" href=\"#\">Flights</a>\r\n");
      out.write("            <a class=\"nav-link\" href=\"#\">Pricing</a>\r\n");
      out.write("            <a class=\"nav-link\" href=\"#\">\r\n");
      out.write("                <i class=\"fas fa-user\"></i>\r\n");
      out.write("            </a>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"parallax-home\" >\r\n");
      out.write("            <h2 class=\"main-title\" >PHOENIX AIRLINES </h2>\r\n");
      out.write("            <div class=\"row justify-content-center\">\r\n");
      out.write("                <div class=\"col-xl-6 col-lg-6 col-sm-12 form1\">\r\n");
      out.write("                    <form action=\"./SearchFlight\" method=\"POST\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-lg-6 col-sm-12\">\r\n");
      out.write("                            <label style=\"color: white\">Destination</label><br>\r\n");
      out.write("                            <select name=\"destination\" class=\"dropdown\" required >\r\n");
      out.write("                                <option value=\"\">Destination</option>\r\n");
      out.write("                                <option value=\"india\">Sri lanka - India</option>\r\n");
      out.write("                                <option value=\"australia\">Sri Lanka - Australia</option>\r\n");
      out.write("                                <option value=\"dubai\">Sri Lanka - Dubai</option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-6 col-sm-12\">\r\n");
      out.write("                            <label style=\"color: white\">Class</label><br>\r\n");
      out.write("                            <select name=\"class\" class=\"dropdown\" required >\r\n");
      out.write("                                <option value=\"\">Class</option>\r\n");
      out.write("                                <option value=\"firstclass\">First Class</option>\r\n");
      out.write("                                <option value=\"businessclass\">Business Class</option>\r\n");
      out.write("                                <option value=\"economyclass\">Economy Class</option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div><br><br>\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-lg-6 col-sm-12\">\r\n");
      out.write("                            <label style=\"color: white\">Number of passengers</label><br>\r\n");
      out.write("                            <input type=\"text\" placeholder=\"Number of passengers\"  name=\"passengers\" class=\"dropdown\" style=\"width: 70%\" required>\r\n");
      out.write("                          \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-6 col-sm-12\">\r\n");
      out.write("                            <label style=\"color: white\">Departure Date</label><br>\r\n");
      out.write("                            <input type=\"date\"  name=\"departDate\" class=\"dropdown\" style=\"width: 70%;\" required> \r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                    </div><br><br>\r\n");
      out.write("              \r\n");
      out.write("                            <center><button type=\"submit\" class=\"btn btn-dark\" style=\"width: 200px\"> SEARCH </button></center>\r\n");
      out.write("                  \r\n");
      out.write("                    </form>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div> \r\n");
      out.write("        </div> \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <div class=\"cont\"> \r\n");
      out.write("            <image src=\"./images/logo2.jpg\" class=\"body-logo\"/><br><br>\r\n");
      out.write("            <h1 class=\"header\">Fly With Phoenix...</h1>\r\n");
      out.write("            <h3 class=\"slog\">Find islands' best offers with SriLankan Holidays</h3><br>\r\n");
      out.write("            <p class=\"content\">Discover a range of holiday deals in Sri Lanka with Sri Lankan Airlines including hotel offers,<br> special rates for charter of flights and yachts and exclusive spas</p>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row row-cols-1 row-cols-md-3 g-4\" style=\"margin: -100px 0px 100px 0px\">\r\n");
      out.write("                    <div class=\"col\">\r\n");
      out.write("                      <div class=\"card h-100\">\r\n");
      out.write("                        <img\r\n");
      out.write("                          src=\"./images/seats.jpg\"\r\n");
      out.write("                          class=\"card-img-top\"\r\n");
      out.write("                          alt=\"...\"\r\n");
      out.write("                        />\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                          <h5 class=\"card-title\">Comfortable</h5>\r\n");
      out.write("                          <p class=\"card-text\">\r\n");
      out.write("                            This is a wider card with supporting text below as a natural lead-in to\r\n");
      out.write("                            additional content. This content is a little bit longer.\r\n");
      out.write("                          </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col\">\r\n");
      out.write("                      <div class=\"card h-100\">\r\n");
      out.write("                        <img\r\n");
      out.write("                          src=\"./images/service.jpg\"\r\n");
      out.write("                          class=\"card-img-top\"\r\n");
      out.write("                          alt=\"...\"\r\n");
      out.write("                        />\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                          <h5 class=\"card-title\">Best Customer Service</h5>\r\n");
      out.write("                          <p class=\"card-text\">\r\n");
      out.write("                            This card has supporting text below as a natural lead-in to additional\r\n");
      out.write("                            content.\r\n");
      out.write("                          </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col\">\r\n");
      out.write("                      <div class=\"card h-100\">\r\n");
      out.write("                        <img\r\n");
      out.write("                          src=\"./images/cost.jpg\"\r\n");
      out.write("                          class=\"card-img-top\"\r\n");
      out.write("                          alt=\"...\"\r\n");
      out.write("                        />\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                          <h5 class=\"card-title\">Cost Effective</h5>\r\n");
      out.write("                          <p class=\"card-text\">\r\n");
      out.write("                            This is a wider card with supporting text below as a natural lead-in to\r\n");
      out.write("                            additional content. This card has even longer content than the first to show\r\n");
      out.write("                            that equal height action.\r\n");
      out.write("                          </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"container-fluid footer\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-4 col-sm-12\" style=\"text-align: center;color: white\">\r\n");
      out.write("                   <image src=\"./images/logo2.jpg\" class=\"footer-logo\"/>\r\n");
      out.write("                   <h6>Phoenix Airlines</h6>\r\n");
      out.write("                   <p>Find islands' best offers with SriLankan Holidays</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-4 col-sm-12\"><br>\r\n");
      out.write("                    <form>\r\n");
      out.write("\r\n");
      out.write("                        <!-- Email input -->\r\n");
      out.write("                        <div>\r\n");
      out.write("                          <label style=\"color: white\">Email address</label>\r\n");
      out.write("                          <input type=\"email\"  class=\"dropdown\" />\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <!-- Message input -->\r\n");
      out.write("                        <div>\r\n");
      out.write("                          <label style=\"color: white\">Message</label>\r\n");
      out.write("                          <textarea class=\"dropdown\"  rows=\"2\"></textarea>\r\n");
      out.write("                        </div><br>\r\n");
      out.write("\r\n");
      out.write("                        <!-- Submit button -->\r\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-light btn-block mb-4\" style=\"width: 200px\">Send</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-4 col-sm-12\" style=\"text-align: right; color: white;padding: 40px 70px 0px 0px\">\r\n");
      out.write("                    <p>+94 152 524 45 &nbsp;<i class=\"fas fa-phone\"></i></p>\r\n");
      out.write("                    <p>phoenixairlines@gmail.com &nbsp;<i class=\"fas fa-envelope-square\"></i></p>\r\n");
      out.write("                    <p>NO.25, Pitipana South , Homagama &nbsp; <i class=\"fas fa-home\"></i></p><br><br>\r\n");
      out.write("                    <span><i class=\"fab fa-facebook fa-2x\"></i>&nbsp;&nbsp;<i class=\"fab fa-twitter fa-2x\"></i>&nbsp;&nbsp;<i class=\"fab fa-linkedin fa-2x\"></i>&nbsp;&nbsp;<i class=\"fab fa-instagram fa-2x\"></i></span>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("            <center><p style=\"color: white\"><i class=\"fas fa-copyright\"></i> copyright phoenix airlines 2021</p></center>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("       \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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