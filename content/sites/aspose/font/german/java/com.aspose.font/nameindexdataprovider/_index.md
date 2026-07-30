---
title: "NameIndexDataProvider"
second_title: "Aspose.Font für Java API-Referenz"
description: "Stellt Einstellungen bereit, die für CFF‑Schriftarten gemein sind."
type: docs
weight: 68
url: /de/java/com.aspose.font/nameindexdataprovider/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.ICffIndexDataProvider](../../com.aspose.font/icffindexdataprovider)
```
public abstract class NameIndexDataProvider implements ICffIndexDataProvider
```

Stellt Einstellungen bereit, die für CFF‑Schriftarten gemein sind.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [NameIndexDataProvider()](#NameIndexDataProvider--) |  |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [addName(String name)](#addName-java.lang.String-) | Fügt einen Schriftartnamen zur Name-INDEX-Struktur hinzu. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int index)](#get-int-) | Liefert den Schriftartnamen am angegebenen Index. |
| [getClass()](#getClass--) |  |
| [getCount()](#getCount--) | Liefert die Anzahl der Objekte in der CFF-INDEX-Struktur. |
| [getName(int index)](#getName-int-) | Liefert den Namen der Schriftart am angegebenen Index. |
| [getRawBytes()](#getRawBytes--) | Liest alle Bytes der CFF INDEX-Struktur. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeName(int index)](#removeName-int-) | Entfernt den Namen am angegebenen Index. |
| [set(int index, String name)](#set-int-java.lang.String-) | Gibt den Schriftartnamen am angegebenen Index an. |
| [setName(String name, int index)](#setName-java.lang.String-int-) | Setzt den Schriftartnamen am angegebenen Index. |
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


Fügt einen Schriftartnamen zur Name INDEX-Struktur hinzu. Verwenden Sie diese Methode mit Vorsicht, da jeder Schriftartname in der CFF Name INDEX-Struktur gemäß der CFF-Spezifikation eine entsprechende DICT-Struktur im Top DICT-Index haben muss.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String |  |

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


Liefert den Schriftartnamen am angegebenen Index.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int | Schriftart-Index. |

**Returns:**
java.lang.String - Schriftartname.
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


Liefert die Anzahl der Objekte in der CFF-INDEX-Struktur.

**Returns:**
int
### getName(int index) {#getName-int-}
```
public abstract String getName(int index)
```


Liefert den Namen der Schriftart am angegebenen Index.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int | Schriftart-Index. |

**Returns:**
java.lang.String - Der Schriftartname.
### getRawBytes() {#getRawBytes--}
```
public abstract byte[] getRawBytes()
```


Liest alle Bytes der CFF INDEX-Struktur.

**Returns:**
byte[] - Bytes der CFF INDEX-Struktur
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


Entfernt den Namen am angegebenen Index. Verwenden Sie diese Methode mit Vorsicht, da jeder Schriftartname in der CFF Name INDEX-Struktur gemäß der CFF-Spezifikation eine entsprechende DICT-Struktur im Top DICT-Index haben muss.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int | Schriftart-Index. |

### set(int index, String name) {#set-int-java.lang.String-}
```
public abstract void set(int index, String name)
```


Gibt den Schriftartnamen am angegebenen Index an.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int | Schriftart-Index. |
| Name | java.lang.String | Schriftartname. |

### setName(String name, int index) {#setName-java.lang.String-int-}
```
public abstract void setName(String name, int index)
```


Setzt den Schriftartnamen am angegebenen Index.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String | Schriftartname. |
| Index | int | Schriftart-Index. |

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

