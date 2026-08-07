---
title: "DgnImage"
linktitle: "DgnImage"
second_title: "Aspose.CAD for Java"
description: "Dgn image class"
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.dgn/dgnimage/
---

**Inheritance:** java.lang.Object, Image

Dgn image class

## Methods

| Method | Description |
| --- | --- |
| [getSubUnitType()](#getSubUnitType) | Gets current sub-unit type. |
| [isCached()](#isCached) | Gets a value indicating whether object's data is cached currently and no data reading is required. |
| [getVersion()](#getVersion) | Gets DGN version of loaded image |
| [getIs3DImage()](#getIs3DImage) | Gets a value indicating whether file is 3D or not |
| [getWidth()](#getWidth) | Gets the image width. |
| [getHeight()](#getHeight) | Gets the image height. |
| [getElements()](#getElements) | Gets elements were read from source file |
| [getTags()](#getTags) | Gets the tags. |
| [getMaxPoint()](#getMaxPoint) | Gets the max point. |
| [getMinPoint()](#getMinPoint) | Gets the min point. |
| [getViews()](#getViews) | Gets the views. |
| [cacheData()](#cacheData) | Caches the data and ensures no additional data loading will be performed from the underlying DataStreamSupporter.DataStreamContainer . |
| [getStrings()](#getStrings) | Gets all string values from image. |

### getSubUnitType() {#getSubUnitType}
```java
public int getSubUnitType()
```

Gets current sub-unit type.

**Returns:** int

### isCached() {#isCached}
```java
public final boolean isCached()
```

Gets a value indicating whether object's data is cached currently and no data reading is required.

**Returns:** boolean - true if object's data is cached; otherwise, false .

### getVersion() {#getVersion}
```java
public int getVersion()
```

Gets DGN version of loaded image

**Returns:** int

### getIs3DImage() {#getIs3DImage}
```java
public boolean getIs3DImage()
```

Gets a value indicating whether file is 3D or not

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

### getElements() {#getElements}
```java
public com.aspose.ms.System.Collections.ObjectModel.ReadOnlyCollection<DgnDrawingElementBase> getElements()
```

Gets elements were read from source file

**Returns:** com.aspose.ms.System.Collections.ObjectModel.ReadOnlyCollection<DgnDrawingElementBase>

### getTags() {#getTags}
```java
public final com.aspose.ms.System.Collections.ObjectModel.ReadOnlyCollection<DgnElement> getTags()
```

Gets the tags.

**Returns:** com.aspose.ms.System.Collections.ObjectModel.ReadOnlyCollection<DgnElement> - The tags.

### getMaxPoint() {#getMaxPoint}
```java
public Cad3DPoint getMaxPoint()
```

Gets the max point.

**Returns:** Cad3DPoint

### getMinPoint() {#getMinPoint}
```java
public Cad3DPoint getMinPoint()
```

Gets the min point.

**Returns:** Cad3DPoint

### getViews() {#getViews}
```java
public com.aspose.ms.System.Collections.ObjectModel.ReadOnlyCollection<DgnViewInfo> getViews()
```

Gets the views.

**Returns:** com.aspose.ms.System.Collections.ObjectModel.ReadOnlyCollection<DgnViewInfo> - The views.

### cacheData() {#cacheData}
```java
public final void cacheData()
```

Caches the data and ensures no additional data loading will be performed from the underlying DataStreamSupporter.DataStreamContainer .

### getStrings() {#getStrings}
```java
public String[] getStrings()
```

Gets all string values from image.

**Returns:** String[] - The array with string values.

