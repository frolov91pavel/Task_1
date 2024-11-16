
public class Main {
    public static void main(String[] args) {

        System.out.println("Создание объекта Child без параметров");
        Child child = new Child();

        System.out.println("Создание объекта Child с параметром");
        Child child2 = new Child("Ivan");
    }
}