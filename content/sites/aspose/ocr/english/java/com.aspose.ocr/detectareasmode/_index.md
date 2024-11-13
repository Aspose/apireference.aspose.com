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
| [COMBINE](#COMBINE) | Detects paragraphs with text and then uses another NN model to detect areas inside paragraphs. |
| [CURVED_TEXT](#CURVED-TEXT) | Automatically straightens curved lines of text in the image, improving recognition accuracy and allowing more text to be recovered and extracted. |
| [DOCUMENT](#DOCUMENT) | Detects paragraphs using NN model for documents. |
| [LEAN](#LEAN) | Prioritizes speed and reduces resource consumption by omitting support for complex layouts. |
| [MULTICOLUMN](#MULTICOLUMN) | Detects large blocks of text formatted in columns. |
| [NONE](#NONE) | Doesn't detect paragraphs. |
| [PHOTO](#PHOTO) | Detects paragraphs using NN model for photos. |
| [TABLE](#TABLE) | Detects tabular structures in the image and extracts text from individual cells. |
| [TEXT_IN_WILD](#TEXT-IN-WILD) | A specialized neural network for extracting words from low-quality images such as street photos, license plates, passport photos, meter photos, and photos with noisy backgrounds. |
| [UNIVERSAL](#UNIVERSAL) | Detects all blocks of text in the image, including sparse and irregular text on photos. |
## Methods


### COMBINE {#COMBINE}
```
public static final DetectAreasMode COMBINE
```


Detects paragraphs with text and then uses another NN model to detect areas inside paragraphs. Better for images with a complex structure.

### CURVED_TEXT {#CURVED-TEXT}
```
public static final DetectAreasMode CURVED_TEXT
```


Automatically straightens curved lines of text in the image, improving recognition accuracy and allowing more text to be recovered and extracted. Requires significant processing power and RAM.

### DOCUMENT {#DOCUMENT}
```
public static final DetectAreasMode DOCUMENT
```


Detects paragraphs using NN model for documents. Better for multicolumn documents or documents with pictures or non-text objects.

### LEAN {#LEAN}
```
public static final DetectAreasMode LEAN
```


Prioritizes speed and reduces resource consumption by omitting support for complex layouts. Suitable only for simple images with a few lines of text without illustrations or formatting.

### MULTICOLUMN {#MULTICOLUMN}
```
public static final DetectAreasMode MULTICOLUMN
```


Detects large blocks of text formatted in columns. Best choice for multi-column layouts such as book pages, articles, or contracts.

### NONE {#NONE}
```
public static final DetectAreasMode NONE
```


Doesn't detect paragraphs. Better for a simple one-column document without pictures.

### PHOTO {#PHOTO}
```
public static final DetectAreasMode PHOTO
```


Detects paragraphs using NN model for photos. Better for images with a lot of pictures and non-text objects.

### TABLE {#TABLE}
```
public static final DetectAreasMode TABLE
```


Detects tabular structures in the image and extracts text from individual cells. Recommended for scanned spreadsheets, reports, and other table-based documents.

### TEXT_IN_WILD {#TEXT-IN-WILD}
```
public static final DetectAreasMode TEXT_IN_WILD
```


A specialized neural network for extracting words from low-quality images such as street photos, license plates, passport photos, meter photos, and photos with noisy backgrounds.

### UNIVERSAL {#UNIVERSAL}
```
public static final DetectAreasMode UNIVERSAL
```


Detects all blocks of text in the image, including sparse and irregular text on photos. A versatile option for most images, except for tables and multi-column layouts.
