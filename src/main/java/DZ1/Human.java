package DZ1;

public class Human implements Jump, Run{
    @Override
    public void jump() {
        System.out.println("Human can jump");
    }

    @Override
    public void run() {
        System.out.println("Human can run");
    }
}
