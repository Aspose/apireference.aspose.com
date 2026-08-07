---
title: "ASJpeg2000ExportConfigurationImpl"
linktitle: "ASJpeg2000ExportConfigurationImpl"
second_title: "Aspose.CAD for JasperReports"
description: "The JPEG 2000 file format export configuration."
type: docs
weight: 10
url: /jasperreports/com.aspose.cad.jasperreports.jpg2000/asjpeg2000exportconfigurationimpl/
---

**Inheritance:** java.lang.Object, ImageExportConfigurationImpl

**All Implemented Interfaces:** ASJpeg2000ExportConfiguration

The JPEG 2000 file format export configuration.

## Constructors

| Constructor | Description |
| --- | --- |
| [ASJpeg2000ExportConfigurationImpl()](#ASJpeg2000ExportConfigurationImpl) | Initializes a new instance of the Jpeg2000Options class. |

## Methods

| Method | Description |
| --- | --- |
| [getComments()](#getComments) | Gets or sets the Jpeg comment markers. |
| [setComments(String[] value)](#setComments-java.lang.String:A) | Gets or sets the Jpeg comment markers. |
| [getCodec()](#getCodec) | Gets or sets the JPEG2000 codec |
| [setCodec(Jpeg2000CodecEnum value)](#setCodec-com.aspose.cad.jasperreports.jpg2000.Jpeg2000CodecEnum) | Gets or sets the JPEG2000 codec |
| [getCompressionRatios()](#getCompressionRatios) | Gets or sets the Array of compression ratio. Different compression ratios for successive layers. The rate specified for each quality level is the desired compression factor. Decreasing ratios required. |
| [setCompressionRatios(int[] value)](#setCompressionRatios-int:A) | Gets or sets the Array of compression ratio. Different compression ratios for successive layers. The rate specified for each quality level is the desired compression factor. Decreasing ratios required. |
| [getIrreversible()](#getIrreversible) | Gets a value indicating whether use the irreversible DWT 9-7 (true) or use lossless DWT 5-3 compression (default). |
| [setIrreversible(boolean value)](#setIrreversible-boolean) | Sets a value indicating whether use the irreversible DWT 9-7 (true) or use lossless DWT 5-3 compression (default). |

### ASJpeg2000ExportConfigurationImpl() {#ASJpeg2000ExportConfigurationImpl}
```java
public ASJpeg2000ExportConfigurationImpl()
```

Initializes a new instance of the Jpeg2000Options class.

### getComments() {#getComments}
```java
public String[] getComments()
```

Gets or sets the Jpeg comment markers.

**Returns:** String[] - The Jpeg comment markers.

### setComments(String[] value) {#setComments-java.lang.String:A}
```java
public void setComments(String[] value)
```

Gets or sets the Jpeg comment markers.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String[] | The Jpeg comment markers. |

### getCodec() {#getCodec}
```java
public Jpeg2000CodecEnum getCodec()
```

Gets or sets the JPEG2000 codec

**Returns:** Jpeg2000CodecEnum - The JPEG2000 codec

**See Also:** `Jpeg2000CodecEnum`

### setCodec(Jpeg2000CodecEnum value) {#setCodec-com.aspose.cad.jasperreports.jpg2000.Jpeg2000CodecEnum}
```java
public void setCodec(Jpeg2000CodecEnum value)
```

Gets or sets the JPEG2000 codec

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Jpeg2000CodecEnum | The JPEG2000 codec |

**See Also:** `Jpeg2000CodecEnum`

### getCompressionRatios() {#getCompressionRatios}
```java
public int[] getCompressionRatios()
```

Gets or sets the Array of compression ratio. Different compression ratios for successive layers. The rate specified for each quality level is the desired compression factor. Decreasing ratios required.

**Returns:** int[] - The compression ratios.

### setCompressionRatios(int[] value) {#setCompressionRatios-int:A}
```java
public void setCompressionRatios(int[] value)
```

Gets or sets the Array of compression ratio. Different compression ratios for successive layers. The rate specified for each quality level is the desired compression factor. Decreasing ratios required.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int[] | The compression ratios. |

### getIrreversible() {#getIrreversible}
```java
public boolean getIrreversible()
```

Gets a value indicating whether use the irreversible DWT 9-7 (true) or use lossless DWT 5-3 compression (default).

**Returns:** boolean - a value indicating whether use the irreversible DWT 9-7 (true) or use lossless DWT 5-3 compression

### setIrreversible(boolean value) {#setIrreversible-boolean}
```java
public void setIrreversible(boolean value)
```

Sets a value indicating whether use the irreversible DWT 9-7 (true) or use lossless DWT 5-3 compression (default).

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | a value indicating whether use the irreversible DWT 9-7 (true) or use lossless DWT 5-3 compression |

