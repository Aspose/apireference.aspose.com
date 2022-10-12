---
title: InputConsoleTerminal
second_title: Aspose.TeX for Java API Reference
description: Provides the console as a terminal input source.
type: docs
weight: 11
url: /java/com.aspose.tex/inputconsoleterminal/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.tex.IInputTerminal](../../com.aspose.tex/iinputterminal)
```
public class InputConsoleTerminal implements IInputTerminal
```

Provides the console as a terminal input source. Wrapper for  System.in .
## Constructors

| Constructor | Description |
| --- | --- |
| [InputConsoleTerminal()](#InputConsoleTerminal--) |  |
## Methods

| Method | Description |
| --- | --- |
| [getReader()](#getReader--) | Gets the console as a terminal input source. |
| [getStream()](#getStream--) | Gets the underlying stream. |
### InputConsoleTerminal() {#InputConsoleTerminal--}
```
public InputConsoleTerminal()
```


### getReader() {#getReader--}
```
public BufferedReader getReader()
```


Gets the console as a terminal input source.

**Returns:**
java.io.BufferedReader - The  BufferedReader  class instance.
### getStream() {#getStream--}
```
public InputStream getStream()
```


Gets the underlying stream.

**Returns:**
java.io.InputStream -  System.in 
