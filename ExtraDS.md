# List<List<>>

## **1️⃣ What is List<List<>>?**
It’s a nested list —

- **Outer List** → holds multiple Inner Lists.

- **Each Inner List** can hold elements of the type you specify (like String, Integer, etc.).

Example:
`List<List<String>> matrix = new ArrayList<>();`

Here:

- `matrix.get(0)` → gives you the **first inner list**.

- `matrix.get(0).get(1)` → gives you the **second element of the first inner list**.

## **2️⃣ Basic Operations**
### Create
```
List<List<Integer>> outer = new ArrayList<>();
outer.add(new ArrayList<>()); // First inner list
outer.add(new ArrayList<>()); // Second inner list
```

### Insert (Add elements)
```
outer.get(0).add(10); // Add to first inner list
outer.get(1).add(20); // Add to second inner list


outer.add(Arrays.asList(30, 40, 50)); // Add a whole list directly
```


### Access
```
int firstElem = outer.get(0).get(0); // First element of first inner list
List<Integer> secondList = outer.get(1); // Get whole second inner list
```

### Update
```
outer.get(0).set(0, 99); // Update first element in first inner list
```

### Remove
```
outer.get(0).remove(1); // Remove element at index 1 from first inner list
outer.remove(1);        // Remove whole second inner list
```

### Iterate
```
for (List<Integer> inner : outer) {
    for (Integer val : inner) {
        System.out.print(val + " ");
    }
}
```