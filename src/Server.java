import java.rmi.Naming;

public class Server {
    public Server() {
        try {
            CalculatorImpl cl = new CalculatorImpl();
            Naming.rebind("ADD", cl);
            System.out.println("Server Siap...");
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
    }

    public static void main(String[] args) throws Exception {
        new Server();
    }
}
