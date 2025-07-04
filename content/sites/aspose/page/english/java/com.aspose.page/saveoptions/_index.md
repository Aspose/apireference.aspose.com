---
title: SaveOptions
second_title: Aspose.Page for Java API Reference
description: This class contains options necessary for managing conversion process.
type: docs
weight: 16
url: /java/com.aspose.page/saveoptions/
---
**Inheritance:**
java.lang.Object
```
public class SaveOptions
```

This class contains options necessary for managing conversion process.
## Constructors

| Constructor | Description |
| --- | --- |
| [SaveOptions()](#SaveOptions--) | Initialize new SaveOptions instance with default values for flags  suppressErrors  (true) and  debug  (false). |
| [SaveOptions(boolean supressErrors)](#SaveOptions-boolean-) | Initialize new SaveOptions instance with default value for flag  debug  (false). |
| [SaveOptions(Dimension size)](#SaveOptions-java.awt.Dimension-) | Initializes new instance of  SaveOptions  with specified size. |
| [SaveOptions(boolean supressErrors, Dimension size)](#SaveOptions-boolean-java.awt.Dimension-) | Initialize new SaveOptions instance with default value for flag  debug  (false) and with specified size. |
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Returns additional fonts folders where converter should find fonts for input document. |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | Gets the flag showing if it is necessary to save non-TrueType fonts to TTF. |
| [getExceptions()](#getExceptions--) | Returns a list of non-critical errors. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Returns the value specifying the level of compression for an image. |
| [getSize()](#getSize--) | Gets a size of the page or image. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Gets the flag that allows output of warnings and messages during conversion. |
| [isSupressErrors()](#isSupressErrors--) | Returns a value indicating whether errors will be suppressed during conversion. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Specifies additional fonts folders where converter should find fonts for input document. |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | Specifies whether to save non-TrueType fonts to TTF. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Specifies the flag that allows output of warnings and messages during conversion. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Sets the value specifying the level of compression for an image. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Specifies a size of the page or image. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Specifies the flag that indicates whether errors will be suppressed during conversion. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### SaveOptions() {#SaveOptions--}
```
public SaveOptions()
```


Initialize new SaveOptions instance with default values for flags  suppressErrors  (true) and  debug  (false).

### SaveOptions(boolean supressErrors) {#SaveOptions-boolean-}
```
public SaveOptions(boolean supressErrors)
```


Initialize new SaveOptions instance with default value for flag  debug  (false).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| supressErrors | boolean | If true conversion will be continued despite of non-critical errors. |

### SaveOptions(Dimension size) {#SaveOptions-java.awt.Dimension-}
```
public SaveOptions(Dimension size)
```


Initializes new instance of  SaveOptions  with specified size.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| size | java.awt.Dimension | The size. |

### SaveOptions(boolean supressErrors, Dimension size) {#SaveOptions-boolean-java.awt.Dimension-}
```
public SaveOptions(boolean supressErrors, Dimension size)
```


Initialize new SaveOptions instance with default value for flag  debug  (false) and with specified size.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| supressErrors | boolean | If true conversion will be continued despite of non-critical errors. |
| size | java.awt.Dimension | The size. |

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
### getConvertFontsToTTF() {#getConvertFontsToTTF--}
```
public boolean getConvertFontsToTTF()
```


Gets the flag showing if it is necessary to save non-TrueType fonts to TTF.

**Returns:**
boolean - The flag value.
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

### setConvertFontsToTTF(boolean value) {#setConvertFontsToTTF-boolean-}
```
public void setConvertFontsToTTF(boolean value)
```


Specifies whether to save non-TrueType fonts to TTF. It significantly decreases the volume of the resulting document in PS to PDF conversion and increases the speed of conversion of PS files with a large quantity of text in non-TrueType fonts to any output format. However there is small vertical shift of text when converting PostSctipt file to image.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | The flag value. |

### setDebug(boolean debug) {#setDebug-boolean-}
```
public void setDebug(boolean debug)
```


Specifies the flag that allows output of warnings and messages during conversion.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| debug | boolean | Boolean value. |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Sets the value specifying the level of compression for an image. Available values are 0 to 100. The lower the number specified, the higher the compression and therefore the lower the quality of the image. 0 value results in lowest quality image, while 100 results in highest.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The value specifying the level of compression for an image. |

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

