package Matrixes;

import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

import static org.apache.commons.math3.linear.MatrixUtils.createRealMatrix;

public class NewMain {
    public static void main(String[] args) {
        RealMatrix a = createRealMatrix(new double[][]{{1, 2}, {3, 4}, {5, 6}, {7,8}});
        RealMatrix b = createRealMatrix(new double[][]{{9,8,7,6}, {5,4,3,2}});
        RealMatrix c = a.multiply(b);
        System.out.println(c);
    }



}
