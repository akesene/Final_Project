package Code.simpleOutput;


import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

import edu.cmu.ri.createlab.terk.robot.finch.Finch;

class FinchGUI implements ActionListener {


    Finch  myFinch = new Finch();
    JFrame AkFrame = new JFrame("Ak && Group FInch");
    JPanel Raspberryfinch = new JPanel(new GridLayout(3,3));

    JButton Forward = new JButton("Move Forward");
    JButton BackWard = new JButton("Move Backward");
    JButton readfile = new JButton("Readfile");
    JButton Stop = new JButton("Stop");




    JButton left = new JButton(" Move left");
    JButton right = new JButton( "Move right");


    public FinchGUI() {

        AkFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        AkFrame.setSize(400,400);
        AkFrame.setBackground(Color.BLUE);
        Forward.setOpaque(true);
        Forward.setBackground(new Color(24,250,255));
        Forward.setHorizontalAlignment(JLabel.CENTER);



        Forward.addActionListener(this);
        BackWard.addActionListener(this);
        Stop.addActionListener(this);
        left.addActionListener(this);
        right.addActionListener(this);
        readfile.addActionListener(this);

        Raspberryfinch.add(Forward);
        Raspberryfinch.add(BackWard);
        Raspberryfinch.add(Stop);
        Raspberryfinch.add(left);
        Raspberryfinch.add(right);
        Raspberryfinch.add(readfile);


        AkFrame.setContentPane(Raspberryfinch);
        AkFrame.setVisible(true);
        AkFrame.pack();
    }

    public void actionPerformed(ActionEvent e) {


         if (e.getSource() == Forward) {
            for(int i = 0;  i < 5; i++){
                makeMoveChoice(1);
            }
//            SwitchCase(1);
        }
        else if (e.getSource() == BackWard) {
             for(int i = 0 ; i < 5; i++) {
                 makeMoveChoice(2);
            }
//            SwitchCase(2);
        }
        else if (e.getSource() == Stop) {
             makeMoveChoice(5);
        }

        else if (e.getSource() == left){
             makeMoveChoice(3);
        }

        else if (e.getSource() == right){

             makeMoveChoice(4);

        }

        else if( e.getSource() == readfile){
            makeMoveChoice(6);
         }

    }


    public void makeMoveChoice(int choice)  {
        switch (choice) {
            case 1: {
                myFinch.setLED(0, 255, 255);
                myFinch.setWheelVelocities(255,255,3000);
                break;
            }

            case 2: {
                myFinch.setLED(0, 0, 255);
                myFinch.setWheelVelocities(-255,-255,3000);
                break;
            }

            case 3:  {
                myFinch.setLED(0, 255, 0);
                myFinch.setWheelVelocities(0,255,3000);
                break;

            }

            case 4: {
                myFinch.setLED(255, 255, 34);
                myFinch.setWheelVelocities(255,0,3000);

                break;
            }

            case 5: {
                myFinch.stopWheels();
                break;
            }

            case 6: {
                myFinch.setWheelVelocities(255, 255, 1000);
                readingFile myread = new readingFile();
                try {
                    myread.readnow();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            }

        }


    }


    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        new FinchGUI();
        audio myaudio = new audio();
        myaudio.play();


    }
}