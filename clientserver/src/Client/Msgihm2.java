package Client;

import javax.swing.*;

public class Msgihm2 extends JFrame {
    private JLabel imagelabel;
    private JLabel msglabel;
    private JPanel vide1;
    private JPanel vide2;
    private JPanel msgpanel;
    private JPanel panel1;

    public ImageIcon image=new ImageIcon(getClass().getResource("no-icon.png"));

    public Msgihm2()
    {
        msglabel.setIcon(image);
        add(panel1);
        setTitle("Resultat de l'opération");
        setSize(200,200);
        setVisible(true);

    }
}
