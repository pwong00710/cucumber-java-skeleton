package lambda;

public class RunMyString {
    public static String reverseStr2(MyString reverse, String str){
        return reverse.myStringFunction(str);
    }

    public static void main (String args[]) {
        // Block lambda to reverse string
        MyString reverseStr = (str) -> {
            String result = "";

            for(int i = str.length()-1; i >= 0; i--)
                result += str.charAt(i);

            return result;
        };

        // Output: omeD adbmaL
        System.out.println(reverseStr.myStringFunction("Lambda Demo"));

        System.out.println(reverseStr2(reverseStr,"Lambda Demo"));
    }
}
