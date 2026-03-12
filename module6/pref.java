class pref{
    public static void main(String args[]){
        int a[]={1,2,3,4,5};
        int p[]=new int[a.length];
        p[0]=a[0];
        for(int i=1;i<a.length;i++){
            p[i]=p[i-1]+a[i];
        }
        int l=1,r=3;
        int s;
        if(l==0)
            s=p[r];
        else
            s=p[r]-p[l-1];
        System.out.println(s);
    }
}