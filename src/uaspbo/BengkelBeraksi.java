
package uaspbo;

    import java.util.Scanner;

public class BengkelBeraksi { 
    public static void main(String[] args) {
//Error handling
try{
    //io sederhana
    Scanner scanner = new Scanner (System.in);

    //array
        BengkelDetail[] bngkl = new BengkelDetail[2];
        for(int i=0; i<bngkl.length; i++) {
                System.out.print("Masukkan nama pemilik "+(i+1)+" ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan Jenis Service "+(i+1)+" ");
                String service = scanner.nextLine();

        //        objek
                bngkl[i] = new BengkelDetail (nama, service);
    }

        for(BengkelDetail data: bngkl) {
            System.out.println("==================");
            System.out.println("DATA SERVICE: ");
            System.out.println(data.displayInfo());
        }
    } catch (NumberFormatException e){
        System.out.println("Kesalahan format nomor: "+e.getMessage());
    } catch (StringIndexOutOfBoundsException e) {
        System.out.println("Kesalahan Jenis service: "+e.getMessage());
    } catch (Exception e) {
        System.out.println("Kesalahan umum: "+e.getMessage());
    }
    
    }
}
