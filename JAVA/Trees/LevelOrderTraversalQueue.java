package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalQueue {

    static void printLevel(Node root){

        if (root == null) return;


        Queue<Node> q = new LinkedList<Node>();

        q.add(root);

        while(!q.isEmpty()){
            Node curr = q.poll();
            System.out.print(curr.key + " ");
            if (curr.left != null) q.add(curr.left);
            if (curr.right != null) q.add(curr.right);

        }


    }

    static void printLevelLineByLine(Node root){
        if(root == null) return;

        Queue<Node> queue = new LinkedList<Node>();

        queue.add(root);
        queue.add(null);

        while(queue.size() > 1){

            Node curr = queue.poll();

            if (curr == null){
                System.out.println();
                queue.add(null);
                continue;
            }
            System.out.print(curr.key + " ");
            if (curr.left != null) queue.add(curr.left);
            if (curr.right != null) queue.add(curr.right);

        }


    }


    public static void main(String[] args) {

        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.left=new Node(60);
        root.right.right=new Node(70);

//           printLevel(root);
//          printLevelLineByLine(root);
        printLevel(root);
    }

}
