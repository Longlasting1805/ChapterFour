public class value2 {
    public static void main(String[] args) {
        System.out.printf("The character %c has the value %d%n", '=', convertUnicode('='));
    }
    public static int convertUnicode(char alphanumeric){
        return (int) alphanumeric;
    }
}
