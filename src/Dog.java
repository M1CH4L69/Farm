public class Dog extends Animal{

    public Dog(String type, String name, Size size, String specialCare) {
        super(type, name, size, specialCare);
    }
    @Override
    public String toString() {
        return "Dog{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", specialCare='" + specialCare + '\'' +
                '}';
    }
}
