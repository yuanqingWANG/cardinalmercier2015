package tp8;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class test {
	
	public static void main(String[] args) throws UnknownHostException  {
		
		InetAddress[] googleAddressList=InetAddress.getAllByName("www.google.com");
        
		for(InetAddress add:googleAddressList)
        
			System.out.println("ip address:"+add.getHostAddress()+" HostName:"+add.getHostName()+"CanonicalHostname:"+add.getCanonicalHostName());
	
	}

}
