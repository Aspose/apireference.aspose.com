---
title: PsSaveOptions
second_title: Aspose.Page for Java API Reference
description: This class contains options necessary for managing conversion process.
type: docs
weight: 12
url: /java/com.aspose.eps.device/pssaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions)
```
public class PsSaveOptions extends SaveOptions
```

This class contains options necessary for managing conversion process.
## Constructors

| Constructor | Description |
| --- | --- |
| [PsSaveOptions()](#PsSaveOptions--) | Initialize new instance of  PdfSaveOptions  class with default values for flags  suppressErrors  (true) and  debug  (false). |
| [PsSaveOptions(boolean supressErrors)](#PsSaveOptions-boolean-) | Initialize new instance of  PdfSaveOptions  class with default values for flag  debug  (false). |
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Returns additional fonts folders where converter should find fonts for input document. |
| [getBackgroundColor()](#getBackgroundColor--) |  |
| [getClass()](#getClass--) |  |
| [getEmbedFontsAs()](#getEmbedFontsAs--) |  |
| [getExceptions()](#getExceptions--) | Returns a list of non-critical errors. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Returns the value specifying the level of compression for an image. |
| [getMargins()](#getMargins--) |  |
| [getPageSize()](#getPageSize--) |  |
| [getSaveFormat()](#getSaveFormat--) |  |
| [getSize()](#getSize--) | Gets a size of the page or image. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Gets the flag that allows output of warnings and messages during conversion. |
| [isEmbedFonts()](#isEmbedFonts--) | Indicates whether to embed used fonts in PS document |
| [isSupressErrors()](#isSupressErrors--) | Returns a value indicating whether errors will be suppressed during conversion. |
| [isTransparent()](#isTransparent--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Specifies additional fonts folders where converter should find fonts for input document. |
| [setBackgroundColor(Color backgroundColor)](#setBackgroundColor-java.awt.Color-) |  |
| [setDebug(boolean debug)](#setDebug-boolean-) | Specifies the flag that allows output of warnings and messages during conversion. |
| [setEmbedFonts(boolean embedFonts)](#setEmbedFonts-boolean-) | Specifies whether to embed used fonts in PS document |
| [setEmbedFontsAs(String embedFontsAs)](#setEmbedFontsAs-java.lang.String-) | Specify font type in which to embed fonts in PS document |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Sets the value specifying the level of compression for an image. |
| [setMargins(Insets margins)](#setMargins-java.awt.Insets-) |  |
| [setPageSize(Dimension pageSize)](#setPageSize-java.awt.Dimension-) |  |
| [setSaveFormat(PsSaveFormat saveFormat)](#setSaveFormat-com.aspose.eps.device.PsSaveFormat-) | Specify save format of resulting file |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Specifies a size of the page or image. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Specifies the flag that indicates whether errors will be suppressed during conversion. |
| [setTransparent(boolean transparent)](#setTransparent-boolean-) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PsSaveOptions() {#PsSaveOptions--}
```
public PsSaveOptions()
```


Initialize new instance of  PdfSaveOptions  class with default values for flags  suppressErrors  (true) and  debug  (false).

### PsSaveOptions(boolean supressErrors) {#PsSaveOptions-boolean-}
```
public PsSaveOptions(boolean supressErrors)
```


Initialize new instance of  PdfSaveOptions  class with default values for flag  debug  (false).

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
### getBackgroundColor() {#getBackgroundColor--}
```
public Color getBackgroundColor()
```




**Returns:**
java.awt.Color - the background color
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getEmbedFontsAs() {#getEmbedFontsAs--}
```
public String getEmbedFontsAs()
```




**Returns:**
java.lang.String - a type of font in which to embed fonts in PS document
### getExceptions() {#getExceptions--}
```
public List<Exception> getExceptions()
```


Returns a list of non-critical errors.

**Returns:**
java.util.List<java.lang.Exception> - Exceptions list
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Returns the value specifying the level of compression for an image. Available values are 0 to 100. The lower the number specified, the higher the compression and therefore the lower the quality of the image. 0 value results in lowest quality image, while 100 results in highest.

**Returns:**
int - The value specifying the level of compression for an image.
### getMargins() {#getMargins--}
```
public Insets getMargins()
```




**Returns:**
java.awt.Insets - the margins of the page
### getPageSize() {#getPageSize--}
```
public Dimension getPageSize()
```




**Returns:**
java.awt.Dimension - the size of the page
### getSaveFormat() {#getSaveFormat--}
```
public PsSaveFormat getSaveFormat()
```




**Returns:**
[PsSaveFormat](../../com.aspose.eps.device/pssaveformat) - save format of resulting file
### getSize() {#getSize--}
```
public Dimension getSize()
```


Gets a size of the page or image.

**Returns:**
java.awt.Dimension - A size of the page or image.
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
### isEmbedFonts() {#isEmbedFonts--}
```
public boolean isEmbedFonts()
```


Indicates whether to embed used fonts in PS document

**Returns:**
boolean - value of embedFonts flag
### isSupressErrors() {#isSupressErrors--}
```
public boolean isSupressErrors()
```


Returns a value indicating whether errors will be suppressed during conversion.

**Returns:**
boolean - boolean value
### isTransparent() {#isTransparent--}
```
public boolean isTransparent()
```




**Returns:**
boolean - Indicates if background is transparent
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

### setBackgroundColor(Color backgroundColor) {#setBackgroundColor-java.awt.Color-}
```
public void setBackgroundColor(Color backgroundColor)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| backgroundColor | java.awt.Color | Specifies background color |

### setDebug(boolean debug) {#setDebug-boolean-}
```
public void setDebug(boolean debug)
```


Specifies the flag that allows output of warnings and messages during conversion.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| debug | boolean | Boolean value. |

### setEmbedFonts(boolean embedFonts) {#setEmbedFonts-boolean-}
```
public void setEmbedFonts(boolean embedFonts)
```


Specifies whether to embed used fonts in PS document

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| embedFonts | boolean | embedFonts flag |

### setEmbedFontsAs(String embedFontsAs) {#setEmbedFontsAs-java.lang.String-}
```
public void setEmbedFontsAs(String embedFontsAs)
```


Specify font type in which to embed fonts in PS document

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| embedFontsAs | java.lang.String | Font type |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Sets the value specifying the level of compression for an image. Available values are 0 to 100. The lower the number specified, the higher the compression and therefore the lower the quality of the image. 0 value results in lowest quality image, while 100 results in highest.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The value specifying the level of compression for an image. |

### setMargins(Insets margins) {#setMargins-java.awt.Insets-}
```
public void setMargins(Insets margins)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| margins | java.awt.Insets | Specifies the margins of the page |

### setPageSize(Dimension pageSize) {#setPageSize-java.awt.Dimension-}
```
public void setPageSize(Dimension pageSize)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pageSize | java.awt.Dimension | Specifies the size of the page |

### setSaveFormat(PsSaveFormat saveFormat) {#setSaveFormat-com.aspose.eps.device.PsSaveFormat-}
```
public void setSaveFormat(PsSaveFormat saveFormat)
```


Specify save format of resulting file

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| saveFormat | [PsSaveFormat](../../com.aspose.eps.device/pssaveformat) | Format of resulting file |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Specifies a size of the page or image.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| size | java.awt.Dimension | Size of the page or image. |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


Specifies the flag that indicates whether errors will be suppressed during conversion.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| supressErrors | boolean | Boolean value. |

### setTransparent(boolean transparent) {#setTransparent-boolean-}
```
public void setTransparent(boolean transparent)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| transparent | boolean | Specifies if background is transparent |

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

