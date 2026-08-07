---
title: "CF2Image"
linktitle: "CF2Image"
second_title: "Aspose.CAD for Java"
description: "CFF2 image class"
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.cf2/cf2image/
---

**Inheritance:** java.lang.Object, Image

CFF2 image class

## Constructors

| Constructor | Description |
| --- | --- |
| [CF2Image()](#CF2Image) | Initializes a new instance of the CF2Image class |

## Methods

| Method | Description |
| --- | --- |
| [isCached()](#isCached) | Gets is image cached |
| [getMaxPoint()](#getMaxPoint) | Gets the max point. |
| [getMinPoint()](#getMinPoint) | Gets the min point. |
| [getHeight()](#getHeight) | Gets the image height. |
| [getWidth()](#getWidth) | Gets the image width. |
| [getOrderSecton()](#getOrderSecton) | Gets the order secton. |
| [getAuxSecton()](#getAuxSecton) | Gets the aux secton. |
| [getMainSecton()](#getMainSecton) | Gets the main secton. |
| [getSubSectons()](#getSubSectons) | Gets the sub sectons. |
| [getLineTypeColors()](#getLineTypeColors) | Colors of the line types. |
| [getOrderOutputDescribing()](#getOrderOutputDescribing) | Description of the order section output |
| [setOrderOutputDescribing(CF2OrderOutputDescribing value)](#setOrderOutputDescribing-com.aspose.cad.fileformats.cf2.CF2OrderOutputDescribing) | Description of the order section output |
| [getLinesOutputDescribing()](#getLinesOutputDescribing) | Description of the line types output |
| [setLinesOutputDescribing(CF2LinesOutputDescribing value)](#setLinesOutputDescribing-com.aspose.cad.fileformats.cf2.CF2LinesOutputDescribing) | Description of the line types output |
| [loadMessageFile(String filePath)](#loadMessageFile-java.lang.String) | Loads a message file from the specified path. |
| [loadMessageFile(InputStream stream)](#loadMessageFile-java.io.InputStream) | Loads a message file from the specified stream. |
| [cacheData()](#cacheData) | Caches data |
| [updateSize()](#updateSize) | Update size |
| [getStrings()](#getStrings) | Gets all string values from image. |

### CF2Image() {#CF2Image}
```java
public CF2Image()
```

Initializes a new instance of the CF2Image class

### isCached() {#isCached}
```java
public boolean isCached()
```

Gets is image cached

**Returns:** boolean

### getMaxPoint() {#getMaxPoint}
```java
public final Cad3DPoint getMaxPoint()
```

Gets the max point.

**Returns:** Cad3DPoint

### getMinPoint() {#getMinPoint}
```java
public final Cad3DPoint getMinPoint()
```

Gets the min point.

**Returns:** Cad3DPoint

### getHeight() {#getHeight}
```java
public int getHeight()
```

Gets the image height.

**Returns:** int - The image height.

### getWidth() {#getWidth}
```java
public int getWidth()
```

Gets the image width.

**Returns:** int - The image width.

### getOrderSecton() {#getOrderSecton}
```java
public final CF2Order getOrderSecton()
```

Gets the order secton.

**Returns:** CF2Order - The order section.

### getAuxSecton() {#getAuxSecton}
```java
public final CF2Aux getAuxSecton()
```

Gets the aux secton.

**Returns:** CF2Aux - The aux section.

### getMainSecton() {#getMainSecton}
```java
public final CF2Main getMainSecton()
```

Gets the main secton.

**Returns:** CF2Main - The main section.

### getSubSectons() {#getSubSectons}
```java
public final List<CF2Sub> getSubSectons()
```

Gets the sub sectons.

**Returns:** List<CF2Sub> - The sub sections.

### getLineTypeColors() {#getLineTypeColors}
```java
public final com.aspose.ms.System.Collections.Generic.Dictionary<Integer,com.aspose.foundation.drawing.DrColor> getLineTypeColors()
```

Colors of the line types.

**Returns:** com.aspose.ms.System.Collections.Generic.Dictionary<Integer,com.aspose.foundation.drawing.DrColor> - The colors of the line types.

### getOrderOutputDescribing() {#getOrderOutputDescribing}
```java
public final CF2OrderOutputDescribing getOrderOutputDescribing()
```

Description of the order section output

**Returns:** CF2OrderOutputDescribing

### setOrderOutputDescribing(CF2OrderOutputDescribing value) {#setOrderOutputDescribing-com.aspose.cad.fileformats.cf2.CF2OrderOutputDescribing}
```java
public final void setOrderOutputDescribing(CF2OrderOutputDescribing value)
```

Description of the order section output

### getLinesOutputDescribing() {#getLinesOutputDescribing}
```java
public final CF2LinesOutputDescribing getLinesOutputDescribing()
```

Description of the line types output

**Returns:** CF2LinesOutputDescribing

### setLinesOutputDescribing(CF2LinesOutputDescribing value) {#setLinesOutputDescribing-com.aspose.cad.fileformats.cf2.CF2LinesOutputDescribing}
```java
public final void setLinesOutputDescribing(CF2LinesOutputDescribing value)
```

Description of the line types output

### loadMessageFile(String filePath) {#loadMessageFile-java.lang.String}
```java
public final void loadMessageFile(String filePath)
```

Loads a message file from the specified path.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| filePath | String | The file path of the message file. |

### loadMessageFile(InputStream stream) {#loadMessageFile-java.io.InputStream}
```java
public final void loadMessageFile(InputStream stream)
```

Loads a message file from the specified stream.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| stream | InputStream | The stream of the message file. |

### cacheData() {#cacheData}
```java
public void cacheData()
```

Caches data

### updateSize() {#updateSize}
```java
public final void updateSize()
```

Update size

### getStrings() {#getStrings}
```java
public String[] getStrings()
```

Gets all string values from image.

**Returns:** String[] - The array with string values.

