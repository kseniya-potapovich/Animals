public class Main {
    public static void main(String[] args) {
       // Animal dog = new Dog();
        Animal tiger = new Tiger();
        Animal rabbit = new Rabbit();
        System.out.println("Собака говорит: ");
        Dog.getDog().voice();

       // dog.voice();
       // dog.eat("Apple");
        tiger.voice();
        tiger.eat("Milk");
        rabbit.voice();
        rabbit.eat("Grass");
    }
}
