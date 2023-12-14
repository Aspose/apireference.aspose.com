---
title: InputZipDirectory
second_title: Aspose.TeX for Java API Reference
description: Implements the method for getting a file stream to write to when working directory is a ZIP archive.
type: docs
weight: 15
url: /java/com.aspose.tex/inputzipdirectory/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.tex.IInputWorkingDirectory](../../com.aspose.tex/iinputworkingdirectory), [com.aspose.tex.IFileCollector](../../com.aspose.tex/ifilecollector)
```
public class InputZipDirectory implements IInputWorkingDirectory, IFileCollector
```

Implements the method for getting a file stream to write to when working directory is a ZIP archive.
## Constructors

| Constructor | Description |
| --- | --- |
| [InputZipDirectory(InputStream zipStream, String basePath)](#InputZipDirectory-java.io.InputStream-java.lang.String-) | Creates new instance. |
## Methods

| Method | Description |
| --- | --- |
| [getFile(String fileName, String[] fullName, boolean searchSubdirectories)](#getFile-java.lang.String-java.lang.String---boolean-) | Returns the stream to read from. |
| [getFileNamesByExtension(String extension)](#getFileNamesByExtension-java.lang.String-) | Returns the array of file names by an extension. |
| [getFileNamesByExtension(String extension, String path)](#getFileNamesByExtension-java.lang.String-java.lang.String-) | Returns the array of file names by an extension. |
| [close()](#close--) | Disposes the instance. |
### InputZipDirectory(InputStream zipStream, String basePath) {#InputZipDirectory-java.io.InputStream-java.lang.String-}
```
public InputZipDirectory(InputStream zipStream, String basePath)
```


Creates new instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| zipStream | java.io.InputStream | The stream to write the archive to. |
| basePath | java.lang.String | The base path inside the ZIP archive. |

### getFile(String fileName, String[] fullName, boolean searchSubdirectories) {#getFile-java.lang.String-java.lang.String---boolean-}
```
public TeXInputStream getFile(String fileName, String[] fullName, boolean searchSubdirectories)
```


Returns the stream to read from.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String | The file name. |
| fullName | java.lang.String[] | The full file name. |
| searchSubdirectories | boolean | Indicates whether to look for a file in subdirectories. |

**Returns:**
[TeXInputStream](../../com.aspose.tex/texinputstream) - The stream. The full file name via  fullName  parameter.
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

