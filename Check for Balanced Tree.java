class Tree
{
    
    //Function to check whether a binary tree is balanced or not.
    static boolean ans=true;
    static void inorder(Node root){
        if(root==null) return;
        int lh=hight(root.left);
        int rh=hight(root.right);
        if(Math.abs(lh-rh)<=1){
            inorder(root.left);
            inorder(root.right);
            return;
        }
        ans=false;
        return;
    }
    static int hight(Node root){
        if(root==null) return 0;
        int lf=hight(root.left);
        int rf=hight(root.right);
        return 1+Math.max(lf,rf);
    }
    boolean isBalanced(Node root){
        ans=true;
	    inorder(root);
	    return ans;
    }
}
