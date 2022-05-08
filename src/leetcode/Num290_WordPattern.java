package leetcode;

public class Num290_WordPattern {
    public boolean wordPattern(String pattern, String s) {
        char[] ch = pattern.toCharArray();
        String[] str = s.split(" ");
        if(ch.length != str.length){
            return false;
        }
        for (int i = 0; i < ch.length - 1; i++) {
            for (int j = i+1; j < ch.length; j++) {
                if(ch[i] == ch[j]){
                    if(!(str[i].equals(str[j]))){
                        return false;
                    }
                }else{
                    if(str[i].equals(str[j])){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
