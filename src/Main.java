public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("doga", "Arnold", Size.BIG, "fasd");
        Dog dog2 = new Dog("doggy", "Max", Size.SMALL, "kgniu");

        Rose rose = new Rose("rose", 100, 10, 5.5);
        Farm farm = new Farm("FF");

        System.out.println(farm.addAnimal(dog));
        System.out.println(farm.addAnimal(dog2));
        System.out.println(farm.addFlower(rose));

        farm.printFarm("flower");
        farm.printFarm("Animal");
    }
}