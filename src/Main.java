public class Main {
    public static void main(String[] args) {
        checkName("Anton");
        checkName("Denis");
        checkName("Kirill");
    }
    public static void checkName(String name1) {
        if(name1 == "Anton" || name1 == "Denis") {
            System.out.println("Go out");
        }
        else {
            System.out.println("Welcome!");
        }
    }
}