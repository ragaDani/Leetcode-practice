class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int len = Integer.MIN_VALUE;
        for(String s: strs){
            if(s.length()>len)
                len=s.length();
        }
        if(strs.length==1){
            return strs[0];
        }
        if(strs.length==0){
            return "";
        }
        char ch = strs[0].charAt(0);
        StringBuilder result = new StringBuilder();
        boolean flag = false;
        for(int i=0;i<len;i++){
            flag=true;
            if(i<strs[0].length())
                ch = strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length() ){
                    flag=false;
                    break;
                }  
                if(ch!=strs[j].charAt(i)){
                    flag=false;
                    break;
                }
            }
            if(flag){
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","florida"};
        LongestCommonPrefix obj = new LongestCommonPrefix();
        System.out.println(obj.longestCommonPrefix(strs));
    }
}