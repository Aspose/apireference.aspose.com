---
title: "CffFont"
second_title: "Riferimento API Aspose.Font per Java"
description: "Rappresenta Compact Font Format CFF."
type: docs
weight: 19
url: /it/java/com.aspose.font/cfffont/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.Font](../../com.aspose.font/font)
```
public class CffFont extends Font
```

Rappresenta il Compact Font Format (CFF).
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [convert(FontType fontType)](#convert-com.aspose.font.FontType-) | Converte il Font in un altro formato. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAllGlyphIds()](#getAllGlyphIds--) | Restituisce un array di tutti gli ID glifo, disponibili nel Font. |
| [getClass()](#getClass--) |  |
| [getCommonFontsSettings()](#getCommonFontsSettings--) | Ottiene le impostazioni comuni ai font CFF. |
| [getEncoding()](#getEncoding--) | Ottiene la codifica del Font. |
| [getFontDefinition()](#getFontDefinition--) | Ottiene la definizione del font. |
| [getFontFamily()](#getFontFamily--) | Ottiene la famiglia del Font. |
| [getFontName()](#getFontName--) | Ottiene il nome del Font face. |
| [getFontNames()](#getFontNames--) | Ottiene i nomi del Font. |
| [getFontSaver()](#getFontSaver--) | Ottiene la funzionalità di salvataggio del Font. |
| [getFontStyle()](#getFontStyle--) | Ottiene lo stile del Font. |
| [getFontType()](#getFontType--) | Ottiene il tipo di Font. |
| [getGlyphAccessor()](#getGlyphAccessor--) | Accessor dei glifi del Font. |
| [getGlyphById(GlyphId id)](#getGlyphById-com.aspose.font.GlyphId-) | Restituisce il glifo per ID glifo. |
| [getGlyphById(String glyphName)](#getGlyphById-java.lang.String-) | Restituisce il glifo per nome glifo. |
| [getGlyphById(long id)](#getGlyphById-long-) | Restituisce il glifo per ID glifo. |
| [getGlyphIdType()](#getGlyphIdType--) | Ottiene la specifica del tipo di ID glifo. |
| [getGlyphsForText(String text)](#getGlyphsForText-java.lang.String-) | Ottiene la rappresentazione dei glifi per il testo. |
| [getIndexDataProvider(CffIndexProviderType indexType)](#getIndexDataProvider-com.aspose.font.CffIndexProviderType-) | Ottiene il provider per il tipo di struttura CFF INDEX specificato. |
| [getMetrics()](#getMetrics--) | Ottiene le metriche del Font. |
| [getNumGlyphs()](#getNumGlyphs--) | Ottiene il numero di glifi nel Font. |
| [getPostscriptNames()](#getPostscriptNames--) | Ottiene i nomi del font Postscript. |
| [getStyle()](#getStyle--) | Ottiene lo stile del Font. |
| [getTopDictDataProvider()](#getTopDictDataProvider--) |  |
| [hashCode()](#hashCode--) |  |
| [isCidKeyedFont()](#isCidKeyedFont--) | Ottiene il valore che indica che il font è cid-keyed. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [open(FontDefinition fontDefinition)](#open-com.aspose.font.FontDefinition-) | Apre un font, utilizzando l'oggetto FontDefinition. |
| [open(FontType fontType, byte[] fontData)](#open-com.aspose.font.FontType-byte---) | Apre un font, utilizzando il tipo di font e l'array di byte dei dati del font. |
| [open(FontType fontType, StreamSource fontStreamSource)](#open-com.aspose.font.FontType-com.aspose.font.StreamSource-) | Apre un font, utilizzando il tipo di font e la sorgente stream. |
| [open(FontType fontType, String fileName)](#open-com.aspose.font.FontType-java.lang.String-) | Apre un font, utilizzando il tipo di font e il nome del file del font. |
| [save(OutputStream stream)](#save-java.io.OutputStream-) | Salva il Font nel formato originale. |
| [save(String fileName)](#save-java.lang.String-) | Salva il Font nel formato originale. |
| [saveToFormat(OutputStream stream, FontSavingFormats outFormat)](#saveToFormat-java.io.OutputStream-com.aspose.font.FontSavingFormats-) | Salva il Font nel formato specificato. |
| [setCommonFontsSettings(CffFontsSettings value)](#setCommonFontsSettings-com.aspose.font.CffFontsSettings-) | Specifica le impostazioni comuni ai font CFF. |
| [setFontFamily(String value)](#setFontFamily-java.lang.String-) | Il setter della famiglia del font non è ancora implementato. |
| [setFontName(String value)](#setFontName-java.lang.String-) | Il setter del nome del font non è ancora implementato. |
| [setStyle(String value)](#setStyle-java.lang.String-) | Il setter dello stile non è ancora implementato. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### convert(FontType fontType) {#convert-com.aspose.font.FontType-}
```
public Font convert(FontType fontType)
```


Converte il Font in un altro formato. Nota: il tipo di Font TTF è ora supportato solo.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Tipo di formato del Font in cui convertire. |

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
public GlyphId[] getAllGlyphIds()
```


Restituisce un array di tutti gli ID dei glifi disponibili nel font. L'ID del glifo è un numero unico per un glifo, dipendente dal tipo di font. L'ID del glifo del font CFF può essere un'istanza della classe ( GlyphStringId ) o della classe ( GlyphUInt32Id ).

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


Ottiene le impostazioni comuni ai font CFF. Queste impostazioni sono utilizzate in diversi scenari e possono essere modificate per ciascun font individuale.

**Returns:**
[CffFontsSettings](../../com.aspose.font/cfffontssettings) - Font definition.
### getEncoding() {#getEncoding--}
```
public IFontEncoding getEncoding()
```


Ottiene la codifica del Font.

**Returns:**
[IFontEncoding](../../com.aspose.font/ifontencoding) - Font encoding.
### getFontDefinition() {#getFontDefinition--}
```
public FontDefinition getFontDefinition()
```


Ottiene la definizione del font.

**Returns:**
[FontDefinition](../../com.aspose.font/fontdefinition) - Font definition.
### getFontFamily() {#getFontFamily--}
```
public String getFontFamily()
```


Ottiene la famiglia del Font.

**Returns:**
java.lang.String - Famiglia del Font.
### getFontName() {#getFontName--}
```
public String getFontName()
```


Ottiene il nome del Font face.

**Returns:**
java.lang.String - Nome del Font face.
### getFontNames() {#getFontNames--}
```
public MultiLanguageString getFontNames()
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
public int getFontStyle()
```


Ottiene lo stile del Font. Questo è un valore calcolato e rappresentato in tipo generalizzato.

**Returns:**
int - Stile del Font. Di solito, una combinazione di valori di flag costanti della classe FontStyle o 0.
### getFontType() {#getFontType--}
```
public FontType getFontType()
```


Ottiene il tipo di font. Restituisce il valore FontType.CFF.

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
public Glyph getGlyphById(GlyphId id)
```


Restituisce il glifo per ID glifo. L'ID del glifo è un numero unico per un glifo, dipendente dal tipo di font. L'ID del glifo del font CFF può essere un'istanza della classe ( GlyphStringId ) o della classe ( GlyphInt32Id ).

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| id | [GlyphId](../../com.aspose.font/glyphid) | ID glifo. |

**Returns:**
[Glyph](../../com.aspose.font/glyph) - Glyph.
### getGlyphById(String glyphName) {#getGlyphById-java.lang.String-}
```
public Glyph getGlyphById(String glyphName)
```


Restituisce il glifo per nome glifo.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| glyphName | java.lang.String | Nome del glifo. |

**Returns:**
[Glyph](../../com.aspose.font/glyph) - Glyph.
### getGlyphById(long id) {#getGlyphById-long-}
```
public Glyph getGlyphById(long id)
```


Restituisce il glifo per ID glifo.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| id | long | ID glifo. |

**Returns:**
[Glyph](../../com.aspose.font/glyph) - Glyph.
### getGlyphIdType() {#getGlyphIdType--}
```
public GlyphIdType getGlyphIdType()
```


Ottiene la specifica del tipo di ID glifo.

**Returns:**
[GlyphIdType](../../com.aspose.font/glyphidtype) - Glyph id type specification.
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
### getIndexDataProvider(CffIndexProviderType indexType) {#getIndexDataProvider-com.aspose.font.CffIndexProviderType-}
```
public ICffIndexDataProvider getIndexDataProvider(CffIndexProviderType indexType)
```


Ottiene il provider per il tipo di struttura CFF INDEX specificato.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| indexType | [CffIndexProviderType](../../com.aspose.font/cffindexprovidertype) | Tipo di struttura INDEX. |

**Returns:**
[ICffIndexDataProvider](../../com.aspose.font/icffindexdataprovider) - Implementation of ( ICffIndexDataProvider ) interface.
### getMetrics() {#getMetrics--}
```
public IFontMetrics getMetrics()
```


Ottiene le metriche del Font.

**Returns:**
[IFontMetrics](../../com.aspose.font/ifontmetrics) - Font metrics.
### getNumGlyphs() {#getNumGlyphs--}
```
public int getNumGlyphs()
```


Ottiene il numero di glifi nel Font.

**Returns:**
int - Numero di glifi nel Font.
### getPostscriptNames() {#getPostscriptNames--}
```
public MultiLanguageString getPostscriptNames()
```


Ottiene i nomi del font Postscript.

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Postscript Font names.
### getStyle() {#getStyle--}
```
public String getStyle()
```


Ottiene lo stile del Font. Questo è un valore stringa grezzo fornito dal file Font.

**Returns:**
java.lang.String - Stile del Font.
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


Ottiene il valore che indica che il font è cid-keyed.

**Returns:**
boolean - Valore che indica che il font è cid-keyed.
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

### setCommonFontsSettings(CffFontsSettings value) {#setCommonFontsSettings-com.aspose.font.CffFontsSettings-}
```
public void setCommonFontsSettings(CffFontsSettings value)
```


Specifica le impostazioni comuni ai font CFF.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | [CffFontsSettings](../../com.aspose.font/cfffontssettings) | Definizione del font. |

### setFontFamily(String value) {#setFontFamily-java.lang.String-}
```
public void setFontFamily(String value)
```


Il setter della famiglia del font non è ancora implementato.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | java.lang.String | Nuova famiglia di Font. |

### setFontName(String value) {#setFontName-java.lang.String-}
```
public void setFontName(String value)
```


Il setter del nome del font non è ancora implementato.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | java.lang.String | Nuovo nome faccia del Font. |

### setStyle(String value) {#setStyle-java.lang.String-}
```
public void setStyle(String value)
```


Il setter dello stile non è ancora implementato.

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

