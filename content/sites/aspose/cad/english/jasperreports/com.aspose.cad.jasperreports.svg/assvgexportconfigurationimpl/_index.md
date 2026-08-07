---
title: "ASSvgExportConfigurationImpl"
linktitle: "ASSvgExportConfigurationImpl"
second_title: "Aspose.CAD for JasperReports"
description: "The SVG file format export configuration."
type: docs
weight: 10
url: /jasperreports/com.aspose.cad.jasperreports.svg/assvgexportconfigurationimpl/
---

**Inheritance:** java.lang.Object, ImageExportConfigurationImpl

**All Implemented Interfaces:** ASSvgExportConfiguration

The SVG file format export configuration.

## Constructors

| Constructor | Description |
| --- | --- |
| [ASSvgExportConfigurationImpl()](#ASSvgExportConfigurationImpl) | Instantiates a new As svg export configuration. |

## Methods

| Method | Description |
| --- | --- |
| [getColorType()](#getColorType) | Gets or sets the color type for SVG image. |
| [setColorType(SvgColorModeEnum value)](#setColorType-com.aspose.cad.jasperreports.svg.SvgColorModeEnum) | Gets or sets the color type for SVG image. |
| [getTextAsShapes()](#getTextAsShapes) | Gets or sets a value indicating whether text must be converted as shapes. |
| [setTextAsShapes(boolean value)](#setTextAsShapes-boolean) | Gets or sets a value indicating whether text must be converted as shapes. |
| [getCompress()](#getCompress) | Gets a value indicating whether this ##Aspose#FileFormats#Core#ImageOptions is compressed. Value: true if compressed; otherwise, false . |
| [setCompress(boolean value)](#setCompress-boolean) | Sets a value indicating whether this ##Aspose#FileFormats#Core#ImageOptions is compressed. Value: true if compressed; otherwise, false . |
| [setIsPdfEmbeddedAlias(boolean makeAlias)](#setIsPdfEmbeddedAlias-boolean) | Specifies whether the font should be embedded into the document using isPdfEmbedded flag in the tag. Makes able to specify which font should be embedded in svg document. It defaults to false. |
| [isPdfEmbeddedAlias()](#isPdfEmbeddedAlias) | Is pdf embedded alias boolean. |
| [setEmbedFonts(boolean embedFonts)](#setEmbedFonts-boolean) | Specifies whether the fonts should be embedded in svg file as base64 It defaults to false. |
| [isEmbedFonts()](#isEmbedFonts) | Indicates whether the fonts should be embedded into the svg file as base64 |

### ASSvgExportConfigurationImpl() {#ASSvgExportConfigurationImpl}
```java
public ASSvgExportConfigurationImpl()
```

Instantiates a new As svg export configuration.

### getColorType() {#getColorType}
```java
public SvgColorModeEnum getColorType()
```

Gets or sets the color type for SVG image.

**Returns:** SvgColorModeEnum - The type of the color of SVG image.

### setColorType(SvgColorModeEnum value) {#setColorType-com.aspose.cad.jasperreports.svg.SvgColorModeEnum}
```java
public void setColorType(SvgColorModeEnum value)
```

Gets or sets the color type for SVG image.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | SvgColorModeEnum | The type of the color of SVG image. |

### getTextAsShapes() {#getTextAsShapes}
```java
public boolean getTextAsShapes()
```

Gets or sets a value indicating whether text must be converted as shapes.

**Returns:** boolean - true if all text is turned into SVG shapes in the convertion; otherwise, false .

### setTextAsShapes(boolean value) {#setTextAsShapes-boolean}
```java
public void setTextAsShapes(boolean value)
```

Gets or sets a value indicating whether text must be converted as shapes.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | true if all text is turned into SVG shapes in the convertion; otherwise, false . |

### getCompress() {#getCompress}
```java
public final boolean getCompress()
```

Gets a value indicating whether this ##Aspose#FileFormats#Core#ImageOptions is compressed. Value: true if compressed; otherwise, false .

**Returns:** boolean - a value indicating whether this ##Aspose#FileFormats#Core#ImageOptions is compressed.

### setCompress(boolean value) {#setCompress-boolean}
```java
public final void setCompress(boolean value)
```

Sets a value indicating whether this ##Aspose#FileFormats#Core#ImageOptions is compressed. Value: true if compressed; otherwise, false .

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | a value indicating whether this ##Aspose#FileFormats#Core#ImageOptions is compressed. |

### setIsPdfEmbeddedAlias(boolean makeAlias) {#setIsPdfEmbeddedAlias-boolean}
```java
public final void setIsPdfEmbeddedAlias(boolean makeAlias)
```

Specifies whether the font should be embedded into the document using isPdfEmbedded flag in the tag. Makes able to specify which font should be embedded in svg document. It defaults to false.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| makeAlias | boolean | the d |

### isPdfEmbeddedAlias() {#isPdfEmbeddedAlias}
```java
public boolean isPdfEmbeddedAlias()
```

Is pdf embedded alias boolean.

**Returns:** boolean - true if there is pdf embedded alias; otherwise, false .

### setEmbedFonts(boolean embedFonts) {#setEmbedFonts-boolean}
```java
public void setEmbedFonts(boolean embedFonts)
```

Specifies whether the fonts should be embedded in svg file as base64 It defaults to false.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| embedFonts | boolean | indicator where the fonts should be embedded |

### isEmbedFonts() {#isEmbedFonts}
```java
public boolean isEmbedFonts()
```

Indicates whether the fonts should be embedded into the svg file as base64

**Returns:** boolean - true , if the fonts should be embedded; otherwise, false

