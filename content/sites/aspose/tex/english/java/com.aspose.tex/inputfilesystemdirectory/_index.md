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
[com.aspose.tex.IInputWorkingDirectory](../../com.aspose.tex/iinputworkingdirectory)
```
public class InputFileSystemDirectory implements IInputWorkingDirectory
```

Implements the regular file system's method for getting a file stream to read from.
## Constructors

| Constructor | Description |
| --- | --- |
| [InputFileSystemDirectory(String basePath)](#InputFileSystemDirectory-java.lang.String-) | Creates new instance. |
## Methods

| Method | Description |
| --- | --- |
| [getFile(String fileName, String[] fullName, boolean searchSubdirectories)](#getFile-java.lang.String-java.lang.String---boolean-) | Returns the stream to read from. |
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

