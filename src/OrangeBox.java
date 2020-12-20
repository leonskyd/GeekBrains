package Fruits;

import java.util.ArrayList;

public class OrangeBox extends FruitBox {

    final private double FRUITWEIGHT = 1.5;
    private Object fruit;

    public OrangeBox() {
        this.fruitBoxList = new ArrayList<Orange>();
        this.size = 0;
        this.fruitWeight = FRUITWEIGHT;
        this.boxWeight = this.size * this.fruitWeight;
        this.fruit = new Orange(FRUITWEIGHT);
    }

    public class Orange {
        private double weight;
        public Orange(double weight) {
            this.weight = weight;
        }
        }
    }







