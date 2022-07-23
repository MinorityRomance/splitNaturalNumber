package driver;

import possibleException.FalseNaturalNumberException;
import java.util.Scanner;

/**
 * 对自然数拆分并测试
 * @author Jay Zhou
 * @version 1.0
 */
public class Split {
    public static int arr[] = new int[10];
    public static int naturalNumber;

    public static void helper() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数据");
        naturalNumber = sc.nextInt();
        try{
            if(naturalNumber  < 1 || naturalNumber > 8  ){
                throw new FalseNaturalNumberException("输入数据不符合要求");
            }
        }
        catch (FalseNaturalNumberException e){
            System.out.println("出现异常"+e.getMessage());
    }
        split(0,0,0);

    }

    /**
     * 分离自然数并输出拆分后的方案
     * @param num 数据的和
     * @param k 用来计数
     * @param m 每次答案的最小值
     */
    public static void split(int num,int k,int m)  {
        //当一次搜索完成时，用来输出数组中存储的答案
        if (num == naturalNumber) {
            for (int i = 1; i < k; i++) {
                System.out.print(arr[i] + "+");
            }
            System.out.println(arr[k]);
        }
        for (int i = 1; i < naturalNumber; i++) {
            if ((num + i) <= naturalNumber && i >= m) {
                arr[k + 1] = i;//记录下当前拆分的数
                k++;
                split(num + i, k, i);
                k--;//回溯，以免遗漏
            }
        }
    }
}
