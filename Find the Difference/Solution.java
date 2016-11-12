
public class Solution {
    public char findTheDifference(String s, String t) {
        HashSet<Character> set = new HashSet<Character>();
        char[] charArray = (s+t).toCharArray();
        for(char c:charArray){
            if(!set.add(c)){
                set.remove(c);
            }
        }
        Iterator<Character> it = set.iterator();
        return it.next();
    }
}

//Another solution 
//public class Solution {
//    public char findTheDifference(String s, String t) {
//        char extra = 0;
//        char[] charArray = (s+t).toCharArray();
//        for(char c:charArray){
//            extra = (char)(extra^c);
//        }
//        return extra;
//    }
//}