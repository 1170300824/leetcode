package tools;

import java.util.HashMap;
import java.util.Map;

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String input) {
        TrieNode node = root;
        int input_length = input.length();
        for (int i=0; i<input_length; i++){
            Map<Character,TrieNode> childNode = node.getChildNode();
            if (!childNode.containsKey(input.charAt(i))){
                TrieNode insertNode = new TrieNode();
                childNode.put(input.charAt(i),insertNode);
                node = insertNode;
            }else {
                node = childNode.get(input.charAt(i));
            }
        }
        node.setEnd(true);
    }

    public boolean search(String input){
        TrieNode node = root;
        int input_length = input.length();
        for (int i=0; i<input_length; i++){
            Map<Character,TrieNode> childNode = node.getChildNode();
            if (!childNode.containsKey(input.charAt(i))){
                return false;
            }else {
                node = childNode.get(input.charAt(i));
            }
        }
        return node.isEnd();
    }

    public String startsWith(String input) {
        TrieNode node = root;
        int input_length = input.length();
        String result = "";
        for (int i = 0; i < input_length; i++) {
            Map<Character, TrieNode> childNode = node.getChildNode();
            if ((childNode.containsKey(input.charAt(i)))) {
                result += input.charAt(i);
                if (childNode.get(input.charAt(i)).isEnd()) {
                    break;
                }
                node = childNode.get(input.charAt(i));
            } else {
                return null;
            }
        }
        return result;
    }

//    public boolean startsWith(String prefix) {
//        TrieNode node = root;
//        int input_length = prefix.length();
//        for (int i = 0; i < input_length; i++) {
//            Map<Character,TrieNode> childNode = node.getChildNode();
//            if (!childNode.containsKey(prefix.charAt(i))) {
//                return false;
//            }else {
//                node = childNode.get(prefix.charAt(i));
//            }
//        }
//        return true;
//    }

}

class TrieNode {
    private Map<Character,TrieNode> childNode;
    private boolean end;

    public TrieNode() {
        childNode = new HashMap<>();
        end = false;
    }

    public Map<Character, TrieNode> getChildNode() {
        return childNode;
    }

    public void setChildNode(Map<Character, TrieNode> childNode) {
        this.childNode = childNode;
    }

    public boolean isEnd() {
        return end;
    }

    public void setEnd(boolean end) {
        this.end = end;
    }
}