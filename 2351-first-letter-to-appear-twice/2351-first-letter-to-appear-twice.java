class Solution {
    public char repeatedCharacter(String s) {
        
        int[] lastIndex = new int [26];
        
        char[] chars = s.toCharArray();
        
        for(int i = 0;i < chars.length; i++){
            
            int index = chars[i] - 'a';
            if(lastIndex[index] != 0){
                
                return chars[i];
            }
            
            else{
                
                lastIndex[index] = i + 1;
            }
            
        }
        
        return '\0';

        
    }
    
}