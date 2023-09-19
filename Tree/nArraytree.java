package Tree;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Tree {
    int data;
    ArrayList<Tree> children;
    Tree(){}
    Tree(int data)
    {
        this.data = data;
        this.children = new ArrayList<Tree>();
    }
    Tree root=null;
    void addNode(Tree root,int parentVal,int inputVal){
        if(root==null){
            System.out.println("parent not found");
            return;
        }
        else if (root.data==parentVal) {
            Tree newTree = new Tree(inputVal);
            root.children.add(newTree);
            return;
        }
        for (Tree child : root.children) {
            addNode(child, parentVal, inputVal);
    }
    }


    void levelOrderTraversal() {
        if (root == null) {
            System.out.println("Empty tree");
            return;
        }

        Queue<Tree> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Tree currentNode = queue.poll();
            System.out.print(currentNode.data + " ");

            for (Tree child : currentNode.children) {
                queue.add(child);
            }
        }
    }
    int Height(Tree root) {
               if (root == null) {
            return 0; 
        }

        Queue<Tree> queue = new LinkedList<>();
        queue.add(root);
        int height = 0;

        while (!queue.isEmpty()) {
            int level = queue.size(); 
            while (level > 0) {
                Tree currentNode = queue.poll();
                for (Tree child : currentNode.children) {
                    queue.add(child);
                }
                level--;
            }
            height++; 
        }

        return height;
    }

}
public class nArraytree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Tree tree= new Tree();
        Tree root=null;
        int choice;
        while(true){
            System.out.println("\n1.Insert Tree");
            System.out.println("2.DFS");
            System.out.println("3.BFS");
            System.out.println("4.Delete Tree");
            System.out.println("5.Height of tree");
            System.out.println("6.Exit");         
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter key value : ");
                    int inputKey=sc.nextInt();
                    System.out.println("Enter parent key value : ");
                    int parentkey=sc.nextInt();
                    if(tree.root==null){
                        tree.root=new Tree(inputKey);
                        System.out.println("Element inserted as root as the tree is null");
                        root=tree.root;
                    }
                    else
                        tree.addNode(root, parentkey, inputKey);
                    break;
                case 2:
                    //tree.DFS(root);
                    break;
                case 3:
                    tree.levelOrderTraversal();
                    break;
                case 4:
                    System.out.println("Enter a value to be deleted : ");
                    int val=sc.nextInt();
                    //tree.delete(root, val);
                    break;
                case 5:
                    System.out.println("The height is : "+tree.Height(root));
                    break;
                case 6:
                    return;                                        
                default:
                    System.out.println("invalid choice");
            }
    }
        
    }
        
}

