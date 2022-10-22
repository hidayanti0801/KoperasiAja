public class Anggota{  
    
    Koperasi kop;
    String nomorRekening;   
    
    public Anggota(Koperasi kop, String nomorRek){
        this.kop = kop;
        this.nomorRekening = nomorRek;        
    }    
    
    public void showAnggota(){
        kop.showKoperasi();
        System.out.print(" | "+nomorRekening);
    }
    
    
}