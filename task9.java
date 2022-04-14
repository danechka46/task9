import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double value,sum = 0;
        double [] ar = new double[n];
        for (int i = 0; i < n; i++){
            System.out.print("Введите "+(i+1)+"элемент: ");
            ar[i] = s.nextDouble();
            sum+=ar[i];
        }
        double avg = sum/n;
        for(int i = 0; i < n; i++)
            System.out.print(ar[i]*avg+" ");
    }
}
