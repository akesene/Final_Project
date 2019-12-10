package Code.simpleOutput;

import java.io.IOException;

/**
 * Created by: Tom Lauwers
 * Date: 10/15/2010
 * Simple program to have the Finch do a dance
 */

import edu.cmu.ri.createlab.terk.robot.finch.Finch;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Dance
{


   public static void main(final String[] args) throws
           UnsupportedAudioFileException, IOException,
           LineUnavailableException, NullPointerException {

	  // Instantiating the Finch object
      Finch myFinch = new Finch();


//       RecurseDance rec1 = new RecurseDance();
//        rec1.fib(10);

      
      // Instantiating the audio object
       audio player  = new audio();

//       System.out.println(player.getClip());
       System.out.print(player.getCurrentFrame());
       // intializing variable for  iteration

       int i = 0;

      while (i <= 20) {
          player.play();

           // move the finch backward.
            myFinch.setLED(24,55,90);
            System.out.println(" hello your finch is working and moving backward");
            myFinch.setWheelVelocities(-120, -120, 1000);
            // move forward
            myFinch.setLED(255, 35,89);
            System.out.println("hello finch is moving forward");
            myFinch.setWheelVelocities(120,120,1000);

            myFinch.saySomething("Time to do a little dance!");
            // Set LED green, and move forward full speed for one second
            myFinch.setLED(0, 255, 0);
            myFinch.setWheelVelocities(255,255,1000);
            // Set LED yellow and turn for a half second
            myFinch.setLED(255, 255, 0);
            myFinch.setWheelVelocities(-180,180,500);
            // Set LED Red and back up for a second
            myFinch.setLED(255, 0, 0);
            myFinch.setWheelVelocities(-255,-255,1000);
            // Set LED magenta and turn for a half second
            myFinch.setLED(255, 0, 255);
            myFinch.setWheelVelocities(180,-180,500);
            // Set LED blue and move forward for a second
            myFinch.setLED(0, 0, 255);
            myFinch.setWheelVelocities(255,255,1000);

          i++;

      }
       myFinch.quit();
       System.exit(0);
      }
}
//
//    public class RecurseDance {
//
//
//        public RecurseDance() {
//
//        }
//
//        public long fib(int n) {
//            if (n <= 1)
//                return n;
//            return fib(n - 1) + fib(n - 2);
//        }
//
//    }







