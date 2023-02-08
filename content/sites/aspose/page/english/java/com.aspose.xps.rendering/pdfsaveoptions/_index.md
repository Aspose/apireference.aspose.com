---
title: PdfSaveOptions
second_title: Aspose.Page for Java API Reference
description: Class for XPS-as-PDF saving options.
type: docs
weight: 17
url: /java/com.aspose.xps.rendering/pdfsaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions)

**All Implemented Interfaces:**
[com.aspose.page.IMultiPageSaveOptions](../../com.aspose.page/imultipagesaveoptions)
```
public class PdfSaveOptions extends SaveOptions implements IMultiPageSaveOptions
```

Class for XPS-as-PDF saving options.
## Constructors

| Constructor | Description |
| --- | --- |
| [PdfSaveOptions()](#PdfSaveOptions--) | Creates new instance of options. |
## Methods

| Method | Description |
| --- | --- |
| [getPageNumbers()](#getPageNumbers--) | Gets the array of numbers of pages to render. |
| [setPageNumbers(int[] value)](#setPageNumbers-int---) | Sets the array of numbers of pages to render. |
| [getOutlineTreeHeight()](#getOutlineTreeHeight--) | Gets the height of the document outline tree to save. 0 - the outline tree will not be converted, 1 - only the first level outline items will be converted, and so on. |
| [setOutlineTreeHeight(int value)](#setOutlineTreeHeight-int-) | Sets the height of the document outline tree to save. 0 - the outline tree will not be converted, 1 - only the first level outline items will be converted, and so on. |
| [getOutlineTreeExpansionLevel()](#getOutlineTreeExpansionLevel--) | Gets up to what level the document outline should be expanded when the PDF file is viewed. 1 - only the first level outline items are shown, 2 - only the first and second level outline items are shown, and so on. |
| [setOutlineTreeExpansionLevel(int value)](#setOutlineTreeExpansionLevel-int-) | Sets up to what level the document outline should be expanded when the PDF file is viewed. 1 - only the first level outline items are shown, 2 - only the first and second level outline items are shown, and so on. |
| [getTextCompression()](#getTextCompression--) | Returns the compression type to be used for all content streams except images. |
| [setTextCompression(PdfTextCompression value)](#setTextCompression-com.aspose.xps.rendering.PdfTextCompression-) | Sets the compression type to be used for all content streams except images. |
| [getImageCompression()](#getImageCompression--) | Returns the compression type to be used for all images in the document. |
| [setImageCompression(PdfImageCompression value)](#setImageCompression-com.aspose.xps.rendering.PdfImageCompression-) | Sets the compression type to be used for all images in the document. |
| [getEncryptionDetails()](#getEncryptionDetails--) | Returns the encryption details. |
| [setEncryptionDetails(PdfEncryptionDetails value)](#setEncryptionDetails-com.aspose.xps.rendering.PdfEncryptionDetails-) | Sets the encryption details. |
### PdfSaveOptions() {#PdfSaveOptions--}
```
public PdfSaveOptions()
```


Creates new instance of options.

### getPageNumbers() {#getPageNumbers--}
```
public int[] getPageNumbers()
```


Gets the array of numbers of pages to render.

**Returns:**
int[] - Numbers of pages.
### setPageNumbers(int[] value) {#setPageNumbers-int---}
```
public void setPageNumbers(int[] value)
```


Sets the array of numbers of pages to render.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int[] | Numbers of pages. |

### getOutlineTreeHeight() {#getOutlineTreeHeight--}
```
public int getOutlineTreeHeight()
```


Gets the height of the document outline tree to save. 0 - the outline tree will not be converted, 1 - only the first level outline items will be converted, and so on.

**Returns:**
int - The outline tree height.
### setOutlineTreeHeight(int value) {#setOutlineTreeHeight-int-}
```
public void setOutlineTreeHeight(int value)
```


Sets the height of the document outline tree to save. 0 - the outline tree will not be converted, 1 - only the first level outline items will be converted, and so on.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The outline tree height. |

### getOutlineTreeExpansionLevel() {#getOutlineTreeExpansionLevel--}
```
public int getOutlineTreeExpansionLevel()
```


Gets up to what level the document outline should be expanded when the PDF file is viewed. 1 - only the first level outline items are shown, 2 - only the first and second level outline items are shown, and so on.

**Returns:**
int - The outline tree expansion level.
### setOutlineTreeExpansionLevel(int value) {#setOutlineTreeExpansionLevel-int-}
```
public void setOutlineTreeExpansionLevel(int value)
```


Sets up to what level the document outline should be expanded when the PDF file is viewed. 1 - only the first level outline items are shown, 2 - only the first and second level outline items are shown, and so on.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The outline tree expansion level. |

### getTextCompression() {#getTextCompression--}
```
public PdfTextCompression getTextCompression()
```


Returns the compression type to be used for all content streams except images. Default is \`\`\` PdfTextCompression.Flate \`\`\`.

**Returns:**
[PdfTextCompression](../../com.aspose.xps.rendering/pdftextcompression) - The compression type.
### setTextCompression(PdfTextCompression value) {#setTextCompression-com.aspose.xps.rendering.PdfTextCompression-}
```
public void setTextCompression(PdfTextCompression value)
```


Sets the compression type to be used for all content streams except images. Default is \`\`\` PdfTextCompression.Flate \`\`\`.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [PdfTextCompression](../../com.aspose.xps.rendering/pdftextcompression) | The compression type. |

### getImageCompression() {#getImageCompression--}
```
public PdfImageCompression getImageCompression()
```


Returns the compression type to be used for all images in the document. Default is \`\`\` PdfImageCompression.Auto \`\`\`.

**Returns:**
[PdfImageCompression](../../com.aspose.xps.rendering/pdfimagecompression) - The compression type.
### setImageCompression(PdfImageCompression value) {#setImageCompression-com.aspose.xps.rendering.PdfImageCompression-}
```
public void setImageCompression(PdfImageCompression value)
```


Sets the compression type to be used for all images in the document. Default is \`\`\` PdfImageCompression.Auto \`\`\`.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [PdfImageCompression](../../com.aspose.xps.rendering/pdfimagecompression) | The compression type. |

### getEncryptionDetails() {#getEncryptionDetails--}
```
public PdfEncryptionDetails getEncryptionDetails()
```


Returns the encryption details. If not set, then no encryption will be performed.

**Returns:**
[PdfEncryptionDetails](../../com.aspose.xps.rendering/pdfencryptiondetails) - The encryption details.
### setEncryptionDetails(PdfEncryptionDetails value) {#setEncryptionDetails-com.aspose.xps.rendering.PdfEncryptionDetails-}
```
public void setEncryptionDetails(PdfEncryptionDetails value)
```


Sets the encryption details. If not set, then no encryption will be performed.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [PdfEncryptionDetails](../../com.aspose.xps.rendering/pdfencryptiondetails) | The encryption details. |

