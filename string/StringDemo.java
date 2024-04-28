package string;

public class StringDemo {

    public static void main(String[] args) {
        String str = "Moose";
        System.out.println(str.codePointCount(1, 4));
        StringBuilder rev = new StringBuilder();

        for (int i = str.length() - 1 ; i  >= 0 ; i--) {
            rev.append(str.charAt(i));
        }
        System.out.println(rev);

        String repStr = str.replace("Mo", "Ch");
        System.out.println(repStr);
    }

}
