package Fruits;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)  {

        AppleBox Box2 = new AppleBox();
        OrangeBox Box1 = new OrangeBox();
        AppleBox Box3 = new AppleBox();
        OrangeBox Box4 = new OrangeBox();

        Box1.addFruitToBox(10,Box1.getFruitBoxList(), Box1.getFruit()); // добавим апельсны в ящик
        System.out.println(Box1.getSize()); // проверим все ли на месте
        System.out.println(Box1.getBoxWeight()); // взвесим коробку
        System.out.println(Box1.getFruitBoxList().get(8)); // проверим, точно ли это апельсины

        Box1.addFruitToBox(10, Box1.getFruitBoxList(), Box1.getFruit()); // добавим еще 10 штук

        Box2.addFruitToBox(15,Box2.getFruitBoxList(),Box2.getFruit()); // наполним коробку с яблоками
        System.out.println(Box2.getSize()); // проверим число
        System.out.println(Box2.getBoxWeight()); // проверим вес
        System.out.println(Box2.getFruitBoxList().get(2)); // яблоки ли это ?
        System.out.println("Lets compare 2 boxes");
        System.out.println(Box1.compareWith(Box2)); // сравним 2 коробки по весу, равны ли они
        Box2.boxToBox(Box3); // пересыпим яблоки в другую коробку
        System.out.println("Box3 weight is " + Box3.getBoxWeight() + " kg" );
        Box1.boxToBox(Box2); // попробуем пересыпать апельсины в коробку для яюлок. Ничего не выйдет
        Box1.boxToBox(Box4); // используем правильные коробки, тогда норм.

        System.out.println("in the box 4 we have " + Box4.getSize() + " oranges");
        System.out.println(Box1.getSize());

        System.out.println(Box4.getBoxWeight());
        Box4.emptyTheBox(); // Просто опустошим коробку
        System.out.println(Box4.getBoxWeight());


    }



}
