
    public class Billy implements Runnable {
       
        // public Billy() {
        // }
        @Override
        public void run() {
            Turtle billy = new Turtle(100,150);
            billy.penColor("lightcoral");
            billy.width(25);
            billy.speed(1);
            // for(int i=0;i<360;i++)
            // {
            //     billy.forward(8);
            //     billy.left(1);
            // }

            for(int i=0;i<360;i++){
                billy.forward(i/5);
                billy.left(10);
            }
        }

    

    }