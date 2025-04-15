---
title: LayoutOutput
second_title: Aspose.OCR for Java API Reference
description: Information on detected content areas in the image
type: docs
weight: 15
url: /java/com.aspose.ocr.models/layoutoutput/
---

**Inheritance:**
java.lang.Object
```
public class LayoutOutput
```

Information on detected content areas in the image.
## Constructors

| Constructor | Description |
| --- | --- |
| [LayoutOutput()](#LayoutOutput) |  |
## Fields

| Field | Description |
| --- | --- |
| [captions](#captions) | Detected captions. |
| [equations](#equations) | Detected equations. |
| [headers](#headers) | Detected headers. |
| [images](#images) | Detected pictures/illustrations. |
| [lists](#lists) | Detected lists. |
| [page](#page) | Page number. |
| [paragraphs](#paragraphs) | Detected paragraphs. |
| [source](#source) | The full path to the file or URL, if any. |
| [tables](#tables) | Detected tables. |

### LayoutOutput() {#LayoutOutput}
```
public LayoutOutput()
```


### captions {#captions}
```
public ArrayList<ContentArea> captions
```


Detected captions.

### equations {#equations}
```
public ArrayList<ContentArea> equations
```


Detected equations.

### headers {#headers}
```
public ArrayList<ContentArea> headers
```


Detected headers.

### images {#images}
```
public ArrayList<ContentArea> images
```


Detected pictures/illustrations.

### lists {#lists}
```
public ArrayList<ContentArea> lists
```


Detected lists.

### page {#page}
```
public int page
```


Page number.

### paragraphs {#paragraphs}
```
public ArrayList<ContentArea> paragraphs
```


Detected paragraphs.

### source {#source}
```
public String source
```


The full path to the file or URL, if any. Empty for streams, byte arrays, base64.

### tables {#tables}
```
public ArrayList<ContentArea> tables
```


Detected tables.

