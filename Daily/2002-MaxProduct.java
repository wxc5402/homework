class Solution {
    int ans = 0;

    public int maxProduct(String s) {
        
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        dfs(s, sb1, sb2, 0);
        return ans;
    }


    public void dfs(String s, StringBuilder sb1, StringBuilder sb2, int index) {
        if (check(sb1) && check(sb2)) {
            ans = Math.max(ans, sb1.length() * sb2.length());
        }

        if (index == s.length()) {
            return;
        }
        
        dfs(s, sb1.append(s.charAt(index)), sb2, index + 1);
        sb1.setLength(sb1.length() - 1);

        dfs(s, sb1, sb2.append(s.charAt(index)), index + 1);
        sb2.setLength(sb2.length() - 1);

        dfs(s, sb1, sb2 , index + 1);

    }

    public boolean check(StringBuilder sb) {
        int left = 0; 
        int right = sb.length() - 1;

        while (left < right) {
            if (sb.charAt(left++) != sb.charAt(right--)) {
                return false;
            }
        }
        return true;
    }

}
