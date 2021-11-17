package codingowl;

import java.util.Random;
import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        //generate a random number named r
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int randomNum = r.nextInt(100) + 1;

        while (true){
            System.out.println("请输入你猜的数字，范围在1-100");
            int num = sc.nextInt();

            if (num > randomNum){
                System.out.println("你猜的数太大了");
            }
            else if(num < randomNum) {
                System.out.println("你猜的数太小了");
            }
            else {System.out.println("恭喜你猜对了！");
            break;}

        }


    }
}

