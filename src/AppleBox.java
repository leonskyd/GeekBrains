package Fruits;

import java.util.ArrayList;

public class AppleBox extends FruitBox{

    final private double FRUITWEIGHT = 1.0;
    private Object fruit;


    public AppleBox() {
        this.fruitBoxList = new ArrayList<Apple>();
        super.size = 0;
        this.fruitWeight = FRUITWEIGHT;
        this.boxWeight = this.size * this.fruitWeight;
        fruit = new Apple(FRUITWEIGHT);
    }

    public class Apple {

        private double weight;
        public Apple(double weight) { this.weight = weight; }
        }
}
