"""
Problem: 283. Move Zeros (easy)
The goal is to move all zeros towards the end of a list inplace. 
Since we know we have to deal with only zeros in this case, we can move all the data from index 0 then append rest of the array with 0.

"""
def move_zeros(nums):
    num_index = 0
    for id in range(len(nums)):
        if nums[id] != 0:
            nums[num_index] = nums[id]
            num_index +=1
    for id in range(num_index, len(nums)):
        nums[id] = 0
    return nums
     


nums = [0,1,0,3,4,5,9,0,5]

print(move_zeros(nums))
            