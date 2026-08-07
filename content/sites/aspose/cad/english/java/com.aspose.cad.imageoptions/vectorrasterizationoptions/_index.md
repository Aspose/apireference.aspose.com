---
title: "VectorRasterizationOptions"
linktitle: "VectorRasterizationOptions"
second_title: "Aspose.CAD for Java"
description: "The vector rasterization options."
type: docs
weight: 10
url: /java/com.aspose.cad.imageoptions/vectorrasterizationoptions/
---

The vector rasterization options.

## Constructors

| Constructor | Description |
| --- | --- |
| [VectorRasterizationOptions()](#VectorRasterizationOptions) |  |

## Methods

| Method | Description |
| --- | --- |
| [getBorderX()](#getBorderX) | Deprecated. Please, use Margins property instead |
| [setBorderX(float value)](#setBorderX-float) | Deprecated. Please, use Margins property instead |
| [getMargins()](#getMargins) | Gets or sets Margins. |
| [setMargins(Margins value)](#setMargins-com.aspose.cad.imageoptions.Margins) | Gets or sets Margins. |
| [getBorderY()](#getBorderY) | Deprecated. Please, use Margins property instead |
| [setBorderY(float value)](#setBorderY-float) | Deprecated. Please, use Margins property instead |
| [getPageHeight()](#getPageHeight) | Gets or sets the page height. |
| [setPageHeight(float value)](#setPageHeight-float) | Gets or sets the page height. |
| [getPageSize()](#getPageSize) | Gets or sets the page size. |
| [setPageSize(com.aspose.cad.SizeF value)](#setPageSize-com.aspose.cad.SizeF) | Gets or sets the page size. |
| [getPageWidth()](#getPageWidth) | Gets or sets the page width. |
| [setPageWidth(float value)](#setPageWidth-float) | Gets or sets the page width. |
| [getBackgroundColor()](#getBackgroundColor) | Gets or sets a background color. |
| [setBackgroundColor(com.aspose.cad.Color value)](#setBackgroundColor-com.aspose.cad.Color) | Gets or sets a background color. |
| [getEmbedBackground()](#getEmbedBackground) | Wether background of color not equal to default background color of output format (white for PDF and SVG, transparent for raster) should be embedded into output image (if not embedded, background will be default of the output render system, but color of the content that depend on background color will be rendered using stated background color) |
| [setEmbedBackground(boolean value)](#setEmbedBackground-boolean) | Wether background of color not equal to default background color of output format (white for PDF and SVG, transparent for raster) should be embedded into output image (if not embedded, background will be default of the output render system, but color of the content that depend on background color will be rendered using stated background color) |
| [getDrawColor()](#getDrawColor) | Gets or sets a foreground color. |
| [setDrawColor(com.aspose.cad.Color value)](#setDrawColor-com.aspose.cad.Color) | Gets or sets a foreground color. |
| [getUnitType()](#getUnitType) | Gets or sets unit type of export result. |
| [setUnitType(int value)](#setUnitType-int) | Gets or sets unit type of export result. |
| [getContentAsBitmap()](#getContentAsBitmap) | Gets or sets a value indicating whether content of a drawing is represented as image inside Pdf. Applicable only for CAD to Pdf export. Default is false. |
| [setContentAsBitmap(boolean value)](#setContentAsBitmap-boolean) | Gets or sets a value indicating whether content of a drawing is represented as image inside Pdf. Applicable only for CAD to Pdf export. Default is false. |
| [getGraphicsOptions()](#getGraphicsOptions) | Gets or sets options to render bitmap inside pdf (if ContentAsBitmap is set to true). |
| [setGraphicsOptions(com.aspose.cad.imageoptions.GraphicsOptions value)](#setGraphicsOptions-com.aspose.cad.imageoptions.GraphicsOptions) | Gets or sets options to render bitmap inside pdf (if ContentAsBitmap is set to true). |
| [getLayoutPageSizes()](#getLayoutPageSizes) | Gets or sets the layout page sizes. |
| [setLayoutPageSizes(HashMap<String,com.aspose.cad.SizeF> value)](#setLayoutPageSizes-java.util.HashMap) | Gets or sets the layout page sizes. |
| [getRelativeScale()](#getRelativeScale) | Scale of exported region relative to whole document's image. Calculated as ratio of corresponding dimension of exported region to larger dimension of exported document. |
| [setRelativeScale(float value)](#setRelativeScale-float) | Scale of exported region relative to whole document's image. Calculated as ratio of corresponding dimension of exported region to larger dimension of exported document. |
| [getRelativePosition()](#getRelativePosition) | Position of top left corner of exported region relative to whole document's image, in relative units - 0,0 is top left, 1,1 is bottom of document's image. |
| [setRelativePosition(com.aspose.cad.PointF value)](#setRelativePosition-com.aspose.cad.PointF) | Position of top left corner of exported region relative to whole document's image, in relative units - 0,0 is top left, 1,1 is bottom of document's image. |

### VectorRasterizationOptions() {#VectorRasterizationOptions}
```java
public VectorRasterizationOptions()
```

### getBorderX() {#getBorderX}
```java
@Deprecated public float getBorderX()
```

Deprecated. Please, use Margins property instead

**Returns:** float - The border X.

### setBorderX(float value) {#setBorderX-float}
```java
@Deprecated public void setBorderX(float value)
```

Deprecated. Please, use Margins property instead

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | float | The border X. |

### getMargins() {#getMargins}
```java
public final Margins getMargins()
```

Gets or sets Margins.

**Returns:** Margins

### setMargins(Margins value) {#setMargins-com.aspose.cad.imageoptions.Margins}
```java
public final void setMargins(Margins value)
```

Gets or sets Margins.

### getBorderY() {#getBorderY}
```java
@Deprecated public float getBorderY()
```

Deprecated. Please, use Margins property instead

**Returns:** float - The border Y.

### setBorderY(float value) {#setBorderY-float}
```java
@Deprecated public void setBorderY(float value)
```

Deprecated. Please, use Margins property instead

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | float | The border Y. |

### getPageHeight() {#getPageHeight}
```java
public float getPageHeight()
```

Gets or sets the page height.

**Returns:** float

### setPageHeight(float value) {#setPageHeight-float}
```java
public void setPageHeight(float value)
```

Gets or sets the page height.

### getPageSize() {#getPageSize}
```java
public com.aspose.cad.SizeF getPageSize()
```

Gets or sets the page size.

**Returns:** com.aspose.cad.SizeF

### setPageSize(com.aspose.cad.SizeF value) {#setPageSize-com.aspose.cad.SizeF}
```java
public void setPageSize(com.aspose.cad.SizeF value)
```

Gets or sets the page size.

### getPageWidth() {#getPageWidth}
```java
public float getPageWidth()
```

Gets or sets the page width.

**Returns:** float

### setPageWidth(float value) {#setPageWidth-float}
```java
public void setPageWidth(float value)
```

Gets or sets the page width.

### getBackgroundColor() {#getBackgroundColor}
```java
public com.aspose.cad.Color getBackgroundColor()
```

Gets or sets a background color.

**Returns:** com.aspose.cad.Color

### setBackgroundColor(com.aspose.cad.Color value) {#setBackgroundColor-com.aspose.cad.Color}
```java
public void setBackgroundColor(com.aspose.cad.Color value)
```

Gets or sets a background color.

### getEmbedBackground() {#getEmbedBackground}
```java
public final boolean getEmbedBackground()
```

Wether background of color not equal to default background color of output format (white for PDF and SVG, transparent for raster) should be embedded into output image (if not embedded, background will be default of the output render system, but color of the content that depend on background color will be rendered using stated background color)

**Returns:** boolean

### setEmbedBackground(boolean value) {#setEmbedBackground-boolean}
```java
public final void setEmbedBackground(boolean value)
```

Wether background of color not equal to default background color of output format (white for PDF and SVG, transparent for raster) should be embedded into output image (if not embedded, background will be default of the output render system, but color of the content that depend on background color will be rendered using stated background color)

### getDrawColor() {#getDrawColor}
```java
public com.aspose.cad.Color getDrawColor()
```

Gets or sets a foreground color.

**Returns:** com.aspose.cad.Color

### setDrawColor(com.aspose.cad.Color value) {#setDrawColor-com.aspose.cad.Color}
```java
public void setDrawColor(com.aspose.cad.Color value)
```

Gets or sets a foreground color.

### getUnitType() {#getUnitType}
```java
public int getUnitType()
```

Gets or sets unit type of export result.

**Returns:** int

### setUnitType(int value) {#setUnitType-int}
```java
public void setUnitType(int value)
```

Gets or sets unit type of export result.

### getContentAsBitmap() {#getContentAsBitmap}
```java
public boolean getContentAsBitmap()
```

Gets or sets a value indicating whether content of a drawing is represented as image inside Pdf. Applicable only for CAD to Pdf export. Default is false.

**Returns:** boolean

### setContentAsBitmap(boolean value) {#setContentAsBitmap-boolean}
```java
public void setContentAsBitmap(boolean value)
```

Gets or sets a value indicating whether content of a drawing is represented as image inside Pdf. Applicable only for CAD to Pdf export. Default is false.

### getGraphicsOptions() {#getGraphicsOptions}
```java
public com.aspose.cad.imageoptions.GraphicsOptions getGraphicsOptions()
```

Gets or sets options to render bitmap inside pdf (if ContentAsBitmap is set to true).

**Returns:** com.aspose.cad.imageoptions.GraphicsOptions

### setGraphicsOptions(com.aspose.cad.imageoptions.GraphicsOptions value) {#setGraphicsOptions-com.aspose.cad.imageoptions.GraphicsOptions}
```java
public void setGraphicsOptions(com.aspose.cad.imageoptions.GraphicsOptions value)
```

Gets or sets options to render bitmap inside pdf (if ContentAsBitmap is set to true).

### getLayoutPageSizes() {#getLayoutPageSizes}
```java
public final HashMap<String,com.aspose.cad.SizeF> getLayoutPageSizes()
```

Gets or sets the layout page sizes.

**Returns:** HashMap<String,com.aspose.cad.SizeF> - The layout page sizes.

### setLayoutPageSizes(HashMap<String,com.aspose.cad.SizeF> value) {#setLayoutPageSizes-java.util.HashMap}
```java
public final void setLayoutPageSizes(HashMap<String,com.aspose.cad.SizeF> value)
```

Gets or sets the layout page sizes.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | HashMap<String | The layout page sizes. |

### getRelativeScale() {#getRelativeScale}
```java
public final float getRelativeScale()
```

Scale of exported region relative to whole document's image. Calculated as ratio of corresponding dimension of exported region to larger dimension of exported document.

**Returns:** float

### setRelativeScale(float value) {#setRelativeScale-float}
```java
public final void setRelativeScale(float value)
```

Scale of exported region relative to whole document's image. Calculated as ratio of corresponding dimension of exported region to larger dimension of exported document.

### getRelativePosition() {#getRelativePosition}
```java
public final com.aspose.cad.PointF getRelativePosition()
```

Position of top left corner of exported region relative to whole document's image, in relative units - 0,0 is top left, 1,1 is bottom of document's image.

**Returns:** com.aspose.cad.PointF

### setRelativePosition(com.aspose.cad.PointF value) {#setRelativePosition-com.aspose.cad.PointF}
```java
public final void setRelativePosition(com.aspose.cad.PointF value)
```

Position of top left corner of exported region relative to whole document's image, in relative units - 0,0 is top left, 1,1 is bottom of document's image.

