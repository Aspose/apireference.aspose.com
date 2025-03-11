---
title: Stream
second_title: Aspose.3D for Java API Reference
description: Created by lexchou on 12/14/2016.
type: docs
weight: 174
url: /java/com.aspose.threed/stream/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.io.Closeable
```
public abstract class Stream implements Closeable
```

Created by lexchou on 12/14/2016.
## Fields

| Field | Description |
| --- | --- |
| [SEEK_CURRENT](#SEEK-CURRENT) |  |
| [SEEK_END](#SEEK-END) |  |
| [SEEK_SET](#SEEK-SET) |  |
## Methods

| Method | Description |
| --- | --- |
| [close()](#close--) |  |
| [copyTo(Stream output)](#copyTo-com.aspose.threed.Stream-) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [flush()](#flush--) |  |
| [getClass()](#getClass--) |  |
| [getInputStream()](#getInputStream--) |  |
| [getLength()](#getLength--) |  |
| [getOutputStream()](#getOutputStream--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [read(byte[] buf)](#read-byte---) |  |
| [read(byte[] buf, int start, int len)](#read-byte---int-int-) |  |
| [read(ByteSpan bytes)](#read-com.aspose.threed.ByteSpan-) |  |
| [readByte()](#readByte--) |  |
| [seek(long offset, int seek)](#seek-long-int-) |  |
| [setLength(long len)](#setLength-long-) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
| [wrap(InputStream stream)](#wrap-java.io.InputStream-) |  |
| [wrap(OutputStream stream)](#wrap-java.io.OutputStream-) | Wrap an OutputStream as Stream, the stream must be closed to flush data to output stream. |
| [write(byte[] buf)](#write-byte---) |  |
| [write(byte[] buf, int start, int len)](#write-byte---int-int-) |  |
| [write(ByteSpan bytes)](#write-com.aspose.threed.ByteSpan-) |  |
| [writeByte(int b)](#writeByte-int-) |  |
### SEEK_CURRENT {#SEEK-CURRENT}
```
public static final int SEEK_CURRENT
```


### SEEK_END {#SEEK-END}
```
public static final int SEEK_END
```


### SEEK_SET {#SEEK-SET}
```
public static final int SEEK_SET
```


### close() {#close--}
```
public void close()
```




### copyTo(Stream output) {#copyTo-com.aspose.threed.Stream-}
```
public void copyTo(Stream output)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| output | [Stream](../../com.aspose.threed/stream) |  |

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
### flush() {#flush--}
```
public void flush()
```




### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getInputStream() {#getInputStream--}
```
public InputStream getInputStream()
```




**Returns:**
java.io.InputStream
### getLength() {#getLength--}
```
public long getLength()
```




**Returns:**
long
### getOutputStream() {#getOutputStream--}
```
public OutputStream getOutputStream()
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




### read(byte[] buf) {#read-byte---}
```
public int read(byte[] buf)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| buf | byte[] |  |

**Returns:**
int
### read(byte[] buf, int start, int len) {#read-byte---int-int-}
```
public int read(byte[] buf, int start, int len)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| buf | byte[] |  |
| start | int |  |
| len | int |  |

**Returns:**
int
### read(ByteSpan bytes) {#read-com.aspose.threed.ByteSpan-}
```
public int read(ByteSpan bytes)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| bytes | com.aspose.threed.ByteSpan |  |

**Returns:**
int
### readByte() {#readByte--}
```
public int readByte()
```




**Returns:**
int
### seek(long offset, int seek) {#seek-long-int-}
```
public long seek(long offset, int seek)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| offset | long |  |
| seek | int |  |

**Returns:**
long
### setLength(long len) {#setLength-long-}
```
public void setLength(long len)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| len | long |  |

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
public final void wait(long arg0)
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

### wrap(InputStream stream) {#wrap-java.io.InputStream-}
```
public static Stream wrap(InputStream stream)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | java.io.InputStream |  |

**Returns:**
[Stream](../../com.aspose.threed/stream)
### wrap(OutputStream stream) {#wrap-java.io.OutputStream-}
```
public static Stream wrap(OutputStream stream)
```


Wrap an OutputStream as Stream, the stream must be closed to flush data to output stream.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | java.io.OutputStream | output stream to wrap |

**Returns:**
[Stream](../../com.aspose.threed/stream) - wrapped Stream instance
### write(byte[] buf) {#write-byte---}
```
public void write(byte[] buf)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| buf | byte[] |  |

### write(byte[] buf, int start, int len) {#write-byte---int-int-}
```
public void write(byte[] buf, int start, int len)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| buf | byte[] |  |
| start | int |  |
| len | int |  |

### write(ByteSpan bytes) {#write-com.aspose.threed.ByteSpan-}
```
public void write(ByteSpan bytes)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| bytes | com.aspose.threed.ByteSpan |  |

### writeByte(int b) {#writeByte-int-}
```
public void writeByte(int b)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| b | int |  |

