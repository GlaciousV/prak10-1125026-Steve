package controllers;

import java.util.*;

import models.BelajarPboList;
import models.Box;
import util.PrintUtil;
import views.ObjectView;

public class ObjectController {
    private ObjectView view;

    public ObjectController() {
        view = new ObjectView();
    }

    public void start() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(400);
        numbers.add(20);
        numbers.add(1000);

        List<Box> boxMahasiswaList = new ArrayList<>();
        boxMahasiswaList.add(new Box("Ferioss", 1125024));
        boxMahasiswaList.add(new Box("Ferio", 1125064));
        boxMahasiswaList.add(new Box("Ferios", 1124078));

        view.displayMessage("Printable list:");
        PrintUtil.printPrintableList(boxMahasiswaList);

        view.displayMessage("list numbers:");
        PrintUtil.printList(numbers);

        Integer[] numberArray = {40, 15, 250};

        view.displayMessage("Array:");
        PrintUtil.printList(numberArray);



        view.displayMessage("sort list:");
        PrintUtil.printListSorted(numbers);

        view.displayMessage("list sebelum d sort:");
        PrintUtil.printList(numbers);

        view.displayMessage("print sort array:");
        PrintUtil.printListSorted(numberArray);

        view.displayMessage("array sebelum d sort:");
        PrintUtil.printList(numberArray);

        BelajarPboList<Box> myList = new BelajarPboList<>();
        myList.add(new Box("Ferio1", 1125003));
        myList.add(new Box("Ferio2", 1125001));
        myList.add(new Box("Ferio3", 1125002));

        view.displayMessage("BelajarPboList:");
        myList.printList();

        view.displayMessage("BelajarPboList sorted (nim):");
        myList.printListSorted();

        view.displayMessage("BelajarPboList sebelum d sort:");
        myList.printList();
    }
}