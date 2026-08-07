---
title: "NonGenericList"
linktitle: "NonGenericList"
second_title: "Aspose.CAD for Java"
description: "Non generic list of objects"
type: docs
weight: 10
url: /java/com.aspose.cad/nongenericlist/
---

**All Implemented Interfaces:** com.aspose.ms.System.Collections.IList

Non generic list of objects

## Constructors

| Constructor | Description |
| --- | --- |
| [NonGenericList(com.aspose.ms.System.Collections.Generic.List list)](#NonGenericList-com.aspose.ms.System.Collections.Generic.List) | Initializes a new instance of the NonGenericList class. |

## Methods

| Method | Description |
| --- | --- |
| [addItem(Object value)](#addItem-java.lang.Object) | Adds an item to the T:System.Collections.IList . |
| [clear()](#clear) | Removes all items from the T:System.Collections.IList . |
| [contains(Object value)](#contains-java.lang.Object) | Determines whether the T:System.Collections.IList contains a specific value. |
| [indexOf(Object value)](#indexOf-java.lang.Object) | Determines the index of a specific item in the T:System.Collections.IList . |
| [insertItem(int index, Object value)](#insertItem-int-java.lang.Object) | Inserts an item to the T:System.Collections.IList at the specified index. |
| [isFixedSize()](#isFixedSize) | Gets a value indicating whether the T:System.Collections.IList has a fixed size. |
| [isReadOnly()](#isReadOnly) | Gets a value indicating whether the T:System.Collections.IList is read-only. |
| [get_Item(int index)](#get_Item-int) | Gets or sets the element at the specified index. |
| [set_Item(int index, Object value)](#set_Item-int-java.lang.Object) | Gets or sets the element at the specified index. |
| [removeItem(Object value)](#removeItem-java.lang.Object) | Removes the first occurrence of a specific object from the T:System.Collections.IList . |
| [removeAt(int index)](#removeAt-int) | Removes the T:System.Collections.IList item at the specified index. |
| [copyTo(com.aspose.ms.System.Array array, int index)](#copyTo-com.aspose.ms.System.Array-int) | Copies the elements of the T:System.Collections.ICollection to an T:System.Array , starting at a particular T:System.Array index. |
| [size()](#size) | Gets the number of elements contained in the T:System.Collections.ICollection . |
| [isSynchronized()](#isSynchronized) | Gets a value indicating whether access to the T:System.Collections.ICollection is synchronized (thread safe). |
| [getSyncRoot()](#getSyncRoot) | Gets an object that can be used to synchronize access to the T:System.Collections.ICollection . |
| [iterator()](#iterator) | Returns an enumerator that iterates through a collection. |

### NonGenericList(com.aspose.ms.System.Collections.Generic.List list) {#NonGenericList-com.aspose.ms.System.Collections.Generic.List}
```java
public NonGenericList(com.aspose.ms.System.Collections.Generic.List list)
```

Initializes a new instance of the NonGenericList class.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| list | com.aspose.ms.System.Collections.Generic.List | The list - container of objects. |

### addItem(Object value) {#addItem-java.lang.Object}
```java
public int addItem(Object value)
```

Adds an item to the T:System.Collections.IList .

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Object | The T:System.Object to add to the T:System.Collections.IList . |

**Returns:** int - The position into which the new element was inserted.

### clear() {#clear}
```java
public void clear()
```

Removes all items from the T:System.Collections.IList .

### contains(Object value) {#contains-java.lang.Object}
```java
public boolean contains(Object value)
```

Determines whether the T:System.Collections.IList contains a specific value.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Object | The T:System.Object to locate in the T:System.Collections.IList . |

**Returns:** boolean - true if the T:System.Object is found in the T:System.Collections.IList ; otherwise, false.

### indexOf(Object value) {#indexOf-java.lang.Object}
```java
public int indexOf(Object value)
```

Determines the index of a specific item in the T:System.Collections.IList .

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Object | The T:System.Object to locate in the T:System.Collections.IList . |

**Returns:** int - The index of value if found in the list; otherwise, -1.

### insertItem(int index, Object value) {#insertItem-int-java.lang.Object}
```java
public void insertItem(int index, Object value)
```

Inserts an item to the T:System.Collections.IList at the specified index.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| index | int | The zero-based index at which value should be inserted. |
| value | Object | The T:System.Object to insert into the T:System.Collections.IList . |

### isFixedSize() {#isFixedSize}
```java
public boolean isFixedSize()
```

Gets a value indicating whether the T:System.Collections.IList has a fixed size.

**Returns:** boolean

### isReadOnly() {#isReadOnly}
```java
public boolean isReadOnly()
```

Gets a value indicating whether the T:System.Collections.IList is read-only.

**Returns:** boolean

### get_Item(int index) {#get_Item-int}
```java
public Object get_Item(int index)
```

Gets or sets the element at the specified index.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| index | int | The index. |

**Returns:** Object - Object.

### set_Item(int index, Object value) {#set_Item-int-java.lang.Object}
```java
public void set_Item(int index, Object value)
```

Gets or sets the element at the specified index.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| index | int | The index. |

### removeItem(Object value) {#removeItem-java.lang.Object}
```java
public void removeItem(Object value)
```

Removes the first occurrence of a specific object from the T:System.Collections.IList .

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Object | The T:System.Object to remove from the T:System.Collections.IList . |

### removeAt(int index) {#removeAt-int}
```java
public void removeAt(int index)
```

Removes the T:System.Collections.IList item at the specified index.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| index | int | The zero-based index of the item to remove. |

### copyTo(com.aspose.ms.System.Array array, int index) {#copyTo-com.aspose.ms.System.Array-int}
```java
public void copyTo(com.aspose.ms.System.Array array, int index)
```

Copies the elements of the T:System.Collections.ICollection to an T:System.Array , starting at a particular T:System.Array index.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| array | com.aspose.ms.System.Array | The one-dimensional T:System.Array that is the destination of the elements copied from T:System.Collections.ICollection . The T:System.Array must have zero-based indexing. |
| index | int | The zero-based index in array at which copying begins. |

### size() {#size}
```java
public int size()
```

Gets the number of elements contained in the T:System.Collections.ICollection .

**Returns:** int

### isSynchronized() {#isSynchronized}
```java
public boolean isSynchronized()
```

Gets a value indicating whether access to the T:System.Collections.ICollection is synchronized (thread safe).

**Returns:** boolean

### getSyncRoot() {#getSyncRoot}
```java
public Object getSyncRoot()
```

Gets an object that can be used to synchronize access to the T:System.Collections.ICollection .

**Returns:** Object

### iterator() {#iterator}
```java
public com.aspose.ms.System.Collections.IEnumerator iterator()
```

Returns an enumerator that iterates through a collection.

**Returns:** com.aspose.ms.System.Collections.IEnumerator - An T:System.Collections.IEnumerator object that can be used to iterate through the collection.

