public class Child extends Parent {

    // Статический блок 1
    static {
        System.out.println("Child:static 1");
    }

    // Нестатический блок 1
    {
        System.out.println("Child:instance 1");
    }

    // Статический блок 2
    static {
        System.out.println("Child:static 2");
    }

    // Конструктор без параметров
    public Child() {
        super(); // Необязательно, компилятор вызовет конструктор Parent() автоматически
        System.out.println("Child:constructor");
    }

    // Конструктор с параметром Name
    public Child(String name) {
        super(name); // Вызываем конструктор Parent(String name)
        System.out.println("Child:name-constructor");
    }

    // Нестатический блок 2
    {
        System.out.println("Child:instance 2");
    }
}