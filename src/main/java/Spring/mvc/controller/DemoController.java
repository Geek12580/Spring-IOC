package Spring.mvc.controller;

import Spring.annotation.hongAutoWired;
import Spring.annotation.hongController;
import Spring.annotation.hongRequestMapping;
import Spring.mvc.service.IDemoService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@hongController
@hongRequestMapping("/demo")
public class DemoController {
    @hongAutoWired
    IDemoService demoService;
    @hongRequestMapping("/add")
    public void add(HttpServletRequest request, HttpServletResponse response,String name) throws IOException {
//        request.setCharacterEncoding("UTF-8");
        name=new String(name.getBytes("ISO-8859-1"),"UTF-8");
        String value=demoService.add(name);
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write(value);
    }
    @hongRequestMapping("/delete")
    public void delete(HttpServletRequest request, HttpServletResponse response,String name) throws IOException {
        String value=demoService.delete(name);
        response.getWriter().write(value);
    }
    @hongRequestMapping("/update")
    public void update(HttpServletRequest request, HttpServletResponse response,String name) throws IOException {
        String value=demoService.update(name);
        response.getWriter().write(value);
    }
}
