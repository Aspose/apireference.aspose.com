---
title: "CffUpdateStringIndexStrategy"
second_title: "Aspose.Font för Java API-referens"
description: "Specificerar hur man lägger till strängar i CFF String INDEX-lagring."
type: docs
weight: 134
url: /sv/java/com.aspose.font/cffupdatestringindexstrategy/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum CffUpdateStringIndexStrategy extends Enum<CffUpdateStringIndexStrategy>
```

Anger hur man lägger till strängar i CFF String INDEX-lagring. När vi försöker lägga till en sträng i CFF String INDEX kan det uppstå en situation där denna sträng redan finns i String INDEX. Genom att använda alternativet SearchForDuplicates kan vi tvinga en sökning i String INDEX för att upptäcka om strängen redan finns eller inte. Detta tillvägagångssätt sparar utrymme i String INDEX-strukturen, men kräver mer tid för att lägga till strängen.
## Fält

| Fält | Beskrivning |
| --- | --- |
| [AddStringAsIs](#AddStringAsIs) | Anger att inga kontroller för dubbletter ska utföras när en sträng läggs till. |
| [SearchForDuplicates](#SearchForDuplicates) | Anger att sökningen efter den sträng som ska läggas till ska utföras i String INDEX-strukturen för att undvika att lägga till dubbletter. |
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
### AddStringAsIs {#AddStringAsIs}
```
public static final CffUpdateStringIndexStrategy AddStringAsIs
```


Anger att inga kontroller för dubbletter ska utföras när en sträng läggs till. Detta tillvägagångssätt är snabbare, men kan leda till ineffektiv minnesanvändning för String INDEX.

### SearchForDuplicates {#SearchForDuplicates}
```
public static final CffUpdateStringIndexStrategy SearchForDuplicates
```


Anger att sökningen efter den sträng som ska läggas till ska utföras i String INDEX-strukturen för att undvika att lägga till dubbletter.

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
public static CffUpdateStringIndexStrategy valueOf(String name)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| namn | java.lang.String |  |

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

