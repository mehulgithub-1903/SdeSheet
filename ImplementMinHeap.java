/*
    Time complexity: O( N * log( N ) )
    Space complexity: O( N )

    Where N is the size of heap array.
*/

public class Solution {

    // Left child of the node.
    static int left(int k) {
        return 2 * k + 1;
    }

    // Right child of the node.
    static int right(int k) {
        return 2 * k + 2;
    }

    // Returns the parent node.
    static int parent(int k) {
        return (k - 1) / 2;
    }

    // Heapify the heap
    static void heapify(int[] heap, int k, int size) {

        // Find the left child of the node.
        int l = left(k);

        // Find the right child of the node.
        int r = right(k);

        // Find the smallest element between the current node and its children.
        // Check if the left child is smallest.
        int smallest = k;

        if (l < size && heap[l] < heap[k]) {
            smallest = l;
        }

        // Check if the right node is smallest then the previous smallest.
        if (r < size && heap[r] < heap[smallest]) {
            smallest = r;
        }

        // If the smallest element is not in the current node.
        // We have to heapify the Heap to take that element to the top.
        if (smallest != k) {

            // Swap the values of current node and the smallest node value.
            int tempp = heap[k];
            heap[k] = heap[smallest];
            heap[smallest] = tempp;

            // Call the heapify function on smallest value node which now contains the value of parent node.
            heapify(heap, smallest, size);
        }
    }

    static int sz;

    // Insert a val in the heap.
// Function contains heap array, val to inserted and the current size of the heap.
    static void insert(int[] heap, int val) {

        // Insert the val at the end of the heap.
        heap[sz] = val;

        // If There is nore than 1 node in the Heap.
        // MinHeapify the heap by checking the val at its parent node.
        // Also do it until the heap property is not satisfied.
        int i = sz;

        sz += 1;

        while (i != 0 && heap[parent(i)] > heap[i]) {

            // Swap the value of current node with its parent.
            int tmp = heap[i];
            heap[i] = heap[parent(i)];
            heap[parent(i)] = tmp;

            // Check that if the parent element of current element is satisfying the heap property.
            i = parent(i);
        }
    }

    static int extractMin(int[] heap) {

        // Check if the current node is the only node in the heap.
        if (sz == 1) {
            sz -= 1;
            return heap[0];
        }

        // Takeout the min value and remove it from the heap.
        int val = heap[0];

        // Put last node on the top of heap.
        heap[0] = heap[sz - 1];

        // Decrease the size of heap as the minimum element is removed.
        sz -= 1;

        // Heapify the heap to satisfy the heap property.
        heapify(heap, 0, sz);

        return val;
    }

    // minHeap function which take size of Queries and Queries as Input.
// Returns an array out outputs depending on the query.
    static int[] minHeap(int n, int[][] q) {

        int size = 0;

        int[] heap = new int[n];

        // Define an array which stores the min elements.
        int tot = 0;
        for(int i=0;i<n;i++){
            if(q[i][0]==1)tot++;
        }

        int[] ans = new int[tot];
        int id = 0;

        // For each query in the array Q.
        for (int i = 0; i < n; i++) {

            // If query is of type 1 then insert the value in the heap.
            // Else take min element from the heap and append it in the ans.
            if (q[i][0] == 0) {
                sz = size;
                insert(heap, q[i][1]);
                size = sz;
            } else {
                sz = size;
                ans[id++] = extractMin(heap);
                size = sz;
            }
        }

        // Return the ans array.
        return ans;
    }
}