package project.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import project.node.Node;

import java.util.ArrayList;
import java.util.Arrays;

public class Tree_Algo_Test {
    @Test
    public void inorderTest() {
        Node node1 = new Node(10);
        node1.left = new Node(11);
        node1.right = new Node(90);
        Tree_Algo treeAlgo1 = new Tree_Algo();
        ArrayList<Integer> inorder1 = new ArrayList<>();
        treeAlgo1.inorderTraversal(node1, inorder1);
        Assertions.assertEquals(inorder1, Arrays.asList(11, 10, 90));

        Tree_Algo treeAlgo2 = new Tree_Algo();
        ArrayList<Integer> inorder2 = new ArrayList<>();
        treeAlgo2.inorderTraversal(null, inorder2);
        Assertions.assertEquals(inorder2, new ArrayList<>());


    }

    @Test
    public void preorderTest() {
        Node node1 = new Node(10);
        node1.left = new Node(11);
        node1.right = new Node(90);
        Tree_Algo treeAlgo1 = new Tree_Algo();
        ArrayList<Integer> preorder1 = new ArrayList<>();
        treeAlgo1.preorderTraversal(node1, preorder1);
        Assertions.assertEquals(preorder1, Arrays.asList(10, 11, 90));

        Tree_Algo treeAlgo2 = new Tree_Algo();
        ArrayList<Integer> preorder2 = new ArrayList<>();
        treeAlgo2.preorderTraversal(null, preorder2);
        Assertions.assertEquals(preorder2, new ArrayList<>());

    }

    @Test
    public void postorderTest() {
        Node node1 = new Node(10);
        node1.left = new Node(11);
        node1.right = new Node(90);
        Tree_Algo treeAlgo1 = new Tree_Algo();
        ArrayList<Integer> postorder1 = new ArrayList<>();
        treeAlgo1.postorderTraversal(node1, postorder1);
        Assertions.assertEquals(postorder1, Arrays.asList(11, 90, 10));

        Tree_Algo treeAlgo2 = new Tree_Algo();
        ArrayList<Integer> postorder2 = new ArrayList<>();
        treeAlgo2.preorderTraversal(null, postorder2);
        Assertions.assertEquals(postorder2, new ArrayList<>());

    }

    @Test
    public void levelOrderTest() {
        Node node1 = new Node(10);
        node1.left = new Node(11);
        node1.right = new Node(90);
        node1.left.left = new Node(91);
        Tree_Algo treeAlgo1 = new Tree_Algo();
        ArrayList<Integer> levelOrder1 = new ArrayList<>();
        treeAlgo1.levelOrder(node1, levelOrder1);
        Assertions.assertEquals(levelOrder1, Arrays.asList(10, 11, 90, 91));

        Tree_Algo treeAlgo2 = new Tree_Algo();
        ArrayList<Integer> levelOrder2 = new ArrayList<>();
        treeAlgo2.levelOrder(null, levelOrder2);
        Assertions.assertEquals(levelOrder2, new ArrayList<>());
    }

    @Test
    public void maxDepthTest() {
        Node node1 = new Node(10);
        node1.left = new Node(11);
        node1.right = new Node(90);
        node1.left.left = new Node(91);
        Tree_Algo treeAlgo1= new Tree_Algo();
        Assertions.assertEquals(treeAlgo1.maxDepth(node1),3);

        Node node2 = new Node(10);
        node2.left = new Node(11);
        node2.right = new Node(90);
        Tree_Algo treeAlgo2 = new Tree_Algo();
        Assertions.assertEquals(treeAlgo2.maxDepth(node2), 2);

        Node node3 = new Node(10);
        node3.left = new Node(11);
        Tree_Algo treeAlgo3 = new Tree_Algo();
        Assertions.assertEquals(treeAlgo3.maxDepth(node3), 2);

        Node node4 = new Node(10);
        node4.right = new Node(90);
        Tree_Algo treeAlgo4 = new Tree_Algo();
        Assertions.assertEquals(treeAlgo4.maxDepth(node4), 2);

        Tree_Algo treeAlgo5 = new Tree_Algo();
        Assertions.assertEquals(treeAlgo5.maxDepth(null), 0);
    }

