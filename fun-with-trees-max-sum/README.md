# [Fun with trees: max sum](https://www.codewars.com/kata/57e5279b7cf1aea5cf000359)

- **Completed at:** 2023-11-07T07:43:23.298Z

- **Completed languages:** java

- **Tags:** Trees, Recursion, Binary Trees, Binary Search Trees, Data Structures, Algorithms

- **Rank:** 6 kyu

## Description

You are given a binary tree. Implement the method **maxSum** which returns the maximal sum of a route from root to leaf.
For example, given the following tree:
```
    17
   /  \
  3   -10
 /    /  \
2    16   1
         /
        13
```

The method should return 23, since [17,-10,16] is the route from root to leaf with the maximal sum.

Return `0` if the tree is empty.

Please note that you are not to find the *best possible route* in the tree, but the best possible route **from root to leaf**, e.g. for the following tree, you cannot skip the leaves and return `15`: the expected answer is `5 + 4 + -60 = -51`
```
        5
      /   \
    4       10
  /   \     /
-80  -60  -90
```
The class TreeNode is available for you:

```java
class TreeNode {
    TreeNode left;
    TreeNode right;
    int value;
    ...
}
```
```csharp
class TreeNode
{
    public TreeNode left;
    public TreeNode right;
    public int value;
    ...
}
```
```cpp
class TreeNode
{
    public:
        TreeNode* left;
        TreeNode* right;
        int value;
    ...
};
```
```c
typedef struct TreeNode {
    int value;
    struct TreeNode *left, *right;
} TreeNode;
```
```javascript
class TreeNode {
    constructor(value, left = null, right = null) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
```
```haskell
data TreeNode = Node TreeNode Int TreeNode | Leaf Int | None
```
```scala
case class TreeNode(
  value: Int, 
  left: Option[TreeNode] = None, 
  right: Option[TreeNode] = None
)
```


This kata is part of [fun with trees](https://www.codewars.com/collections/fun-with-trees) series:

* [Fun with trees: max sum](https://www.codewars.com/kata/57e5279b7cf1aea5cf000359)
* [Fun with trees: array to tree](https://www.codewars.com/kata/57e5a6a67fbcc9ba900021cd)
* [Fun with trees: is perfect](https://www.codewars.com/kata/57dd79bff6df9b103b00010f)