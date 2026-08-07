---
title: "ISvgResourceKeeperCallback"
linktitle: "ISvgResourceKeeperCallback"
second_title: "Aspose.CAD for Java"
description: "The svg callback interface"
type: docs
weight: 10
url: /java/com.aspose.cad.imageoptions.svgoptionsparameters/isvgresourcekeepercallback/
---

The svg callback interface

## Methods

| Method | Description |
| --- | --- |
| [onImageResourceReady(byte[] imageData, int imageType, String suggestedFileName, boolean[] useEmbeddedImage)](#onImageResourceReady-byte:A-int-java.lang.String-boolean:A) | Called for each raster image in SVG. Use it to specify how to store the raster image. |
| [onFontResourceReady(FontStoringArgs args)](#onFontResourceReady-com.aspose.cad.imageoptions.svgoptionsparameters.FontStoringArgs) | Called for each font used in SVG. Use it to specify how to store the font. |
| [onSvgDocumentReady(byte[] htmlData, String suggestedFileName)](#onSvgDocumentReady-byte:A-java.lang.String) | Called when SVG document is ready. |

### onImageResourceReady(byte[] imageData, int imageType, String suggestedFileName, boolean[] useEmbeddedImage) {#onImageResourceReady-byte:A-int-java.lang.String-boolean:A}
```java
String onImageResourceReady(byte[] imageData, int imageType, String suggestedFileName, boolean[] useEmbeddedImage)
```

Called for each raster image in SVG. Use it to specify how to store the raster image.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| imageData | byte[] | The bytes of the raster image content |
| imageType | int | Type of the image. |
| suggestedFileName | String | Name of the suggested file. |
| useEmbeddedImage | boolean[] | if set to true then image will be embedded into SVG. |

**Returns:** String - Should return path to saved resource. Path will be used in SVG image to refer to raster content. Path should be relative to target SVG document.

### onFontResourceReady(FontStoringArgs args) {#onFontResourceReady-com.aspose.cad.imageoptions.svgoptionsparameters.FontStoringArgs}
```java
void onFontResourceReady(FontStoringArgs args)
```

Called for each font used in SVG. Use it to specify how to store the font.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| args | FontStoringArgs | The font storage parameters |

### onSvgDocumentReady(byte[] htmlData, String suggestedFileName) {#onSvgDocumentReady-byte:A-java.lang.String}
```java
String onSvgDocumentReady(byte[] htmlData, String suggestedFileName)
```

Called when SVG document is ready.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| htmlData | byte[] | The SVG document conent bytes. |
| suggestedFileName | String | Suggested name for the file. |

**Returns:** String - Should return path to saved svg document.

