---
title: "XpsFillRule"
second_title: "Aspose.Page voor Java API-referentie"
description: "Geldige waarden van PathGeometry-elementen FillRule-eigenschap."
type: docs
weight: 59
url: /nl/java/com.aspose.xps/xpsfillrule/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum XpsFillRule extends Enum<XpsFillRule>
```

Geldige waarden voor de FillRule-eigenschap van het PathGeometry-element.
## Velden

| Veld | Beschrijving |
| --- | --- |
| [EvenOdd](#EvenOdd) | Deze regel bepaalt de \\u201cinsideness\\u201d van een punt op het canvas door een straal van het punt naar oneindig te tekenen in een willekeurige richting en het aantal segmenten van de gegeven vorm te tellen dat de straal kruist. |
| [NonZero](#NonZero) | Deze regel bepaalt de \\u201cinsideness\\u201d van een punt op het canvas door een straal van het punt naar oneindig te tekenen in een willekeurige richting en vervolgens de plaatsen te onderzoeken waar een segment van de vorm de straal kruist. |
## Methoden

| Methode | Beschrijving |
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


Deze regel bepaalt de \\u201cinsideness\\u201d van een punt op het canvas door een straal van het punt naar oneindig te tekenen in een willekeurige richting en het aantal segmenten van de gegeven vorm te tellen dat de straal kruist. Als dit aantal oneven is, ligt het punt binnen; als het even is, ligt het punt buiten.

### NonZero {#NonZero}
```
public static final XpsFillRule NonZero
```


Deze regel bepaalt de \\u201cinsideness\\u201d van een punt op het canvas door een straal van het punt naar oneindig te tekenen in een willekeurige richting en vervolgens de plaatsen te onderzoeken waar een segment van de vorm de straal kruist. Beginnend met een teller van nul, voeg één toe elke keer dat een segment de straal van links naar rechts kruist en trek één af elke keer dat een padsegment de straal van rechts naar links kruist. Na het tellen van de kruisingen, als het resultaat nul is, ligt het punt buiten het pad; anders ligt het binnen.

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| Parameter | Type | Beschrijving |
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
| Parameter | Type | Beschrijving |
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
| Parameter | Type | Beschrijving |
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
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| naam | java.lang.String |  |

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
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

