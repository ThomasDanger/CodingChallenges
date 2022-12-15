//Q: Calculate modulus on a specified number by a specified power of two using bitwise operations

public static int modByPowerOfTwo(int dividend, int divisor){
    int remainder = 0;
    while(divisor!=0){
        remainder+=(dividend&divisor);
        divisor = (divisor>>1);
    }
    return remainder;
}
