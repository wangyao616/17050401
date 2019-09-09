package Servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@javax.servlet.annotation.WebServlet(name = "Servlet",value = "/Servlet")
public class Servlet extends javax.servlet.http.HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("fsgg");
        String year=req.getParameter("1");
        int y=Integer.valueOf(year);
        double M=4080*Math.pow(Math.E,y-1974);
        double p1=0.3*Math.pow(0.72,y-1974);
        double p2=0.048*Math.pow(0.12,y-1974);
        req.setAttribute("M",String.format("%.2f",M));
        req.setAttribute("p1",p1);
        req.setAttribute("p2",p2);
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
