package Main;
import java.util.Scanner;

import javax.swing.JButton;

import Inputs.ButtonInputs;

import java.awt.Color;


public class HomePage {
    private Scanner keyboard = new Scanner(System.in);
    private GameWindow window;
    private GamePanel panel;
    JButton gamePageButton;
    JButton leaderBoardPageButton;

    

    public HomePage (GameWindow window, GamePanel panel, ButtonInputs buttonInputs) {
        this.window = window;
        this.panel = panel;
        panel.requestFocus();
        setUpButtons(buttonInputs);
    }
    private void setUpButtons (ButtonInputs buttonInputs) {
        Button buttonFormat = new Button();
        //x,y,width,height,textInButton,textColour,backgroundColour,visible
        JButton gamePageButton = buttonFormat.setButton(50,250,200,200,"Games",Color.RED,Color.BLACK,true);
        JButton leaderBoardPageButton = buttonFormat.setButton(300,250,200,200,"Leaderboard",Color.RED,Color.BLACK,true);
        buttonInputs.addButtonToList(gamePageButton);
        buttonInputs.addButtonToList(leaderBoardPageButton);

        panel.add(gamePageButton);
        panel.add(leaderBoardPageButton);
        panel.repaint();

    }
   
}
