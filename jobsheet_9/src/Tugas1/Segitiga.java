package Tugas1;

public class Segitiga {
    private int sudut;

    int totalSudut(int sudutA) {
        return sudut = 180 - sudutA;
    }

    int totalSudut(int sudutA, int sudutB) {
        return sudut = 180 - (sudutA + sudutB);
    }

    int keliling(int sisiA, int sisiB, int sisiC) {
        int keliling = sisiA + sisiB + sisiC;
        return keliling;
    }

    double keliling(int sisiA, int sisiB) {
        double sisic = Math.sqrt( Math.pow(sisiA,2) + Math.pow(sisiB,2) );
        return sisic;
    }
}
