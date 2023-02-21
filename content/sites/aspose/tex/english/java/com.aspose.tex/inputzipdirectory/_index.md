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
[com.aspose.tex.IInputWorkingDirectory](../../com.aspose.tex/iinputworkingdirectory)
```
public class InputZipDirectory implements IInputWorkingDirectory
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
### close() {#close--}
```
public void close()
```


Disposes the instance.

