public class Animal{
    String color = "white";
}
    class dog extends Animal{
        String color = "black";
        void printcolor(){
            System.out.println(super.color);
            System.out.println(color);
        }
    }

    class testsuper{
        public static void main(String[] args) {
            dog mydog = new dog();
            mydog.printcolor();
        }
    }
