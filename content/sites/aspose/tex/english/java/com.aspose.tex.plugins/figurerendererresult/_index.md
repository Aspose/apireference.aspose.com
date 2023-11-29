---
title: FigureRendererResult
second_title: Aspose.TeX for Java API Reference
description: The MathRenderer plugins common result.
type: docs
weight: 12
url: /java/com.aspose.tex.plugins/figurerendererresult/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.tex.plugins.IOperationResult](../../com.aspose.tex.plugins/ioperationresult)
```
public final class FigureRendererResult implements IOperationResult
```

The MathRenderer plugin's common result.
## Methods

| Method | Description |
| --- | --- |
| [getLog()](#getLog--) | Returns the stream containing the transcript file. |
| [getSize()](#getSize--) | Returns the size of the rendered formula. |
| [isFile()](#isFile--) | Indicates whether the result is a file path. |
| [isStream()](#isStream--) | Indicates whether the result is a stream. |
| [isString()](#isString--) | Indicates whether the result is a string. |
| [isByteArray()](#isByteArray--) | Indicates whether the result is a byte array. |
| [getData()](#getData--) | Gets raw data. |
| [toFile()](#toFile--) | Tries to convert the result to a file. |
| [toStream()](#toStream--) | Tries to convert the result to a stream. |
### getLog() {#getLog--}
```
public OutputStream getLog()
```


Returns the stream containing the transcript file.

**Returns:**
java.io.OutputStream - The stream containing the transcript file.
### getSize() {#getSize--}
```
public Size2D getSize()
```


Returns the size of the rendered formula.

**Returns:**
[Size2D](../../com.aspose.tex/size2d) - The size of the rendered formula.
### isFile() {#isFile--}
```
public boolean isFile()
```


Indicates whether the result is a file path.

**Returns:**
boolean -  True  if the result is a file path; otherwise  false .
### isStream() {#isStream--}
```
public boolean isStream()
```


Indicates whether the result is a stream.

**Returns:**
boolean -  True  if the result is a stream; otherwise  false .
### isString() {#isString--}
```
public boolean isString()
```


Indicates whether the result is a string.

**Returns:**
boolean -  True  if the result is a string; otherwise  false .
### isByteArray() {#isByteArray--}
```
public boolean isByteArray()
```


Indicates whether the result is a byte array.

**Returns:**
boolean -  True  if the result is a byte array; otherwise  false .
### getData() {#getData--}
```
public Object getData()
```


Gets raw data.

**Returns:**
java.lang.Object - An  object  containing output data.
### toFile() {#toFile--}
```
public String toFile()
```


Tries to convert the result to a file.

**Returns:**
java.lang.String - A string the file path if the result is file; otherwise  null .
### toStream() {#toStream--}
```
public OutputStream toStream()
```


Tries to convert the result to a stream.

**Returns:**
java.io.OutputStream - A stream if the result is stream; otherwise  null .
