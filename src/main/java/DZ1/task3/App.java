package DZ1.task3;

public class App {

    public static void main(String[] args) {
        Elephant el = new Elephant();
        Dog dog = new Dog();


        PassanObstacle[] passe= {el,dog};


        for (PassanObstacle pass: passe) {
        Obstacle1.help();
    }
} }
