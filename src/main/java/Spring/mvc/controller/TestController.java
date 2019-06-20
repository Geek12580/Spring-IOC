package Spring.mvc.controller;


import Spring.annotation.hongController;
import Spring.annotation.hongRequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@hongController
@hongRequestMapping("/test")
public class TestController {
    @hongRequestMapping("/testMethod.action")
    public void testMethod(HttpServletRequest request, HttpServletResponse response)
    {
        System.out.println("You have successfully entered the Spring method!");
    }
}
