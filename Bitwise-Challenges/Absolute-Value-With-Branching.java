//Q: Write a program that calculates the absolute value of a number using bitwise operations (branching allowed)
public static int absoluteValue(int num){
    if((num&-2147483648) !=0){
        num=~num+1;
    }
    return num;
}
