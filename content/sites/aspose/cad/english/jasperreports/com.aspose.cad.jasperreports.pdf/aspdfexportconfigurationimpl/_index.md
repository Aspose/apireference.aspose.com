---
title: "ASPdfExportConfigurationImpl"
linktitle: "ASPdfExportConfigurationImpl"
second_title: "Aspose.CAD for JasperReports"
description: "The PDF file format export configuration."
type: docs
weight: 10
url: /jasperreports/com.aspose.cad.jasperreports.pdf/aspdfexportconfigurationimpl/
---

**Inheritance:** java.lang.Object, BaseExportConfigurationImpl

**All Implemented Interfaces:** ASPdfExportConfiguration

The PDF file format export configuration.

## Constructors

| Constructor | Description |
| --- | --- |
| [ASPdfExportConfigurationImpl()](#ASPdfExportConfigurationImpl) |  |

## Methods

| Method | Description |
| --- | --- |
| [getPdfCompliance()](#getPdfCompliance) | Desired conformance level for generated PDF document. Important note: This option should not be changed after PdfDocument object is constructed. Default is PdfComplianceEnum.Pdf15 . |
| [setPdfCompliance(PdfComplianceEnum pdfCompliance)](#setPdfCompliance-com.aspose.cad.jasperreports.pdf.PdfComplianceEnum) | Desired conformance level for generated PDF document. Important note: This option should not be changed after PdfDocument object is constructed. Default is PdfComplianceEnum.Pdf15 . |
| [getTextCompression()](#getTextCompression) | Specifies compression type to be used for all content streams except images. Default is TextCompressionEnum.Flate . |
| [setTextCompression(TextCompressionEnum textCompression)](#setTextCompression-com.aspose.cad.jasperreports.pdf.TextCompressionEnum) | Specifies compression type to be used for all content streams except images. Default is TextCompressionEnum.Flate . |
| [getApplyImageTransparent()](#getApplyImageTransparent) | Applies the specified transparent color to an image if true . |
| [setApplyImageTransparent(boolean applyImageTransparent)](#setApplyImageTransparent-boolean) | Applies the specified transparent color to an image if true . |
| [getImageCompression()](#getImageCompression) | Specifies compression type to be used for all images in the document. Default is ImageCompressionEnum.Auto . |
| [setImageCompression(ImageCompressionEnum imageCompression)](#setImageCompression-com.aspose.cad.jasperreports.pdf.ImageCompressionEnum) | Specifies compression type to be used for all images in the document. Default is ImageCompressionEnum.Auto . |
| [getTabSize()](#getTabSize) | The tab-size property is used to customize the width of a tab (U+0009) character. Value: The size of the tab. |
| [setTabSize(long tabSize)](#setTabSize-long) | The tab-size property is used to customize the width of a tab (U+0009) character. Value: The size of the tab. |
| [getBookmarksOutlineLevel()](#getBookmarksOutlineLevel) | Specifies at which level in the document outline to display bookmark objects. 0 - not displayed. 1 at first level and so on. Default is 0. |
| [setBookmarksOutlineLevel(int bookmarksOutlineLevel)](#setBookmarksOutlineLevel-int) | Specifies at which level in the document outline to display bookmark objects. 0 - not displayed. 1 at first level and so on. Default is 0. |
| [getExpandedOutlineLevels()](#getExpandedOutlineLevels) | Specifies how many levels in the document outline to show expanded when the PDF file is viewed. 0 - the document outline is not expanded. 1 - first level items in the document are expanded and so on. Default is 0. |
| [setExpandedOutlineLevels(int expandedOutlineLevels)](#setExpandedOutlineLevels-int) | Specifies how many levels in the document outline to show expanded when the PDF file is viewed. 0 - the document outline is not expanded. 1 - first level items in the document are expanded and so on. Default is 0. |
| [getFontEmbeddingRuleEnum()](#getFontEmbeddingRuleEnum) | Gets or sets the font embedding rule. Value: The font embedding rule. |
| [setFontEmbeddingRuleEnum(FontEmbeddingRuleEnum fontEmbeddingRuleEnum)](#setFontEmbeddingRuleEnum-com.aspose.cad.jasperreports.pdf.FontEmbeddingRuleEnum) | Gets or sets the font embedding rule. Value: The font embedding rule. |
| [getRenderMetafileAsBitmap()](#getRenderMetafileAsBitmap) | Gets or sets a value determining how metafile images should be rendered. |
| [setRenderMetafileAsBitmap(Boolean renderMetafileAsBitmap)](#setRenderMetafileAsBitmap-java.lang.Boolean) | Gets or sets a value determining how metafile images should be rendered. |
| [getHeadingsOutlineLevels()](#getHeadingsOutlineLevels) | Specifies how many levels of outline item to include in the document outline. 0 - no outline, 1 - one outline level and so on. Default is 0. |
| [setHeadingsOutlineLevels(int headingsOutlineLevels)](#setHeadingsOutlineLevels-int) | Specifies how many levels of outline item to include in the document outline. 0 - no outline, 1 - one outline level and so on. Default is 0. |
| [getImageTransparentColor()](#getImageTransparentColor) | Gets or sets the image transparent color. Value: The color of the image transparent. |
| [setImageTransparentColor(Color imageTransparentColor)](#setImageTransparentColor-java.awt.Color) | Gets or sets the image transparent color. Value: The color of the image transparent. |
| [getEncryptionDetails()](#getEncryptionDetails) | Gets or sets a encryption details. If not set, then no encryption will be performed. |
| [setEncryptionDetails(EncryptionDetails encryptionDetails)](#setEncryptionDetails-com.aspose.cad.jasperreports.pdf.EncryptionDetails) | Gets or sets a encryption details. If not set, then no encryption will be performed. |
| [getKeywords()](#getKeywords) | Gets keywords of the document. |
| [setKeywords(String value)](#setKeywords-java.lang.String) | Sets keywords of the document. |
| [getTitle()](#getTitle) | Gets title of the document. |
| [setTitle(String value)](#setTitle-java.lang.String) | Sets title of the document. |
| [getAuthor()](#getAuthor) | Gets author of the document. |
| [setAuthor(String value)](#setAuthor-java.lang.String) | Sets author of the document. |
| [getSubject()](#getSubject) | Gets subject of the document. |
| [setSubject(String value)](#setSubject-java.lang.String) | Gets or sets subject of the document. |
| [getJpegQuality()](#getJpegQuality) | Specifies the quality of JPEG compression for images (if JPEG compression is used). Default is 95. |
| [setJpegQuality(int value)](#setJpegQuality-int) | Specifies the quality of JPEG compression for images (if JPEG compression is used). Default is 95. |

### ASPdfExportConfigurationImpl() {#ASPdfExportConfigurationImpl}
```java
public ASPdfExportConfigurationImpl()
```

### getPdfCompliance() {#getPdfCompliance}
```java
public PdfComplianceEnum getPdfCompliance()
```

Desired conformance level for generated PDF document. Important note: This option should not be changed after PdfDocument object is constructed. Default is PdfComplianceEnum.Pdf15 .

**Returns:** PdfComplianceEnum

### setPdfCompliance(PdfComplianceEnum pdfCompliance) {#setPdfCompliance-com.aspose.cad.jasperreports.pdf.PdfComplianceEnum}
```java
public void setPdfCompliance(PdfComplianceEnum pdfCompliance)
```

Desired conformance level for generated PDF document. Important note: This option should not be changed after PdfDocument object is constructed. Default is PdfComplianceEnum.Pdf15 .

### getTextCompression() {#getTextCompression}
```java
public TextCompressionEnum getTextCompression()
```

Specifies compression type to be used for all content streams except images. Default is TextCompressionEnum.Flate .

**Returns:** TextCompressionEnum

### setTextCompression(TextCompressionEnum textCompression) {#setTextCompression-com.aspose.cad.jasperreports.pdf.TextCompressionEnum}
```java
public void setTextCompression(TextCompressionEnum textCompression)
```

Specifies compression type to be used for all content streams except images. Default is TextCompressionEnum.Flate .

### getApplyImageTransparent() {#getApplyImageTransparent}
```java
public boolean getApplyImageTransparent()
```

Applies the specified transparent color to an image if true .

**Returns:** boolean

### setApplyImageTransparent(boolean applyImageTransparent) {#setApplyImageTransparent-boolean}
```java
public void setApplyImageTransparent(boolean applyImageTransparent)
```

Applies the specified transparent color to an image if true .

### getImageCompression() {#getImageCompression}
```java
public ImageCompressionEnum getImageCompression()
```

Specifies compression type to be used for all images in the document. Default is ImageCompressionEnum.Auto .

**Returns:** ImageCompressionEnum

### setImageCompression(ImageCompressionEnum imageCompression) {#setImageCompression-com.aspose.cad.jasperreports.pdf.ImageCompressionEnum}
```java
public void setImageCompression(ImageCompressionEnum imageCompression)
```

Specifies compression type to be used for all images in the document. Default is ImageCompressionEnum.Auto .

### getTabSize() {#getTabSize}
```java
public long getTabSize()
```

The tab-size property is used to customize the width of a tab (U+0009) character. Value: The size of the tab.

**Returns:** long

### setTabSize(long tabSize) {#setTabSize-long}
```java
public void setTabSize(long tabSize)
```

The tab-size property is used to customize the width of a tab (U+0009) character. Value: The size of the tab.

### getBookmarksOutlineLevel() {#getBookmarksOutlineLevel}
```java
public int getBookmarksOutlineLevel()
```

Specifies at which level in the document outline to display bookmark objects. 0 - not displayed. 1 at first level and so on. Default is 0.

**Returns:** int

### setBookmarksOutlineLevel(int bookmarksOutlineLevel) {#setBookmarksOutlineLevel-int}
```java
public void setBookmarksOutlineLevel(int bookmarksOutlineLevel)
```

Specifies at which level in the document outline to display bookmark objects. 0 - not displayed. 1 at first level and so on. Default is 0.

### getExpandedOutlineLevels() {#getExpandedOutlineLevels}
```java
public int getExpandedOutlineLevels()
```

Specifies how many levels in the document outline to show expanded when the PDF file is viewed. 0 - the document outline is not expanded. 1 - first level items in the document are expanded and so on. Default is 0.

**Returns:** int

### setExpandedOutlineLevels(int expandedOutlineLevels) {#setExpandedOutlineLevels-int}
```java
public void setExpandedOutlineLevels(int expandedOutlineLevels)
```

Specifies how many levels in the document outline to show expanded when the PDF file is viewed. 0 - the document outline is not expanded. 1 - first level items in the document are expanded and so on. Default is 0.

### getFontEmbeddingRuleEnum() {#getFontEmbeddingRuleEnum}
```java
public FontEmbeddingRuleEnum getFontEmbeddingRuleEnum()
```

Gets or sets the font embedding rule. Value: The font embedding rule.

**Returns:** FontEmbeddingRuleEnum

### setFontEmbeddingRuleEnum(FontEmbeddingRuleEnum fontEmbeddingRuleEnum) {#setFontEmbeddingRuleEnum-com.aspose.cad.jasperreports.pdf.FontEmbeddingRuleEnum}
```java
public void setFontEmbeddingRuleEnum(FontEmbeddingRuleEnum fontEmbeddingRuleEnum)
```

Gets or sets the font embedding rule. Value: The font embedding rule.

### getRenderMetafileAsBitmap() {#getRenderMetafileAsBitmap}
```java
public Boolean getRenderMetafileAsBitmap()
```

Gets or sets a value determining how metafile images should be rendered.

**Returns:** Boolean

### setRenderMetafileAsBitmap(Boolean renderMetafileAsBitmap) {#setRenderMetafileAsBitmap-java.lang.Boolean}
```java
public void setRenderMetafileAsBitmap(Boolean renderMetafileAsBitmap)
```

Gets or sets a value determining how metafile images should be rendered.

### getHeadingsOutlineLevels() {#getHeadingsOutlineLevels}
```java
public int getHeadingsOutlineLevels()
```

Specifies how many levels of outline item to include in the document outline. 0 - no outline, 1 - one outline level and so on. Default is 0.

**Returns:** int

### setHeadingsOutlineLevels(int headingsOutlineLevels) {#setHeadingsOutlineLevels-int}
```java
public void setHeadingsOutlineLevels(int headingsOutlineLevels)
```

Specifies how many levels of outline item to include in the document outline. 0 - no outline, 1 - one outline level and so on. Default is 0.

### getImageTransparentColor() {#getImageTransparentColor}
```java
public Color getImageTransparentColor()
```

Gets or sets the image transparent color. Value: The color of the image transparent.

**Returns:** Color

### setImageTransparentColor(Color imageTransparentColor) {#setImageTransparentColor-java.awt.Color}
```java
public void setImageTransparentColor(Color imageTransparentColor)
```

Gets or sets the image transparent color. Value: The color of the image transparent.

### getEncryptionDetails() {#getEncryptionDetails}
```java
public EncryptionDetails getEncryptionDetails()
```

Gets or sets a encryption details. If not set, then no encryption will be performed.

**Returns:** EncryptionDetails

### setEncryptionDetails(EncryptionDetails encryptionDetails) {#setEncryptionDetails-com.aspose.cad.jasperreports.pdf.EncryptionDetails}
```java
public void setEncryptionDetails(EncryptionDetails encryptionDetails)
```

Gets or sets a encryption details. If not set, then no encryption will be performed.

### getKeywords() {#getKeywords}
```java
public String getKeywords()
```

Gets keywords of the document.

**Returns:** String - The keywords of the document.

### setKeywords(String value) {#setKeywords-java.lang.String}
```java
public void setKeywords(String value)
```

Sets keywords of the document.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The keywords of the document. |

### getTitle() {#getTitle}
```java
public String getTitle()
```

Gets title of the document.

**Returns:** String - The title of the document.

### setTitle(String value) {#setTitle-java.lang.String}
```java
public void setTitle(String value)
```

Sets title of the document.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The title of the document. |

### getAuthor() {#getAuthor}
```java
public String getAuthor()
```

Gets author of the document.

**Returns:** String - The author of the document.

### setAuthor(String value) {#setAuthor-java.lang.String}
```java
public void setAuthor(String value)
```

Sets author of the document.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The author of the document. |

### getSubject() {#getSubject}
```java
public String getSubject()
```

Gets subject of the document.

**Returns:** String - The subject of the document.

### setSubject(String value) {#setSubject-java.lang.String}
```java
public void setSubject(String value)
```

Gets or sets subject of the document.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The subject of the document. |

### getJpegQuality() {#getJpegQuality}
```java
public int getJpegQuality()
```

Specifies the quality of JPEG compression for images (if JPEG compression is used). Default is 95.

**Returns:** int

### setJpegQuality(int value) {#setJpegQuality-int}
```java
public void setJpegQuality(int value)
```

Specifies the quality of JPEG compression for images (if JPEG compression is used). Default is 95.

