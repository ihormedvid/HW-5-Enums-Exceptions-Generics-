package ua.medvid;

import java.util.ArrayList;
import java.util.Collections;

public class MyList2 <T extends Comparable<T>> {

    private ArrayList<T> myList2;

    public MyList2() {
        this.myList2 = new ArrayList<>();
    }

    public void add(T elem) {
        myList2.add(elem);
    }

    public T getMax(){
        return Collections.max(myList2);
    }

    public T getMin(){
        return Collections.min(myList2);
    }
}
