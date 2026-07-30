---
title: "Fuente"
second_title: "Referencia de API de Aspose.Font para Java"
description: "Representa la clase base Font."
type: docs
weight: 32
url: /es/java/com.aspose.font/font/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IFont](../../com.aspose.font/ifont), [com.aspose.font.IGlyphAccessor](../../com.aspose.font/iglyphaccessor), [com.aspose.font.IFontSaver](../../com.aspose.font/ifontsaver)
```
public abstract class Font implements IFont, IGlyphAccessor, IFontSaver
```

Representa la clase base Font.
## Métodos

| Método | Descripción |
| --- | --- |
| [convert(FontType fontType)](#convert-com.aspose.font.FontType-) | Convierte la fuente a otro formato. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAllGlyphIds()](#getAllGlyphIds--) | Devuelve todos los IDs de glifos disponibles en la fuente. |
| [getClass()](#getClass--) |  |
| [getEncoding()](#getEncoding--) | Obtiene la codificación de la fuente. |
| [getFontDefinition()](#getFontDefinition--) | Obtiene la definición de la fuente. |
| [getFontFamily()](#getFontFamily--) | Obtiene la familia de la fuente. |
| [getFontName()](#getFontName--) | Obtiene el nombre del estilo de la fuente. |
| [getFontNames()](#getFontNames--) | Obtiene los nombres de la fuente. |
| [getFontSaver()](#getFontSaver--) | Obtiene la funcionalidad de guardado de la fuente. |
| [getFontStyle()](#getFontStyle--) | Obtiene el estilo de la fuente. |
| [getFontType()](#getFontType--) | Obtiene el tipo de la fuente. |
| [getGlyphAccessor()](#getGlyphAccessor--) | Accesor de glifos de la fuente. |
| [getGlyphById(GlyphId id)](#getGlyphById-com.aspose.font.GlyphId-) | Devuelve el glifo por Id de glifo. |
| [getGlyphIdType()](#getGlyphIdType--) | Especificación del tipo de id de glifo. |
| [getGlyphsForText(String text)](#getGlyphsForText-java.lang.String-) | Obtiene la representación de glifos para texto. |
| [getMetrics()](#getMetrics--) | Obtiene las métricas de la fuente. |
| [getNumGlyphs()](#getNumGlyphs--) | Obtiene el número de glifos en la Fuente. |
| [getPostscriptNames()](#getPostscriptNames--) | Obtiene los nombres de fuentes PostScript. |
| [getStyle()](#getStyle--) | Obtiene el estilo de la fuente. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [open(FontDefinition fontDefinition)](#open-com.aspose.font.FontDefinition-) | Abre una fuente, usando el objeto FontDefinition. |
| [open(FontType fontType, byte[] fontData)](#open-com.aspose.font.FontType-byte---) | Abre una fuente, usando el tipo de fuente y la matriz de bytes de datos de fuente. |
| [open(FontType fontType, StreamSource fontStreamSource)](#open-com.aspose.font.FontType-com.aspose.font.StreamSource-) | Abre una fuente, usando el tipo de fuente y la fuente de flujo. |
| [open(FontType fontType, String fileName)](#open-com.aspose.font.FontType-java.lang.String-) | Abre una fuente, usando el tipo de fuente y el nombre de archivo de fuente. |
| [save(OutputStream stream)](#save-java.io.OutputStream-) | Guarda la Fuente en el formato original. |
| [save(String fileName)](#save-java.lang.String-) | Guarda la Fuente en el formato original. |
| [saveToFormat(OutputStream stream, FontSavingFormats outFormat)](#saveToFormat-java.io.OutputStream-com.aspose.font.FontSavingFormats-) | Guarda la Fuente en el formato especificado. |
| [setFontFamily(String value)](#setFontFamily-java.lang.String-) | Establece la familia de la Fuente. |
| [setFontName(String value)](#setFontName-java.lang.String-) | Establece el nombre de la cara de la Fuente. |
| [setStyle(String value)](#setStyle-java.lang.String-) | Establece el estilo de la Fuente. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### convert(FontType fontType) {#convert-com.aspose.font.FontType-}
```
public abstract Font convert(FontType fontType)
```


Convierte la fuente a otro formato.

--------------------

> ```
> Note: TTF Font type is now supported only.
> ```

fontType Tipo de formato de fuente al que convertir.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) |  |

**Returns:**
[Font](../../com.aspose.font/font) - Font converted into new format.
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
### getAllGlyphIds() {#getAllGlyphIds--}
```
public abstract GlyphId[] getAllGlyphIds()
```


Devuelve todos los IDs de glifos disponibles en la fuente. El ID de glifo es un número único para un glifo, que depende del tipo de fuente. Por ejemplo: el ID de Type1 es un nombre de glifo, instancia de la clase ( GlyphStringId ). El ID de TTF es un índice entero, instancia de la clase ( GlyphInt32Id ).

**Returns:**
com.aspose.font.GlyphId[] - Identificadores de glifos.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getEncoding() {#getEncoding--}
```
public abstract IFontEncoding getEncoding()
```


Obtiene la codificación de la fuente.

**Returns:**
[IFontEncoding](../../com.aspose.font/ifontencoding) - Font encoding.
### getFontDefinition() {#getFontDefinition--}
```
public abstract FontDefinition getFontDefinition()
```


Obtiene la definición de la fuente.

**Returns:**
[FontDefinition](../../com.aspose.font/fontdefinition) - Font definition.
### getFontFamily() {#getFontFamily--}
```
public abstract String getFontFamily()
```


Obtiene la familia de la fuente.

**Returns:**
java.lang.String - Familia de la Fuente.
### getFontName() {#getFontName--}
```
public abstract String getFontName()
```


Obtiene el nombre del estilo de la fuente.

**Returns:**
java.lang.String - Nombre de la cara de la Fuente.
### getFontNames() {#getFontNames--}
```
public abstract MultiLanguageString getFontNames()
```


Obtiene los nombres de la fuente.

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Font names.
### getFontSaver() {#getFontSaver--}
```
public IFontSaver getFontSaver()
```


Obtiene la funcionalidad de guardado de la fuente.

**Returns:**
[IFontSaver](../../com.aspose.font/ifontsaver) - Font save functionality.
### getFontStyle() {#getFontStyle--}
```
public abstract int getFontStyle()
```


Obtiene el estilo de la Fuente. Este es un valor calculado y representado en tipo generalizado.

**Returns:**
int - Estilo de la Fuente. Normalmente, una combinación de valores de bandera constante de la clase FontStyle o 0.
### getFontType() {#getFontType--}
```
public abstract FontType getFontType()
```


Obtiene el tipo de la fuente.

--------------------

> ```
> Type1, TrueType etc.
> ```

**Returns:**
[FontType](../../com.aspose.font/fonttype) - Font type.
### getGlyphAccessor() {#getGlyphAccessor--}
```
public IGlyphAccessor getGlyphAccessor()
```


Accesor de glifos de fuente. Recupera glifos e identificadores de glifos.

**Returns:**
[IGlyphAccessor](../../com.aspose.font/iglyphaccessor) - Font glyph accessor.
### getGlyphById(GlyphId id) {#getGlyphById-com.aspose.font.GlyphId-}
```
public abstract Glyph getGlyphById(GlyphId id)
```


Devuelve el glifo por ID de glifo. El ID de glifo es un número único para un glifo, que depende del tipo de fuente. GlyphId - objeto derivado. Por ejemplo: el ID de Type1 es un nombre de glifo, instancia de la clase ( GlyphStringId ). El ID de TTF es un índice entero, instancia de la clase ( GlyphInt32Id ).

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| id | [GlyphId](../../com.aspose.font/glyphid) | Id de glifo. |

**Returns:**
[Glyph](../../com.aspose.font/glyph) - Glyph.
### getGlyphIdType() {#getGlyphIdType--}
```
public abstract GlyphIdType getGlyphIdType()
```


Especificación del tipo de ID de glifo. Para los consumidores que necesitan conocer el tipo real de 'bytes[]'.

**Returns:**
[GlyphIdType](../../com.aspose.font/glyphidtype) - Id type specification
### getGlyphsForText(String text) {#getGlyphsForText-java.lang.String-}
```
public GlyphId[] getGlyphsForText(String text)
```


Obtiene la representación de glifos para texto.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| text | java.lang.String | Texto de entrada. |

**Returns:**
com.aspose.font.GlyphId[] - matriz de GlyphId.
### getMetrics() {#getMetrics--}
```
public abstract IFontMetrics getMetrics()
```


Obtiene las métricas de la fuente.

**Returns:**
[IFontMetrics](../../com.aspose.font/ifontmetrics) - Font metrics.
### getNumGlyphs() {#getNumGlyphs--}
```
public abstract int getNumGlyphs()
```


Obtiene el número de glifos en la Fuente.

**Returns:**
int - Número de glifos en la fuente.
### getPostscriptNames() {#getPostscriptNames--}
```
public abstract MultiLanguageString getPostscriptNames()
```


Obtiene los nombres de fuentes PostScript.

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Postscript font names.
### getStyle() {#getStyle--}
```
public abstract String getStyle()
```


Obtiene el estilo de la fuente. Este es un valor de cadena sin procesar proporcionado por el archivo de fuente.

**Returns:**
java.lang.String - Estilo de la fuente.
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
public static Font open(FontDefinition fontDefinition)
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
public static Font open(FontType fontType, byte[] fontData)
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
public static Font open(FontType fontType, StreamSource fontStreamSource)
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
public static Font open(FontType fontType, String fileName)
```


Abre una fuente, usando el tipo de fuente y el nombre de archivo de fuente.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Tipo de fuente. |
| fileName | java.lang.String | Nombre del archivo de fuente. |

**Returns:**
[Font](../../com.aspose.font/font) - Font loaded.
### save(OutputStream stream) {#save-java.io.OutputStream-}
```
public void save(OutputStream stream)
```


Guarda la Fuente en el formato original.

--------------------

> ```
> Note: following Font types are supported for saving:
>  New TTF fonts;
>  TTF Font subsets;
>  CFF Font subsets;
>  Type1 Font subsets.
> ```

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| flujo | java.io.OutputStream | Flujo para guardar la fuente. |

### save(String fileName) {#save-java.lang.String-}
```
public void save(String fileName)
```


Guarda la Fuente en el formato original.

--------------------

> ```
> Note: following Font types are supported for saving:
>  New TTF fonts;
>  TTF Font subsets;
>  CFF Font subsets;
>  Type1 Font subsets.
> ```

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| fileName | java.lang.String | Archivo para guardar la fuente. |

### saveToFormat(OutputStream stream, FontSavingFormats outFormat) {#saveToFormat-java.io.OutputStream-com.aspose.font.FontSavingFormats-}
```
public void saveToFormat(OutputStream stream, FontSavingFormats outFormat)
```


Guarda la Fuente en el formato especificado.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| flujo | java.io.OutputStream | flujo para guardar la fuente |
| outFormat | [FontSavingFormats](../../com.aspose.font/fontsavingformats) | formato deseado |

### setFontFamily(String value) {#setFontFamily-java.lang.String-}
```
public abstract void setFontFamily(String value)
```


Establece la familia de la Fuente.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| valor | java.lang.String | Nueva familia de fuente. |

### setFontName(String value) {#setFontName-java.lang.String-}
```
public abstract void setFontName(String value)
```


Establece el nombre de la cara de la Fuente.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| valor | java.lang.String | Nuevo nombre de la cara de fuente. |

### setStyle(String value) {#setStyle-java.lang.String-}
```
public abstract void setStyle(String value)
```


Establece el estilo de fuente. Este es un valor de cadena cruda proporcionado por el archivo de fuente.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| valor | java.lang.String | Nuevo estilo de fuente. |

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

