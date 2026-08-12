class Solution(object):
    def topKFrequent(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: List[int]
        """
        """
        1. create max heap where key = number of occurences
        2. pop from heap k times
        3. now you will get your top k element
        ##########
        O(n) time
        1. use bucket sort
        2. index = count, values = [] of numbers. for ex - at index 0 we will put the list of numbers which occur 0 times and so on
        3. return the last index where some list occured of the array i.e. size of array
        O(n) time
        """

        # 1 is stored in index 3, 2 is stored in index 2, 3 is stored at index 1
        # create a hashmap to find the occurences
        count = {}

        # freq array for bucket sort
        freq = [[] for i in range(len(nums) + 1 )]
        # incrementing the count of current element
        for n in nums:
            count[n] = 1 + count.get(n, 0)
        # appending i
        for n, c in count.items():
            # this value n comes c times in the array
            freq[c].append(n)
        res = []
        # traversing the freq list
        for i in range(len(freq)-1, 0, -1):
            for n in freq[i]:
                res.append(n)
                if len(res) == k:
                    return res
