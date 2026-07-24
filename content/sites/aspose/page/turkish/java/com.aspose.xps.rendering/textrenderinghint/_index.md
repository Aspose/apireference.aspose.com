---
title: "TextRenderingHint"
second_title: "Java için Aspose.Page API Referansı"
description: "Metin renderleme kalitesini belirtir."
type: docs
weight: 25
url: /tr/java/com.aspose.xps.rendering/textrenderinghint/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum TextRenderingHint extends Enum<TextRenderingHint>
```

Metin renderleme kalitesini belirtir.
## Alanlar

| Alan | Açıklama |
| --- | --- |
| [AntiAlias](#AntiAlias) | Her karakter, ipucu kullanılmadan antialias'li glif bitmap'i kullanılarak çizilir. |
| [AntiAliasGridFit](#AntiAliasGridFit) | Her karakter, ipucu kullanılarak antialias'li glif bitmap'i kullanılarak çizilir. |
| [ClearTypeGridFit](#ClearTypeGridFit) | Her karakter, ipucu kullanılarak glif ClearType bitmap'i kullanılarak çizilir. |
| [SingleBitPerPixel](#SingleBitPerPixel) | Her karakter, glif bitmap'i kullanılarak çizilir. |
| [SingleBitPerPixelGridFit](#SingleBitPerPixelGridFit) | Her karakter, glif bitmap'i kullanılarak çizilir. |
| [SystemDefault](#SystemDefault) | Her karakter, sistemin varsayılan render ipucu ile glif bitmap'i kullanılarak çizilir. |
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
### AntiAlias {#AntiAlias}
```
public static final TextRenderingHint AntiAlias
```


Her karakter, ipucu kullanılmadan antialias'li glif bitmap'i kullanılarak çizilir. Antialiasing sayesinde daha iyi kalite. İpucu kapalı olduğundan sap genişliği farkları fark edilebilir.

### AntiAliasGridFit {#AntiAliasGridFit}
```
public static final TextRenderingHint AntiAliasGridFit
```


Her karakter, ipucu kullanılarak antialias'li glif bitmap'i kullanılarak çizilir. Antialiasing sayesinde çok daha iyi kalite, ancak daha yüksek bir performans maliyeti vardır.

### ClearTypeGridFit {#ClearTypeGridFit}
```
public static final TextRenderingHint ClearTypeGridFit
```


Her karakter, glif ClearType bitmap'i ve hinting kullanılarak çizilir. En yüksek kalite ayarı. ClearType yazı tipi özelliklerinden yararlanmak için kullanılır.

### SingleBitPerPixel {#SingleBitPerPixel}
```
public static final TextRenderingHint SingleBitPerPixel
```


Her karakter, glif bitmap'i kullanılarak çizilir. Hinting kullanılmaz.

### SingleBitPerPixelGridFit {#SingleBitPerPixelGridFit}
```
public static final TextRenderingHint SingleBitPerPixelGridFit
```


Her karakter, glif bitmap'i kullanılarak çizilir. Hinting, karakterin gövde ve eğrilik üzerindeki görünümünü iyileştirmek için kullanılır.

### SystemDefault {#SystemDefault}
```
public static final TextRenderingHint SystemDefault
```


Her karakter, glif bitmap'i ve sistemin varsayılan render ipucu ile çizilir. Metin, kullanıcının sistem için seçtiği herhangi bir yazı tipi yumuşatma ayarıyla çizilecektir.

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
public static TextRenderingHint valueOf(String name)
```




**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| ad | java.lang.String |  |

**Returns:**
[TextRenderingHint](../../com.aspose.xps.rendering/textrenderinghint)
### values() {#values--}
```
public static TextRenderingHint[] values()
```




**Returns:**
com.aspose.xps.rendering.TextRenderingHint[]
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

