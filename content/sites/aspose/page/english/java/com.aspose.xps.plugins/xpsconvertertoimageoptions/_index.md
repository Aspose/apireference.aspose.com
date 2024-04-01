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
| [addDataSource(IDataSource dataSource)](#addDataSource-com.aspose.page.plugins.IDataSource-) | Adds new data source to the XpsConverter plugin data collection. |
| [addSaveDataSource(IDataSource saveDataSource)](#addSaveDataSource-com.aspose.page.plugins.IDataSource-) | Adds new data source to the XpsConverterOptions plugin data collection. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDataCollection()](#getDataCollection--) | Returns XpsConverterOptions plugin data collection. |
| [getImageFormat()](#getImageFormat--) | Gets image format. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Returns the value specifying the level of compression for an image. |
| [getOperationName()](#getOperationName--) | Returns operation name. |
| [getPageNumbers()](#getPageNumbers--) | Gets the array of numbers of pages in XPS document to convert. |
| [getResolution()](#getResolution--) | Gets the image resolution. |
| [getSaveTargetsCollection()](#getSaveTargetsCollection--) | Gets collection of added targets for saving operation results. |
| [getSize()](#getSize--) | Gets the size of the resulting image. |
| [getSmoothingMode()](#getSmoothingMode--) | Gets the smoothing mode for rendering image. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setImageFormat(ImageFormat imageFormat)](#setImageFormat-com.aspose.page.ImageFormat-) | Gets image format. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Sets the value specifying the level of compression for an image. |
| [setPageNumbers(int[] pageNumbers)](#setPageNumbers-int---) | Sets the array of numbers of pages in XPS document to convert. |
| [setResolution(int resolution)](#setResolution-int-) | Sets the image resolution. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Sets the size of the resulting image. |
| [setSmoothingMode(SmoothingMode smoothingMode)](#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-) | Sets the smoothing mode for rendering image. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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

### addDataSource(IDataSource dataSource) {#addDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addDataSource(IDataSource dataSource)
```


Adds new data source to the XpsConverter plugin data collection.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| dataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | Data source to add. |

### addSaveDataSource(IDataSource saveDataSource) {#addSaveDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addSaveDataSource(IDataSource saveDataSource)
```


Adds new data source to the XpsConverterOptions plugin data collection.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| saveDataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | Data source (file or stream) for saving operation results. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDataCollection() {#getDataCollection--}
```
public final List<IDataSource> getDataCollection()
```


Returns XpsConverterOptions plugin data collection.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
### getImageFormat() {#getImageFormat--}
```
public ImageFormat getImageFormat()
```


Gets image format.

**Returns:**
[ImageFormat](../../com.aspose.page/imageformat) - An image format.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Returns the value specifying the level of compression for an image. Available values are 0 to 100. The lower the number specified, the higher the compression and therefore the lower the quality of the image. 0 value results in lowest quality image, while 100 results in highest.

**Returns:**
int - The value specifying the level of compression for an image.
### getOperationName() {#getOperationName--}
```
public final String getOperationName()
```


Returns operation name.

**Returns:**
java.lang.String
### getPageNumbers() {#getPageNumbers--}
```
public int[] getPageNumbers()
```


Gets the array of numbers of pages in XPS document to convert.

**Returns:**
int[] - An array of numbers of pages in XPS document.
### getResolution() {#getResolution--}
```
public int getResolution()
```


Gets the image resolution.

**Returns:**
int - An image resolution.
### getSaveTargetsCollection() {#getSaveTargetsCollection--}
```
public final List<IDataSource> getSaveTargetsCollection()
```


Gets collection of added targets for saving operation results.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
### getSize() {#getSize--}
```
public Dimension getSize()
```


Gets the size of the resulting image.

**Returns:**
java.awt.Dimension - An image size.
### getSmoothingMode() {#getSmoothingMode--}
```
public SmoothingMode getSmoothingMode()
```


Gets the smoothing mode for rendering image.

**Returns:**
[SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) - A smoothing mode.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setImageFormat(ImageFormat imageFormat) {#setImageFormat-com.aspose.page.ImageFormat-}
```
public void setImageFormat(ImageFormat imageFormat)
```


Gets image format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | A format of resulting image. |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Sets the value specifying the level of compression for an image. Available values are 0 to 100. The lower the number specified, the higher the compression and therefore the lower the quality of the image. 0 value results in lowest quality image, while 100 results in highest.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The value specifying the level of compression for an image. |

### setPageNumbers(int[] pageNumbers) {#setPageNumbers-int---}
```
public void setPageNumbers(int[] pageNumbers)
```


Sets the array of numbers of pages in XPS document to convert. If not set all pages will be converted.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pageNumbers | int[] | An array of numbers of pages in XPS document. |

### setResolution(int resolution) {#setResolution-int-}
```
public void setResolution(int resolution)
```


Sets the image resolution.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| resolution | int | A resolution of resulting image. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Sets the size of the resulting image.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| size | java.awt.Dimension | A size of resulting image. |

### setSmoothingMode(SmoothingMode smoothingMode) {#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode smoothingMode)
```


Sets the smoothing mode for rendering image.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| smoothingMode | [SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) | A smoothing mode. |

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

