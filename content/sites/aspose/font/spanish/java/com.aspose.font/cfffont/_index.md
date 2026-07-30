---
title: "CffFont"
second_title: "Referencia de API de Aspose.Font para Java"
description: "Representa Compact Font Format CFF."
type: docs
weight: 19
url: /es/java/com.aspose.font/cfffont/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.Font](../../com.aspose.font/font)
```
public class CffFont extends Font
```

Representa Compact Font Format (CFF).
## Métodos

| Método | Descripción |
| --- | --- |
| [convert(FontType fontType)](#convert-com.aspose.font.FontType-) | Convierte la fuente a otro formato. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAllGlyphIds()](#getAllGlyphIds--) | Devuelve una matriz de todos los identificadores de glifos disponibles en la fuente. |
| [getClass()](#getClass--) |  |
| [getCommonFontsSettings()](#getCommonFontsSettings--) | Obtiene la configuración común a las fuentes CFF. |
| [getEncoding()](#getEncoding--) | Obtiene la codificación de la fuente. |
| [getFontDefinition()](#getFontDefinition--) | Obtiene la definición de la fuente. |
| [getFontFamily()](#getFontFamily--) | Obtiene la familia de la fuente. |
| [getFontName()](#getFontName--) | Obtiene el nombre del estilo de la fuente. |
| [getFontNames()](#getFontNames--) | Obtiene los nombres de la fuente. |
| [getFontSaver()](#getFontSaver--) | Obtiene la funcionalidad de guardado de la fuente. |
| [getFontStyle()](#getFontStyle--) | Obtiene el estilo de la fuente. |
| [getFontType()](#getFontType--) | Obtiene el tipo de la fuente. |
| [getGlyphAccessor()](#getGlyphAccessor--) | Accesor de glifos de la fuente. |
| [getGlyphById(GlyphId id)](#getGlyphById-com.aspose.font.GlyphId-) | Devuelve el glifo por su identificador. |
| [getGlyphById(String glyphName)](#getGlyphById-java.lang.String-) | Devuelve el glifo por su nombre. |
| [getGlyphById(long id)](#getGlyphById-long-) | Devuelve el glifo por su identificador. |
| [getGlyphIdType()](#getGlyphIdType--) | Obtiene la especificación del tipo de identificador de glifo. |
| [getGlyphsForText(String text)](#getGlyphsForText-java.lang.String-) | Obtiene la representación de glifos para texto. |
| [getIndexDataProvider(CffIndexProviderType indexType)](#getIndexDataProvider-com.aspose.font.CffIndexProviderType-) | Obtiene el proveedor para el tipo de estructura CFF INDEX especificado. |
| [getMetrics()](#getMetrics--) | Obtiene las métricas de la fuente. |
| [getNumGlyphs()](#getNumGlyphs--) | Obtiene el número de glifos en la Fuente. |
| [getPostscriptNames()](#getPostscriptNames--) | Obtiene los nombres de fuente PostScript. |
| [getStyle()](#getStyle--) | Obtiene el estilo de la fuente. |
| [getTopDictDataProvider()](#getTopDictDataProvider--) |  |
| [hashCode()](#hashCode--) |  |
| [isCidKeyedFont()](#isCidKeyedFont--) | Obtiene el valor que indica que la fuente está indexada por CID. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [open(FontDefinition fontDefinition)](#open-com.aspose.font.FontDefinition-) | Abre una fuente, usando el objeto FontDefinition. |
| [open(FontType fontType, byte[] fontData)](#open-com.aspose.font.FontType-byte---) | Abre una fuente, usando el tipo de fuente y la matriz de bytes de datos de fuente. |
| [open(FontType fontType, StreamSource fontStreamSource)](#open-com.aspose.font.FontType-com.aspose.font.StreamSource-) | Abre una fuente, usando el tipo de fuente y la fuente de flujo. |
| [open(FontType fontType, String fileName)](#open-com.aspose.font.FontType-java.lang.String-) | Abre una fuente, usando el tipo de fuente y el nombre de archivo de fuente. |
| [save(OutputStream stream)](#save-java.io.OutputStream-) | Guarda la Fuente en el formato original. |
| [save(String fileName)](#save-java.lang.String-) | Guarda la Fuente en el formato original. |
| [saveToFormat(OutputStream stream, FontSavingFormats outFormat)](#saveToFormat-java.io.OutputStream-com.aspose.font.FontSavingFormats-) | Guarda la Fuente en el formato especificado. |
| [setCommonFontsSettings(CffFontsSettings value)](#setCommonFontsSettings-com.aspose.font.CffFontsSettings-) | Especifica la configuración común a las fuentes CFF. |
| [setFontFamily(String value)](#setFontFamily-java.lang.String-) | El setter de la familia de fuentes no está implementado aún. |
| [setFontName(String value)](#setFontName-java.lang.String-) | El setter del nombre de la cara de fuente no está implementado aún. |
| [setStyle(String value)](#setStyle-java.lang.String-) | El setter de estilo no está implementado aún. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### convert(FontType fontType) {#convert-com.aspose.font.FontType-}
```
public Font convert(FontType fontType)
```


Convierte la Fuente a otro formato. Nota: el tipo de Fuente TTF ahora solo es compatible.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Tipo de formato de fuente al que convertir. |

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
public GlyphId[] getAllGlyphIds()
```


Devuelve una matriz de todos los ids de glifos disponibles en la fuente. El id de glifo es un número único para un glifo, que depende del tipo de fuente. El id de glifo de una fuente CFF puede ser una instancia de la clase ( GlyphStringId ) o de la clase ( GlyphUInt32Id ).

**Returns:**
com.aspose.font.GlyphId[]
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getCommonFontsSettings() {#getCommonFontsSettings--}
```
public CffFontsSettings getCommonFontsSettings()
```


Obtiene la configuración común a las fuentes CFF. Estas configuraciones se utilizan en diferentes escenarios y pueden cambiarse para cada fuente individual.

**Returns:**
[CffFontsSettings](../../com.aspose.font/cfffontssettings) - Font definition.
### getEncoding() {#getEncoding--}
```
public IFontEncoding getEncoding()
```


Obtiene la codificación de la fuente.

**Returns:**
[IFontEncoding](../../com.aspose.font/ifontencoding) - Font encoding.
### getFontDefinition() {#getFontDefinition--}
```
public FontDefinition getFontDefinition()
```


Obtiene la definición de la fuente.

**Returns:**
[FontDefinition](../../com.aspose.font/fontdefinition) - Font definition.
### getFontFamily() {#getFontFamily--}
```
public String getFontFamily()
```


Obtiene la familia de la fuente.

**Returns:**
java.lang.String - Familia de la Fuente.
### getFontName() {#getFontName--}
```
public String getFontName()
```


Obtiene el nombre del estilo de la fuente.

**Returns:**
java.lang.String - Nombre de la cara de la Fuente.
### getFontNames() {#getFontNames--}
```
public MultiLanguageString getFontNames()
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
public int getFontStyle()
```


Obtiene el estilo de la Fuente. Este es un valor calculado y representado en tipo generalizado.

**Returns:**
int - Estilo de la Fuente. Normalmente, una combinación de valores de bandera constante de la clase FontStyle o 0.
### getFontType() {#getFontType--}
```
public FontType getFontType()
```


Obtiene el tipo de fuente. Devuelve el valor FontType.CFF.

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
public Glyph getGlyphById(GlyphId id)
```


Devuelve el glifo por su id. El id de glifo es un número único para un glifo, que depende del tipo de fuente. El id de glifo de una fuente CFF puede ser una instancia de la clase ( GlyphStringId ) o de la clase ( GlyphInt32Id ).

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| id | [GlyphId](../../com.aspose.font/glyphid) | Id de glifo. |

**Returns:**
[Glyph](../../com.aspose.font/glyph) - Glyph.
### getGlyphById(String glyphName) {#getGlyphById-java.lang.String-}
```
public Glyph getGlyphById(String glyphName)
```


Devuelve el glifo por su nombre.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| glyphName | java.lang.String | Nombre del glifo. |

**Returns:**
[Glyph](../../com.aspose.font/glyph) - Glyph.
### getGlyphById(long id) {#getGlyphById-long-}
```
public Glyph getGlyphById(long id)
```


Devuelve el glifo por su identificador.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| id | long | Id de glifo. |

**Returns:**
[Glyph](../../com.aspose.font/glyph) - Glyph.
### getGlyphIdType() {#getGlyphIdType--}
```
public GlyphIdType getGlyphIdType()
```


Obtiene la especificación del tipo de identificador de glifo.

**Returns:**
[GlyphIdType](../../com.aspose.font/glyphidtype) - Glyph id type specification.
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
### getIndexDataProvider(CffIndexProviderType indexType) {#getIndexDataProvider-com.aspose.font.CffIndexProviderType-}
```
public ICffIndexDataProvider getIndexDataProvider(CffIndexProviderType indexType)
```


Obtiene el proveedor para el tipo de estructura CFF INDEX especificado.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| indexType | [CffIndexProviderType](../../com.aspose.font/cffindexprovidertype) | Tipo de estructura INDEX. |

**Returns:**
[ICffIndexDataProvider](../../com.aspose.font/icffindexdataprovider) - Implementation of ( ICffIndexDataProvider ) interface.
### getMetrics() {#getMetrics--}
```
public IFontMetrics getMetrics()
```


Obtiene las métricas de la fuente.

**Returns:**
[IFontMetrics](../../com.aspose.font/ifontmetrics) - Font metrics.
### getNumGlyphs() {#getNumGlyphs--}
```
public int getNumGlyphs()
```


Obtiene el número de glifos en la Fuente.

**Returns:**
int - Número de glifos en la fuente.
### getPostscriptNames() {#getPostscriptNames--}
```
public MultiLanguageString getPostscriptNames()
```


Obtiene los nombres de fuente PostScript.

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Postscript Font names.
### getStyle() {#getStyle--}
```
public String getStyle()
```


Obtiene el estilo de la fuente. Este es un valor de cadena sin procesar proporcionado por el archivo de fuente.

**Returns:**
java.lang.String - Estilo de la fuente.
### getTopDictDataProvider() {#getTopDictDataProvider--}
```
public TopDictDataProvider getTopDictDataProvider()
```




**Returns:**
[TopDictDataProvider](../../com.aspose.font/topdictdataprovider)
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isCidKeyedFont() {#isCidKeyedFont--}
```
public boolean isCidKeyedFont()
```


Obtiene el valor que indica que la fuente está indexada por CID.

**Returns:**
boolean - Valor que indica que la fuente está indexada por CID.
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

### setCommonFontsSettings(CffFontsSettings value) {#setCommonFontsSettings-com.aspose.font.CffFontsSettings-}
```
public void setCommonFontsSettings(CffFontsSettings value)
```


Especifica la configuración común a las fuentes CFF.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | [CffFontsSettings](../../com.aspose.font/cfffontssettings) | Definición de fuente. |

### setFontFamily(String value) {#setFontFamily-java.lang.String-}
```
public void setFontFamily(String value)
```


El setter de la familia de fuentes no está implementado aún.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| valor | java.lang.String | Nueva familia de fuente. |

### setFontName(String value) {#setFontName-java.lang.String-}
```
public void setFontName(String value)
```


El setter del nombre de la cara de fuente no está implementado aún.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| valor | java.lang.String | Nuevo nombre de la cara de fuente. |

### setStyle(String value) {#setStyle-java.lang.String-}
```
public void setStyle(String value)
```


El setter de estilo no está implementado aún.

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

