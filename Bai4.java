import java.util.Scanner;
 
 
class tinhTong {
 
    public static void main(String[] args) {
         
        long sum = 0;
        int n;
        Scanner sc;
        do {
            System.out.println("Nhap n = ");
            sc = new Scanner(System.in);
            n = sc.nextInt();
        }while(n <= 0);
         
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
         
        System.out.println("Tong tu 1 toi n la " + sum);
        sc.close();
    }
}