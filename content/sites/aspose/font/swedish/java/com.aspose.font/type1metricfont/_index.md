---
title: "Type1MetricFont"
second_title: "Aspose.Font för Java API-referens"
description: "Type1-metrisk typsnittsimplementation."
type: docs
weight: 117
url: /sv/java/com.aspose.font/type1metricfont/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.Font](../../com.aspose.font/font), [com.aspose.font.Type1Font](../../com.aspose.font/type1font)
```
public class Type1MetricFont extends Type1Font
```

Type1‑metrisk typsnittimplementation. Detta type1‑typsnitt skapas endast med metriska data. Funktioner för hämtning av glyfer och vissa andra som kräver ett riktigt typsnitt är inte tillåtna; otillåtna funktioner kastar undantaget Type1NotSupportedException. Andra egenskaper (FontName, Weight, Metrics och Encoding) hämtas från metrikfilen.

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
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [convert(FontType fontType)](#convert-com.aspose.font.FontType-) | Konverterar Fonten till ett annat format. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAllGlyphIds()](#getAllGlyphIds--) | Returnerar alla glyfid, tillgängliga i typsnittet. |
| [getClass()](#getClass--) |  |
| [getEncoding()](#getEncoding--) | Kodning definieras i metrikfilen. |
| [getFontDefinition()](#getFontDefinition--) | Hämtar Font‑definition. |
| [getFontFamily()](#getFontFamily--) | Hämtar Font‑familj. |
| [getFontName()](#getFontName--) | Hämtar typsnittets namn. |
| [getFontNames()](#getFontNames--) | Hämtar Font‑namn. |
| [getFontSaver()](#getFontSaver--) | Hämtar Font‑sparfunktionalitet. |
| [getFontStyle()](#getFontStyle--) | Hämtar Font‑stil. |
| [getFontType()](#getFontType--) | Hämtar Font‑typ. |
| [getGlyphAccessor()](#getGlyphAccessor--) | Font‑glyf‑åtkomst. |
| [getGlyphById(GlyphId id)](#getGlyphById-com.aspose.font.GlyphId-) | Returnerar glyf efter glyfid. |
| [getGlyphById(String id)](#getGlyphById-java.lang.String-) | Returnerar glyf efter glyfid. |
| [getGlyphById(long id)](#getGlyphById-long-) | Returnerar glyf efter glyfid. |
| [getGlyphIdType()](#getGlyphIdType--) | Specifikation av glyph-id-typ. |
| [getGlyphsForText(String text)](#getGlyphsForText-java.lang.String-) | Hämtar glyfrepresentation för text. |
| [getMetrics()](#getMetrics--) | Hämtar Font‑metrik. |
| [getNumGlyphs()](#getNumGlyphs--) | Hämtar antalet glyfer i Fonten. |
| [getPostscriptNames()](#getPostscriptNames--) | Hämtar PostScript Font-namn. |
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
| [setFontFamily(String value)](#setFontFamily-java.lang.String-) | Font-familjens inställare är ännu inte implementerad. |
| [setFontName(String value)](#setFontName-java.lang.String-) | Font-ansiktsnamnets inställare är ännu inte implementerad. |
| [setStyle(String value)](#setStyle-java.lang.String-) | Stil-inställaren är ännu inte implementerad. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### convert(FontType fontType) {#convert-com.aspose.font.FontType-}
```
public Font convert(FontType fontType)
```


Konverterar Fonten till ett annat format.

> ```
> Note: TTF Font type is now supported only.
> ```

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Font-formattyp att konvertera till. |

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
public GlyphId[] getAllGlyphIds()
```


Returnerar alla glyfid, tillgängliga i typsnittet. Stöds inte för Type1MetricFont‑typen.

**Returns:**
com.aspose.font.GlyphId[] - Alla glyfid‑identifierare, tillgängliga i typsnittet.
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


Kodning definieras i metrikfilen. StandardAdobeEncoding: kodningen fylls i automatiskt

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


Hämtar Font‑definition.

**Returns:**
[FontDefinition](../../com.aspose.font/fontdefinition) - Font definition.
### getFontFamily() {#getFontFamily--}
```
public String getFontFamily()
```


Hämtar Font‑familj.

**Returns:**
java.lang.String - Font-familj.
### getFontName() {#getFontName--}
```
public String getFontName()
```


Hämtar typsnittets namn.

**Returns:**
java.lang.String - Teckensnittsnamn.
### getFontNames() {#getFontNames--}
```
public MultiLanguageString getFontNames()
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
public int getFontStyle()
```


Hämtar Font-stil. Detta är ett värde som beräknas och representeras i en generaliserad typ.

**Returns:**
int - Hämtar typsnittsstil. Vanligtvis en kombination av konstantflaggvärden från FontStyle‑klassen eller 0.
### getFontType() {#getFontType--}
```
public FontType getFontType()
```


Hämtar teckensnittstyp. Returnerar värdet FontType.Type1.

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
public Glyph getGlyphById(GlyphId id)
```


Returnerar glyf efter glyfid. Stöds inte för typen (@code Type1MetricFont\}.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| id | [GlyphId](../../com.aspose.font/glyphid) | Glyfidentifierare. |

**Returns:**
[Glyph](../../com.aspose.font/glyph) - Glyph.
### getGlyphById(String id) {#getGlyphById-java.lang.String-}
```
public Glyph getGlyphById(String id)
```


Returnerar glyf efter glyfid. Stöds inte för typen (@code Type1MetricFont\}.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| id | java.lang.String | Glyfidentifierare. |

**Returns:**
[Glyph](../../com.aspose.font/glyph) - Glyph.
### getGlyphById(long id) {#getGlyphById-long-}
```
public Glyph getGlyphById(long id)
```


Returnerar glyf efter glyfid.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| id | long | Glyfid. |

**Returns:**
[Glyph](../../com.aspose.font/glyph) - Glyph.
### getGlyphIdType() {#getGlyphIdType--}
```
public GlyphIdType getGlyphIdType()
```


Specifikation av glyph-id-typ.

**Returns:**
[GlyphIdType](../../com.aspose.font/glyphidtype)
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
public IFontMetrics getMetrics()
```


Hämtar Font‑metrik.

**Returns:**
[IFontMetrics](../../com.aspose.font/ifontmetrics) - Font metrics.
### getNumGlyphs() {#getNumGlyphs--}
```
public int getNumGlyphs()
```


Hämtar antalet glyfer i Fonten.

**Returns:**
int - Antal glyfer i typsnittet.
### getPostscriptNames() {#getPostscriptNames--}
```
public MultiLanguageString getPostscriptNames()
```


Hämtar PostScript Font-namn.

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Postscript Font names
### getStyle() {#getStyle--}
```
public String getStyle()
```


Hämtar Font‑stil.

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
public void setFontFamily(String value)
```


Font-familjens inställare är ännu inte implementerad.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| värde | java.lang.String | Ny fontfamilj. |

### setFontName(String value) {#setFontName-java.lang.String-}
```
public void setFontName(String value)
```


Font-ansiktsnamnets inställare är ännu inte implementerad.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| värde | java.lang.String | Nytt teckensnittsansiktsnamn. |

### setStyle(String value) {#setStyle-java.lang.String-}
```
public void setStyle(String value)
```


Style-settern är ännu inte implementerad. Detta är ett rått strängvärde som tillhandahålls av teckensnittsfilen.

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

