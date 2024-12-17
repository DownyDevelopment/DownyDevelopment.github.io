/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pergudangan;

/**
 *
 * @author downy
 */
public class Things {
    private int Id_Barang;
    private String Barang;
    private int Kuantitas;
    
    
    public Things(int Id_Barang, String Barang, int Kuantitas){
        this.Id_Barang = Id_Barang;
        this.Barang = Barang;
        this.Kuantitas = Kuantitas;
    }

    public void setId_Barang(int Id_Barang) {
        this.Id_Barang = Id_Barang;
    }

    public void setBarang(String Barang) {
        this.Barang = Barang;
    }

    public void setKuantitas(int Kuantitas) {
        this.Kuantitas = Kuantitas;
    }

    public int getId_Barang() {
        return Id_Barang;
    }

    public String getBarang() {
        return Barang;
    }

    public int getKuantitas() {
        return Kuantitas;
    }
    
    
    
}


