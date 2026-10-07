import java.net.*;

public class NetPackage {
    public static void main(String[] args) throws Exception {
        String host = "www.google.com";

        InetAddress address = InetAddress.getByName(host);

        System.out.println("Website: " + host);
        System.out.println("IP Address: " + address.getHostAddress());
    }
}
