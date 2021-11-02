public class CatOne {

    private boolean isFull;
    private int appetite;
    private String name;
    private Human host;

    public CatOne(int appetite, String name, Human host)
    {
        isFull = false;
        this.appetite = appetite;
        this.name = name;
        this.host = host;
    }

    public void eat(Plate plate)
    {
        if (plate.hasEnoughFoodFor(appetite) && !isFull)
        {
            System.out.println(name + " хавает.");
            plate.decreaseFood(appetite);
            isFull = true;
        }
        else if (!plate.hasEnoughFoodFor(appetite))
        {
            System.out.println(name + " впадает в бешенство,ведь провизии совршенно не хватает!");
            host.aadFoodTo(plate, appetite);
        }
        else if (isFull)
        {
            System.out.println("У " + name + " в животе хавчика хватает !");
        }
    }
}

