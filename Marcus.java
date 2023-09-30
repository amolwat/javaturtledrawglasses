public class Marcus implements Runnable {
       
        
     @Override
    public void run() {
        Turtle marcus = new Turtle(1000,1000);
        marcus.penColor("lightcoral");
        marcus.width(25);
        marcus.speed(1);
        

        for(int i=0;i<5;i++){
            marcus.left(145);
            marcus.forward(500);
        }

        

            
        
         
         
         

         
        }
    }
