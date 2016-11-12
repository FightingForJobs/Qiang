
public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int ransomLength = ransomNote.length();
        int pos = 0;
        boolean res = true;
        for(int i = 0; i<ransomLength;i++){
            pos = magazine.indexOf(ransomNote.charAt(i));
            if(pos>=0){
                magazine = magazine.substring(0,pos) + magazine.substring(pos+1);
            }else{
                return false;
            }
            }
            return res;
        }
    
}