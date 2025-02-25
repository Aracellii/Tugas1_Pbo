package tugas_satu;

public class Persegi extends Bangun {
    private double sisi;  

    public Persegi(double sisi) {
        this.sisi = sisi;
    }
    @Override
    public double hitungLuas() {
        return sisi*sisi;  
    }
}
