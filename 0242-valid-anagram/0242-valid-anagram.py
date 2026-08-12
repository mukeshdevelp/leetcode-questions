class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        # if length is not equal return false
        if len(s) != len(t):
            return False
        # create a HashMap<letter, frequecy>
        countS, countT = {}, {}
        for i in range(len(s)):
            # if the value does not exist in hashmap ,default value is 0
            countS[s[i]] = 1+ countS.get(s[i], 0)
            countT[t[i]] = 1+ countT.get(t[i], 0)

        # iterate the map and check if the count is equal
        for c in countS:
            if countS[c] != countT.get(c,0):
                return False

        return True