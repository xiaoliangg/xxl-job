package com.yl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {
    private int i;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().println("2222"
                + "time:2017-5-17 10:12:25:81" + "  " + (i++));
    }
    @Override
    public void init() throws ServletException {
        System.out.println("init test"); // 启动时不会走此方法，调用时会走此方法
    }
}
