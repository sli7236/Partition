package com.company;

public class Runner {

    public static void main(String[] args) {
        int[] randIntArr = randomIntArr(100);
        String stringArr = "";
        for (int i = 0; i < randIntArr.length; i++)
        {
            stringArr = stringArr + randIntArr[i] + ", ";
        }
        long time = System.nanoTime();
        System.out.println("Random Integer Array: " + stringArr);
	    System.out.println(Partition.Partition(randIntArr, 0, randIntArr.length-1));
        System.out.println();
        System.out.print("Quick Sort: ");
        for (int i = 0; i < randIntArr.length; i++)
        {
            System.out.print(randIntArr[i] + " ");
        }
        System.out.println();
        time = System.nanoTime() - time;
        System.out.println("Quick Sort Time Taken: " + time + " nanoseconds");
    }

    public static int[] randomIntArr(int num)
    {
        int [] arr = new int [num];
        for (int i = 0; i < num; i++)
        {
            int rand = (int)((Math.random() * 1000) );
            arr[i] = rand;
        }
        return arr;
    }
}
