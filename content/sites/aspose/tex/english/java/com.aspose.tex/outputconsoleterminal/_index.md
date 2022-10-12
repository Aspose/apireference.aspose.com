---
title: OutputConsoleTerminal
second_title: Aspose.TeX for Java API Reference
description: Provides the console as a terminal output destination.
type: docs
weight: 20
url: /java/com.aspose.tex/outputconsoleterminal/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.tex.IOutputTerminal](../../com.aspose.tex/ioutputterminal)
```
public class OutputConsoleTerminal implements IOutputTerminal
```

Provides the console as a terminal output destination. Wrapper for  System.out .
## Constructors

| Constructor | Description |
| --- | --- |
| [OutputConsoleTerminal()](#OutputConsoleTerminal--) |  |
## Methods

| Method | Description |
| --- | --- |
| [getWriter()](#getWriter--) | Gets the console as a terminal output destination. |
| [getStream()](#getStream--) | Gets  System.out . |
### OutputConsoleTerminal() {#OutputConsoleTerminal--}
```
public OutputConsoleTerminal()
```


### getWriter() {#getWriter--}
```
public BufferedWriter getWriter()
```


Gets the console as a terminal output destination.

**Returns:**
java.io.BufferedWriter - The  BufferedWriter  class instance.
### getStream() {#getStream--}
```
public OutputStream getStream()
```


Gets  System.out .

**Returns:**
java.io.OutputStream -  System.out .
