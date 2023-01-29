---
title: DetectAreasMode
second_title: Aspose.OCR for Java API Reference
description: 
type: docs
weight: 24
url: /java/com.aspose.ocr/detectareasmode/
---

**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum DetectAreasMode extends Enum<DetectAreasMode>
```
## Fields

| Field | Description |
| --- | --- |
| [NONE](#NONE) | Doesn't detect paragraphs. |
| [DOCUMENT](#DOCUMENT) | Detects paragraphs uses NN model for documents. |
| [PHOTO](#PHOTO) | Detects paragraphs uses NN model for photos. |
| [COMBINE](#COMBINE) | Detects paragraphs with text and then uses other NN model to detect areas inside of paragraphs. |
| [TABLE](#TABLE) | Detects cells with text. |
| [CURVED_TEXT](#CURVED-TEXT) | Detects lines and recognizes text on curved images. |
## Methods

| Method | Description |
| --- | --- |
| [values()](#values--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
### NONE {#NONE}
```
public static final DetectAreasMode NONE
```


Doesn't detect paragraphs. Better for a simple one-column document without pictures.

### DOCUMENT {#DOCUMENT}
```
public static final DetectAreasMode DOCUMENT
```


Detects paragraphs uses NN model for documents. Better for multicolumn document, document with pictures or with other not text objects.

### PHOTO {#PHOTO}
```
public static final DetectAreasMode PHOTO
```


Detects paragraphs uses NN model for photos. Better for image with a lot of pictures and other not text objects.

### COMBINE {#COMBINE}
```
public static final DetectAreasMode COMBINE
```


Detects paragraphs with text and then uses other NN model to detect areas inside of paragraphs. Better for images with complex structure.

### TABLE {#TABLE}
```
public static final DetectAreasMode TABLE
```


Detects cells with text. Preferable mode for images with table structure.

### CURVED_TEXT {#CURVED-TEXT}
```
public static final DetectAreasMode CURVED_TEXT
```


Detects lines and recognizes text on curved images. Preferred mode for photos of book and magazine pages.

### values() {#values--}
```
public static DetectAreasMode[] values()
```




**Returns:**
com.aspose.ocr.DetectAreasMode[]
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static DetectAreasMode valueOf(String name)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String |  |

**Returns:**
[DetectAreasMode](../../com.aspose.ocr/detectareasmode)
