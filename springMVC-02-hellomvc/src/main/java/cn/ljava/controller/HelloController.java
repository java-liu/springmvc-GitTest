package cn.ljava.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description: java类作用描述
 * @Author: Liuys
 * @CreateDate: 2021/7/12 16:12
 * @Version: 1.0
 */
//注意，这里先导入Controller接口
public class HelloController implements Controller {
    //ModelAndView 模型和视图
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","HelloSpringMVC");
        //: /WEB-INF/jsp/hello.jsp
        mv.setViewName("hello");
        return mv;
    }
}
