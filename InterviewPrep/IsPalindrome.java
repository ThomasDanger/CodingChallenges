//Returns true if string is palindrome, false if not
public static boolean isPalindrome(String str){
    str=str.toUpperCase();
    for(int i = 0; i<str.length()/2; i++){
        if(str.charAt(i)!=str.charAt(str.length()-1-i))
            return false;
    }
    return true;
}
