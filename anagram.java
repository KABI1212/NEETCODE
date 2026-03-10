class anagram {
    public static void isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            System.out.println(false);
            return;
        }
        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int c : count) {
            if (c != 0) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
    public static void main(String[] args) {
        isAnagram("anagram", "nagaram");
        isAnagram("rat", "car");
    }
}