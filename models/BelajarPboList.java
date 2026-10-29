package models;

import java.util.ArrayList;
import util.PrintUtil;

public class BelajarPboList<T extends Box> extends ArrayList<T> {
    public void printList() {
        PrintUtil.printList(this);
    }

    public void printListSorted() {
        PrintUtil.printListSorted(this);
    }
}