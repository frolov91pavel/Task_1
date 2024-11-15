public class Parent {
    private String name;

    // Статический блок 1
    static {
        System.out.println("Parent:static 1");
    }

    // Нестатический блок 1
    {
        System.out.println("Parent:instance 1");
    }

    // Статический блок 2
    static {
        System.out.println("Parent:static 2");
    }

    // Конструктор без параметров
    public Parent() {
        System.out.println("Parent:constructor");
    }

    // Нестатический блок 2
    {
        System.out.println("Parent:static 2");
    }

    // Конструктор с параметром Name
    public Parent(String name) {
        System.out.println("Parent:name-constructor");
    }
}
