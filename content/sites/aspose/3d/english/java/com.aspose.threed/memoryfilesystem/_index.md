---
title: MemoryFileSystem
second_title: Aspose.3D for Java API Reference
description: The com.aspose.threed.MemoryFileSystem will maps the read/write operations to memory.
type: docs
weight: 92
url: /java/com.aspose.threed/memoryfilesystem/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.FileSystem](../../com.aspose.threed/filesystem)
```
public class MemoryFileSystem extends FileSystem
```

The com.aspose.threed.MemoryFileSystem will maps the read/write operations to memory.
## Constructors

| Constructor | Description |
| --- | --- |
| [MemoryFileSystem()](#MemoryFileSystem--) |  |
## Methods

| Method | Description |
| --- | --- |
| [getFileNames()](#getFileNames--) | File names that in this memory file system. |
| [getFileContent(String fileName)](#getFileContent-java.lang.String-) | Returns the raw content of the specified file. |
| [readFile(String fileName, IOConfig options)](#readFile-java.lang.String-com.aspose.threed.IOConfig-) | Create a stream for reading dependencies. |
| [writeFile(String fileName, IOConfig options)](#writeFile-java.lang.String-com.aspose.threed.IOConfig-) | Create a stream for writing dependencies. |
### MemoryFileSystem() {#MemoryFileSystem--}
```
public MemoryFileSystem()
```


### getFileNames() {#getFileNames--}
```
public List<String> getFileNames()
```


File names that in this memory file system.

**Returns:**
java.util.List<java.lang.String>
### getFileContent(String fileName) {#getFileContent-java.lang.String-}
```
public byte[] getFileContent(String fileName)
```


Returns the raw content of the specified file. Throw java.io.FileNotFoundException if the specified file is not existing.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String |  |

**Returns:**
byte[]
### readFile(String fileName, IOConfig options) {#readFile-java.lang.String-com.aspose.threed.IOConfig-}
```
public Stream readFile(String fileName, IOConfig options)
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
public Stream writeFile(String fileName, IOConfig options)
```


Create a stream for writing dependencies.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String |  |
| options | [IOConfig](../../com.aspose.threed/ioconfig) |  |

**Returns:**
com.aspose.threed.Stream
