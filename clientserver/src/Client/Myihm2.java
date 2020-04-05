package Client;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Vector;

public class Myihm2 extends JFrame {
    String student_id;
    Socket client;
    PrintWriter out;
    BufferedReader serverinput;
    Vector v;
    private JPanel student_info;
    public JButton updateButton;
    public JButton deleteButton;
    public JLabel imagelabel;
    private JLabel nom;
    private JLabel prenom;
    private JPanel panel1;
    private JPanel pannel0;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    private JPanel panel6;
    private JPanel panel7;
    private JPanel buttonpanel;
    private JLabel phone_student;
    private JLabel phone_icone;
    private JLabel email_student;
    private JLabel email_icone;
    private JLabel filiere_student;
    private JLabel filiere_icone;
    private JLabel niveau_student;
    private JLabel niveau_icone;
    private JLabel option_student;
    private JLabel option_icone;
    private JLabel enseignant;
    private JLabel prof;
    private JLabel option;
    private JLabel niveau;
    private JLabel filiere;
    private JLabel email;
    private JLabel phone;
    private JPanel phonepanel1;
    private JPanel phonepanel2;
    private JPanel emailpanel1;
    private JPanel emailpanel2;
    private JPanel filierepanel1;
    private JPanel filierepanel2;
    private JPanel niveaupanel1;
    private JPanel niveaupanel2;
    private JPanel optionpanel1;
    private JPanel optionpanel2;
    private JPanel profpanel1;
    private JPanel profpanel2;




    public ImageIcon photo_profil =new ImageIcon(getClass().getResource("man-icon.png"));
    public ImageIcon photo_phone =new ImageIcon(getClass().getResource("Phone-icon.png"));
    public ImageIcon photo_mail =new ImageIcon(getClass().getResource("Mail-icon.png"));
    public ImageIcon photo_filiere =new ImageIcon(getClass().getResource("filiere-icon.png"));
    public ImageIcon photo_niveau =new ImageIcon(getClass().getResource("niveau-icon.png"));
    public ImageIcon photo_option =new ImageIcon(getClass().getResource("Options-icon.png"));


    public Myihm2(Vector v,Socket client,PrintWriter out,BufferedReader serverinput,String student_id)
    {
        imagelabel.setIcon(photo_profil);
        phone_icone.setIcon(photo_phone);
        email_icone.setIcon(photo_mail);
        filiere_icone.setIcon(photo_filiere);
        niveau_icone.setIcon(photo_niveau);
        option_icone.setIcon(photo_option);
        this.student_id=student_id;
        this.v=v;
        this.client=client;
        this.out=out;
        this.serverinput=serverinput;
        nom.setText((String) v.get(0));
        prenom.setText((String)v.get(1));
        phone.setText((String)v.get(2));
        email.setText((String)v.get(3));
        filiere.setText((String)v.get(4));
        niveau.setText((String)v.get(5));
        option.setText((String)v.get(6));
        prof.setText((String)v.get(7));
        add(student_info);
        setTitle("student file");
        setSize(400,500);
        setVisible(true);
        Ecouteur2 e2=new Ecouteur2(this);
        updateButton.addActionListener(e2);
        deleteButton.addActionListener(e2);



    }
}
