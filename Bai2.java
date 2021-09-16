import java.util.Scanner;
import java.lang.Math;

class songuyento {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap so bat ki:");
        int n = s.nextInt();
        if(snt(n)){
            System.out.println(n + " la so nguyen to!");
        }
        else{
            System.out.println(n + " khong phai la so nguyen to!");
        }
    }
    public static boolean snt(int n) {
        if(n <= 1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i==0){
                return false;
            }
        }
        return true;
    }
}