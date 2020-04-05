package Client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ecouteur4 implements ActionListener {
    addihm ihm;
    public Ecouteur4(addihm ihm){this.ihm=ihm;}

    public void actionPerformed(ActionEvent e) {
        try {
            if(e.getSource()==ihm.savebutton)
            {

                if((ihm.student_id.getText().length()==8) &&(ihm.nom.getText().length()>=1) && (ihm.prenom.getText().length()>=1) && (ihm.phone.getText().length()==8))
                {
                    ihm.out.println("insert");
                    ihm.out.println(ihm.student_id.getText());
                    String verif_not_exist=ihm.serverinput.readLine();
                    if(verif_not_exist.equals("oui"))
                    {
                        String student_id=ihm.student_id.getText();
                        String nom=ihm.nom.getText();
                        String prenom=ihm.prenom.getText();
                        String phone=ihm.phone.getText();
                        String email=ihm.email.getText();
                        String filiere=ihm.filiere.getText();
                        String niveau=ihm.niveau.getText();
                        String option=ihm.option.getText();
                        String prof=ihm.prof.getText();
                        String text="INSERT into student (student_id,nom,prenom,phone,email,filiere,niveau,option_nom,prof) VALUES ('"+student_id+"','"+nom+"','"+prenom+"','"+phone+"','"+email+"','"+filiere+"','"+niveau+"','"+option+"','"+prof+"')";
                        ihm.out.println(text);
                        String reponse=ihm.serverinput.readLine();
                        if (reponse.equals("yes"))
                        {
                            Msgihm gui1=new Msgihm();
                            ihm.setVisible(false);
                        }
                        else
                        {
                            Msgihm2 gui2=new Msgihm2();
                        }

                    }
                    else
                    {
                        ihm.filedmsg.setText("           This student already exists");
                    }
                }
                else
                {
                    Msgihm2 gui2=new Msgihm2();

                }
                ihm.student_id.setText("");
                ihm.nom.setText("");
                ihm.prenom.setText("");
                ihm.phone.setText("");
                ihm.email.setText("");
                ihm.filiere.setText("");
                ihm.niveau.setText("");
                ihm.option.setText("");
                ihm.prof.setText("");

            }



        }catch (Exception excep)
        {
            System.out.println("Exception detected in ecouteur 4 "+excep);
        }

    }
}
