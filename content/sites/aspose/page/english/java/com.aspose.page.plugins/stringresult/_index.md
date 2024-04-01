---
title: StringResult
second_title: Aspose.Page for Java API Reference
description: Represents operation result in the form of string.
type: docs
weight: 19
url: /java/com.aspose.page.plugins/stringresult/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IOperationResult](../../com.aspose.page.plugins/ioperationresult)
```
public final class StringResult implements IOperationResult
```

Represents operation result in the form of string.
## Constructors

| Constructor | Description |
| --- | --- |
| [StringResult(String result)](#StringResult-java.lang.String-) | Initializes new StringResult instance with a string. |
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getData()](#getData--) | Gets raw data. |
| [getText()](#getText--) | Returns string representation of the result. |
| [hashCode()](#hashCode--) |  |
| [isByteArray()](#isByteArray--) | Indicates whether the result is a bytes array. |
| [isFile()](#isFile--) | Indicates whether the result is a path to an output file. |
| [isStream()](#isStream--) | Indicates whether the result is a path to an output file. |
| [isString()](#isString--) | Indicates whether the result is a string. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toFile()](#toFile--) | Tries to convert the result to a file. |
| [toStream()](#toStream--) | Tries to convert the result to a stream object. |
| [toString()](#toString--) | Tries to convert the result to a string. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### StringResult(String result) {#StringResult-java.lang.String-}
```
public StringResult(String result)
```


Initializes new StringResult instance with a string.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| result | java.lang.String | String representing the result |

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
### getText() {#getText--}
```
public final String getText()
```


Returns string representation of the result.

**Returns:**
java.lang.String
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


Tries to convert the result to a string.

**Returns:**
java.lang.String - A string representing the text content if the result is string; otherwise returns base.ToString().
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

