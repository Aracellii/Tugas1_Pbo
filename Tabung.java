package tugas_satu;

public class Tabung extends Lingkaran {
    private double tinggi;  
    public Tabung(double jari, double tinggi) {
        super(jari);  
        this.tinggi = tinggi;
    }

    public double hitungLuas() {
        return 2 * Math.PI * jari * (jari + tinggi);  
    }

    public double hitungVolume() {
        return Math.PI * jari * jari * tinggi;  
    }

}
