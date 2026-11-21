class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        unique_ints = set()
        for i in nums:
            if i in unique_ints:
                return True;
            unique_ints.add(i)
        return False
        