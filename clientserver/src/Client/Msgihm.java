package Client;

import javax.swing.*;

public class Msgihm extends JFrame {
    private JPanel panel1;
    private JPanel vide1;
    private JPanel vide2;
    private JPanel msgpanel;
    private JLabel imagelabel;
    private JLabel msglabel;
    public ImageIcon image=new ImageIcon(getClass().getResource("Ok-icon.png"));

    public Msgihm()
    {
        msglabel.setIcon(image);
        add(panel1);
        setTitle("Resultat de l'opération");
        setSize(200,200);
        setVisible(true);

    }
}
