
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class actionHandler implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        //System.out.println("Action is created ");
        switch (ae.getActionCommand()){
            
            //CASE 1 :  
            case "Create New Invoice":
                System.out.println("Create New Invoice");
                //fun();
                break;
            case "Delete Invoice":
                System.out.println("Delete Invoice");
                break;
            case "Save":
                System.out.println("Save");
                break;
            case "Cancel":
                System.out.println("Cancel");
                break;
            case "Load File" :
                System.out.println("Load File");
                break;
            case "Save File" :
                System.out.println("Save File");
                break;
                  
                
        }
    
    }
    
}
