package Manager;

import java.util.Scanner;
class NumberToText {
    
    static int n1, n2, a, b;
    static String first, afterfirst, capitalizeWord;
    public static String textNumber(int n){
        n1 = n2 = n;
        b = n1%10;
        a = n2/10; //  n1/10 means last digit is removed and n2%10 means last digit by modulus
 
        String[] single_digits = new String[]{"zero","one","two","three","four","five", "six","seven","eight","nine"};
        String[] two_digits = new String[]{"","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen", "nineteen"};
        String[] tens_multiple = new String[]{"","","twenty","thirty","forty","fifty","sixty", "seventy","eighty","ninety"};
        if(a==1)
            return two_digits[b+1];
        else if(b==0)
            return tens_multiple[a];
        else
            return tens_multiple[a]+" "+single_digits[b];
    }
    
    static String capitalizeWord(String str){  
        String words[] = str.split("\\s");  
        capitalizeWord="";  
        for(String wordscan :words){  
            first = wordscan.substring(0,1);  
            afterfirst = wordscan.substring(1);  
            capitalizeWord += first.toUpperCase()+afterfirst+" ";  
        }  
        return capitalizeWord.trim();  
    }
    
    public static String getPercentagesInWords(int number, String str ){
        return str = (str.equals("")) ? capitalizeWord(textNumber(number)+" only") : capitalizeWord(textNumber(number)+" point "+str+" only");
    }
    
    public static void main(String args[]){
//        System.out.println(capitalizeWord(textNumber(68)+" point "+textNumber(00)));
        System.out.println(getPercentagesInWords(68, textNumber(00)));
        System.out.println(getPercentagesInWords(68, textNumber(89)));
        
    }
}