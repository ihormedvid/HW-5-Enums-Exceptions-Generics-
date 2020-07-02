package ua.medvid;

import java.util.ArrayList;

public class MyList <T extends Number> {
    private ArrayList<T> myList;

    public MyList() {
        this.myList = new ArrayList<>();;
    }

    public void add(T elem) {
        myList.add(elem);
    }

    public T getMin() {
        T min = myList.get(0);
        for (T elem : myList) {
            if (elem.doubleValue() < min.doubleValue()) {
                min = elem;
            }
        }
        return min;
    }

    public T getMax(){
        T max = myList.get(0);
        for (T elem : myList) {
            if (elem.doubleValue() > max.doubleValue()) {
                max = elem;
            }
        }
        return max;
    }
}
