---
title: ImageSaveOptions
second_title: Aspose.Page for Java API Reference
description: This class contains options necessary for managing conversion process.
type: docs
weight: 11
url: /java/com.aspose.eps.device/imagesaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions)
```
public class ImageSaveOptions extends SaveOptions
```

This class contains options necessary for managing conversion process.
## Constructors

| Constructor | Description |
| --- | --- |
| [ImageSaveOptions()](#ImageSaveOptions--) | Initialize new instance of  ImageSaveOptions  class with default values for flags  suppressErrors  (true) and  debug  (false). |
| [ImageSaveOptions(ImageFormat imageFormat)](#ImageSaveOptions-com.aspose.page.ImageFormat-) | Initializes new instance of  ImageSaveOptions  with specified image format. |
| [ImageSaveOptions(Dimension size)](#ImageSaveOptions-java.awt.Dimension-) | Initializes new instance of  ImageSaveOptions  with specified size of the image. |
| [ImageSaveOptions(Dimension size, ImageFormat imageFormat)](#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-) | Initializes new instance of  ImageSaveOptions  with specified size of the image and image format. |
| [ImageSaveOptions(ImageFormat imageFormat, boolean supressErrors)](#ImageSaveOptions-com.aspose.page.ImageFormat-boolean-) | Initializes new instance of  ImageSaveOptions  with specified image format and suppressErrors flag. |
| [ImageSaveOptions(Dimension size, boolean supressErrors)](#ImageSaveOptions-java.awt.Dimension-boolean-) | Initializes new instance of  ImageSaveOptions  with specified size of the image and suppressErrors flag. |
| [ImageSaveOptions(Dimension size, ImageFormat imageFormat, boolean supressErrors)](#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-boolean-) | Initializes new instance of  ImageSaveOptions  with specified size of the image, image format and suppressErrors flag. |
| [ImageSaveOptions(boolean supressErrors)](#ImageSaveOptions-boolean-) | Initialize new instance of  ImageSaveOptions  class with default values for flag  debug  (false). |
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Returns additional fonts folders where converter should find fonts for input document. |
| [getClass()](#getClass--) |  |
| [getExceptions()](#getExceptions--) | Returns a list of non-critical errors. |
| [getImageFormat()](#getImageFormat--) | Gets an image format for resulting image. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Returns the value specifying the level of compression for an image. |
| [getResolution()](#getResolution--) | Returns the resolution of the resulting image. |
| [getSize()](#getSize--) | Gets a size of the page or image. |
| [getSmoothingMode()](#getSmoothingMode--) | Gets smoothing mode. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Gets the flag that allows output of warnings and messages during conversion. |
| [isSupressErrors()](#isSupressErrors--) | Returns a value indicating whether errors will be suppressed during conversion. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Specifies additional fonts folders where converter should find fonts for input document. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Specifies the flag that allows output of warnings and messages during conversion. |
| [setImageFormat(ImageFormat imageFormat)](#setImageFormat-com.aspose.page.ImageFormat-) | Specifies an image format for resulting image. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Sets the value specifying the level of compression for an image. |
| [setResolution(float resolution)](#setResolution-float-) | Specifies resolution of resulting image. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Specifies a size of the page or image. |
| [setSmoothingMode(SmoothingMode smoothingMode)](#setSmoothingMode-com.aspose.eps.device.SmoothingMode-) | Sets smoothing mode. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Specifies the flag that indicates whether errors will be suppressed during conversion. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### ImageSaveOptions() {#ImageSaveOptions--}
```
public ImageSaveOptions()
```


Initialize new instance of  ImageSaveOptions  class with default values for flags  suppressErrors  (true) and  debug  (false).

### ImageSaveOptions(ImageFormat imageFormat) {#ImageSaveOptions-com.aspose.page.ImageFormat-}
```
public ImageSaveOptions(ImageFormat imageFormat)
```


Initializes new instance of  ImageSaveOptions  with specified image format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | The format of the image. |

### ImageSaveOptions(Dimension size) {#ImageSaveOptions-java.awt.Dimension-}
```
public ImageSaveOptions(Dimension size)
```


Initializes new instance of  ImageSaveOptions  with specified size of the image.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| size | java.awt.Dimension | Image size. |

### ImageSaveOptions(Dimension size, ImageFormat imageFormat) {#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-}
```
public ImageSaveOptions(Dimension size, ImageFormat imageFormat)
```


Initializes new instance of  ImageSaveOptions  with specified size of the image and image format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| size | java.awt.Dimension | Image size. |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Format of the image. |

### ImageSaveOptions(ImageFormat imageFormat, boolean supressErrors) {#ImageSaveOptions-com.aspose.page.ImageFormat-boolean-}
```
public ImageSaveOptions(ImageFormat imageFormat, boolean supressErrors)
```


Initializes new instance of  ImageSaveOptions  with specified image format and suppressErrors flag.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Format of the image. |
| supressErrors | boolean | If true conversion will be continued despite of non-critical errors. |

### ImageSaveOptions(Dimension size, boolean supressErrors) {#ImageSaveOptions-java.awt.Dimension-boolean-}
```
public ImageSaveOptions(Dimension size, boolean supressErrors)
```


Initializes new instance of  ImageSaveOptions  with specified size of the image and suppressErrors flag.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| size | java.awt.Dimension | Image size. |
| supressErrors | boolean | If true conversion will be continued despite of non-critical errors. |

### ImageSaveOptions(Dimension size, ImageFormat imageFormat, boolean supressErrors) {#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-boolean-}
```
public ImageSaveOptions(Dimension size, ImageFormat imageFormat, boolean supressErrors)
```


Initializes new instance of  ImageSaveOptions  with specified size of the image, image format and suppressErrors flag.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| size | java.awt.Dimension | Image size. |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Format of the image. |
| supressErrors | boolean | If true conversion will be continued despite of non-critical errors. |

### ImageSaveOptions(boolean supressErrors) {#ImageSaveOptions-boolean-}
```
public ImageSaveOptions(boolean supressErrors)
```


Initialize new instance of  ImageSaveOptions  class with default values for flag  debug  (false).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| supressErrors | boolean | If true conversion will be continued despite of non-critical errors. |

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
### getAdditionalFontsFolders() {#getAdditionalFontsFolders--}
```
public String[] getAdditionalFontsFolders()
```


Returns additional fonts folders where converter should find fonts for input document. Default folder is standard fonts folder where OS finds fonts for internal needs.

**Returns:**
java.lang.String[] - An array of fonts folders.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getExceptions() {#getExceptions--}
```
public List<Exception> getExceptions()
```


Returns a list of non-critical errors.

**Returns:**
java.util.List<java.lang.Exception> - Exceptions list
### getImageFormat() {#getImageFormat--}
```
public ImageFormat getImageFormat()
```


Gets an image format for resulting image.

**Returns:**
[ImageFormat](../../com.aspose.page/imageformat) - An output image format.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Returns the value specifying the level of compression for an image. Available values are 0 to 100. The lower the number specified, the higher the compression and therefore the lower the quality of the image. 0 value results in lowest quality image, while 100 results in highest.

**Returns:**
int - The value specifying the level of compression for an image.
### getResolution() {#getResolution--}
```
public float getResolution()
```


Returns the resolution of the resulting image.

**Returns:**
float - The resolution of the image.
### getSize() {#getSize--}
```
public Dimension getSize()
```


Gets a size of the page or image.

**Returns:**
java.awt.Dimension - A size of the page or image.
### getSmoothingMode() {#getSmoothingMode--}
```
public SmoothingMode getSmoothingMode()
```


Gets smoothing mode.

**Returns:**
[SmoothingMode](../../com.aspose.eps.device/smoothingmode) - the smoothingMode.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isDebug() {#isDebug--}
```
public boolean isDebug()
```


Gets the flag that allows output of warnings and messages during conversion.

**Returns:**
boolean - debug value.
### isSupressErrors() {#isSupressErrors--}
```
public boolean isSupressErrors()
```


Returns a value indicating whether errors will be suppressed during conversion.

**Returns:**
boolean - boolean value
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setAdditionalFontsFolders(String[] fontsFolders) {#setAdditionalFontsFolders-java.lang.String---}
```
public void setAdditionalFontsFolders(String[] fontsFolders)
```


Specifies additional fonts folders where converter should find fonts for input document. Default folder is standard fonts folder where OS finds fonts for internal needs.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fontsFolders | java.lang.String[] | An array of fonts folders. |

### setDebug(boolean debug) {#setDebug-boolean-}
```
public void setDebug(boolean debug)
```


Specifies the flag that allows output of warnings and messages during conversion.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| debug | boolean | Boolean value. |

### setImageFormat(ImageFormat imageFormat) {#setImageFormat-com.aspose.page.ImageFormat-}
```
public void setImageFormat(ImageFormat imageFormat)
```


Specifies an image format for resulting image.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | An output image format. |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Sets the value specifying the level of compression for an image. Available values are 0 to 100. The lower the number specified, the higher the compression and therefore the lower the quality of the image. 0 value results in lowest quality image, while 100 results in highest.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The value specifying the level of compression for an image. |

### setResolution(float resolution) {#setResolution-float-}
```
public void setResolution(float resolution)
```


Specifies resolution of resulting image.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| resolution | float | The resolution of the image. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Specifies a size of the page or image.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| size | java.awt.Dimension | Size of the page or image. |

### setSmoothingMode(SmoothingMode smoothingMode) {#setSmoothingMode-com.aspose.eps.device.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode smoothingMode)
```


Sets smoothing mode.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| smoothingMode | [SmoothingMode](../../com.aspose.eps.device/smoothingmode) | the smoothingMode to set |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


Specifies the flag that indicates whether errors will be suppressed during conversion.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| supressErrors | boolean | Boolean value. |

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

