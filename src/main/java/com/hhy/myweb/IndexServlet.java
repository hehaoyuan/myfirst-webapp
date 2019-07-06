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


//servlet ���򣬼̳�HttpServet��doget, dopost,doput
    //����ָ�������������ص�maven�ֿ��Ŀ¼�ṹ
    //HttpServletRequest req ���󣺻�ȡ��������Ϣ
    //HttpServletResponse resp ��Ӧ�����ڸ��������������

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
        //�����(HTML CSS JAVAscript)
        //ͨ���ַ���ƴ����д��ҳ

        //��������������ʽ��������ʲô����д��ʲô����
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");

    PrintWriter writer = resp.getWriter();
    writer.write("<html>");
    writer.write("<head>");
    writer.write("<title>");
    writer.write("Servlet����");
    writer.write("</title>");
    writer.write("</head>");
    writer.write("<body>");
    writer.append("<h1>").append("��ǰʱ��").append("</h2>");
        //div
        //input
        //A
        //B
        //P ����
    writer.append("<p>").append(LocalDateTime.now().toString()).append("</p>");
    writer.write("</body>");
    writer.write("</html>");
    writer.flush();
    }
}
