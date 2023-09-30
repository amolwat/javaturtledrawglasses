
    public class Pedro implements Runnable {
       
        // public Pedro() {
        // }

        @Override
        public void run() {
            Turtle pedro = new Turtle(1180,200);
            pedro.penColor("lightcoral");
            pedro.width(25);
            pedro.speed(1);

            for(int i=0;i<5;i++)
        {
            pedro.left(145);
            pedro.forward(700);
            
            
        }

            
        
         
         
         

         
        }
    }