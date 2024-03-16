public class Animals {
    void eat(){
        System.out.println("Eating variaties");
    }
}
class man extends Animals{
    void eat(){
    System.out.println("I eat specific foods");
}
void created(){
    System.out.println("I have a spirit");
}
void Animal(){
    super.eat();
    created();
}
}

class testhem{
    public static void main(String[] args) {
        man me = new man();
        me.Animal();

    }
}