
package uaspbo;

// inheritance 
public class BengkelDetail extends Bengkel {
//    overriding
    public BengkelDetail(String nama, String service) {
        super(nama, service);
    }
    
    public int getTanggalRegis() {
        return Integer.parseInt(getNama().substring(0, 2)) + 2000;
    }
    
    public String getJenisService(){
        String kodeAntrian = getService().substring(2,4);
        if(kodeAntrian.equals("10")){
            return "paket serivce honda";
        } else {
            return "vario 150";
        }
    }
    
    public String getKerusakan(){
        String kodeKerusakan = getService().substring(4, 4);
//        seleksi switch
        switch (kodeKerusakan){
            case "01":
                return "Ganti oli";
            case "02":
                return "ganti filter oli";
            default:
                return "general check";
        }
    }
    
    public int getNoRegistrasi(){
        return Integer.parseInt(getService().substring(6));
    }
    
//    polymorphism (overriding)
    @Override
    public String displayInfo(){
        return super.displayInfo() +
                "\nTanggal Masuk: "+getTanggalRegis()+
                "\nJenis Paket Service: "+getJenisService()+
                "\nPerbaikan: "+getKerusakan()+
                "\nNo Registrasi: "+getNoRegistrasi();
    }
}
