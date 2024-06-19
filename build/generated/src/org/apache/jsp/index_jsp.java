package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.tech.blog.entities.Post;
import java.util.List;
import com.tech.blog.helper.ConnectionProvider;
import java.sql.*;
import java.util.ArrayList;
import com.tech.blog.entities.Category;
import com.tech.blog.dao.PostDao;
import com.tech.blog.helper.ConnectionProvider;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/normal_navbar.jsp");
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home Page</title>\n");
      out.write("\n");
      out.write("        <!--css-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"css/mystyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <style>\n");
      out.write("            .banner-background{\n");
      out.write("             clip-path: polygon(30% 0%, 70% 0%, 100% 0, 100% 91%, 63% 100%, 22% 91%, 0 99%, 0 0);\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <!--navbar-->\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark primary-background\">\n");
      out.write("    <a class=\"navbar-brand\" href=\"index.jsp\"> <span class=\"fa fa-asterisk\"></span>   Tech Blog</a>\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("        <ul class=\"navbar-nav mr-auto\">\n");
      out.write("          \n");
      out.write("            <li class=\"nav-item dropdown\">\n");
      out.write("                <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                    <span class=\"fa fa-check-square-o\"></span> Categories\n");
      out.write("                </a>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                    ");

                        PostDao d=new PostDao(ConnectionProvider.getConnection());
                        ArrayList<Category> list1=d.getAllCategories();
                        for(Category cc:list1){
                            
                            
      out.write("\n");
      out.write("                             <a class=\"dropdown-item\" href=\"#\">\n");
      out.write("                                 ");
      out.print( cc.getName());
      out.write("\n");
      out.write("                             </a>\n");
      out.write("                            ");

                            
                            
                        }
                    
      out.write("\n");
      out.write("                  \n");
      out.write("        \n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"contact.jsp\"> <span class=\"fa fa-address-card-o\"></span> Contact</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"login_page.jsp\"> <span class=\"fa fa-user-circle \"></span> Login</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"register_page.jsp\"> <span class=\"fa fa-user-plus \"></span> Sign up</a>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("        </ul>\n");
      out.write("        <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("            <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("            <button class=\"btn btn-outline-light my-2 my-sm-0\" type=\"submit\">Search</button>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--//banner-->\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid p-0 m-0\">\n");
      out.write("\n");
      out.write("            <div class=\"jumbotron primary-background text-white banner-background\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <h3 class=\"display-3\">Welcome to TechBlog </h3>\n");
      out.write("\n");
      out.write("                    <p>Welcome to technical blog, world of technology\n");
      out.write("                        A programming language is a formal language, which comprises a set of instructions that produce various kinds of output. Programming languages are used in computer programming to implement algorithms.\n");
      out.write("                    </p>\n");
      out.write("                    <p>\n");
      out.write("                        Most programming languages consist of instructions for computers. There are programmable machines that use a set of specific instructions, rather than general programming languages. \n");
      out.write("                    </p>\n");
      out.write("\n");
      out.write("                    <a href=\"register_page.jsp\" class=\"btn btn-outline-light btn-lg\"> <span class=\"fa \tfa fa-user-plus\"></span>  Start ! its Free</a>\n");
      out.write("                    <a href=\"login_page.jsp\" class=\"btn btn-outline-light btn-lg\"> <span class=\"fa fa-user-circle fa-spin\"></span>  Login</a>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--//cards-->\n");
      out.write("\n");
      out.write("        <div class=\"container\" style=\"max-height:200px;\">\n");
      out.write("<div class=\"row mb-2\">\n");
      out.write("            \n");
      out.write("                ");
 
 PostDao pp = new PostDao(ConnectionProvider.getConnection());
    List<Post> posts=pp.getAllPostatIndex();
    for(Post p:posts){
    
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("       <div class=\"col\">\n");
      out.write("           <div class=\"card\" style=\"width:20rem; height: 150px\">\n");
      out.write("                    <div class=\"card  \" >\n");
      out.write("                      <img class=\"card-img-left\" src=\"blog_pics/");
      out.print( p.getpPic());
      out.write("\" alt=\"Card image cap\"> \n");
      out.write("            <div class=\"card-body\">\n");
      out.write("                <h5>");
      out.print( p.getpTitle());
      out.write("</h5>\n");
      out.write("                <span  style=\"overflow: hidden \">\n");
      out.write("                <p>");
      out.print( p.getpContent());
      out.write("</p>\n");
      out.write("                </span>    \n");
      out.write("                <a href=\"#\" class=\"btn primary-background text-white\" onclick=\"login()\">Read more</a>\n");
      out.write("                        </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                    </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("   \n");
      out.write("                \n");
      out.write("    \n");
      out.write("    ");

        }
                    
      out.write("\n");
      out.write("\n");
      out.write("              </div>\n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("                    \n");
      out.write("            \n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--javascripts-->\n");
      out.write("        <script>\n");
      out.write("            function login(){\n");
      out.write("                swal(\"Please firstly Login\", \"create account if not registered\");\n");
      out.write("            }\n");
      out.write("            </script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"\n");
      out.write("            integrity=\"sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"js/myjs.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
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
