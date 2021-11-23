
import java.util.Scanner;

import source.*;

public class quanlycanbo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        danhsachcb danhsachcb = new danhsachcb();
        int x = 0;
        int y = 0;
        do {
            System.out.println("    QUAN LY CAN BO ");
            System.out.println("___________________________");
            System.out.println("1. Them can bo.");
            System.out.println("2. Tim can bo.");
            System.out.println("3. Danh sach can bo.");
            System.out.println("4. Thoat.");
            System.out.println("");
            x = scanner.nextInt();

            switch (x) {
            case 1: {
                do {
                    System.out.println("THEM CAN BO");
                    System.out.println("1.Them cong nhan.");
                    System.out.println("2.Them nhan vien");
                    System.out.println("3.Them ky su");
                    System.out.println("4.Quay lai.");
                    System.out.println("");
                    y = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("");
                    switch (y) {
                    case 1: {
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter age:");
                        int age = scanner.nextInt();
                        System.out.print("Enter gender: ");
                        scanner.nextLine();
                        String gender = scanner.nextLine();
                        System.out.print("Enter address: ");
                        String address = scanner.nextLine();
                        System.out.print("Enter level: ");
                        int branch = scanner.nextInt();
                        Canbo cn = new Congnhan(name, age, gender, address, branch);
                        danhsachcb.add(cn);
                        System.out.println(cn.toString());
                        System.out.println("");
                        break;
                    }
                    case 2: {
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter age:");
                        int age = scanner.nextInt();
                        System.out.print("Enter gender: ");
                        scanner.nextLine();
                        String gender = scanner.nextLine();
                        System.out.print("Enter address: ");
                        String address = scanner.nextLine();
                        System.out.print("Enter task: ");
                        String task = scanner.nextLine();
                        Canbo nv = new Nhanvien(name, age, gender, address, task);
                        danhsachcb.add(nv);
                        System.out.println(nv.toString());
                        System.out.println("");
                        break;
                    }
                    case 3: {
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter age:");
                        int age = scanner.nextInt();
                        System.out.print("Enter gender: ");
                        scanner.nextLine();
                        String gender = scanner.nextLine();
                        System.out.print("Enter address: ");
                        String address = scanner.nextLine();
                        System.out.print("Enter branch: ");
                        String branch = scanner.nextLine();
                        Canbo ks = new Kysu(name, age, gender, address, branch);
                        danhsachcb.add(ks);
                        System.out.println(ks.toString());
                        System.out.println("");
                        break;
                    }

                    }

                } while (y != 4);
                break;
            }
            case 2: {
                scanner.nextLine();
                System.out.println("Nhap ten can bo:");
                String a = scanner.nextLine();
                System.out.println("Ket qua:");
                danhsachcb.Search(a);
                System.out.println("-----");
                break;
            }
            case 3: {
                danhsachcb.showList();
                System.out.println("");
                break;
            }
            }

        } while (x != 4);
    }

}
