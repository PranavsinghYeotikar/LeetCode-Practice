# 🌀 Definition & Purpose
## Definition:
- Stack ek **linear data structure** hai jo **LIFO** (Last In First Out) principle follow karta hai.

## Why Created:
- Simple data management jaha 
  - **order maintain karna hai** aur
  -  **latest item pehle chahiye**.
- Function calls, undo-redo, backtracking, etc.

## Best Suited Problems:
- **Expression evaluation** (postfix, prefix)
- **Undo operations** in editors
- **Function call management** (call stack)

**Linear** 
**Dynamic**: Java ka Stack dynamic hota hai (automatically grow/shrink)

## Memory Layout:
- Mostly **contiguous** (array-backed) in Java implementation, but linked-list version bhi possible.

## Key Trade-offs:
- **Speed**: Fast for push/pop (O(1))
- **Flexibility**: Only **one-end access**, random access slow

## Modern Variants:
- `ArrayDeque` (faster, recommended over Stack class)
- Custom stacks using `LinkedList`

****


# 🛠️ Syntax + Core Ops

## Create & Initialize:
`Stack<Integer> stack = new Stack<>();`

## Core Operations:
- Push (Insert): `stack.push(item)`
- Pop (Delete top): `stack.pop()`
- Peek (Access top without remove): `stack.peek()`
- Search: `stack.search(item)` → returns position from top

### Traversal:
```java
for(Integer item : stack) {
    System.out.println(item);
}
```

## Important Built-in Methods:
- `push(E item)`
- `pop()`
- `peek()`
- `isEmpty()`
- `search(Object o)`
- `size()`
 
## Time & Space Complexity:
- Push/Pop/Peek → O(1)
- Search → O(n)
- Space → O(n) for n elements

## Memory/Resizing:
- Yes, **handles automatically** — internally backed by Vector (dynamic array).


****


# 🧪 Use Cases
- Undo/Redo in editors 📝
- Browser back/forward navigation 🌐
- Function call stack in programming
- Balanced parentheses check
- DFS (Depth First Search) algorithms

### Patterns:
- DFS
- Backtracking
- Reverse traversal

### Real-life Software Systems:
- Compiler’s syntax parsing
- IDE’s code navigation
- Game state management

****

# ⚠️ Common Pitfalls 
- Empty pop: **`pop()` on empty stack** → `EmptyStackException`
- Forgetting `isEmpty()` **check before pop/peek**
- Using Stack where Queue needed → **wrong logic**
- Not fast for search

### Interview caution:
- Always check for empty conditions
- Don’t mix up LIFO with FIFO

****

# ⚙️ Related Concepts (Connections)
- Related: **Queue, Deque, LinkedList, ArrayList**
- Pick Stack over others when **latest element priority** is needed
- Can build using **Array or Linked List**
- Hybrid: **MinStack, Two-Stack Queue**

# 🔎 Behind the Scenes (Internals)
``` mermaid
flowchart TD
    A[Java Stack] -->  B[extends Vector] -->  C[dynamic array inside]
```
- **Resizing**: doubles capacity when full
- Backed by array (contiguous memory)
- Thread-safety: `Stack` methods are **synchronized** (slower), use `ArrayDeque` for faster single-thread performance