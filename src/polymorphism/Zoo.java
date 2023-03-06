package polymorphism;

public class Zoo {
    public static void main(String[] args) {
        // Inheritance
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);

        // Polymorphism
        Animal sasha = new Dog();
        sasha.makeSound();
        boolean isDog = sasha instanceof Animal;
        System.out.println(isDog);

        // Ex
        sasha = new Cat();
        sasha.makeSound();

        // typecasting
        // sasha is still of ttype animal above
        ((Cat)sasha).scratch();

        feed(sasha);



    }


    // Example of instanceOf operator
    public static void feed(Animal animal){
        if(animal instanceof Dog){
            System.out.println("Enjoy your dog food");
        }
        else if(animal instanceof Cat){
            System.out.println("Enjoy your cat food");
        }
    }
}
