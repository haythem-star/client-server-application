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
       /* String text="on n'a pas trouvé un etudient avec cette id";
        String nom,prenom,phone,email,prof,option,filiere;
        int niveau;

       try {
           System.out.println("client started");

           Socket client = new Socket("localhost", 4966);
           BufferedReader userinput=new BufferedReader(new InputStreamReader(System.in));
           System.out.println("donner un id");
           String student_id=userinput.readLine();
           PrintWriter out=new PrintWriter(client.getOutputStream(),true);
           out.println(student_id);
           BufferedReader serverinput=new BufferedReader(new InputStreamReader(client.getInputStream()));
           int exist=Integer.parseInt(serverinput.readLine());
           if(exist==1)
           {
               nom=serverinput.readLine();
               prenom=serverinput.readLine();
               phone=serverinput.readLine();
               email=serverinput.readLine();
               filiere=serverinput.readLine();
               niveau=Integer.parseInt(serverinput.readLine());
               option=serverinput.readLine();
               prof=serverinput.readLine();
               text=" nom : "+nom + "\n prénom : "+prenom+"\n phone "+phone+"\n email : "+email+"\n filiere : "+filiere+" niveau "+niveau+"\n option_nom : "+option+"\n prof : "+prof;

           }
           System.out.println(text);

           System.out.println("do you want to update something(y/n) ");
           String verif=userinput.readLine();
           if (verif.equals("y"))
           {
               out.println("update");
               System.out.println("what you want to change");
               String a_change=userinput.readLine();
               System.out.println("new value : ");
               String nouveau=userinput.readLine();
               update(client,out,serverinput,a_change,nouveau,student_id);
           }
           else
           {
               out.println("fin");
           }






       }catch (Exception e){
           System.out.println("Exception detected "+e);
       }
    }

    public static void update(Socket client,PrintWriter out,BufferedReader serverinput,String a_change,String nouveau,String student_id)
    {
       try {
           String text="UPDATE student SET "+ a_change+" = '"+nouveau+"' WHERE student_id = "+student_id;
        out.println(text);
        System.out.println(serverinput.readLine());


       }catch (Exception ex)
       {
           System.out.println("Exception detected "+ex);
       }


    }
    public static   void delete(String student_id,PrintWriter out,BufferedReader serverinput)
    {
        try {
            String text="DELETE FROM student WHERE student_id = "+student_id;
            out.println(text);
            System.out.println(serverinput.readLine());


        }catch (Exception ex)
        {
            System.out.println("Exception detected "+ex);
        }*/
    }



}
