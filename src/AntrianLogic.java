/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AntrianLogic implements Antrian {
    private Queue<Pesanan> antrian = new LinkedList<>();

    @Override
    public void tambahPesanan(Pesanan pBaru) {
        for(Pesanan pesanan : antrian){
            if(pesanan.getId().equalsIgnoreCase(pBaru.getId())){
                for(String item : pBaru.getDaftarPesanan()){
                    pesanan.tambahPesanan(item);
                }
                return;
            }
        }
        antrian.add(pBaru);
    }

    @Override
    public Pesanan layaniPesanan() {
        return antrian.poll();
    }

    @Override
    public Pesanan lihatBerikutnya() {
        return antrian.peek();
    }

    @Override
    public boolean antrianKosong() {
        return antrian.isEmpty();
    }

    @Override
    public List<Pesanan> getSemua() {
        return new LinkedList<>(antrian);
    }
}
