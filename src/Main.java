public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Ship ship = new Ship();

        SwimExecutor executor = new SwimExecutor();

        executor.toSwim(fish);
        System.out.println();
        executor.toSwim(ship);
    }
}