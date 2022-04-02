package DZ1.task22;

public class App {

    public static void main(String[] args) {
        Cat cat = new Cat(25);
        Robot robot = new Robot(10);
        Human human = new Human(38);
        Wall wall = new Wall(15);

       // представим, что может перепрыгнуть, только если вес кошки больше веса стены
        if (cat.getWeight() - wall.getC() > 0) {
            System.out.println( "managed to jump");
        } else {
            System.out.println("Didn't manage to jump");
        }
        if (human.getWeight() - wall.getC() > 0) {
            System.out.println( "managed to jump");
        } else {
            System.out.println("Didn't manage to jump");
        }

        if (robot.getWeight() - wall.getC() > 0) {
            System.out.println( "managed to jump");
        } else {
            System.out.println("Didn't manage to jump");
        }

    } }


