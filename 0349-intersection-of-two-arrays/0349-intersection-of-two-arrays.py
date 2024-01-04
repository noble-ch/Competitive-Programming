class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        intersect = []
        for num1 in nums1:
            if not num1 in intersect:
                if num1 in nums2:
                    intersect.append(num1)
                    
        return intersect
        
        