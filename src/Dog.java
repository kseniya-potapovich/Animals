public class Dog extends Animal {
    @Override
    public void voice() {
        System.out.println("Gav gav gav");
    }

    @Override
    public void eat(String food) {
        if (food == "Meat") {
            System.out.println("It's so good! Thank you!");
        } else {
            System.out.println("Ok, I like to eat all food");
        }
    }
}
