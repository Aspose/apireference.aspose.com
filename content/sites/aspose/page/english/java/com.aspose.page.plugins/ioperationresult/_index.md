---
title: IOperationResult
second_title: Aspose.Page for Java API Reference
description: General operation result interface that defines common methods that concrete plugin operation result should implement.
type: docs
weight: 22
url: /java/com.aspose.page.plugins/ioperationresult/
---```
public interface IOperationResult
```

General operation result interface that defines common methods that concrete plugin operation result should implement.
## Methods

| Method | Description |
| --- | --- |
| [getData()](#getData--) | Gets raw data. |
| [isByteArray()](#isByteArray--) | Indicates whether the result is a bytes array. |
| [isFile()](#isFile--) | Indicates whether the result is a path to an output file. |
| [isStream()](#isStream--) | Indicates whether the result is an output stream. |
| [isString()](#isString--) | Indicates whether the result is a text string. |
| [toFile()](#toFile--) | Tries to convert the result to the file. |
| [toStream()](#toStream--) | Tries to convert the result to a stream object. |
### getData() {#getData--}
```
public abstract Object getData()
```


Gets raw data.

**Returns:**
java.lang.Object - An object representing output data.
### isByteArray() {#isByteArray--}
```
public abstract boolean isByteArray()
```


Indicates whether the result is a bytes array.

**Returns:**
boolean -  true  if the result is a bytes array; otherwise  false .
### isFile() {#isFile--}
```
public abstract boolean isFile()
```


Indicates whether the result is a path to an output file.

**Returns:**
boolean - true if the result is a file; otherwise false.
### isStream() {#isStream--}
```
public abstract boolean isStream()
```


Indicates whether the result is an output stream.

**Returns:**
boolean - true if the result is a stream object; otherwise false.
### isString() {#isString--}
```
public abstract boolean isString()
```


Indicates whether the result is a text string.

**Returns:**
boolean - true if the result is a string; otherwise false.
### toFile() {#toFile--}
```
public abstract String toFile()
```


Tries to convert the result to the file.

**Returns:**
java.lang.String - A string representing the path to the output file if the result is file; otherwise null.
### toStream() {#toStream--}
```
public abstract OutputStream toStream()
```


Tries to convert the result to a stream object.

**Returns:**
java.io.OutputStream - A stream object representing the output data if the result is stream; otherwise  null .
