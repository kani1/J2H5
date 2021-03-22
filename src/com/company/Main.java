package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> A = new ArrayList<>(5);
        ArrayList<String> B = new ArrayList<>(5);
        ArrayList<String> C = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        do {

            A.add(scanner.nextLine());
            if (A.size() >= 5) {
                break;
            }
        } while (A.size() < 5);
        {
            print(A);
        }

        do {

            B.add(scanner.nextLine());
            if (B.size() > 5) {
                break;
            }
        } while (B.size() < 5);
        {
            print(B);
        }

        Collections.reverse(B);
        int i = 0;
        while (C.size() <= 9) {
            C.add(A.get(i));
            C.add(B.get(i));
            i++;
        }
        print(C);


        C.sort(Comparator.comparing(String::length));
        print(C);

}
    public static void print(ArrayList<?> list) {
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

}