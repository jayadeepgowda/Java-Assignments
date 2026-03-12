class diff{
    public static void main(String args[]){
        int a[]={10,20,30,40,50};
        int d[]=new int[a.length];
        d[0]=a[0];
        for(int i=1;i<a.length;i++){
            d[i]=a[i]-a[i-1];
        }
        int l=1,r=3,v=5;
        d[l]+=v;
        if(r+1<a.length)
            d[r+1]-=v;
        int b[]=new int[a.length];
        b[0]=d[0];
        for(int i=1;i<a.length;i++){
            b[i]=b[i-1]+d[i];
        }
        for(int i=0;i<b.length;i++)
            System.out.print(b[i]+" ");
    }
}