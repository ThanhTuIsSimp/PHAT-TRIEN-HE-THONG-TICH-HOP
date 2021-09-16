import java.util.Scanner;
class chuoiinhoa {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String inhoa;
    System.out.println("\nNhap chuoi: ");
    inhoa = sc.nextLine();
    System.out.println("Chuoi sau khi in hoa: ");
    System.out.println(inhoa.toUpperCase());
  }
}