---
title: SkewOutput
second_title: Aspose.OCR for Java API Reference
description: Data about skew angle in degrees and name of the file
type: docs
weight: 18
url: /java/com.aspose.ocr.models/skewoutput/
---

**Inheritance:**
java.lang.Object
```
public class SkewOutput
```

Data about skew angle in degrees and name of the file.
## Constructors

| Constructor | Description |
| --- | --- |
| [SkewOutput()](#SkewOutput) |  |
| [SkewOutput(String source, double angle, int page, int imageIndex)](#SkewOutput-java.lang.String-double-int-int) |  |
## Fields

| Field | Description |
| --- | --- |
| [Angle](#Angle) | Skew angle in degrees. |
| [ImageIndex](#ImageIndex) | Sequence number of the image on the page. |
| [Page](#Page) | Page number. |
| [Source](#Source) | The full path to the file or URL, if any. |

### SkewOutput() {#SkewOutput}
```
public SkewOutput()
```


### SkewOutput(String source, double angle, int page, int imageIndex) {#SkewOutput-java.lang.String-double-int-int}
```
public SkewOutput(String source, double angle, int page, int imageIndex)
```


**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| source | java.lang.String |  |
| angle | double |  |
| page | int |  |
| imageIndex | int |  |

### Angle {#Angle}
```
public double Angle
```


Skew angle in degrees.

### ImageIndex {#ImageIndex}
```
public int ImageIndex
```


Sequence number of the image on the page.

### Page {#Page}
```
public int Page
```


Page number.

### Source {#Source}
```
public String Source
```


The full path to the file or URL, if any. Empty for streams, byte arrays, base64.
