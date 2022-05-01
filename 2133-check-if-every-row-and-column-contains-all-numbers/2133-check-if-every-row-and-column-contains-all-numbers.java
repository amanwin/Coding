class Solution {
    public boolean checkValid(int[][] matrix) {
        HashSet<Integer> set = new HashSet<>();
        int n = matrix.length;
        for(int i = 0; i<n;i++) {
            set.clear();
            
            for(int j = 0; j<n; j++) {
                int val = matrix[i][j];
                if(!set.add(val)) {
                    return false;
                }
            }
            set.clear();
            for(int j = 0; j<n;j++) {
                int val = matrix[j][i];
                if(!set.add(val)) {
                    return false;
                }
            }
        }
        return true;
    }
}