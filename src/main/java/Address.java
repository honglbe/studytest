import java.net.InetAddress;
import java.net.UnknownHostException;

public class Address {
    public static void main(String[] args) {
        InetAddress ip;
        try{
            ip = InetAddress.getLocalHost();
            String localHostName = ip.getHostName();
            String localIp = ip.getHostAddress();
            System.out.println("本机名：" + localHostName);
            System.out.println("本机IP：" + localIp);
        }catch (UnknownHostException e){
            e.printStackTrace();
        }
    }
}
