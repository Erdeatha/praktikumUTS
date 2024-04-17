package utspraktikum;

public class Balok {
    int panjang;
    int lebar;
    int tinggi;
    
    Balok(){
        panjang = 1;
        lebar =1;
        tinggi=1;
    }
    
    Balok(int panjangBaru, int lebarBaru, int tinggiBaru){
        panjang = panjangBaru;
        lebar = lebarBaru;
        tinggi = tinggiBaru;
    }
    
    int getLuas(){
        return 2*((panjang * lebar)+(panjang *tinggi)+(lebar*tinggi));
    }
    
    int getKeliling(){
        return 4*(panjang + lebar+tinggi);
    }
    
    int getVolume(){
        return panjang*lebar*tinggi;
    }
    
    void setPanjang(int panjangBaru){
        panjang = panjangBaru;
    }
    
    void setLebar(int lebarBaru){
        lebar = lebarBaru;
    }
    
    void setTinggi(int tinggiBaru){
        tinggi = tinggiBaru;
    }
    
    public static void main(String[] args) {
        Balok b = new Balok();
        System.out.println("Balok dengan panjang : "+b.panjang+", lebar : "+ b.lebar+" dan tinggi : " + b.tinggi + ". Luasnya : "+ b.getLuas()+", sedangkan kelilingnya : " +b.getKeliling()+ " dan volumenya : " + b.getVolume());
        
        Balok b2 = new Balok(30,40,50);
        System.out.println("Balok dengan panjang : "+b2.panjang+", lebar : "+ b2.lebar+" dan tinggi : " + b2.tinggi + ". Luasnya : "+ b2.getLuas()+", sedangkan kelilingnya : " +b2.getKeliling()+ " dan volumenya : " + b2.getVolume());
        
        Balok b3 = new Balok(25,35,45);
        System.out.println("Balok dengan panjang : "+b3.panjang+", lebar : "+ b3.lebar+" dan tinggi : " + b3.tinggi + ". Luasnya : "+ b3.getLuas()+", sedangkan kelilingnya : " +b3.getKeliling()+ " dan volumenya : " + b3.getVolume());
    }
    
}
