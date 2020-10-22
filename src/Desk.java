public class Desk extends Furniture {
    private int height; //visota
    private int width; //shirina
    private int length; //dlina

    Desk(String name, String stuff, String color, String producer, int price, int vc, int height, int width, int length){
        super(name, stuff, color, producer, price, vc);
        this.height = height;
        this.length = length;
        this.width = width;
    }
//get
    public int getHeight() {return height;}
    public int getLength() {return length;}
    public int getWidth() {return width;}
//set
    public void setHeight(int height) {this.height = height;}
    public void setLength(int length) {this.length = length;}
    public void setWidth(int width) {this.width = width; }

    @Override
    public String toString() {
        return "Высота = " + height + " " +
                "Ширина = " + width + " " +
                "Длина = " + length + "\n";
    }
}
