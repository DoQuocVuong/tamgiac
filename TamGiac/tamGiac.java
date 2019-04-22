package TamGiac;

import java.util.Scanner;

public class tamGiac {
    public int canh_1;
    public int canh_2;
    public int canh_3;
    public tamGiac(){

    }
    public tamGiac(int canh_1, int canh_2, int canh_3) {
        this.canh_1 = canh_1;
        this.canh_2 = canh_2;
        this.canh_3 = canh_3;
        if (canh_1 <= 0 || canh_2 <= 0 || canh_3 <= 0 || canh_1 + canh_2 <= canh_3 && canh_2 + canh_3 <= canh_1 && canh_1 + canh_3 <= canh_2) {
            System.out.println("Ba cạnh trên không phải số đo của tam giác");
        }
    }
    public void khaibao(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Canh thu nhat la: ");
        int canh_01 = scanner.nextInt();
        System.out.println("Canh thu hai la: ");
        int canh_02 = scanner.nextInt();
        System.out.println("Canh thu ba la: ");
        int canh_03 = scanner.nextInt();
        checkTamGiac();
    }

    public void checkTamGiac() {
        if (canh_1 <= 0 && canh_2 <= 0 && canh_3 <= 0 && canh_1 + canh_2 <= canh_3 && canh_2 + canh_3 <= canh_1 && canh_1 + canh_3 <= canh_2) {
            System.out.println("Ba cạnh trên không phải số đo của tam giác");
            khaibao();
        }
    }

    public void tinhChuVi() {
        int p = canh_1 + canh_2 + canh_3;
        System.out.println("Chu vi tam giác là:" + p);
    }

    public void tinhDienTich() {
        double p2 = (canh_1 + canh_2 + canh_3) / 2;
        double s = Math.sqrt((p2) * (p2 - canh_1) * (p2 - canh_2) * (p2 - canh_3));
        System.out.println("Diện tích tam giác" + s);
    }
}



