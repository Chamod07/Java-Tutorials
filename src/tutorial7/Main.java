package tutorial7;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Chamod", "w2051922");
        Student student2 = new Student("Alex", "w2051933");
        Student student3 = new Student("John", "w2052022");
        Student student4 = new Student("Peter", "w2051192");

        Module module1 = new Module("4COS008", 25, 25);
        Module module2 = new Module("4COS009", 75, 30);
        Module module3 = new Module("4COS010", 92, 100);

        student1.addModule(module1);
        student1.addModule(module2);
        student1.addModule(module3);

        student2.addModule(module2);
        student2.addModule(module3);

        student4.addModule(module1);

        student4.addModule(module1);

        student1.showPass();
        student2.showPass();
        student3.showPass();
        student4.showPass();
    }
}
