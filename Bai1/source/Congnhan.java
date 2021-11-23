package source;

public class Congnhan extends Canbo {

    public int bac;

    public Congnhan(String name, int tuoi, String gioitinh, String diachi, int bac) {
        super(name, tuoi, gioitinh, diachi);

        this.bac = bac;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    @Override
    public String toString() {
        return "Worker{" + "level='" + bac + '\'' + ", name='" + name + '\'' + ", age=" + tuoi + ", gender='" + gioitinh
                + '\'' + ", address='" + diachi + '\'' + '}';
    }

}
