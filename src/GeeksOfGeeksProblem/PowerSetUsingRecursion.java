package GeeksOfGeeksProblem;

import java.util.ArrayList;
import java.util.List;

public class PowerSetUsingRecursion {
    class Solution {
        private  void subsets(String ans, String s, int idx, List<String> list) {
            if(idx==s.length()){
                if(ans.length()!=0) list.add(ans);
                return;
            }
            char ch = s.charAt(idx);
            subsets(ans+ch,s,idx+1,list); // pick
            subsets(ans,s,idx+1,list); // skip
        }
        public ArrayList<String> powerSet(String s) {
            ArrayList<String > list = new ArrayList<>();
            subsets("",s,0,list);
            return list;
        }
    }

}
