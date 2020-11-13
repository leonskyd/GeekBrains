package Company;

import Lists.Stacklist;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Personnel personnel1 = new Personnel("Nick Shaw", "branch director",
                "nick.shaw@altop.eu", "+44 844 4 737373", 7800, 47 );
        Personnel personnel2 = new Personnel("Yousouf Mashid", "design specialist",
                "yousouf.mashid@altop.eu", "+44 844 4 737350", 5300,35);
        Personnel personnel3 = new Personnel("Mikhail Selin", "cost control manager",
                "mikhail.selin@altop.eu", "+44 844 4 737348", 5500, 30);
        Personnel personnel4 = new Personnel("Deniz Hikmet", "contract specialist",
                "deniz.hikmet", "+44 844 4 737399", 5300, 28 );
        Personnel personnel5 = new Personnel("Hugh Marvin", "PR manager",
                "hugh.marvin@altop.eu", "+44 844 4 737355", 4800, 41);


        // 4.1 STACK
        Stack<Personnel> heads = new Stack<>();
        heads.add(personnel1);
        heads.add(personnel3);
        heads.add(personnel5);

        System.out.println(heads.peek());
        System.out.println(heads.pop());
        System.out.println(heads.pop());
        System.out.println(heads.isEmpty());
        System.out.println(heads.pop());
        System.out.println(heads.isEmpty());
        // 4.2 QUEUE
        Queue<Personnel> manager = new LinkedList<>();
        manager.add(personnel1);
        manager.add(personnel3);
        manager.add(personnel5);
        manager.add(new Personnel("Vivian Brandt", "PR manager", "v.brandt@altop.eu", "+44 844 4 737330", 5000, 27));
        System.out.println("\n now we are in queue");
        System.out.println(manager.peek());
        manager.poll();
        System.out.println("how many we are ?");

        while (!(manager.isEmpty())) {
            manager.poll().print();
        }
        System.out.println(manager.isEmpty());

        //4.3 DEQUE
        System.out.println("\n now we are in a Deque");
        Deque<Personnel> specialist = new ArrayDeque<>();

        specialist.add(personnel2);
        specialist.addFirst(personnel1);
        specialist.addLast(personnel4);
        specialist.add(new Personnel("Li Xing", "contract specialist",
                "li.xing@altop.eu", "+44 844 4 737382", 5300, 32));
        System.out.println(specialist.peekFirst());
        specialist.pollFirst();
        System.out.println(specialist.peekFirst());
        System.out.println(specialist.peekLast());

        System.out.println("specialists have moved to new office");
        while (!(specialist.isEmpty())) {
            specialist.poll().print();
        }

        System.out.println(specialist.isEmpty());

        // 4.5 STACKLIST
        System.out.println("\n Now we are in a stacklist");
        Stacklist Heads = new Stacklist();
        Heads.push("Nick Shaw", 47);
        Heads.push("Yousouf Masheed", 35);
        Heads.push("Mikhail Selin", 30);
        Heads.display();














       /* Personnel[] stuffArray = new Personnel[5];
        stuffArray[0] = personnel1;
        stuffArray[1] = personnel2;
        stuffArray[2] = personnel3;
        stuffArray[3] = personnel4;
        stuffArray[4] = personnel5;*/

        /*String[] heads = new String[] {"Nick Shaw", "Yousouf Mashid", "Mikhail Selin", "Deniz Hikmet", "Hugh Marvin"};

        List<String> headList = Arrays.asList(heads);// лист какого типа ?
        System.out.println(headList);


        ArrayList<String> arrayHeads = new ArrayList<>();
        arrayHeads.addAll(0,headList); // на всякий случай скопировал лист как arrayList

        System.out.println(arrayHeads);

        arrayHeads.add("Li Xing");
        arrayHeads.set(2,"Samuel Legrand");
        arrayHeads.remove(0);
        System.out.println(arrayHeads);

        if (arrayHeads.contains("Li Xing")) {
            System.out.println("Li Xing works here");
        }
        System.out.println(" ");

        /*personnel1.printPersonnel();
        personnel3.printPersonnel();

        System.out.println(Arrays.toString(stuffArray));

        Personnel.showExperience(40,  stuffArray);*/

        /*ArrayList<Personnel> stuffArrayObj = new ArrayList<>();// Создаю лист объектов из параллельного курса по Java Basic level

        stuffArrayObj.add(new Personnel("Nick Shaw", "branch director",
                "nick.shaw@altop.eu", "+44 844 4 737373", 7800, 47));
        stuffArrayObj.add(new Personnel("Yousouf Mashid", "design specialist",
                "yousouf.mashid@altop.eu", "+44 844 4 737350", 5300,35));
        stuffArrayObj.add(new Personnel("Mikhail Selin", "cost control manager",
                "mikhail.selin@altop.eu", "+44 844 4 737348", 5500, 30));
        stuffArrayObj.add(new Personnel("Deniz Hikmet", "contract specialist",
                "deniz.hikmet", "+44 844 4 737399", 5300, 28));
        stuffArrayObj.add(new Personnel("Hugh Marvin", "PR manager",
                "hugh.marvin@altop.eu", "+44 844 4 737355", 4800, 41));

        stuffArrayObj.set(2,new Personnel("Samuel Legrand", "cost control manager",
                "samuel.legrand@altop.eu","+44 844 4 737348", 5000,27 ));

        stuffArrayObj.get(0);
        for(Personnel number : stuffArrayObj) {
            number.print();
            System.out.println(number.getClass());
        }

        if (stuffArrayObj.contains("Nick Shaw")) {
            System.out.println("He is working here");
        }
        System.out.println("");

        /*LinkedList<Personnel> stuffObj = new LinkedList<>();
        stuffObj.addAll(0,stuffArrayObj); // Сделал копию в виде связанного листа

        stuffObj.add(new Personnel("Li Xing", "contract specialist",
                "li.xing@altop.eu", "+44 844 4 737382", 5300, 32));
        stuffArrayObj.remove(0);

        System.out.println("Now the company are: ");

        stuffObj.get(0);
        for(Personnel number : stuffObj) {
            number.print();
            System.out.println(number.getClass() + "\n");
        }

        Iterator<String> iter = arrayHeads.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next() + "\n");
            iter.remove();
        }

        ListIterator<Personnel> iterl = stuffObj.listIterator();


        /*while (iterl.hasNext()) {
            System.out.println(iterl.next() + "\n");
            iter.remove();
        }*/







    }




}
