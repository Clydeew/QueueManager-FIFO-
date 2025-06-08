/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Pesanan {
    private String id;
    private String nama;
    private List<String> daftarPesanan;

    public Pesanan(String id, String nama) {
        this.id = id;
        this.nama = nama;
        this.daftarPesanan = new ArrayList<>();
    }

    public void tambahPesanan(String item) {
        daftarPesanan.add(item);
    }

    public String getId() { return id; }
    public String getNama() { return nama; }
    public List<String> getDaftarPesanan() { return daftarPesanan; }

    public String getPesananSebagaiString() {
        StringJoiner joiner = new StringJoiner(", ");
        for (String item : daftarPesanan) {
            joiner.add(item);
        }
        return joiner.toString();
    }
}

