import java.util.ArrayList;

public class Farm {
    private String name;
    private ArrayList<Animal> list;
    private ArrayList<Flower> list2;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Animal> getList() {
        return list;
    }

    public void setList(ArrayList<Animal> list) {
        this.list = list;
    }

    public Farm(String name) {
        this.name = name;
        this.list = new ArrayList<>();
        this.list2 = new ArrayList<>();
    }

    public boolean addAnimal(Animal animal){
        if (list.add(animal)){
            return true;
        }else {
            return false;
        }
    }

    public boolean addFlower(Flower flower){
        if (list2.add(flower)){
            return true;
        }else{
            return false;
        }
    }

    public void printFarm(){
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        for (int j = 0; j < list2.size(); j++){
            System.out.println(list2.get(j));
        }
    }

    @Override
    public String toString() {
        return "Farm{" +
                "name='" + name + '\'' +
                ", list=" + list +
                '}';
    }
}
