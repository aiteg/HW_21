public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("Mew mew mother fucker");
            }
        };

        cat.makeSound();
    }
}