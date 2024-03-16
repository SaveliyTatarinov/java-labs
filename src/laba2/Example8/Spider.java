package laba2.Example8;

public class Spider extends Animal{
    private String typeOfPattern;
    private boolean venomous;

    public Spider(String name, int age, boolean wild, String typeOfPattern, boolean venomous) {
        super(name, age, wild);
        this.typeOfPattern = typeOfPattern;
        this.venomous = venomous;
    }

    public String getTypeOfPattern() {
        return typeOfPattern;
    }
    public void setTypeOfPattern(String typeOfPattern) {
        this.typeOfPattern = typeOfPattern;
    }

    public boolean isVenomous() {
        return venomous;
    }
    // не стал добавлять set, по идее если не был ядовитым, то и не будет

    public void spiderMan() {
        if (venomous) {
            System.out.println("Вас укусили, вы теперь человек-паук (на пару минут)");
        } else {
            System.out.println("Вы спасены, но вы не человек-паук(");
        }
    }
}