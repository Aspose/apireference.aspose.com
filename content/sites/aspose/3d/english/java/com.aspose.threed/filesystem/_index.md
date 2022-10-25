---
title: FileSystem
second_title: Aspose.3D for Java API Reference
description: File system encapsulation.
type: docs
weight: 63
url: /java/com.aspose.threed/filesystem/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.io.Closeable
```
public abstract class FileSystem implements Closeable
```

File system encapsulation. Aspose.3D will use this to read/write dependencies.
## Constructors

| Constructor | Description |
| --- | --- |
| [FileSystem()](#FileSystem--) |  |
## Methods

| Method | Description |
| --- | --- |
| [readFile(String fileName, IOConfig options)](#readFile-java.lang.String-com.aspose.threed.IOConfig-) | Create a stream for reading dependencies. |
| [writeFile(String fileName, IOConfig options)](#writeFile-java.lang.String-com.aspose.threed.IOConfig-) | Create a stream for writing dependencies. |
| [close()](#close--) | Dispose the File system and release its resources. |
### FileSystem() {#FileSystem--}
```
public FileSystem()
```


### readFile(String fileName, IOConfig options) {#readFile-java.lang.String-com.aspose.threed.IOConfig-}
```
public abstract Stream readFile(String fileName, IOConfig options)
```


Create a stream for reading dependencies.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String |  |
| options | [IOConfig](../../com.aspose.threed/ioconfig) |  |

**Returns:**
com.aspose.threed.Stream
### writeFile(String fileName, IOConfig options) {#writeFile-java.lang.String-com.aspose.threed.IOConfig-}
```
public abstract Stream writeFile(String fileName, IOConfig options)
```


Create a stream for writing dependencies.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String |  |
| options | [IOConfig](../../com.aspose.threed/ioconfig) |  |

**Returns:**
com.aspose.threed.Stream
### close() {#close--}
```
public void close()
```


Dispose the File system and release its resources.

