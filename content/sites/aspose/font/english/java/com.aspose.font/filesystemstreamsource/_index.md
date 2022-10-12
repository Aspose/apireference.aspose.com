---
title: FileSystemStreamSource
second_title: Aspose.Font for Java API Reference
description: Represents a stream source based on file system.
type: docs
weight: 22
url: /java/com.aspose.font/filesystemstreamsource/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.StreamSource](../../com.aspose.font/streamsource)
```
public class FileSystemStreamSource extends StreamSource
```

Represents a stream source based on file system.
## Constructors

| Constructor | Description |
| --- | --- |
| [FileSystemStreamSource(String fileName)](#FileSystemStreamSource-java.lang.String-) | Initializes new  FileSystemStreamSource  object. |
## Methods

| Method | Description |
| --- | --- |
| [getFileName()](#getFileName--) | Gets file name. |
| [setFileName(String value)](#setFileName-java.lang.String-) | Sets file name. |
| [getFontStream()](#getFontStream--) | Returns Font file stream. |
| [deepClone()](#deepClone--) | Clones the FileSystemStreamSource object. |
### FileSystemStreamSource(String fileName) {#FileSystemStreamSource-java.lang.String-}
```
public FileSystemStreamSource(String fileName)
```


Initializes new  FileSystemStreamSource  object.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String | File name. |

### getFileName() {#getFileName--}
```
public String getFileName()
```


Gets file name.

**Returns:**
java.lang.String - File name.
### setFileName(String value) {#setFileName-java.lang.String-}
```
public void setFileName(String value)
```


Sets file name.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | File name. |

### getFontStream() {#getFontStream--}
```
public InputStream getFontStream()
```


Returns Font file stream. Don't forget to close the stream after use.

**Returns:**
java.io.InputStream - Font file stream.
### deepClone() {#deepClone--}
```
public Object deepClone()
```


Clones the FileSystemStreamSource object.

**Returns:**
java.lang.Object - Copy of FileSystemStreamSource object.
