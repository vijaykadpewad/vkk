package Arraypack;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        double[] dArray = new double[10];
        // double[] dArray={}
        dArray[0] = 10;
        dArray[1] = 144;
        dArray[2] = 122;
        dArray[3] = 111;
        dArray[4] = 19;
        dArray[5] = 18;
        dArray[6] = 15;
        dArray[7] = 11;
        dArray[8] = 11;
        dArray[9] = 11;


        for (int i = dArray.length - 1; i >= 0; i--) {
            System.out.println(i + "  " + dArray[i]);

        }
        System.out.println(Arrays.toString(dArray));

    } }