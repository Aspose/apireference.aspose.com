---
title: "Type1MetricFont"
second_title: "Referencia de API de Aspose.Font para Java"
description: "Implementación de fuente métrica Type1."
type: docs
weight: 117
url: /es/java/com.aspose.font/type1metricfont/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.Font](../../com.aspose.font/font), [com.aspose.font.Type1Font](../../com.aspose.font/type1font)
```
public class Type1MetricFont extends Type1Font
```

Implementación de fuente tipográfica Type1. Esta fuente type1 se crea solo usando métricas. Las funciones de recuperación de glifos y algunas otras que requieren una fuente real no están permitidas; las funciones no permitidas lanzan la excepción Type1NotSupportedException. Otras propiedades (FontName, Weight, Metrics y Encoding) se obtienen del archivo de métricas.

--------------------

> ```
> Note: If metrics file defines Encoding as "FontSpecific", user should provide the specific encoding with following way:
>      string[] zapfDingbatsEncoding = new string[256] {null, null, ... , "space", "a1", ...};
>      FontEnvironment.Current.FontSpecificEncodings.RegisterEncoding("ZapfDingbats", zapfDingbatsEncoding);
>  ```
> 
>      System::ArrayPtr<System::String> zapfDingbatsEncoding = System::MakeArray<System::String>({nullptr, nullptr, ..., u"space", u"a1", ...});
>      FontEnvironment::get_Current()->get_FontSpecificEncodings()->RegisterEncoding(u"ZapfDingbats", zapfDingbatsEncoding);
>  
> ```
> ```
## Métodos

| Método | Descripción |
| --- | --- |
| [convert(FontType fontType)](#convert-com.aspose.font.FontType-) | Convierte la fuente a otro formato. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAllGlyphIds()](#getAllGlyphIds--) | Devuelve todos los Ids de glifos, disponibles en el Font. |
| [getClass()](#getClass--) |  |
| [getEncoding()](#getEncoding--) | La codificación se define en el archivo de métricas. |
| [getFontDefinition()](#getFontDefinition--) | Obtiene la definición de la fuente. |
| [getFontFamily()](#getFontFamily--) | Obtiene la familia de la fuente. |
| [getFontName()](#getFontName--) | Obtiene el nombre del Font. |
| [getFontNames()](#getFontNames--) | Obtiene los nombres de la fuente. |
| [getFontSaver()](#getFontSaver--) | Obtiene la funcionalidad de guardado de la fuente. |
| [getFontStyle()](#getFontStyle--) | Obtiene el estilo de la fuente. |
| [getFontType()](#getFontType--) | Obtiene el tipo de la fuente. |
| [getGlyphAccessor()](#getGlyphAccessor--) | Accesor de glifos de la fuente. |
| [getGlyphById(GlyphId id)](#getGlyphById-com.aspose.font.GlyphId-) | Devuelve el glifo por Id de glifo. |
| [getGlyphById(String id)](#getGlyphById-java.lang.String-) | Devuelve el glifo por Id de glifo. |
| [getGlyphById(long id)](#getGlyphById-long-) | Devuelve el glifo por su identificador. |
| [getGlyphIdType()](#getGlyphIdType--) | Especificación del tipo de id de glifo. |
| [getGlyphsForText(String text)](#getGlyphsForText-java.lang.String-) | Obtiene la representación de glifos para texto. |
| [getMetrics()](#getMetrics--) | Obtiene las métricas de la fuente. |
| [getNumGlyphs()](#getNumGlyphs--) | Obtiene el número de glifos en la Fuente. |
| [getPostscriptNames()](#getPostscriptNames--) | Obtiene los nombres de fuente PostScript. |
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


Convierte la fuente a otro formato.

> ```
> Note: TTF Font type is now supported only.
> ```

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


Devuelve todos los Ids de glifos, disponibles en el Font. No compatible con el tipo Type1MetricFont.

**Returns:**
com.aspose.font.GlyphId[] - Todos los identificadores de glifos, disponibles en el Font.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getEncoding() {#getEncoding--}
```
public IFontEncoding getEncoding()
```


La codificación se define en el archivo de métricas. StandardAdobeEncoding: la codificación se rellena automáticamente.

--------------------

> ```
> FontSpecific:
>         user should provide the specific encoding with following way:
>      string[] zapfDingbatsEncoding = new string[256] {null, null, ... , "space", "a1", ...};
>      FontEnvironment.Current.FontSpecificEncodings.RegisterEncoding("ZapfDingbats", zapfDingbatsEncoding);
>  ```
> 
>      System::ArrayPtr<System::String> zapfDingbatsEncoding = System::MakeArray<System::String>({nullptr, nullptr, ..., u"space", u"a1", ...});
>      FontEnvironment::get_Current()->get_FontSpecificEncodings()->RegisterEncoding(u"ZapfDingbats", zapfDingbatsEncoding);
>  
> ```
> ```

**Returns:**
[IFontEncoding](../../com.aspose.font/ifontencoding)
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


Obtiene el nombre del Font.

**Returns:**
java.lang.String - Nombre de fuente.
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
int - Obtiene el estilo del Font. Normalmente, una combinación de valores de bandera constantes de la clase FontStyle o 0.
### getFontType() {#getFontType--}
```
public FontType getFontType()
```


Obtiene el tipo de Fuente. Devuelve el valor FontType.Type1.

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


Devuelve el glifo por Id de glifo. No compatible con el tipo (@code Type1MetricFont\}.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| id | [GlyphId](../../com.aspose.font/glyphid) | Identificador de glifo. |

**Returns:**
[Glyph](../../com.aspose.font/glyph) - Glyph.
### getGlyphById(String id) {#getGlyphById-java.lang.String-}
```
public Glyph getGlyphById(String id)
```


Devuelve el glifo por Id de glifo. No compatible con el tipo (@code Type1MetricFont\}.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| id | java.lang.String | Identificador de glifo. |

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


Especificación del tipo de id de glifo.

**Returns:**
[GlyphIdType](../../com.aspose.font/glyphidtype)
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
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Postscript Font names
### getStyle() {#getStyle--}
```
public String getStyle()
```


Obtiene el estilo de la fuente.

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


El setter Style aún no está implementado. Este es un valor de cadena sin procesar proporcionado por el archivo de Fuente.

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

