---
title: ImageSaveOptions
second_title: Aspose.TeX for Java API Reference
description: Basic class representing options of saving to raster images.
type: docs
weight: 15
url: /java/com.aspose.tex.rendering/imagesaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.tex.rendering.SaveOptions](../../com.aspose.tex.rendering/saveoptions)
```
public abstract class ImageSaveOptions extends SaveOptions
```

Basic class representing options of saving to raster images.
## Constructors

| Constructor | Description |
| --- | --- |
| [ImageSaveOptions()](#ImageSaveOptions--) | Creates new instance of options |
## Methods

| Method | Description |
| --- | --- |
| [getResolution()](#getResolution--) | Gets the image resolution. |
| [setResolution(float value)](#setResolution-float-) | Sets the image resolution. |
| [getSmoothingMode()](#getSmoothingMode--) | Gets the smoothing mode. |
| [setSmoothingMode(SmoothingMode value)](#setSmoothingMode-com.aspose.tex.rendering.SmoothingMode-) | Sets the smoothing mode. |
| [getInterpolationMode()](#getInterpolationMode--) | Gets the interpolation mode. |
| [setInterpolationMode(InterpolationMode value)](#setInterpolationMode-com.aspose.tex.rendering.InterpolationMode-) | Sets the interpolation mode. |
| [deviceWritesImages()](#deviceWritesImages--) | Gets the flag that determines whether the image device will write output images. |
| [deviceWritesImages(boolean value)](#deviceWritesImages-boolean-) | Sets the flag that determines whether the image device will write output images. |
### ImageSaveOptions() {#ImageSaveOptions--}
```
public ImageSaveOptions()
```


Creates new instance of options

### getResolution() {#getResolution--}
```
public float getResolution()
```


Gets the image resolution.

**Returns:**
float - The image resolution.
### setResolution(float value) {#setResolution-float-}
```
public void setResolution(float value)
```


Sets the image resolution.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | The image resolution. |

### getSmoothingMode() {#getSmoothingMode--}
```
public SmoothingMode getSmoothingMode()
```


Gets the smoothing mode.

**Returns:**
[SmoothingMode](../../com.aspose.tex.rendering/smoothingmode) - The smoothing mode.
### setSmoothingMode(SmoothingMode value) {#setSmoothingMode-com.aspose.tex.rendering.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode value)
```


Sets the smoothing mode.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [SmoothingMode](../../com.aspose.tex.rendering/smoothingmode) | The smoothing mode. |

### getInterpolationMode() {#getInterpolationMode--}
```
public InterpolationMode getInterpolationMode()
```


Gets the interpolation mode.

**Returns:**
[InterpolationMode](../../com.aspose.tex.rendering/interpolationmode) - The interpolation mode.
### setInterpolationMode(InterpolationMode value) {#setInterpolationMode-com.aspose.tex.rendering.InterpolationMode-}
```
public void setInterpolationMode(InterpolationMode value)
```


Sets the interpolation mode.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [InterpolationMode](../../com.aspose.tex.rendering/interpolationmode) | The interpolation mode. |

### deviceWritesImages() {#deviceWritesImages--}
```
public boolean deviceWritesImages()
```


Gets the flag that determines whether the image device will write output images. Set it to  false  if you are planning to write images using arrays returned by image device's  getResult()  method.

**Returns:**
boolean - The flag that determines whether the image device will write output images.
### deviceWritesImages(boolean value) {#deviceWritesImages-boolean-}
```
public void deviceWritesImages(boolean value)
```


Sets the flag that determines whether the image device will write output images. Set it to  false  if you are planning to write images using arrays returned by image device's  getResult()  method.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | The flag that determines whether the image device will write output images. |

