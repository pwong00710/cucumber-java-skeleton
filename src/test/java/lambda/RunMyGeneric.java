package lambda;

public class RunMyGeneric {
    public static void main(String args[]){

        // String version of MyGenericInteface
        MyGeneric<String> reverse = (str) -> {
            String result = "";

            for(int i = str.length()-1; i >= 0; i--)
                result += str.charAt(i);

            return result;
        };

        // Integer version of MyGeneric
        MyGeneric<Integer> factorial = (Integer n) -> {
            int result = 1;

            for(int i=1; i <= n; i++)
                result = i * result;

            return result;
        };

        // Output: omeD adbmaL
        System.out.println(reverse.compute("Lambda Demo"));

        // Output: 120
        System.out.println(factorial.compute(5));

    }
}
