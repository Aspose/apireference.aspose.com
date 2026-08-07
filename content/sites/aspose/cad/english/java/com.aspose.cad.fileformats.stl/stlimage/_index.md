---
title: "StlImage"
linktitle: "StlImage"
second_title: "Aspose.CAD for Java"
description: "STL image class."
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.stl/stlimage/
---

**Inheritance:** java.lang.Object, Image

STL image class.

## Constructors

| Constructor | Description |
| --- | --- |
| [StlImage()](#StlImage) |  |

## Methods

| Method | Description |
| --- | --- |
| [getFacets()](#getFacets) | Gets or sets the image facet objects. |
| [setFacets(List<TriangularFacet> value)](#setFacets-java.util.List) | Gets or sets the image facet objects. |
| [isCached()](#isCached) | Gets a value indicating whether object's data is cached currently and no data reading is required. Value: true if object's data is cached; otherwise, false . |
| [cacheData()](#cacheData) | Caches the data and ensures no additional data loading will be performed from the underlying P:Aspose.CAD.DataStreamSupporter.DataStreamContainer . |
| [getWidth()](#getWidth) | Gets the image width. Prints drawing's width Image drawing = ... System.Console.WriteLine("Drawing's width: " + drawing.Width); Value: The image width. |
| [getHeight()](#getHeight) | Gets the image height. Prints drawing's height Image drawing = ... System.Console.WriteLine("Drawing's height: " + drawing.Height); Value: The image height. |

### StlImage() {#StlImage}
```java
public StlImage()
```

### getFacets() {#getFacets}
```java
public final List<TriangularFacet> getFacets()
```

Gets or sets the image facet objects.

**Returns:** List<TriangularFacet>

### setFacets(List<TriangularFacet> value) {#setFacets-java.util.List}
```java
public final void setFacets(List<TriangularFacet> value)
```

Gets or sets the image facet objects.

### isCached() {#isCached}
```java
public boolean isCached()
```

Gets a value indicating whether object's data is cached currently and no data reading is required. Value: true if object's data is cached; otherwise, false .

**Returns:** boolean

### cacheData() {#cacheData}
```java
public void cacheData()
```

Caches the data and ensures no additional data loading will be performed from the underlying P:Aspose.CAD.DataStreamSupporter.DataStreamContainer .

### getWidth() {#getWidth}
```java
public int getWidth()
```

Gets the image width. Prints drawing's width Image drawing = ... System.Console.WriteLine("Drawing's width: " + drawing.Width); Value: The image width.

**Returns:** int - The image width.

### getHeight() {#getHeight}
```java
public int getHeight()
```

Gets the image height. Prints drawing's height Image drawing = ... System.Console.WriteLine("Drawing's height: " + drawing.Height); Value: The image height.

**Returns:** int - The image height.

