package com.licyun;

public class QuickSort {
    public void quickSort(int[] arrays, int lenght) {
        if (null == arrays || lenght < 1) {
            System.out.println("input error!");
            return;
        }
        quickSort(arrays, 0, lenght - 1);
    }

    public void quickSort(int[] arrays, int start, int end) {
        if(start>=end){
            return;
        }
        
        int i = start;
        int j = end;
        int value = arrays[i];
        boolean flag = true;
        while (i != j) {
            if (flag) {
                if (value > arrays[j]) {
                    swap(arrays, i, j);
                    flag=false;

                } else {
                    j--;
                }
            }else{
                if(value<arrays[i]){
                    swap(arrays, i, j);
                    flag=true;
                }else{
                    i++;
                }
            }
        }
        snp(arrays);
        quickSort(arrays, start, j-1);
        quickSort(arrays, i+1, end);
        
    }

    public void snp(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " ");
        }
        System.out.println();
    }

    private void swap(int[] arrays, int i, int j) {
        int temp;
        temp = arrays[i];
        arrays[i] = arrays[j];
        arrays[j] = temp;
    }

    public static void main(String args[]) {
        QuickSort q = new QuickSort();
        int[] a = { 49, 38, 65,12,45,5 };
        q.quickSort(a,6);
    } 

}
