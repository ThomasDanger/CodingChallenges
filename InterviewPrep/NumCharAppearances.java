//Q: Write a program that tells the number of appearances made by a specified character within a specified string
public static int numCharAppearances(String str, char target){
    int numAppearances=0;
    for(int i = 0; i<str.length(); i++){
        if(str.charAt(i)==target)
            numAppearances++;
    }
    return numAppearances;
}
