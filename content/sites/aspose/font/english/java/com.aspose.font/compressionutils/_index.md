---
title: CompressionUtils
second_title: Aspose.Font for Java API Reference
description: Provides utility methods for compression and decompression.
type: docs
weight: 28
url: /java/com.aspose.font/compressionutils/
---
**Inheritance:**
java.lang.Object
```
public class CompressionUtils
```

Provides utility methods for compression and decompression.
## Constructors

| Constructor | Description |
| --- | --- |
| [CompressionUtils()](#CompressionUtils--) |  |
## Methods

| Method | Description |
| --- | --- |
| [decodeByBrotli(byte[] input)](#decodeByBrotli-byte---) | Decompresses the given Brotli-compressed byte array. |
| [encodeByBrotli(byte[] buff, int buffLength)](#encodeByBrotli-byte---int-) | Compresses the given byte array using the Brotli algorithm. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### CompressionUtils() {#CompressionUtils--}
```
public CompressionUtils()
```


### decodeByBrotli(byte[] input) {#decodeByBrotli-byte---}
```
public static byte[] decodeByBrotli(byte[] input)
```


Decompresses the given Brotli-compressed byte array.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| input | byte[] | The compressed data. |

**Returns:**
byte[] - The decompressed byte array.
### encodeByBrotli(byte[] buff, int buffLength) {#encodeByBrotli-byte---int-}
```
public static byte[] encodeByBrotli(byte[] buff, int buffLength)
```


Compresses the given byte array using the Brotli algorithm.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| buff | byte[] | The input buffer to compress. |
| buffLength | int | The length of the data to compress. |

**Returns:**
byte[] - The compressed byte array.
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

