// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class palindrome {
    public static void main(String[] args)
    {
        int n=12200221;
        int a=n;
        int rev=0;
        while(n>0)
        {
            int i =n%10;
            rev=(rev*10)+i;
            n=n/10;
        }
        if(a==rev)
        {
        System.out.println("number is palindrom");
        }
        else
        System.out.println("number is not palindrom!");
        
        
    }
}
