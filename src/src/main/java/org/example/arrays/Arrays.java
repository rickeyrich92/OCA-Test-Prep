package org.example.arrays;

public class Arrays {
    // average an array of values
//    double nums[] = {10.1, 11.2, 12.3, 13.4, 14.5};
//    double result = 0;
//    int i;

//    for(i=0; i<5; i++){
//        result = result + nums[i];
//        System.out.println("Average is " + result / 5);
//    }

//    int[][] twoD = new int[4][5];
//    int i, j, k = 0;
//
//    for (i=0; i<4; i++){
//        twoD[i][j] = k;
//        k++;
//    }
//    for
    public static void main(String[] args) {
//        int twoD[][] = new int[4][];
//        twoD[0] = new int[1];
//        twoD[1] = new int[2];
//        twoD[2] = new int[3];
//        twoD[3] = new int[4];
//
//        int i, j, k = 0;
//
//        for (i = 0; i < 4; i++)
//            for (j = 0; j < i + k; j++) {
//                twoD[i][j] = k;
//                k++;
//            }

//        for (i = 0; i < 4; i++) {
//            for (j = 0; j < i + 1; j++)
//                System.out.println(twoD[i][j] + " ");
//            System.out.println();

        double m[][] = {
                {0*0, 1*0, 2*0, 3*0},
                {0*1, 1*1, 2*1, 3*1},
                {0*2, 1*2, 2*2, 3*2},
                {0*3, 1*3, 2*3, 3*3}
        };
        int i, k;

        for(i=0; i<4; i++){
            for(k=0; k<4; k++)
                System.out.println(m[i][k] + " ");
            System.out.println();
        }

    }

}

