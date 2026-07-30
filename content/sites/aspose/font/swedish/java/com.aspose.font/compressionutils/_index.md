---
title: "CompressionUtils"
second_title: "Aspose.Font för Java API-referens"
description: "Tillhandahåller hjälpfunktioner för komprimering och dekomprimering."
type: docs
weight: 28
url: /sv/java/com.aspose.font/compressionutils/
---
**Inheritance:**
java.lang.Object
```
public class CompressionUtils
```

Tillhandahåller hjälpfunktioner för komprimering och dekomprimering.
## Konstruktörer

| Konstruktor | Beskrivning |
| --- | --- |
| [CompressionUtils()](#CompressionUtils--) |  |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [decodeByBrotli(byte[] input)](#decodeByBrotli-byte---) | Dekomprimerar den givna Brotli-komprimerade byte array. |
| [encodeByBrotli(byte[] buff, int buffLength)](#encodeByBrotli-byte---int-) | Komprimerar den givna byte array med Brotli-algoritmen. |
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


Dekomprimerar den givna Brotli-komprimerade byte array.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| inmatning | byte[] | Den komprimerade datan. |

**Returns:**
byte[] - Den dekomprimerade byte arrayen.
### encodeByBrotli(byte[] buff, int buffLength) {#encodeByBrotli-byte---int-}
```
public static byte[] encodeByBrotli(byte[] buff, int buffLength)
```


Komprimerar den givna byte array med Brotli-algoritmen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| buff | byte[] | Inmatningsbufferten att komprimera. |
| buffLength | int | Längden på datan som ska komprimeras. |

**Returns:**
byte[] - Den komprimerade byte arrayen.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
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
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

