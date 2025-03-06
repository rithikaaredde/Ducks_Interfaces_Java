// ModelDuck.java

public class ModelDuck extends Duck
{
    public ModelDuck() {
        flyBehaviour = new NotFly();
        swimBehavior = new Swim();
    }

    @Override
    public void display() 
    {
        System.out.println("I am a Model Duck.");
    }
}
