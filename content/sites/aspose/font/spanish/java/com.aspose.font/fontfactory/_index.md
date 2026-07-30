---
title: "FontFactory"
second_title: "Referencia de API de Aspose.Font para Java"
description: "Contiene funcionalidad para abrir fuentes de diferentes tipos y otros métodos para crear varios objetos."
type: docs
weight: 41
url: /es/java/com.aspose.font/fontfactory/
---
**Inheritance:**
java.lang.Object
```
public class FontFactory
```

Contiene funcionalidad para abrir fuentes de diferentes tipos y otros métodos para crear varios objetos.
## Constructores

| Constructor | Descripción |
| --- | --- |
| [FontFactory()](#FontFactory--) | Constructor |
## Métodos

| Método | Descripción |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [open(FontDefinition fontDefinition)](#open-com.aspose.font.FontDefinition-) | Abre una fuente, usando el objeto FontDefinition. |
| [open(FontType fontType, byte[] fontData)](#open-com.aspose.font.FontType-byte---) | Abre una fuente, usando el tipo de fuente y la matriz de bytes de datos de fuente. |
| [open(FontType fontType, StreamSource fontStreamSource)](#open-com.aspose.font.FontType-com.aspose.font.StreamSource-) | Abre una fuente, usando el tipo de fuente y la fuente de flujo. |
| [open(FontType fontType, String fileName)](#open-com.aspose.font.FontType-java.lang.String-) | Abre una fuente, usando el tipo de fuente y el nombre de archivo de fuente. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### FontFactory() {#FontFactory--}
```
public FontFactory()
```


Constructor

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




### open(FontDefinition fontDefinition) {#open-com.aspose.font.FontDefinition-}
```
public Font open(FontDefinition fontDefinition)
```


Abre una fuente, usando el objeto FontDefinition.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| fontDefinition | [FontDefinition](../../com.aspose.font/fontdefinition) | Objeto de definición de fuente. |

**Returns:**
[Font](../../com.aspose.font/font) - Font loaded.
### open(FontType fontType, byte[] fontData) {#open-com.aspose.font.FontType-byte---}
```
public Font open(FontType fontType, byte[] fontData)
```


Abre una fuente, usando el tipo de fuente y la matriz de bytes de datos de fuente.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Tipo de fuente. |
| fontData | byte[] | Arreglo de bytes para cargar la fuente. |

**Returns:**
[Font](../../com.aspose.font/font) - Font loaded.
### open(FontType fontType, StreamSource fontStreamSource) {#open-com.aspose.font.FontType-com.aspose.font.StreamSource-}
```
public Font open(FontType fontType, StreamSource fontStreamSource)
```


Abre una fuente, usando el tipo de fuente y la fuente de flujo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Tipo de fuente. |
| fontStreamSource | [StreamSource](../../com.aspose.font/streamsource) | Fuente de flujo para la fuente. |

**Returns:**
[Font](../../com.aspose.font/font) - Font loaded.
### open(FontType fontType, String fileName) {#open-com.aspose.font.FontType-java.lang.String-}
```
public Font open(FontType fontType, String fileName)
```


Abre una fuente, usando el tipo de fuente y el nombre de archivo de fuente.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Tipo de fuente. |
| fileName | java.lang.String | Nombre del archivo de fuente. |

**Returns:**
[Font](../../com.aspose.font/font) - Font loaded.
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

