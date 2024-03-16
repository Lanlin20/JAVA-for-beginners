public class vehicles {
    void run(){
        System.out.println("Vehicle is running");
    }
}
    class Tuktuk extends vehicles{
        void run(){
            System.out.println("Tuktuk is fuel efficient");
        }
        public static void main(String[] args) {
            Tuktuk tuk = new Tuktuk();
            tuk.run();
        }
    }

