package linearsearch.leetcode;

public class CustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = { { 1, 2, 3 }, { 3, 2, 1 } };
        System.out.println(maxWealth(accounts));
    }

    static int maxWealth(int[][] accounts) {
        int richest = 0;

        for (int[] customerAccount : accounts) {
            int wealth = 0;

            for (int account : customerAccount) {
                wealth += account;
            }
            richest = Math.max(wealth, richest);
        }
        return richest;
    }
}
