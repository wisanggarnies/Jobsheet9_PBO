package Tugas1;

public class RunTugas {
    public static void main(String[] args) {
        Segitiga sgt = new Segitiga();

        System.out.println("Total Sudut Pertama : " + sgt.totalSudut(90));
        System.out.println("Total Sudut Kedua : " + sgt.totalSudut(90, 45));
        System.out.println("Total Keliling Pertama : " + sgt.keliling(10, 20, 30));
        System.out.println("Total Keliling Kedua : " + sgt.keliling(10, 20));
    }
}
