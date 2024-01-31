import java.util.*;

class Main {
    class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    Node root;

    Main() {
        root = null;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.data)
            root.left = insertRec(root.left, key);
        else if (key > root.data)
            root.right = insertRec(root.right, key);

        return root;
    }

    void leftView() {
        ArrayList<Integer> res=new ArrayList<>();
        leftViewUtil(root,res, 0);
        for(int i=0;i<res.size();i++){
            System.out.print(res.get(i)+" ");
        }
    }

    void leftViewUtil(Node root,List<Integer>res, int level) {
       // Write code here
    if (root==null)return;
    if (level== res.size()){
        res.add(root.data);
    }
    leftViewUtil(root.left,res,level+1);
    leftViewUtil(root.right,res,level+1);
    }

    void inorder(){
    inorderutil(root);
    }

    void inorderutil(Node root){
        if(root==null)
        return;
        inorderutil(root.left);
        System.out.print(root.data+" ");
        inorderutil(root.right);
    }
    void post(){
        postutil(root);
    }

    void postutil(Node root){
        if(root==null)
        return;
        postutil(root.left);
        postutil(root.right);
        System.out.print(root.data+" ");
    }
    void preorder(Node root){
        
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    void height(){
        int x = heightutil(root);
        System.out.println("Height: "+x);
    }
    int heightutil(Node root){
        if(root==null){
            return 0;
        }
        int lh=heightutil(root.left);
        int rh=heightutil(root.right);
        return 1+Math.max(lh, rh);
        
    }
    void dia(){
        int x = diameter(root);
        System.out.println("Diameter: "+x);
    }
    int diameter(Node root){
        if(root==null){
            return 0;
        }
        int lh = heightutil(root.left);
        int rh = heightutil(root.right);

        int ld = diameter(root.left);
        int rd = diameter(root.right);

        
        return Math.max(lh+rh+1, Math.max(ld, rd));
    }
    

    int maxLevel = 0;

    public static void main(String args[]) {
        Main tree = new Main();
        Scanner scanner = new Scanner(System.in);

        int numNodes = scanner.nextInt();

        for (int i = 0; i < numNodes; i++) {
            int value = scanner.nextInt();
            tree.insert(value);
        }

        // tree.leftView();
        //tree.inorder();
        // tree.post();
        tree.preorder(tree.root);

        // tree.height();
        // int x = tree.heightutil(tree.root);
        // System.out.println(x);

        // System.out.println(tree.diameter(tree.root));
        scanner.close();
    }
}