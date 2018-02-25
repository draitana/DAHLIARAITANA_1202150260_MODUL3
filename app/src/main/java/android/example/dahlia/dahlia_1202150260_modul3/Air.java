package android.example.dahlia.dahlia_1202150260_modul3;

/**
 * Created by Asus on 25/02/2018.
 */

public class Air {
    private final int imageResource;
    private String namaAir;
    private String info;

    public Air(String title, String info, int imageResource) {
        this.namaAir = title;
        this.info = info;
        this.imageResource = imageResource;
    }

    String getNamaAir() {
        return namaAir;
    }
    String getInfo() {
        return info;
    }
    public int getImageResource() {
        return imageResource;
    }


}
