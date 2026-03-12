class rot{
    static int s(int a[],int x){
        int l=0,r=a.length-1;
        while(l<=r){
            int m=(l+r)/2;
            if(a[m]==x)return m;
            if(a[l]<=a[m]){
                if(x>=a[l]&&x<a[m])r=m-1;
                else l=m+1;
            }else{
                if(x>a[m]&&x<=a[r])l=m+1;
                else r=m-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int a[]={4,5,6,7,0,1,2};
        System.out.println(s(a,0));
    }
}