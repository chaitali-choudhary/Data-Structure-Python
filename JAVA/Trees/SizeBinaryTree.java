package Trees;

public class SizeBinaryTree {

    static int getSize(Node root){

        if(root == null) return 0;

        return 1 + getSize(root.left) + getSize(root.right);

    }

    public static void main(String[] args) {

        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.right.left=new Node(40);
        root.right.right=new Node(50);

        int size = getSize(root);
        System.out.println(size);

    }
}
