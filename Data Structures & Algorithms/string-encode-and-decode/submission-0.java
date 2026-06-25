class Solution {

    public String encode(List<String> strs) {
        String encoded_string = "";

        for (String s : strs) {
            encoded_string += s.length();
            encoded_string += '#';
            encoded_string += s;
        }
        
        System.out.println(encoded_string);

        return encoded_string;
    }

    public List<String> decode(String str) {
        List<String> decoded_string = new ArrayList<>();
        int i = 0;

        while(i < str.length()) {
            int j = i;

            while(str.charAt(j) != '#') {
                j++;
            }

            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + length;
            decoded_string.add(str.substring(i, j));
            i = j;
        }

        return decoded_string;
    }
}
