# 🌀 Definition & Purpose
#### What is HashSet?
* Java ka HashSet ek **collection class** hai jo **unique elements ko store karta** hai — duplicates allowed nahi. 
* Under the hood, ye [Hash Table](HASH_TABLE.md) use karta hai.
> Stores unique elements

#### Purpose
* CRUD operation on **unique items**
* Best for
  > Duplication Removal

  > Fast Search

  > Membership testing (element hai ya nahi)

**Non-linear data structure**
**[Dynamic](DYNAMIC_STATIC.md) memory** - memory auto-manage hoti hai.

**Memory Layout**:
→ Internally uses buckets (hashing + linked lists or trees) — pointer-based, **not contiguous**.

#### Speed 🆚 Flexibility:
⚡ Very fast (O(1) average) for add, remove, contains
😬 No ordering, no indexing, and not synchronized by default

# 🛠️ Syntax + Core Ops
##### Initialization
`HashSet<String> set = new HashSet<>();`

##### Core Operations
`set.add("A");`          // Insert
`set.remove("A");`       // Delete
`set.contains("A");`     // Search
`set.isEmpty();`         // Check empty
`set.size();`            // Count items

##### Traversal
```
for(String s : set) {
    System.out.println(s);
}
```

##### Important Built-in Methods:
* `add(E e)`
  * Insertion/Addition
  * ```
        HashSet<String> set = new HashSet<>();
        set.add("Ram"); // true
        set.add("Ram"); // false, already present

* `remove(Object o)`
  * Deletion
  * ```
    set.remove("Ram"); // true if present
    set.remove("Shyam"); // false if not present

* `contains(Object o)`
  * Searching
  * ```
    if(set.contains("Ram")) {
        System.out.println("Mil gaya Ram 😎");
    }

* `clear()`
  * Removes all data
  * `set.clear();`

* `iterator()`
  * Iterate/Traverse karne ke liye
  * ```
    Iterator<String> it = set.iterator();
    while(it.hasNext()) {
        System.out.println(it.next());
    }

# 🧪 Use Cases 
### Coding Patterns Using It:
* **Sliding Window** (e.g., longest substring without repeating chars)
* **BFS/DF**S visited tracking
* **Frequency counting** (via Set in Map)

# ⚠️ Common Pitfalls 
❌ **Inserting duplicate values** — they’ll silently be **ignored**
❌ **Modifying object** fields after adding — affects hashing
❌ Forgetting that order is NOT maintained
❌ Assuming thread safety — **it’s not synchronized**
❌ Comparing with List — **indexing doesn’t exist here**

# 🔎 Behind the Scenes
Uses a [HashMap](HASHMAP.md) under the hood — each value is a key in map with a dummy value

`private transient HashMap<E,Object> map;`

**Resizing**:
Happens automatically when load factor exceeds 0.75
New array of bigger size is created and elements are rehashed

**Backed by**:
✅ Hash table (array + linked list/red-black tree in buckets)

**Thread Safety:**
❌ Not thread-safe
Use `Collections.synchronizedSet()` ya `ConcurrentHashMap.newKeySet()` for multi-threading


# 💼 Interviews + Code Challenges
### Common Interview Questions:
* **Longest substring without repeating characters**
    * 
* **Detect duplicates in an array**
* **First non-repeating character**
* **Find intersection of two arrays**
* **Remove duplicates from a list**

#### From-Scratch Implementation:
✅ Yes — can implement simplified version using arrays & linked lists

#### Optimization Use:
✅ Replaces O(n) search with O(1)
→ Brute-force to optimal using Set

#### 3+ Variations:
* Custom HashSet for user-defined class (override `equals()` and `hashCode()`)
* Handling collisions via chaining
* Convert List to Set and back for duplicate removal

