class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        List<List<String>> result = new ArrayList<>();
        int left = 0, right = products.length - 1;
        
        StringBuilder prefix = new StringBuilder();
        for (char c : searchWord.toCharArray()) {
            prefix.append(c);
            left = lowerBound(products, left, right, prefix.toString());
            right = Math.min(left + 2, products.length - 1);
            
            List<String> currentSuggestions = new ArrayList<>();
            if (left <= right) {
                for (int i = left; i <= right; i++) {
                    if (products[i].startsWith(prefix.toString())) {
                        currentSuggestions.add(products[i]);
                    } else {
                        break;
                    }
                }
            }
            result.add(currentSuggestions);
        }
        return result;
    }
    
    private int lowerBound(String[] products, int left, int right, String prefix) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (products[mid].compareTo(prefix) >= 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}