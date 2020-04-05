package Client;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;

public class addihm extends JFrame {
    Socket client;
    PrintWriter out;
    BufferedReader serverinput;
   public JButton savebutton;
    private JPanel welcomepanel;
    private JLabel welcomelabel;
    private JLabel nom_prof;
    private JLabel msg;
    private JLabel required;
    private JPanel requiredpanel;
    private JPanel msgpanel;
    private JPanel idpanel;
    private JLabel student_idlabel;
    private JPanel nomprenom;
    private JPanel nompanel;
    private JPanel prenompanel;
    private JLabel nomlabel;
    private JLabel prenomlabel;
    private JLabel phonelabel;
    private JPanel phonepanel;
    private JPanel emailpanel;
    private JPanel filiereniveau;
    private JPanel filierepanel;
    private JPanel niveaupanel;
    private JLabel filierelabel;
    private JLabel niveaulabel;
    private JPanel optioprof;
    private JLabel optionlabel;
    private JLabel proflabel;
    private JPanel rootpanel;
    private JPanel filedpanel;
    public JLabel filedmsg;
    private JPanel savepanel;
    private JPanel profpanel;
    private JPanel optionpanel;
    public JTextField student_id;
    public JTextField nom;
    public JTextField prenom;
    public JTextField phone;
    public JTextField email;
    public JTextField filiere;
    public JTextField niveau;
    public JTextField option;
    public JTextField prof;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    private JPanel panel6;

    public addihm(String nom_prof,Socket client,PrintWriter out,BufferedReader serverinput)
    {
        this.nom_prof.setText(nom_prof);
        add(rootpanel);
        setTitle("formula");
        student_id.setText("");
        nom.setText("");
        prenom.setText("");
        phone.setText("");
        email.setText("");
        filiere.setText("");
        niveau.setText("");
        option.setText("");
        prof.setText("");
        this.client=client;
        this.out=out;
        this.serverinput=serverinput;
        setSize(500,400);
        setVisible(true);
        Ecouteur4 e=new Ecouteur4(this);
        savebutton.addActionListener(e);


    }
}
