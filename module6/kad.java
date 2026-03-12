class kad{
    public static void main(String args[]){
        int a[]={-2,1,-3,4,-1,2,1,-5,4};
        int ab=a[0];
        int cd=a[0];
        for(int i=1;i<a.length;i++){
            cd=Math.max(a[i],cd+a[i]);
            ab=Math.max(ab,cd);
        }
        System.out.println(ab);
    }
}