package Inputs;
import Main.Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

public class ButtonInputs implements ActionListener{

    private Login login;

    ArrayList <JButton> buttonArray = new ArrayList<JButton>();
    int buttonIndex = 0;
    public ButtonInputs (Login login) {
        this.login = login;

    }
    public void addButtonToList (JButton tempButton) {

        buttonArray.add(tempButton);
        buttonArray.get(buttonIndex).addActionListener(this);
        buttonIndex++;

    }
    //button 0 = create account button
    //button 1 = games button
    //button 2 = leaderboard button
    @Override
    public void actionPerformed(ActionEvent e) {
        
            if (e.getSource() == buttonArray.get(0)) {
                System.out.println("moo");
                createAccountButtonPressed();
            }
            else if (e.getSource() == buttonArray.get(1)) {
                System.out.println("baa");
            }
            else if(e.getSource() == buttonArray.get(2)) {
                System.out.println("quack");
            }
        
    }
    public void createAccountButtonPressed () {
        login.createAccount();
    }
}
