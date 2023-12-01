---
title: StreamResult
second_title: Aspose.Page for Java API Reference
description: Represents operation result in the form of Stream.
type: docs
weight: 18
url: /java/com.aspose.page.plugins/streamresult/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IOperationResult](../../com.aspose.page.plugins/ioperationresult)
```
public final class StreamResult implements IOperationResult
```

Represents operation result in the form of Stream.
## Constructors

| Constructor | Description |
| --- | --- |
| [StreamResult(OutputStream stream)](#StreamResult-java.io.OutputStream-) | Initializes a new instance with the specified stream object. |
## Methods

| Method | Description |
| --- | --- |
| [isFile()](#isFile--) | Indicates whether the result is a path to an output file. |
| [isStream()](#isStream--) | Indicates whether the result is a path to an output file. |
| [isString()](#isString--) | Indicates whether the result is a string. |
| [isByteArray()](#isByteArray--) | Indicates whether the result is a bytes array. |
| [getData()](#getData--) | Gets raw data. |
| [toFile()](#toFile--) | Tries to convert the result to a file. |
| [toStream()](#toStream--) | Tries to convert the result to a stream object. |
### StreamResult(OutputStream stream) {#StreamResult-java.io.OutputStream-}
```
public StreamResult(OutputStream stream)
```


Initializes a new instance with the specified stream object.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | java.io.OutputStream | Stream object |

### isFile() {#isFile--}
```
public final boolean isFile()
```


Indicates whether the result is a path to an output file.

**Returns:**
boolean -  true  if the result is a file; otherwise  false .
### isStream() {#isStream--}
```
public final boolean isStream()
```


Indicates whether the result is a path to an output file.

**Returns:**
boolean -  true  if the result is a stream object; otherwise  false .
### isString() {#isString--}
```
public final boolean isString()
```


Indicates whether the result is a string.

**Returns:**
boolean -  true  if the result is a string; otherwise  false .
### isByteArray() {#isByteArray--}
```
public final boolean isByteArray()
```


Indicates whether the result is a bytes array.

**Returns:**
boolean -  true  if the result is a bytes array; otherwise  false .
### getData() {#getData--}
```
public final Object getData()
```


Gets raw data.

**Returns:**
java.lang.Object - An  object  representing output data.
### toFile() {#toFile--}
```
public final String toFile()
```


Tries to convert the result to a file.

**Returns:**
java.lang.String - A string representing the path to the output file if the result is file; otherwise  null .
### toStream() {#toStream--}
```
public final OutputStream toStream()
```


Tries to convert the result to a stream object.

**Returns:**
java.io.OutputStream - A stream object representing the output data if the result is stream; otherwise  null .
