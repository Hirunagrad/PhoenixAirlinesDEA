package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.dbcon;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <!-- CSS Links -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../home.css\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!-- MDB -->\n");
      out.write("        <script\n");
      out.write("          type=\"text/javascript\"\n");
      out.write("          src=\"https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/3.3.0/mdb.min.js\"\n");
      out.write("        ></script>\n");
      out.write("        \n");
      out.write("        <!-- Font Awesome -->\n");
      out.write("        <link\n");
      out.write("          href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css\"\n");
      out.write("          rel=\"stylesheet\"\n");
      out.write("        />\n");
      out.write("        <!-- MDB -->\n");
      out.write("        <link\n");
      out.write("          href=\"https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/3.3.0/mdb.min.css\"\n");
      out.write("          rel=\"stylesheet\"\n");
      out.write("        />\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <nav class=\"navbar navbar-dark bg-dark navbar-expand-lg\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\">\n");
      out.write("                    <image src=\"../images/Logo.png\" style=\"width: 25px; margin-left: 5px;\" class=\"nav-logo\"/>\n");
      out.write("                    <span class=\"nav-name\"> Phoenix Airlines </span>\n");
      out.write("                </a> \n");
      out.write("                <button\n");
      out.write("                  class=\"navbar-toggler\"\n");
      out.write("                  type=\"button\"\n");
      out.write("                  data-mdb-toggle=\"collapse\"\n");
      out.write("                  data-mdb-target=\"#navbarNavAltMarkup\"\n");
      out.write("                  aria-controls=\"navbarNavAltMarkup\"\n");
      out.write("                  aria-expanded=\"false\"\n");
      out.write("                  aria-label=\"Toggle navigation\"\n");
      out.write("                >\n");
      out.write("                  <i class=\"fas fa-bars\"></i>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse justify-content-end\" id=\"navbarNavAltMarkup\">\n");
      out.write("                  <div class=\"navbar-nav\">\n");
      out.write("                    <a class=\"nav-link active\" href=\"#\">Home</a>\n");
      out.write("                    <a class=\"nav-link\" href=\"#\">Flights</a>\n");
      out.write("                    <a class=\"nav-link\" href=\"#\">Pricing</a>\n");
      out.write("                    <a class=\"nav-link\" href=\"login.jsp\">Login</a>\n");
      out.write("                    <a class=\"nav-link\" href=\"#\">\n");
      out.write("                        <i class=\"fas fa-user\"></i>\n");
      out.write("                    </a>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("          </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <div class=\"d-flex justify-content-center\">\n");
      out.write("            <br>\n");
      out.write("        \n");
      out.write("        <div class=\"container mt-5\">\n");
      out.write("            <div style=\"text-align: center\" class=\"row\">\n");
      out.write("            <div class=\"col-lg-12\">\n");
      out.write("                <h1 style=\"font-weight: bolder;\">Admin Dashboard</h1>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("            <br>\n");
      out.write("        \n");
      out.write("        <div class=\"row d-flex justify-content-center\">\n");
      out.write("            \n");
      out.write("            <div class=\"col-xl-3 col-lg-6 col-md-6\">\n");
      out.write("             <div class=\"card\" style=\"margin-bottom: 30px; height: 380px; \">\n");
      out.write("                <div class=\"bg-image hover-overlay ripple\" data-mdb-ripple-color=\"light\">\n");
      out.write("                  <!--                  <img\n");
      out.write("                    src=\"./images/20382870.jpg\"\n");
      out.write("                    class=\"img-fluid\"\n");
      out.write("                  />-->\n");
      out.write("                    <div class=\"mask\" style=\"background-color: rgba(251, 251, 251, 0.15)\"></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <h5 class=\"card-title\"><strong>Add New Admin</strong></h5>\n");
      out.write("                  <p class=\"card-text\">\n");
      out.write("                    We a happy to see the your face in our flights\n");
      out.write("                  </p>\n");
      out.write("                  <form action=\"../addAdmin\" method=\"POST\">\n");
      out.write("                      <input type=\"hidden\" value=\"admin\" name=\"position\"/>\n");
      out.write("                      <input type=\"text\" class=\"form-control\"  placeholder=\"Username (ends with 0)\" aria-label=\"Username\" name=\"uname\" aria-describedby=\"addon-wrapping\" /> <br>\n");
      out.write("                      <input type=\"email\" class=\"form-control\" placeholder=\"Email\" aria-label=\"Username\" aria-describedby=\"addon-wrapping\" name=\"email\" /> <br>\n");
      out.write("                      <input type=\"password\" class=\"form-control\" placeholder=\"password\" aria-label=\"Username\" aria-describedby=\"addon-wrapping\" name=\"password\" /> <br>\n");
      out.write("                      <input type=\"submit\" class=\"btn btn-primary\" value=\"Add\"/>\n");
      out.write("                  </form>\n");
      out.write("                  \n");
      out.write("                </div>\n");
      out.write("             </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-xl-3 col-lg-6 col-md-6\">\n");
      out.write("             <div class=\"card\" style=\"margin-bottom: 30px;  height: 380px\">\n");
      out.write("                <div class=\"bg-image hover-overlay ripple\" data-mdb-ripple-color=\"light\">\n");
      out.write("<!--                  <img\n");
      out.write("                    src=\"./images/20382870.jpg\"\n");
      out.write("                    class=\"img-fluid\"\n");
      out.write("                  />-->\n");
      out.write("                    <div class=\"mask\" style=\"background-color: rgba(251, 251, 251, 0.15)\"></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <h5 class=\"card-title\"><strong>Add New Grade One Staff</strong></h5>\n");
      out.write("                  <p class=\"card-text\">\n");
      out.write("                    We a happy to see the your face in our flights\n");
      out.write("                  </p>\n");
      out.write("                  <form action=\"../addAdmin\" method=\"POST\">\n");
      out.write("                      <input type=\"hidden\" value=\"stg1\" name=\"position\"/>\n");
      out.write("                      <input type=\"text\" class=\"form-control\"  placeholder=\"Username (ends with 1)\" aria-label=\"Username\" name=\"uname\" aria-describedby=\"addon-wrapping\" /> <br>\n");
      out.write("                      <input type=\"email\" class=\"form-control\" placeholder=\"Email\" aria-label=\"Username\" aria-describedby=\"addon-wrapping\" name=\"email\" /> <br>\n");
      out.write("                      <input type=\"password\" class=\"form-control\" placeholder=\"password\" aria-label=\"Username\" aria-describedby=\"addon-wrapping\" name=\"password\" /> <br>\n");
      out.write("                      <input type=\"submit\" class=\"btn btn-primary\" value=\"Add\"/>\n");
      out.write("                  </form>\n");
      out.write("                </div>\n");
      out.write("             </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-xl-3 col-lg-6 col-md-6\">\n");
      out.write("             <div class=\"card\" style=\"margin-bottom: 30px;  height: 380px\">\n");
      out.write("                <div class=\"bg-image hover-overlay ripple\" data-mdb-ripple-color=\"light\">\n");
      out.write("<!--                  <img\n");
      out.write("                    src=\"./images/20382870.jpg\"\n");
      out.write("                    class=\"img-fluid\"\n");
      out.write("                  />-->\n");
      out.write("                    <div class=\"mask\" style=\"background-color: rgba(251, 251, 251, 0.15)\"></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <h5 class=\"card-title\"><strong>Add New Grade Two Staff</strong></h5>\n");
      out.write("                  <p class=\"card-text\">\n");
      out.write("                    We a happy to see the your face in our flights\n");
      out.write("                  </p>\n");
      out.write("                  <form action=\"../addAdmin\" method=\"POST\">\n");
      out.write("                      <input type=\"hidden\" value=\"stg2\" name=\"position\"/>\n");
      out.write("                      <input type=\"text\" class=\"form-control\"  placeholder=\"Username (ends with 2)\" aria-label=\"Username\" name=\"uname\" aria-describedby=\"addon-wrapping\" /> <br>\n");
      out.write("                      <input type=\"email\" class=\"form-control\" placeholder=\"Email\" aria-label=\"Username\" aria-describedby=\"addon-wrapping\" name=\"email\" /> <br>\n");
      out.write("                      <input type=\"password\" class=\"form-control\" placeholder=\"password\" aria-label=\"Username\" aria-describedby=\"addon-wrapping\" name=\"password\" /> <br>\n");
      out.write("                      <input type=\"submit\" class=\"btn btn-primary\" value=\"Add\"/>\n");
      out.write("                  </form>\n");
      out.write("                </div>\n");
      out.write("             </div>\n");
      out.write("            </div>\n");
      out.write("                  \n");
      out.write("            <div class=\"col-xl-3 col-lg-6 col-md-6\">\n");
      out.write("             <div class=\"card\" style=\"margin-bottom: 30px; height: 380px\">\n");
      out.write("                <div class=\"bg-image hover-overlay ripple\" data-mdb-ripple-color=\"light\">\n");
      out.write("                  <img\n");
      out.write("                    src=\"https://img.freepik.com/free-vector/search-concept-illustration_114360-95.jpg?size=338&ext=jpg\"\n");
      out.write("                    class=\"img-fluid\"\n");
      out.write("                  />\n");
      out.write("                    <div class=\"mask\" style=\"background-color: rgba(251, 251, 251, 0.15)\"></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <h5 class=\"card-title\"><strong>Search User By ID</strong></h5>\n");
      out.write("                    <form action=\"../searchbyid.jsp\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter user ID\" aria-label=\"userid\" aria-describedby=\"addon-wrapping\" name=\"userid\"  required/>\n");
      out.write("                  <br>\n");
      out.write("                  <input type=\"submit\" class=\"btn btn-primary\" value=\"Search\">\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("             </div>\n");
      out.write("            </div>   \n");
      out.write("          </div>\n");
      out.write("         </div>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("        <div class=\"container\">\n");
      out.write("                <br> <br>\n");
      out.write("    <center><h1>Flight Details</h1></center> <form action=\"../addflight\">\n");
      out.write("        \n");
      out.write("    </form>\n");
      out.write("    <br>\n");
      out.write("        <table class=\"table\">\n");
      out.write("            <thead class=\"table-dark\">\n");
      out.write("                <tr>\n");
      out.write("                    <th>FlightID</th>\n");
      out.write("                    <th>Seats 1st Class</th>\n");
      out.write("                    <th>Seats 2nd Class</th>\n");
      out.write("                    <th>Seats 3rd Class</th>\n");
      out.write("                    <th>Destination</th>\n");
      out.write("                    <th>Date</th>\n");
      out.write("                    <th>Delete</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            \n");
      out.write("            ");

            try{
            dbcon con = new dbcon();
            statement =con.connection().createStatement();
            String sql = "SELECT * FROM flights";
            resultSet = statement.executeQuery(sql);
            
            while(resultSet.next()){
      out.write("\n");
      out.write("            \n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(resultSet.getString("flightid"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(resultSet.getString("firstclass"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(resultSet.getString("businessclass"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(resultSet.getString("economyclass"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(resultSet.getString("destination"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(resultSet.getString("date"));
      out.write("</td>\n");
      out.write("                    <td>\n");
      out.write("                        <form action=\"../deleteFlight\" method=\"POST\">\n");
      out.write("                            <input type=\"hidden\" name=\"flightid\" value=\"");
      out.print(resultSet.getString("flightid"));
      out.write("\">\n");
      out.write("                            <input type=\"submit\" value=\"Delete\" class=\"btn btn-dark\"/>\n");
      out.write("                        </form>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </tbody>\n");
      out.write("\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("    \n");
      out.write("    <br> \n");
      out.write("    <br>\n");
      out.write("    <hr>\n");
      out.write("            <div class=\"col-xl-12\">\n");
      out.write("             <div class=\"card\" style=\" margin: 30px; height: 420px\">\n");
      out.write("                <div class=\"bg-image hover-overlay ripple\" data-mdb-ripple-color=\"light\">\n");
      out.write("\n");
      out.write("                    <div class=\"mask\" style=\"background-color: rgba(251, 251, 251, 0.15)\"></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <h5 class=\"card-title\"><strong>Update Flight</strong></h5>\n");
      out.write("                    <br>\n");
      out.write("                  \n");
      out.write("                  <form action=\"../updateFlight\" method=\"POST\">\n");
      out.write("                      Flight ID\n");
      out.write("                      <input type=\"text\" class=\"form-control\" placeholder=\"12003\" aria-label=\"flightid\" aria-describedby=\"addon-wrapping\" name=\"flightid\" /> <br>\n");
      out.write("                      Destination\n");
      out.write("                      <select name=\"destination\" class=\"form-select\" aria-label=\"Default select example\">\n");
      out.write("                          <option value=\"\">Select</option>\n");
      out.write("                          <option value=\"india\">Sri Lanka - India</option>\n");
      out.write("                          <option value=\"dubai\">Sri Lanka - Dubai</option>\n");
      out.write("                          <option value=\"Australia\">Sri Lanka - Australia</option>\n");
      out.write("                      </select> <br>\n");
      out.write("                      Date\n");
      out.write("                      <input type=\"date\" class=\"form-control\"  aria-label=\"Username\" aria-describedby=\"addon-wrapping\" name=\"date\" /> <br>\n");
      out.write("                      <input type=\"submit\" class=\"btn btn-primary\" value=\"Update\"/><br>\n");
      out.write("                      \n");
      out.write("                  </form>\n");
      out.write("                </div>\n");
      out.write("             </div>\n");
      out.write("            </div>\n");
      out.write("    \n");
      out.write("    <br>\n");
      out.write("    <hr>\n");
      out.write("    <br>\n");
      out.write("            \n");
      out.write("            <div class=\"col-xl-12\">\n");
      out.write("             <div class=\"card\" style=\" margin: 30px; height: 380px\">\n");
      out.write("                <div class=\"bg-image hover-overlay ripple\" data-mdb-ripple-color=\"light\">\n");
      out.write("<!--                  <img\n");
      out.write("                    src=\"./images/20382870.jpg\"\n");
      out.write("                    class=\"img-fluid\"\n");
      out.write("                  />-->\n");
      out.write("                    <div class=\"mask\" style=\"background-color: rgba(251, 251, 251, 0.15)\"></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <h5 class=\"card-title\"><strong>Add New Flight</strong></h5>\n");
      out.write("                  <p class=\"card-text\">\n");
      out.write("                    We a happy to see the your face in our flights\n");
      out.write("                  </p>\n");
      out.write("                  <form action=\"../addFlight\" method=\"POST\">\n");
      out.write("                      Destination\n");
      out.write("                      <select name=\"destination\" class=\"form-select\" aria-label=\"Default select example\">\n");
      out.write("                          <option value=\"\">Select</option>\n");
      out.write("                          <option value=\"india\">Sri Lanka - India</option>\n");
      out.write("                          <option value=\"dubai\">Sri Lanka - Dubai</option>\n");
      out.write("                          <option value=\"Australia\">Sri Lanka - Australia</option>\n");
      out.write("                      </select> <br>\n");
      out.write("                      Date\n");
      out.write("                      <input type=\"date\" class=\"form-control\"  aria-label=\"Username\" aria-describedby=\"addon-wrapping\" name=\"date\" /> <br>\n");
      out.write("                      <input type=\"submit\" class=\"btn btn-primary\" value=\"Add\"/>\n");
      out.write("                  </form>\n");
      out.write("                </div>\n");
      out.write("             </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("    <hr>\n");
      out.write("    <br>\n");
      out.write("                  \n");
      out.write("    <center><h1>Ticket Details</h1></center>\n");
      out.write("    <br>\n");
      out.write("             \n");
      out.write("        <table class=\"table\">\n");
      out.write("            <thead class=\"table-dark\">\n");
      out.write("                <tr>\n");
      out.write("                    <th>TiketID</th>\n");
      out.write("                    <th>FlightID</th>\n");
      out.write("                    <th>ClientID</th>\n");
      out.write("                    <th>Seat Numbers</th>\n");
      out.write("                    <th>Price</th>\n");
      out.write("                    <th>Date</th>\n");
      out.write("                    <th>Destination</th>\n");
      out.write("                    <th>Class</th>\n");
      out.write("                    <th>Delete</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            \n");
      out.write("            ");

            statement =con.connection().createStatement();
            String sql2 = "SELECT * FROM tiskets";
            resultSet = statement.executeQuery(sql2);

            while(resultSet.next()){
      out.write("\n");
      out.write("\n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(resultSet.getString("ticketid"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(resultSet.getString("flightid"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(resultSet.getString("clientid"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(resultSet.getString("seatno"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(resultSet.getString("price"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(resultSet.getString("date"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(resultSet.getString("destination"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(resultSet.getString("class"));
      out.write("</td>\n");
      out.write("                    <td>\n");
      out.write("                        <form action=\"../deleteTicket\" method=\"POST\">\n");
      out.write("                            <input type=\"hidden\" name=\"tiketid\" value=\"");
      out.print(resultSet.getString("ticketid"));
      out.write("\">\n");
      out.write("                            <input type=\"submit\" value=\"Delete\" class=\"btn btn-dark\"/>\n");
      out.write("                        </form>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </tbody>\n");
      out.write("            \n");
      out.write("            ");

                }
            connection.close();
            }catch(Exception e){
                e.printStackTrace();
            }      
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("         <div class=\"container-fluid footer\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-4 col-sm-12\" style=\"text-align: center;color: white\">\n");
      out.write("                   <image src=\"../images/logo2.jpg\" class=\"footer-logo\"/>\n");
      out.write("                   <h6>Phoenix Airlines</h6>\n");
      out.write("                   <p>Find islands' best offers with SriLankan Holidays</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4 col-sm-12\"><br>\n");
      out.write("                    <form>\n");
      out.write("\n");
      out.write("                        <!-- Email input -->\n");
      out.write("                        <div>\n");
      out.write("                          <label style=\"color: white\">Email address</label>\n");
      out.write("                          <input type=\"email\"  class=\"dropdown\" />\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- Message input -->\n");
      out.write("                        <div>\n");
      out.write("                          <label style=\"color: white\">Message</label>\n");
      out.write("                          <textarea class=\"dropdown\"  rows=\"2\"></textarea>\n");
      out.write("                        </div><br>\n");
      out.write("\n");
      out.write("                        <!-- Submit button -->\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-light btn-block mb-4\" style=\"width: 200px\">Send</button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4 col-sm-12\" style=\"text-align: right; color: white;padding: 40px 70px 0px 0px\">\n");
      out.write("                    <p>+94 152 524 45 &nbsp;<i class=\"fas fa-phone\"></i></p>\n");
      out.write("                    <p>phoenixairlines@gmail.com &nbsp;<i class=\"fas fa-envelope-square\"></i></p>\n");
      out.write("                    <p>NO.25, Pitipana South , Homagama &nbsp; <i class=\"fas fa-home\"></i></p><br><br>\n");
      out.write("                    <span><i class=\"fab fa-facebook fa-2x\"></i>&nbsp;&nbsp;<i class=\"fab fa-twitter fa-2x\"></i>&nbsp;&nbsp;<i class=\"fab fa-linkedin fa-2x\"></i>&nbsp;&nbsp;<i class=\"fab fa-instagram fa-2x\"></i></span>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <center><p style=\"color: white\"><i class=\"fas fa-copyright\"></i> copyright phoenix airlines 2021</p></center>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>");
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
