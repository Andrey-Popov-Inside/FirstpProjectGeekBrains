public class LessonSix {
    public static void main(String[] args)
    {
        AnimalСounting factory = new AnimalСounting();

        Cat cat = factory.newCat(200);
        Dog dog = factory.newDog(500, 10);

        cat.runOn(50);
        cat.swimOn(3);

        dog.runOn(300);
        dog.swimOn(5);

        System.out.println("Животных создано всего: " + factory.getAnimalsCount());
        System.out.println("Собак создано всего: " + factory.getDogsCount());
        System.out.println("Кошек создано всего: " + factory.getCatsCount());
    }
}
