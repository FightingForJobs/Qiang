
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

//public class Solution {
//    public boolean canConstruct(String ransomNote, String magazine) {
//        int[] alphabeta = new int[26];
//        
//        for(int i = 0; i < magazine.length(); i++){
//            alphabeta[magazine.charAt(i) - 97]++;
//        }
//        for(int j = 0; j < ransomNote.length(); j++){
//            alphabeta[ransomNote.charAt(j) - 97]--;
//            if(alphabeta[ransomNote.charAt(j) - 97]<0){
//                return false;
//            }
//        }   
//        return true;
//       
//    }
//}