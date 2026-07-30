---
title: "Version16Dot16"
second_title: "Aspose.Font 适用于 Java API 参考"
description: "表示 Version16Dot16 数据类型"
type: docs
weight: 118
url: /zh/java/com.aspose.font/version16dot16/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.lang.Cloneable
```
public class Version16Dot16 implements Cloneable
```

表示 Version16Dot16 数据类型
## 构造函数

| 构造函数 | 描述 |
| --- | --- |
| [Version16Dot16()](#Version16Dot16--) | 构造函数 |
| [Version16Dot16(int majorNumber, int minorNumber)](#Version16Dot16-int-int-) | 构造函数 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [clone()](#clone--) | 创建 Version16Dot16 对象的副本。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getMajorNumber()](#getMajorNumber--) | 获取主版本号。 |
| [getMinorNumber()](#getMinorNumber--) | 获取次版本号。 |
| [getRawBytes()](#getRawBytes--) | 获取 Version16Dot16 版本号的所有原始位，以大小为 4 字节的字节数组形式。 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setMajorNumber(int value)](#setMajorNumber-int-) | 设置主版本号。 |
| [setMinorNumber(int value)](#setMinorNumber-int-) | 设置次版本号。 |
| [toString()](#toString--) | 返回格式化的版本值字符串，例如 \"0.5\"、\"1.1\"、\"3.0\" 等。 |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Version16Dot16() {#Version16Dot16--}
```
public Version16Dot16()
```


构造函数

### Version16Dot16(int majorNumber, int minorNumber) {#Version16Dot16-int-int-}
```
public Version16Dot16(int majorNumber, int minorNumber)
```


构造函数

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| majorNumber | int | 主版本号 |
| minorNumber | int | 次版本号 |

### clone() {#clone--}
```
public Object clone()
```


创建 Version16Dot16 对象的副本。

**Returns:**
java.lang.Object - 类型为 Version16Dot16 的对象
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
### getMajorNumber() {#getMajorNumber--}
```
public int getMajorNumber()
```


获取主版本号。该值仅在十六进制表示中有意义，例如实际字体文件中 'maxp' 的版本 0.5 为 4 字节：\\{0, 0, 80, 0\\}，其十六进制表示为 0x00005000。读取该版本自字体文件后，对象 Version16Dot16 的主次版本号分别为 0 和 20480。这些值的十六进制形式为 0x0000 和 0x5000。

**Returns:**
int - 主版本号。
### getMinorNumber() {#getMinorNumber--}
```
public int getMinorNumber()
```


获取次版本号。该值仅在十六进制表示中有意义，例如实际字体文件中 'maxp' 的版本 0.5 为 4 字节：\\{0, 0, 80, 0\\}，其十六进制表示为 0x00005000。读取该版本自字体文件后，对象 Version16Dot16 的主次版本号分别为 0 和 20480。这些值的十六进制形式为 0x0000 和 0x5000。

**Returns:**
int - 次版本号。
### getRawBytes() {#getRawBytes--}
```
public byte[] getRawBytes()
```


获取 Version16Dot16 版本号的所有原始位，以大小为 4 字节的字节数组形式。

**Returns:**
byte[] - Version16Dot16 版本号的所有原始位，以大小为 4 字节的字节数组形式。
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




### setMajorNumber(int value) {#setMajorNumber-int-}
```
public void setMajorNumber(int value)
```


设置主版本号。该值仅在十六进制表示中有意义，例如实际字体文件中 'maxp' 的版本 0.5 为 4 字节：\\{0, 0, 80, 0\\}，其十六进制表示为 0x00005000。读取该版本自字体文件后，对象 Version16Dot16 的主次版本号分别为 0 和 20480。这些值的十六进制形式为 0x0000 和 0x5000。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | int | 主版本号。 |

### setMinorNumber(int value) {#setMinorNumber-int-}
```
public void setMinorNumber(int value)
```


设置次版本号。该值仅在十六进制表示中有意义，例如实际字体文件中 'maxp' 的版本 0.5 为 4 字节：\\{0, 0, 80, 0\\}，其十六进制表示为 0x00005000。读取该版本自字体文件后，对象 Version16Dot16 的主次版本号分别为 0 和 20480。这些值的十六进制形式为 0x0000 和 0x5000。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | int | 次版本号。 |

### toString() {#toString--}
```
public String toString()
```


返回格式化的版本值字符串，例如 \"0.5\"、\"1.1\"、\"3.0\" 等。

**Returns:**
java.lang.String - String 类型的对象
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

