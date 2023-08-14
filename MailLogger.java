package oopWithNLayeredApp.core.logging;

public class MailLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println(" mail sent: " + data);    //gönderdiğimiz datanın ne olduğunu görmek için artı data dedik



    }
}
