---
title: ZipArchiveFileSystem
second_title: Aspose.3D for Java API Reference
description: File system to provide to the read-only access to speicified zip file or zip stream.
type: docs
weight: 214
url: /java/com.aspose.threed/ziparchivefilesystem/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.FileSystem](../../com.aspose.threed/filesystem)
```
public class ZipArchiveFileSystem extends FileSystem
```

File system to provide to the read-only access to speicified zip file or zip stream. File system will be disposed after the open/save operation.
## Constructors

| Constructor | Description |
| --- | --- |
| [ZipArchiveFileSystem(Stream stream, String baseDir)](#ZipArchiveFileSystem-com.aspose.threed.Stream-java.lang.String-) | Construct a com.aspose.threed.ZipArchiveFileSystem through a stream. |
| [ZipArchiveFileSystem(Stream stream)](#ZipArchiveFileSystem-com.aspose.threed.Stream-) | Construct a com.aspose.threed.ZipArchiveFileSystem through a stream. |
| [ZipArchiveFileSystem(String fileName)](#ZipArchiveFileSystem-java.lang.String-) | Construct a com.aspose.threed.ZipArchiveFileSystem through a file name. |
## Methods

| Method | Description |
| --- | --- |
| [readFile(String fileName, IOConfig options)](#readFile-java.lang.String-com.aspose.threed.IOConfig-) | Open file for reading |
| [writeFile(String fileName, IOConfig options)](#writeFile-java.lang.String-com.aspose.threed.IOConfig-) | Open file for writing, not implemented in this class. |
| [close()](#close--) | Dispose the ZipArchiveFileSystem and release its internal resources. |
### ZipArchiveFileSystem(Stream stream, String baseDir) {#ZipArchiveFileSystem-com.aspose.threed.Stream-java.lang.String-}
```
public ZipArchiveFileSystem(Stream stream, String baseDir)
```


Construct a com.aspose.threed.ZipArchiveFileSystem through a stream.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | com.aspose.threed.Stream |  |
| baseDir | java.lang.String |  |

### ZipArchiveFileSystem(Stream stream) {#ZipArchiveFileSystem-com.aspose.threed.Stream-}
```
public ZipArchiveFileSystem(Stream stream)
```


Construct a com.aspose.threed.ZipArchiveFileSystem through a stream.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | com.aspose.threed.Stream |  |

### ZipArchiveFileSystem(String fileName) {#ZipArchiveFileSystem-java.lang.String-}
```
public ZipArchiveFileSystem(String fileName)
```


Construct a com.aspose.threed.ZipArchiveFileSystem through a file name.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String |  |

### readFile(String fileName, IOConfig options) {#readFile-java.lang.String-com.aspose.threed.IOConfig-}
```
public Stream readFile(String fileName, IOConfig options)
```


Open file for reading

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


Open file for writing, not implemented in this class.

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


Dispose the ZipArchiveFileSystem and release its internal resources.

