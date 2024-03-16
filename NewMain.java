

public class NewMain{
int regNo;
String name;

void insert(int regNo, String name){
    this.regNo=regNo;
    this.name=name;
}
void result(){
    System.out.println(regNo + name);
}
public static void main(String[] args) {
    NewMain std1= new NewMain();
    std1.insert(100, " Joy");
    std1.result();
}
}
