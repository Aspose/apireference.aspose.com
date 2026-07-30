---
title: "Font"
second_title: "Aspose.Font för Java API-referens"
description: "Representerar basklassen Font."
type: docs
weight: 32
url: /sv/java/com.aspose.font/font/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IFont](../../com.aspose.font/ifont), [com.aspose.font.IGlyphAccessor](../../com.aspose.font/iglyphaccessor), [com.aspose.font.IFontSaver](../../com.aspose.font/ifontsaver)
```
public abstract class Font implements IFont, IGlyphAccessor, IFontSaver
```

Representerar basklassen Font.
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [convert(FontType fontType)](#convert-com.aspose.font.FontType-) | Konverterar Fonten till ett annat format. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAllGlyphIds()](#getAllGlyphIds--) | Returnerar alla glyph ids, tillgängliga i Font. |
| [getClass()](#getClass--) |  |
| [getEncoding()](#getEncoding--) | Hämtar Font‑kodning. |
| [getFontDefinition()](#getFontDefinition--) | Hämtar Font‑definition. |
| [getFontFamily()](#getFontFamily--) | Hämtar Font‑familj. |
| [getFontName()](#getFontName--) | Hämtar Font‑ansiktsnamn. |
| [getFontNames()](#getFontNames--) | Hämtar Font‑namn. |
| [getFontSaver()](#getFontSaver--) | Hämtar Font‑sparfunktionalitet. |
| [getFontStyle()](#getFontStyle--) | Hämtar Font‑stil. |
| [getFontType()](#getFontType--) | Hämtar Font‑typ. |
| [getGlyphAccessor()](#getGlyphAccessor--) | Font‑glyf‑åtkomst. |
| [getGlyphById(GlyphId id)](#getGlyphById-com.aspose.font.GlyphId-) | Returnerar glyf efter glyfid. |
| [getGlyphIdType()](#getGlyphIdType--) | Specifikation av glyph-id-typ. |
| [getGlyphsForText(String text)](#getGlyphsForText-java.lang.String-) | Hämtar glyfrepresentation för text. |
| [getMetrics()](#getMetrics--) | Hämtar Font‑metrik. |
| [getNumGlyphs()](#getNumGlyphs--) | Hämtar antalet glyfer i Fonten. |
| [getPostscriptNames()](#getPostscriptNames--) | Hämtar postscript-teckensnittsnamn. |
| [getStyle()](#getStyle--) | Hämtar Font‑stil. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [open(FontDefinition fontDefinition)](#open-com.aspose.font.FontDefinition-) | Öppnar en font med FontDefinition-objekt. |
| [open(FontType fontType, byte[] fontData)](#open-com.aspose.font.FontType-byte---) | Öppnar en font med fonttyp och bytearray för fontdata. |
| [open(FontType fontType, StreamSource fontStreamSource)](#open-com.aspose.font.FontType-com.aspose.font.StreamSource-) | Öppnar en font med fonttyp och strömkälla. |
| [open(FontType fontType, String fileName)](#open-com.aspose.font.FontType-java.lang.String-) | Öppnar en font med fonttyp och fontfilnamn. |
| [save(OutputStream stream)](#save-java.io.OutputStream-) | Sparar Fonten i originalformat. |
| [save(String fileName)](#save-java.lang.String-) | Sparar Fonten i originalformat. |
| [saveToFormat(OutputStream stream, FontSavingFormats outFormat)](#saveToFormat-java.io.OutputStream-com.aspose.font.FontSavingFormats-) | Sparar Fonten i angivet format. |
| [setFontFamily(String value)](#setFontFamily-java.lang.String-) | Ställer in Font-familj. |
| [setFontName(String value)](#setFontName-java.lang.String-) | Ställer in Font face name. |
| [setStyle(String value)](#setStyle-java.lang.String-) | Ställer in Font-stil. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### convert(FontType fontType) {#convert-com.aspose.font.FontType-}
```
public abstract Font convert(FontType fontType)
```


Konverterar Fonten till ett annat format.

--------------------

> ```
> Note: TTF Font type is now supported only.
> ```

fontType Font-formattyp att konvertera till.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) |  |

**Returns:**
[Font](../../com.aspose.font/font) - Font converted into new format.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getAllGlyphIds() {#getAllGlyphIds--}
```
public abstract GlyphId[] getAllGlyphIds()
```


Returnerar alla glyph ids, tillgängliga i Font. Glyph id är ett unikt nummer för en glyf, som är beroende av teckensnittstypen. Till exempel: Type1:s id är ett glyfnamn, en instans av klassen ( GlyphStringId ). TTF:s id är ett int-index, en instans av klassen ( GlyphInt32Id ).

**Returns:**
com.aspose.font.GlyphId[] - Glyph-identifierare.
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


Hämtar Font‑kodning.

**Returns:**
[IFontEncoding](../../com.aspose.font/ifontencoding) - Font encoding.
### getFontDefinition() {#getFontDefinition--}
```
public abstract FontDefinition getFontDefinition()
```


Hämtar Font‑definition.

**Returns:**
[FontDefinition](../../com.aspose.font/fontdefinition) - Font definition.
### getFontFamily() {#getFontFamily--}
```
public abstract String getFontFamily()
```


Hämtar Font‑familj.

**Returns:**
java.lang.String - Font-familj.
### getFontName() {#getFontName--}
```
public abstract String getFontName()
```


Hämtar Font‑ansiktsnamn.

**Returns:**
java.lang.String - Font face name.
### getFontNames() {#getFontNames--}
```
public abstract MultiLanguageString getFontNames()
```


Hämtar Font‑namn.

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Font names.
### getFontSaver() {#getFontSaver--}
```
public IFontSaver getFontSaver()
```


Hämtar Font‑sparfunktionalitet.

**Returns:**
[IFontSaver](../../com.aspose.font/ifontsaver) - Font save functionality.
### getFontStyle() {#getFontStyle--}
```
public abstract int getFontStyle()
```


Hämtar Font-stil. Detta är ett värde som beräknas och representeras i en generaliserad typ.

**Returns:**
int - Font-stil. Vanligtvis en kombination av konstantflaggvärden i FontStyle-klassen eller 0.
### getFontType() {#getFontType--}
```
public abstract FontType getFontType()
```


Hämtar Font‑typ.

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


Typsnittsglyf‑åtkomst. Hämtar glyfer och glyfidenterifierare.

**Returns:**
[IGlyphAccessor](../../com.aspose.font/iglyphaccessor) - Font glyph accessor.
### getGlyphById(GlyphId id) {#getGlyphById-com.aspose.font.GlyphId-}
```
public abstract Glyph getGlyphById(GlyphId id)
```


Returnerar glyf efter glyph Id. Glyph id är ett unikt nummer för en glyf, som är beroende av teckensnittstypen. GlyphId - härlett objekt. Till exempel: Type1:s id är ett glyfnamn, en instans av klassen ( GlyphStringId ). TTF:s id är ett int-index, en instans av klassen ( GlyphInt32Id ).

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| id | [GlyphId](../../com.aspose.font/glyphid) | Glyfid. |

**Returns:**
[Glyph](../../com.aspose.font/glyph) - Glyph.
### getGlyphIdType() {#getGlyphIdType--}
```
public abstract GlyphIdType getGlyphIdType()
```


Specifikation av glyph id-typ. För konsumenter som behöver känna till den faktiska typen för 'bytes[]'.

**Returns:**
[GlyphIdType](../../com.aspose.font/glyphidtype) - Id type specification
### getGlyphsForText(String text) {#getGlyphsForText-java.lang.String-}
```
public GlyphId[] getGlyphsForText(String text)
```


Hämtar glyfrepresentation för text.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| text | java.lang.String | Indatatext. |

**Returns:**
com.aspose.font.GlyphId[] - GlyphId‑array.
### getMetrics() {#getMetrics--}
```
public abstract IFontMetrics getMetrics()
```


Hämtar Font‑metrik.

**Returns:**
[IFontMetrics](../../com.aspose.font/ifontmetrics) - Font metrics.
### getNumGlyphs() {#getNumGlyphs--}
```
public abstract int getNumGlyphs()
```


Hämtar antalet glyfer i Fonten.

**Returns:**
int - Antal glyfer i typsnittet.
### getPostscriptNames() {#getPostscriptNames--}
```
public abstract MultiLanguageString getPostscriptNames()
```


Hämtar postscript-teckensnittsnamn.

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Postscript font names.
### getStyle() {#getStyle--}
```
public abstract String getStyle()
```


Hämtar typsnittsstil. Detta är ett rått strängvärde som tillhandahålls av typsnittsfilen.

**Returns:**
java.lang.String - Typsnittsstil.
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


Öppnar en font med FontDefinition-objekt.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fontDefinition | [FontDefinition](../../com.aspose.font/fontdefinition) | Typsnittsdefinitionsobjekt. |

**Returns:**
[Font](../../com.aspose.font/font) - Font loaded.
### open(FontType fontType, byte[] fontData) {#open-com.aspose.font.FontType-byte---}
```
public static Font open(FontType fontType, byte[] fontData)
```


Öppnar en font med fonttyp och bytearray för fontdata.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Typsnittstyp. |
| fontData | byte[] | Byte‑array för att läsa in typsnitt från. |

**Returns:**
[Font](../../com.aspose.font/font) - Font loaded.
### open(FontType fontType, StreamSource fontStreamSource) {#open-com.aspose.font.FontType-com.aspose.font.StreamSource-}
```
public static Font open(FontType fontType, StreamSource fontStreamSource)
```


Öppnar en font med fonttyp och strömkälla.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Typsnittstyp. |
| fontStreamSource | [StreamSource](../../com.aspose.font/streamsource) | Strömkälla för typsnitt. |

**Returns:**
[Font](../../com.aspose.font/font) - Font loaded.
### open(FontType fontType, String fileName) {#open-com.aspose.font.FontType-java.lang.String-}
```
public static Font open(FontType fontType, String fileName)
```


Öppnar en font med fonttyp och fontfilnamn.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Typsnittstyp. |
| fileName | java.lang.String | Fontfilnamn. |

**Returns:**
[Font](../../com.aspose.font/font) - Font loaded.
### save(OutputStream stream) {#save-java.io.OutputStream-}
```
public void save(OutputStream stream)
```


Sparar Fonten i originalformat.

--------------------

> ```
> Note: following Font types are supported for saving:
>  New TTF fonts;
>  TTF Font subsets;
>  CFF Font subsets;
>  Type1 Font subsets.
> ```

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| ström | java.io.OutputStream | Ström för att spara teckensnitt. |

### save(String fileName) {#save-java.lang.String-}
```
public void save(String fileName)
```


Sparar Fonten i originalformat.

--------------------

> ```
> Note: following Font types are supported for saving:
>  New TTF fonts;
>  TTF Font subsets;
>  CFF Font subsets;
>  Type1 Font subsets.
> ```

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fileName | java.lang.String | Fil för att spara teckensnitt. |

### saveToFormat(OutputStream stream, FontSavingFormats outFormat) {#saveToFormat-java.io.OutputStream-com.aspose.font.FontSavingFormats-}
```
public void saveToFormat(OutputStream stream, FontSavingFormats outFormat)
```


Sparar Fonten i angivet format.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| ström | java.io.OutputStream | ström för att spara teckensnitt |
| outFormat | [FontSavingFormats](../../com.aspose.font/fontsavingformats) | önskat format |

### setFontFamily(String value) {#setFontFamily-java.lang.String-}
```
public abstract void setFontFamily(String value)
```


Ställer in Font-familj.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| värde | java.lang.String | Ny fontfamilj. |

### setFontName(String value) {#setFontName-java.lang.String-}
```
public abstract void setFontName(String value)
```


Ställer in Font face name.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| värde | java.lang.String | Nytt teckensnittsansiktsnamn. |

### setStyle(String value) {#setStyle-java.lang.String-}
```
public abstract void setStyle(String value)
```


Ställer in fontstil. Detta är ett rått strängvärde som tillhandahålls av fontfilen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| värde | java.lang.String | Ny fontstil. |

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
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

