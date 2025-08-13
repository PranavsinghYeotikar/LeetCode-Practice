# 📘 HASHMAP.md

# ⚔️ HashMap vs Hashtable 
| Feature            | 🧠 `HashMap`                                      | 🛡️ `Hashtable`                       |
| ------------------ | ------------------------------------------------- | ------------------------------------- |
| **Thread Safety**  | ❌ Not thread-safe                                 | ✅ Thread-safe (synchronized)          |
| **Speed**          | ⚡ Faster (no sync overhead)                       | 🐢 Slower (synchronization lag)       |
| **Nulls Allowed?** | ✅ `1 null` key, multiple null values allowed      | ❌ No null keys or values              |
| **Modern Usage?**  | ✅ YES! Commonly used in new code                  | ❌ Deprecated in vibe, still works tho |
| **Legacy?**        | 🌱 Introduced in Java 1.2 (Collections Framework) | 🧓 From Java 1.0 (Old-school)         |
| **Subclass Of**    | `AbstractMap`                                     | `Dictionary` (Legacy class)           |
| **Iterator**       | `Iterator` (fail-fast)                            | `Enumeration` (not fail-fast)         |


## 🌀 Definition & Purpose

Hash Table ek aisa data structure hai jo **key-value pairs** ko store karta hai.

🧩 Example:

```java
"Panya" → Key
"98234xxxxx" → Value
```

Aisa pairs mein data store karta hai — aur **O(1) time** mein access deta hai.

📌 Use hota hai jab:

* Username → Profile dhoondhna ho
* Word frequency count karna ho
* Caching, login systems mein **fast access** chahiye ho

📦 Structure:

* **Non-linear**
* **Dynamic** (size badhta hai automatically)
* Memory mein **random (pointer-based)** jagah pe store hota hai — not contiguous

---

## 🛠️ Syntax + Internals

```java
HashMap<KeyType, ValueType> map = new HashMap<>(size);
map.put("apple", 3);
int count = map.get("apple");
```

### 🔩 Working:

* **Hash Function:** Key ko ek number (index) mein convert karta hai
* **Array:** Us index pe value store hoti hai
* **Collisions:** Jab do keys same index pe aaye:

  * **Chaining (LinkedList):** values ek ke baad ek us bucket mein store hoti hain
  * **Open Addressing:** agla khaali spot dhoondte hain (rarely used in Java)

---

## 🎯 Use Cases

| Purpose                                                          | Use this Data Structure | Why?                                             |
| ---------------------------------------------------------------- | ----------------------- | ------------------------------------------------ |
| Just want to check **if a value exists** (e.g., “Does 7 exist?”) | `HashSet<Integer>`      | Fastest lookup, O(1)                             |
| Want to **map value to something** (like its index)              | `HashMap<Value, Info>`  | Allows you to get associated data                |
| Want to **get element by index** (like `arr[2]`)                 | `ArrayList` or arrays   | Index-based access                               |
| Want to store **key-value pairs** and also be **thread-safe**    | `Hashtable`             | Like `HashMap` but synchronized (old Java style) |


* Login systems: `userID → password`
* Word count apps
* Fast data access apps (caches, auto-fill)
* Backend storage for HashSet, Map etc.

---

## ⚠️ Common Pitfalls

* ❌ Galat hash function → collisions badhate hain → slow access
* ❌ **Mutable keys mat do** (object change hone par key milti nahi)

📌 Mutable keys == keys jo change ho sakti hain after insertion

HashMap kaam kaise karta hai:

1. `hashCode()` nikalta hai → bucket decide hota hai
2. `equals()` check karta hai sahi key ke liye
3. Agar key object modify ho gaya:

   * `hashCode()` badal jaata hai
   * Key purane bucket mein nahi milti
   * Value exist karti hai but access nahi hota (ghost data 😱)

* ❌ Memory zyada lagta hai jab size control na ho
* ⚠️ Hashtable thread-safe hai but slow hai → HashMap fast but not thread-safe

---

## 🧠 Behind the Scenes

* Java pehle key ka `hashCode()` calculate karta hai

  > Example: "Naruto" → `hashCode = 123456` → bucket no. 5
* Fir bitwise operations se better index nikalta hai (kam collision ke liye)
* Agar table ka **load factor > 0.75** ho gaya:

  * Example: 10 buckets hain, 8 full → load = 0.8
  * Table resize hoti hai → **rehashing**
  * Saari purani entries naye index par daali jaati hain (slow but necessary)

🚀 Why rehashing?

* To maintain speed and avoid collision chains

### Java 8 Upgrade:

* Agar kisi bucket mein zyada elements (8+) ho gaye:

  * Pehle: linked list
  * Now: Red-Black Tree 🌲
  * Search time: O(n) → O(log n)

---

## 🧩 Interview + Coding Questions

### 🔥 Famous Questions:

* Two Sum
* Group Anagrams
* Top K Frequent Elements
* Design LRU Cache

### 🎯 Interview Topics:

* Collision handling
* Chaining vs Treeifying
* Custom `hashCode()` and `equals()`
* Handling mutable keys

### 🛠 Custom Implementation:

```java
Entry[] table = new Entry[5];

// Structure:
table[0] → [Key1, Val1]  
table[1] → null  
table[2] → [Key2, Val2] → [Key3, Val3]  (linked list due to collision)  
table[3] → null  
table[4] → [Key4, Val4]
```

---

## 📊 Time & Memory Complexity

### Time:

| Operation | Time     |
| --------- | -------- |
| put()     | O(1) avg |
| get()     | O(1) avg |
| remove()  | O(1) avg |

> Worst-case: O(n) (agar collisions zyada ho gaye)

### Memory:

* Array
* Key-value objects
* List ya Tree for collisions

---

