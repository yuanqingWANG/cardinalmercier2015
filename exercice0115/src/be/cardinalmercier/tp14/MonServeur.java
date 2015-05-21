package be.cardinalmercier.tp14;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MonServeur extends ServerSocket {
	private int numPort;
	private ArrayList<Socket> tabClient = new ArrayList<Socket>();
	public MonServeur() throws IOException {
		super(Param.numPort);
		this.numPort = Param.numPort;
	}
	
	public MonServeur(int numPort) throws IOException {
		super(numPort);
		this.numPort = numPort;
		System.out.println("**** Le serveur ecoute sur le port" + numPort);
		while(! this.isClosed()){
			tabClient.add(this.accept());
			System.out.println("**** Le serveur ecoute a resu un client");
		}
	}



    public static void main(String[] args) {
    	while(Param.numPort <= 65535){
    	   try {
			   MonServeur ms = new MonServeur(Param.numPort);
			   break;
	     	} catch (IOException e) {
		         	// TODO Auto-generated catch block
			        e.printStackTrace();
			        Param.numPort ++;
	     	}
    	}
    }
}