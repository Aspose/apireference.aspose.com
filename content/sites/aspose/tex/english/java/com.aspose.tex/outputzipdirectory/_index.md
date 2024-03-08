---
title: OutputZipDirectory
second_title: Aspose.TeX for Java API Reference
description: Implements the method for getting a file stream to write to when working directory is a ZIP archive.
type: docs
weight: 26
url: /java/com.aspose.tex/outputzipdirectory/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.tex.IOutputWorkingDirectory](../../com.aspose.tex/ioutputworkingdirectory)
```
public class OutputZipDirectory implements IOutputWorkingDirectory
```

Implements the method for getting a file stream to write to when working directory is a ZIP archive.
## Constructors

| Constructor | Description |
| --- | --- |
| [OutputZipDirectory(OutputStream zipStream)](#OutputZipDirectory-java.io.OutputStream-) | Creates new instance. |
## Methods

| Method | Description |
| --- | --- |
| [getFile(String fileName, boolean searchSubdirectories)](#getFile-java.lang.String-boolean-) | Returns the stream to read from. |
| [getOutputFile(String fileName)](#getOutputFile-java.lang.String-) | Returns the stream to write to. |
| [finish()](#finish--) | Finalizes ZIP archive. |
| [close()](#close--) | Disposes the instance. |
### OutputZipDirectory(OutputStream zipStream) {#OutputZipDirectory-java.io.OutputStream-}
```
public OutputZipDirectory(OutputStream zipStream)
```


Creates new instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| zipStream | java.io.OutputStream | The stream to write the archive to. |

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
[TeXInputStream](../../com.aspose.tex/texinputstream) - The named TeX input stream.
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
### finish() {#finish--}
```
public void finish()
```


Finalizes ZIP archive.

### close() {#close--}
```
public void close()
```


Disposes the instance.

