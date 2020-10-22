public abstract class Furniture {
    private String stuff;
    private int vendorСode;
    private String color;
    private int price;
    private String producer;
    private String name;


    public Furniture(String name, String stuff, String color, String producer, int price, int vc){
        this.stuff = stuff;
        this.color = color;
        vendorСode = vc;
        this.name = name;
        this.price = price;
        this.producer = producer;
    }

    //гетры
    public String getColor() {return color;}
    public String getStuff() {return stuff;}
    public String getName() {return name;}
    public int getPrice() {return price;}
    public int getVendorСode() {return vendorСode;}
    public String getProducer() {return producer;}
//set

    public void setStuff(String stuff) {this.stuff = stuff;}
    public void setName(String name) {this.name = name;}
    public void setColor(String color) {this.color = color;}
    public void setPrice(int price) {this.price = price;}
    public void setProducer(String producer) {this.producer = producer;}
    public void setVendorСode(int vendorСode) {this.vendorСode = vendorСode;}

    @Override
    public String toString() {
        return "Наименование: " + name + " " +
                "Материал: " + stuff + " " +
                "Цвет: " + color + " " +
                "Страна изготовителя: " + producer + " " +
                "Цена:" + price + " " +
                "Артикул: " + vendorСode + "\n";
    }

}
