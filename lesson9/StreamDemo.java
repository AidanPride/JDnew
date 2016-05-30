package lesson9;


import java.io.ByteArrayInputStream;

public class StreamDemo {
    public static void main(String[] args) {
        byte[] bytes = {-20, 8 , -128 , 0 , 13 , 127};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        printStreamData(byteArrayInputStream);
    }

    public static void printStreamData(ByteArrayInputStream byteArrayInputStream){
        int i;
        while ((i = byteArrayInputStream.read()) != -1){
            System.out.println(i);
        }
    }
}
