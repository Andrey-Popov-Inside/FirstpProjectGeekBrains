public class LessonSeven {

    public static void main(String[] args)
    {
        Human host = new Human();
        CatOne[] cats = {
                new CatOne(8, "Ляля",host),
                new CatOne(3, "Тинки-Винки",host),
                new CatOne(14, "По",host)
        };

        Plate plate = new Plate(26);
        plate.showInfo();

        for (CatOne cat : cats)
        {
            cat.eat(plate);
            plate.showInfo();
        }



        for (CatOne cat : cats)
        {
            cat.eat(plate);
            plate.showInfo();
        }
    }
}

