public class PrefixMatch {
    public int prefixCount(String[] words, String pref) {
        int count =0;
        for (String x : words){
            if(pref.length() > x.length()) continue;
            String prefix = x.substring(0,pref.length());
            if(prefix.equals(pref)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] words = {"pay","attention","practice","attend"};
        PrefixMatch match = new PrefixMatch();
        System.out.println(match.prefixCount(words,"at"));
    }
}
