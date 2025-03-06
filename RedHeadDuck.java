// RedHeadDuck.java

public class RedHeadDuck extends Duck
{
    public RedHeadDuck()
    {
        flyBehaviour = new Fly();
        swimBehavior = new Swim();
    }

    @Override
    public void display()
    {
        System.out.println("I am a Red Head Duck.");
    }
}
