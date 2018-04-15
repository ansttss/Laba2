
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public final class DataInput {

    public static Long getLong(String string) throws IOException {
        System.out.print(string);
        String s = getString(string);
        Long value = Long.valueOf(s);
        return value;
    }

    public static char getChar(String string) throws IOException {
        System.out.print(string);
        String s = getString(string);
        return s.charAt(0);
    }

    public static Integer getInt(String string) {
        System.out.print(string);
        String s = "";
        s = getString(s);
        Integer value = Integer.valueOf(s);
        return value;
    }

    public static String getString(String string) {
        System.out.print(string);
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = null;
        try {
            s = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }


    public static double getDouble(String string) {
        System.out.print(string);
        String s = "";
        try {
            s = getString();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        double value = Double.valueOf(s);
        return value;
    }


}