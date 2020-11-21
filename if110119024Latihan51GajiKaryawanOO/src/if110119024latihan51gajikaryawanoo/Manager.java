/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if110119024latihan51gajikaryawanoo;

/**
 *
 * @author acer
 */
public class Manager extends Karyawan {
    private int kehadiran;
    private float tunjanganGolongan, tunjanganJabatan, tunjanganKehadiran;
    
    public int getKehadiran(){
        return this.kehadiran;
    }
    
    public void setKehadiran(int kehadiran){
        this.kehadiran = kehadiran;
    }
    
    public float tunjanganKehadiran(int hadir){
        tunjanganKehadiran = hadir * 10000;
        return tunjanganKehadiran;
    }
    
    public float tunjanganJabatan(String jabatan){
        String kapital = jabatan.toUpperCase();
        if (kapital.equals("MANAGER")) {
            tunjanganJabatan = 2000000;
        } else if (kapital.equals("KABAG")) {
            tunjanganJabatan = 1000000;
        } else {
            tunjanganJabatan = 0;
        }
        return tunjanganJabatan;
    }
     public float tunjanganGolongan(int golongan){
        switch(golongan) {
            case 1 : return 500000;
            case 2 : return 1000000;
            case 3 : return 1500000;
            default : return 0;
        }
    }
    public float gajiTotal(){
        return tunjanganGolongan + tunjanganJabatan + tunjanganKehadiran;
    }
    
}
