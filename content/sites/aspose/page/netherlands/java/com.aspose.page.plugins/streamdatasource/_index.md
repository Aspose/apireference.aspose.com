---
title: "StreamDataSource"
second_title: "Aspose.Page voor Java API-referentie"
description: "Stelt de stream-gegevensbron voor laad- en opslagbewerkingen van een plug-in voor."
type: docs
weight: 17
url: /nl/java/com.aspose.page.plugins/streamdatasource/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IDataSource](../../com.aspose.page.plugins/idatasource)
```
public final class StreamDataSource implements IDataSource
```

Stelt de stream-gegevensbron voor laad- en opslagbewerkingen van een plug-in voor.
## Constructors

| Constructor | Beschrijving |
| --- | --- |
| [StreamDataSource(Object data)](#StreamDataSource-java.lang.Object-) | Initialiseert een nieuwe stream-gegevensbron met het opgegeven streamobject. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getData()](#getData--) | Haalt het streamobject op van de huidige gegevensbron. |
| [getDataType()](#getDataType--) | Type van gegevensbron (stream). |
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


Initialiseert een nieuwe stream-gegevensbron met het opgegeven streamobject.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| gegevens | java.lang.Object | Streamobject |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Beschrijving |
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


Haalt het streamobject op van de huidige gegevensbron.

**Returns:**
java.lang.Object
### getDataType() {#getDataType--}
```
public final int getDataType()
```


Type van gegevensbron (stream).

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
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

