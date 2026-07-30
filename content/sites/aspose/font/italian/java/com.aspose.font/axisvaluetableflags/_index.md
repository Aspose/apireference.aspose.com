---
title: "TtfStatTable.AxisValueTableFlags"
second_title: "Riferimento API Aspose.Font per Java"
description: "Specifica i flag della tabella dei valori dell'asse."
type: docs
weight: 10
url: /it/java/com.aspose.font/ttfstattable.axisvaluetableflags/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum TtfStatTable.AxisValueTableFlags extends Enum<TtfStatTable.AxisValueTableFlags>
```

Specifica i flag della tabella dei valori dell'asse.
## Campi

| Campo | Descrizione |
| --- | --- |
| [ElidableAxisValueName](#ElidableAxisValueName) | Se impostato, indica che il valore dell'asse rappresenta il valore "normale" per l'asse e può essere omesso durante la composizione delle stringhe di nome. |
| [OlderSiblingFontAttribute](#OlderSiblingFontAttribute) | Se impostato, questa tabella dei valori dell'asse fornisce informazioni sui valori dell'asse applicabili ad altri caratteri all'interno della stessa famiglia di caratteri. |
| [Reserved](#Reserved) | Riservato per uso futuro |
## Metodi

| Metodo | Descrizione |
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


Se impostato, indica che il valore dell'asse rappresenta il valore "normale" per l'asse e può essere omesso durante la composizione delle stringhe di nome.

### OlderSiblingFontAttribute {#OlderSiblingFontAttribute}
```
public static final TtfStatTable.AxisValueTableFlags OlderSiblingFontAttribute
```


Se impostato, questa tabella dei valori dell'asse fornisce informazioni sui valori dell'asse applicabili ad altri caratteri all'interno della stessa famiglia di caratteri. Viene utilizzata se gli altri caratteri sono stati rilasciati in precedenza e non includono informazioni sui valori di alcuni assi. Se versioni più recenti degli altri caratteri includono le informazioni stesse e sono presenti, allora questa tabella viene ignorata.

### Reserved {#Reserved}
```
public static final TtfStatTable.AxisValueTableFlags Reserved
```


Riservato per uso futuro

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
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
| Parametro | Tipo | Descrizione |
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
| Parametro | Tipo | Descrizione |
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
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nome | java.lang.String |  |

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
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

