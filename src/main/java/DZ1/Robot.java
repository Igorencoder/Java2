package DZ1;

public class Robot implements Jump, Run{
    @Override
    public void jump() {
        System.out.println("Robot can jump");
    }

    @Override
    public void run() {
        System.out.println("Robot can run");
    }
}
