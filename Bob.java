public class Bob implements Runnable {
    
    // public Bob() {
    // }
    @Override
    public void run() {
        Turtle bob = new Turtle(500,800);
        bob.penColor("lightcoral");
        bob.width(25);
        bob.speed(1);

        
        for(int i=0;i<5;i++)
        {
            bob.left(145);
            bob.forward(700);
            
            
        }
    }
}