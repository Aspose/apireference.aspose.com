---
title: "GlyphId"
second_title: "Referencia de API de Aspose.Font para Java"
description: "Representa los IDs de glifo disponibles en la fuente."
type: docs
weight: 50
url: /es/java/com.aspose.font/glyphid/
---
**Inheritance:**
java.lang.Object
```
public abstract class GlyphId
```

Representa los IDs de glifo, disponibles en la fuente. El ID de glifo es un número único para un glifo, que depende del tipo de fuente. Por ejemplo: el ID de Type1 es un nombre de glifo, instancia de la clase ( GlyphStringId ). El ID de TTF es un índice entero, instancia de la clase ( GlyphUInt32Id ).
## Métodos

| Método | Descripción |
| --- | --- |
| [equals(Object obj)](#equals-java.lang.Object-) | Devuelve verdadero si dos ID de glifo no son iguales. |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) | Devuelve el código hash del objeto. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [op_Equality(GlyphId obj1, Object obj2)](#op-Equality-com.aspose.font.GlyphId-java.lang.Object-) | Devuelve verdadero si dos ID de glifo son iguales. |
| [op_Inequality(GlyphId obj1, Object obj2)](#op-Inequality-com.aspose.font.GlyphId-java.lang.Object-) | Devuelve verdadero si dos ID de glifo no son iguales. |
| [toGlyphStringId()](#toGlyphStringId--) | Conversión virtual a GlyphStringId. |
| [toGlyphUInt32Id()](#toGlyphUInt32Id--) | Conversión virtual a GlyphUInt32Id. |
| [toString()](#toString--) | Devuelve la representación en cadena del ID de glifo. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Devuelve verdadero si dos ID de glifo no son iguales.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| obj | java.lang.Object | Identificador de glifo para comparar. |

**Returns:**
boolean - Resultado de la comparación.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### hashCode() {#hashCode--}
```
public abstract int hashCode()
```


Devuelve el código hash del objeto.

**Returns:**
int - Código hash del objeto.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### op_Equality(GlyphId obj1, Object obj2) {#op-Equality-com.aspose.font.GlyphId-java.lang.Object-}
```
public static boolean op_Equality(GlyphId obj1, Object obj2)
```


Devuelve verdadero si dos ID de glifo son iguales.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| obj1 | [GlyphId](../../com.aspose.font/glyphid) | Primer identificador de glifo para comparar. |
| obj2 | java.lang.Object | Segundo identificador de glifo para comparar. |

**Returns:**
boolean - Resultado de la comparación.
### op_Inequality(GlyphId obj1, Object obj2) {#op-Inequality-com.aspose.font.GlyphId-java.lang.Object-}
```
public static boolean op_Inequality(GlyphId obj1, Object obj2)
```


Devuelve verdadero si dos ID de glifo no son iguales.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| obj1 | [GlyphId](../../com.aspose.font/glyphid) | Primer identificador de glifo para comparar. |
| obj2 | java.lang.Object | Segundo identificador de glifo para comparar. |

**Returns:**
boolean - Resultado de la comparación.
### toGlyphStringId() {#toGlyphStringId--}
```
public GlyphStringId toGlyphStringId()
```


Conversión virtual a GlyphStringId. GlyphStringId sobrescribe para devolver la instancia.

**Returns:**
[GlyphStringId](../../com.aspose.font/glyphstringid) - null
### toGlyphUInt32Id() {#toGlyphUInt32Id--}
```
public GlyphUInt32Id toGlyphUInt32Id()
```


Conversión virtual a GlyphUInt32Id. GlyphUInt32Id sobrescribe para devolver la instancia.

**Returns:**
[GlyphUInt32Id](../../com.aspose.font/glyphuint32id) - null
### toString() {#toString--}
```
public abstract String toString()
```


Devuelve la representación en cadena del ID de glifo.

**Returns:**
java.lang.String - identificador de glifo
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

