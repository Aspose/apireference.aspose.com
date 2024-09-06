---
title: OutputFileTerminal
second_title: Aspose.TeX for Java API Reference
description: Implements a terminal whose output is to be written to a file in some working directory.
type: docs
weight: 24
url: /java/com.aspose.tex/outputfileterminal/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.tex.IOutputTerminal](../../com.aspose.tex/ioutputterminal)
```
public final class OutputFileTerminal implements IOutputTerminal
```

Implements a terminal whose output is to be written to a file in some working directory.
## Constructors

| Constructor | Description |
| --- | --- |
| [OutputFileTerminal(IOutputWorkingDirectory workingDirectory)](#OutputFileTerminal-com.aspose.tex.IOutputWorkingDirectory-) | Creates new instance. |
## Methods

| Method | Description |
| --- | --- |
| [getWriter()](#getWriter--) | Gets the writer for the output terminal. |
| [getStream()](#getStream--) | Gets the underlying stream. |
### OutputFileTerminal(IOutputWorkingDirectory workingDirectory) {#OutputFileTerminal-com.aspose.tex.IOutputWorkingDirectory-}
```
public OutputFileTerminal(IOutputWorkingDirectory workingDirectory)
```


Creates new instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| workingDirectory | [IOutputWorkingDirectory](../../com.aspose.tex/ioutputworkingdirectory) | The working directory. |

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
