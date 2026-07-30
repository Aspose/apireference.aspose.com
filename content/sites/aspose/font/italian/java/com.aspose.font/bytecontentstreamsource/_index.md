---
title: "ByteContentStreamSource"
second_title: "Riferimento API Aspose.Font per Java"
description: "Rappresenta una sorgente di flusso basata su _content stream."
type: docs
weight: 17
url: /it/java/com.aspose.font/bytecontentstreamsource/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.StreamSource](../../com.aspose.font/streamsource)
```
public class ByteContentStreamSource extends StreamSource
```

Rappresenta una sorgente di flusso basata sullo stream \_content.
## Costruttori

| Costruttore | Descrizione |
| --- | --- |
| [ByteContentStreamSource(byte[] fileContent)](#ByteContentStreamSource-byte---) | Inizializza un nuovo oggetto  ByteContentStreamSource  . |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [deepClone()](#deepClone--) | Clona l'oggetto ByteContentStreamSource. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getFontStream()](#getFontStream--) | Restituisce lo stream del file Font. |
| [getOffset()](#getOffset--) | Ottiene l'offset all'interno della sorgente. |
| [hashCode()](#hashCode--) |  |
| [mustCloseAfterUse()](#mustCloseAfterUse--) | Gli eredi possono impedire la chiusura del stream. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setOffset(long value)](#setOffset-long-) | Imposta l'offset all'interno della sorgente. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### ByteContentStreamSource(byte[] fileContent) {#ByteContentStreamSource-byte---}
```
public ByteContentStreamSource(byte[] fileContent)
```


Inizializza un nuovo oggetto  ByteContentStreamSource  .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fileContent | byte[] | Byte del file. |

### deepClone() {#deepClone--}
```
public Object deepClone()
```


Clona l'oggetto ByteContentStreamSource.

**Returns:**
java.lang.Object
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
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
### getFontStream() {#getFontStream--}
```
public InputStream getFontStream()
```


Restituisce lo stream del file Font. Non dimenticare di chiudere lo stream dopo l'uso.

**Returns:**
java.io.InputStream - stream del file Font.
### getOffset() {#getOffset--}
```
public long getOffset()
```


Ottiene l'offset all'interno della sorgente.

**Returns:**
long - Offset all'interno della sorgente.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### mustCloseAfterUse() {#mustCloseAfterUse--}
```
public boolean mustCloseAfterUse()
```


Gli eredi possono impedire la chiusura del stream. Restituisce true se la sorgente di stream desidera che il stream venga chiuso dopo l'uso. Altrimenti restituisce false.

**Returns:**
boolean - True se la sorgente di stream desidera che il stream venga chiuso dopo l'uso, altrimenti false.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setOffset(long value) {#setOffset-long-}
```
public void setOffset(long value)
```


Imposta l'offset all'interno della sorgente.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | long | Offset all'interno della sorgente. |

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

