public class RectArea {
    int length;
    int width;
    void insert(int L, int W){
        this.length=L;
        this.width=W;
    }
    void displayArea(){
        System.out.println(length*width);
    }
    public static void main(String[] args) {
        RectArea firstrec= new RectArea();
        firstrec.insert(12,2);
        firstrec.displayArea();

    }
}
