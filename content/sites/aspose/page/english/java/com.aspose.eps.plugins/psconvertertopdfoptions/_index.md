---
title: PsConverterToPdfOptions
second_title: Aspose.Page for Java API Reference
description: Represents PS/EPS to PDF converter options for  plugin.
type: docs
weight: 13
url: /java/com.aspose.eps.plugins/psconvertertopdfoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.eps.plugins.PsConverterOptions](../../com.aspose.eps.plugins/psconverteroptions)
```
public class PsConverterToPdfOptions extends PsConverterOptions
```

Represents PS/EPS to PDF converter options for [PsConverter](../../com.aspose.eps.plugins/psconverter) plugin.
## Constructors

| Constructor | Description |
| --- | --- |
| [PsConverterToPdfOptions()](#PsConverterToPdfOptions--) | Initializes new instance of the [PsConverterToPdfOptions](../../com.aspose.eps.plugins/psconvertertopdfoptions) object. |
## Methods

| Method | Description |
| --- | --- |
| [addDataSource(IDataSource dataSource)](#addDataSource-com.aspose.page.plugins.IDataSource-) | Adds new data source to the PsConverter plugin data collection. |
| [addSaveDataSource(IDataSource saveDataSource)](#addSaveDataSource-com.aspose.page.plugins.IDataSource-) | Adds new data source to the PsConverterOptions plugin data collection. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Returns additional fonts folders where converter should find fonts for input document. |
| [getClass()](#getClass--) |  |
| [getDataCollection()](#getDataCollection--) | Returns PsConverterOptions plugin data collection. |
| [getExceptions()](#getExceptions--) | Returns a list of non-critical errors. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Returns the value specifying the level of compression for an image. |
| [getOperationName()](#getOperationName--) | Returns operation name. |
| [getSaveTargetsCollection()](#getSaveTargetsCollection--) | Gets collection of added targets for saving operation results. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Gets the flag that allows output of warnings and messages during conversion. |
| [isSupressErrors()](#isSupressErrors--) | Returns a value indicating whether errors will be suppressed during conversion. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Specifies additional fonts folders where converter should find fonts for input document. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Specifies the flag that allows output of warnings and messages during conversion. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Sets the value specifying the level of compression for an image. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Specifies the flag that indicates whether errors will be suppressed during conversion. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PsConverterToPdfOptions() {#PsConverterToPdfOptions--}
```
public PsConverterToPdfOptions()
```


Initializes new instance of the [PsConverterToPdfOptions](../../com.aspose.eps.plugins/psconvertertopdfoptions) object.

### addDataSource(IDataSource dataSource) {#addDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addDataSource(IDataSource dataSource)
```


Adds new data source to the PsConverter plugin data collection.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| dataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | Data source to add. |

### addSaveDataSource(IDataSource saveDataSource) {#addSaveDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addSaveDataSource(IDataSource saveDataSource)
```


Adds new data source to the PsConverterOptions plugin data collection.

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
### getDataCollection() {#getDataCollection--}
```
public final List<IDataSource> getDataCollection()
```


Returns PsConverterOptions plugin data collection.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
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
### getOperationName() {#getOperationName--}
```
public final String getOperationName()
```


Returns operation name.

**Returns:**
java.lang.String
### getSaveTargetsCollection() {#getSaveTargetsCollection--}
```
public final List<IDataSource> getSaveTargetsCollection()
```


Gets collection of added targets for saving operation results.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
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

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Sets the value specifying the level of compression for an image. Available values are 0 to 100. The lower the number specified, the higher the compression and therefore the lower the quality of the image. 0 value results in lowest quality image, while 100 results in highest.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The value specifying the level of compression for an image. |

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

