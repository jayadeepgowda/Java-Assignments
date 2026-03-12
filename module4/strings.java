package module4;
 
//Write a program to d emonstrate the difference between String, StringBuilder, andStringBuffer.

public class strings {
    public static void main(String[] args) {

        // String 
        String str = "Hello";
        str.concat(" World");
        System.out.println("String: " + str); 

        // StringBuilder 
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("String Builder: " + sb);

        // StringBuffer 
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");
        System.out.println("String Buffer: " + sbf);
    }
}

