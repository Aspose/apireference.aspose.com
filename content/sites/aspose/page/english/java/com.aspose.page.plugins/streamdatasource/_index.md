---
title: StreamDataSource
second_title: Aspose.Page for Java API Reference
description: Represents stream data source for load and save operations of a plugin.
type: docs
weight: 17
url: /java/com.aspose.page.plugins/streamdatasource/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IDataSource](../../com.aspose.page.plugins/idatasource)
```
public final class StreamDataSource implements IDataSource
```

Represents stream data source for load and save operations of a plugin.
## Constructors

| Constructor | Description |
| --- | --- |
| [StreamDataSource(Object data)](#StreamDataSource-java.lang.Object-) | Initializes new stream data source with the specified stream object. |
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getData()](#getData--) | Gets the stream object of the current data source. |
| [getDataType()](#getDataType--) | Type of data source (stream). |
| [getInputStream()](#getInputStream--) |  |
| [getOutputStream()](#getOutputStream--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### StreamDataSource(Object data) {#StreamDataSource-java.lang.Object-}
```
public StreamDataSource(Object data)
```


Initializes new stream data source with the specified stream object.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| data | java.lang.Object | Stream object |

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


Gets the stream object of the current data source.

**Returns:**
java.lang.Object
### getDataType() {#getDataType--}
```
public final int getDataType()
```


Type of data source (stream).

**Returns:**
int
### getInputStream() {#getInputStream--}
```
public final InputStream getInputStream()
```




**Returns:**
java.io.InputStream
### getOutputStream() {#getOutputStream--}
```
public final OutputStream getOutputStream()
```




**Returns:**
java.io.OutputStream
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




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

