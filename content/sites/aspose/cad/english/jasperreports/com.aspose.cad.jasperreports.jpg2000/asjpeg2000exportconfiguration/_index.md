---
title: "ASJpeg2000ExportConfiguration"
linktitle: "ASJpeg2000ExportConfiguration"
second_title: "Aspose.CAD for JasperReports"
description: "The JPEG 2000 file format export configuration."
type: docs
weight: 10
url: /jasperreports/com.aspose.cad.jasperreports.jpg2000/asjpeg2000exportconfiguration/
---

**Inheritance:** java.lang.Object, ImageExportConfiguration

The JPEG 2000 file format export configuration.

## Methods

| Method | Description |
| --- | --- |
| [getComments()](#getComments) | Gets or sets the Jpeg comment markers. |
| [getCodec()](#getCodec) | Gets or sets the JPEG2000 codec |
| [getCompressionRatios()](#getCompressionRatios) | Gets or sets the Array of compression ratio. Different compression ratios for successive layers. The rate specified for each quality level is the desired compression factor. Decreasing ratios required. |
| [getIrreversible()](#getIrreversible) | Gets a value indicating whether use the irreversible DWT 9-7 (true) or use lossless DWT 5-3 compression (default). |

### getComments() {#getComments}
```java
String[] getComments()
```

Gets or sets the Jpeg comment markers.

**Returns:** String[] - The Jpeg comment markers.

### getCodec() {#getCodec}
```java
Jpeg2000CodecEnum getCodec()
```

Gets or sets the JPEG2000 codec

**Returns:** Jpeg2000CodecEnum - The JPEG2000 codec

**See Also:** `Jpeg2000CodecEnum`

### getCompressionRatios() {#getCompressionRatios}
```java
int[] getCompressionRatios()
```

Gets or sets the Array of compression ratio. Different compression ratios for successive layers. The rate specified for each quality level is the desired compression factor. Decreasing ratios required.

**Returns:** int[] - The compression ratios.

### getIrreversible() {#getIrreversible}
```java
boolean getIrreversible()
```

Gets a value indicating whether use the irreversible DWT 9-7 (true) or use lossless DWT 5-3 compression (default).

**Returns:** boolean - a value indicating whether use the irreversible DWT 9-7 (true) or use lossless DWT 5-3 compression

