public class Rabbit extends Animal {
    @Override
    public void voice() {
        System.out.println("*Rumbling*");
    }

    @Override
    public void eat(String food) {
        if (food == "Grass") {
            System.out.println("It's so delicious!");
        } else {
            System.out.println("Ew, I don't like that(");
        }
    }
}
