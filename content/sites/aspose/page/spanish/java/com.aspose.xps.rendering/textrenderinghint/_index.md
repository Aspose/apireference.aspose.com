---
title: "TextRenderingHint"
second_title: "Referencia de API de Aspose.Page para Java"
description: "Especifica la calidad del renderizado de texto."
type: docs
weight: 25
url: /es/java/com.aspose.xps.rendering/textrenderinghint/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum TextRenderingHint extends Enum<TextRenderingHint>
```

Especifica la calidad del renderizado de texto.
## Campos

| Campo | Descripción |
| --- | --- |
| [AntiAlias](#AntiAlias) | Cada carácter se dibuja usando su mapa de bits de glifo antialias sin hinting. |
| [AntiAliasGridFit](#AntiAliasGridFit) | Cada carácter se dibuja usando su mapa de bits de glifo antialias con hinting. |
| [ClearTypeGridFit](#ClearTypeGridFit) | Cada carácter se dibuja usando su mapa de bits de glifo ClearType con hinting. |
| [SingleBitPerPixel](#SingleBitPerPixel) | Cada carácter se dibuja usando su mapa de bits de glifo. |
| [SingleBitPerPixelGridFit](#SingleBitPerPixelGridFit) | Cada carácter se dibuja usando su mapa de bits de glifo. |
| [SystemDefault](#SystemDefault) | Cada carácter se dibuja usando su mapa de bits de glifo, con la sugerencia de renderizado predeterminada del sistema. |
## Métodos

| Método | Descripción |
| --- | --- |
| [<T>valueOf(Class<T> arg0, String arg1)](#-T-valueOf-java.lang.Class-T--java.lang.String-) |  |
| [compareTo(E arg0)](#compareTo-E-) |  |
| [describeConstable()](#describeConstable--) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDeclaringClass()](#getDeclaringClass--) |  |
| [hashCode()](#hashCode--) |  |
| [name()](#name--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [ordinal()](#ordinal--) |  |
| [toString()](#toString--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
| [values()](#values--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### AntiAlias {#AntiAlias}
```
public static final TextRenderingHint AntiAlias
```


Cada carácter se dibuja usando su mapa de bits de glifo antialias sin hinting. Mejor calidad debido al antialias. Las diferencias de ancho de los trazos pueden ser perceptibles porque el hinting está desactivado.

### AntiAliasGridFit {#AntiAliasGridFit}
```
public static final TextRenderingHint AntiAliasGridFit
```


Cada carácter se dibuja usando su mapa de bits de glifo antialias con hinting. Mucha mejor calidad debido al antialias, pero con un mayor costo de rendimiento.

### ClearTypeGridFit {#ClearTypeGridFit}
```
public static final TextRenderingHint ClearTypeGridFit
```


Cada carácter se dibuja usando su mapa de bits de glifo ClearType con hinting. La configuración de mayor calidad. Se usa para aprovechar las características de fuente ClearType.

### SingleBitPerPixel {#SingleBitPerPixel}
```
public static final TextRenderingHint SingleBitPerPixel
```


Cada carácter se dibuja usando su mapa de bits de glifo. No se usa hinting.

### SingleBitPerPixelGridFit {#SingleBitPerPixelGridFit}
```
public static final TextRenderingHint SingleBitPerPixelGridFit
```


Cada carácter se dibuja usando su mapa de bits de glifo. Se usa hinting para mejorar la apariencia del carácter en trazos y curvaturas.

### SystemDefault {#SystemDefault}
```
public static final TextRenderingHint SystemDefault
```


Cada carácter se dibuja usando su mapa de bits de glifo, con la sugerencia de renderizado predeterminada del sistema. El texto se dibujará usando cualquier configuración de suavizado de fuentes que el usuario haya seleccionado para el sistema.

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | java.lang.Class<T> |  |
| arg1 | java.lang.String |  |

**Returns:**
T
### compareTo(E arg0) {#compareTo-E-}
```
public final int compareTo(E arg0)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | E |  |

**Returns:**
int
### describeConstable() {#describeConstable--}
```
public final Optional<Enum.EnumDesc<E>> describeConstable()
```




**Returns:**
java.util.Optional<java.lang.Enum.EnumDesc<E>>
### equals(Object arg0) {#equals-java.lang.Object-}
```
public final boolean equals(Object arg0)
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
### getDeclaringClass() {#getDeclaringClass--}
```
public final Class<E> getDeclaringClass()
```




**Returns:**
java.lang.Class<E>
### hashCode() {#hashCode--}
```
public final int hashCode()
```




**Returns:**
int
### name() {#name--}
```
public final String name()
```




**Returns:**
java.lang.String
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### ordinal() {#ordinal--}
```
public final int ordinal()
```




**Returns:**
int
### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static TextRenderingHint valueOf(String name)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| name | java.lang.String |  |

**Returns:**
[TextRenderingHint](../../com.aspose.xps.rendering/textrenderinghint)
### values() {#values--}
```
public static TextRenderingHint[] values()
```




**Returns:**
com.aspose.xps.rendering.TextRenderingHint[]
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

