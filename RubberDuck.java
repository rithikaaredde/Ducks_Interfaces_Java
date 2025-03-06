// RubberDuck.java

public class RubberDuck extends Duck
{
    public RubberDuck() {
        flyBehaviour = new NotFly();
        swimBehavior = new Float();
    }

    @Override
    public void display()
    {
        System.out.println("I am a Rubber Duck.");
    }
}
