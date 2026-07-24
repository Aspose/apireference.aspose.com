---
title: "StreamDataSource"
second_title: "Aspose.Page for Java API-Referenz"
description: "Stellt die Stream‑Datenquelle für Lade- und Speicheroperationen eines Plugins dar."
type: docs
weight: 17
url: /de/java/com.aspose.page.plugins/streamdatasource/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IDataSource](../../com.aspose.page.plugins/idatasource)
```
public final class StreamDataSource implements IDataSource
```

Stellt die Stream‑Datenquelle für Lade- und Speicheroperationen eines Plugins dar.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [StreamDataSource(Object data)](#StreamDataSource-java.lang.Object-) | Initialisiert neue Stream-Datenquelle mit dem angegebenen Stream-Objekt. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getData()](#getData--) | Erhält das Stream-Objekt der aktuellen Datenquelle. |
| [getDataType()](#getDataType--) | Typ der Datenquelle (Stream). |
| [getInputStream()](#getInputStream--) |  |
| [getOutputStream()](#getOutputStream--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### StreamDataSource(Object data) {#StreamDataSource-java.lang.Object-}
```
public StreamDataSource(Object data)
```


Initialisiert neue Stream-Datenquelle mit dem angegebenen Stream-Objekt.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Daten | java.lang.Object | Stream-Objekt |

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
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getData() {#getData--}
```
public final Object getData()
```


Erhält das Stream-Objekt der aktuellen Datenquelle.

**Returns:**
java.lang.Object
### getDataType() {#getDataType--}
```
public final int getDataType()
```


Typ der Datenquelle (Stream).

**Returns:**
int
### getInputStream() {#getInputStream--}
```
public final InputStream getInputStream()
```




**Returns:**
java.io.InputStream
### getOutputStream() {#getOutputStream--}
```
public final OutputStream getOutputStream()
```




**Returns:**
java.io.OutputStream
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

