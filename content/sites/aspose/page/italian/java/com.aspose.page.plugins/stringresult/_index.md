---
title: "StringResult"
second_title: "Aspose.Page per Java API Reference"
description: "Rappresenta il risultato dell'operazione sotto forma di stringa."
type: docs
weight: 19
url: /it/java/com.aspose.page.plugins/stringresult/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IOperationResult](../../com.aspose.page.plugins/ioperationresult)
```
public final class StringResult implements IOperationResult
```

Rappresenta il risultato dell'operazione sotto forma di stringa.
## Costruttori

| Costruttore | Descrizione |
| --- | --- |
| [StringResult(String result)](#StringResult-java.lang.String-) | Inizializza una nuova istanza di StringResult con una stringa. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getData()](#getData--) | Restituisce i dati grezzi. |
| [getText()](#getText--) | Restituisce la rappresentazione stringa del risultato. |
| [hashCode()](#hashCode--) |  |
| [isByteArray()](#isByteArray--) | Indica se il risultato è un array di byte. |
| [isFile()](#isFile--) | Indica se il risultato è un percorso a un file di output. |
| [isStream()](#isStream--) | Indica se il risultato è un percorso a un file di output. |
| [isString()](#isString--) | Indica se il risultato è una stringa. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toFile()](#toFile--) | Prova a convertire il risultato in un file. |
| [toStream()](#toStream--) | Prova a convertire il risultato in un oggetto stream. |
| [toString()](#toString--) | Prova a convertire il risultato in una stringa. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### StringResult(String result) {#StringResult-java.lang.String-}
```
public StringResult(String result)
```


Inizializza una nuova istanza di StringResult con una stringa.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| risultato | java.lang.String | Stringa che rappresenta il risultato |

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
### getText() {#getText--}
```
public final String getText()
```


Restituisce la rappresentazione stringa del risultato.

**Returns:**
java.lang.String
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


Indica se il risultato è un percorso a un file di output.

**Returns:**
boolean - true se il risultato è un oggetto stream; altrimenti false.
### isString() {#isString--}
```
public final boolean isString()
```


Indica se il risultato è una stringa.

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


Prova a convertire il risultato in una stringa.

**Returns:**
java.lang.String - Una stringa che rappresenta il contenuto testuale se il risultato è una stringa; altrimenti restituisce base.ToString().
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

