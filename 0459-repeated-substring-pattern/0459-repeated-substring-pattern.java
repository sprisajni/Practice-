class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        String sub = ""; 
        
        
        for (int len = 1; len <= n / 2; len++) {
           
            if (n % len == 0) {
                sub = s.substring(0, len); 
                
                
                String pattern = "";
                while (pattern.length() < n) {
                    pattern += sub;
                }
                
                
                if (pattern.equals(s)) {
                    return true;
                }
            }
        }
        
       
        return false;
    }
}
