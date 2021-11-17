class Solution {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<Integer>();
        for (int x : nums) {
            if (!set.add(x)) {
                return true;
            }
        }
        return false;

        //return Arrays.stream(nums).distinct().count() < nums.length;
    }
}
