---
title: PdfImageCompression
second_title: Aspose.Page for Java API Reference
description: Specifies the type of compression applied to images in the PDF file.
type: docs
weight: 22
url: /java/com.aspose.xps.rendering/pdfimagecompression/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum PdfImageCompression extends Enum<PdfImageCompression>
```

Specifies the type of compression applied to images in the PDF file.
## Fields

| Field | Description |
| --- | --- |
| [Auto](#Auto) | Automatically selects the most appropriate compression for each image. |
| [None](#None) | Saves raw image bytes resulting in bigger PDF file sizes. |
| [Rle](#Rle) | Run Length compression. |
| [Flate](#Flate) | Flate compression. |
| [LzwBaselinePredictor](#LzwBaselinePredictor) | Predictor selection is restricted to PNG Paeth predictor to speed-up the process. |
| [LzwOptimizedPredictor](#LzwOptimizedPredictor) | Predictor selection is more complicated and should result in smaller image sizes but taking more time. |
| [Jpeg](#Jpeg) | JPEG compression. |
## Methods

| Method | Description |
| --- | --- |
| [values()](#values--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
### Auto {#Auto}
```
public static final PdfImageCompression Auto
```


Automatically selects the most appropriate compression for each image.

### None {#None}
```
public static final PdfImageCompression None
```


Saves raw image bytes resulting in bigger PDF file sizes.

### Rle {#Rle}
```
public static final PdfImageCompression Rle
```


Run Length compression.

### Flate {#Flate}
```
public static final PdfImageCompression Flate
```


Flate compression.

### LzwBaselinePredictor {#LzwBaselinePredictor}
```
public static final PdfImageCompression LzwBaselinePredictor
```


Predictor selection is restricted to PNG Paeth predictor to speed-up the process. In practice performs surprisingly good. Better than \`\`\` LzwOptimizedPredictor \`\`\`.

### LzwOptimizedPredictor {#LzwOptimizedPredictor}
```
public static final PdfImageCompression LzwOptimizedPredictor
```


Predictor selection is more complicated and should result in smaller image sizes but taking more time.

### Jpeg {#Jpeg}
```
public static final PdfImageCompression Jpeg
```


JPEG compression. Does not support transparency.

### values() {#values--}
```
public static PdfImageCompression[] values()
```




**Returns:**
com.aspose.xps.rendering.PdfImageCompression[]
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static PdfImageCompression valueOf(String name)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String |  |

**Returns:**
[PdfImageCompression](../../com.aspose.xps.rendering/pdfimagecompression)
