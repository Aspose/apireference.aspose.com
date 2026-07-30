---
title: "Font"
second_title: "Riferimento API Aspose.Font per Java"
description: "Rappresenta la classe base Font."
type: docs
weight: 32
url: /it/java/com.aspose.font/font/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IFont](../../com.aspose.font/ifont), [com.aspose.font.IGlyphAccessor](../../com.aspose.font/iglyphaccessor), [com.aspose.font.IFontSaver](../../com.aspose.font/ifontsaver)
```
public abstract class Font implements IFont, IGlyphAccessor, IFontSaver
```

Rappresenta la classe base Font.
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [convert(FontType fontType)](#convert-com.aspose.font.FontType-) | Converte il Font in un altro formato. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAllGlyphIds()](#getAllGlyphIds--) | Restituisce tutti gli ID dei glifi disponibili nel Font. |
| [getClass()](#getClass--) |  |
| [getEncoding()](#getEncoding--) | Ottiene la codifica del Font. |
| [getFontDefinition()](#getFontDefinition--) | Ottiene la definizione del Font. |
| [getFontFamily()](#getFontFamily--) | Ottiene la famiglia del Font. |
| [getFontName()](#getFontName--) | Ottiene il nome del Font face. |
| [getFontNames()](#getFontNames--) | Ottiene i nomi del Font. |
| [getFontSaver()](#getFontSaver--) | Ottiene la funzionalità di salvataggio del Font. |
| [getFontStyle()](#getFontStyle--) | Ottiene lo stile del Font. |
| [getFontType()](#getFontType--) | Ottiene il tipo di Font. |
| [getGlyphAccessor()](#getGlyphAccessor--) | Accessor dei glifi del Font. |
| [getGlyphById(GlyphId id)](#getGlyphById-com.aspose.font.GlyphId-) | Restituisce il glifo per ID glifo. |
| [getGlyphIdType()](#getGlyphIdType--) | Specificazione del tipo di ID glifo. |
| [getGlyphsForText(String text)](#getGlyphsForText-java.lang.String-) | Ottiene la rappresentazione dei glifi per il testo. |
| [getMetrics()](#getMetrics--) | Ottiene le metriche del Font. |
| [getNumGlyphs()](#getNumGlyphs--) | Ottiene il numero di glifi nel Font. |
| [getPostscriptNames()](#getPostscriptNames--) | Ottiene i nomi dei font PostScript. |
| [getStyle()](#getStyle--) | Ottiene lo stile del Font. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [open(FontDefinition fontDefinition)](#open-com.aspose.font.FontDefinition-) | Apre un font, utilizzando l'oggetto FontDefinition. |
| [open(FontType fontType, byte[] fontData)](#open-com.aspose.font.FontType-byte---) | Apre un font, utilizzando il tipo di font e l'array di byte dei dati del font. |
| [open(FontType fontType, StreamSource fontStreamSource)](#open-com.aspose.font.FontType-com.aspose.font.StreamSource-) | Apre un font, utilizzando il tipo di font e la sorgente stream. |
| [open(FontType fontType, String fileName)](#open-com.aspose.font.FontType-java.lang.String-) | Apre un font, utilizzando il tipo di font e il nome del file del font. |
| [save(OutputStream stream)](#save-java.io.OutputStream-) | Salva il Font nel formato originale. |
| [save(String fileName)](#save-java.lang.String-) | Salva il Font nel formato originale. |
| [saveToFormat(OutputStream stream, FontSavingFormats outFormat)](#saveToFormat-java.io.OutputStream-com.aspose.font.FontSavingFormats-) | Salva il Font nel formato specificato. |
| [setFontFamily(String value)](#setFontFamily-java.lang.String-) | Imposta la famiglia del Font. |
| [setFontName(String value)](#setFontName-java.lang.String-) | Imposta il nome del Font face. |
| [setStyle(String value)](#setStyle-java.lang.String-) | Imposta lo stile del Font. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### convert(FontType fontType) {#convert-com.aspose.font.FontType-}
```
public abstract Font convert(FontType fontType)
```


Converte il Font in un altro formato.

--------------------

> ```
> Note: TTF Font type is now supported only.
> ```

fontType Tipo di formato del Font in cui convertire.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) |  |

**Returns:**
[Font](../../com.aspose.font/font) - Font converted into new format.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getAllGlyphIds() {#getAllGlyphIds--}
```
public abstract GlyphId[] getAllGlyphIds()
```


Restituisce tutti gli ID dei glifi disponibili nel Font. L'ID del glifo è un numero unico per un glifo, dipendente dal tipo di font. per esempio: l'ID di Type1 è un nome di glifo, istanza di ( GlyphStringId ) class. L'ID di TTF è un indice intero, istanza di ( GlyphInt32Id ) class.

**Returns:**
com.aspose.font.GlyphId[] - Identificatori dei glifi.
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


Ottiene la codifica del Font.

**Returns:**
[IFontEncoding](../../com.aspose.font/ifontencoding) - Font encoding.
### getFontDefinition() {#getFontDefinition--}
```
public abstract FontDefinition getFontDefinition()
```


Ottiene la definizione del Font.

**Returns:**
[FontDefinition](../../com.aspose.font/fontdefinition) - Font definition.
### getFontFamily() {#getFontFamily--}
```
public abstract String getFontFamily()
```


Ottiene la famiglia del Font.

**Returns:**
java.lang.String - Famiglia del Font.
### getFontName() {#getFontName--}
```
public abstract String getFontName()
```


Ottiene il nome del Font face.

**Returns:**
java.lang.String - Nome del Font face.
### getFontNames() {#getFontNames--}
```
public abstract MultiLanguageString getFontNames()
```


Ottiene i nomi del Font.

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Font names.
### getFontSaver() {#getFontSaver--}
```
public IFontSaver getFontSaver()
```


Ottiene la funzionalità di salvataggio del Font.

**Returns:**
[IFontSaver](../../com.aspose.font/ifontsaver) - Font save functionality.
### getFontStyle() {#getFontStyle--}
```
public abstract int getFontStyle()
```


Ottiene lo stile del Font. Questo è un valore calcolato e rappresentato in tipo generalizzato.

**Returns:**
int - Stile del Font. Di solito, una combinazione di valori di flag costanti della classe FontStyle o 0.
### getFontType() {#getFontType--}
```
public abstract FontType getFontType()
```


Ottiene il tipo di Font.

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


Accessor dei glifi del font. Recupera i glifi e gli identificatori dei glifi.

**Returns:**
[IGlyphAccessor](../../com.aspose.font/iglyphaccessor) - Font glyph accessor.
### getGlyphById(GlyphId id) {#getGlyphById-com.aspose.font.GlyphId-}
```
public abstract Glyph getGlyphById(GlyphId id)
```


Restituisce il glifo per ID glifo. L'ID del glifo è un numero unico per un glifo, dipendente dal tipo di font. GlyphId - oggetto derivato. per esempio: l'ID di Type1 è un nome di glifo, istanza di ( GlyphStringId ) class. L'ID di TTF è un indice intero, istanza di ( GlyphInt32Id ) class.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| id | [GlyphId](../../com.aspose.font/glyphid) | ID glifo. |

**Returns:**
[Glyph](../../com.aspose.font/glyph) - Glyph.
### getGlyphIdType() {#getGlyphIdType--}
```
public abstract GlyphIdType getGlyphIdType()
```


Specificazione del tipo di ID glifo. Per i consumatori che hanno bisogno di conoscere il vero tipo di 'bytes[]'.

**Returns:**
[GlyphIdType](../../com.aspose.font/glyphidtype) - Id type specification
### getGlyphsForText(String text) {#getGlyphsForText-java.lang.String-}
```
public GlyphId[] getGlyphsForText(String text)
```


Ottiene la rappresentazione dei glifi per il testo.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| text | java.lang.String | Testo di input. |

**Returns:**
com.aspose.font.GlyphId[] - array di GlyphId.
### getMetrics() {#getMetrics--}
```
public abstract IFontMetrics getMetrics()
```


Ottiene le metriche del Font.

**Returns:**
[IFontMetrics](../../com.aspose.font/ifontmetrics) - Font metrics.
### getNumGlyphs() {#getNumGlyphs--}
```
public abstract int getNumGlyphs()
```


Ottiene il numero di glifi nel Font.

**Returns:**
int - Numero di glifi nel Font.
### getPostscriptNames() {#getPostscriptNames--}
```
public abstract MultiLanguageString getPostscriptNames()
```


Ottiene i nomi dei font PostScript.

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Postscript font names.
### getStyle() {#getStyle--}
```
public abstract String getStyle()
```


Ottiene lo stile del Font. Questo è un valore stringa grezzo fornito dal file Font.

**Returns:**
java.lang.String - Stile del Font.
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


Apre un font, utilizzando l'oggetto FontDefinition.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fontDefinition | [FontDefinition](../../com.aspose.font/fontdefinition) | Oggetto definizione del Font. |

**Returns:**
[Font](../../com.aspose.font/font) - Font loaded.
### open(FontType fontType, byte[] fontData) {#open-com.aspose.font.FontType-byte---}
```
public static Font open(FontType fontType, byte[] fontData)
```


Apre un font, utilizzando il tipo di font e l'array di byte dei dati del font.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Tipo di Font. |
| fontData | byte[] | Array di byte da cui caricare il font. |

**Returns:**
[Font](../../com.aspose.font/font) - Font loaded.
### open(FontType fontType, StreamSource fontStreamSource) {#open-com.aspose.font.FontType-com.aspose.font.StreamSource-}
```
public static Font open(FontType fontType, StreamSource fontStreamSource)
```


Apre un font, utilizzando il tipo di font e la sorgente stream.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Tipo di Font. |
| fontStreamSource | [StreamSource](../../com.aspose.font/streamsource) | Sorgente stream per il font. |

**Returns:**
[Font](../../com.aspose.font/font) - Font loaded.
### open(FontType fontType, String fileName) {#open-com.aspose.font.FontType-java.lang.String-}
```
public static Font open(FontType fontType, String fileName)
```


Apre un font, utilizzando il tipo di font e il nome del file del font.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Tipo di Font. |
| fileName | java.lang.String | Nome file del font. |

**Returns:**
[Font](../../com.aspose.font/font) - Font loaded.
### save(OutputStream stream) {#save-java.io.OutputStream-}
```
public void save(OutputStream stream)
```


Salva il Font nel formato originale.

--------------------

> ```
> Note: following Font types are supported for saving:
>  New TTF fonts;
>  TTF Font subsets;
>  CFF Font subsets;
>  Type1 Font subsets.
> ```

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stream | java.io.OutputStream | Stream per salvare il font. |

### save(String fileName) {#save-java.lang.String-}
```
public void save(String fileName)
```


Salva il Font nel formato originale.

--------------------

> ```
> Note: following Font types are supported for saving:
>  New TTF fonts;
>  TTF Font subsets;
>  CFF Font subsets;
>  Type1 Font subsets.
> ```

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fileName | java.lang.String | File per salvare il font. |

### saveToFormat(OutputStream stream, FontSavingFormats outFormat) {#saveToFormat-java.io.OutputStream-com.aspose.font.FontSavingFormats-}
```
public void saveToFormat(OutputStream stream, FontSavingFormats outFormat)
```


Salva il Font nel formato specificato.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stream | java.io.OutputStream | stream per salvare il font |
| outFormat | [FontSavingFormats](../../com.aspose.font/fontsavingformats) | formato desiderato |

### setFontFamily(String value) {#setFontFamily-java.lang.String-}
```
public abstract void setFontFamily(String value)
```


Imposta la famiglia del Font.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | java.lang.String | Nuova famiglia di Font. |

### setFontName(String value) {#setFontName-java.lang.String-}
```
public abstract void setFontName(String value)
```


Imposta il nome del Font face.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | java.lang.String | Nuovo nome faccia del Font. |

### setStyle(String value) {#setStyle-java.lang.String-}
```
public abstract void setStyle(String value)
```


Imposta lo stile del Font. Questo è un valore stringa grezzo fornito dal file Font.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | java.lang.String | Nuovo stile del Font. |

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
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

