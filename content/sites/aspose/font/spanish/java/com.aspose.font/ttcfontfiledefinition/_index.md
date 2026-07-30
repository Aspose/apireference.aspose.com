---
title: "TtcFontFileDefinition"
second_title: "Referencia de API de Aspose.Font para Java"
description: "Representa la definición de archivo para la fuente TTC."
type: docs
weight: 79
url: /es/java/com.aspose.font/ttcfontfiledefinition/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.FontFileDefinition](../../com.aspose.font/fontfiledefinition)
```
public class TtcFontFileDefinition extends FontFileDefinition
```

Representa la definición de archivo para la fuente TTC.
## Constructores

| Constructor | Descripción |
| --- | --- |
| [TtcFontFileDefinition(int fontIndex, String fileExtension, StreamSource streamSource, long offset)](#TtcFontFileDefinition-int-java.lang.String-com.aspose.font.StreamSource-long-) | Crea una definición de archivo usando solo el contenido del archivo. |
## Métodos

| Método | Descripción |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getFileExtension()](#getFileExtension--) | Obtiene la extensión del archivo. |
| [getFileName()](#getFileName--) | Obtiene el nombre del archivo. |
| [getFontIndex()](#getFontIndex--) | Obtiene el índice de fuente dentro de la fuente TTC. |
| [getOffset()](#getOffset--) | Obtiene el desplazamiento dentro del flujo. |
| [getStreamSource()](#getStreamSource--) | Obtiene la fuente del flujo. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### TtcFontFileDefinition(int fontIndex, String fileExtension, StreamSource streamSource, long offset) {#TtcFontFileDefinition-int-java.lang.String-com.aspose.font.StreamSource-long-}
```
public TtcFontFileDefinition(int fontIndex, String fileExtension, StreamSource streamSource, long offset)
```


Crea una definición de archivo usando solo el contenido del archivo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| fontIndex | int | Índice de fuente dentro de la colección de fuentes TTC. |
| fileExtension | java.lang.String | Extensión de la colección de archivos de fuentes. |
| streamSource | [StreamSource](../../com.aspose.font/streamsource) | Origen de la colección de archivos de fuentes. |
| desplazamiento | long | Desplazamiento a los datos de la fuente en la colección de archivos de fuentes, ver Cabecera TTC, Tabla de Desplazamiento en la especificación del archivo de fuentes OpenType. |

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
### getFileExtension() {#getFileExtension--}
```
public String getFileExtension()
```


Obtiene la extensión del archivo.

**Returns:**
java.lang.String - Extensión de archivo.
### getFileName() {#getFileName--}
```
public String getFileName()
```


Obtiene el nombre del archivo.

**Returns:**
java.lang.String - Nombre de archivo.
### getFontIndex() {#getFontIndex--}
```
public long getFontIndex()
```


Obtiene el índice de fuente dentro de la fuente TTC.

**Returns:**
long - Índice de fuente dentro del TTC.
### getOffset() {#getOffset--}
```
public long getOffset()
```


Obtiene el desplazamiento dentro del flujo.

**Returns:**
long - Desplazamiento dentro del flujo.
### getStreamSource() {#getStreamSource--}
```
public StreamSource getStreamSource()
```


Obtiene la fuente del flujo.

**Returns:**
[StreamSource](../../com.aspose.font/streamsource) - The stream source.
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

