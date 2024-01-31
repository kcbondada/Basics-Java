public class DataType {
    public static void main(String[] args) {
        int num=1_0_0_0;
        byte b = 127;
        double d = Double.MIN_VALUE;
        char c = 'k';

        int a = 12;
        
        a=b;
        byte k = (byte) a;

        System.out.println(a+"<-Int , Byte ->"+k);

    

        System.out.println(b+"\n,"+num+","+d);
        System.out.println(c);

    }
}
