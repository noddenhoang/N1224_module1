package string;

public class StringExercise3 {
    public static void main(String[] args) {
        //a
        String aStr = "1810";
        int a = Integer.parseInt(aStr);
        //b
        String bStr = Integer.toString(a);
        //c
        String cStr = "123456789987654321";
        long c = Long.parseLong(cStr);
        //d
        String d = Long.toString(c);
        //e
        String eStr = "17.1f";
        float e = Float.parseFloat(eStr);
        //f
        String f = Float.toString(e);
        //g
        String gStr = "10.00";
        double g = Double.parseDouble(gStr);
        //h
        String hStr = Double.toString(g);
        //i
        String iStr = "100";
        short i = Short.parseShort(iStr);
        //k
        String k = Short.toString(i);
    }
}
