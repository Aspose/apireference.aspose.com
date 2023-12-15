---
title: InputType
second_title: Aspose.OCR for Java API Reference
description: Types of image/ documents for processing / recognition.
type: docs
weight: 33
url: /java/com.aspose.ocr/inputtype/
---

**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum InputType extends Enum<InputType>
```

Types of image/ documents for processing / recognition.
## Fields

| Field | Description |
| --- | --- |
| [SingleImage](#SingleImage) | Supports GIF, PNG, JPEG, BMP, TIFF, JFIF, InputStream, BufferedImage. |
| [PDF](#PDF) | Scanned PDF document from file or from InputStream. |
| [TIFF](#TIFF) | Multipage TIFF, TIF document from file or from InputStream. |
| [URL](#URL) | Link on the image. |
| [Directory](#Directory) | Path to the directory. |
| [Zip](#Zip) | Full name of the ZIP archive. |
| [Base64](#Base64) | base64 string with the image or path to the .txt file with the base64 content. |
## Methods

| Method | Description |
| --- | --- |
| [values()](#values--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
### SingleImage {#SingleImage}
```
public static final InputType SingleImage
```


Supports GIF, PNG, JPEG, BMP, TIFF, JFIF, InputStream, BufferedImage.

### PDF {#PDF}
```
public static final InputType PDF
```


Scanned PDF document from file or from InputStream.

### TIFF {#TIFF}
```
public static final InputType TIFF
```


Multipage TIFF, TIF document from file or from InputStream.

### URL {#URL}
```
public static final InputType URL
```


Link on the image. Supports GIF, PNG, JPEG, BMP, TIFF.

### Directory {#Directory}
```
public static final InputType Directory
```


Path to the directory. Nested archives and folders are not supported. Supports GIF, PNG, JPEG, BMP, TIFF. Default amount of processed images is all.

### Zip {#Zip}
```
public static final InputType Zip
```


Full name of the ZIP archive. Nested archives and folders are not supported. Supports GIF, PNG, JPEG, BMP, TIFF, JFIF. Default amount of processed images is all.

### Base64 {#Base64}
```
public static final InputType Base64
```


base64 string with the image or path to the .txt file with the base64 content. Supports GIF, PNG, JPEG, BMP, TIFF.

### values() {#values--}
```
public static InputType[] values()
```




**Returns:**
com.aspose.ocr.InputType[]
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static InputType valueOf(String name)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String |  |

**Returns:**
[InputType](../../com.aspose.ocr/inputtype)
