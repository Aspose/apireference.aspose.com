---
title: RectangleOutput
second_title: Aspose.OCR for Java API Reference
description: Data about detected text areas or lines.
type: docs
weight: 25
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
| [RectangleOutput()](#RectangleOutput--) |  |
## Fields

| Field | Description |
| --- | --- |
| [Source](#Source) | The full path to the file or URL, if any. |
| [Page](#Page) | Page number. |
| [ImageIndex](#ImageIndex) | Sequence number of the image on the page. |
| [Rectangles](#Rectangles) | List of detected text areas or lines. |
### RectangleOutput() {#RectangleOutput--}
```
public RectangleOutput()
```


### Source {#Source}
```
public String Source
```


The full path to the file or URL, if any. Empty for streams, byte arrays, base64.

### Page {#Page}
```
public int Page
```


Page number.

### ImageIndex {#ImageIndex}
```
public int ImageIndex
```


Sequence number of the image on the page.

### Rectangles {#Rectangles}
```
public ArrayList<Rectangle> Rectangles
```


List of detected text areas or lines.

