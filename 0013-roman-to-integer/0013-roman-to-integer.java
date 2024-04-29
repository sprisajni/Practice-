class Solution {
    public int romanToInt(String s) {
        
        HashMap<Character, Integer> nm = new HashMap<>();
        
        nm.put('I', 1);
        nm.put('V', 5);
        nm.put('X', 10);
        nm.put('L', 50);
        nm.put('C', 100);
        nm.put('D', 500);
        nm.put('M', 1000);
        
        int result = 0;
        int prevValue = 0;
        
        for (int i = s.length() - 1; i >= 0; i--){
            
            int value = nm.get(s.charAt(i));
            
            if(value < prevValue){
                
                result -= value;
                
            }
            else{
                
                result += value;
            }
            
            prevValue = value;
        }
        
        return result;
        
        
        
    }
}