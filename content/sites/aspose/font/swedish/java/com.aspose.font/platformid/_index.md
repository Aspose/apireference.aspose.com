---
title: "PlatformId"
second_title: "Aspose.Font för Java API-referens"
description: "Representerar PlatformId-enumeration."
type: docs
weight: 141
url: /sv/java/com.aspose.font/platformid/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum PlatformId extends Enum<PlatformId>
```

Representerar PlatformId-enumeration.
## Fält

| Fält | Beskrivning |
| --- | --- |
| [ISO](#ISO) | Value2 Apple-spec: (reserverad; får inte användas) MS-spec: ISO‑kodning. |
| [Macintosh](#Macintosh) | Value 1 Macintosh Script Manager‑kod. |
| [Microsoft](#Microsoft) | Value 3 Microsoft‑kodning. |
| [Unicode](#Unicode) | Value 0 Unicode |
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
### ISO {#ISO}
```
public static final PlatformId ISO
```


Value2 Apple-spec: (reserverad; får inte användas) MS-spec: ISO‑kodning. Observera att plattforms‑ID 2 (ISO) har avskrivits sedan OpenType‑specifikationen v1.3. Den var avsedd att representera ISO/IEC 10646, i motsats till Unicode; båda standarderna har identiska teckenkodstilldelningar.

### Macintosh {#Macintosh}
```
public static final PlatformId Macintosh
```


Value 1 Macintosh Script Manager‑kod.

### Microsoft {#Microsoft}
```
public static final PlatformId Microsoft
```


Value 3 Microsoft‑kodning.

### Unicode {#Unicode}
```
public static final PlatformId Unicode
```


Value 0 Unicode

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
public static PlatformId valueOf(String name)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| namn | java.lang.String |  |

**Returns:**
[PlatformId](../../com.aspose.font/platformid)
### values() {#values--}
```
public static PlatformId[] values()
```




**Returns:**
com.aspose.font.PlatformId[]
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

