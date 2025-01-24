class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        if(n==1) return 1;
        int[] aux=new int[n];
        Arrays.fill(aux,1);
        int sum=0;
    
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1]){
                aux[i]=aux[i-1]+1;
                
            }

        }
        for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1] && aux[i]<=aux[i+1]){
                aux[i]=aux[i+1]+1;
                
            }
            sum+=aux[i];
            

        }

    return sum+aux[n-1];
        
    }
}
