---
title: "ASPdfExportConfiguration"
linktitle: "ASPdfExportConfiguration"
second_title: "Aspose.CAD for JasperReports"
description: "The PDF file format export configuration."
type: docs
weight: 10
url: /jasperreports/com.aspose.cad.jasperreports.pdf/aspdfexportconfiguration/
---

**Inheritance:** java.lang.Object, BaseExportConfiguration

The PDF file format export configuration.

## Methods

| Method | Description |
| --- | --- |
| [getTextCompression()](#getTextCompression) | Specifies compression type to be used for all content streams except images. Default is TextCompressionEnum.Flate . |
| [getApplyImageTransparent()](#getApplyImageTransparent) | Applies the specified transparent color to an image if true . |
| [getImageCompression()](#getImageCompression) | Specifies compression type to be used for all images in the document. Default is ImageCompressionEnum.Auto . |
| [getTabSize()](#getTabSize) | The tab-size property is used to customize the width of a tab (U+0009) character. Value: The size of the tab. |
| [getBookmarksOutlineLevel()](#getBookmarksOutlineLevel) | Specifies at which level in the document outline to display bookmark objects. 0 - not displayed. 1 at first level and so on. Default is 0. |
| [getExpandedOutlineLevels()](#getExpandedOutlineLevels) | Specifies how many levels in the document outline to show expanded when the PDF file is viewed. 0 - the document outline is not expanded. 1 - first level items in the document are expanded and so on. Default is 0. |
| [getFontEmbeddingRuleEnum()](#getFontEmbeddingRuleEnum) | Gets or sets the font embedding rule. Value: The font embedding rule. |
| [getRenderMetafileAsBitmap()](#getRenderMetafileAsBitmap) | Gets or sets a value determining how metafile images should be rendered. |
| [getHeadingsOutlineLevels()](#getHeadingsOutlineLevels) | Specifies how many levels of ApsOutlineItem to include in the document outline. 0 - no outline, 1 - one outline level and so on. Default is 0. |
| [getImageTransparentColor()](#getImageTransparentColor) | Gets or sets the image transparent color. Value: The color of the image transparent. |
| [getEncryptionDetails()](#getEncryptionDetails) | Gets or sets a encryption details. If not set, then no encryption will be performed. |
| [getKeywords()](#getKeywords) | Gets keywords of the document. |
| [getTitle()](#getTitle) | Gets title of the document. |
| [getAuthor()](#getAuthor) | Gets author of the document. |
| [getSubject()](#getSubject) | Gets subject of the document. |
| [getJpegQuality()](#getJpegQuality) | Specifies the quality of JPEG compression for images (if JPEG compression is used). Default is 95. |

### getTextCompression() {#getTextCompression}
```java
TextCompressionEnum getTextCompression()
```

Specifies compression type to be used for all content streams except images. Default is TextCompressionEnum.Flate .

**Returns:** TextCompressionEnum

### getApplyImageTransparent() {#getApplyImageTransparent}
```java
boolean getApplyImageTransparent()
```

Applies the specified transparent color to an image if true .

**Returns:** boolean

### getImageCompression() {#getImageCompression}
```java
ImageCompressionEnum getImageCompression()
```

Specifies compression type to be used for all images in the document. Default is ImageCompressionEnum.Auto .

**Returns:** ImageCompressionEnum

### getTabSize() {#getTabSize}
```java
long getTabSize()
```

The tab-size property is used to customize the width of a tab (U+0009) character. Value: The size of the tab.

**Returns:** long

### getBookmarksOutlineLevel() {#getBookmarksOutlineLevel}
```java
int getBookmarksOutlineLevel()
```

Specifies at which level in the document outline to display bookmark objects. 0 - not displayed. 1 at first level and so on. Default is 0.

**Returns:** int

### getExpandedOutlineLevels() {#getExpandedOutlineLevels}
```java
int getExpandedOutlineLevels()
```

Specifies how many levels in the document outline to show expanded when the PDF file is viewed. 0 - the document outline is not expanded. 1 - first level items in the document are expanded and so on. Default is 0.

**Returns:** int

### getFontEmbeddingRuleEnum() {#getFontEmbeddingRuleEnum}
```java
FontEmbeddingRuleEnum getFontEmbeddingRuleEnum()
```

Gets or sets the font embedding rule. Value: The font embedding rule.

**Returns:** FontEmbeddingRuleEnum

### getRenderMetafileAsBitmap() {#getRenderMetafileAsBitmap}
```java
Boolean getRenderMetafileAsBitmap()
```

Gets or sets a value determining how metafile images should be rendered.

**Returns:** Boolean

### getHeadingsOutlineLevels() {#getHeadingsOutlineLevels}
```java
int getHeadingsOutlineLevels()
```

Specifies how many levels of ApsOutlineItem to include in the document outline. 0 - no outline, 1 - one outline level and so on. Default is 0.

**Returns:** int

### getImageTransparentColor() {#getImageTransparentColor}
```java
Color getImageTransparentColor()
```

Gets or sets the image transparent color. Value: The color of the image transparent.

**Returns:** Color

### getEncryptionDetails() {#getEncryptionDetails}
```java
EncryptionDetails getEncryptionDetails()
```

Gets or sets a encryption details. If not set, then no encryption will be performed.

**Returns:** EncryptionDetails

### getKeywords() {#getKeywords}
```java
String getKeywords()
```

Gets keywords of the document.

**Returns:** String - The keywords of the document.

### getTitle() {#getTitle}
```java
String getTitle()
```

Gets title of the document.

**Returns:** String - The title of the document.

### getAuthor() {#getAuthor}
```java
String getAuthor()
```

Gets author of the document.

**Returns:** String - The author of the document.

### getSubject() {#getSubject}
```java
String getSubject()
```

Gets subject of the document.

**Returns:** String - The subject of the document.

### getJpegQuality() {#getJpegQuality}
```java
int getJpegQuality()
```

Specifies the quality of JPEG compression for images (if JPEG compression is used). Default is 95.

**Returns:** int

