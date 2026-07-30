---
title: "NameIndexDataProvider"
second_title: "Referencia de API de Aspose.Font para Java"
description: "Proporciona configuraciones comunes a fuentes CFF."
type: docs
weight: 68
url: /es/java/com.aspose.font/nameindexdataprovider/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.ICffIndexDataProvider](../../com.aspose.font/icffindexdataprovider)
```
public abstract class NameIndexDataProvider implements ICffIndexDataProvider
```

Proporciona configuraciones comunes a fuentes CFF.
## Constructores

| Constructor | Descripción |
| --- | --- |
| [NameIndexDataProvider()](#NameIndexDataProvider--) |  |
## Métodos

| Método | Descripción |
| --- | --- |
| [addName(String name)](#addName-java.lang.String-) | Agrega un nombre de fuente a la estructura Name INDEX. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int index)](#get-int-) | Obtiene el nombre de la fuente en el índice especificado. |
| [getClass()](#getClass--) |  |
| [getCount()](#getCount--) | Obtiene el número de objetos en la estructura CFF INDEX. |
| [getName(int index)](#getName-int-) | Obtiene el nombre de la fuente en el índice especificado. |
| [getRawBytes()](#getRawBytes--) | Obtiene todos los bytes de la estructura CFF INDEX. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeName(int index)](#removeName-int-) | Elimina el nombre en el índice especificado. |
| [set(int index, String name)](#set-int-java.lang.String-) | Especifica el nombre de la fuente en el índice especificado. |
| [setName(String name, int index)](#setName-java.lang.String-int-) | Establece el nombre de la fuente en el índice especificado. |
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


Agrega un nombre de fuente a la estructura Name INDEX. Use este método con precaución porque cada nombre de fuente en la estructura CFF Name INDEX debe tener una estructura DICT correspondiente en el índice Top DICT según la especificación CFF.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| nombre | java.lang.String |  |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### get(int index) {#get-int-}
```
public abstract String get(int index)
```


Obtiene el nombre de la fuente en el índice especificado.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| índice | int | Índice de fuente. |

**Returns:**
java.lang.String - Nombre de fuente.
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


Obtiene el número de objetos en la estructura CFF INDEX.

**Returns:**
int
### getName(int index) {#getName-int-}
```
public abstract String getName(int index)
```


Obtiene el nombre de la fuente en el índice especificado.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| índice | int | Índice de fuente. |

**Returns:**
java.lang.String - El nombre de la fuente.
### getRawBytes() {#getRawBytes--}
```
public abstract byte[] getRawBytes()
```


Obtiene todos los bytes de la estructura CFF INDEX.

**Returns:**
byte[] - Bytes de la estructura CFF INDEX
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


Elimina el nombre en el índice especificado. Use este método con precaución porque cada nombre de fuente en la estructura CFF Name INDEX debe tener una estructura DICT correspondiente en el índice Top DICT según la especificación CFF.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| índice | int | Índice de fuente. |

### set(int index, String name) {#set-int-java.lang.String-}
```
public abstract void set(int index, String name)
```


Especifica el nombre de la fuente en el índice especificado.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| índice | int | Índice de fuente. |
| nombre | java.lang.String | Nombre de fuente. |

### setName(String name, int index) {#setName-java.lang.String-int-}
```
public abstract void setName(String name, int index)
```


Establece el nombre de la fuente en el índice especificado.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| nombre | java.lang.String | Nombre de fuente. |
| índice | int | Índice de fuente. |

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
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

