---
title: "StringIndexDataProvider"
second_title: "Aspose.Font für Java API-Referenz"
description: "Deklariert Funktionalität zum Zugriff auf die CFF String INDEX Struktur."
type: docs
weight: 75
url: /de/java/com.aspose.font/stringindexdataprovider/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.ICffIndexDataProvider](../../com.aspose.font/icffindexdataprovider)
```
public abstract class StringIndexDataProvider implements ICffIndexDataProvider
```

Deklariert Funktionalität zum Zugriff auf die CFF String INDEX Struktur.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [StringIndexDataProvider()](#StringIndexDataProvider--) |  |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [addString(String value)](#addString-java.lang.String-) | Fügt Zeichenfolge in die CFF String INDEX-Struktur ein. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int index)](#get-int-) | Liest/setzt Zeichenfolge am angegebenen Index. |
| [getClass()](#getClass--) |  |
| [getCount()](#getCount--) | Die Anzahl der Objekte in der CFF INDEX-Struktur. |
| [getRawBytes()](#getRawBytes--) | Liest alle Bytes der CFF INDEX-Struktur. |
| [getString(int index)](#getString-int-) | Liest Zeichenfolge am angegebenen Index aus der CFF String INDEX-Struktur. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeString(int index)](#removeString-int-) | Entfernt Zeichenfolge aus der CFF String Index-Struktur am angegebenen Index. |
| [set(int index, String value)](#set-int-java.lang.String-) |  |
| [setString(String value, int index)](#setString-java.lang.String-int-) | Setzt Zeichenfolge in der CFF String Index-Struktur am angegebenen Index. |
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


Fügt Zeichenfolge in die CFF String INDEX-Struktur ein.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | String-Wert |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### get(int index) {#get-int-}
```
public abstract String get(int index)
```


Liest/setzt Zeichenfolge am angegebenen Index.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int | Index der Zeichenfolge, Index bedeutet eine Ordnungszahl in der CFF INDEX-Struktur, nicht SID. |

**Returns:**
java.lang.String - String
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


Die Anzahl der Objekte in der CFF INDEX-Struktur.

**Returns:**
int
### getRawBytes() {#getRawBytes--}
```
public abstract byte[] getRawBytes()
```


Liest alle Bytes der CFF INDEX-Struktur.

**Returns:**
byte[] - Bytes der CFF INDEX-Struktur
### getString(int index) {#getString-int-}
```
public abstract String getString(int index)
```


Liest Zeichenfolge am angegebenen Index aus der CFF String INDEX-Struktur.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int | Index der Zeichenfolge, Index bedeutet Ordnungszahl in der CFF INDEX-Struktur, nicht SID. |

**Returns:**
java.lang.String - String
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


Entfernt Zeichenfolge aus der CFF String Index-Struktur am angegebenen Index.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int | Index der Zeichenfolge, Index bedeutet eine Ordnungszahl in der CFF INDEX-Struktur, nicht SID. |

### set(int index, String value) {#set-int-java.lang.String-}
```
public abstract void set(int index, String value)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int |  |
| Wert | java.lang.String |  |

### setString(String value, int index) {#setString-java.lang.String-int-}
```
public abstract void setString(String value, int index)
```


Setzt Zeichenfolge in der CFF String Index-Struktur am angegebenen Index.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | String-Wert |
| Index | int | Index der Zeichenfolge, Index bedeutet Ordnungszahl in der CFF INDEX-Struktur, nicht SID. |

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

