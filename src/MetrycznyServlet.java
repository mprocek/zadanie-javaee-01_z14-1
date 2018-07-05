import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/metryczny")
public class MetrycznyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int[] tab = new int[3];

        tab[0] = Integer.parseInt(request.getParameter("metry"));
        tab[1] = Integer.parseInt(request.getParameter("centymetry"));
        tab[2] = Integer.parseInt(request.getParameter("milimetry"));

        int licz=0;

    for(int i=0;i<3;i++){
        if(tab[i]>0)
            licz++;
    }

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");

    if (licz>1){
        response.getWriter().println("<h1> Należy wypełnić tylko jedno pole </h1>");
    } else if(tab[0]!=0){
        response.getWriter().println("<h1>Podana wartość w przeliczeniu na:</h1>");
        response.getWriter().println("<h4>metry: " + tab[0]);
        response.getWriter().println("<h4>centymetry: " + tab[0]*100);
        response.getWriter().println("<h4>milimetry: " + tab[0]*1000);
    } else if(tab[1]!=0){
        response.getWriter().println("<h1>Podana wartość w przeliczeniu na:</h1>");
        response.getWriter().println("<h4>metry: " + (double)tab[1]/100);
        response.getWriter().println("<h4>centymetry: " + tab[1]);
        response.getWriter().println("<h4>milimetry: " + tab[1]*100);
    } else {
        response.getWriter().println("<h1>Podana wartość w przeliczeniu na:</h1>");
        response.getWriter().println("<h4>metry: " + (double)tab[1]/1000);
        response.getWriter().println("<h4>centymetry: " + (double)tab[2]/100);
        response.getWriter().println("<h4>milimetry: " + tab[2]);
    }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

 }
