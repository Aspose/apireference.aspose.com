---
title: "IgesImage"
linktitle: "IgesImage"
second_title: "Aspose.CAD for Java"
description: "IGES Image class"
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.iges/igesimage/
---

**Inheritance:** java.lang.Object, Image

IGES Image class

## Methods

| Method | Description |
| --- | --- |
| [getDrawables()](#getDrawables) | Gets geometric representation of the document |
| [getHeight()](#getHeight) | Gets Image height |
| [getWidth()](#getWidth) | Gets Image width |
| [isCached()](#isCached) | Gets a value indicating whether object's data is cached currently and no data readig is required. |
| [cacheData()](#cacheData) | Caches the data and ensures no additional data loading will be performed from the underlying DataStreamSupporter.DataStreamContainer . |
| [getStrings()](#getStrings) | Gets all string values from image. |

### getDrawables() {#getDrawables}
```java
public IDrawable[][] getDrawables()
```

Gets geometric representation of the document

**Returns:** IDrawable[][] - First order array is document's pages, second is geometry for page

### getHeight() {#getHeight}
```java
public int getHeight()
```

Gets Image height

**Returns:** int - Image height

### getWidth() {#getWidth}
```java
public int getWidth()
```

Gets Image width

**Returns:** int - Image width

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

### getStrings() {#getStrings}
```java
public String[] getStrings()
```

Gets all string values from image.

**Returns:** String[] - The array with string values.

