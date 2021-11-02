public class Human {
    public void aadFoodTo (Plate plate, int food) {
        System.out.println("Человек кидает еды в миску");
        plate.increaseFood(food);
    }
}
