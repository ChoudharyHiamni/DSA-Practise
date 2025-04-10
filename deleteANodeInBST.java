public class deleteANodeInBst {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    
     
    public static void inOrder(Node root){
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=insert(root.left,val);
        }else{
            root.right=insert(root.right,val);
        }
        return root;
    }
   
    public static Node delete(Node root,int val){
        if(root.data<val){
            root.right=delete(root.right,val);
        }
        else if(root.data>val){
            root.left=delete(root.left,val);
        }else{
            //CASE 1: LEAF NODE
            if(root.left==null && root.right==null){   
                return null;
            }

            //CASE 2: SINGLE CHILD
            if(root.left==null){      
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }

            //CASE 3:BOTH CHILDREN
            Node is=findInorderSuccessor(root.right);
            root.data=is.data;
            root.right=delete(root.right,is.data);
        }
        return root;
    }

    public static Node fidInorderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }

    public static void main(String args[]){
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }

        root=delete(root,1);
        System.out.println();

        inOrder(root);
    }
}
