
//This program helps you to understand how we use and access STATIC keyword and non-static feilds or members rerspectively
public class Static {
    static int a = 0; //NO1. Is to make the member field static using the keyword static in lower case.
    public static void main(String[] args) {
        int b= 20;
        System.out.println(b);
        Static object1 =new Static();
        System.out.println(object1.a); //N02. We create an object to refrence it to the non-static variable
    }

}
//Health practices for a Java programmer would chose to go with the keword static before the variable that using the refrence which would be advantagious if for example code maintainace was to be done.