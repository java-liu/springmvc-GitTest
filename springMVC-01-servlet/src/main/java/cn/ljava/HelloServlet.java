package cn.ljava;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description: 自定义一个Servlet处理前端请求
 * @Author: Liuys
 * @CreateDate: 2021/7/12 14:11
 * @Version: 1.0
 */
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1、获取前端参数
        String method = req.getParameter("method");
        if("add".equals(method)){
            req.getSession().setAttribute("msg","执行了add方法");
        }
         if("delete".equals(method)){
            req.getSession().setAttribute("msg","执行了delete方法");
        }
        //2、调用业务层
        //3.视图转发或者重定向
        req.getRequestDispatcher("/WEB-INF/jsp/test.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
