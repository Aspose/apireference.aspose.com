---
title: "FileSystemStreamSource"
second_title: "Riferimento API Aspose.Font per Java"
description: "Rappresenta una sorgente di flusso basata sul file system."
type: docs
weight: 31
url: /it/java/com.aspose.font/filesystemstreamsource/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.StreamSource](../../com.aspose.font/streamsource)
```
public class FileSystemStreamSource extends StreamSource
```

Rappresenta una sorgente di flusso basata sul file system.
## Costruttori

| Costruttore | Descrizione |
| --- | --- |
| [FileSystemStreamSource(String fileName)](#FileSystemStreamSource-java.lang.String-) | Inizializza un nuovo  FileSystemStreamSource  oggetto. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [deepClone()](#deepClone--) | Clona l'oggetto FileSystemStreamSource. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getFileName()](#getFileName--) | Ottiene il nome del file. |
| [getFontStream()](#getFontStream--) | Restituisce lo stream del file Font. |
| [getOffset()](#getOffset--) | Ottiene l'offset all'interno della sorgente. |
| [hashCode()](#hashCode--) |  |
| [mustCloseAfterUse()](#mustCloseAfterUse--) | Gli eredi possono impedire la chiusura del stream. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setFileName(String value)](#setFileName-java.lang.String-) | Imposta il nome del file. |
| [setOffset(long value)](#setOffset-long-) | Imposta l'offset all'interno della sorgente. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### FileSystemStreamSource(String fileName) {#FileSystemStreamSource-java.lang.String-}
```
public FileSystemStreamSource(String fileName)
```


Inizializza un nuovo  FileSystemStreamSource  oggetto.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fileName | java.lang.String | Nome file. |

### deepClone() {#deepClone--}
```
public Object deepClone()
```


Clona l'oggetto FileSystemStreamSource.

**Returns:**
java.lang.Object - Copia dell'oggetto FileSystemStreamSource.
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
### getFileName() {#getFileName--}
```
public String getFileName()
```


Ottiene il nome del file.

**Returns:**
java.lang.String - Nome del file.
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




### setFileName(String value) {#setFileName-java.lang.String-}
```
public void setFileName(String value)
```


Imposta il nome del file.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | java.lang.String | Nome file. |

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

