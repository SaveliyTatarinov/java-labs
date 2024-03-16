package laba2.Example8;

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog("Коржик",5,false,"корги","мячик");
        Bird bird = new Bird("Чирик",10,true,"колбаска",true);
        Spider spider = new Spider("Альберт",2,true,"спираль",true);

        dog.makeSound();

        bird.makeSound();
        bird.fly();

        spider.makeSound();
        spider.spiderMan();
    }
}
