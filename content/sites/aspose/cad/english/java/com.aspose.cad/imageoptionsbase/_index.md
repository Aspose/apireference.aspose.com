---
title: "ImageOptionsBase"
linktitle: "ImageOptionsBase"
second_title: "Aspose.CAD for Java"
description: "The image base options."
type: docs
weight: 10
url: /java/com.aspose.cad/imageoptionsbase/
---

The image base options.

## Methods

| Method | Description |
| --- | --- |
| [getTargetFormat()](#getTargetFormat) |  |
| [getRotation()](#getRotation) | Gets or sets the parameter for rotate, flip, or rotate and flip the image.. |
| [setRotation(int value)](#setRotation-int) | Gets or sets the parameter for rotate, flip, or rotate and flip the image.. |
| [getLayers()](#getLayers) | Gets or sets a of layer names must be exported. All data will be exported without layers if names is not sets. |
| [setLayers(String[] value)](#setLayers-java.lang.String:A) | Gets or sets a of layer names must be exported. All data will be exported without layers if names is not sets. |
| [getXmpData()](#getXmpData) | Gets or sets the XMP metadata container. |
| [setXmpData(com.aspose.cad.xmp.XmpPacketWrapper value)](#setXmpData-com.aspose.cad.xmp.XmpPacketWrapper) | Gets or sets the XMP metadata container. |
| [getSource()](#getSource) | Gets or sets the source to create image in. |
| [setSource(com.aspose.cad.Source value)](#setSource-com.aspose.cad.Source) | Gets or sets the source to create image in. |
| [getPalette()](#getPalette) | Gets or sets the color palette. |
| [setPalette(com.aspose.cad.IColorPalette value)](#setPalette-com.aspose.cad.IColorPalette) | Gets or sets the color palette. |
| [getResolutionSettings()](#getResolutionSettings) | Gets or sets the resolution settings. |
| [setResolutionSettings(com.aspose.cad.ResolutionSetting value)](#setResolutionSettings-com.aspose.cad.ResolutionSetting) | Gets or sets the resolution settings. |
| [getVectorRasterizationOptions()](#getVectorRasterizationOptions) | Gets or sets the vector rasterization options. |
| [setVectorRasterizationOptions(VectorRasterizationOptions value)](#setVectorRasterizationOptions-com.aspose.cad.imageoptions.VectorRasterizationOptions) | Gets or sets the vector rasterization options. |
| [getTimeout()](#getTimeout) | Timeout value for export operation |
| [setTimeout(int value)](#setTimeout-int) | Timeout value for export operation |
| [getPc3File()](#getPc3File) | Gets or sets the PC3 file full name. |
| [setPc3File(String value)](#setPc3File-java.lang.String) | Gets or sets the PC3 file full name. |
| [getInterruptionToken()](#getInterruptionToken) | Token that can be used to interrupt export operation |
| [setInterruptionToken(InterruptionToken value)](#setInterruptionToken-com.aspose.cad.InterruptionToken) | Token that can be used to interrupt export operation |
| [getUserWatermarkText()](#getUserWatermarkText) | Text for user-generated watermark |
| [setUserWatermarkText(String value)](#setUserWatermarkText-java.lang.String) | Text for user-generated watermark |
| [getUserWatermarkColor()](#getUserWatermarkColor) | Color for user-generated watermark |
| [setUserWatermarkColor(com.aspose.cad.Color value)](#setUserWatermarkColor-com.aspose.cad.Color) | Color for user-generated watermark |

### getTargetFormat() {#getTargetFormat}
```java
public abstract long getTargetFormat()
```

**Returns:** long

### getRotation() {#getRotation}
```java
public int getRotation()
```

Gets or sets the parameter for rotate, flip, or rotate and flip the image..

**Returns:** int

### setRotation(int value) {#setRotation-int}
```java
public void setRotation(int value)
```

Gets or sets the parameter for rotate, flip, or rotate and flip the image..

### getLayers() {#getLayers}
```java
public final String[] getLayers()
```

Gets or sets a of layer names must be exported. All data will be exported without layers if names is not sets.

**Returns:** String[]

### setLayers(String[] value) {#setLayers-java.lang.String:A}
```java
public final void setLayers(String[] value)
```

Gets or sets a of layer names must be exported. All data will be exported without layers if names is not sets.

### getXmpData() {#getXmpData}
```java
public com.aspose.cad.xmp.XmpPacketWrapper getXmpData()
```

Gets or sets the XMP metadata container.

**Returns:** com.aspose.cad.xmp.XmpPacketWrapper - The XMP data container.

### setXmpData(com.aspose.cad.xmp.XmpPacketWrapper value) {#setXmpData-com.aspose.cad.xmp.XmpPacketWrapper}
```java
public void setXmpData(com.aspose.cad.xmp.XmpPacketWrapper value)
```

Gets or sets the XMP metadata container.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | com.aspose.cad.xmp.XmpPacketWrapper | The XMP data container. |

### getSource() {#getSource}
```java
public com.aspose.cad.Source getSource()
```

Gets or sets the source to create image in.

**Returns:** com.aspose.cad.Source - The source to create image in.

### setSource(com.aspose.cad.Source value) {#setSource-com.aspose.cad.Source}
```java
public void setSource(com.aspose.cad.Source value)
```

Gets or sets the source to create image in.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | com.aspose.cad.Source | The source to create image in. |

### getPalette() {#getPalette}
```java
public com.aspose.cad.IColorPalette getPalette()
```

Gets or sets the color palette.

**Returns:** com.aspose.cad.IColorPalette - The color palette.

### setPalette(com.aspose.cad.IColorPalette value) {#setPalette-com.aspose.cad.IColorPalette}
```java
public void setPalette(com.aspose.cad.IColorPalette value)
```

Gets or sets the color palette.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | com.aspose.cad.IColorPalette | The color palette. |

### getResolutionSettings() {#getResolutionSettings}
```java
public com.aspose.cad.ResolutionSetting getResolutionSettings()
```

Gets or sets the resolution settings.

**Returns:** com.aspose.cad.ResolutionSetting

### setResolutionSettings(com.aspose.cad.ResolutionSetting value) {#setResolutionSettings-com.aspose.cad.ResolutionSetting}
```java
public void setResolutionSettings(com.aspose.cad.ResolutionSetting value)
```

Gets or sets the resolution settings.

### getVectorRasterizationOptions() {#getVectorRasterizationOptions}
```java
public VectorRasterizationOptions getVectorRasterizationOptions()
```

Gets or sets the vector rasterization options.

**Returns:** VectorRasterizationOptions - The vector rasterization options.

### setVectorRasterizationOptions(VectorRasterizationOptions value) {#setVectorRasterizationOptions-com.aspose.cad.imageoptions.VectorRasterizationOptions}
```java
public void setVectorRasterizationOptions(VectorRasterizationOptions value)
```

Gets or sets the vector rasterization options.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | VectorRasterizationOptions | The vector rasterization options. |

### getTimeout() {#getTimeout}
```java
public final int getTimeout()
```

Timeout value for export operation

**Returns:** int

### setTimeout(int value) {#setTimeout-int}
```java
public final void setTimeout(int value)
```

Timeout value for export operation

### getPc3File() {#getPc3File}
```java
public final String getPc3File()
```

Gets or sets the PC3 file full name.

**Returns:** String

### setPc3File(String value) {#setPc3File-java.lang.String}
```java
public final void setPc3File(String value)
```

Gets or sets the PC3 file full name.

### getInterruptionToken() {#getInterruptionToken}
```java
public final InterruptionToken getInterruptionToken()
```

Token that can be used to interrupt export operation

**Returns:** InterruptionToken

### setInterruptionToken(InterruptionToken value) {#setInterruptionToken-com.aspose.cad.InterruptionToken}
```java
public final void setInterruptionToken(InterruptionToken value)
```

Token that can be used to interrupt export operation

### getUserWatermarkText() {#getUserWatermarkText}
```java
public final String getUserWatermarkText()
```

Text for user-generated watermark

**Returns:** String

### setUserWatermarkText(String value) {#setUserWatermarkText-java.lang.String}
```java
public final void setUserWatermarkText(String value)
```

Text for user-generated watermark

### getUserWatermarkColor() {#getUserWatermarkColor}
```java
public final com.aspose.cad.Color getUserWatermarkColor()
```

Color for user-generated watermark

**Returns:** com.aspose.cad.Color

### setUserWatermarkColor(com.aspose.cad.Color value) {#setUserWatermarkColor-com.aspose.cad.Color}
```java
public final void setUserWatermarkColor(com.aspose.cad.Color value)
```

Color for user-generated watermark

