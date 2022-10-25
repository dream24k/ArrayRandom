package com.lx;

import java.util.Arrays;
import java.util.Random;

/**
 * 使用程序生成长度为18的随机整形数组，范围为1-1000
 * 形如：8,0,21,16,22,27
 * 将生成的数组处理成一个新数组，要求新数组格式如下，形如
 * [
 * ["0","8"],
 * ["16"],
 * ["21","22","27"]...以此类推
 * ]
 *
 * Developer : 李想
 */
public class RandomArray {
    public static final int ARRAY_MAX = 18;

    public static void main(String[] args) {
        // 创建一个长度为18的整形数组
        int[] array = new int[ARRAY_MAX];
        int[] temp = new int[ARRAY_MAX];

        // 使用random函数得出随机的1-1000的整形数组
        for (int i = 0; i < ARRAY_MAX; i++){
            Random random = new Random();
            array[i] = random.nextInt(1000);
        }

        System.out.println("随机生成的十八个整形数如下：");
        for (int i: array) {
            System.out.print(i + "  ");
        }

        Arrays.sort(array);
        System.out.println();

        for (int i = 0; i < ARRAY_MAX; i++) {
            temp[i] = array[i] / 10;
        }

        System.out.println("数组处理后如下：");
        System.out.println("[");
        System.out.print("[\""+ array[0] + "\"],");

        for (int i = 1; i < ARRAY_MAX ; i++){
                if (temp[i] == temp[i-1]){
                    System.out.print("[\""+ array[i] + "\"],");
                }else {
                    System.out.println();
                    System.out.print("[\"" + array[i] +"\"],");
                }
        }
        System.out.println();
        System.out.print("]");
    }
}

