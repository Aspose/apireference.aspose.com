---
title: "ColladaImage"
linktitle: "ColladaImage"
second_title: "Aspose.CAD for Java"
description: "COLLADA image"
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.collada/colladaimage/
---

**Inheritance:** java.lang.Object, Image

COLLADA image

## Constructors

| Constructor | Description |
| --- | --- |
| [ColladaImage(Collada colladaData)](#ColladaImage-com.aspose.cad.fileformats.collada.fileparser.elements.Collada) | Initializes a new instance of the ColladaImage class. |

## Methods

| Method | Description |
| --- | --- |
| [isCached()](#isCached) | Gets a value indicating whether object's data is cached currently and no data reading is required. Value: true if object's data is cached; otherwise, false . |
| [getWidth()](#getWidth) | Gets the image width. Prints drawing's width Image drawing = ... System.Console.WriteLine("Drawing's width: " + drawing.Width); Value: The image width. |
| [getHeight()](#getHeight) | Gets the image height. Prints drawing's height Image drawing = ... System.Console.WriteLine("Drawing's height: " + drawing.Height); Value: The image height. |
| [cacheData()](#cacheData) | Caches the data and ensures no additional data loading will be performed from the underlying DataStreamSupporter.DataStreamContainer ( DataStreamSupporter.getDataStreamContainer() / ). |

### ColladaImage(Collada colladaData) {#ColladaImage-com.aspose.cad.fileformats.collada.fileparser.elements.Collada}
```java
public ColladaImage(Collada colladaData)
```

Initializes a new instance of the ColladaImage class.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| colladaData | Collada | The COLLADA data. |

### isCached() {#isCached}
```java
public boolean isCached()
```

Gets a value indicating whether object's data is cached currently and no data reading is required. Value: true if object's data is cached; otherwise, false .

**Returns:** boolean

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

### cacheData() {#cacheData}
```java
public void cacheData()
```

Caches the data and ensures no additional data loading will be performed from the underlying DataStreamSupporter.DataStreamContainer ( DataStreamSupporter.getDataStreamContainer() / ).

