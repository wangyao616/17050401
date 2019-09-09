package Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet2",value = "/Servlet2")
public class Servlet2 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String a1=req.getParameter("1");
        String a2=req.getParameter("2");
        String a3=req.getParameter("3");
        String a4=req.getParameter("4");
        double e=Math.E;
        int y=Integer.valueOf(a1);
        int length=Integer.valueOf(a2);
        int c=Integer.valueOf(a3);
        int q=Integer.valueOf(a4);
        double b=0.28*(y-1960);
        double m=4080*Math.pow(e, b);
        m=m/c*q/30;
        req.setAttribute("second",String.format("%.2f",m));
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
