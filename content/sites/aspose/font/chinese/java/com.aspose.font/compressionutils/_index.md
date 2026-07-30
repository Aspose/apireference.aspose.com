---
title: "CompressionUtils"
second_title: "Aspose.Font 适用于 Java API 参考"
description: "提供压缩和解压缩的实用方法。"
type: docs
weight: 28
url: /zh/java/com.aspose.font/compressionutils/
---
**Inheritance:**
java.lang.Object
```
public class CompressionUtils
```

提供压缩和解压缩的实用方法。
## 构造函数

| 构造函数 | 描述 |
| --- | --- |
| [CompressionUtils()](#CompressionUtils--) |  |
## 方法

| 方法 | 描述 |
| --- | --- |
| [decodeByBrotli(byte[] input)](#decodeByBrotli-byte---) | 解压给定的 Brotli 压缩字节数组。 |
| [encodeByBrotli(byte[] buff, int buffLength)](#encodeByBrotli-byte---int-) | 使用 Brotli 算法压缩给定的字节数组。 |
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


解压给定的 Brotli 压缩字节数组。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 输入 | byte[] | 压缩数据。 |

**Returns:**
byte[] - 解压后的字节数组。
### encodeByBrotli(byte[] buff, int buffLength) {#encodeByBrotli-byte---int-}
```
public static byte[] encodeByBrotli(byte[] buff, int buffLength)
```


使用 Brotli 算法压缩给定的字节数组。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buff | byte[] | 要压缩的输入缓冲区。 |
| buffLength | int | 要压缩的数据长度。 |

**Returns:**
byte[] - 压缩后的字节数组。
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| 参数 | 类型 | 描述 |
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
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

