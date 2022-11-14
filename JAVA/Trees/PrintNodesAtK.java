package Trees;

public class PrintNodesAtK {

    static void printDist(Node root, int k){

        if(root == null) return;
        if(k == 0) System.out.print(root.key + " ");
        else {
            printDist(root.left, k-1);
            printDist(root.right, k-1);
        }

    }

    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.right.left=new Node(40);
        root.right.right=new Node(50);

        printDist(root, 1);
    }
}
