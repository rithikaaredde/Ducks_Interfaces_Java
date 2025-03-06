// MallardDuck.java

public class MallardDuck extends Duck
{
    public MallardDuck()
    {
        flyBehaviour = new Fly();
        swimBehavior = new Swim();
    }

    @Override
    public void display()
    {
        System.out.println("I am a Mallard Duck.");
    }
}
