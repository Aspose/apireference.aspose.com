---
title: "PdfImageCompression"
second_title: "Aspose.Page용 Java API 참조"
description: "PDF 파일의 이미지에 적용되는 압축 유형을 지정합니다."
type: docs
weight: 22
url: /ko/java/com.aspose.xps.rendering/pdfimagecompression/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum PdfImageCompression extends Enum<PdfImageCompression>
```

PDF 파일의 이미지에 적용되는 압축 유형을 지정합니다.
## 필드

| 필드 | 설명 |
| --- | --- |
| [Auto](#Auto) | 각 이미지에 가장 적합한 압축을 자동으로 선택합니다. |
| [Flate](#Flate) | Flate 압축. |
| [Jpeg](#Jpeg) | JPEG 압축. |
| [LzwBaselinePredictor](#LzwBaselinePredictor) | 예측기 선택이 PNG Paeth 예측기로 제한되어 프로세스 속도가 빨라집니다. |
| [LzwOptimizedPredictor](#LzwOptimizedPredictor) | 예측기 선택이 더 복잡해져 이미지 크기가 더 작아지지만 시간이 더 오래 걸립니다. |
| [None](#None) | 원시 이미지 바이트를 저장하여 PDF 파일 크기가 커집니다. |
| [Rle](#Rle) | Run Length 압축. |
## 메서드

| 메서드 | 설명 |
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


각 이미지에 가장 적합한 압축을 자동으로 선택합니다.

### Flate {#Flate}
```
public static final PdfImageCompression Flate
```


Flate 압축.

### Jpeg {#Jpeg}
```
public static final PdfImageCompression Jpeg
```


JPEG 압축. 투명도를 지원하지 않습니다.

### LzwBaselinePredictor {#LzwBaselinePredictor}
```
public static final PdfImageCompression LzwBaselinePredictor
```


예측기 선택이 PNG Paeth 예측기로 제한되어 프로세스 속도가 빨라집니다. 실제로는 놀라울 정도로 좋은 성능을 보이며 LzwOptimizedPredictor보다 우수합니다.

### LzwOptimizedPredictor {#LzwOptimizedPredictor}
```
public static final PdfImageCompression LzwOptimizedPredictor
```


예측기 선택이 더 복잡해져 이미지 크기가 더 작아지지만 시간이 더 오래 걸립니다.

### None {#None}
```
public static final PdfImageCompression None
```


원시 이미지 바이트를 저장하여 PDF 파일 크기가 커집니다.

### Rle {#Rle}
```
public static final PdfImageCompression Rle
```


Run Length 압축.

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| 매개변수 | 유형 | 설명 |
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
| 매개변수 | 유형 | 설명 |
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
| 매개변수 | 유형 | 설명 |
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
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 이름 | java.lang.String |  |

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
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

