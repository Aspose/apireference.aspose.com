---
title: "FileResult"
second_title: "Aspose.Page per Java API Reference"
description: "Rappresenta il risultato dell'operazione sotto forma di percorso stringa al file."
type: docs
weight: 14
url: /it/java/com.aspose.page.plugins/fileresult/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IOperationResult](../../com.aspose.page.plugins/ioperationresult)
```
public final class FileResult implements IOperationResult
```

Rappresenta il risultato dell'operazione sotto forma di percorso stringa al file.
## Costruttori

| Costruttore | Descrizione |
| --- | --- |
| [FileResult(String path)](#FileResult-java.lang.String-) | Inizializza una nuova istanza con il percorso specificato a un file di output. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getData()](#getData--) | Restituisce i dati grezzi. |
| [hashCode()](#hashCode--) |  |
| [isByteArray()](#isByteArray--) | Indica se il risultato è un array di byte. |
| [isFile()](#isFile--) | Indica se il risultato è un percorso a un file di output. |
| [isStream()](#isStream--) | Indica se il risultato è un flusso di output. |
| [isString()](#isString--) | Indica se il risultato è una stringa di testo. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toFile()](#toFile--) | Prova a convertire il risultato in un file. |
| [toStream()](#toStream--) | Prova a convertire il risultato in un oggetto stream. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### FileResult(String path) {#FileResult-java.lang.String-}
```
public FileResult(String path)
```


Inizializza una nuova istanza con il percorso specificato a un file di output.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| path | java.lang.String | Percorso a un file. |

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
### getData() {#getData--}
```
public final Object getData()
```


Restituisce i dati grezzi.

**Returns:**
java.lang.Object - Un oggetto che rappresenta i dati di output.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isByteArray() {#isByteArray--}
```
public final boolean isByteArray()
```


Indica se il risultato è un array di byte.

**Returns:**
boolean - true se il risultato è un array di byte; altrimenti false.
### isFile() {#isFile--}
```
public final boolean isFile()
```


Indica se il risultato è un percorso a un file di output.

**Returns:**
boolean - true se il risultato è un file; altrimenti false.
### isStream() {#isStream--}
```
public final boolean isStream()
```


Indica se il risultato è un flusso di output.

**Returns:**
boolean - true se il risultato è un oggetto stream; altrimenti false.
### isString() {#isString--}
```
public final boolean isString()
```


Indica se il risultato è una stringa di testo.

**Returns:**
boolean - true se il risultato è una stringa; altrimenti false.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### toFile() {#toFile--}
```
public final String toFile()
```


Prova a convertire il risultato in un file.

**Returns:**
java.lang.String - Una stringa che rappresenta il percorso al file di output se il risultato è un file; altrimenti null.
### toStream() {#toStream--}
```
public final OutputStream toStream()
```


Prova a convertire il risultato in un oggetto stream.

**Returns:**
java.io.OutputStream - Un oggetto stream che rappresenta i dati di output se il risultato è stream; altrimenti null.
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

