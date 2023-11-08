import java.util.Arrays;

public class Solution {
  
    static TreeNode arrayToTree(int[] array) {
        if (array == null || array.length == 0){
          return null;
        }

            int[] arraynew = new int[array.length + 1];
            arraynew[0] = 0;
            for(int i =0; i< array.length; i++){
              arraynew[i+1] = array[i];
              }

        TreeNode tree = new TreeNode(arraynew[1]);

        return CreateSub(tree, arraynew,1);
    }

    static TreeNode CreateSub(TreeNode node, int[] array, int index) {
        

        if (index*2+1 > array.length){
            if(index >= array.length){
                return null;
            }
            TreeNode newNode = new TreeNode(array[index]);
            return newNode;
        }
        else{
            TreeNode newNode = new TreeNode(array[index]);
            newNode.left = CreateSub(newNode.left,array,index*2);
            newNode.right = CreateSub(newNode.right,array,index*2 + 1);
            return newNode;

       }
    }

}

  
  
  
  