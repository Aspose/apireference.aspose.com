---
title: BmpSaveOptions
second_title: Aspose.Page for Java API Reference
description: Class for XPS-as-BMP saving options.
type: docs
weight: 10
url: /java/com.aspose.xps.rendering/bmpsaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions), [com.aspose.xps.rendering.ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions)
```
public class BmpSaveOptions extends ImageSaveOptions
```

Class for XPS-as-BMP saving options.
## Constructors

| Constructor | Description |
| --- | --- |
| [BmpSaveOptions()](#BmpSaveOptions--) | Creates new instance of options. |
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Returns additional fonts folders where converter should find fonts for input document. |
| [getClass()](#getClass--) |  |
| [getExceptions()](#getExceptions--) | Returns a list of non-critical errors. |
| [getImageSize()](#getImageSize--) | Gets the size of the output images in pixels. |
| [getInterpolationMode()](#getInterpolationMode--) | Gets the interpolation mode. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Returns the value specifying the level of compression for an image. |
| [getPageNumbers()](#getPageNumbers--) | Gets the array of numbers of pages to render. |
| [getResolution()](#getResolution--) | Gets the image resolution. |
| [getSmoothingMode()](#getSmoothingMode--) | Gets the smoothing mode. |
| [getTextRenderingHint()](#getTextRenderingHint--) | Gets the text rendering hint. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Gets the flag that allows output of warnings and messages during conversion. |
| [isSupressErrors()](#isSupressErrors--) | Returns a value indicating whether errors will be suppressed during conversion. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Specifies additional fonts folders where converter should find fonts for input document. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Specifies the flag that allows output of warnings and messages during conversion. |
| [setImageSize(Dimension value)](#setImageSize-java.awt.Dimension-) | Sets the size of the output images in pixels. |
| [setInterpolationMode(InterpolationMode value)](#setInterpolationMode-com.aspose.xps.rendering.InterpolationMode-) | Sets the interpolation mode. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Sets the value specifying the level of compression for an image. |
| [setPageNumbers(int[] value)](#setPageNumbers-int---) | Sets the array of numbers of pages to render. |
| [setResolution(float value)](#setResolution-float-) | Sets the image resolution. |
| [setSmoothingMode(SmoothingMode value)](#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-) | Sets the smoothing mode. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Specifies the flag that indicates whether errors will be suppressed during conversion. |
| [setTextRenderingHint(TextRenderingHint value)](#setTextRenderingHint-com.aspose.xps.rendering.TextRenderingHint-) | Sets the text rendering hint. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### BmpSaveOptions() {#BmpSaveOptions--}
```
public BmpSaveOptions()
```


Creates new instance of options.

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
### getImageSize() {#getImageSize--}
```
public Dimension getImageSize()
```


Gets the size of the output images in pixels.

**Returns:**
java.awt.Dimension - The size of the output images in pixels.
### getInterpolationMode() {#getInterpolationMode--}
```
public InterpolationMode getInterpolationMode()
```


Gets the interpolation mode.

**Returns:**
[InterpolationMode](../../com.aspose.xps.rendering/interpolationmode) - The interpolation mode.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Returns the value specifying the level of compression for an image. Available values are 0 to 100. The lower the number specified, the higher the compression and therefore the lower the quality of the image. 0 value results in lowest quality image, while 100 results in highest.

**Returns:**
int - The value specifying the level of compression for an image.
### getPageNumbers() {#getPageNumbers--}
```
public int[] getPageNumbers()
```


Gets the array of numbers of pages to render.

**Returns:**
int[] - Numbers of pages.
### getResolution() {#getResolution--}
```
public float getResolution()
```


Gets the image resolution.

**Returns:**
float - The image resolution.
### getSmoothingMode() {#getSmoothingMode--}
```
public SmoothingMode getSmoothingMode()
```


Gets the smoothing mode.

**Returns:**
[SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) - The smoothing mode.
### getTextRenderingHint() {#getTextRenderingHint--}
```
public TextRenderingHint getTextRenderingHint()
```


Gets the text rendering hint.

**Returns:**
[TextRenderingHint](../../com.aspose.xps.rendering/textrenderinghint) - The text rendering hint.
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

### setImageSize(Dimension value) {#setImageSize-java.awt.Dimension-}
```
public void setImageSize(Dimension value)
```


Sets the size of the output images in pixels.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.awt.Dimension | The size of the output images in pixels. |

### setInterpolationMode(InterpolationMode value) {#setInterpolationMode-com.aspose.xps.rendering.InterpolationMode-}
```
public void setInterpolationMode(InterpolationMode value)
```


Sets the interpolation mode.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [InterpolationMode](../../com.aspose.xps.rendering/interpolationmode) | The interpolation mode. |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Sets the value specifying the level of compression for an image. Available values are 0 to 100. The lower the number specified, the higher the compression and therefore the lower the quality of the image. 0 value results in lowest quality image, while 100 results in highest.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The value specifying the level of compression for an image. |

### setPageNumbers(int[] value) {#setPageNumbers-int---}
```
public void setPageNumbers(int[] value)
```


Sets the array of numbers of pages to render.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int[] | Numbers of pages. |

### setResolution(float value) {#setResolution-float-}
```
public void setResolution(float value)
```


Sets the image resolution.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | The image resolution. |

### setSmoothingMode(SmoothingMode value) {#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode value)
```


Sets the smoothing mode.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) | The smoothing mode. |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


Specifies the flag that indicates whether errors will be suppressed during conversion.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| supressErrors | boolean | Boolean value. |

### setTextRenderingHint(TextRenderingHint value) {#setTextRenderingHint-com.aspose.xps.rendering.TextRenderingHint-}
```
public void setTextRenderingHint(TextRenderingHint value)
```


Sets the text rendering hint.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [TextRenderingHint](../../com.aspose.xps.rendering/textrenderinghint) | The text rendering hint. |

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

