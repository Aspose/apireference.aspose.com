---
title: PdfSaveOptions
second_title: Aspose.TeX for Java API Reference
description: Class representing options of saving to PDF.
type: docs
weight: 19
url: /java/com.aspose.tex.rendering/pdfsaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.tex.rendering.SaveOptions](../../com.aspose.tex.rendering/saveoptions)
```
public class PdfSaveOptions extends SaveOptions
```

Class representing options of saving to PDF.
## Constructors

| Constructor | Description |
| --- | --- |
| [PdfSaveOptions()](#PdfSaveOptions--) | Creates new instance of options. |
## Methods

| Method | Description |
| --- | --- |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | The Quality category specifies the level of compression for an image. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | The Quality category specifies the level of compression for an image. |
| [getOutlineTreeHeight()](#getOutlineTreeHeight--) | Specifies the height of the document outline tree to save. 0 - the outline tree will not be converted, 1 - only the first level outline items will be converted, ans so on. |
| [setOutlineTreeHeight(int value)](#setOutlineTreeHeight-int-) | Specifies the height of the document outline tree to save. 0 - the outline tree will not be converted, 1 - only the first level outline items will be converted, ans so on. |
| [getOutlineTreeExpansionLevel()](#getOutlineTreeExpansionLevel--) | Specifies up to what level the document outline should be expanded when the PDF file is viewed. 1 - only the first level outline items are shown, 2 - only the first and second level outline items are shown, and so on. |
| [setOutlineTreeExpansionLevel(int value)](#setOutlineTreeExpansionLevel-int-) | Specifies up to what level the document outline should be expanded when the PDF file is viewed. 1 - only the first level outline items are shown, 2 - only the first and second level outline items are shown, and so on. |
| [getTextCompression()](#getTextCompression--) | Specifies at which level in the document outline to display  ApsBookmark  objects. 0 - not displayed. 1 at first level and so on. |
| [setTextCompression(PdfTextCompression value)](#setTextCompression-com.aspose.tex.rendering.PdfTextCompression-) | Specifies at which level in the document outline to display  ApsBookmark  objects. 0 - not displayed. 1 at first level and so on. |
| [getImageCompression()](#getImageCompression--) | Specifies compression type to be used for all images in the document. |
| [setImageCompression(PdfImageCompression value)](#setImageCompression-com.aspose.tex.rendering.PdfImageCompression-) | Specifies compression type to be used for all images in the document. |
| [getEncryptionDetails()](#getEncryptionDetails--) | Gets or sets a encryption details. |
| [setEncryptionDetails(PdfEncryptionDetails value)](#setEncryptionDetails-com.aspose.tex.rendering.PdfEncryptionDetails-) | Gets or sets a encryption details. |
### PdfSaveOptions() {#PdfSaveOptions--}
```
public PdfSaveOptions()
```


Creates new instance of options.

### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


The Quality category specifies the level of compression for an image. Available values are 0 to 100. The lower the number specified, the higher the compression and therefore the lower the quality of the image. 0 value results in lowest quality image, while 100 results in highest.

**Returns:**
int - The value specifying the level of compression for an image.
### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


The Quality category specifies the level of compression for an image. Available values are 0 to 100. The lower the number specified, the higher the compression and therefore the lower the quality of the image. 0 value results in lowest quality image, while 100 results in highest.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The value specifying the level of compression for an image. |

### getOutlineTreeHeight() {#getOutlineTreeHeight--}
```
public int getOutlineTreeHeight()
```


Specifies the height of the document outline tree to save. 0 - the outline tree will not be converted, 1 - only the first level outline items will be converted, ans so on.

**Returns:**
int - The outline tree height.
### setOutlineTreeHeight(int value) {#setOutlineTreeHeight-int-}
```
public void setOutlineTreeHeight(int value)
```


Specifies the height of the document outline tree to save. 0 - the outline tree will not be converted, 1 - only the first level outline items will be converted, ans so on.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The outline tree height. |

### getOutlineTreeExpansionLevel() {#getOutlineTreeExpansionLevel--}
```
public int getOutlineTreeExpansionLevel()
```


Specifies up to what level the document outline should be expanded when the PDF file is viewed. 1 - only the first level outline items are shown, 2 - only the first and second level outline items are shown, and so on. Default is 1.

**Returns:**
int - The outline tree expansion level.
### setOutlineTreeExpansionLevel(int value) {#setOutlineTreeExpansionLevel-int-}
```
public void setOutlineTreeExpansionLevel(int value)
```


Specifies up to what level the document outline should be expanded when the PDF file is viewed. 1 - only the first level outline items are shown, 2 - only the first and second level outline items are shown, and so on. Default is 1.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The outline tree expansion level. |

### getTextCompression() {#getTextCompression--}
```
public PdfTextCompression getTextCompression()
```


Specifies at which level in the document outline to display  ApsBookmark  objects. 0 - not displayed. 1 at first level and so on. Default is 0.

Specifies compression type to be used for all content streams except images. Default is  PdfTextCompression.Flate .

**Returns:**
[PdfTextCompression](../../com.aspose.tex.rendering/pdftextcompression) - The compression type.
### setTextCompression(PdfTextCompression value) {#setTextCompression-com.aspose.tex.rendering.PdfTextCompression-}
```
public void setTextCompression(PdfTextCompression value)
```


Specifies at which level in the document outline to display  ApsBookmark  objects. 0 - not displayed. 1 at first level and so on. Default is 0.

Specifies compression type to be used for all content streams except images. Default is  PdfTextCompression.Flate .

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [PdfTextCompression](../../com.aspose.tex.rendering/pdftextcompression) | The compression type. |

### getImageCompression() {#getImageCompression--}
```
public PdfImageCompression getImageCompression()
```


Specifies compression type to be used for all images in the document. Default is  PdfImageCompression.Auto .

**Returns:**
[PdfImageCompression](../../com.aspose.tex.rendering/pdfimagecompression) - The compression type.
### setImageCompression(PdfImageCompression value) {#setImageCompression-com.aspose.tex.rendering.PdfImageCompression-}
```
public void setImageCompression(PdfImageCompression value)
```


Specifies compression type to be used for all images in the document. Default is  PdfImageCompression.Auto .

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [PdfImageCompression](../../com.aspose.tex.rendering/pdfimagecompression) | The compression type. |

### getEncryptionDetails() {#getEncryptionDetails--}
```
public PdfEncryptionDetails getEncryptionDetails()
```


Gets or sets a encryption details. If not set, then no encryption will be performed.

**Returns:**
[PdfEncryptionDetails](../../com.aspose.tex.rendering/pdfencryptiondetails) - The encryption details.
### setEncryptionDetails(PdfEncryptionDetails value) {#setEncryptionDetails-com.aspose.tex.rendering.PdfEncryptionDetails-}
```
public void setEncryptionDetails(PdfEncryptionDetails value)
```


Gets or sets a encryption details. If not set, then no encryption will be performed.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [PdfEncryptionDetails](../../com.aspose.tex.rendering/pdfencryptiondetails) | The encryption details. |

