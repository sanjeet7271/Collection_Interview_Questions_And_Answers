## How Hashtable works internally
Hashtable is a legacy synchronized Map implementation. Internally, it uses an array of buckets where each bucket stores Entry nodes containing hash, key, value, and next references. During put(), it calculates the key's hash, finds the bucket index, and inserts the entry. If multiple keys map to the same bucket, it handles collisions using a linked list. During get(), it computes the same bucket index and traverses the linked list to find the matching key using hash and equals(). Unlike HashMap, Hashtable is thread-safe, does not allow null keys or values, and does not use Red-Black Trees for collision optimization.

                    put(key,value)
                          |
                          v
                   key.hashCode()
                          |
                          v
                  Calculate hash
                          |
                          v
                 Calculate index
                          |
                          v
                   table[index]
                          |
               +----------+----------+
               |                     |
            Empty                 Occupied
               |                     |
               v                     v
         Create Entry         Compare hash/key
                                     |
                           +---------+---------+
                           |                   |
                        Same key           Different key
                           |                   |
                           v                   v
                     Replace value       Collision
                                             |
                                             v
                                      Linked List

<img width="1024" height="1536" alt="ChatGPT Image Aug 16, 2026, 04_03_29 PM" src="https://github.com/user-attachments/assets/867eb91e-65f5-414c-a007-5367756fe530" />

## How HashMap Works Internally

HashMap internally uses an array of buckets. It calculates a hash from the key, derives a bucket index, and stores entries as nodes. Collisions are handled using a linked list, and in modern Java a heavily populated bucket can be converted into a Red-Black Tree. HashMap resizes when its size crosses the load-factor threshold, and average get()/put() performance is O(1).

### HashMap internal working — in few lines

1. **HashMap uses an array of buckets** internally.
2. When `put(key, value)` is called, it calculates the key's **hashCode()** and determines the bucket index.
3. The key-value pair is stored as a **Node** in that bucket.
4. If multiple keys go to the same bucket (**collision**), Java 8+ uses a **LinkedList**, which can become a **Red-Black Tree** for heavy collisions.
5. During `get(key)`, HashMap calculates the same hash/index and uses **hash + equals()** to find the value.
6. When entries exceed **capacity × load factor (default 16 × 0.75 = 12)**, HashMap resizes and redistributes the entries.

**Interview one-liner:**

> “HashMap stores key-value pairs in an array of buckets, uses `hashCode()` to locate the bucket and `equals()` to identify the key; collisions are handled by a linked list/tree, giving average **O(1)** lookup.”

<img width="1536" height="1024" alt="ChatGPT Image Aug 16, 2026, 03_37_07 PM" src="https://github.com/user-attachments/assets/dc676597-62f5-4ff9-973c-c294aec7a043" />

<img width="1024" height="1536" alt="ChatGPT Image Aug 16, 2026, 03_42_02 PM" src="https://github.com/user-attachments/assets/4ea5e9ee-f834-4d42-964c-42a5f54a4954" />
