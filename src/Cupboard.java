public class Cupboard extends Furniture {

    private int height; //visota
    private int deep; //glubina

    public Cupboard(String name, String stuff, String color, String producer, int price, int vc, int height, int deep) {
        super(name, stuff, color, producer, price, vc);
        this.height = height;
        this.deep = deep;
    }
    //get
    public int getHeight() {return height;}
    public int getDeep() {return deep;}
    //set
    public void setHeight(int height) {this.height = height;}
    public void setDeep(int deep) {this.deep = deep;}
}
