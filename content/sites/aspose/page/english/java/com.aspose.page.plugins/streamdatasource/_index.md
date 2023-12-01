---
title: StreamDataSource
second_title: Aspose.Page for Java API Reference
description: Represents stream data source for load and save operations of a plugin.
type: docs
weight: 17
url: /java/com.aspose.page.plugins/streamdatasource/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IDataSource](../../com.aspose.page.plugins/idatasource)
```
public final class StreamDataSource implements IDataSource
```

Represents stream data source for load and save operations of a plugin.
## Constructors

| Constructor | Description |
| --- | --- |
| [StreamDataSource(Object data)](#StreamDataSource-java.lang.Object-) | Initializes new stream data source with the specified stream object. |
## Methods

| Method | Description |
| --- | --- |
| [getDataType()](#getDataType--) | Type of data source (stream). |
| [getData()](#getData--) | Gets the stream object of the current data source. |
| [getInputStream()](#getInputStream--) |  |
| [getOutputStream()](#getOutputStream--) |  |
### StreamDataSource(Object data) {#StreamDataSource-java.lang.Object-}
```
public StreamDataSource(Object data)
```


Initializes new stream data source with the specified stream object.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| data | java.lang.Object | Stream object |

### getDataType() {#getDataType--}
```
public final int getDataType()
```


Type of data source (stream).

**Returns:**
int
### getData() {#getData--}
```
public final Object getData()
```


Gets the stream object of the current data source.

**Returns:**
java.lang.Object
### getInputStream() {#getInputStream--}
```
public final InputStream getInputStream()
```




**Returns:**
java.io.InputStream
### getOutputStream() {#getOutputStream--}
```
public final OutputStream getOutputStream()
```




**Returns:**
java.io.OutputStream
