---
title: StreamSource
second_title: Aspose.Font for Java API Reference
description: Defines a way to get a file stream when it is needed.
type: docs
weight: 73
url: /java/com.aspose.font/streamsource/
---
**Inheritance:**
java.lang.Object
```
public abstract class StreamSource
```

Defines a way to get a file stream when it is needed.
## Constructors

| Constructor | Description |
| --- | --- |
| [StreamSource()](#StreamSource--) | Initializes stream source instance. |
## Methods

| Method | Description |
| --- | --- |
| [deepClone()](#deepClone--) | Clones the stream source object. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getFontStream()](#getFontStream--) | Returns Font stream. |
| [getOffset()](#getOffset--) | Gets offset inside the source. |
| [hashCode()](#hashCode--) |  |
| [mustCloseAfterUse()](#mustCloseAfterUse--) | The inheritors may prevent stream from closing. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setOffset(long value)](#setOffset-long-) | Sets offset inside the source. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### StreamSource() {#StreamSource--}
```
public StreamSource()
```


Initializes stream source instance.

### deepClone() {#deepClone--}
```
public abstract Object deepClone()
```


Clones the stream source object.

**Returns:**
java.lang.Object - Copy of the stream source object.
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
### getFontStream() {#getFontStream--}
```
public abstract InputStream getFontStream()
```


Returns Font stream.

**Returns:**
java.io.InputStream - Font stream.
### getOffset() {#getOffset--}
```
public long getOffset()
```


Gets offset inside the source.

**Returns:**
long - Offset inside the source.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### mustCloseAfterUse() {#mustCloseAfterUse--}
```
public boolean mustCloseAfterUse()
```


The inheritors may prevent stream from closing. Returns true if the stream source wants the stream to be closed after use. Otherwise returns false.

**Returns:**
boolean - True if the stream source wants the stream to be closed after use, otherwise false.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setOffset(long value) {#setOffset-long-}
```
public void setOffset(long value)
```


Sets offset inside the source.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | long | Offset inside the source. |

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

