/*从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入位0时结束程序*/
package whiletest1;
import java.util.Scanner;
public class WhileTest1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m,sum = 0,sum1 = 0,i = 1;
        while(i > 0){
            m = scan.nextInt();
            if(m > 0){
                sum ++;
            }
            else if(m < 0){
                sum1 ++;
            }
            else{
                break;
            }
        }
        System.out.println("正数个数为"+sum);
        System.out.println("负数个数为"+sum1);
    }
}
