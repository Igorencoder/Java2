package DZ1;

public class App {
    public static void main(String[] args) {
        Human human = new Human();
        Robot robot = new Robot();
        Cat cat = new Cat(15);

        Jump[] jump = new Jump[] {human, cat, robot};
        Run[] run = new Run[] {human, cat, robot};

        for (Jump jumpee: jump) {
            jumpee.jump();
        }
        for (Run runee: run) {
            runee.run();
        }
    }

}
