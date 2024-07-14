# Big O

# 1. What is a goo code?

Good code can be described in two points: Readable and Scalable.

Readable code is easy to understand, which makes it easier to maintain and debug. Scalable code can handle increased loads and can be extended with minimal effort.

## For example

We will write a function to find Nemo.

```python
ocean = ["Nemo"]

def findNemo(array):
  for i in range(len(array)):
    if array[i] == "Nemo":
      print("Found Nemo!")

findNemo(ocean)
```

The function `findNemo` iterates through the list `array` and checks each element to see if it matches "Nemo". If it finds "Nemo", it prints "Found Nemo!". This function demonstrates a simple linear search with a time complexity of O(n), where n is the number of elements in the list.