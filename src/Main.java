public class Main {
    public static void main(String[] args) {
        Animal a1, a2, a3;
        a1 = new Animal();
        a1.eat();
        a2 = new Monkey();
        a2.eat();
        a3 = new BabyMonkey();
        a3.eat();
    }
}
