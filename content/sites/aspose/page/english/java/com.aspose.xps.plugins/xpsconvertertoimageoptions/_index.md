---
title: XpsConverterToImageOptions
second_title: Aspose.Page for Java API Reference
description: Represents XPS to Image converter options for  plugin.
type: docs
weight: 12
url: /java/com.aspose.xps.plugins/xpsconvertertoimageoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.plugins.XpsConverterOptions](../../com.aspose.xps.plugins/xpsconverteroptions)
```
public class XpsConverterToImageOptions extends XpsConverterOptions
```

Represents XPS to Image converter options for [XpsConverter](../../com.aspose.xps.plugins/xpsconverter) plugin.
## Constructors

| Constructor | Description |
| --- | --- |
| [XpsConverterToImageOptions()](#XpsConverterToImageOptions--) | Initializes new instance of the [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) object. |
| [XpsConverterToImageOptions(ImageFormat imageFormat)](#XpsConverterToImageOptions-com.aspose.page.ImageFormat-) | Initializes new instance of the [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) object with image format. |
| [XpsConverterToImageOptions(Dimension size)](#XpsConverterToImageOptions-java.awt.Dimension-) | Initializes new instance of the [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) object with a size of the resulting image. |
| [XpsConverterToImageOptions(ImageFormat imageFormat, Dimension size)](#XpsConverterToImageOptions-com.aspose.page.ImageFormat-java.awt.Dimension-) | Initializes new instance of the [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) object with image format. |
## Methods

| Method | Description |
| --- | --- |
| [getOperationName()](#getOperationName--) | Returns operation name. |
| [getImageFormat()](#getImageFormat--) | Gets image format. |
| [setImageFormat(ImageFormat imageFormat)](#setImageFormat-com.aspose.page.ImageFormat-) | Gets image format. |
| [getSize()](#getSize--) | Gets the size of the resulting image. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Sets the size of the resulting image. |
| [getResolution()](#getResolution--) | Gets the image resolution. |
| [setResolution(int resolution)](#setResolution-int-) | Sets the image resolution. |
| [getSmoothingMode()](#getSmoothingMode--) | Gets the smoothing mode for rendering image. |
| [setSmoothingMode(SmoothingMode smoothingMode)](#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-) | Sets the smoothing mode for rendering image. |
| [getPageNumbers()](#getPageNumbers--) | Gets the array of numbers of pages in XPS document to convert. |
| [setPageNumbers(int[] pageNumbers)](#setPageNumbers-int---) | Sets the array of numbers of pages in XPS document to convert. |
### XpsConverterToImageOptions() {#XpsConverterToImageOptions--}
```
public XpsConverterToImageOptions()
```


Initializes new instance of the [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) object.

### XpsConverterToImageOptions(ImageFormat imageFormat) {#XpsConverterToImageOptions-com.aspose.page.ImageFormat-}
```
public XpsConverterToImageOptions(ImageFormat imageFormat)
```


Initializes new instance of the [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) object with image format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | A format of resulting image. |

### XpsConverterToImageOptions(Dimension size) {#XpsConverterToImageOptions-java.awt.Dimension-}
```
public XpsConverterToImageOptions(Dimension size)
```


Initializes new instance of the [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) object with a size of the resulting image.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| size | java.awt.Dimension | A size the resulting image. |

### XpsConverterToImageOptions(ImageFormat imageFormat, Dimension size) {#XpsConverterToImageOptions-com.aspose.page.ImageFormat-java.awt.Dimension-}
```
public XpsConverterToImageOptions(ImageFormat imageFormat, Dimension size)
```


Initializes new instance of the [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) object with image format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | A format of resulting image. |
| size | java.awt.Dimension |  |

### getOperationName() {#getOperationName--}
```
public final String getOperationName()
```


Returns operation name.

**Returns:**
java.lang.String
### getImageFormat() {#getImageFormat--}
```
public ImageFormat getImageFormat()
```


Gets image format.

**Returns:**
[ImageFormat](../../com.aspose.page/imageformat) - An image format.
### setImageFormat(ImageFormat imageFormat) {#setImageFormat-com.aspose.page.ImageFormat-}
```
public void setImageFormat(ImageFormat imageFormat)
```


Gets image format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | A format of resulting image. |

### getSize() {#getSize--}
```
public Dimension getSize()
```


Gets the size of the resulting image.

**Returns:**
java.awt.Dimension - An image size.
### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Sets the size of the resulting image.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| size | java.awt.Dimension | A size of resulting image. |

### getResolution() {#getResolution--}
```
public int getResolution()
```


Gets the image resolution.

**Returns:**
int - An image resolution.
### setResolution(int resolution) {#setResolution-int-}
```
public void setResolution(int resolution)
```


Sets the image resolution.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| resolution | int | A resolution of resulting image. |

### getSmoothingMode() {#getSmoothingMode--}
```
public SmoothingMode getSmoothingMode()
```


Gets the smoothing mode for rendering image.

**Returns:**
[SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) - A smoothing mode.
### setSmoothingMode(SmoothingMode smoothingMode) {#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode smoothingMode)
```


Sets the smoothing mode for rendering image.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| smoothingMode | [SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) | A smoothing mode. |

### getPageNumbers() {#getPageNumbers--}
```
public int[] getPageNumbers()
```


Gets the array of numbers of pages in XPS document to convert.

**Returns:**
int[] - An array of numbers of pages in XPS document.
### setPageNumbers(int[] pageNumbers) {#setPageNumbers-int---}
```
public void setPageNumbers(int[] pageNumbers)
```


Sets the array of numbers of pages in XPS document to convert. If not set all pages will be converted.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pageNumbers | int[] | An array of numbers of pages in XPS document. |

