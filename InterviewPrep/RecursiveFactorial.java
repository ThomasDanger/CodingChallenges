//Q: Write a program that calculates the factorial of a number using recursion
public static int factorial(int num){
    if(num==0)
        return 1;
    return num*factorial(num-1);
}
