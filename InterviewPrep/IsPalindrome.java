//Q: Write a program that Determines whether a string is a palindrome or not
public static boolean isPalindrome(String str){
    str=str.toUpperCase();
    for(int i = 0; i<str.length()/2; i++){
        if(str.charAt(i)!=str.charAt(str.length()-1-i))
            return false;
    }
    return true;
}
