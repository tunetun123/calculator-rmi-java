import java.rmi.Naming;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {
            // User Menu
            System.out.println(
                    "\n1.Tambah\n2.Kurang\n3.Kali\n4.Bagi\n5.Pangkat\n6.Hitung (x+y)/2\n7.Exit");
            System.out.println("Enter the Option : ");
            int opt = sc.nextInt();
            if (opt == 7) {
                break;
            }
            System.out.println("Enter first number : ");
            int a = sc.nextInt();
            System.out.println("Enter second number : ");
            int b = sc.nextInt();

            int n;
            switch (opt) {
                case 1:
                    AddI obj = (AddI) Naming.lookup("ADD");
                    n = obj.tambah(a, b);
                    System.out.println(a + "+" + b + " = " + n);
                    break;
                case 2:
                    SubI obj1 = (SubI) Naming.lookup("ADD");
                    n = obj1.kurang(a, b);
                    System.out.println(a + "-" + b + " = " + n);
                    break;
                case 3:
                    MulI obj2 = (MulI) Naming.lookup("ADD");
                    n = obj2.kali(a, b);
                    System.out.println(a + "x" + b + " = " + n);
                    break;
                case 4:
                    DivI obj3 = (DivI) Naming.lookup("ADD");
                    n = obj3.bagi(a, b);
                    System.out.println(a + "/" + b + " = " + n);
                    break;
                case 5:
                    Pangkat obj4 = (Pangkat) Naming.lookup("ADD");
                    n = obj4.pangkat(a, b);
                    System.out.println(a + "^" + b + " = " + n);
                    break;
                case 6:
                    Hitung obj5 = (Hitung) Naming.lookup("ADD");
                    n = obj5.hitung(a, b);
                    System.out.println(a + "+" + b + " / 2" + " = " + n);
                    break;
            }
        }
    }
}
