package ua.medvid;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(112);
        myList.add(1333);
        myList.add(92);

        MyListModify<String> MyListModify = new MyListModify<>();
        MyListModify.add("300");
        MyListModify.add("3443");
        MyListModify.add("asd");


        System.out.println("List - 1 Min = " + myList.getMin());
        System.out.println("List - 1 Max = " + myList.getMax());

        System.out.println("List - 2 Min = " + MyListModify.getMin());
        System.out.println("List - 2 Max = " + MyListModify.getMax());
    }
}
