//Q: Calculate modulus on a specified number by a specified power of two using bitwise operations

public static int modByPowerOfTwo(int dividend, int divisor){ return (dividend&(divisor-1)); }
