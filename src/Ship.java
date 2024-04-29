public class Ship implements Swimable{
    @Override
    public void swim() {
        fuel();
        System.out.println("I got fuel and can go");
    }

    private void fuel() {
        System.out.println("I'm a ship and I need fuel");
    }
}
