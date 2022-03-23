import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;


@WebServlet(urlPatterns = "/demo2",loadOnStartup = 1)
public class ServletDemo2 implements Servlet {



/*
* 初始化方法：
* 1.调用时机：默认情况下，servlet被第一次访问时，调用
*           loadOnStartip:
* 2.调用次数：1次
* @Param config
* @throws ServeletException
*
*
* */

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init...");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("servlet hello world~");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("destroy....");
    }






    @Override
    public ServletConfig getServletConfig() {
        return null;
    }


}
