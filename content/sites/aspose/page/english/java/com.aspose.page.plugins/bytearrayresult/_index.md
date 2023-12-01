---
title: ByteArrayResult
second_title: Aspose.Page for Java API Reference
description: Represents operation result in the form of the bytes array.
type: docs
weight: 11
url: /java/com.aspose.page.plugins/bytearrayresult/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IOperationResult](../../com.aspose.page.plugins/ioperationresult)
```
public class ByteArrayResult implements IOperationResult
```

Represents operation result in the form of the bytes array.
## Constructors

| Constructor | Description |
| --- | --- |
| [ByteArrayResult(byte[][] data)](#ByteArrayResult-byte-----) | Initializes a new instance with the array of bytes array. |
## Methods

| Method | Description |
| --- | --- |
| [isFile()](#isFile--) | Indicates whether the result is a path to an output file. |
| [isStream()](#isStream--) | Indicates whether the result is an output stream. |
| [isString()](#isString--) | Indicates whether the result is a text string. |
| [isByteArray()](#isByteArray--) | Indicates whether the result is a bytes array. |
| [getData()](#getData--) | Gets raw data. |
| [toFile()](#toFile--) | Tries to convert the result to a file. |
| [toStream()](#toStream--) | Tries to convert the result to a stream object. |
### ByteArrayResult(byte[][] data) {#ByteArrayResult-byte-----}
```
public ByteArrayResult(byte[][] data)
```


Initializes a new instance with the array of bytes array.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| data | byte[][] | Array of array of bytes. It is used for conversion of document to image. One byte array contains bytes of one page image. |

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


Indicates whether the result is an output stream.

**Returns:**
boolean -  true  if the result is a stream object; otherwise  false .
### isString() {#isString--}
```
public final boolean isString()
```


Indicates whether the result is a text string.

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
