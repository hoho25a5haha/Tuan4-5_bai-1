package source;

public class Nhanvien extends Canbo {

    public String Congviec;

    public Nhanvien(String name, int tuoi, String gioitinh, String diachi, String congviec) {
        super(name, tuoi, gioitinh, diachi);
        Congviec = congviec;
    }

    public String getCongviec() {
        return Congviec;
    }

    public void setCongviec(String congviec) {
        Congviec = congviec;
    }

    @Override
    public String toString() {
        return "Staff{" + "Task='" + Congviec + '\'' + ", name='" + name + '\'' + ", age=" + tuoi + ", gender='"
                + gioitinh + '\'' + ", address='" + diachi + '\'' + '}';
    }

}
