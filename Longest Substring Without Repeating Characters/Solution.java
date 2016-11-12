
public class Solution {
    public int lengthOfLongestSubstring(String s) {
    if(s==null || s.length()==0)
        return 0;
 
    HashSet<Character> set = new HashSet<Character>();
 
    int res=0;
    int start=0;
    char c = '\0';
    
    for(int i = 0; i<s.length(); i++){
        c = s.charAt(i);
        if(!set.contains(c)){
            set.add(c);
        }
        
        else{
            res = Math.max(res,set.size());
            while(start<i&&s.charAt(start)!=c){
                set.remove(s.charAt(start));
                start++;
            }
            start++;
        }
        res = Math.max(res,set.size());
    }
    return res;
}
}