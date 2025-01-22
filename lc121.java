class Solution {
    public int maxProfit(int[] prices) {

        int max=0;
        int n=prices.length;

        int[] aux=new int[n];
        aux[n-1]=prices[n-1];

        for(int i=n-2;i>=0;i--){
            if(prices[i]>aux[i+1]){
                aux[i]=prices[i];
                
                
            }else{
                aux[i]=aux[i+1];
            }

           // System.out.println(aux[i]-prices[i]);
           int diff=aux[i]-prices[i];

            max=max<diff?diff:max;

        }

        return max;


       // for(int i)


       
        
    }
}
