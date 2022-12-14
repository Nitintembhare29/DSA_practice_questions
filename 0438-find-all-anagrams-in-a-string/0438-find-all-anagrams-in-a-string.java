class Solution {
    public List<Integer> findAnagrams(String s, String p) {
         List<Integer> list = new ArrayList<>();
         int m =  s.length();
        int n = p.length();
        if(m<n) return list;
        
        int[] pmap = new int[26];
        int[] smap = new int[26];
        
        // window
        for(int i=0; i<n; i++){
            pmap[p.charAt(i)-'a']++;
            smap[s.charAt(i)-'a']++; 
        }
          
            
        // slide smap window
        int i=0;  // first ptr
        
        // check
            if(Arrays.equals(smap,pmap))
                list.add(i);
        
        for(int j=n; j<m; ++j){                         
                       
            // remove
            smap[s.charAt(i++)-'a']--;
            
            // add 
            smap[s.charAt(j)-'a']++; 
            
             // check
            if(Arrays.equals(smap,pmap))
                list.add(i);
            
        }  
        
       
        
        return list;
        
       
    }
    
    
}