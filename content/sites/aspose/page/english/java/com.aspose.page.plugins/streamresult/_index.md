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
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getData()](#getData--) | Gets raw data. |
| [hashCode()](#hashCode--) |  |
| [isByteArray()](#isByteArray--) | Indicates whether the result is a bytes array. |
| [isFile()](#isFile--) | Indicates whether the result is a path to an output file. |
| [isStream()](#isStream--) | Indicates whether the result is a path to an output file. |
| [isString()](#isString--) | Indicates whether the result is a string. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toFile()](#toFile--) | Tries to convert the result to a file. |
| [toStream()](#toStream--) | Tries to convert the result to a stream object. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### StreamResult(OutputStream stream) {#StreamResult-java.io.OutputStream-}
```
public StreamResult(OutputStream stream)
```


Initializes a new instance with the specified stream object.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | java.io.OutputStream | Stream object |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getData() {#getData--}
```
public final Object getData()
```


Gets raw data.

**Returns:**
java.lang.Object - An  object  representing output data.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isByteArray() {#isByteArray--}
```
public final boolean isByteArray()
```


Indicates whether the result is a bytes array.

**Returns:**
boolean -  true  if the result is a bytes array; otherwise  false .
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
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




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
### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

