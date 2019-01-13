public class ThrowExeptionTester {
    public static void main(String[] args) {
        ThrowExeptionTester throwExeptionTester = new ThrowExeptionTester();


        int hours = -3;
        int numberOfSeconds = 0;

        try {
            numberOfSeconds = throwExeptionTester.getNumberOfSeconds(hours);
        } catch (IllegalArgumentException iae) {
           numberOfSeconds = throwExeptionTester.getNumberOfSeconds(hours * -1);
        }


        System.out.println("liczba secund to: " + numberOfSeconds);

    }

    public int getNumberOfSeconds(int hours) {
        if (hours <0 ){
            throw new IllegalArgumentException("Liczba godzin musi być dodatnia: " + hours);
        }
        return hours * 60 * 60;
    }

}
