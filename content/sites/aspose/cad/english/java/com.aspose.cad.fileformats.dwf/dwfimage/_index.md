---
title: "DwfImage"
linktitle: "DwfImage"
second_title: "Aspose.CAD for Java"
description: "DWF image class"
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.dwf/dwfimage/
---

**Inheritance:** java.lang.Object, Image

DWF image class

## Methods

| Method | Description |
| --- | --- |
| [getPages()](#getPages) | Gets pages |
| [getLayers()](#getLayers) | Gets layers |
| [isCached()](#isCached) | Gets is image cached |
| [getWidth()](#getWidth) | Gets the image width. |
| [getHeight()](#getHeight) | Gets the image height. |
| [addElement(int pageNumber, DwfWhipDrawable element)](#addElement-int-com.aspose.cad.fileformats.dwf.whip.objects.drawable.DwfWhipDrawable) | Adds render able element to specified page |
| [removeElement(int pageNumber, int elementIndex)](#removeElement-int-int) | Removes element from specified page |
| [getElementCount(int pageNumber)](#getElementCount-int) | Gets count of render able elements from specified page |
| [cacheData()](#cacheData) | Caches data |
| [updateSize()](#updateSize) | Updates the size. |
| [getStrings()](#getStrings) | Gets all string values from image. |

### getPages() {#getPages}
```java
public final com.aspose.ms.System.Collections.ObjectModel.ReadOnlyCollection<DwfPage> getPages()
```

Gets pages

**Returns:** com.aspose.ms.System.Collections.ObjectModel.ReadOnlyCollection<DwfPage>

### getLayers() {#getLayers}
```java
public final DwfLayersList getLayers()
```

Gets layers

**Returns:** DwfLayersList

### isCached() {#isCached}
```java
public boolean isCached()
```

Gets is image cached

**Returns:** boolean

### getWidth() {#getWidth}
```java
public int getWidth()
```

Gets the image width.

**Returns:** int - The image width.

### getHeight() {#getHeight}
```java
public int getHeight()
```

Gets the image height.

**Returns:** int - The image height.

### addElement(int pageNumber, DwfWhipDrawable element) {#addElement-int-com.aspose.cad.fileformats.dwf.whip.objects.drawable.DwfWhipDrawable}
```java
public final void addElement(int pageNumber, DwfWhipDrawable element)
```

Adds render able element to specified page

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| pageNumber | int | Index of the page to add element to |
| element | DwfWhipDrawable | Element to be added |

### removeElement(int pageNumber, int elementIndex) {#removeElement-int-int}
```java
public final void removeElement(int pageNumber, int elementIndex)
```

Removes element from specified page

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| pageNumber | int | Index of page to remove element from |
| elementIndex | int | Index of element to be removed |

### getElementCount(int pageNumber) {#getElementCount-int}
```java
public final int getElementCount(int pageNumber)
```

Gets count of render able elements from specified page

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| pageNumber | int | Index of page to get count of elements from |

**Returns:** int - Count of render able elements in specified page

### cacheData() {#cacheData}
```java
public void cacheData()
```

Caches data

### updateSize() {#updateSize}
```java
public final void updateSize()
```

Updates the size.

### getStrings() {#getStrings}
```java
public String[] getStrings()
```

Gets all string values from image.

**Returns:** String[] - The array with string values.

