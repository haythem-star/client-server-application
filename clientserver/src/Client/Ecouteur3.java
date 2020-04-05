package Client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ecouteur3 implements ActionListener {
    Myihm3 ihm;
    public Ecouteur3(Myihm3 ihm){this.ihm=ihm;}
    public void actionPerformed(ActionEvent e)
    {
        try {
            String a_change="";
            if (e.getSource()==ihm.nom_button)
            {
                a_change="nom";
            }
            if(e.getSource()==ihm.prenom_button)
            {
                a_change="prenom";
            }
            if(e.getSource()==ihm.phone_button)
            {
                a_change="phone";
            }
            if(e.getSource()==ihm.email_button)
            {
                a_change="email";
            }
            if(e.getSource()==ihm.filiere_button)
            {
                a_change="filiere";
            }
            if(e.getSource()==ihm.niveau_button)
            {
                a_change="niveau";
            }
            if(e.getSource()==ihm.option_button)
            {
                a_change="option_nom";
            }
            if(e.getSource()==ihm.prof_button)
            {
                a_change="prof";
            }
            ihm.out.println("update");
            String text="UPDATE student SET "+ a_change+" = '"+ihm.newvaluetextfield.getText()+"' WHERE student_id = "+ihm.student_id.getText();
            ihm.out.println(text);
            String reponse=ihm.serverinput.readLine();
            if (reponse.equals("yes"))
            {
                Msgihm msg =new Msgihm();
            }
            else
            {
                Msgihm2 msg=new Msgihm2();
            }
            ihm.setVisible(false);

        }catch (Exception exc)
        {
            System.out.println("Exception detected "+exc);
        }

    }
}
