package models;

public class Box implements Printable, Comparable<Box> {
    private String nama;
    private int nim;

    public Box(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public int getNim() {
        return nim;
    }

    @Override
    public String getPrintDetail() {
        return "Nama: " + nama + " | NIM: " + nim;
    }

    @Override
    public int compareTo(Box other) {
        return Integer.compare(this.nim, other.nim);
    }

    @Override
    public String toString() {
        return getPrintDetail();
    }
}