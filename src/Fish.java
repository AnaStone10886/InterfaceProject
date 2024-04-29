public class Fish implements Swimable{
    @Override
    public void swim() {
        eat();
        System.out.println("I ate and goes to swim");
    }

    private void eat(){
        System.out.println("I'm a fish and I eat");
    }
}
