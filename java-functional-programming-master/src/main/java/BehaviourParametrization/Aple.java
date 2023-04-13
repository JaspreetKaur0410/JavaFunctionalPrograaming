package BehaviourParametrization;

public class Aple {
    private String name;
    private int weight;
    private String color;
    public String getName() {
        return name;
    }

    public Aple(String name, int weight, String color){
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
