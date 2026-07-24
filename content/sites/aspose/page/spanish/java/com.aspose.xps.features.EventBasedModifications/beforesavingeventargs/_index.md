---
title: "BeforeSavingEventArgs"
second_title: "Referencia de API de Aspose.Page para Java"
description: "Define la clase base para los argumentos de varios eventos antes de guardar."
type: docs
weight: 11
url: /es/java/com.aspose.xps.features.eventbasedmodifications/beforesavingeventargs/
---
**Inheritance:**
java.lang.Object
```
public class BeforeSavingEventArgs<T>
```

Define la clase base para los argumentos de varios eventos antes de guardar.
## Métodos

| Método | Descripción |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAbsolutePageNumber()](#getAbsolutePageNumber--) | Devuelve el número de página absoluto actual en todos los documentos dentro del paquete XPS. |
| [getClass()](#getClass--) |  |
| [getDocumentNumber()](#getDocumentNumber--) | Devuelve el número de documento actual dentro del paquete XPS. |
| [getElementAPI()](#getElementAPI--) | Devuelve la API de modificación del elemento que está a punto de guardarse. |
| [getOutputPageNumber()](#getOutputPageNumber--) | Devuelve el número de salida actual. |
| [getRelativePageNumber()](#getRelativePageNumber--) | Devuelve el número de página actual relativo al documento actual dentro del paquete XPS. |
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
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getAbsolutePageNumber() {#getAbsolutePageNumber--}
```
public int getAbsolutePageNumber()
```


Devuelve el número de página absoluto actual en todos los documentos dentro del paquete XPS.

**Returns:**
int - El número de página absoluto actual en todos los documentos dentro del paquete XPS.
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


Devuelve el número de documento actual dentro del paquete XPS.

**Returns:**
int - El número de documento actual dentro del paquete XPS.
### getElementAPI() {#getElementAPI--}
```
public T getElementAPI()
```


Devuelve la API de modificación del elemento que está a punto de guardarse.

**Returns:**
T - La API de modificación del elemento que está a punto de guardarse.
### getOutputPageNumber() {#getOutputPageNumber--}
```
public int getOutputPageNumber()
```


Devuelve el número de salida actual. Difiere de **AbsolutePageNumber** si se especifica la opción de guardado **PageNumbers**.

**Returns:**
int - El número de salida actual.
### getRelativePageNumber() {#getRelativePageNumber--}
```
public int getRelativePageNumber()
```


Devuelve el número de página actual relativo al documento actual dentro del paquete XPS.

**Returns:**
int - El número de página actual relativo al documento actual dentro del paquete XPS.
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

