---
title: "XpsFillRule"
second_title: "Aspose.Page för Java API-referens"
description: "Giltiga värden för PathGeometry-elementens FillRule-egenskap."
type: docs
weight: 59
url: /sv/java/com.aspose.xps/xpsfillrule/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum XpsFillRule extends Enum<XpsFillRule>
```

Giltiga värden för PathGeometry‑elementets egenskap FillRule.
## Fält

| Fält | Beskrivning |
| --- | --- |
| [EvenOdd](#EvenOdd) | Denna regel bestämmer \\u201cinsideness\\u201d för en punkt på duken genom att rita en stråle från punkten till oändligheten i någon riktning och räkna antalet segment från den givna formen som strålen korsar. |
| [NonZero](#NonZero) | Denna regel bestämmer \\u201cinsideness\\u201d för en punkt på duken genom att rita en stråle från punkten till oändligheten i någon riktning och sedan undersöka de ställen där ett segment av formen korsar strålen. |
## Metoder

| Metod | Beskrivning |
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


Denna regel bestämmer \\u201cinsideness\\u201d för en punkt på duken genom att rita en stråle från punkten till oändligheten i någon riktning och räkna antalet segment från den givna formen som strålen korsar. Om detta antal är udda är punkten innanför; om det är jämnt är punkten utanför.

### NonZero {#NonZero}
```
public static final XpsFillRule NonZero
```


Denna regel bestämmer \\u201cinsideness\\u201d för en punkt på duken genom att rita en stråle från punkten till oändligheten i någon riktning och sedan undersöka de ställen där ett segment av formen korsar strålen. Med en starträkning på noll, lägg till ett varje gång ett segment korsar strålen från vänster till höger och dra av ett varje gång ett bansegment korsar strålen från höger till vänster. Efter att ha räknat korsningarna, om resultatet är noll är punkten utanför banan; annars är den innanför.

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
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
| Parameter | Typ | Beskrivning |
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
| Parameter | Typ | Beskrivning |
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
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| name | java.lang.String |  |

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
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

