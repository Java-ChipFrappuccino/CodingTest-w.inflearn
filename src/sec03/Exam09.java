package sec03;

import java.util.Random;
import java.util.Scanner;

// 9. 격자판 최대합
public class Exam09 {
    public static void main(String[] args) {
        Exam09 exam09 = new Exam09();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[num][num];
        Random random = new Random();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                int randomNumber = random.nextInt(49) + 2;
                arr[i][j] = randomNumber;
                System.out.printf("%d ",arr[i][j]);
            }
            System.out.println();
        }
        exam09.solution(arr);
    }

    public void solution(int[][] arr) {
        int sum = 0;
        int maxSum = 0;
        int count = 0;

    }
}