    @Test
    public void topViewTest() {
        Node node1 = new Node(10);
        node1.left = new Node(11);
        node1.right = new Node(90);
        node1.left.left = new Node(91);
        node1.left.right = new Node(97);
        Tree_Algo treeAlgo1 = new Tree_Algo();
        Assertions.assertEquals(treeAlgo1.topView(node1),new ArrayList<>(Arrays.asList(91, 11, 10, 90)));

        Node node2 = new Node(10);
        node2.left = new Node(11);
        node2.right = new Node(90);
        Tree_Algo treeAlgo2 = new Tree_Algo();
        Assertions.assertEquals(treeAlgo2.topView(node2),new ArrayList<>(Arrays.asList(11, 10, 90)));

        Node node3 = new Node(10);
        node3.left = new Node(11);
        Tree_Algo treeAlgo3 = new Tree_Algo();
        Assertions.assertEquals(treeAlgo3.topView(node3),new ArrayList<>(Arrays.asList(11, 10)));

        Node node4 = new Node(10);
        node4.right = new Node(90);
        Tree_Algo treeAlgo4 = new Tree_Algo();
        Assertions.assertEquals(treeAlgo4.topView(node4),new ArrayList<>(Arrays.asList(10, 90)));

        Tree_Algo treeAlgo5 = new Tree_Algo();
        Assertions.assertEquals(treeAlgo5.topView(null), new ArrayList<>());
    }

    @Test
    public void bottomViewTest() {

        Node node1 = new Node(10);
        node1.left = new Node(11);
        node1.right = new Node(90);
        node1.left.left = new Node(91);
        node1.left.right = new Node(97);
        Tree_Algo treeAlgo1 = new Tree_Algo();
        Assertions.assertEquals(treeAlgo1.bottomView(node1),new ArrayList<>(Arrays.asList(91, 11, 97, 90)));

        Node node2 = new Node(10);
        node2.left = new Node(11);
        node2.right = new Node(90);
        Tree_Algo treeAlgo2 = new Tree_Algo();
        Assertions.assertEquals(treeAlgo2.bottomView(node2),new ArrayList<>(Arrays.asList(11, 10, 90)));

        Node node3 = new Node(10);
        node3.left = new Node(11);
        Tree_Algo treeAlgo3 = new Tree_Algo();
        Assertions.assertEquals(treeAlgo3.bottomView(node3),new ArrayList<>(Arrays.asList(11, 10)));

        Node node4 = new Node(10);
        node4.right = new Node(90);
        Tree_Algo treeAlgo4 = new Tree_Algo();
        Assertions.assertEquals(treeAlgo4.bottomView(node4),new ArrayList<>(Arrays.asList(10, 90)));

        Tree_Algo treeAlgo5 = new Tree_Algo();
        Assertions.assertEquals(treeAlgo5.bottomView(null), new ArrayList<>());
    }


    @Test
    public void countNodesTest() {
        Node node1 = new Node(10);
        node1.left = new Node(11);
        node1.right = new Node(90);
        node1.left.left = new Node(91);
        Tree_Algo treeAlgo1 = new Tree_Algo();
        Assertions.assertEquals(treeAlgo1.countNodes(node1), 4);

        Node node2 = new Node(10);
        Tree_Algo treeAlgo2 = new Tree_Algo();
        Assertions.assertEquals(treeAlgo2.countNodes(node2), 1);

        Tree_Algo treeAlgo3 = new Tree_Algo();
        Assertions.assertEquals(treeAlgo3.countNodes(null), 0);

    }

    @Test
    public void maxWidthTest() {

        Node node1 = new Node(1);
        node1.left = new Node(3);
        node1.right = new Node(2);
        node1.left.left = new Node(5);
        node1.left.right = new Node(3);
        node1.right.right = new Node(9);
        Tree_Algo treeAlgo1 = new Tree_Algo();
        Assertions.assertEquals(treeAlgo1.widthOfBinaryTree(node1), 4);

        Node node2 = new Node(1);
        node2.left = new Node(3);
        node2.right = new Node(2);
        node2.right.right = new Node(9);
        Tree_Algo treeAlgo2 = new Tree_Algo();
        Assertions.assertEquals(treeAlgo2.widthOfBinaryTree(node2), 2);

        Tree_Algo treeAlgo3 = new Tree_Algo();
        Assertions.assertEquals(treeAlgo3.widthOfBinaryTree(null), 0);

    }

}
