def quicksort(arr):
	if len(arr) <= 1:
		return arr
	pivot = arr[len(arr) // 2]
	left = [x for x in arr if x < pivot]
	mid = [x for x in arr if x == pivot]
	right = [x for x in arr if x > pivot]
	return quicksort(left) + mid + quicksort(right)

print(quicksort([9, -3, 5, 2, 6, 8, -6, 1, 3]))
