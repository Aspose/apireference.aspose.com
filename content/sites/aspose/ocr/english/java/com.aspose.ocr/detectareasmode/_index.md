---
title: DetectAreasMode
second_title: Aspose.OCR for Java API Reference
description: 
type: docs
weight: 36
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
| [COMBINE](#COMBINE) | Detects paragraphs with text and then uses other NN model to detect areas inside of paragraphs. |
| [CURVED_TEXT](#CURVED-TEXT) | Detects lines and recognizes text on curved images. |
| [DOCUMENT](#DOCUMENT) | Detects paragraphs uses NN model for documents. |
| [NONE](#NONE) | Doesn't detect paragraphs. |
| [PHOTO](#PHOTO) | Detects paragraphs uses NN model for photos. |
| [TABLE](#TABLE) | Detects cells with text. |
| [TEXT_IN_WILD](#TEXT-IN-WILD) | A super-powerful neural network specialized in extracting words from low-quality images such as street photos, license plates, passport photos, meter photos, and photos with noisy backgrounds. |
## Methods


### COMBINE {#COMBINE}
```
public static final DetectAreasMode COMBINE
```


Detects paragraphs with text and then uses other NN model to detect areas inside of paragraphs. Better for images with complex structure.

### CURVED_TEXT {#CURVED-TEXT}
```
public static final DetectAreasMode CURVED_TEXT
```


Detects lines and recognizes text on curved images. Preferred mode for photos of book and magazine pages.

### DOCUMENT {#DOCUMENT}
```
public static final DetectAreasMode DOCUMENT
```


Detects paragraphs uses NN model for documents. Better for multicolumn document, document with pictures or with other not text objects.

### NONE {#NONE}
```
public static final DetectAreasMode NONE
```


Doesn't detect paragraphs. Better for a simple one-column document without pictures.

### PHOTO {#PHOTO}
```
public static final DetectAreasMode PHOTO
```


Detects paragraphs uses NN model for photos. Better for image with a lot of pictures and other not text objects.

### TABLE {#TABLE}
```
public static final DetectAreasMode TABLE
```


Detects cells with text. Preferable mode for images with table structure.

### TEXT_IN_WILD {#TEXT-IN-WILD}
```
public static final DetectAreasMode TEXT_IN_WILD
```


A super-powerful neural network specialized in extracting words from low-quality images such as street photos, license plates, passport photos, meter photos, and photos with noisy backgrounds.


