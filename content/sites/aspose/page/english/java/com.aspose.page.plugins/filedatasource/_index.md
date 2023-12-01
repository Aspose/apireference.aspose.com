---
title: FileDataSource
second_title: Aspose.Page for Java API Reference
description: Represents file data source for load and save operations of a plugin.
type: docs
weight: 13
url: /java/com.aspose.page.plugins/filedatasource/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IDataSource](../../com.aspose.page.plugins/idatasource)
```
public final class FileDataSource implements IDataSource
```

Represents file data source for load and save operations of a plugin.
## Constructors

| Constructor | Description |
| --- | --- |
| [FileDataSource(String path)](#FileDataSource-java.lang.String-) | Initializes new file data source with the specified path. |
## Methods

| Method | Description |
| --- | --- |
| [getDataType()](#getDataType--) | Type of data source (file). |
| [getPath()](#getPath--) | Gets the path to the file of the current data source. |
### FileDataSource(String path) {#FileDataSource-java.lang.String-}
```
public FileDataSource(String path)
```


Initializes new file data source with the specified path.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| path | java.lang.String | A string representing the path to the source file. |

### getDataType() {#getDataType--}
```
public final int getDataType()
```


Type of data source (file).

**Returns:**
int
### getPath() {#getPath--}
```
public final String getPath()
```


Gets the path to the file of the current data source.

**Returns:**
java.lang.String
