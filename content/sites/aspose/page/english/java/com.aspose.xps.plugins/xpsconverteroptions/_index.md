---
title: XpsConverterOptions
second_title: Aspose.Page for Java API Reference
description: Represents base class of options for  plugin.
type: docs
weight: 11
url: /java/com.aspose.xps.plugins/xpsconverteroptions/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IPluginOptions](../../com.aspose.page.plugins/ipluginoptions), [com.aspose.page.plugins.IDataContainer](../../com.aspose.page.plugins/idatacontainer), [com.aspose.page.plugins.ISaveInstruction](../../com.aspose.page.plugins/isaveinstruction)
```
public class XpsConverterOptions implements IPluginOptions, IDataContainer, ISaveInstruction
```

Represents base class of options for [XpsConverter](../../com.aspose.xps.plugins/xpsconverter) plugin.
## Methods

| Method | Description |
| --- | --- |
| [getDataCollection()](#getDataCollection--) | Returns XpsConverterOptions plugin data collection. |
| [addDataSource(IDataSource dataSource)](#addDataSource-com.aspose.page.plugins.IDataSource-) | Adds new data source to the XpsConverter plugin data collection. |
| [getSaveTargetsCollection()](#getSaveTargetsCollection--) | Gets collection of added targets for saving operation results. |
| [addSaveDataSource(IDataSource saveDataSource)](#addSaveDataSource-com.aspose.page.plugins.IDataSource-) | Adds new data source to the XpsConverterOptions plugin data collection. |
| [getOperationName()](#getOperationName--) | Returns operation name. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Returns the value specifying the level of compression for an image. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Sets the value specifying the level of compression for an image. |
### getDataCollection() {#getDataCollection--}
```
public final List<IDataSource> getDataCollection()
```


Returns XpsConverterOptions plugin data collection.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
### addDataSource(IDataSource dataSource) {#addDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addDataSource(IDataSource dataSource)
```


Adds new data source to the XpsConverter plugin data collection.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| dataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | Data source to add. |

### getSaveTargetsCollection() {#getSaveTargetsCollection--}
```
public final List<IDataSource> getSaveTargetsCollection()
```


Gets collection of added targets for saving operation results.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
### addSaveDataSource(IDataSource saveDataSource) {#addSaveDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addSaveDataSource(IDataSource saveDataSource)
```


Adds new data source to the XpsConverterOptions plugin data collection.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| saveDataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | Data source (file or stream) for saving operation results. |

### getOperationName() {#getOperationName--}
```
public String getOperationName()
```


Returns operation name.

**Returns:**
java.lang.String
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Returns the value specifying the level of compression for an image. Available values are 0 to 100. The lower the number specified, the higher the compression and therefore the lower the quality of the image. 0 value results in lowest quality image, while 100 results in highest.

**Returns:**
int - The value specifying the level of compression for an image.
### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Sets the value specifying the level of compression for an image. Available values are 0 to 100. The lower the number specified, the higher the compression and therefore the lower the quality of the image. 0 value results in lowest quality image, while 100 results in highest.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The value specifying the level of compression for an image. |

