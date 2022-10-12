---
title: OutputFileTerminal
second_title: Aspose.TeX for Java API Reference
description: Implements a terminal whose output is to be written to a file in some working directory.
type: docs
weight: 22
url: /java/com.aspose.tex/outputfileterminal/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.tex.IOutputTerminal](../../com.aspose.tex/ioutputterminal), [com.aspose.tex.IFileTerminal](../../com.aspose.tex/ifileterminal)
```
public class OutputFileTerminal implements IOutputTerminal, IFileTerminal
```

Implements a terminal whose output is to be written to a file in some working directory.
## Constructors

| Constructor | Description |
| --- | --- |
| [OutputFileTerminal(IOutputWorkingDirectory workingDirectory)](#OutputFileTerminal-com.aspose.tex.IOutputWorkingDirectory-) | Creates new instance. |
## Methods

| Method | Description |
| --- | --- |
| [getFileName()](#getFileName--) | Gets the file name. |
| [setFileName(String value)](#setFileName-java.lang.String-) | Sets the file name. |
| [getWriter()](#getWriter--) | Gets the writer for the output terminal. |
| [getStream()](#getStream--) | Gets the underlying stream. |
| [writeFile()](#writeFile--) | Finalizes the log, e.g., writes it to file. |
### OutputFileTerminal(IOutputWorkingDirectory workingDirectory) {#OutputFileTerminal-com.aspose.tex.IOutputWorkingDirectory-}
```
public OutputFileTerminal(IOutputWorkingDirectory workingDirectory)
```


Creates new instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| workingDirectory | [IOutputWorkingDirectory](../../com.aspose.tex/ioutputworkingdirectory) | The working directory. |

### getFileName() {#getFileName--}
```
public String getFileName()
```


Gets the file name.

**Returns:**
java.lang.String - The file name.
### setFileName(String value) {#setFileName-java.lang.String-}
```
public void setFileName(String value)
```


Sets the file name.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | The file name. |

### getWriter() {#getWriter--}
```
public BufferedWriter getWriter()
```


Gets the writer for the output terminal.

**Returns:**
java.io.BufferedWriter - The  BufferedWriter  class instance.
### getStream() {#getStream--}
```
public OutputStream getStream()
```


Gets the underlying stream.

**Returns:**
java.io.OutputStream - The stream.
### writeFile() {#writeFile--}
```
public void writeFile()
```


Finalizes the log, e.g., writes it to file.

