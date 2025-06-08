
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author user
 */
public interface Antrian {
    void tambahPesanan(Pesanan p);
    Pesanan layaniPesanan();
    Pesanan lihatBerikutnya();
    boolean antrianKosong();
    List<Pesanan> getSemua();
}

