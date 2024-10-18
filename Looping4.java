public class Looping4 {
    public static void main(String[] args) {
        int angka = 1;
        int selisih = 1;
        for(int i = 0; i < 16; i++){
            System.out.print(angka + " ");
            angka += selisih;
            selisih++;
        }
    }
}
