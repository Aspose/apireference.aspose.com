---
title: LocalFileSystem
second_title: Aspose.3D for Java API Reference
description: The com.aspose.threed.LocalFileSystem will maps the read/write operations to local directory.
type: docs
weight: 88
url: /java/com.aspose.threed/localfilesystem/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.FileSystem](../../com.aspose.threed/filesystem)
```
public class LocalFileSystem extends FileSystem
```

The com.aspose.threed.LocalFileSystem will maps the read/write operations to local directory.
## Constructors

| Constructor | Description |
| --- | --- |
| [LocalFileSystem(String directory)](#LocalFileSystem-java.lang.String-) | Initialize a new com.aspose.threed.LocalFileSystem with specified base directory. |
## Methods

| Method | Description |
| --- | --- |
| [readFile(String fileName, IOConfig options)](#readFile-java.lang.String-com.aspose.threed.IOConfig-) | Create a stream for reading dependencies. |
| [writeFile(String fileName, IOConfig options)](#writeFile-java.lang.String-com.aspose.threed.IOConfig-) | Create a stream for writing dependencies. |
### LocalFileSystem(String directory) {#LocalFileSystem-java.lang.String-}
```
public LocalFileSystem(String directory)
```


Initialize a new com.aspose.threed.LocalFileSystem with specified base directory.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| directory | java.lang.String |  |

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
