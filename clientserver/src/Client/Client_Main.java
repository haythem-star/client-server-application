package Client;
import java.net.Socket;
import java.io.*;

public class Client_Main {
    public static void main(String[] args)
    {
      try {
          System.out.println("client started");
          Socket client = new Socket("localhost", 4966);
          PrintWriter out=new PrintWriter(client.getOutputStream(),true);
          BufferedReader serverinput=new BufferedReader(new InputStreamReader(client.getInputStream()));


          Myihm ihm = new Myihm(client,out,serverinput);
          ihm.setVisible(true);
      }catch (Exception e)
      {
          System.out.println("Exception detected "+e);
      }
    
    }



}
