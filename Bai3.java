import java.util.Scanner;
import java.lang.Math;

class ptrinhbac2 {
    private static Scanner scanner = new Scanner(System.in);
        
    public static void main(String[] args) {
        System.out.print("Nhap a:");
        float a = ptrinhbac2.scanner.nextFloat();
        System.out.print("Nhap b:");
        float b = ptrinhbac2.scanner.nextFloat();
        System.out.print("Nhap c:");
        float c = ptrinhbac2.scanner.nextFloat();
        ptrinhbac2.giaiptbac2(a, b, c);
    }
    public static void giaiptbac2(float a, float b, float c) {
        if(a == 0){
            if(b == 0){
                System.out.println("Phuong trinh vo nghiem!");
            }
            else{
                System.out.println("Phuong trinh co 1 nghiem!" + " x = " + (-c/b));
            }
            return;
        }
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        if(delta > 0){
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phuong trinh co 2 nghiem la:" + " x1 = " + x1 + " x2" + x2);
        }else if(delta == 0){
            x1 = (-b / (2*a));
            System.out.println("Phuong trinh co nghiem kep" + " x1 = x2 = " + x1);
        }else{
            System.out.println("Phuong trinh vo nghiem!");
        }
    }
}