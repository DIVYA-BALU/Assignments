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
    boolean delete(Tree root,Tree parent,int val){
        if(root==null){
            System.out.println("Empty tree");
            return true;
        }
        if (root.data == val)
            {   if(root.children.size()==0){
                    Tree temp=parent;
                    temp.children.remove(root);
                    return true;
                }
                else{
                    System.out.println("found3");
                    Tree curr=root.children.get(0);
                    ArrayList<Tree> temp=new ArrayList<>(curr.children);
                    root.children.remove(0);
                    root.children.addAll(temp);
                    root.data=curr.data;                 
                    
                    return true;
                }
            }
        else{
            for(Tree child:root.children){
                if(delete(child,root,val)){
                    return true;
                }
            }
        }
        return false;
    }
    void preorder(Tree root){
        if(root==null)
            return;
        System.out.print(root.data+" ");
        for(Tree child: root.children)
            preorder(child);
    }
    void postorder(Tree root){
        if(root==null)
            return;
        for(Tree child: root.children)
            postorder(child);
        System.out.print(root.data+" ");
    }
    void levelOrderTraversal(Tree root) {
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
        System.out.println();
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
            System.out.println("2.Preorder traversal");
            System.out.println("3.Postorder traversal");
            System.out.println("4.BFS");
            System.out.println("5.Delete Tree");
            System.out.println("6.Height of tree");
            System.out.println("7.Exit");         
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter key value : ");
                    int inputKey=sc.nextInt();
                    System.out.println("Enter parent key value : ");
                    int parentkey=sc.nextInt();
                    if(root==null){
                        root=new Tree(inputKey);
                        System.out.println("Element inserted as root as the tree is null");
                    }
                    else
                        tree.addNode(root, parentkey, inputKey);
                    break;
                case 2:
                    tree.preorder(root);
                    break;
                case 3:
                    tree.postorder(root);
                    break;
                case 4:
                    tree.levelOrderTraversal(root);
                    break;
                case 5:
                    System.out.println("Enter a value to be deleted : ");
                    int val=sc.nextInt();
                    tree.delete(root,root,val);
                    break;
                case 6:
                    System.out.println("The height is : "+tree.Height(root));
                    break;
                case 7:
                    return;                                        
                default:
                    System.out.println("invalid choice");
            }
    }
        
    }
        
}

