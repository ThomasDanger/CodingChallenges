//Q: Write a program that can determine whether a number is positive or negative using bitwise operations

public static boolean isPositive(int num){return (num&-2147483648)==0;}
public static boolean isNegative(int num){return (num&-2147483648)==-2147483648;}
