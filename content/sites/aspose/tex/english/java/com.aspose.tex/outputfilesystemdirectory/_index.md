---
title: OutputFileSystemDirectory
second_title: Aspose.TeX for Java API Reference
description: Implements the regular file systems method for getting a file stream to write to.
type: docs
weight: 23
url: /java/com.aspose.tex/outputfilesystemdirectory/
---
**Inheritance:**
java.lang.Object, [com.aspose.tex.InputFileSystemDirectory](../../com.aspose.tex/inputfilesystemdirectory)

**All Implemented Interfaces:**
[com.aspose.tex.IOutputWorkingDirectory](../../com.aspose.tex/ioutputworkingdirectory)
```
public class OutputFileSystemDirectory extends InputFileSystemDirectory implements IOutputWorkingDirectory
```

Implements the regular file system's method for getting a file stream to write to.
## Constructors

| Constructor | Description |
| --- | --- |
| [OutputFileSystemDirectory(String basePath)](#OutputFileSystemDirectory-java.lang.String-) | Creates new instance. |
## Methods

| Method | Description |
| --- | --- |
| [getOutputFile(String fileName)](#getOutputFile-java.lang.String-) | Returns the stream to write to. |
| [close()](#close--) | Disposes the instance. |
### OutputFileSystemDirectory(String basePath) {#OutputFileSystemDirectory-java.lang.String-}
```
public OutputFileSystemDirectory(String basePath)
```


Creates new instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| basePath | java.lang.String | The base path of the directory. |

### getOutputFile(String fileName) {#getOutputFile-java.lang.String-}
```
public TeXOutputStream getOutputFile(String fileName)
```


Returns the stream to write to.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String | The file name. |

**Returns:**
[TeXOutputStream](../../com.aspose.tex/texoutputstream) - The named TeX output stream.
### close() {#close--}
```
public void close()
```


Disposes the instance.

