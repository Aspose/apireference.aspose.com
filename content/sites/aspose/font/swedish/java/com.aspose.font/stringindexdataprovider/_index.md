---
title: "StringIndexDataProvider"
second_title: "Aspose.Font för Java API-referens"
description: "Deklarerar funktionalitet för att komma åt CFF String INDEX-struktur."
type: docs
weight: 75
url: /sv/java/com.aspose.font/stringindexdataprovider/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.ICffIndexDataProvider](../../com.aspose.font/icffindexdataprovider)
```
public abstract class StringIndexDataProvider implements ICffIndexDataProvider
```

Deklarerar funktionalitet för att komma åt CFF String INDEX-struktur.
## Konstruktörer

| Konstruktor | Beskrivning |
| --- | --- |
| [StringIndexDataProvider()](#StringIndexDataProvider--) |  |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [addString(String value)](#addString-java.lang.String-) | Lägger till sträng i CFF String INDEX-struktur. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int index)](#get-int-) | Hämtar/sätter sträng på det angivna indexet. |
| [getClass()](#getClass--) |  |
| [getCount()](#getCount--) | Antalet objekt i CFF INDEX-strukturen. |
| [getRawBytes()](#getRawBytes--) | Hämtar alla byte i CFF INDEX-strukturen. |
| [getString(int index)](#getString-int-) | Hämtar sträng på det angivna indexet från CFF String INDEX-struktur. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeString(int index)](#removeString-int-) | Tar bort sträng från CFF String Index-struktur på det angivna indexet. |
| [set(int index, String value)](#set-int-java.lang.String-) |  |
| [setString(String value, int index)](#setString-java.lang.String-int-) | Sätter sträng i CFF String Index-struktur på det angivna indexet. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### StringIndexDataProvider() {#StringIndexDataProvider--}
```
public StringIndexDataProvider()
```


### addString(String value) {#addString-java.lang.String-}
```
public abstract void addString(String value)
```


Lägger till sträng i CFF String INDEX-struktur.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| värde | java.lang.String | Strängvärde |

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


Hämtar/sätter sträng på det angivna indexet.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| index | int | Index för sträng, index betyder ett ordinalt nummer i CFF INDEX-struktur, inte SID |

**Returns:**
java.lang.String - Sträng
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


Antalet objekt i CFF INDEX-strukturen.

**Returns:**
int
### getRawBytes() {#getRawBytes--}
```
public abstract byte[] getRawBytes()
```


Hämtar alla byte i CFF INDEX-strukturen.

**Returns:**
byte[] - Byte i CFF INDEX-strukturen
### getString(int index) {#getString-int-}
```
public abstract String getString(int index)
```


Hämtar sträng på det angivna indexet från CFF String INDEX-struktur.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| index | int | Index för sträng, index betyder ett ordinalt nummer i CFF INDEX-struktur, inte SID |

**Returns:**
java.lang.String - Sträng
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




### removeString(int index) {#removeString-int-}
```
public abstract void removeString(int index)
```


Tar bort sträng från CFF String Index-struktur på det angivna indexet.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| index | int | Index för sträng, index betyder ett ordinalt nummer i CFF INDEX-struktur, inte SID |

### set(int index, String value) {#set-int-java.lang.String-}
```
public abstract void set(int index, String value)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| index | int |  |
| värde | java.lang.String |  |

### setString(String value, int index) {#setString-java.lang.String-int-}
```
public abstract void setString(String value, int index)
```


Sätter sträng i CFF String Index-struktur på det angivna indexet.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| värde | java.lang.String | Strängvärde |
| index | int | Index för sträng, index betyder ett ordinalt nummer i CFF INDEX-struktur, inte SID |

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

