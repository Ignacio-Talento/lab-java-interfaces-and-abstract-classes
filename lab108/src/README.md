IntList Implementation
This project implements the IntList interface with two different strategies for expanding capacity:

IntArrayList: Grows by 50% when full (default initial capacity: 10)
IntVector: Doubles in size when full (default initial capacity: 20)

Usage Example
javapublic class Main {
public static void main(String[] args) {
// Using IntArrayList
IntList arrayList = new IntArrayList();
for (int i = 0; i < 20; i++) {
arrayList.add(i);
}

        // Using IntVector
        IntList vector = new IntVector();
        for (int i = 0; i < 30; i++) {
            vector.add(i);
        }
        
        // Retrieving values
        System.out.println("Value at index 5 in arrayList: " + arrayList.get(5));
        System.out.println("Value at index 10 in vector: " + vector.get(10));
    }
}
Efficiency Comparison
When IntArrayList is More Efficient
IntArrayList is more efficient in the following scenarios:

Memory Efficiency for Incremental Growth: When adding elements one by one without knowing the final size in advance, IntArrayList uses memory more efficiently. Since it grows by only 50% each time (compared to doubling), it wastes less memory when resizing.
Scenarios with Slow, Steady Growth: For applications where the list grows slowly but steadily and memory usage needs to be managed carefully, the smaller growth factor of IntArrayList (50%) results in less unused capacity.
Memory-Constrained Environments: In systems with limited memory resources, IntArrayList's more conservative growth pattern minimizes excess capacity.

When IntVector is More Efficient
IntVector is more efficient in the following scenarios:

Rapid Growth Scenarios: When the list is expected to grow very quickly, IntVector's doubling strategy results in fewer resize operations. Each resize operation requires creating a new array and copying all elements, which is computationally expensive.
Performance-Critical Applications: Where the performance cost of resizing operations is more important than memory usage, IntVector performs fewer resizing operations for the same number of elements added.
Known Large Final Size: When you know the list will eventually become very large, but don't know the exact size upfront, IntVector reaches the required capacity with fewer resize operations.
Batch Processing: When adding many elements at once, IntVector is likely to require fewer resize operations, resulting in better amortized performance.

Performance Analysis
For n insertions:

IntArrayList (growing by 50%): O(n) time with approximately O(log₁.₅ n) resize operations
IntVector (growing by 100%): O(n) time with approximately O(log₂ n) resize operations

While both implementations have the same asymptotic time complexity for insertions, IntVector performs fewer resize operations, making it faster for rapid growth, while IntArrayList wastes less memory on unused capacity.