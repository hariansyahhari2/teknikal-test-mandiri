import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("Nomor 1");
        System.out.println(reverseString("sindy cantik"));

        System.out.println("\nNomor 2");
        System.out.println(bagi(8, 3));

        System.out.println("\nNomor 3");
        System.out.println(eliminasiArray(Arrays.asList(1, 3, 2, 5, 3, 7, 1, 3, 6, 4, 1)));
    }

    public static String reverseString(String input) {
        String output = "";
        for (int i=(input.length() - 1); i>=0; i--) {
            output += String.valueOf(input.charAt(i));
        }

        return output;
    }


    public static Integer bagi (Integer val1, Integer val2) {
        return val1/val2;
    }

    public static MyObjectArray eliminasiArray(List<Integer> arrInput) {
        List<Integer> hasilEliminasi = new ArrayList<>();
        Integer jumlahEliminasi = 0;
        List<Integer> arrayTereliminasi = new ArrayList<>();

        for (int i=0; i<arrInput.size(); i++) {
            Integer duplicateCount = 0;
            for (int j=0; j<arrInput.size(); j++) {
                if (arrInput.get(i).equals(arrInput.get(j))) {
                    Integer number = arrInput.get(i);
                    duplicateCount++;
                }
            }
            if (duplicateCount < 3) {
                arrayTereliminasi.add(arrInput.get(i));
                jumlahEliminasi++;
            } else {
                hasilEliminasi.add(arrInput.get(i));
            }
        }


        MyObjectArray output = new MyObjectArray(hasilEliminasi, jumlahEliminasi, arrayTereliminasi);

        return output;
    }


}

class MyObjectArray {
    public MyObjectArray(List<Integer> hasilEliminasi, Integer jumlahDieliminasi, List<Integer> arrayTereliminasi) {
        this.hasilEliminasi = hasilEliminasi;
        this.jumlahDieliminasi = jumlahDieliminasi;
        this.arrayTereliminasi = arrayTereliminasi;
    }

    List<Integer> hasilEliminasi;

    Integer jumlahDieliminasi;

    List<Integer> arrayTereliminasi;

    public List<Integer> getHasilEliminasi() {
        return hasilEliminasi;
    }

    public void setHasilEliminasi(List<Integer> hasilEliminasi) {
        this.hasilEliminasi = hasilEliminasi;
    }

    public Integer getJumlahDieliminasi() {
        return jumlahDieliminasi;
    }

    public void setJumlahDieliminasi(Integer jumlahDieliminasi) {
        this.jumlahDieliminasi = jumlahDieliminasi;
    }

    public List<Integer> getArrayTereliminasi() {
        return arrayTereliminasi;
    }

    public void setArrayTereliminasi(List<Integer> arrayTereliminasi) {
        this.arrayTereliminasi = arrayTereliminasi;
    }

    @Override
    public String toString() {
        return "MyObjectArray{" +
                "hasilEliminasi=" + hasilEliminasi +
                ", jumlahDieliminasi=" + jumlahDieliminasi +
                ", arrayTereliminasi=" + arrayTereliminasi +
                '}';
    }
}
