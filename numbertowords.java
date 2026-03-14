// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int num=56846;
        pw(num/10000000,"crore");
        pw((num/100000)%100,"lakh");
        pw((num/1000)%100,"thousand");
        pw((num/100)%10,"hundred");
        pw((num%100),"");
        
        
        
    }
    static void pw(int num,String s){
        String[]one={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","tweleve","thirteen","fourteen","fifteen","sixteen","seventeen","eightteen","nineteen"};
        String[]two={"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};
        if(num<20) System.out.print(one[num]+" ");
        else System.out.print(two[num/10]+" "+one[num%10]+" ");
        
        if(num!=0){
            System.out.print(s+" ");
        }
        
    }
}
