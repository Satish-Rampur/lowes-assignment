import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main
{

    //5
    //[(1, 3), (2, 5), (4, 6), (6, 8), (5, 7)]
    // 1,2,3 00 01 02
    //4,5,6  10 11 12
    //7,8,9  20 21 22
    public static void main(String[] args) {

        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
    int ans = subtract(array);
    System.out.print(ans);
    }
    public static int subtract(int arr[][])
    {
        int n = arr.length;
        int m = arr[0].length;
        int sum=0;
        int sum2 =0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if( i == j)
                {
                   sum= arr[i][j] + sum;
                }
                if(i+j == arr.length-1)
                {
                    sum2 = sum2+arr[i][j];
                }
            }
        }
        return sum - sum2;
    }
}

//    int[][] array = {
//            {1, 2, 3},
//            {4, 5, 6},
//            {7, 8, 9}
//    };
//(1, 3),
// (2, 5),
// (4, 6),
// (6, 8),
// (5, 7)
