public class UcheckExpeptionTester {
    public static void main(String[] args) {
        UcheckExpeptionTester ucheckExpeptionTester = new UcheckExpeptionTester();
        int i = ucheckExpeptionTester.getNumberFromString("9");
        if (i!=-1){
        System.out.println("to nasza liczba pomożona przez 99: " + (i*99));}

    }

    public int getNumberFromString(String number) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException nfe) {
            System.out.println("upewnij się że string jest liczbą");
        }
        return -1;
    }
}
