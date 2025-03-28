/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubespemrog;

/**
 *
 * @author rvass
 */
import java.util.Date;

public class PeminjamanObject {
    private int idPinjam;
    private String nama;
    private long nim;
    private String prodi;
    private long noHp;
    private String asalPeminjam;
    private String ruangan;
    private Date tanggal;
    private String waktu;
    private String jenisKegiatan;

    public PeminjamanObject() {
        // Default constructor
    }

    public PeminjamanObject(int idPinjam, String nama, int nim, String prodi, int noHp,
                      String asalPeminjam, String ruangan, Date tanggal,
                      String waktu, String jenisKegiatan) {
        this.idPinjam = idPinjam;
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.noHp = noHp;
        this.asalPeminjam = asalPeminjam;
        this.ruangan = ruangan;
        this.tanggal = tanggal;
        this.waktu = waktu;
        this.jenisKegiatan = jenisKegiatan;
    }

    public int getIdPinjam() {
        return idPinjam;
    }

    public void setIdPinjam(int idPinjam) {
        this.idPinjam = idPinjam;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public long getNim() {
        return nim;
    }

    public void setNim(long nim) {
        this.nim = nim;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public long getNoHp() {
        return noHp;
    }

    public void setNoHp(long noHp) {
        this.noHp = noHp;
    }

    public String getAsalPeminjam() {
        return asalPeminjam;
    }

    public void setAsalPeminjam(String asalPeminjam) {
        this.asalPeminjam = asalPeminjam;
    }

    public String getRuangan() {
        return ruangan;
    }

    public void setRuangan(String ruangan) {
        this.ruangan = ruangan;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public String getJenisKegiatan() {
        return jenisKegiatan;
    }

    public void setJenisKegiatan(String jenisKegiatan) {
        this.jenisKegiatan = jenisKegiatan;
    }
}