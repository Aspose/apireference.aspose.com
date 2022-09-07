---
title: XpsArray
second_title: Aspose.Page for Java API Reference
description: Class incapsulating common XPS model array object features.
type: docs
weight: 13
url: /java/com.aspose.xps/xpsarray/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject)
```
public abstract class XpsArray<T> extends XpsObject
```

Class incapsulating common XPS model array object features.
## Methods

| Method | Description |
| --- | --- |
| [add(T obj)](#add-T-) | Adds a new object into array. |
| [remove(T obj)](#remove-T-) | Removes an object from array. |
| [insert(int index, T obj)](#insert-int-T-) | Inserts a new object into array at specified position. |
| [removeAt(int index)](#removeAt-int-) | Removes an object from array at specified position. |
| [get(int i)](#get-int-) | Provides access to array's element by index \`\`\` i \`\`\`. |
| [size()](#size--) | Returns number of elements. |
### add(T obj) {#add-T-}
```
public T add(T obj)
```


Adds a new object into array.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| obj | T | The object to add. |

**Returns:**
T - Added object.
### remove(T obj) {#remove-T-}
```
public T remove(T obj)
```


Removes an object from array.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| obj | T | The object to remove. |

**Returns:**
T - Removed object.
### insert(int index, T obj) {#insert-int-T-}
```
public T insert(int index, T obj)
```


Inserts a new object into array at specified position.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | The position to insert an object at. |
| obj | T | The object to insert. |

**Returns:**
T - Inserted object.
### removeAt(int index) {#removeAt-int-}
```
public T removeAt(int index)
```


Removes an object from array at specified position.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | The position to remove an object at. |

**Returns:**
T - Removed object.
### get(int i) {#get-int-}
```
public T get(int i)
```


Provides access to array's element by index \`\`\` i \`\`\`.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| i | int | Index of the element. |

**Returns:**
T - The element at \`\`\` i \`\`\` position.
### size() {#size--}
```
public int size()
```


Returns number of elements.

**Returns:**
int - The number of elements.
