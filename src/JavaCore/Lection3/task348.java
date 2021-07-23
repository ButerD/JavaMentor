package JavaCore.Lection3;

import java.util.Objects;

public class task348 {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(941.0, 416.0);
        ComplexNumber b = new ComplexNumber(416.0, 941.0);
        a  = null;
        System.out.println(a.equals(b));





    }

    public static class ComplexNumber {
        private double re;
        private double im;

        public ComplexNumber() {
        }

        public ComplexNumber(double re, double im) {
            this.re = re;
            this.im = im;
        }

        public double getRe() {
            return re;
        }

        public double getIm() {
            return im;
        }


        @Override
        public int hashCode() {
            return (31 * Double.hashCode(re)) + (29 * Double.hashCode(im));
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if ((obj == null) || (getClass() != obj.getClass()))
                return false;

            ComplexNumber that = (ComplexNumber) obj;
            return (Double.compare(this.re, that.re) == 0) && (Double.compare(this.im, that.im) == 0);


        }



    }
}
