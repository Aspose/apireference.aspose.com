---
title: "InterpolationMode"
second_title: "Java için Aspose.Page API Referansı"
description: "Görüntüler ölçeklendirildiğinde veya döndürüldüğünde kullanılan algoritmayı belirtir."
type: docs
weight: 20
url: /tr/java/com.aspose.xps.rendering/interpolationmode/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum InterpolationMode extends Enum<InterpolationMode>
```

Görüntüler ölçeklendirildiğinde veya döndürüldüğünde kullanılan algoritmayı belirtir.
## Alanlar

| Alan | Açıklama |
| --- | --- |
| [Bicubic](#Bicubic) | Bikübik interpolasyonu belirtir. |
| [Bilinear](#Bilinear) | Bilineer interpolasyonu belirtir. |
| [Default](#Default) | Varsayılan modu belirtir. |
| [High](#High) | Yüksek kaliteli interpolasyonu belirtir. |
| [HighQualityBicubic](#HighQualityBicubic) | Yüksek kaliteli, bikübik interpolasyonu belirtir. |
| [HighQualityBilinear](#HighQualityBilinear) | Yüksek kaliteli, bilinear interpolasyonu belirtir. |
| [Low](#Low) | Düşük kaliteli interpolasyonu belirtir. |
| [NearestNeighbor](#NearestNeighbor) | En yakın komşu interpolasyonunu belirtir. |
## Yöntemler

| Yöntem | Açıklama |
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
### Bicubic {#Bicubic}
```
public static final InterpolationMode Bicubic
```


Bikübik interpolasyonu belirtir. Ön filtreleme yapılmaz. Bu mod, bir görüntüyü orijinal boyutunun %25'inden daha düşük bir boyuta küçültmek için uygun değildir.

### Bilinear {#Bilinear}
```
public static final InterpolationMode Bilinear
```


Bilineer interpolasyonu belirtir. Ön filtreleme yapılmaz. Bu mod, bir görüntüyü orijinal boyutunun %50'sinden daha düşük bir boyuta küçültmek için uygun değildir.

### Default {#Default}
```
public static final InterpolationMode Default
```


Varsayılan modu belirtir.

### High {#High}
```
public static final InterpolationMode High
```


Yüksek kaliteli interpolasyonu belirtir.

### HighQualityBicubic {#HighQualityBicubic}
```
public static final InterpolationMode HighQualityBicubic
```


Yüksek kaliteli, bikübik interpolasyonu belirtir. Yüksek kaliteli küçültme sağlamak için ön filtreleme yapılır. Bu mod, en yüksek kaliteye sahip dönüştürülmüş görüntüleri üretir.

### HighQualityBilinear {#HighQualityBilinear}
```
public static final InterpolationMode HighQualityBilinear
```


Yüksek kaliteli, ikili interpolasyonu belirtir. Yüksek kaliteli küçültmeyi sağlamak için ön filtreleme uygulanır.

### Low {#Low}
```
public static final InterpolationMode Low
```


Düşük kaliteli interpolasyonu belirtir.

### NearestNeighbor {#NearestNeighbor}
```
public static final InterpolationMode NearestNeighbor
```


En yakın komşu interpolasyonunu belirtir.

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| Parametre | Tür | Açıklama |
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
| Parametre | Tür | Açıklama |
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
| Parametre | Tür | Açıklama |
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
public static InterpolationMode valueOf(String name)
```




**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| ad | java.lang.String |  |

**Returns:**
[InterpolationMode](../../com.aspose.xps.rendering/interpolationmode)
### values() {#values--}
```
public static InterpolationMode[] values()
```




**Returns:**
com.aspose.xps.rendering.InterpolationMode[]
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

