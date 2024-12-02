package class_exercise;
import java.util.Scanner;

public class ClassExercise9 {
    public static void main(String[] args){
        System.out.println("请输入一个月份：");
        Scanner myScanner = new Scanner(System.in);
        int season = myScanner.nextInt();
        switch (season){
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            default:
                System.out.println("你确定你输入的是人类认定的月份？请重新输入");
        }
    }
}
