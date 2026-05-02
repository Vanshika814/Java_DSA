package Trees.Questions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import Trees.Questions.Main.Node;

public class SD {
    public String serialize(Node node) {
        List<String> list = new ArrayList<>();
        helper(node, list);
        return String.join(",", list);
    }
    void helper(Node node, List<String> list){
        if(node == null){
            list.add("null");
            return;
        } list.add(String.valueOf(node.val));
        helper(node.left, list);
        helper(node.right, list);
    }
    Node deserialize(String data){
        LinkedList<String> list = new LinkedList<>(Arrays.asList(data.split(",")));
        return helper2(list);
    }
    Node helper2(LinkedList<String> list){
        String val = list.removeFirst();
        if(val.equals("null")){
            return null;
        }
        Node node = new Node(Integer.parseInt(val));
        node.left = helper2(list);
        node.right = helper2(list);
        return node;
    }
}
