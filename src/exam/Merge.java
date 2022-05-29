package exam;

import java.util.Arrays;

public class Merge {
    public void merge(int A[], int m, int B[], int n) {
        int[] arr = Arrays.copyOf(A, m + n);
        int i = 0;//指向arr的待比较元素
        int j = 0;//指向B的待比较元素
        int index = 0;//A的下标
        while (i != m && j != n) {
            if (arr[i] <= B[j]) {
                //当arr的值小于等于B的值时，把arr的值拷贝到A
                A[index] = arr[i];
                i++;
            } else {
                //当arr的值大于B的值时，把B的值拷贝到A
                A[index] = B[j];
                j++;
            }
            index++;
        }
        //此时arr数组遍历完了，把B中剩余的值拷贝到A中
        while (j < n) {
            A[index] = B[j];
            j++;
            index++;
        }

        //此时B数组遍历完了，把arr中剩余的值拷贝到A中
        while (i < m) {
            A[index] = arr[i];
            i++;
            index++;
        }
    }
}
