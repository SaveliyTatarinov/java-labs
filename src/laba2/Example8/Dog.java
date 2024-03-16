package laba2.Example8;

public class Dog extends Animal{
    private String breed;
    private String favoriteToy;

    public Dog(String name, int age, boolean wild, String breed, String favoriteToy) {
        super(name, age, wild);
        this.breed = breed;
        this.favoriteToy = favoriteToy;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public void setFavoriteToy(String favoriteToy) {
        this.favoriteToy = favoriteToy;
    }

}
