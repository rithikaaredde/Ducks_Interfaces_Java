// DecoyDuck.java

public class DecoyDuck extends Duck
{
    public DecoyDuck() {
        flyBehaviour = new NotFly();
        swimBehavior = new Float();
    }

    @Override
    public void display() 
    {
        System.out.println("I am a Decoy Duck.");
    }
}
