def insertionSort(arr):
    print(arr)
    for i in range(1, len(arr)): 
        key = arr[i] 
        j = i-1
        print( "key = " , key)
        while j >= 0 and key < arr[j] :
            arr[j + 1] = arr[j] 
            j = j-1
            print( arr )
        arr[j + 1] = key
        print(arr)
  
arr = [12, 11, 13, 5, 6] 
insertionSort(arr) 
