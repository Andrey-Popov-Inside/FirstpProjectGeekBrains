public class Cat extends Animals {

    public Cat(float maxRunDistance)
    {
        super(maxRunDistance, Integer.MIN_VALUE);
    }

    @Override
    public void swimOn(float requiredDistance)
    {
        System.out.println("Кошки плавать не умеют!\n");
    }
}

