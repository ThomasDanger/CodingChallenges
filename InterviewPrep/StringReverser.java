//Returns a reversed string
public static String stringReverser(String str){
    String rts = "";
    for(int i = str.length()-1; i >=0; i--){
        rts+=str.charAt(i);
    }
    return rts;
}
