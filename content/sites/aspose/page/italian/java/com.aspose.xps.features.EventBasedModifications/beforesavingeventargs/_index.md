---
title: "BeforeSavingEventArgs"
second_title: "Aspose.Page per Java API Reference"
description: "Definisce la classe base per gli argomenti di vari eventi di pre‑salvataggio."
type: docs
weight: 11
url: /it/java/com.aspose.xps.features.eventbasedmodifications/beforesavingeventargs/
---
**Inheritance:**
java.lang.Object
```
public class BeforeSavingEventArgs<T>
```

Definisce la classe base per gli argomenti di vari eventi di pre‑salvataggio.
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAbsolutePageNumber()](#getAbsolutePageNumber--) | Restituisce il numero di pagina assoluto corrente su tutti i documenti all'interno del pacchetto XPS. |
| [getClass()](#getClass--) |  |
| [getDocumentNumber()](#getDocumentNumber--) | Restituisce il numero di documento corrente all'interno del pacchetto XPS. |
| [getElementAPI()](#getElementAPI--) | Restituisce l'API di modifica dell'elemento che sta per essere salvato. |
| [getOutputPageNumber()](#getOutputPageNumber--) | Restituisce il numero di output corrente. |
| [getRelativePageNumber()](#getRelativePageNumber--) | Restituisce il numero di pagina corrente relativo al documento corrente all'interno del pacchetto XPS. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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
### getAbsolutePageNumber() {#getAbsolutePageNumber--}
```
public int getAbsolutePageNumber()
```


Restituisce il numero di pagina assoluto corrente su tutti i documenti all'interno del pacchetto XPS.

**Returns:**
int - Il numero di pagina assoluto corrente su tutti i documenti all'interno del pacchetto XPS.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDocumentNumber() {#getDocumentNumber--}
```
public int getDocumentNumber()
```


Restituisce il numero di documento corrente all'interno del pacchetto XPS.

**Returns:**
int - Il numero di documento corrente all'interno del pacchetto XPS.
### getElementAPI() {#getElementAPI--}
```
public T getElementAPI()
```


Restituisce l'API di modifica dell'elemento che sta per essere salvato.

**Returns:**
T - L'API di modifica dell'elemento che sta per essere salvato.
### getOutputPageNumber() {#getOutputPageNumber--}
```
public int getOutputPageNumber()
```


Restituisce il numero di output corrente. È diverso da **AbsolutePageNumber** se è specificata l'opzione di salvataggio **PageNumbers**.

**Returns:**
int - Il numero di output corrente.
### getRelativePageNumber() {#getRelativePageNumber--}
```
public int getRelativePageNumber()
```


Restituisce il numero di pagina corrente relativo al documento corrente all'interno del pacchetto XPS.

**Returns:**
int - Il numero di pagina corrente relativo al documento corrente all'interno del pacchetto XPS.
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

