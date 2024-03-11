public class Ogrenci {
    
    private String ad, bolum;
    private int girisYili, bolumKodu, girisSirasi;
    private double gano;
    
    private String ogrNo;
    
    public String getAd() { return ad; }
    public void setAd(String ad) { this.ad = ad; }
    public String getBolum() { return bolum; }
    public void setBolum(String bolum) { this.bolum = bolum; }
    public int getGirisYili() { return girisYili; }
    public void setGirisYili(int girisYili) { this.girisYili = girisYili; }
    public int getBolumKodu() { return bolumKodu; }
    public void setBolumKodu(int bolumKodu) { this.bolumKodu = bolumKodu; }
    public int getGirisSirasi() { return girisSirasi; }
    public void setGirisSirasi(int girisSirasi) { this.girisSirasi = girisSirasi; }
    public double getGano() { return gano; }
    public void setGano(double gano) { this.gano = gano; }
    
    public String getOgrNo() { return ogrNo; }
    
    public Ogrenci() {
        this(null, null, 0.0, 0, 0, 0);
    }
    
    public Ogrenci(Ogrenci ogr) {
        this(ogr.ad, ogr.bolum, ogr.gano, ogr.girisSirasi, ogr.bolumKodu, ogr.girisYili);
    }
    
    public Ogrenci(String ad, String bolum) {
        this(ad, bolum, 0.0, 0, 0, 0);
    }
    
    // gano geçerli değil ise throw ile exception atılıyor
    public Ogrenci(String ad, String bolum, double gano, int girisSirasi, int bolumKodu, int girisYili) {
        if (gano > 4 || gano < 0) {
            throw new IllegalArgumentException("Gano degeri 0 ile 4 arasinda olmak zorunda.");
        }
        
        this.ad = ad;
        this.bolum = bolum;
        this.gano = gano;
        this.girisSirasi = girisSirasi;
        this.bolumKodu = bolumKodu;
        this.girisYili = girisYili;
        
        ogrNo = ogrenciNoOlustur();
    }
    
    // öğrenci numarası oluşturuluyor ve giriş sırasının başındaki eksik
    // sıfırlar döngü ile ekleniyor
    public String ogrenciNoOlustur() {
        String sira = girisSirasi + "";
        for (int i = 0; i < 3-sira.length(); i++) {
            sira = "0" + sira;
        }
        
        return girisYili + "" + bolumKodu + sira;
    }
    
    // girisYili+5 yaparak 5. senesinin değeri ile dersSayisi değeri hesaplama fonksiyonuna verilir
    public double harcHesapla(int dersSayisi) {
        return harcHesapla(dersSayisi, girisYili+5);
    }
    
    // harç hesaplama fonksiyonu
    public double harcHesapla(int dersSayisi, int uzattigiYil) {
        return 0; // hesaplama?
    }
    
    public void bilgileriYazdir() {
        System.out.println(ad + " " + bolum + " " + ogrNo + " " + gano);
    }
}
