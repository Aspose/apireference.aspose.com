---
title: "FileSystemStreamSource"
second_title: "Referencia de API de Aspose.Font para Java"
description: "Representa una fuente de flujo basada en el sistema de archivos."
type: docs
weight: 31
url: /es/java/com.aspose.font/filesystemstreamsource/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.StreamSource](../../com.aspose.font/streamsource)
```
public class FileSystemStreamSource extends StreamSource
```

Representa una fuente de flujo basada en el sistema de archivos.
## Constructores

| Constructor | Descripción |
| --- | --- |
| [FileSystemStreamSource(String fileName)](#FileSystemStreamSource-java.lang.String-) | Inicializa un nuevo objeto  FileSystemStreamSource . |
## Métodos

| Método | Descripción |
| --- | --- |
| [deepClone()](#deepClone--) | Clona el objeto FileSystemStreamSource. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getFileName()](#getFileName--) | Obtiene el nombre del archivo. |
| [getFontStream()](#getFontStream--) | Devuelve el flujo del archivo de fuente. |
| [getOffset()](#getOffset--) | Obtiene el desplazamiento dentro de la fuente. |
| [hashCode()](#hashCode--) |  |
| [mustCloseAfterUse()](#mustCloseAfterUse--) | Los herederos pueden evitar que el flujo se cierre. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setFileName(String value)](#setFileName-java.lang.String-) | Establece el nombre del archivo. |
| [setOffset(long value)](#setOffset-long-) | Establece el desplazamiento dentro de la fuente. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### FileSystemStreamSource(String fileName) {#FileSystemStreamSource-java.lang.String-}
```
public FileSystemStreamSource(String fileName)
```


Inicializa un nuevo objeto  FileSystemStreamSource .

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| fileName | java.lang.String | Nombre del archivo. |

### deepClone() {#deepClone--}
```
public Object deepClone()
```


Clona el objeto FileSystemStreamSource.

**Returns:**
java.lang.Object - Copia del objeto FileSystemStreamSource.
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
### getFileName() {#getFileName--}
```
public String getFileName()
```


Obtiene el nombre del archivo.

**Returns:**
java.lang.String - Nombre de archivo.
### getFontStream() {#getFontStream--}
```
public InputStream getFontStream()
```


Devuelve el flujo del archivo de fuente. No olvides cerrar el flujo después de usarlo.

**Returns:**
java.io.InputStream - Flujo del archivo de fuente.
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




### setFileName(String value) {#setFileName-java.lang.String-}
```
public void setFileName(String value)
```


Establece el nombre del archivo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| valor | java.lang.String | Nombre del archivo. |

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

