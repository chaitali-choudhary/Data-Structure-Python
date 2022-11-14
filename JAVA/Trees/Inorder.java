package Trees;



public class Inorder {

    static void inorderTraversal(Node root){
        if(root != null){
            inorderTraversal(root.left);
            System.out.print(root.key + " ");
            inorderTraversal(root.right);
        }
    }

    public static void main(String[] args) {

        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.right.left=new Node(40);
        root.right.right=new Node(50);

        inorderTraversal(root);
    }
}
