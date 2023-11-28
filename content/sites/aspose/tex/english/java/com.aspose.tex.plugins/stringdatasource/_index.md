---
title: StringDataSource
second_title: Aspose.TeX for Java API Reference
description: The string data source for plugins load operations.
type: docs
weight: 20
url: /java/com.aspose.tex.plugins/stringdatasource/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.tex.plugins.IDataSource](../../com.aspose.tex.plugins/idatasource)
```
public final class StringDataSource implements IDataSource
```

The string data source for plugin's load operations.
## Constructors

| Constructor | Description |
| --- | --- |
| [StringDataSource(String data)](#StringDataSource-java.lang.String-) | Creates a new string data source. |
## Methods

| Method | Description |
| --- | --- |
| [getDataType()](#getDataType--) | Returns the data source type. |
| [getData()](#getData--) | Gets the underlying string. |
### StringDataSource(String data) {#StringDataSource-java.lang.String-}
```
public StringDataSource(String data)
```


Creates a new string data source.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| data | java.lang.String | The string data. |

### getDataType() {#getDataType--}
```
public DataType getDataType()
```


Returns the data source type.

**Returns:**
[DataType](../../com.aspose.tex.plugins/datatype) - The data source type.
### getData() {#getData--}
```
public String getData()
```


Gets the underlying string.

**Returns:**
java.lang.String - The underlying string.
