---
title: OutputMemoryTerminal
second_title: Aspose.TeX for Java API Reference
description: Provides a memory stream as a terminal output destination.
type: docs
weight: 25
url: /java/com.aspose.tex/outputmemoryterminal/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.tex.IOutputTerminal](../../com.aspose.tex/ioutputterminal)
```
public class OutputMemoryTerminal implements IOutputTerminal
```

Provides a memory stream as a terminal output destination.
## Constructors

| Constructor | Description |
| --- | --- |
| [OutputMemoryTerminal()](#OutputMemoryTerminal--) |  |
## Methods

| Method | Description |
| --- | --- |
| [getWriter()](#getWriter--) | Gets the writer for the output terminal. |
| [getStream()](#getStream--) | Gets the memory stream. |
| [getInputStream()](#getInputStream--) | Returns input stream to read the data that was written. |
### OutputMemoryTerminal() {#OutputMemoryTerminal--}
```
public OutputMemoryTerminal()
```


### getWriter() {#getWriter--}
```
public BufferedWriter getWriter()
```


Gets the writer for the output terminal.

**Returns:**
java.io.BufferedWriter - The BufferedWriter class instance.
### getStream() {#getStream--}
```
public OutputStream getStream()
```


Gets the memory stream.

**Returns:**
java.io.OutputStream - The stream.
### getInputStream() {#getInputStream--}
```
public InputStream getInputStream()
```


Returns input stream to read the data that was written.

**Returns:**
java.io.InputStream - The input stream.
