package Fruits;

import java.util.ArrayList;

public class FruitBox <Orange, Fruit, Apple>{

    protected int size;
    protected Object fruit;
    protected double fruitWeight;
    protected double boxWeight;
    protected double FRUITWEIGHT = 1;
    protected ArrayList<Fruit> fruitBoxList;

    public FruitBox() {
        this.size = 0;
        this.fruitWeight = FRUITWEIGHT;
        this.boxWeight = this.size * this.fruitWeight;
        this.fruit = new Fruitbox.Fruit(FRUITWEIGHT); 
    }


    protected class Fruit {
        protected double weight;
        public Fruit(double weight) {
            this.weight = weight;
        }

        public double getWeight() {
            return weight;
        }
    }

    public Object getFruit() { return this.fruit; }

    public int getSize() { return this.size; }

    public ArrayList<Fruit> getFruitBoxList() { return fruitBoxList;}

    public double getBoxWeight() { return this.boxWeight; }

    public void addFruitToBox (int fruitQuantity, ArrayList Box, Object b) {
        for (int i = 0; i < fruitQuantity; i++) {
            Box.add(b); }
            this.size = Box.size();
            this.boxWeight = this.size * this.fruitWeight;
            this.fruitBoxList = Box;
    }

    public void emptyTheBox () {
        ArrayList Box = this.fruitBoxList;
        Box.clear();
        this.size = Box.size();
        this.boxWeight = this.size * this.fruitWeight;
    }

   public void boxToBox (FruitBox Acceptor) {
        if (!Acceptor.fruitBoxList.isEmpty()) {
            System.out.println("The Box is not empty");
            return; }
        else if (!this.getClass().equals(Acceptor.getClass())) {
           System.out.println("The box cannot be used for these fruits, please try right box !");
           return;}
        else
            { Acceptor.boxWeight = this.boxWeight;
            for (int i = 0; i < this.fruitBoxList.size(); i++) {
            Acceptor.fruitBoxList.add(this.fruitBoxList.get(i)); }
            Acceptor.size = Acceptor.fruitBoxList.size();
            this.fruitBoxList.clear();
            this.size = 0;}
    }

    public boolean compareWith (FruitBox G) {
        double weight = this.boxWeight;
        double otherWeight = G.getBoxWeight();
        return weight == otherWeight;
    }





}
