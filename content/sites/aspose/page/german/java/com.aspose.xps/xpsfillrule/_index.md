---
title: "XpsFillRule"
second_title: "Aspose.Page for Java API-Referenz"
description: "Gültige Werte der FillRule‑Eigenschaft von PathGeometry‑Elementen."
type: docs
weight: 59
url: /de/java/com.aspose.xps/xpsfillrule/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum XpsFillRule extends Enum<XpsFillRule>
```

Gültige Werte der FillRule-Eigenschaft des PathGeometry-Elements.
## Felder

| Feld | Beschreibung |
| --- | --- |
| [EvenOdd](#EvenOdd) | Diese Regel bestimmt die \\u201cinsideness\\u201d eines Punktes auf der Leinwand, indem ein Strahl vom Punkt ins Unendliche in beliebiger Richtung gezeichnet wird und die Anzahl der Segmente der angegebenen Form gezählt wird, die der Strahl schneidet. |
| [NonZero](#NonZero) | Diese Regel bestimmt die \\u201cinsideness\\u201d eines Punktes auf der Leinwand, indem ein Strahl vom Punkt ins Unendliche in beliebiger Richtung gezeichnet wird und anschließend die Stellen untersucht werden, an denen ein Segment der Form den Strahl schneidet. |
## Methoden

| Methode | Beschreibung |
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


Diese Regel bestimmt die \\u201cinsideness\\u201d eines Punktes auf der Leinwand, indem ein Strahl vom Punkt ins Unendliche in beliebiger Richtung gezeichnet wird und die Anzahl der Segmente der angegebenen Form gezählt wird, die der Strahl schneidet. Ist diese Zahl ungerade, liegt der Punkt innerhalb; ist sie gerade, liegt der Punkt außerhalb.

### NonZero {#NonZero}
```
public static final XpsFillRule NonZero
```


Diese Regel bestimmt die \\u201cinsideness\\u201d eines Punktes auf der Leinwand, indem ein Strahl vom Punkt ins Unendliche in beliebiger Richtung gezeichnet wird und anschließend die Stellen untersucht werden, an denen ein Segment der Form den Strahl schneidet. Beginnend mit einem Zähler von null, wird jedes Mal eins addiert, wenn ein Segment den Strahl von links nach rechts schneidet, und eins subtrahiert, wenn ein Pfadsegment den Strahl von rechts nach links schneidet. Nach dem Zählen der Schnitte, ist das Ergebnis null, dann liegt der Punkt außerhalb des Pfads; andernfalls liegt er innerhalb.

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
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
| Parameter | Typ | Beschreibung |
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
| Parameter | Typ | Beschreibung |
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
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String |  |

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
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

