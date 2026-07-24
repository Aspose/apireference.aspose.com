---
title: "PdfImageCompression"
second_title: "Aspose.Page for Java API 参考"
description: "指定在 PDF 文件中应用于图像的压缩类型。"
type: docs
weight: 22
url: /zh/java/com.aspose.xps.rendering/pdfimagecompression/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum PdfImageCompression extends Enum<PdfImageCompression>
```

指定在 PDF 文件中应用于图像的压缩类型。
## 字段

| 字段 | 描述 |
| --- | --- |
| [Auto](#Auto) | 自动为每个图像选择最合适的压缩方式。 |
| [Flate](#Flate) | Flate 压缩。 |
| [Jpeg](#Jpeg) | JPEG 压缩。 |
| [LzwBaselinePredictor](#LzwBaselinePredictor) | 预测器选择被限制为 PNG Paeth 预测器，以加快处理速度。 |
| [LzwOptimizedPredictor](#LzwOptimizedPredictor) | 预测器选择更为复杂，应该能够得到更小的图像尺寸，但会耗费更多时间。 |
| [None](#None) | 保存原始图像字节，会导致 PDF 文件体积更大。 |
| [Rle](#Rle) | 行程长度压缩。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [<T>valueOf(Class<T> arg0, String arg1)](#-T-valueOf-java.lang.Class-T--java.lang.String-) |  |
| [compareTo(E arg0)](#compareTo-E-) |  |
| [describeConstable()](#describeConstable--) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDeclaringClass()](#getDeclaringClass--) |  |
| [hashCode()](#hashCode--) |  |
| [name()](#name--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [ordinal()](#ordinal--) |  |
| [toString()](#toString--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
| [values()](#values--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Auto {#Auto}
```
public static final PdfImageCompression Auto
```


自动为每个图像选择最合适的压缩方式。

### Flate {#Flate}
```
public static final PdfImageCompression Flate
```


Flate 压缩。

### Jpeg {#Jpeg}
```
public static final PdfImageCompression Jpeg
```


JPEG 压缩。不支持透明度。

### LzwBaselinePredictor {#LzwBaselinePredictor}
```
public static final PdfImageCompression LzwBaselinePredictor
```


预测器选择被限制为 PNG Paeth 预测器，以加快处理速度。实际表现出乎意料地好。优于 LzwOptimizedPredictor 。

### LzwOptimizedPredictor {#LzwOptimizedPredictor}
```
public static final PdfImageCompression LzwOptimizedPredictor
```


预测器选择更为复杂，应该能够得到更小的图像尺寸，但会耗费更多时间。

### None {#None}
```
public static final PdfImageCompression None
```


保存原始图像字节，会导致 PDF 文件体积更大。

### Rle {#Rle}
```
public static final PdfImageCompression Rle
```


行程长度压缩。

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | java.lang.Class<T> |  |
| arg1 | java.lang.String |  |

**Returns:**
T
### compareTo(E arg0) {#compareTo-E-}
```
public final int compareTo(E arg0)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | E |  |

**Returns:**
int
### describeConstable() {#describeConstable--}
```
public final Optional<Enum.EnumDesc<E>> describeConstable()
```




**Returns:**
java.util.Optional<java.lang.Enum.EnumDesc<E>>
### equals(Object arg0) {#equals-java.lang.Object-}
```
public final boolean equals(Object arg0)
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
### getDeclaringClass() {#getDeclaringClass--}
```
public final Class<E> getDeclaringClass()
```




**Returns:**
java.lang.Class<E>
### hashCode() {#hashCode--}
```
public final int hashCode()
```




**Returns:**
int
### name() {#name--}
```
public final String name()
```




**Returns:**
java.lang.String
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### ordinal() {#ordinal--}
```
public final int ordinal()
```




**Returns:**
int
### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static PdfImageCompression valueOf(String name)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 名称 | java.lang.String |  |

**Returns:**
[PdfImageCompression](../../com.aspose.xps.rendering/pdfimagecompression)
### values() {#values--}
```
public static PdfImageCompression[] values()
```




**Returns:**
com.aspose.xps.rendering.PdfImageCompression[]
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

