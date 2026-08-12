# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def levelOrder(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: List[List[int]]
        """
        # create a res variable to store the final result
        res = []
        # if root has no element return res
        if(not root):
            return res
        # create a queue
        q = collections.deque()
        # add the root in the queue
        q.append(root)
        # terminating if q is null
        while(q):
            # create a list for adding one level in the tree into the queue
            same_level = []
            # until q's length
            for i in range(len(q)):
                # pop the nodes from starting of the queue
                node = q.popleft()
                # apppend the same level to gather all ndoes
                same_level.append(node.val)
                # if left is not null
                if node.left:
                    # append in final ans
                    q.append(node.left)
                # if right is not null    
                if node.right:
                    # append it in the the q
                    q.append(node.right)
            # append the level in the res variable
            res.append(same_level)
        # return the final res
        return res

