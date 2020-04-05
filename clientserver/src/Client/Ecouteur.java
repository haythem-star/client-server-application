package Client;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class Ecouteur implements ActionListener {
    Myihm ihm;

    public Ecouteur(Myihm ihm) {
        this.ihm = ihm;
    }

    public void actionPerformed(ActionEvent e) {
        try {

            if (e.getSource() == ihm.searchButton) {
                ihm.textField1.setBackground(Color.white);
                ihm.labelerror1.setText("");
                ihm.out.println("search");
                ihm.out.println(ihm.textField1.getText());
                int exist = Integer.parseInt(ihm.serverinput.readLine());
                if(exist==1)
                {
                    Vector v=new Vector();
                    v.add(ihm.serverinput.readLine());
                    v.add(ihm.serverinput.readLine());
                    v.add(ihm.serverinput.readLine());
                    v.add(ihm.serverinput.readLine());
                    v.add(ihm.serverinput.readLine());
                    v.add(ihm.serverinput.readLine());
                    v.add(ihm.serverinput.readLine());
                    v.add(ihm.serverinput.readLine());
                    Myihm2 ihm2=new Myihm2(v,ihm.client,ihm.out,ihm.serverinput, ihm.textField1.getText());



                }
                else {


                    ihm.textField1.setBackground(Color.red);
                    ihm.labelerror1.setText("on n'a pas trouvé un etudient avec cette id");
                }

                ihm.textField1.setText("");


            }
            if (e.getSource() == ihm.addButton) {
                ihm.textField1.setBackground(Color.white);
                ihm.labelerror1.setText("");
                ihm.out.println("teacher");
                ihm.out.println(ihm.textField1.getText());
                int exist = Integer.parseInt(ihm.serverinput.readLine());
                if(exist==1)
                {
                    String teacher=ihm.serverinput.readLine();

                    addihm ihm2=new addihm(teacher,ihm.client,ihm.out,ihm.serverinput);



                }
                else {


                    ihm.textField1.setBackground(Color.red);
                    ihm.labelerror1.setText("You must be a teacher to Add");
                }

                ihm.textField1.setText("");


            }

        }catch (Exception ex)
        {
            System.out.println("Exception detected in Ecouteur "+ex);
        }
    }
}
