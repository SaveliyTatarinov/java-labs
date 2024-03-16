package laba2.Example8;

public class Bird extends Animal {
    private String typeOfFood;
    private boolean canFly;

    public Bird(String name, int age, boolean wild, String typeOfFood, boolean canFly) {
        super(name, age, wild);
        this.typeOfFood = typeOfFood;
        this.canFly = canFly;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }

    public boolean isCanFly() {
        return canFly;
    }
    // не стал добавлять set canFly, по идее если не умела летать, то и не будет

    public void fly() {
        if (canFly) {
            System.out.println("Птица полетела");
        } else {
            System.out.println("Птица не умеет летать(");
        }
    }
}