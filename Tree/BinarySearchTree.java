package Tree;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
        public int i=0;
        Node() {}
        int key;
		Node left, right;

		public Node(int item)
		{
			key = item;
			left = right = null;
		}
	Node insert(Node root,int key)
	{

		if (root == null) {
			root = new Node(key);
			return root;
		}

		else if (key < root.key)
			root.left = insert(root.left, key);
		else if (key > root.key)
			root.right = insert(root.right, key);
		return root;
	}
    Node delete(Node root, int key) {
        
        if (root == null)
          return root;
        if (key < root.key)
          root.left = delete(root.left, key);
        else if (key > root.key)
          root.right = delete(root.right, key);
        else {
          
          if (root.left == null)
            return root.right;
          else if (root.right == null)
            return root.left;

          root.key = minVal(root.right);
    
          root.right = delete(root.right, root.key);
        }
    
        return root;
      }
    int minVal(Node root) {
        int minv = root.key;
        while (root.left != null) {
          minv = root.left.key;
          root = root.left;
        }
        return minv;
      }

	void inorder(Node root)
	{
		if (root != null) {
			inorder(root.left);
			System.out.print(root.key + " ");
			inorder(root.right);
		}
	}
    void preorder(Node root)
	{
		if (root != null) {
            System.out.print(root.key + " ");
			preorder(root.left);
			preorder(root.right);
		}
	}
    void postorder(Node root)
	{
		if (root != null) {
			postorder(root.left);
			postorder(root.right);
            System.out.print(root.key + " ");
		}
	}
    void BFS(Queue<Node> q){
        if(q.isEmpty())
            return;
        Node n = q.poll();
        if(n.left!=null)
            q.add(n.left);
        if(n.right!=null)
            q.add(n.right);   
        System.out.print(n.key+" ");   
        BFS(q);
    }
    Node search(Node root,int key){
        if(root == null){
            System.out.println("Element not found");
            return root;
        }
        if (root.key == key){
            System.out.println("Element found");
            return root;
        }
        if (root.key < key)
            return search(root.right, key);
        return search(root.left, key);
    }
	
}


public class BinarySearchTree {
    public static void main(String[] args)
	{
        Scanner sc= new Scanner(System.in);
        int choice=0;
		Node tree=new Node();
        Node root=null;
        Queue<Node> q=new LinkedList<>();
        while(true){
            System.out.println("\n1.Insert node");
            System.out.println("2.Preorder traversal");
            System.out.println("3.Inorder traversal");
            System.out.println("4.Postorder traversal");
            System.out.println("5.Level order traversal");
            System.out.println("6.Delete node");
            System.out.println("7.Search");
            System.out.println("8.Exit");         
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter key value : ");
                    int key=sc.nextInt();
                    root=tree.insert(root,key);
                    break;
                case 2:
                    tree.preorder(root);
                    break;
                case 3:
                    tree.inorder(root);
                    break;
                case 4:
                    tree.postorder(root);
                    break;
                case 5:
                    q.add(root);
                    tree.BFS(q);
                    break;
                case 6:
                    System.out.println("Enter a value to be deleted : ");
                    int val=sc.nextInt();
                    root=tree.delete(root, val);
                    break;
                case 7:
                    System.out.println("Enter a value to be searched : ");
                    val=sc.nextInt();
                    tree.search(root,val);
                    break;
                case 8:
                    return;                    
                default:
                    System.out.println("invalid choice");
            }
        }
       

	}
    }

