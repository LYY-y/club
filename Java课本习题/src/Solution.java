class Solution {
    int i,first,last,k;

    public boolean isPalindrome(int x) {
        int y;
        if(x<0){
            return false;
        }else{
            y=x;
            for(i=1; ;i++){
                y=y/10;
                if(y==0){
                    System.out.println(i+"位数");
                    break;
                }
            }//x为i位数

            if(i%2==0){
                while(true){
                    first=x/((int)(Math.pow(10,(i-1))));
                    last=x%10;
                    k=first*((int)(Math.pow(10,(i-1))));
                    if(first==last||x==0){
                        x=(x-k)/10;
                        i=i-2;
                        System.out.println("first="+first);
                        System.out.println("last="+last);
                        System.out.println("i="+i);
                        System.out.println("x="+x);
                        if(i==0){
                            return true;
                        }else {
                            continue;
                        }
                    }else{
                        System.out.println("first="+first);
                        System.out.println("last="+last);
                        return false;
                    }
                }
            }else if(i==1){
                return true;
            }else{
                while(true){
                    int first=x/((int)(Math.pow(10,(i-1))));
                    int last=x%10;
                    int k=first*((int)(Math.pow(10,(i-1))));
                    if(first==last){
                        x=(x-k)/10;
                        i=i-2;
                        System.out.println("first="+first);
                        System.out.println("last="+last);
                        System.out.println("i="+i);
                        System.out.println("k="+k);
                        System.out.println("x="+x);
                        if(i==1){
                            return true;
                        }
                    }else{
                        return false;
                    }
                }
            }
        }
    }
    public static void main(String[] args){
        Solution s=new Solution();
        System.out.println(s.isPalindrome(0));
    }
}