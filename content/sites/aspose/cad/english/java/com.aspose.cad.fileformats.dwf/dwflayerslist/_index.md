---
title: "DwfLayersList"
linktitle: "DwfLayersList"
second_title: "Aspose.CAD for Java"
description: "Layer tables list"
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.dwf/dwflayerslist/
---

**All Implemented Interfaces:** com.aspose.ms.System.Collections.Generic.IGenericCollection, com.aspose.ms.System.Collections.Generic.IGenericEnumerable

Layer tables list

## Methods

| Method | Description |
| --- | --- |
| [iterator()](#iterator) | Enumeration of layers. |
| [getLayerByName(String name)](#getLayerByName-java.lang.String) | Gets first layer by name. |
| [getLayersByName(String name)](#getLayersByName-java.lang.String) | Gets layer by name. |
| [getLayersByNames(String[] layersNames)](#getLayersByNames-java.lang.String:A) | Gets layers by names. |
| [getLayersNames()](#getLayersNames) | Gets the layers names. |
| [addItem(DwfWhipLayer item)](#addItem-com.aspose.cad.fileformats.dwf.whip.objects.DwfWhipLayer) | Adds an item to the DwfLayersList |
| [clear()](#clear) | Removes all items from the DwfLayersList |
| [containsItem(DwfWhipLayer item)](#containsItem-com.aspose.cad.fileformats.dwf.whip.objects.DwfWhipLayer) | Determines whether the DwfLayersList contains a specific value. |
| [copyToTArray(DwfWhipLayer[] array, int arrayIndex)](#copyToTArray-com.aspose.cad.fileformats.dwf.whip.objects.DwfWhipLayer:A-int) | Copies the elements of DwfLayersList to an System.Array, starting at a particular System.Array index. |
| [removeItem(DwfWhipLayer item)](#removeItem-com.aspose.cad.fileformats.dwf.whip.objects.DwfWhipLayer) | Removes the first occurrence of a specific object from the DwfLayersList. |
| [size()](#size) | Gets the number of elements contained in the DwfLayersList. |
| [isReadOnly()](#isReadOnly) | Gets a value indicating whether the DwfLayersList is read-only. |

### iterator() {#iterator}
```java
public com.aspose.ms.System.Collections.Generic.IGenericEnumerator<DwfWhipLayer> iterator()
```

Enumeration of layers.

**Returns:** com.aspose.ms.System.Collections.Generic.IGenericEnumerator<DwfWhipLayer> - Enumerator of layers DwfWhipLayer

### getLayerByName(String name) {#getLayerByName-java.lang.String}
```java
public DwfWhipLayer getLayerByName(String name)
```

Gets first layer by name.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| name | String | The name of layer. |

**Returns:** DwfWhipLayer - The layer or null if layer with "name" does not exist in the collection DwfWhipLayer

### getLayersByName(String name) {#getLayersByName-java.lang.String}
```java
public com.aspose.ms.System.Collections.ObjectModel.ReadOnlyCollection<DwfWhipLayer> getLayersByName(String name)
```

Gets layer by name.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| name | String | The name of layer. |

**Returns:** com.aspose.ms.System.Collections.ObjectModel.ReadOnlyCollection<DwfWhipLayer> - The layers collection of DwfWhipLayer

### getLayersByNames(String[] layersNames) {#getLayersByNames-java.lang.String:A}
```java
public List<DwfWhipLayer> getLayersByNames(String[] layersNames)
```

Gets layers by names.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| layersNames | String[] | Array names of layers. |

**Returns:** List<DwfWhipLayer> - The list of DwfWhipLayer layer objects

### getLayersNames() {#getLayersNames}
```java
public List<String> getLayersNames()
```

Gets the layers names.

**Returns:** List<String> - The list of string layers names

### addItem(DwfWhipLayer item) {#addItem-com.aspose.cad.fileformats.dwf.whip.objects.DwfWhipLayer}
```java
public void addItem(DwfWhipLayer item)
```

Adds an item to the DwfLayersList

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| item | DwfWhipLayer | The object to add to the collection |

### clear() {#clear}
```java
public void clear()
```

Removes all items from the DwfLayersList

### containsItem(DwfWhipLayer item) {#containsItem-com.aspose.cad.fileformats.dwf.whip.objects.DwfWhipLayer}
```java
public boolean containsItem(DwfWhipLayer item)
```

Determines whether the DwfLayersList contains a specific value.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| item | DwfWhipLayer | the object to locate in the collection |

**Returns:** boolean - true if item is found in the collection otherwise false

### copyToTArray(DwfWhipLayer[] array, int arrayIndex) {#copyToTArray-com.aspose.cad.fileformats.dwf.whip.objects.DwfWhipLayer:A-int}
```java
public void copyToTArray(DwfWhipLayer[] array, int arrayIndex)
```

Copies the elements of DwfLayersList to an System.Array, starting at a particular System.Array index.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| array | DwfWhipLayer[] | the one-dimensional array that is the destination of the elements copied |
| arrayIndex | int | the zero-based index in array at which copying begins |

### removeItem(DwfWhipLayer item) {#removeItem-com.aspose.cad.fileformats.dwf.whip.objects.DwfWhipLayer}
```java
public boolean removeItem(DwfWhipLayer item)
```

Removes the first occurrence of a specific object from the DwfLayersList.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| item | DwfWhipLayer | item to remove from collection |

**Returns:** boolean - Result of removing

### size() {#size}
```java
public int size()
```

Gets the number of elements contained in the DwfLayersList.

**Returns:** int

### isReadOnly() {#isReadOnly}
```java
public boolean isReadOnly()
```

Gets a value indicating whether the DwfLayersList is read-only.

**Returns:** boolean

