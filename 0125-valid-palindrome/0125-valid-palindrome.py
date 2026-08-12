class Solution:
    def isPalindrome(self, s: str) -> bool:
        # 1. Clean the string
        processed_str = "".join(filter(str.isalnum, s)).lower()

        processed_str_length = len(processed_str)
        
        # Handle the edge case for empty strings or single characters
        if processed_str_length <= 1:
            return True

        half_length = processed_str_length // 2
        
        # 2. Setup your loop boundaries
        i = 0
        j = processed_str_length - 1
        
        first_str = ""
        second_str = ""
        
        # 3. Collect the first half
        for i in range(half_length):
            first_str = first_str + processed_str[i]
            
        # 4. FIXED: Stop before hitting the middle character on odd lengths
        # 'processed_str_length - half_length' ensures both strings get the exact same length
        while j >= (processed_str_length - half_length):
            second_str = second_str + processed_str[j]
            j -= 1

        # 5. Check if they match
        if first_str == second_str:
            return True
        else:
            return False
