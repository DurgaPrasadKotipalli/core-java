package com.ds.bt.heap;

import java.util.Arrays;

public class HeapSort {

    public static void main(String[] args) {
        int a[]= {9,12,3,13,0,1};//6
        HeapSort heapSort = new HeapSort();
        heapSort.maxHeap(a);
    }

    public void maxHeap(int []a) {
        int n=a.length;//7

        //int i=(n/2)-1;//0 to (n/2)-1 all the parents are present=7/2-1=>2
        for(int i=(n/2)-1;i>=0;i--) {//i--=-1
            //0 to 2
            heapify(i,a,n);//heapify(0,a,6)
        }

        //replacing 0th index with n-1 index
        //again making sure that it follows max heap
        for(int j=n-1;j>=0;j--) {//4
            int temp = a[0];//n
            a[0] = a[j];
            a[j] = temp;
            heapify(0, a, j);
        }
        System.out.println(Arrays.toString(a));
    }

    public void heapify(int i,int[] a,int n) {//i=2
        //int a[]= {13,9,3,12,0,1,2};
        int parentPosition=i;//parentPosition=2
        int lcp=2*parentPosition+1;//lcp=5
        int rcp=2*parentPosition+2;//rcp=6

        if(lcp<n && a[parentPosition]<a[lcp]) {//a[2]<a[5]=>3<1
            parentPosition=lcp;//parentPosition=3
        }
        if(rcp<n && a[parentPosition]<a[rcp]) {//a[2]<a[6]=6<6
            parentPosition=rcp;
        }
        if(parentPosition!=i) {//3!=1
            int swap = a[i];//swap=a[0]=9
            a[i] = a[parentPosition];//a[0]=13
            a[parentPosition] = swap;//a[1]=9
            heapify(parentPosition,a,n);
        }//currently we are at parent 1
    }

}
