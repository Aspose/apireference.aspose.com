---
title: "FontCharactersMerger"
second_title: "Referencia de API de Aspose.Font para Java"
description: "Declara la funcionalidad para combinar fuentes de diferentes tipos."
type: docs
weight: 35
url: /es/java/com.aspose.font/fontcharactersmerger/
---
**Inheritance:**
java.lang.Object
```
public abstract class FontCharactersMerger
```

Declara la funcionalidad para combinar fuentes de diferentes tipos. Se necesita un par de fuentes para la operación de combinación. Una fuente de este par se considera primaria. Esto significa que muchas características relacionadas con la fuente combinada final, como métricas, estructura de codificación y otras, se tomarán de esta fuente primaria. La otra fuente del par (secundaria) proporciona solo glifos para la fuente combinada final.
## Métodos

| Método | Descripción |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getPrimaryFont()](#getPrimaryFont--) | Obtiene la fuente primaria. |
| [getSecondaryFont()](#getSecondaryFont--) | Obtiene la fuente secundaria. |
| [hashCode()](#hashCode--) |  |
| [mergeFonts(GlyphId[] primaryFontGlyphs, GlyphId[] secondaryFontGlyphs, String newFontName)](#mergeFonts-com.aspose.font.GlyphId---com.aspose.font.GlyphId---java.lang.String-) | Fusiona fuentes basándose en las listas de glifos proporcionadas. |
| [mergeFonts(int[] primaryFontCharCodes, int[] secondaryFontCharCodes, String newFontName)](#mergeFonts-int---int---java.lang.String-) | Fusiona fuentes basándose en las listas de códigos de caracteres proporcionadas. |
| [mergeFonts(Map<Integer,GlyphId> primaryFontDict, Map<Integer,GlyphId> secondaryFontDict, String newFontName)](#mergeFonts-java.util.Map-java.lang.Integer-com.aspose.font.GlyphId--java.util.Map-java.lang.Integer-com.aspose.font.GlyphId--java.lang.String-) | Esta versión del método está diseñada para casos en los que deseas establecer códigos de caracteres para los glifos en la fuente resultante de forma explícita. |
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
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getPrimaryFont() {#getPrimaryFont--}
```
public abstract Font getPrimaryFont()
```


Obtiene la fuente primaria.

**Returns:**
[Font](../../com.aspose.font/font) - The primary font.
### getSecondaryFont() {#getSecondaryFont--}
```
public abstract Font getSecondaryFont()
```


Obtiene la fuente secundaria.

**Returns:**
[Font](../../com.aspose.font/font) - The secondary font.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### mergeFonts(GlyphId[] primaryFontGlyphs, GlyphId[] secondaryFontGlyphs, String newFontName) {#mergeFonts-com.aspose.font.GlyphId---com.aspose.font.GlyphId---java.lang.String-}
```
public abstract Font mergeFonts(GlyphId[] primaryFontGlyphs, GlyphId[] secondaryFontGlyphs, String newFontName)
```


Fusiona fuentes basándose en las listas de glifos proporcionadas. Busca un código de carácter para cada glifo proporcionado y añade el código de carácter encontrado con el glifo correspondiente en la nueva fuente resultante.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| primaryFontGlyphs | [GlyphId\[\]](../../com.aspose.font/glyphid) | Lista de glifos a tomar de la fuente primaria. |
| secondaryFontGlyphs | [GlyphId\[\]](../../com.aspose.font/glyphid) | Lista de glifos a tomar de la fuente secundaria. |
| newFontName | java.lang.String | Nombre deseado para la fuente resultante. |

**Returns:**
[Font](../../com.aspose.font/font) - Merged font
### mergeFonts(int[] primaryFontCharCodes, int[] secondaryFontCharCodes, String newFontName) {#mergeFonts-int---int---java.lang.String-}
```
public abstract Font mergeFonts(int[] primaryFontCharCodes, int[] secondaryFontCharCodes, String newFontName)
```


Fusiona fuentes basándose en las listas de códigos de caracteres proporcionadas. Para crear la fuente resultante deseada, simplemente pasa los códigos de símbolos de las fuentes originales que deseas incluir en la fuente resultante. Los glifos relacionados con los códigos proporcionados se encontrarán automáticamente. Por ejemplo, si deseas incluir glifos relacionados con las letras A y B de la primera fuente y glifos relacionados con las letras C y D de la segunda fuente, simplemente llama a este método así: `mergeFonts(new uint[] { 'A', 'B' }, new uint[] { 'C', 'D' }, "NewFont")`

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| primaryFontCharCodes | int[] | Códigos a tomar de la fuente primaria. |
| secondaryFontCharCodes | int[] | Códigos a tomar de la fuente secundaria. |
| newFontName | java.lang.String | Nombre deseado para la fuente resultante. |

**Returns:**
[Font](../../com.aspose.font/font) - Merged font.
### mergeFonts(Map<Integer,GlyphId> primaryFontDict, Map<Integer,GlyphId> secondaryFontDict, String newFontName) {#mergeFonts-java.util.Map-java.lang.Integer-com.aspose.font.GlyphId--java.util.Map-java.lang.Integer-com.aspose.font.GlyphId--java.lang.String-}
```
public abstract Font mergeFonts(Map<Integer,GlyphId> primaryFontDict, Map<Integer,GlyphId> secondaryFontDict, String newFontName)
```


Esta versión del método está diseñada para casos en los que deseas establecer códigos de caracteres para los glifos en la fuente resultante de forma explícita. No es obligatorio que el código del glifo que proporcionaste esté incluido en la fuente original. El propósito del código pasado es que se asocie con el identificador de glifo correspondiente en la fuente resultante. Por lo tanto, la regla para procesar cada par pasado mediante el parámetro de diccionario [código, identificador de glifo] es que solo se tomará el identificador de glifo de la fuente original y luego se vinculará con el código correspondiente en la fuente resultante. Esto puede ser útil cuando algunos códigos de la primera fuente entran en conflicto con los mismos códigos de la segunda fuente.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| primaryFontDict | java.util.Map<java.lang.Integer,com.aspose.font.GlyphId> | Diccionario con pares [código de símbolo, identificador de glifo] de la fuente primaria. |
| secondaryFontDict | java.util.Map<java.lang.Integer,com.aspose.font.GlyphId> | Diccionario con pares [código de símbolo, identificador de glifo] de la fuente secundaria. |
| newFontName | java.lang.String | Nombre deseado para la fuente resultante. |

**Returns:**
[Font](../../com.aspose.font/font) - Merged font.
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

