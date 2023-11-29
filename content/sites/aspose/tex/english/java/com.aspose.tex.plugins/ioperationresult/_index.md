---
title: IOperationResult
second_title: Aspose.TeX for Java API Reference
description: The general operation result interface.
type: docs
weight: 24
url: /java/com.aspose.tex.plugins/ioperationresult/
---```
public interface IOperationResult
```

The general operation result interface.
## Methods

| Method | Description |
| --- | --- |
| [isFile()](#isFile--) | Indicates whether the result is a file path. |
| [isStream()](#isStream--) | Indicates whether the result is a stream. |
| [isString()](#isString--) | Indicates whether the result is a string. |
| [isByteArray()](#isByteArray--) | Indicates whether the result is a byte array. |
| [getData()](#getData--) | Gets raw data. |
| [toFile()](#toFile--) | Tries to convert the result to a file. |
| [toStream()](#toStream--) | Tries to convert the result to a stream. |
### isFile() {#isFile--}
```
public abstract boolean isFile()
```


Indicates whether the result is a file path.

**Returns:**
boolean -  True  if the result is a file path; otherwise  false .
### isStream() {#isStream--}
```
public abstract boolean isStream()
```


Indicates whether the result is a stream.

**Returns:**
boolean -  True  if the result is a stream; otherwise  false .
### isString() {#isString--}
```
public abstract boolean isString()
```


Indicates whether the result is a string.

**Returns:**
boolean -  True  if the result is a string; otherwise  false .
### isByteArray() {#isByteArray--}
```
public abstract boolean isByteArray()
```


Indicates whether the result is a byte array.

**Returns:**
boolean -  True  if the result is a byte array; otherwise  false .
### getData() {#getData--}
```
public abstract Object getData()
```


Gets raw data.

**Returns:**
java.lang.Object - An  object  containing output data.
### toFile() {#toFile--}
```
public abstract String toFile()
```


Tries to convert the result to a file.

**Returns:**
java.lang.String - A string the file path if the result is file; otherwise  null .
### toStream() {#toStream--}
```
public abstract OutputStream toStream()
```


Tries to convert the result to a stream.

**Returns:**
java.io.OutputStream - A stream if the result is stream; otherwise  null .
