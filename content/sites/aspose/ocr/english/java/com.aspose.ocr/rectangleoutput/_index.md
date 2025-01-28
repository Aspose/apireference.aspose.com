---
title: RectangleOutput
second_title: Aspose.OCR for Java API Reference
description: Data about detected text areas or lines
type: docs
weight: 31
url: /java/com.aspose.ocr/rectangleoutput/
---

**Inheritance:**
java.lang.Object
```
public class RectangleOutput
```

Data about detected text areas or lines.
## Constructors

| Constructor | Description |
| --- | --- |
| [RectangleOutput()](#RectangleOutput) |  |
## Fields

| Field | Description |
| --- | --- |
| [ImageIndex](#ImageIndex) | Sequence number of the image on the page. |
| [Page](#Page) | Page number. |
| [Rectangles](#Rectangles) | List of detected text areas or lines. |
| [Source](#Source) | The full path to the file or URL, if any. |

### RectangleOutput() {#RectangleOutput}
```
public RectangleOutput()
```


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

### Rectangles {#Rectangles}
```
public ArrayList<Rectangle> Rectangles
```


List of detected text areas or lines.

### Source {#Source}
```
public String Source
```


The full path to the file or URL, if any. Empty for streams, byte arrays, base64.

