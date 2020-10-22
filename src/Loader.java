import java.util.ArrayList;
import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//приветствие
        System.out.print("Введите сумму Ваше имя: ");
        String buyer = in.nextLine();
        System.out.println("Добро пожаловать," + buyer + "\n");
        System.out.print("Введите сумму Ваших денег: ");
        int money = in.nextInt();
//создание каталога
        //столы
        Desk desk1 = new Desk("Клёвый стол", "Дуб", "Тёмный", "Россия", 10000, 1, 1, 1, 1);
        Desk desk2 = new Desk("Стол из ИКЕИ", "Фанера", "Белый", "Китай", 500, 2, 1, 1, 1);
        //кровати
        Bed bed1 = new Bed("Супер удобная кровать", "Дуб бунратти", "Светлый", "Германия", 30000, 3, 1, 2, 1);
        Bed bed2 = new Bed("Норм кровать", "Берёза", "Белый", "Россия", 20000, 4, 2, 2, 2);
        //шкафы
        Cupboard cupboard1 = new Cupboard("Шкаф-купе Изабель", "Тёмный дуб", "Черный", "Америка", 100000, 5, 4, 5);
        Cupboard cupboard2 = new Cupboard("Угловой шкаф Том Нук", "Золото", "Блестящий", "остров Аврора", 4987, 6, 2, 4);

        ArrayList<Furniture> catalog = new ArrayList<>();
        catalog.add(desk1);
        catalog.add(desk2);
        catalog.add(bed1);
        catalog.add(bed2);
        catalog.add(cupboard1);
        catalog.add(cupboard2);

//        System.out.println(catalog.size());

//первый вывод каталога
        Shop.printCatalog(catalog);
//первый вывод команд
        Shop.showCommand();
        ArrayList<Furniture> basket = new ArrayList<>();
        while (true) {
            int command = in.nextInt();
            if (command == 1) { //добавить в корзину
                System.out.print("Введите артикул товара который хотите добавить в корзину: ");
                int numbProduct = in.nextInt() - 1;
                Shop.getBas(catalog, basket, numbProduct);
            } else if (command == 2) { //убрать из корзины
                System.out.println("Введите артикул товара который хотите убрать из корзины: ");
                int numbProduct = in.nextInt();
                Shop.delBas(basket, numbProduct, catalog);
            } else if (command == 3) {
                Shop.printBasket(basket);
                System.out.println("\n" + "Общая стоимость:" + Shop.getSum());
            } else if (command == 4) {
                Shop.printCatalog(catalog);
            } else if (command == 5) {
                Shop.showCommand();
            } else if (command == 6) {
                if (!basket.isEmpty()) {
                    System.out.println("Стоимость всех товаров из Вашей корзины составляет: " + Shop.getSum());
                    Shop.buy(basket, money);
                }
                else {
                    System.out.println("Выход");
                }
                break;
            }
            else {
                System.out.print("Вы неверно ввели команду. Список команд: ");
            }
        }
    }
}

