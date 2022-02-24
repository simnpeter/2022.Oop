package oop.labor01;

public class Main {

    public static void main(String[] args) {
        double x[] = {7, 1, -3, 8, 9};
        double max[];
        int n=13;
        System.out.printf("MAX: %6.2f\n", maxElement( x ));
        System.out.printf("MIN: %6.2f\n", minElement( x ));
        xElement( x );
        System.out.printf("atlag: %6.2f\n", fel4( x ));
        System.out.printf("szorzat: %6.2f\n", fel5( x ));
        max = max2(x);
        System.out.printf("MAXOK: %.2f, %.2f\n", max[0], max[1]);
        System.out.println( getBit( n , 2));
        for (int i = 0; i < 32 ; i++) {
            System.out.println( bitNum( i ));
        }
    }
    public static double maxElement( double array[] ){
        double max = Double.NEGATIVE_INFINITY;
        for( int i=0; i<array.length; ++i ){
            if( array[i] > max){
                max = array[ i ];
            }
        }
        return max;
    }
    public static void xElement( double array[] ){
        double atlag = 0;
        for( int i=0; i<array.length; ++i ){
            atlag += array [ i ];
        }
        atlag /= array.length;
        System.out.printf("ATLAG: %.2f\n", atlag );
    }
    public static double minElement( double array[] ){
        double min = Double.POSITIVE_INFINITY;
        for (int i = 0; i < array.length; i++) {
            if ( array[i] <min){
                min = array[i];
            }
        }
        return min;
    }
    public static byte getBit(int number, int order){
        if (order < 0 || order > 32){
            return -1;
        }
        for (int i = 0; i < order; i++) {
            number >>= 1;
        }
        return (byte)(number & 1);
    }
    public static byte bitNum(int number){
        int n=0;
        while(number!=0){
            n += number & 1;
            number >>= 1;
        }
        return (byte)n;
    }
    public static double fel4( double tomb[] ){
        float atlag = 0;
        if(tomb.length==0){
            return Double.NaN;
        }
        for (int i = 0; i < tomb.length; i++) {
            atlag += tomb[i];
        }
        atlag /= tomb.length;
        return atlag;
    }
    public static double fel5( double tomb[] ){
        float atlag = 0;
        float sum = 0;
        double veder;
        if(tomb.length==0){
            return Double.NaN;
        }
        for (int i = 0; i < tomb.length; i++) {
            atlag += tomb[i];
        }
        atlag /= tomb.length;
        for (int i = 0; i < tomb.length; i++) {
            veder = Math.abs(tomb[i]-atlag);
            sum += veder*veder;
        }
        sum /= tomb.length;
        sum = (float) Math.sqrt(sum);
        return sum;
    }
    public static double[] max2( double array[] ) {
        double max[] = {Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY};
        if (array.length == 0) {
            max[0] = max[1] = Double.NaN;
            return max;
        }
        else if (array.length == 1){
            max[0] = max[1] = array[0];
            return max;
        }
        else{
            for (int i = 0; i < array.length; i++) {
                if(max[1]<array[i]){
                    if(max[0]<array[i]){
                        max[1] = max[0];
                        max[0] = array[i];
                    }
                    else{
                        max[1] = array[i];
                    }
                }
            }
        }
        return max;
    }
}
