---
title: "StreamSource"
second_title: "Referencia de API de Aspose.Font para Java"
description: "Define una forma de obtener un flujo de archivo cuando se necesita."
type: docs
weight: 74
url: /es/java/com.aspose.font/streamsource/
---
**Inheritance:**
java.lang.Object
```
public abstract class StreamSource
```

Define una forma de obtener un flujo de archivo cuando se necesita.
## Constructores

| Constructor | Descripción |
| --- | --- |
| [StreamSource()](#StreamSource--) | Inicializa la instancia de la fuente de flujo. |
## Métodos

| Método | Descripción |
| --- | --- |
| [deepClone()](#deepClone--) | Clona el objeto de la fuente de flujo. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getFontStream()](#getFontStream--) | Devuelve el flujo de Font. |
| [getOffset()](#getOffset--) | Obtiene el desplazamiento dentro de la fuente. |
| [hashCode()](#hashCode--) |  |
| [mustCloseAfterUse()](#mustCloseAfterUse--) | Los herederos pueden evitar que el flujo se cierre. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setOffset(long value)](#setOffset-long-) | Establece el desplazamiento dentro de la fuente. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### StreamSource() {#StreamSource--}
```
public StreamSource()
```


Inicializa la instancia de la fuente de flujo.

### deepClone() {#deepClone--}
```
public abstract Object deepClone()
```


Clona el objeto de la fuente de flujo.

**Returns:**
java.lang.Object - Copia del objeto de la fuente de flujo.
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


Devuelve el flujo de Font.

**Returns:**
java.io.InputStream - Flujo de Font.
### getOffset() {#getOffset--}
```
public long getOffset()
```


Obtiene el desplazamiento dentro de la fuente.

**Returns:**
long - Desplazamiento dentro de la fuente.
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


Los herederos pueden evitar que el flujo se cierre. Devuelve verdadero si la fuente de flujo desea que el flujo se cierre después de su uso. De lo contrario, devuelve falso.

**Returns:**
boolean - Verdadero si la fuente de flujo desea que el flujo se cierre después de su uso, de lo contrario falso.
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


Establece el desplazamiento dentro de la fuente.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| valor | long | Desplazamiento dentro de la fuente. |

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

