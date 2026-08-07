---
title: "IfcImage"
linktitle: "IfcImage"
second_title: "Aspose.CAD for Java"
description: "Ifc Image class"
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.ifc/ifcimage/
---

**Inheritance:** java.lang.Object, Image

Ifc Image class

## Methods

| Method | Description |
| --- | --- |
| [getEntities()](#getEntities) | Gets the entities. Value: The entities. |
| [getLayers()](#getLayers) | Gets list of layers in image |
| [isCached()](#isCached) | Gets a value indicating whether object's data is cached currently and no data readig is required. |
| [cacheData()](#cacheData) | Caches the data and ensures no additional data loading will be performed from the underlying DataStreamSupporter.DataStreamContainer . |
| [getWidth()](#getWidth) | Gets the image width. |
| [getHeight()](#getHeight) | Gets the image height. |
| [getDepth()](#getDepth) | Gets the depth. |
| [getStrings()](#getStrings) | Gets all string values from image. |

### getEntities() {#getEntities}
```java
public final HashMap<Integer,IIfcEntity> getEntities()
```

Gets the entities. Value: The entities.

**Returns:** HashMap<Integer,IIfcEntity>

### getLayers() {#getLayers}
```java
public final com.aspose.ms.System.Collections.Generic.IGenericList<String> getLayers()
```

Gets list of layers in image

**Returns:** com.aspose.ms.System.Collections.Generic.IGenericList<String>

### isCached() {#isCached}
```java
public boolean isCached()
```

Gets a value indicating whether object's data is cached currently and no data readig is required.

**Returns:** boolean - true if object's data is cached; otherwise, false .

### cacheData() {#cacheData}
```java
public void cacheData()
```

Caches the data and ensures no additional data loading will be performed from the underlying DataStreamSupporter.DataStreamContainer .

**Throws:**

- `com.aspose.ms.System.NotImplementedException` - com.aspose.ms.System.NotImplementedException

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

### getDepth() {#getDepth}
```java
public final int getDepth()
```

Gets the depth.

**Returns:** int - The depth.

### getStrings() {#getStrings}
```java
public String[] getStrings()
```

Gets all string values from image.

**Returns:** String[] - The array with string values.

