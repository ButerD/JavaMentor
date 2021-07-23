package JavaCore.Lection3;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class task356 {
    public static void main(String[] args) {
        AsciiCharSequence ascii = new AsciiCharSequence("abcdefgh".getBytes(StandardCharsets.UTF_8));

        System.out.println(ascii);
    }
public static class AsciiCharSequence implements CharSequence{
    byte[] arrByte;

    public AsciiCharSequence(byte[] arrByte) {
        this.arrByte = arrByte;
    }

    @Override
    public int length() {
        return arrByte.length;
    }

    @Override
    public char charAt(int index) {
        return (char) arrByte[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(Arrays.copyOfRange(arrByte, start, end));
    }

    @Override
    public String toString() {
        return new String(arrByte);
    }
}

}
