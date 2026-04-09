---
title: Int2D
second_title: Aspose.3D für Java API-Referenz
description: Erstellt von lexchou am 17.05.2017.
type: docs
weight: 86
url: /de/java/com.aspose.threed/int2d/
---

**Inheritance:**
java.lang.Object
```
public final class Int2D
```

Erstellt von lexchou am 17.05.2017. 2‑dimensionaler int‑Array‑Wrapper
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [Int2D(int rows, int columns)](#Int2D-int-int-) | Erstelle ein 2D‑int‑Array mit Standard‑Datenzuweisung. |
| [Int2D(int rows, int columns, int[] data)](#Int2D-int-int-int---) | Erstelle ein 2D‑int‑Array mit angegebenen Daten |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int r, int c)](#get-int-int-) | Liefert das Element an der angegebenen Position |
| [getClass()](#getClass--) |  |
| [getColumns()](#getColumns--) |  |
| [getLength(int rank)](#getLength-int-) |  |
| [getRows()](#getRows--) |  |
| [hashCode()](#hashCode--) |  |
| [length()](#length--) | Liefert die Gesamtlänge dieses 2D-Arrays |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [set(int r, int c, int v)](#set-int-int-int-) | Setzt das Element an der angegebenen Position |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Int2D(int rows, int columns) {#Int2D-int-int-}
```
public Int2D(int rows, int columns)
```


Erstelle ein 2D‑int‑Array mit Standard‑Datenzuweisung.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Zeilen | int | Anzahl der Zeilen des 2D-Arrays |
| Spalten | int | Anzahl der Spalten des 2D-Arrays |

### Int2D(int rows, int columns, int[] data) {#Int2D-int-int-int---}
```
public Int2D(int rows, int columns, int[] data)
```


Erstelle ein 2D‑int‑Array mit angegebenen Daten

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Zeilen | int | Anzahl der Zeilen des 2D-Arrays |
| Spalten | int | Anzahl der Spalten des 2D-Arrays |
| Daten | int[] | Array zum Einwickeln, Float2D verwendet dieses Array intern. |

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
### get(int r, int c) {#get-int-int-}
```
public int get(int r, int c)
```


Liefert das Element an der angegebenen Position

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| r | int | Zeile |
| c | int | Spalte |

**Returns:**
int - der Wert an der angegebenen Position
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getColumns() {#getColumns--}
```
public int getColumns()
```




**Returns:**
int
### getLength(int rank) {#getLength-int-}
```
public int getLength(int rank)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Rang | int |  |

**Returns:**
int
### getRows() {#getRows--}
```
public int getRows()
```




**Returns:**
int
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### length() {#length--}
```
public int length()
```


Liefert die Gesamtlänge dieses 2D-Arrays

**Returns:**
int - die Gesamtzahl der Float-Werte in diesem 2D-Array.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### set(int r, int c, int v) {#set-int-int-int-}
```
public void set(int r, int c, int v)
```


Setzt das Element an der angegebenen Position

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| r | int | Zeile |
| c | int | Spalte |
| v | int | Wert |

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
public final void wait(long arg0)
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

