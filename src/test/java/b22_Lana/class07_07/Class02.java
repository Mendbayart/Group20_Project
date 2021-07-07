package b22_Lana.class07_07;

public class Class02 {
    public static void main(String[] args) {
        String word = "java";
        String result = "";
        for (int i = word.length()-1; i>=0; i--) {
            result+="" + word.charAt(i);
        }

        System.out.println(result);
    }
}
