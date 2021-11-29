package com.company.datastructures;

public class BinarySearchArray {
    public static void binarySearch(int arr[], int first, int last, int key) {
        /* First divide the array into 2*/
        int mid = (first + last) / 2;
        /* if first is less than or equal to last*/
        while (first <= last) {
            if (arr[mid] < key) {
                first = mid + 1; // it will move till it finds the number
            } else if (arr[mid] == key) {
                System.out.println("Element is found at index: " + mid); // you have the number, print it
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Element is not found!");
        }
    }
}
