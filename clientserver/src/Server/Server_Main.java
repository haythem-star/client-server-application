package Server;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;
import java.sql.*;

public class Server_Main {

    public static void main(String[] args) {
        Statement statement;
        Connection conn;


        try {
            System.out.println("waiting for client ...");
            ServerSocket ss = new ServerSocket(4966);
            Socket client=ss.accept();
            PrintWriter out =new PrintWriter(client.getOutputStream(),true);
            System.out.println("connection established");
            BufferedReader clientinput =new BufferedReader(new InputStreamReader(client.getInputStream()));
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_info?useTimezone=true&serverTimezone=UTC", "root", "");
            statement = conn.createStatement();
            String ordre=clientinput.readLine();
            while (ordre != null) {
                if(ordre.equals("search")) {
                    String student_id = clientinput.readLine();
                    String sql = "SELECT * from student where student_id = " + student_id;
                    ResultSet results = statement.executeQuery(sql);
                    if (results.next()) {
                        out.println(1);
                        String nom = results.getString("nom");
                        out.println(nom);
                        String prenom = results.getString("prenom");
                        out.println(prenom);
                        String phone = results.getString("phone");
                        out.println(phone);
                        String email = results.getString("email");
                        out.println(email);
                        String filiere = results.getString("filiere");
                        out.println(filiere);
                        int niveau = results.getInt("niveau");
                        out.println(niveau);
                        String option = results.getString("option_nom");
                        out.println(option);
                        String prof = results.getString("prof");
                        out.println(prof);
                    } else {
                        out.println(0);
                    }
                    if (results != null) {
                        results.close();
                    }
                }
                else if(ordre.equals("update"))
                {
                    String update_statement=clientinput.readLine();
                    update(update_statement,statement,out);

                }
                else if(ordre.equals("teacher"))
                {
                    String prof_id = clientinput.readLine();
                    String sql2 = "SELECT * from enseignant where enseignant_id = " + prof_id;
                    ResultSet results = statement.executeQuery(sql2);
                    if (results.next()) {
                        out.println(1);
                        String nom_prof = results.getString("nom");
                        out.println(nom_prof);
                    }
                    else
                    {
                        out.println(0);
                    }

                }
                else if (ordre.equals("insert"))
                {
                    String student_id = clientinput.readLine();
                    String sql = "SELECT * from student where student_id = " + student_id;
                    ResultSet results = statement.executeQuery(sql);
                    if (results.next()) {
                        out.println("non");
                    }
                    else
                    {
                        out.println("oui");
                        String update_statement=clientinput.readLine();
                        update(update_statement,statement,out);

                    }

                }
                ordre=clientinput.readLine();

            }
            if (statement != null) {
                statement.close();
            }

            conn.close();



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void update(String text,Statement st,PrintWriter out)
    {
        try {
        
            st.executeUpdate(text);
            
                out.println("yes");
            
        }catch (Exception ex)
        {
            System.out.println("Exception detected "+ex);
            out.println("non");
        }


    }


}
