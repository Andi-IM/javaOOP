package pja14_02042020;

/**
 *
 * @author Andi
  ArrayListModel berfungsi menyimpan atribut-atribut objek
  oleh karena itu dalam kelas ini hanya menyimpan data.
 */
public class ArrayListModel{
    String noKtp = null; 
    String nama = null;
    String noHp = null;
    String alamat = null;
    String gejala = null; 
    String status = null;
    
    public ArrayListModel(){}
    public ArrayListModel(String noKtp, String nama, String noHp, 
                         String alamat, String gejala, String status) {
       
       this.noKtp = noKtp;
       this.nama = nama;
       this.noHp = noHp;
       this.alamat = alamat;
       this.gejala = gejala;
       this.status = status;
    }
    // getter
    public String getNoKtp() {
        return noKtp;
    }

    public String getNama() {
        return nama;
    }

    public String getNoHp() {
        return noHp;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getGejala() {
        return gejala;
    }

    public String getStatus() {
        return status;
    }
        
}
    
    