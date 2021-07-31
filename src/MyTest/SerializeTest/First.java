package MyTest.SerializeTest;

import java.io.Serializable;

public class First  {
    private String f1;
    private int fNum;

    public First() {
    }

    public String getF1() {
        return f1;
    }

    public void setF1(String f1) {
        this.f1 = f1;
    }

    public int getfNum() {
        return fNum;
    }

    public void setfNum(int fNum) {
        this.fNum = fNum;
    }

    @Override
    public String toString() {
        return "First{" +
                "f1='" + f1 + '\'' +
                ", fNum=" + fNum +
                '}';
    }
}


class  Second extends First implements Serializable{
    private String s2;
    private int sNum;

    public String getS2() {
        return s2;
    }

    public void setS2(String s2) {
        this.s2 = s2;
    }

    public int getsNum() {
        return sNum;
    }

    public void setsNum(int sNum) {
        this.sNum = sNum;
    }

    @Override
    public String toString() {
        return "Second{" +
                "s2='" + s2 + '\'' +
                ", sNum=" + sNum +
                "} " + super.toString();
    }
}
