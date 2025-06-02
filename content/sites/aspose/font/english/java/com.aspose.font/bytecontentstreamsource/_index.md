---
title: ByteContentStreamSource
second_title: Aspose.Font for Java API Reference
description: Represents a stream source based on _content stream.
type: docs
weight: 17
url: /java/com.aspose.font/bytecontentstreamsource/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.StreamSource](../../com.aspose.font/streamsource)
```
public class ByteContentStreamSource extends StreamSource
```

Represents a stream source based on \_content stream.
## Constructors

| Constructor | Description |
| --- | --- |
| [ByteContentStreamSource(byte[] fileContent)](#ByteContentStreamSource-byte---) | Initializes new  ByteContentStreamSource  object. |
## Methods

| Method | Description |
| --- | --- |
| [deepClone()](#deepClone--) | Clones the ByteContentStreamSource object. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getFontStream()](#getFontStream--) | Returns Font file stream. |
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
### ByteContentStreamSource(byte[] fileContent) {#ByteContentStreamSource-byte---}
```
public ByteContentStreamSource(byte[] fileContent)
```


Initializes new  ByteContentStreamSource  object.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileContent | byte[] | File bytes. |

### deepClone() {#deepClone--}
```
public Object deepClone()
```


Clones the ByteContentStreamSource object.

**Returns:**
java.lang.Object
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
public InputStream getFontStream()
```


Returns Font file stream. Don't forget to close the stream after use.

**Returns:**
java.io.InputStream - Font file stream.
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

