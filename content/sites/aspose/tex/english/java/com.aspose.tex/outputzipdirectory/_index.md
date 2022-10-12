---
title: OutputZipDirectory
second_title: Aspose.TeX for Java API Reference
description: Implements the method for getting a file stream to write to when working directory is a ZIP archive.
type: docs
weight: 24
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
| [getFile(String fileName, String[] fullName, boolean searchSubdirectories)](#getFile-java.lang.String-java.lang.String---boolean-) | Returns the stream to read from. |
| [getOutputFile(String fileName, String[] fullName)](#getOutputFile-java.lang.String-java.lang.String---) | Returns the stream to write to. |
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
[TeXInputStream](../../com.aspose.tex/texinputstream) - The stream.
### getOutputFile(String fileName, String[] fullName) {#getOutputFile-java.lang.String-java.lang.String---}
```
public OutputStream getOutputFile(String fileName, String[] fullName)
```


Returns the stream to write to.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String | The file name. |
| fullName | java.lang.String[] | The full file name. |

**Returns:**
java.io.OutputStream - The stream. The full file name via  fullName  parameter.
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

