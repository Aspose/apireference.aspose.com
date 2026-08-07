---
title: "ThumbnailResource"
linktitle: "ThumbnailResource"
second_title: "Aspose.CAD for Java"
description: "The thumbnail resource block."
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.psd.resources/thumbnailresource/
---

**Inheritance:** java.lang.Object, ResourceBlock

The thumbnail resource block.

## Constructors

| Constructor | Description |
| --- | --- |
| [ThumbnailResource()](#ThumbnailResource) | Initializes a new instance of the ThumbnailResource class. |

## Methods

| Method | Description |
| --- | --- |
| [getJpegOptions()](#getJpegOptions) | Gets or sets the JPEG options. Suitable when thumbnail resource is saved into JPEG file format only. This option has no effect when RAW format is defined. |
| [setJpegOptions(JpegOptions value)](#setJpegOptions-com.aspose.cad.imageoptions.JpegOptions) | Gets or sets the JPEG options. Suitable when thumbnail resource is saved into JPEG file format only. This option has no effect when RAW format is defined. |
| [getWidth()](#getWidth) | Gets or sets the width of thumbnail in pixels. |
| [setWidth(int value)](#setWidth-int) | Gets or sets the width of thumbnail in pixels. |
| [getHeight()](#getHeight) | Gets or sets the height of thumbnail in pixels. |
| [setHeight(int value)](#setHeight-int) | Gets or sets the height of thumbnail in pixels. |
| [getWidthBytes()](#getWidthBytes) | Gets the row width in bytes. |
| [getTotalSize()](#getTotalSize) | Gets the total data size. |
| [getSizeAfterCompression()](#getSizeAfterCompression) | Gets or sets the size after compression. Used for consistency check. |
| [getBitsPixel()](#getBitsPixel) | Gets or sets the bits pixel. |
| [setBitsPixel(short value)](#setBitsPixel-short) | Gets or sets the bits pixel. |
| [getPlanesCount()](#getPlanesCount) | Gets or sets the planes count. |
| [setPlanesCount(short value)](#setPlanesCount-short) | Gets or sets the planes count. |
| [getThumbnailArgb32Data()](#getThumbnailArgb32Data) | Gets or sets the 32-bit ARGB thumbnail data. |
| [setThumbnailArgb32Data(int[] value)](#setThumbnailArgb32Data-int:A) | Gets or sets the 32-bit ARGB thumbnail data. |
| [getThumbnailData()](#getThumbnailData) | Gets or sets the thumbnail data. |
| [setThumbnailData(com.aspose.cad.Color[] value)](#setThumbnailData-com.aspose.cad.Color:A) | Gets or sets the thumbnail data. |
| [getDataSize()](#getDataSize) | Gets the resource data size in bytes. |
| [getMinimalVersion()](#getMinimalVersion) | Gets the minimal required psd version. |
| [validateValues()](#validateValues) | Validates the resource values. |

### ThumbnailResource() {#ThumbnailResource}
```java
public ThumbnailResource()
```

Initializes a new instance of the ThumbnailResource class.

### getJpegOptions() {#getJpegOptions}
```java
public JpegOptions getJpegOptions()
```

Gets or sets the JPEG options. Suitable when thumbnail resource is saved into JPEG file format only. This option has no effect when RAW format is defined.

**Returns:** JpegOptions - The JPEG options.

### setJpegOptions(JpegOptions value) {#setJpegOptions-com.aspose.cad.imageoptions.JpegOptions}
```java
public void setJpegOptions(JpegOptions value)
```

Gets or sets the JPEG options. Suitable when thumbnail resource is saved into JPEG file format only. This option has no effect when RAW format is defined.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | JpegOptions | The JPEG options. |

### getWidth() {#getWidth}
```java
public int getWidth()
```

Gets or sets the width of thumbnail in pixels.

**Returns:** int - The thumbnail width.

### setWidth(int value) {#setWidth-int}
```java
public void setWidth(int value)
```

Gets or sets the width of thumbnail in pixels.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The thumbnail width. |

### getHeight() {#getHeight}
```java
public int getHeight()
```

Gets or sets the height of thumbnail in pixels.

**Returns:** int - The thumbnail height.

### setHeight(int value) {#setHeight-int}
```java
public void setHeight(int value)
```

Gets or sets the height of thumbnail in pixels.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The thumbnail height. |

### getWidthBytes() {#getWidthBytes}
```java
public int getWidthBytes()
```

Gets the row width in bytes.

**Returns:** int - The row width in bytes.

### getTotalSize() {#getTotalSize}
```java
public int getTotalSize()
```

Gets the total data size.

**Returns:** int - The total data size.

### getSizeAfterCompression() {#getSizeAfterCompression}
```java
public int getSizeAfterCompression()
```

Gets or sets the size after compression. Used for consistency check.

**Returns:** int - The size after compression.

### getBitsPixel() {#getBitsPixel}
```java
public short getBitsPixel()
```

Gets or sets the bits pixel.

**Returns:** short - The thumbnail bits pixel.

### setBitsPixel(short value) {#setBitsPixel-short}
```java
public void setBitsPixel(short value)
```

Gets or sets the bits pixel.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | short | The thumbnail bits pixel. |

### getPlanesCount() {#getPlanesCount}
```java
public short getPlanesCount()
```

Gets or sets the planes count.

**Returns:** short - The thumbnail planes count.

### setPlanesCount(short value) {#setPlanesCount-short}
```java
public void setPlanesCount(short value)
```

Gets or sets the planes count.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | short | The thumbnail planes count. |

### getThumbnailArgb32Data() {#getThumbnailArgb32Data}
```java
public int[] getThumbnailArgb32Data()
```

Gets or sets the 32-bit ARGB thumbnail data.

**Returns:** int[] - The 32-bit ARGB thumbnail data.

### setThumbnailArgb32Data(int[] value) {#setThumbnailArgb32Data-int:A}
```java
public void setThumbnailArgb32Data(int[] value)
```

Gets or sets the 32-bit ARGB thumbnail data.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int[] | The 32-bit ARGB thumbnail data. |

### getThumbnailData() {#getThumbnailData}
```java
public com.aspose.cad.Color[] getThumbnailData()
```

Gets or sets the thumbnail data.

**Returns:** com.aspose.cad.Color[] - The thumbnail data.

### setThumbnailData(com.aspose.cad.Color[] value) {#setThumbnailData-com.aspose.cad.Color:A}
```java
public void setThumbnailData(com.aspose.cad.Color[] value)
```

Gets or sets the thumbnail data.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | com.aspose.cad.Color[] | The thumbnail data. |

### getDataSize() {#getDataSize}
```java
public int getDataSize()
```

Gets the resource data size in bytes.

**Returns:** int - The resource data size.

### getMinimalVersion() {#getMinimalVersion}
```java
public int getMinimalVersion()
```

Gets the minimal required psd version.

**Returns:** int - The minimal psd version.

### validateValues() {#validateValues}
```java
public void validateValues()
```

Validates the resource values.

