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


