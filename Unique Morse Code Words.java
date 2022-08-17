class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String> set = new HashSet<>();
        
        String letters[] = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};        
               
        for(String s:words){
            int n = s.length();
            
            String h = "";
            
            for(int i=0;i<n;i++)
            {
                char c = s.charAt(i);
                
                h += letters[c-'a'];
            }
            
            set.add(h);
        }        
        
        return set.size();
        
    }
}
