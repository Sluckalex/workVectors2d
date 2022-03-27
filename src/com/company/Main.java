package com.company;
import com.company.vector.Vector3d;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Vector3d v1 = new Vector3d(2.0, 7.0, 6.0);
        Vector3d v2 = new Vector3d(5.0, 3.0, 5.0);
        System.out.println("Vector one " + v1);
        System.out.println("Vector two " + v2);
        System.out.println("Vector one length "
                + v1.calculateLength());
        System.out.println("Vector two length "
                + v2.calculateLength());
        System.out.println("Dot product " +
                v1.calculateDotProduct(v2));
        System.out.println("Sum " + v1.calculateSum(v2));
        System.out.println("Difference " +
                v1.calculateDifference(v2));
        System.out.println("Compare v1 and v2 "
                + v1.compareTo(v2));
        System.out.println("Create vectors " +
                Arrays.toString(Vector3d.createVectors(4)));
    }
}
