---
title: "PltImage"
linktitle: "PltImage"
second_title: "Aspose.CAD for Java"
description: "PLT image class."
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.plt/pltimage/
---

**Inheritance:** java.lang.Object, Image

PLT image class.

## Methods

| Method | Description |
| --- | --- |
| [isCached()](#isCached) | Gets a value indicating whether object's data is cached currently and no data reading is required. Value: true if object's data is cached; otherwise, false . |
| [getWidth()](#getWidth) | Gets the image width. Value: The image width. |
| [getHeight()](#getHeight) | Gets the image height. Value: The image height. |
| [getPages()](#getPages) | Gets pages |
| [cacheData()](#cacheData) | Caches the data and ensures no additional data loading will be performed from the underlying DataStreamSupporter.DataStreamContainer ( DataStreamSupporter.getDataStreamContainer() ). |
| [getStrings()](#getStrings) | Gets all string values from image. |

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

Gets the image width. Value: The image width.

**Returns:** int - The image width.

### getHeight() {#getHeight}
```java
public int getHeight()
```

Gets the image height. Value: The image height.

**Returns:** int - The image height.

### getPages() {#getPages}
```java
public final List<com.aspose.foundation.rendering.ApsPage> getPages()
```

Gets pages

**Returns:** List<com.aspose.foundation.rendering.ApsPage>

### cacheData() {#cacheData}
```java
public void cacheData()
```

Caches the data and ensures no additional data loading will be performed from the underlying DataStreamSupporter.DataStreamContainer ( DataStreamSupporter.getDataStreamContainer() ).

### getStrings() {#getStrings}
```java
public String[] getStrings()
```

Gets all string values from image.

**Returns:** String[] - The array with string values.

