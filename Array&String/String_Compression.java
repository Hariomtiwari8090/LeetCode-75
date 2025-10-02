class Solution {
    public int compress(char[] arr) {
        int n = arr.length;
        StringBuilder ans = new StringBuilder();
        int i = 0, j = 1;

        while (j < n) {
            if (arr[i] != arr[j]) {
                if (j - i > 1) {
                    ans.append(arr[i]);
                    ans.append(j - i);
                } else {
                    ans.append(arr[i]);
                }
                i = j;
            }
            j++;
        }

        if (j - i > 1) {
            ans.append(arr[i]);
            ans.append(j - i);
        } else {
            ans.append(arr[i]);
        }
        for (int k = 0; k < ans.length(); k++) {
            arr[k] = ans.charAt(k);
        }

        return ans.length();
    }
}
