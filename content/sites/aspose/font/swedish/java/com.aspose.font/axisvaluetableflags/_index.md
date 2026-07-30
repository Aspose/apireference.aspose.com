---
title: "TtfStatTable.AxisValueTableFlags"
second_title: "Aspose.Font för Java API-referens"
description: "Anger flaggor för axelvärdestabell"
type: docs
weight: 10
url: /sv/java/com.aspose.font/ttfstattable.axisvaluetableflags/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum TtfStatTable.AxisValueTableFlags extends Enum<TtfStatTable.AxisValueTableFlags>
```

Anger flaggor för axelvärdestabell
## Fält

| Fält | Beskrivning |
| --- | --- |
| [ElidableAxisValueName](#ElidableAxisValueName) | Om den är inställd indikerar den att axelvärdet representerar det "normala" värdet för axeln och kan utelämnas när namnsträngar sammanställs. |
| [OlderSiblingFontAttribute](#OlderSiblingFontAttribute) | Om den är inställd tillhandahåller denna axelvärdestabell axelvärdesinformation som är tillämplig på andra teckensnitt inom samma teckensnittsfamilj. |
| [Reserved](#Reserved) | Reserverad för framtida bruk |
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
### ElidableAxisValueName {#ElidableAxisValueName}
```
public static final TtfStatTable.AxisValueTableFlags ElidableAxisValueName
```


Om den är inställd indikerar den att axelvärdet representerar det "normala" värdet för axeln och kan utelämnas när namnsträngar sammanställs.

### OlderSiblingFontAttribute {#OlderSiblingFontAttribute}
```
public static final TtfStatTable.AxisValueTableFlags OlderSiblingFontAttribute
```


Om den är inställd tillhandahåller denna axelvärdestabell axelvärdesinformation som är tillämplig på andra teckensnitt inom samma teckensnittsfamilj. Detta används om de andra teckensnitten släpptes tidigare och inte innehöll information om värden för vissa axlar. Om nyare versioner av de andra teckensnitten själva inkluderar informationen och finns tillgängliga, ignoreras denna tabell.

### Reserved {#Reserved}
```
public static final TtfStatTable.AxisValueTableFlags Reserved
```


Reserverad för framtida bruk

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
public static TtfStatTable.AxisValueTableFlags valueOf(String name)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| namn | java.lang.String |  |

**Returns:**
[AxisValueTableFlags](../../com.aspose.font/axisvaluetableflags)
### values() {#values--}
```
public static TtfStatTable.AxisValueTableFlags[] values()
```




**Returns:**
com.aspose.font.TtfStatTable.AxisValueTableFlags[]
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

