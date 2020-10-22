public class Bed extends Furniture {

    private int placesToSleep;
    private int width; //shirina
    private int length; //dlina


    public Bed(String name, String stuff, String color, String producer, int price, int vc, int width,int length, int placesToSleep ) {
        super(name, stuff, color, producer, price, vc);
        this.width = width;
        this.length = length;
        this.placesToSleep = placesToSleep;
    }
    //get

    public int getPlacesToSleep() {return placesToSleep;}
    public int getLength() {return length;}
    public int getWidth() {return width;}
    //set
    public void setLength(int length) {this.length = length;}
    public void setWidth(int width) {this.width = width; }
    public void setPlacesToSleep(int placesToSleep) {this.placesToSleep = placesToSleep;}
}
