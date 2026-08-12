class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        """
        1. create a hashmap<letterFreqCount, List<Anagram>
        2. loop in the str and add them in the hashmap
        3. return the values of the hashmap
        """
        # create a dictionary or hashmap
        res = defaultdict(list)

        for s in strs:
            # fill all the count with 0
            count = [0] * 26 # a to z

            for c in s:
                # change the chars in ascii value and put them in the index -> a-0, b-1, c-3. ord function does it. 82-80 = 2. c 's index
                count[ord(c) - ord("a")] += 1 
            # append them in res hashmap
            res[tuple(count)].append(s)
        # return all values of the hashmaps
        return res.values()