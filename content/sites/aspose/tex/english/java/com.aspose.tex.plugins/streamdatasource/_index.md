---
title: StreamDataSource
second_title: Aspose.TeX for Java API Reference
description: The stream data source for plugins save operations.
type: docs
weight: 19
url: /java/com.aspose.tex.plugins/streamdatasource/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.tex.plugins.IDataSource](../../com.aspose.tex.plugins/idatasource)
```
public final class StreamDataSource implements IDataSource
```

The stream data source for plugin's save operations.
## Constructors

| Constructor | Description |
| --- | --- |
| [StreamDataSource(OutputStream data)](#StreamDataSource-java.io.OutputStream-) | Creates a new output stream data source. |
## Methods

| Method | Description |
| --- | --- |
| [getDataType()](#getDataType--) | Returns the data source type. |
| [getData()](#getData--) | Gets the underlying output stream. |
### StreamDataSource(OutputStream data) {#StreamDataSource-java.io.OutputStream-}
```
public StreamDataSource(OutputStream data)
```


Creates a new output stream data source.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| data | java.io.OutputStream | The output stream. |

### getDataType() {#getDataType--}
```
public DataType getDataType()
```


Returns the data source type.

**Returns:**
[DataType](../../com.aspose.tex.plugins/datatype) - The data source type.
### getData() {#getData--}
```
public OutputStream getData()
```


Gets the underlying output stream.

**Returns:**
java.io.OutputStream - The underlying output stream.
