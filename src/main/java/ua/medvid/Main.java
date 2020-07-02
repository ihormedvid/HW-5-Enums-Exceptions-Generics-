package ua.medvid;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(112);
        myList.add(1333);
        myList.add(92);

        MyList2<String> myList2 = new MyList2<>();
        myList2.add("300");
        myList2.add("3443");
        myList2.add("asd");


        System.out.println("List - 1 Min = " + myList.getMin());
        System.out.println("List - 1 Max = " + myList.getMax());

        System.out.println("List - 2 Min = " + myList2.getMin());
        System.out.println("List - 2 Max = " + myList2.getMax());
    }
}
