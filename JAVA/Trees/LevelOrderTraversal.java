package Trees;

public class LevelOrderTraversal extends HeightBinaryTree {

    static void currentLevel(Node root, int level){
        if (root == null) return;

        if(level == 1) System.out.print(root.key + " ");

        else if (level > 1) {
            currentLevel(root.left, level-1);
            currentLevel(root.right, level-1);

        }

    }



    public static void main(String[] args) {

        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.right.left=new Node(40);
        root.right.right=new Node(50);

        int height = height(root);

        for (int i=1; i<= height; i++){
            currentLevel(root, i);
        }

    }

}
