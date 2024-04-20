
import java.util.ArrayList;
import java.util.List;

public class Main{

    public static void main(String[] args){
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Bird("Кеша","Вовка"));
        animals.add(new Duck("Дафи","Дак"));
        animals.add(new Fish("Немо","Фишман"));
        animals.add(new Cat("Тыгыдык","Баюн"));
        animals.add(new Turtle("Тортилла","Бабуля"));

        for (Animal a: animals) a.toGo();
        System.out.println();

        for (Animal a: animals) a.fly();
        System.out.println();

        for (Animal a: animals) a.swim();
        System.out.println();
    }
}
