# [Fun with trees: array to tree](https://www.codewars.com/kata/57e5a6a67fbcc9ba900021cd)

- **Completed at:** 2023-11-07T17:22:42.055Z

- **Completed languages:** java

- **Tags:** Trees, Arrays, Binary Trees, Data Structures, Algorithms

- **Rank:** 5 kyu

## Description

You are given a non-null array of integers. Implement the method **arrayToTree** which creates a binary tree from its values in accordance to their order, while creating nodes by depth from left to right.

For example, given the array `[17, 0, -4, 3, 15]` you should create the following tree:
```
    17
   /  \
  0   -4
 / \
3   15 
```

The class TreeNode is available for you:

```java
class TreeNode {

    TreeNode left;
    TreeNode right;
    int value;
    
    TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
    
    TreeNode(int value) {
        this(value, null, null);
    }
    
    @Override
    public boolean equals(Object other) {
        ... // Already implemented for you and used in test cases 
    }
    ...
}
```
```csharp
class TreeNode {

    public TreeNode left;
    public TreeNode right;
    public int value;
    
    public TreeNode(int value, TreeNode left, TreeNode right)
    {
        this.value = value;
        this.left = left;
        this.right = right;
    }
    
    public TreeNode(int value) 
    {
        this.value = value;
    }
    
    public override bool Equals(Object other)
    {
        ... // Already implemented for you and used in test cases 
    }
    ...
}
```
```cpp
class TreeNode 
{
  public:
    TreeNode(int value, TreeNode* left, TreeNode* right)
      : m_value(value), m_left(left), m_right(right)
    {
    }
    
    TreeNode(int value)
      : m_value(value), m_left(NULL), m_right(NULL)
    {
    }
    
    bool operator==(const TreeNode& rhs) const
    {
        ... // Already implemented for you and used in test cases 
    }
    ...
}
```
```javascript
var TreeNode = function(value, left, right) {
  this.value = value;
  this.left = left;
  this.right = right;
};
```
```c
typedef struct TreeNode {
	struct TreeNode *left, *right;
	int value;
} TreeNode;
```
```python
class Node:
    def __init__(self, value, left=None, right=None):
        self.value = value
        self.left = left
        self.right = right
```


This kata is part of [fun with trees](https://www.codewars.com/collections/fun-with-trees) series:

* [Fun with trees: max sum](https://www.codewars.com/kata/57e5279b7cf1aea5cf000359)
* [Fun with trees: array to tree](https://www.codewars.com/kata/57e5a6a67fbcc9ba900021cd)
* [Fun with trees: is perfect](https://www.codewars.com/kata/57dd79bff6df9b103b00010f)