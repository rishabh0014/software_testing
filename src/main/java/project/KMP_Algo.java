package project;

public class KMP_Algo {

    public int strStr(String str, String pat) {
        int n1=str.length();
        int n2=pat.length();
        if(n1<n2)
            return -1;
        for(int i=0;i<=str.length()-pat.length();i++){
            int j=0;
            while(j<pat.length() && str.charAt(i+j)==pat.charAt(j))
                j++;
            if(j==pat.length()){
                return i;
            }
        }
        return -1;
    }
    
}
