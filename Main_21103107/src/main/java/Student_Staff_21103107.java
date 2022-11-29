/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Student_Staff_21103107 extends Mahasiswa_21103107 implements IPendapatan_21103107 {

    private int unitKerja;
    private int jamKerja;

    public int getUnitKerja() {
        return unitKerja;
    }

    public void setUnitKerja(int unitKerja) {
        this.unitKerja = unitKerja;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    @Override
    public void tampilDataMhs() {
        System.out.println("NIM                     : " + nim);
        System.out.println("Nama                    : " + nama);
        System.out.println("Jurusan                 : " + jurusan);
        System.out.println("IPK                     : " + ipk);
        System.out.println("Unit Kerja              : " + unitKerja);
        System.out.println("Jam Kerja               : " + jamKerja);
        System.out.println("-----------------------------------------");
    }

    @Override
    public double totalPendapatan() {
    double totalPendapatan;

        return totalPendapatan = jamKerja * 30000;

    }

}
