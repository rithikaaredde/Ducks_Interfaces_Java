// Duck.java

public abstract class Duck
{
    protected FlyBehaviour flyBehaviour;
    protected SwimBehavior swimBehavior;

    public Duck() {}

    public void performFly()
    {
        flyBehaviour.fly();
    }

    public void performSwim()
    {
        swimBehavior.swim();
    }

    public abstract void display();
}
