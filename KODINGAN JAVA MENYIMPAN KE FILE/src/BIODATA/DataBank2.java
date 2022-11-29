package BIODATA;

public class DataBank2 {
    private String Nomor;
    private String Jenis;
    private String Bank;
    private String Pemilik;
    private String NamaFile;

    public DataBank2() {
    }

    public DataBank2(String no, String atm, String bank, String nama, String fileName) {
        this.Nomor = Nomor;
        this.Jenis = Jenis;
        this.Pemilik = Pemilik;
        this.Bank = Bank;
        this.NamaFile = NamaFile;
    }

    public String getNomor() {
        return Nomor;
    }

    public void setNomor(String nomor) {
        Nomor = nomor;
    }

    public String getJenis() {
        return Jenis;
    }

    public void setJenis(String jenis) {
        Jenis = jenis;
    }

    public String getBank() {
        return Bank;
    }

    public void setBank(String bank) {
        Bank = bank;
    }

    public String getPemilik() {
        return Pemilik;
    }

    public void setPemilik(String pemilik) {
        Pemilik = pemilik;
    }

    public String getNamaFile() {
        return NamaFile;
    }

    public void setNamaFile(String namaFile) {
        NamaFile = namaFile;
    }

    public DataBank2(String namaFile) {
        NamaFile = namaFile;
    }

    @Override
    public String toString() {
        return ("\nNo Kartu = " + Nomor + "\nJenis ATM = " + Jenis + "\nBank = " + Bank + "\nNama Pemilik = " + Pemilik + "\nNama File Gambar = " + NamaFile);
    }
}
