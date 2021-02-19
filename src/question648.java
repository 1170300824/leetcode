import tools.Trie;

import java.util.ArrayList;
import java.util.List;

public class question648 {
    public static void main(String[] args) {
        List<String> dictionary = new ArrayList<>();
        dictionary.add("cat");
        dictionary.add("bat");
        dictionary.add("rat");
        String sentence = "the cattle was rattled by the battery";
        System.out.println(replaceWords(dictionary,sentence));
    }

    public static String replaceWords(List<String> dictionary, String sentence) {
        Trie prefix_trie = new Trie();
        for (String temp:dictionary){
            prefix_trie.insert(temp);
        }
        String[] split = sentence.split(" ");
        String result = "";
        for (String temp:split){
            if (prefix_trie.startsWith(temp) != null){
                result += prefix_trie.startsWith(temp) + " ";
            }else {
                result += temp + " ";
            }
        }
        return result.substring(0,result.length()-1);
    }
}
