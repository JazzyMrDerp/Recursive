//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Number of zeros: " + numberOfZeros(909109324));
        System.out.println("String number of zeros: " + numZ("032804230230402340"));
        System.out.println("How many numbers " + numD("123"));
    }

    public static int numberOfZeros(int n)
    {
        int zeroCount;
        if (n==0)
            zeroCount = 1;
        else if (n < 10) // and not 0
            zeroCount = 0; // 0 for no zeros
        else if (n%10 == 0)
            zeroCount = numberOfZeros(n/10) + 1;
        else // n%10 != 0
            zeroCount = numberOfZeros(n/10);
        return zeroCount;
    }

    public static int numZ(String n) {
        String currentC;
        if (!n.isEmpty()) {
            currentC = n.substring(0, 1);
        } else {
            return 0;
        }
        if (currentC.equals("0")) {
            return numZ(n.substring(1)) + 1;
        } else {
            return numZ(n.substring(1));
        }
    }

    public static int numD(String n){
        String currentC;
        if(!n.isEmpty()){
            currentC = n.substring(0,1);
        }
        else {
            return 0;
        }
        if (currentC.equals("0") || currentC.equals("1") || currentC.equals("2") || currentC.equals("3") || currentC.equals("4") || currentC.equals("5") || currentC.equals("6") || currentC.equals("7") || currentC.equals("8") || currentC.equals("9")){
            return numD(n.substring(1))+1;
        }
        else {
            return numD(n.substring(1));
        }
    }

}