class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        return false;
        int temp,result=0,num;
        num=x;
       while(num!=0)
        {
        temp=num%10;
        result=result*10+temp;
        num/=10;
        }
        return (result==x);
    }
}
public class palindrome
{
    public static void main (String args[])
    {
        Solution s=new Solution();
        System.out.println(s.isPalindrome(121));
    }
}