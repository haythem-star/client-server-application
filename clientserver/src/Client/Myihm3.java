package Client;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Vector;

public class Myihm3 extends JFrame {
    Socket client;
    PrintWriter out;
    BufferedReader serverinput;

    private JLabel phone_icon;
    private JLabel email_icon;
    private JLabel filiere_icon;
    private JLabel niveau_icon;
    private JLabel option_icon;
    public JButton phone_button;
    public JButton email_button;
    public JButton filiere_button;
    public JButton niveau_button;
    public JButton option_button;
    public JButton prof_button;
    private JPanel student_info;
    private JPanel panel1;
    public JButton nom_button;
    public JButton prenom_button;
    private JLabel imagelabel;
    private JPanel imgepnel;
    private JPanel nom_prenom_panel;
    private JPanel panel0;
    private JPanel phone_panel;
    private JPanel phonepanel1;
    private JPanel phone_panel2;
    private JPanel email_panel;
    private JPanel email_panel1;
    private JPanel email_panel2;
    private JPanel filiere_panel;
    private JPanel filiere_panel1;
    private JPanel filiere_panel2;
    private JPanel niveau_panel;
    private JPanel niveau_panel1;
    private JPanel niveau_panel2;
    private JPanel option_panel;
    private JPanel option_panel1;
    private JPanel option_panel2;
    private JPanel prof_panel;
    private JPanel prof_panel1;
    private JPanel prof_panel2;
    public JTextField newvaluetextfield;
    private JPanel newvalue_panel;
    private JLabel newvaluelabel;
    private JPanel newvaluepanel2;
    public JTextField student_id;
    private JLabel student_id_label;
    public JTextField nouveau=new JTextField();
    public JButton save=new JButton("save");
    public ImageIcon photo_profil =new ImageIcon(getClass().getResource("man-icon.png"));
    public ImageIcon photo_phone =new ImageIcon(getClass().getResource("Phone-icon.png"));
    public ImageIcon photo_mail =new ImageIcon(getClass().getResource("Mail-icon.png"));
    public ImageIcon photo_filiere =new ImageIcon(getClass().getResource("filiere-icon.png"));
    public ImageIcon photo_niveau =new ImageIcon(getClass().getResource("niveau-icon.png"));
    public ImageIcon photo_option =new ImageIcon(getClass().getResource("Options-icon.png"));

    public Myihm3(Vector v, Socket client, PrintWriter out, BufferedReader serverinput)
    {
        this.client=client;
        this.out=out;
        this.serverinput=serverinput;
        imagelabel.setIcon(photo_profil);
        phone_icon.setIcon(photo_phone);
        email_icon.setIcon(photo_mail);
        filiere_icon.setIcon(photo_filiere);
        niveau_icon.setIcon(photo_niveau);
        option_icon.setIcon(photo_option);
        nom_button.setText((String) v.get(0));
        prenom_button.setText((String)v.get(1));
        phone_button.setText((String)v.get(2));
        email_button.setText((String)v.get(3));
        filiere_button.setText((String)v.get(4));
        niveau_button.setText((String)v.get(5));
        option_button.setText((String)v.get(6));
        prof_button.setText((String)v.get(7));
        add(student_info);
        setTitle("updating file");
        setSize(600,500);
        setVisible(true);
        Ecouteur3 e3=new Ecouteur3(this);
        nom_button.addActionListener(e3);
        prenom_button.addActionListener(e3);
        phone_button.addActionListener(e3);
        email_button.addActionListener(e3);
        filiere_button.addActionListener(e3);
        niveau_button.addActionListener(e3);
        option_button.addActionListener(e3);
        prof_button.addActionListener(e3);




    }
}
