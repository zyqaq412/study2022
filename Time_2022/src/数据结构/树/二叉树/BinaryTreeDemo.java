package 数据结构.树.二叉树;

/**
 * @title: BinaryTreeDemo
 * @Author zxwyhzy
 * @Date: 2022/11/8 22:11
 * @Version 1.0
 *
 * 二叉树
 * 前序中序后序遍历
 * 前序中序后序查找
 */
public class BinaryTreeDemo {
    public static void main(String[] args) {
        //创建一棵二叉树
        BinaryTree bt = new BinaryTree();
        //创建需要的结点
        HeroNode h1 = new HeroNode(1,"h1");
        HeroNode h2 = new HeroNode(2,"h2");
        HeroNode h3 = new HeroNode(3,"h3");
        HeroNode h4 = new HeroNode(4,"h4");
        HeroNode h5 = new HeroNode(5,"h5");

        h3.setLeft(h1);
        h3.setRight(h5);
        h5.setLeft(h4);
        h1.setRight(h2);

        bt.setRoot(h3);
        System.out.println("前序");
        bt.perOrder();
       /* System.out.println("中序");
        bt.infixOrder();
        System.out.println("后序");
        bt.postOrder();*/
        System.out.println(bt.perOrderSearch(15));
    }

}
class BinaryTree{
    private HeroNode root;

    public void setRoot(HeroNode root) {
        this.root = root;
    }


    //前序查找
    public HeroNode perOrderSearch(int no){
        if (this.root != null){
           return this.root.preOrderSearch(no);
        }
        return null;
    }
    //中序查找
    public HeroNode infixOrderSearch(int no){
        if (this.root != null){
          return this.root.infixOrderSearch(no);
        }
        return null;
    }
    //后序查找
    public HeroNode postOrderSearch(int no){
        if (this.root != null){
          return this.root.postOrderSearch(no);
        }
        return null;
    }

    //前序遍历
    public void perOrder(){
        if (this.root != null){
            this.root.preOrder();
        }
    }
    //中序遍历
    public void infixOrder(){
        if (this.root != null){
            this.root.infixOrder();
        }
    }
    //后序遍历
    public void postOrder(){
        if (this.root != null){
            this.root.postOrder();
        }
    }
}



//先创建 hero 节点
class HeroNode{
   private int no;
   private String name;
   private HeroNode left;
   private HeroNode right;

    public HeroNode(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HeroNode getLeft() {
        return left;
    }

    public void setLeft(HeroNode left) {
        this.left = left;
    }

    public HeroNode getRight() {
        return right;
    }

    public void setRight(HeroNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }

    //编写前序查找方法
    public HeroNode preOrderSearch(int no){
        if (this.no == no) return this;
        HeroNode resNode = null;
        if (this.left != null){
           resNode =this.left.preOrderSearch(no);
        }
        if (resNode != null) return resNode;
        if (this.right != null){
           resNode =this.right.preOrderSearch(no);
        }
        if (resNode != null) return resNode;
        return null;
    }

    //编写中序查找方法

    public HeroNode infixOrderSearch(int no){
        HeroNode resNode = null;
        if (this.left != null){
            resNode= this.left.infixOrderSearch(no);
        }
        if (resNode != null) return resNode;
        if (this.no == no) return this;
        if (this.right != null){
            resNode = this.right.infixOrderSearch(no);
        }
        if (resNode != null) return resNode;
        return null;
    }

    //编写后序查找方法
    public HeroNode postOrderSearch(int no){
        HeroNode resNode = null;
        if (this.left != null){
            resNode= this.left.postOrderSearch(no);
        }
        if (resNode != null) return resNode;
        if (this.right != null){
            resNode= this.right.postOrderSearch(no);
        }
        if (resNode != null) return resNode;
        if (this.no == no) return this;
        return null;
    }

    //编写前序遍历方法
    public void preOrder(){
        System.out.println(this);//先输出父结点
        //递归向左子树前序遍历
        if (this.left != null){
            this.left.preOrder();

        }
        //递归向右子树前序遍历
        if (this.right!= null){
            this.right.preOrder();
        }
    }

    //编写中序遍历方法
    public void infixOrder(){
        //递归向左子树中序遍历
        if (this.left != null){
            this.left.infixOrder();
        }
        System.out.println(this);
        //递归向右子树中序遍历
        if (this.right!= null){
            this.right.infixOrder();
        }
    }

    //编写后序遍历方法
    public void postOrder(){
        //递归向左子树后序遍历
        if (this.left != null){
            this.left.postOrder();
        }
        //递归向右子树后序遍历
        if (this.right!= null){
            this.right.postOrder();
        }
        System.out.println(this);
    }
}
