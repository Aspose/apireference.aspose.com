---
title: "StringIndexDataProvider"
second_title: "Referencia de API de Aspose.Font para Java"
description: "Declara la funcionalidad para acceder a la estructura CFF String INDEX."
type: docs
weight: 75
url: /es/java/com.aspose.font/stringindexdataprovider/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.ICffIndexDataProvider](../../com.aspose.font/icffindexdataprovider)
```
public abstract class StringIndexDataProvider implements ICffIndexDataProvider
```

Declara la funcionalidad para acceder a la estructura CFF String INDEX.
## Constructores

| Constructor | Descripción |
| --- | --- |
| [StringIndexDataProvider()](#StringIndexDataProvider--) |  |
## Métodos

| Método | Descripción |
| --- | --- |
| [addString(String value)](#addString-java.lang.String-) | Agrega cadena en la estructura CFF String INDEX. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int index)](#get-int-) | Obtiene/establece la cadena en el índice especificado. |
| [getClass()](#getClass--) |  |
| [getCount()](#getCount--) | El número de objetos en la estructura CFF INDEX. |
| [getRawBytes()](#getRawBytes--) | Obtiene todos los bytes de la estructura CFF INDEX. |
| [getString(int index)](#getString-int-) | Obtiene la cadena en el índice especificado de la estructura CFF String INDEX. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeString(int index)](#removeString-int-) | Elimina la cadena de la estructura CFF String Index en el índice especificado. |
| [set(int index, String value)](#set-int-java.lang.String-) |  |
| [setString(String value, int index)](#setString-java.lang.String-int-) | Establece la cadena en la estructura CFF String Index en el índice especificado. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### StringIndexDataProvider() {#StringIndexDataProvider--}
```
public StringIndexDataProvider()
```


### addString(String value) {#addString-java.lang.String-}
```
public abstract void addString(String value)
```


Agrega cadena en la estructura CFF String INDEX.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| valor | java.lang.String | Valor de cadena |

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


Obtiene/establece la cadena en el índice especificado.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| índice | int | Índice de cadena, el índice significa un número ordinal en la estructura CFF INDEX, no SID |

**Returns:**
java.lang.String - Cadena
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


El número de objetos en la estructura CFF INDEX.

**Returns:**
int
### getRawBytes() {#getRawBytes--}
```
public abstract byte[] getRawBytes()
```


Obtiene todos los bytes de la estructura CFF INDEX.

**Returns:**
byte[] - Bytes de la estructura CFF INDEX
### getString(int index) {#getString-int-}
```
public abstract String getString(int index)
```


Obtiene la cadena en el índice especificado de la estructura CFF String INDEX.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| índice | int | Índice de cadena, el índice significa número ordinal en la estructura CFF INDEX, no SID |

**Returns:**
java.lang.String - Cadena
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




### removeString(int index) {#removeString-int-}
```
public abstract void removeString(int index)
```


Elimina la cadena de la estructura CFF String Index en el índice especificado.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| índice | int | Índice de cadena, el índice significa un número ordinal en la estructura CFF INDEX, no SID |

### set(int index, String value) {#set-int-java.lang.String-}
```
public abstract void set(int index, String value)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| índice | int |  |
| valor | java.lang.String |  |

### setString(String value, int index) {#setString-java.lang.String-int-}
```
public abstract void setString(String value, int index)
```


Establece la cadena en la estructura CFF String Index en el índice especificado.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| valor | java.lang.String | Valor de cadena |
| índice | int | Índice de cadena, el índice significa número ordinal en la estructura CFF INDEX, no SID |

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

