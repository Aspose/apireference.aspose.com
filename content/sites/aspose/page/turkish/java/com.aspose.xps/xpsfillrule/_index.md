---
title: "XpsFillRule"
second_title: "Java için Aspose.Page API Referansı"
description: "PathGeometry öğelerinin FillRule özelliğinin geçerli değerleri."
type: docs
weight: 59
url: /tr/java/com.aspose.xps/xpsfillrule/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum XpsFillRule extends Enum<XpsFillRule>
```

PathGeometry öğesinin FillRule özelliğinin geçerli değerleri.
## Alanlar

| Alan | Açıklama |
| --- | --- |
| [EvenOdd](#EvenOdd) | Bu kural, bir noktadan sonsuza doğru herhangi bir yönde bir ışın çizerek ve ışının verilen şeklin segmentlerini kestiği sayısını sayarak, tuval üzerindeki bir noktanın \u201cinsideness\u201d durumunu belirler. |
| [NonZero](#NonZero) | Bu kural, bir noktadan sonsuza doğru herhangi bir yönde bir ışın çizerek ve ardından şeklin bir segmentinin ışını kestiği yerleri inceleyerek, tuval üzerindeki bir noktanın \u201cinsideness\u201d durumunu belirler. |
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
### EvenOdd {#EvenOdd}
```
public static final XpsFillRule EvenOdd
```


Bu kural, bir noktadan sonsuza doğru herhangi bir yönde bir ışın çizerek ve ışının verilen şeklin segmentlerini kestiği sayısını sayarak, tuval üzerindeki bir noktanın \u201cinsideness\u201d durumunu belirler. Bu sayı tek ise nokta içtedir; çift ise dıştedir.

### NonZero {#NonZero}
```
public static final XpsFillRule NonZero
```


Bu kural, bir noktadan herhangi bir yönde sonsuza bir ışın çizerek ve şeklin bir segmentinin ışını kestiği yerleri inceleyerek, tuval üzerindeki bir noktanın \\u201cinsideness\\u201d (içeride olma) durumunu belirler. Sıfırdan başlayarak, bir segment ışını soldan sağa kestiğinde bir ekleyin ve bir yol segmenti ışını sağdan sola kestiğinde bir çıkarın. Kesişmeleri saydıktan sonra, sonuç sıfır ise nokta yolun dışında; aksi takdirde içerdedir.

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
public static XpsFillRule valueOf(String name)
```




**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| ad | java.lang.String |  |

**Returns:**
[XpsFillRule](../../com.aspose.xps/xpsfillrule)
### values() {#values--}
```
public static XpsFillRule[] values()
```




**Returns:**
com.aspose.xps.XpsFillRule[]
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

