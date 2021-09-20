class Solution {
    public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
		return Arrays.stream(restaurants)
                .filter(f-> veganFriendly == 0 || veganFriendly == 1 && f[2] == 1)
				.filter(f->f[3] <= maxPrice)
				.filter(f->f[4] <= maxDistance)
				.sorted((a, b) -> b[1] == a[1]  ? b[0] - a[0] : b[1] - a[1])
				.map(e->e[0])
				.collect(Collectors.toList());
    }
}
