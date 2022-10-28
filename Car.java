import java.util.*;
public class Car implements Comparable<Car>{
    private String carNumber;
    private int timeRide = -1;
    private final int finalSpeed = 200;
    private final int startingSpeed = 0;

    @Override
    public int compareTo(Car p) {
        return this.timeToRide() - p.timeToRide();
    }
    public int timeToRide() {
        if (timeRide == -1) {
            timeRide = (finalSpeed - startingSpeed)/randomSpeed();
            return timeRide;
        } else {
            return timeRide;
        }
    }
    public Car (String carNumber) {
        this.carNumber = carNumber;
    }
    private int randomSpeed () {
        return (int) (Math.random() * ((30 - 10) + 1)) + 10;
    }

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        Car carOne = new Car("Number 1");
        Car carTwo = new Car("Number 2");
        Car carThree = new Car("Number 3");
        Car carFour = new Car("Number 4");
        Car carFive = new Car("Number 5");

        List<Car> carlist = new ArrayList<>();
        carlist.add(new Car("Number 1"));
        carlist.add(new Car("Number 2"));
        carlist.add(new Car("Number 3"));
        carlist.add(new Car("Number 4"));
        carlist.add(new Car("Number 5"));

        for (Car item:carlist) {                                                //start
            System.out.println(item.carNumber);
        }

        System.out.println();
        System.out.println("1. Нажмите старт");



        Collections.sort(carlist);

        int change = scanner.nextInt();
        if(change == 1) {
            for (Car item:carlist) {                                                //finish
                System.out.println(item.carNumber + " Время "
                        + item.timeToRide() + " секунд");
            }
        }
    }
}