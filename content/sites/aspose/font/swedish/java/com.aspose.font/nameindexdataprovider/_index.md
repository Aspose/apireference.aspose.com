---
title: "NameIndexDataProvider"
second_title: "Aspose.Font för Java API-referens"
description: "Tillhandahåller inställningar gemensamma för CFF-typsnitt."
type: docs
weight: 68
url: /sv/java/com.aspose.font/nameindexdataprovider/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.ICffIndexDataProvider](../../com.aspose.font/icffindexdataprovider)
```
public abstract class NameIndexDataProvider implements ICffIndexDataProvider
```

Tillhandahåller inställningar gemensamma för CFF-typsnitt.
## Konstruktörer

| Konstruktor | Beskrivning |
| --- | --- |
| [NameIndexDataProvider()](#NameIndexDataProvider--) |  |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [addName(String name)](#addName-java.lang.String-) | Lägger till ett typsnittsnamn i Name‑INDEX‑strukturen. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int index)](#get-int-) | Hämtar typsnittsnamn på angivet index. |
| [getClass()](#getClass--) |  |
| [getCount()](#getCount--) | Hämtar antalet objekt i CFF‑INDEX‑strukturen. |
| [getName(int index)](#getName-int-) | Hämtar namn på typsnitt på angivet index. |
| [getRawBytes()](#getRawBytes--) | Hämtar alla byte i CFF INDEX-strukturen. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeName(int index)](#removeName-int-) | Tar bort namnet på det angivna indexet. |
| [set(int index, String name)](#set-int-java.lang.String-) | Anger teckensnittets namn på det angivna indexet. |
| [setName(String name, int index)](#setName-java.lang.String-int-) | Ställer in teckensnittets namn på det angivna indexet. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### NameIndexDataProvider() {#NameIndexDataProvider--}
```
public NameIndexDataProvider()
```


### addName(String name) {#addName-java.lang.String-}
```
public abstract void addName(String name)
```


Lägger till ett teckensnittsnamn i Name INDEX-strukturen. Använd den här metoden med försiktighet eftersom varje teckensnittsnamn i CFF Name INDEX-strukturen måste ha en motsvarande DICT-struktur i Top DICT-indexet enligt CFF-specifikationen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| namn | java.lang.String |  |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### get(int index) {#get-int-}
```
public abstract String get(int index)
```


Hämtar typsnittsnamn på angivet index.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| index | int | Teckensnittindex. |

**Returns:**
java.lang.String - Teckensnittsnamn.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getCount() {#getCount--}
```
public abstract int getCount()
```


Hämtar antalet objekt i CFF‑INDEX‑strukturen.

**Returns:**
int
### getName(int index) {#getName-int-}
```
public abstract String getName(int index)
```


Hämtar namn på typsnitt på angivet index.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| index | int | Teckensnittindex. |

**Returns:**
java.lang.String - Teckensnittsnamnet.
### getRawBytes() {#getRawBytes--}
```
public abstract byte[] getRawBytes()
```


Hämtar alla byte i CFF INDEX-strukturen.

**Returns:**
byte[] - Byte i CFF INDEX-strukturen
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### removeName(int index) {#removeName-int-}
```
public abstract void removeName(int index)
```


Tar bort namnet på det angivna indexet. Använd den här metoden med försiktighet eftersom varje teckensnittsnamn i CFF Name INDEX-strukturen måste ha en motsvarande DICT-struktur i Top DICT-indexet enligt CFF-specifikationen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| index | int | Teckensnittindex. |

### set(int index, String name) {#set-int-java.lang.String-}
```
public abstract void set(int index, String name)
```


Anger teckensnittets namn på det angivna indexet.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| index | int | Teckensnittindex. |
| namn | java.lang.String | Teckensnittsnamn. |

### setName(String name, int index) {#setName-java.lang.String-int-}
```
public abstract void setName(String name, int index)
```


Ställer in teckensnittets namn på det angivna indexet.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| namn | java.lang.String | Teckensnittsnamn. |
| index | int | Teckensnittindex. |

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
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

