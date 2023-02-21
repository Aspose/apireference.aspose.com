---
title: IOutputTerminal
second_title: Aspose.TeX for Java API Reference
description: Interface for abstract output terminal.
type: docs
weight: 44
url: /java/com.aspose.tex/ioutputterminal/
---```
public interface IOutputTerminal
```

Interface for abstract output terminal.
## Methods

| Method | Description |
| --- | --- |
| [getWriter()](#getWriter--) | Gets the writer for the output terminal. |
| [getStream()](#getStream--) | Gets the underlying stream. |
### getWriter() {#getWriter--}
```
public abstract BufferedWriter getWriter()
```


Gets the writer for the output terminal.

**Returns:**
java.io.BufferedWriter - The  BufferedWriter  class instance.
### getStream() {#getStream--}
```
public abstract OutputStream getStream()
```


Gets the underlying stream.

**Returns:**
java.io.OutputStream - The stream.
