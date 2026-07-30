---
title: "CffUpdateStringIndexStrategy"
second_title: "Aspose.Font für Java API-Referenz"
description: "Gibt an, wie Zeichenketten zum CFF String INDEX Speicher hinzugefügt werden."
type: docs
weight: 134
url: /de/java/com.aspose.font/cffupdatestringindexstrategy/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum CffUpdateStringIndexStrategy extends Enum<CffUpdateStringIndexStrategy>
```

Legt fest, wie Zeichenketten zum CFF String INDEX Speicher hinzugefügt werden. Wenn wir versuchen, eine Zeichenkette in den CFF String INDEX einzufügen, kann es vorkommen, dass diese Zeichenkette bereits im String INDEX vorhanden ist. Durch die Option SearchForDuplicates können wir eine Suche im String INDEX erzwingen, um zu erkennen, ob diese Zeichenkette bereits vorhanden ist oder nicht. Dieser Ansatz spart Speicherplatz in der String INDEX-Struktur, erfordert jedoch mehr Zeit zum Hinzufügen der Zeichenkette.
## Felder

| Feld | Beschreibung |
| --- | --- |
| [AddStringAsIs](#AddStringAsIs) | Legt fest, dass beim Hinzufügen einer Zeichenkette keine Duplikatprüfungen durchgeführt werden sollen. |
| [SearchForDuplicates](#SearchForDuplicates) | Legt fest, dass die Suche nach der hinzuzufügenden Zeichenkette in der String INDEX-Struktur durchgeführt werden soll, um das Hinzufügen von Duplikaten zu vermeiden. |
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
### AddStringAsIs {#AddStringAsIs}
```
public static final CffUpdateStringIndexStrategy AddStringAsIs
```


Legt fest, dass beim Hinzufügen einer Zeichenkette keine Duplikatprüfungen durchgeführt werden sollen. Dieser Ansatz ist schneller, kann jedoch zu ineffizienter Speichernutzung für den String INDEX führen.

### SearchForDuplicates {#SearchForDuplicates}
```
public static final CffUpdateStringIndexStrategy SearchForDuplicates
```


Legt fest, dass die Suche nach der hinzuzufügenden Zeichenkette in der String INDEX-Struktur durchgeführt werden soll, um das Hinzufügen von Duplikaten zu vermeiden.

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
public static CffUpdateStringIndexStrategy valueOf(String name)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String |  |

**Returns:**
[CffUpdateStringIndexStrategy](../../com.aspose.font/cffupdatestringindexstrategy)
### values() {#values--}
```
public static CffUpdateStringIndexStrategy[] values()
```




**Returns:**
com.aspose.font.CffUpdateStringIndexStrategy[]
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

