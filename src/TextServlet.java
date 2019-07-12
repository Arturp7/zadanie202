import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/text")
public class TextServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String tekst = request.getParameter("tekst");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");

        PrintWriter writer = response.getWriter();
        TekstOperation operation = new TekstOperation();
        int wordsCount = operation.lengthCalc(tekst);
        int charsCount = operation.totalLenght(tekst);
        boolean palindrom = operation.palindrom(tekst);

        writer.println(tekst + "</br>");
        writer.println("Ilość słów " + wordsCount+"</br>");
        writer.println("Ilość znaków " + (charsCount-4)+"</br>");
        writer.println("Ilość znaków bez spacji " + ((charsCount-4)-(wordsCount-1))+"</br>");
        writer.println("Palindrom: " + palindrom );


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
