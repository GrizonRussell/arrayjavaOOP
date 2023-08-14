import java.util.Scanner;
public class loopArray{
    public static void main(String[] args) {
        int[] alphabet = new int[26];
        char[] myName = {'g', 'r', 'i', 'z', 'o', 'n'};

            for(char letters: myName){
                if(Character. isLetter(letters)){
                    alphabet[Character.toLowerCase(letters)-'a']++;
                }
            }
        for (char letters = 'a'; letters <= 'z'; letters++){
            int cletter = alphabet[letters - 'a'];
            System.out.println(letters + "-"+ cletter);
        }
    }
}