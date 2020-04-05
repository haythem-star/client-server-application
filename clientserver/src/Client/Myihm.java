package Client;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Myihm extends JFrame {
    public Socket client;
    public PrintWriter out;
    public BufferedReader serverinput;
    public JPanel rootpannel;
    public JTextField insatStudent;
    public JLabel label1;
    public JLabel label2;
    public JLabel label3;
    public JLabel label4;
    public JLabel label5;
    public JButton addButton;
    public JTextField textField1;
    public JButton searchButton;
    public JLabel label6;
    public JLabel labelerror1;


    public Myihm(Socket client, PrintWriter out, BufferedReader serverinput)
    {
        this.client=client;
        this.out=out;
        this.serverinput=serverinput;
        add(rootpannel);
        setTitle("testihm");
        setSize(600,400);
        Ecouteur e=new Ecouteur(this);
        searchButton.addActionListener(e);
        addButton.addActionListener(e);

    }

}
