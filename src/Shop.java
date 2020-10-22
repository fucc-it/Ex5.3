import java.util.ArrayList;

public class Shop {
    static int sum = 0;
    static int count = 0;

    public static void showCommand (){
        //список команд
        System.out.print(" Список команд: Добавить в корзину - 1"+"\n"+
                "Убрать из корзины - 2"+"\n"+
                "Показать вашу корзину - 3"+"\n"+
                "Показать каталог ещё раз? - 4"+"\n"+
                "Показать список команд? - 5"+"\n"+
                "Выход/оплата - 6"+"\n"+
                "Ваша команда: ");
    }

    static void printCatalog(ArrayList<Furniture> catalog) {
        for (int i = 0; i < catalog.size(); i++) {
            System.out.println(catalog.get(i).getVendorСode() + " " + catalog.get(i).getName() + " " + catalog.get(i).getPrice() + "руб.");
        }
    }

    static void getBas(ArrayList<Furniture> catalog, ArrayList<Furniture> basket, int vendorСode) {
        basket.add(catalog.get(vendorСode));
        System.out.println("Товар " + basket.get(count).getName() + " добавлен в корзину!");
        sum += basket.get(count).getPrice();
        ++count;
    }

    static void delBas(ArrayList<Furniture> basket, int numbProduct, ArrayList<Furniture> catalog) {
        if (!basket.isEmpty()) {
            System.out.println("Товар " + catalog.get(numbProduct).getName() + " удалён из корзины!");
            for (int i = 0; i < basket.size(); i++) {
                if (catalog.get(numbProduct).getName() == basket.get(i).getName()) {
                    sum -= basket.get(numbProduct).getPrice();
                    basket.remove(numbProduct);
                    --count;
                }
            }

        } else {
            System.out.println("Корзина пуста");
            ;
        }
    }
    static void printBasket(ArrayList<Furniture> basket) {
        if (!basket.isEmpty()) {
            for (int i = 0; i < basket.size(); i++) {
                System.out.println(basket.get(i).getVendorСode() + " " + basket.get(i).getName() + " " + basket.get(i).getPrice() + "руб.");
            }
        }
        else System.out.println("Корзина пуста");
    }


        static void buy(ArrayList<Furniture> basket,int amountOfMoney){
            if(amountOfMoney >= sum){
                amountOfMoney -= sum;
                System.out.println("Вы успешно совершили транзакция." + "\n" + " Остаток средств: " + amountOfMoney);
            }
            else {
                System.out.println("На вашем счёте недостаточно средств для совершения покупки. ");
            }
        }

        static int getSum(){
            return sum;
        }
}

