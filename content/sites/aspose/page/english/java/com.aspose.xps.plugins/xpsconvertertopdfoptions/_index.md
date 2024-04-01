---
title: XpsConverterToPdfOptions
second_title: Aspose.Page for Java API Reference
description: Represents XPS to PDF converter options for  plugin.
type: docs
weight: 13
url: /java/com.aspose.xps.plugins/xpsconvertertopdfoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.plugins.XpsConverterOptions](../../com.aspose.xps.plugins/xpsconverteroptions)
```
public class XpsConverterToPdfOptions extends XpsConverterOptions
```

Represents XPS to PDF converter options for [XpsConverter](../../com.aspose.xps.plugins/xpsconverter) plugin.
## Constructors

| Constructor | Description |
| --- | --- |
| [XpsConverterToPdfOptions()](#XpsConverterToPdfOptions--) | Initializes new instance of the [XpsConverterToPdfOptions](../../com.aspose.xps.plugins/xpsconvertertopdfoptions) object. |
## Methods

| Method | Description |
| --- | --- |
| [addDataSource(IDataSource dataSource)](#addDataSource-com.aspose.page.plugins.IDataSource-) | Adds new data source to the XpsConverter plugin data collection. |
| [addSaveDataSource(IDataSource saveDataSource)](#addSaveDataSource-com.aspose.page.plugins.IDataSource-) | Adds new data source to the XpsConverterOptions plugin data collection. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDataCollection()](#getDataCollection--) | Returns XpsConverterOptions plugin data collection. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Returns the value specifying the level of compression for an image. |
| [getOperationName()](#getOperationName--) | Returns operation name. |
| [getPageNumbers()](#getPageNumbers--) | Gets the array of numbers of pages in XPS document to convert. |
| [getSaveTargetsCollection()](#getSaveTargetsCollection--) | Gets collection of added targets for saving operation results. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Sets the value specifying the level of compression for an image. |
| [setPageNumbers(int[] pageNumbers)](#setPageNumbers-int---) | Sets the array of numbers of pages in XPS document to convert. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### XpsConverterToPdfOptions() {#XpsConverterToPdfOptions--}
```
public XpsConverterToPdfOptions()
```


Initializes new instance of the [XpsConverterToPdfOptions](../../com.aspose.xps.plugins/xpsconvertertopdfoptions) object.

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
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




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

