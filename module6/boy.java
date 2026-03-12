class boy{
    public static void main(String args[]){
        int a[]={2,2,1,1,2,2,2};
        int c=0;
        int ab=0;
        for(int i=0;i<a.length;i++){
            if(c==0){
                ab=a[i];
                c=1;
            }
            else if(a[i]==ab)
                c++;
            else
                c--;
        }
        System.out.println(ab);
    }
}