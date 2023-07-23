
package uaspbo;

 
public class Bengkel {
//  atribut dan enkapsulasi
    private String nama;
    private String service;
    
//    construktor
    public Bengkel(String nama, String service) {
        this.nama = nama;
        this.service = service;
    }
    
//    mutator (seter)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setService(String service) {
        this.service = service;
    }

//    accesor (getter)
    public String getNama() {
        return nama;
    }

    public String getService() {
        return service;
    }
    
    public String displayInfo(){
       return "Nama: "+getNama()+
              "\nNPM: "+getService(); 
    }
    
//    polymorphism (overloading)
    public String displayInfo(String kerusakan){
        return displayInfo() + "\nKerusakan: "+kerusakan;
    }
}
