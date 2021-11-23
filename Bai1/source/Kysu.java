package source;

public class Kysu extends Canbo {

    public String Nganhdaotao;

    public Kysu(String name, int tuoi, String gioitinh, String diachi, String nganhdaotao) {
        super(name, tuoi, gioitinh, diachi);
        this.Nganhdaotao = nganhdaotao;
    }

    public String getNganhdaotao() {
        return Nganhdaotao;
    }

    public void setNganhdaotao(String nganhdaotao) {
        Nganhdaotao = nganhdaotao;
    }

    @Override
    public String toString() {
        return "Engineer{" + "branch='" + Nganhdaotao + '\'' + ", name='" + name + '\'' + ", age=" + tuoi + ", gender='"
                + gioitinh + '\'' + ", address='" + diachi + '\'' + '}';
    }

}
