package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int size1;
        int[] arr1;
        int size2;
        int[] arr2;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập độ dài của mảng thứ nhất: ");
            size1 = scanner.nextInt();
            if (size1 > 20)
                System.out.println("Độ dài mảng không được quá 20");
        } while (size1 > 20);

        arr1 = new int[size1];
        int i = 0;
        while (i < arr1.length) {
            System.out.print("Enter element " + (i + 1) + " : ");
            arr1[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Danh sách các phần tử trong mảng thứ nhất: ");
        for (int j = 0; j < arr1.length; j++) {
            System.out.print(arr1[j] + "\t");
        }
        System.out.println("");

        do {
            System.out.print("Nhập độ dài của mảng thứ hai: ");
            size2 = scanner.nextInt();
            if (size2 > 20)
                System.out.println("Độ dài mảng không được quá 20");
        } while (size2 > 20);

        arr2 = new int[size2];
        int j = 0;
        while (j < arr2.length) {
            System.out.print("Enter element " + (j + 1) + " : ");
            arr2[j] = scanner.nextInt();
            j++;
        }
        System.out.print("Danh sách các phần tử trong mảng thứ hai: ");
        for (int k = 0; k < arr2.length; k++) {
            System.out.print(arr2[k] + "\t");
        }
        System.out.println("");

        int[] newArr = new int[arr1.length + arr2.length];
        for(int k = 0; k < arr1.length; k++){
            newArr[k] = arr1[k];
        }
        for(int k = 0; k < arr2.length; k++){
            newArr[arr1.length + k] = arr2[k];
        }
        System.out.print("Danh sách các phần tử trong mảng gộp: ");
        for (int k = 0; k < newArr.length; k++) {
            System.out.print(newArr[k] + "\t");
        }
    }
}
