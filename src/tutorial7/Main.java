package tutorial7;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Chamod", "w2051922");
        System.out.println(student1.getName());
        student1.setName("Nigga");
        System.out.println(student1.getName());
        System.out.println(student1.getID());
        student1.setID("20231429");
        System.out.println(student1.getID());
    }
}
