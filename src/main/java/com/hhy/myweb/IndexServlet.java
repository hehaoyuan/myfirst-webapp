package com.hhy.myweb;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

/**
 * @Information:
 * @Author: HeHaoYuan
 * @Date: Created at 0:31 on 2019/6/30
 * @Package_Name: com.hhy.myweb
 */


//servlet 程序，继承HttpServet，doget, dopost,doput
    //跟据指定参数遍历本地的maven仓库的目录结构
    //HttpServletRequest req 请求：获取参数等信息
    //HttpServletResponse resp 响应：用于给浏览器发送数据

public class IndexServlet extends HttpServlet {
    //GET
    //POST
    //PUT
    //DELETE
    //HEAD
    //public  protected default private

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
//        super.doGet(req, resp);
        //浏览器(HTML CSS JAVAscript)
        //通过字符串拼接来写网页

        //告诉浏览器编码格式，和是用什么语言写的什么东西
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");

    PrintWriter writer = resp.getWriter();
    writer.write("<html>");
    writer.write("<head>");
    writer.write("<title>");
    writer.write("Servlet程序");
    writer.write("</title>");
    writer.write("</head>");
    writer.write("<body>");
    writer.append("<h1>").append("当前时间").append("</h2>");
        //div
        //input
        //A
        //B
        //P 段落
    writer.append("<p>").append(LocalDateTime.now().toString()).append("</p>");
    writer.write("</body>");
    writer.write("</html>");
    writer.flush();
    }
}
