package Code.simpleOutput;

import edu.cmu.ri.createlab.terk.robot.finch.Finch;

public class recursiveDance {

    public static void main(String[] args) {
        Finch akFinch = new Finch();
        //
        if(!akFinch.isBeakDown()) {
            akFinch.setWheelVelocities(-180, -180, 2000);
            akFinch.setWheelVelocities(180,180,2000);
            // call fib method and print out the sequence
            System.out.println(fib(40));
            akFinch.setWheelVelocities(180,180,2000);
            akFinch.setLED(20,100,34);
            akFinch.setWheelVelocities(-180, -180, 2000);
            // call fib method and print out the sequence
            System.out.println(fib(20));
            akFinch.setWheelVelocities(-180, -180, 2000);
            akFinch.setWheelVelocities(180,180,2000);
            // call fib method and print out the sequence
            System.out.println(fib(10));
        }
        System.exit(0);
    }

    //  defining fib method

    public   static long fib(int n) {
        if (n <= 1)
        return n;
        else {
            return fib(n - 1) + fib(n - 2);
        }
        }
}
