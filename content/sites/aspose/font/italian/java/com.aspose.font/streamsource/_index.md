---
title: "StreamSource"
second_title: "Riferimento API Aspose.Font per Java"
description: "Definisce un modo per ottenere un flusso di file quando è necessario."
type: docs
weight: 74
url: /it/java/com.aspose.font/streamsource/
---
**Inheritance:**
java.lang.Object
```
public abstract class StreamSource
```

Definisce un modo per ottenere un flusso di file quando è necessario.
## Costruttori

| Costruttore | Descrizione |
| --- | --- |
| [StreamSource()](#StreamSource--) | Inizializza l'istanza della sorgente di stream. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [deepClone()](#deepClone--) | Clona l'oggetto della sorgente di stream. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getFontStream()](#getFontStream--) | Restituisce lo stream del Font. |
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
### StreamSource() {#StreamSource--}
```
public StreamSource()
```


Inizializza l'istanza della sorgente di stream.

### deepClone() {#deepClone--}
```
public abstract Object deepClone()
```


Clona l'oggetto della sorgente di stream.

**Returns:**
java.lang.Object - Copia dell'oggetto della sorgente di stream.
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
public abstract InputStream getFontStream()
```


Restituisce lo stream del Font.

**Returns:**
java.io.InputStream - Stream del Font.
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

