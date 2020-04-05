package Client;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ecouteur2 implements ActionListener {
    Myihm2 ihm;
    public Ecouteur2(Myihm2 ihm){this.ihm=ihm;}
    public void actionPerformed(ActionEvent e)
    {
        try {
            if (e.getSource()==ihm.updateButton)
            {
                Myihm3 gui=new Myihm3(ihm.v,ihm.client,ihm.out,ihm.serverinput);
                ihm.setVisible(false);




            }
            if(e.getSource()==ihm.deleteButton)
            {
                ihm.out.println("update");
                String text="delete from student where student_id = "+ihm.student_id;
                ihm.out.println(text);
                String reponse=ihm.serverinput.readLine();
                if (reponse.equals("yes"))
                {
                    Msgihm msg =new Msgihm();
                    ihm.setVisible(false);
                }
                else
                {
                    Msgihm2 msg=new Msgihm2();
                }
            }




        }catch (Exception exe)
        {
            System.out.println("Exception detected "+exe);
        }
    }
}
