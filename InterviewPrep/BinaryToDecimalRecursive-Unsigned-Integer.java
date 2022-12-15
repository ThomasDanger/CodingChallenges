//Q: Write a program that converts an unsigned binary integer (represented by a string) to a decimal number using recursion

public static int bin2Dec(String binary){
    if(binary.length() == 0)
        return 0;
    else
        return Integer.parseInt("" + binary.charAt(0)) * (int)Math.pow(2, binary.length() - 1) + bin2Dec(binary.substring(1));
}
