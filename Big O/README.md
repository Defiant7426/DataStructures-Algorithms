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

# 2. Scalability

Now we will include the start and end times of the program to calculate the duration.

```python
import time
ocean = ["Nemo"]

def findNemo(array):
  start = time.time()
  for i in range(len(array)):
    if array[i] == "Nemo":
      print("Found Nemo!")
  end = time.time()
  print(f"To find Memo took {(end - start)*1000} miliseconds")
findNemo(ocean)
```

Output:

![Untitled](Big%20O%20a0f5642960314f0db71e3226e2e3afbb/Untitled.png)

This program is very fast because the array only has one element.

❓ Is it okay to measure program performance this way?

No, the reason is that this method depends on the software executed on the machine. We need to find something that does not depend on the hardware but rather only on the logic of the program.

# 3. O(n)

To evaluate the performance of an algorithm independent of machine-specific factors, we use Big O notation. Big O notation describes the upper bound of an algorithm's running time, allowing us to understand its worst-case complexity.

![Untitled](Big%20O%20a0f5642960314f0db71e3226e2e3afbb/Untitled%201.png)

In our previous example, the iterator is linear because the number of operations increases as the number of elements in the array grows. Our previous example is clearly an example of O(n).

# 4. O(1)

O(1) describes an algorithm that has a constant time complexity, meaning that the running time of the algorithm does not change regardless of the size of the input data. An example of this would be accessing a specific element in an array by its index.

```python
def getFistElement(array):
  return array[0] # O(1)
  
Ocean = ["Memo", "Dory", "Marlin"]

print(getFistElement(Ocean)) #O(1)
```

In this example, the function `getFirstElement` retrieves the first element of the array, and this operation takes constant time, O(1), regardless of the array's size.

If we have more operations in the method this way:

```python
def getFistElement(array):
  print(array[0]) # O(1)
  print(array[1]) # O(1)
  
Ocean = ["Memo", "Dory", "Marlin"]

getFistElement(Ocean) # O(2)
```

Even though there are two O(1) operations, the overall time complexity remains O(1) because the number of operations does not scale with the size of the input array.

## Exercise 1:

```jsx
// What is the Big O of the below function? (Hint, you may want to go line by line)
function funChallenge(input) {
  let a = 10;
  a = 50 + 3;

  for (let i = 0; i < input.length; i++) {
    anotherFunction();
    let stranger = true;
    a++;
  }
  return a;
}
```

Solution:

```jsx
// What is the Big O of the below function? (Hint, you may want to go line by line)
function funChallenge(input) {
  let a = 10; // O(1)
  a = 50 + 3; // O(1)

  for (let i = 0; i < input.length; i++) { // O(n)
    anotherFunction(); // O(n)
    let stranger = true; // O(n)
    a++; // O(n)
  }
  return a; // O(1)
}
```

The `funChallenge` function has the following time complexity:

- The first two operations (`let a = 10;` , `a = 50 + 3;` and `return a;`) are constant time operations, O(1).
- The `for` loop runs `input.length` times, and within each iteration, there are constant time operations: `for`, `anotherFunction()`, `let stranger = true;`, and `a++`. This makes the loop O(n).

Therefore, the overall time complexity is O(3 + 4n).

## Exercise 2:

```jsx
// What is the Big O of the below function? (Hint, you may want to go line by line)
function anotherFunChallenge(input) {
    let a = 5; 
    let b = 10; 
    let c = 50; 
    for (let i = 0; i < input; i++) { 
      let x = i + 1; 
      let y = i + 2; 
      let z = i + 3; 

    }
    for (let j = 0; j < input; j++) { 
      let p = j * 2; 
      let q = j * 2; 
    }
    let whoAmI = "I don't know"; 
  }
```

Solution:

```jsx
// What is the Big O of the below function? (Hint, you may want to go line by line)
function anotherFunChallenge(input) {
    let a = 5; // O(1)
    let b = 10; // O(1)
    let c = 50; // O(1)
    for (let i = 0; i < input; i++) { // O(n)
      let x = i + 1; // O(n)
      let y = i + 2; // O(n)
      let z = i + 3; // O(n)

    }
    for (let j = 0; j < input; j++) { // O(n)
      let p = j * 2; // O(n)
      let q = j * 2; // O(n) 
    }
    let whoAmI = "I don't know"; // O(1)
  }
```

The `anotherFunChallenge` function has a time complexity of O(4 + 7n), which simplifies to O(n).

# 5. Big O Rules

## Rule 1: Worst case

When analyzing the time complexity of an algorithm, we always consider the worst-case scenario. This helps us ensure that the algorithm will perform efficiently even under the most challenging conditions.

In our Nemo example , the worst-case scenario occurs when "Nemo" is at the last position in the array or not present at all. In both cases, the function has to iterate through the entire array, resulting in a time complexity of O(n).

## Rule 2: Remove Constants

When expressing Big O notation, we ignore constant factors. For example, O(2n) simplifies to O(n) because constants do not significantly affect the growth rate of the function.

## Rule 3: Different terms for inputs

When an algorithm has different inputs, we must consider each input separately. For example, if a function processes two separate arrays, its time complexity would be O(a + b), where 'a' and 'b' are the lengths of the arrays.

## Rule 4: Drop Non-Dominant Terms

In Big O notation, we only keep the term with the highest growth rate, as it dominates the overall complexity. For example, O(n^2 + n) simplifies to O(n^2).