package DZ1;

public class Cat implements Jump, Run {
    int weight;

    public Cat(int weight) {
        this.weight = weight;
    }

    @Override
    public void jump() {
        System.out.println("Cat can jump");
    }

    @Override
    public void run() {
        System.out.println("Cat can run");
    }
}
