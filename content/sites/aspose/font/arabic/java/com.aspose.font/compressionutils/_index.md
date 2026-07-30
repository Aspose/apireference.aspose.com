---
title: "CompressionUtils"
second_title: "مرجع API لـ Aspose.Font لـ Java"
description: "يوفر طرق مساعدة للضغط وفك الضغط."
type: docs
weight: 28
url: /ar/java/com.aspose.font/compressionutils/
---
**Inheritance:**
java.lang.Object
```
public class CompressionUtils
```

يوفر طرق مساعدة للضغط وفك الضغط.
## المنشئات

| منشئ | الوصف |
| --- | --- |
| [CompressionUtils()](#CompressionUtils--) |  |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [decodeByBrotli(byte[] input)](#decodeByBrotli-byte---) | يفك ضغط مصفوفة البايت المضغوطة بـ Brotli. |
| [encodeByBrotli(byte[] buff, int buffLength)](#encodeByBrotli-byte---int-) | يضغط مصفوفة البايت المعطاة باستخدام خوارزمية Brotli. |
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


يفك ضغط مصفوفة البايت المضغوطة بـ Brotli.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| الإدخال | byte[] | البيانات المضغوطة. |

**Returns:**
byte[] - مصفوفة البايت غير المضغوطة.
### encodeByBrotli(byte[] buff, int buffLength) {#encodeByBrotli-byte---int-}
```
public static byte[] encodeByBrotli(byte[] buff, int buffLength)
```


يضغط مصفوفة البايت المعطاة باستخدام خوارزمية Brotli.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| buff | byte[] | مخزن الإدخال للضغط. |
| buffLength | int | طول البيانات المراد ضغطها. |

**Returns:**
byte[] - مصفوفة البايت المضغوطة.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| معامل | نوع | الوصف |
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
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

