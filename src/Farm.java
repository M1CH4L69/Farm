import java.util.ArrayList;

public class Farm {
    private String name;
    private ArrayList<Animal> list;


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
    }

    public boolean addAnimal(Animal animal){
        if (list.add(animal)){
            return true;
        }else {
            return false;
        }
    }

    public void printFarm(){
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
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
