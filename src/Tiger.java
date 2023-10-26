public class Tiger extends Animal {
    @Override
    public void voice() {
        System.out.println("*Roar*");
    }

    @Override
    public void eat(String food) {
        if (food == "Meat") {
            System.out.println("Mmmm, Yummy!");
        } else {
            System.out.println("Be, give me some meat");
        }
    }
}
