class miss{
    public static void main(String args[]){
        int a[]={1,2,4,5};
        int n=5;
        int s=n*(n+1)/2;
        int ab=0;
        for(int i=0;i<a.length;i++)
            ab+=a[i];
        System.out.println(s-ab);
    }
}