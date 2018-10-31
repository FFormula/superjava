package ru.otus.volosatov.l01;

import com.google.common.collect.Lists;

import java.util.List;

public class Main {

    List<Integer> list;

    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }

    private void start()
    {
        createList();
        addItems((int)(Math.random() * 100000 + 100000));
        printFirstItems(20);
        inverseList();
        printFirstItems(10);
    }

    private void createList()
    {
        list = Lists.newArrayList();
    }

    private void addItems(int count)
    {
        for (int j = 0; j < count; j ++)
            list.add(j);
    }

    private void inverseList()
    {
        list = Lists.reverse(list);
    }

    private void printFirstItems (int count)
    {
        int j = 0;
        for (Integer item : list) {
            System.out.print(item + " ");
            if (++j >= count) break;
        }
        System.out.println();
    }
}
