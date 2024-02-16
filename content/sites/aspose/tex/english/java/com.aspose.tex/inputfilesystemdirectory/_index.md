---
title: InputFileSystemDirectory
second_title: Aspose.TeX for Java API Reference
description: Implements the regular file systems method for getting a file stream to read from.
type: docs
weight: 14
url: /java/com.aspose.tex/inputfilesystemdirectory/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.tex.IInputWorkingDirectory](../../com.aspose.tex/iinputworkingdirectory), [com.aspose.tex.IFileCollector](../../com.aspose.tex/ifilecollector)
```
public class InputFileSystemDirectory implements IInputWorkingDirectory, IFileCollector
```

Implements the regular file system's method for getting a file stream to read from.
## Constructors

| Constructor | Description |
| --- | --- |
| [InputFileSystemDirectory(String basePath)](#InputFileSystemDirectory-java.lang.String-) | Creates new instance. |
## Methods

| Method | Description |
| --- | --- |
| [getFile(String fileName, boolean searchSubdirectories)](#getFile-java.lang.String-boolean-) | Returns the stream to read from. |
| [getFileNamesByExtension(String extension)](#getFileNamesByExtension-java.lang.String-) | Returns the array of file names by an extension. |
| [getFileNamesByExtension(String extension, String path)](#getFileNamesByExtension-java.lang.String-java.lang.String-) | Returns the array of file names by an extension. |
| [close()](#close--) | Disposes the instance. |
### InputFileSystemDirectory(String basePath) {#InputFileSystemDirectory-java.lang.String-}
```
public InputFileSystemDirectory(String basePath)
```


Creates new instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| basePath | java.lang.String | The base path of the directory. |

### getFile(String fileName, boolean searchSubdirectories) {#getFile-java.lang.String-boolean-}
```
public TeXInputStream getFile(String fileName, boolean searchSubdirectories)
```


Returns the stream to read from.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String | The file name. |
| searchSubdirectories | boolean | Indicates whether to look for a file in subdirectories. |

**Returns:**
[TeXInputStream](../../com.aspose.tex/texinputstream) - The named stream.
### getFileNamesByExtension(String extension) {#getFileNamesByExtension-java.lang.String-}
```
public String[] getFileNamesByExtension(String extension)
```


Returns the array of file names by an extension.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| extension | java.lang.String | The file extension. |

**Returns:**
java.lang.String[] - The array of file names.
### getFileNamesByExtension(String extension, String path) {#getFileNamesByExtension-java.lang.String-java.lang.String-}
```
public String[] getFileNamesByExtension(String extension, String path)
```


Returns the array of file names by an extension.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| extension | java.lang.String | The file extension. |
| path | java.lang.String | The path inside the directory. |

**Returns:**
java.lang.String[] - The array of file names.
### close() {#close--}
```
public void close()
```


Disposes the instance.

