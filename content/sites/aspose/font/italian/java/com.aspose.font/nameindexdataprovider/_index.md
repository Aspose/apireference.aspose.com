---
title: "NameIndexDataProvider"
second_title: "Riferimento API Aspose.Font per Java"
description: "Fornisce impostazioni comuni ai font CFF."
type: docs
weight: 68
url: /it/java/com.aspose.font/nameindexdataprovider/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.ICffIndexDataProvider](../../com.aspose.font/icffindexdataprovider)
```
public abstract class NameIndexDataProvider implements ICffIndexDataProvider
```

Fornisce impostazioni comuni ai font CFF.
## Costruttori

| Costruttore | Descrizione |
| --- | --- |
| [NameIndexDataProvider()](#NameIndexDataProvider--) |  |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [addName(String name)](#addName-java.lang.String-) | Aggiunge un nome di carattere alla struttura Name INDEX. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int index)](#get-int-) | Ottiene il nome del carattere all'indice specificato. |
| [getClass()](#getClass--) |  |
| [getCount()](#getCount--) | Ottiene il numero di oggetti nella struttura CFF INDEX. |
| [getName(int index)](#getName-int-) | Ottiene il nome del carattere all'indice specificato. |
| [getRawBytes()](#getRawBytes--) | Ottiene tutti i byte della struttura CFF INDEX. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeName(int index)](#removeName-int-) | Rimuove il nome all'indice specificato. |
| [set(int index, String name)](#set-int-java.lang.String-) | Specifica il nome del font all'indice specificato. |
| [setName(String name, int index)](#setName-java.lang.String-int-) | Imposta il nome del font all'indice specificato. |
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


Aggiunge un nome di font alla struttura Name INDEX. Utilizza questo metodo con cautela perché ogni nome di font nella struttura CFF Name INDEX deve avere una struttura DICT corrispondente nell'indice Top DICT secondo la specifica CFF.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nome | java.lang.String |  |

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
### get(int index) {#get-int-}
```
public abstract String get(int index)
```


Ottiene il nome del carattere all'indice specificato.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| indice | int | Indice del font. |

**Returns:**
java.lang.String - Nome del font.
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


Ottiene il numero di oggetti nella struttura CFF INDEX.

**Returns:**
int
### getName(int index) {#getName-int-}
```
public abstract String getName(int index)
```


Ottiene il nome del carattere all'indice specificato.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| indice | int | Indice del font. |

**Returns:**
java.lang.String - Il nome del font.
### getRawBytes() {#getRawBytes--}
```
public abstract byte[] getRawBytes()
```


Ottiene tutti i byte della struttura CFF INDEX.

**Returns:**
byte[] - Byte della struttura CFF INDEX
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


Rimuove il nome all'indice specificato. Utilizza questo metodo con cautela perché ogni nome di font nella struttura CFF Name INDEX deve avere una struttura DICT corrispondente nell'indice Top DICT secondo la specifica CFF.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| indice | int | Indice del font. |

### set(int index, String name) {#set-int-java.lang.String-}
```
public abstract void set(int index, String name)
```


Specifica il nome del font all'indice specificato.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| indice | int | Indice del font. |
| nome | java.lang.String | Nome del font. |

### setName(String name, int index) {#setName-java.lang.String-int-}
```
public abstract void setName(String name, int index)
```


Imposta il nome del font all'indice specificato.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nome | java.lang.String | Nome del font. |
| indice | int | Indice del font. |

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

