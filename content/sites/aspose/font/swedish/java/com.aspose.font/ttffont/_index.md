---
title: "TtfFont"
second_title: "Aspose.Font för Java API-referens"
description: "Representerar TrueType Font TTF."
type: docs
weight: 94
url: /sv/java/com.aspose.font/ttffont/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.Font](../../com.aspose.font/font)
```
public class TtfFont extends Font
```

Representerar TrueType-typsnitt (TTF).
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [convert(FontType fontType)](#convert-com.aspose.font.FontType-) | Konverterar Fonten till ett annat format. |
| [convert(FontType fontType, Collection<Integer> limitingCharacterSet)](#convert-com.aspose.font.FontType-java.util.Collection-java.lang.Integer--) | Konverterar Fonten till ett annat format med begränsad teckenuppsättning  *Obs: TTF Font-typen stöds nu endast.* |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAllGlyphIds()](#getAllGlyphIds--) | Returnerar en array med alla glyfid, tillgängliga i Fonten. |
| [getCffFont()](#getCffFont--) | Hämtar CFF Font om den finns. |
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
| [getGlyphById(String glyphName)](#getGlyphById-java.lang.String-) | Returnerar glyf efter glyfnamn. |
| [getGlyphById(long id)](#getGlyphById-long-) | Returnerar glyf efter glyfid. |
| [getGlyphComponentsById(GlyphId id, GlyphIdList componentsToPopulate)](#getGlyphComponentsById-com.aspose.font.GlyphId-com.aspose.font.GlyphIdList-) | Hämtar en glyf med angivet glyfid och fyller den medföljande listan med glyfid med komponenterna i denna glyf. |
| [getGlyphComponentsById(String glyphName, GlyphIdList componentsToPopulate)](#getGlyphComponentsById-java.lang.String-com.aspose.font.GlyphIdList-) | Hämtar en glyf med angivet glyfnamn och fyller den medföljande listan med glyfid med komponenterna i denna glyf. |
| [getGlyphComponentsById(long id, GlyphIdList componentsToPopulate)](#getGlyphComponentsById-long-com.aspose.font.GlyphIdList-) | Hämtar en glyf med angivet glyfindex och fyller den medföljande listan med glyfid med komponenterna i denna glyf. |
| [getGlyphIdType()](#getGlyphIdType--) | Hämtar specifikation för glyfid‑typ. |
| [getGlyphsForText(String text)](#getGlyphsForText-java.lang.String-) | Hämta glyfrepresentation för text. |
| [getMetrics()](#getMetrics--) | Hämtar Font‑metrik. |
| [getNumGlyphs()](#getNumGlyphs--) | Hämtar antalet glyfer i Fonten. |
| [getPostscriptNames()](#getPostscriptNames--) | Hämtar Postscript-fontnamn. |
| [getStyle()](#getStyle--) | Hämtar Font‑stil. |
| [getTtfTables()](#getTtfTables--) | Hämtar TTF-tabeller. |
| [hashCode()](#hashCode--) |  |
| [isSymbolic()](#isSymbolic--) | Returnerar true om Font är symbolisk. |
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
public Font convert(FontType fontType)
```


Konverterar Fonten till ett annat format. Obs: TTF Font-typ stöds nu endast.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Font-formattyp att konvertera till. |

**Returns:**
[Font](../../com.aspose.font/font) - Font converted into new format.
### convert(FontType fontType, Collection<Integer> limitingCharacterSet) {#convert-com.aspose.font.FontType-java.util.Collection-java.lang.Integer--}
```
public Font convert(FontType fontType, Collection<Integer> limitingCharacterSet)
```


Konverterar Fonten till ett annat format med begränsad teckenuppsättning  *Obs: TTF Font-typen stöds nu endast.*

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Font-formattyp att konvertera till. |
| limitingCharacterSet | java.util.Collection<java.lang.Integer> | Begränsad teckenuppsättning. |

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


Returnerar en array med alla glyph-id:n som finns i Fonten. Glyph id är ett unikt nummer för en glyph, vilket beror på fonttyp. TTF Font glyph id kan vara en instans av ( GlyphStringId )-klassen eller ( GlyphUInt32Id )-klassen. Namn (string) glyph-adressering stöds för TTF-fonts via Post table-mappning. Om en CFF Font finns inuti används CFF-strukturer för att adressera glyphs efter namn.

**Returns:**
com.aspose.font.GlyphId[] - Glyph-identifierare.
### getCffFont() {#getCffFont--}
```
public Font getCffFont()
```


Hämtar CFF Font om den finns.

**Returns:**
[Font](../../com.aspose.font/font) - CFF Font.
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


Hämtar Font‑kodning.

**Returns:**
[IFontEncoding](../../com.aspose.font/ifontencoding) - Font encoding.
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


Hämtar Font‑ansiktsnamn.

**Returns:**
java.lang.String - Font face name.
### getFontNames() {#getFontNames--}
```
public MultiLanguageString getFontNames()
```


Hämtar Font‑namn.

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Font names
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
int - Font-stil. Vanligtvis en kombination av konstantflaggvärden i FontStyle-klassen eller 0.
### getFontType() {#getFontType--}
```
public FontType getFontType()
```


Hämtar Font-typ. Returnerar värdet FontType.TTF.

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


Returnerar glyf med glyfid. Glyfid är ett unikt nummer för en glyf, som beror på typsnittstyp. TTF‑typsnittets glyfid kan vara en instans av ( GlyphStringId )-klassen eller ( GlyphUInt32Id )-klassen. Namn (string) glyf‑adressering stöds för TTF‑typsnitt via Post‑tabellmappning. Om ett CFF‑typsnitt finns inuti används CFF‑strukturerna för att adressera glyfer efter namn.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| id | [GlyphId](../../com.aspose.font/glyphid) |  |

**Returns:**
[Glyph](../../com.aspose.font/glyph)
### getGlyphById(String glyphName) {#getGlyphById-java.lang.String-}
```
public Glyph getGlyphById(String glyphName)
```


Returnerar glyf med glyfnamn. Namn (string) glyf‑adressering stöds för TTF‑typsnitt via Post‑tabellmappning. Om ett CFF‑typsnitt finns inuti används CFF‑strukturerna för att adressera glyfer efter namn.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| glyphName | java.lang.String | Glyfsträngsidentifierare. |

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
| id | long | Glyfindex. |

**Returns:**
[Glyph](../../com.aspose.font/glyph) - Glyph.
### getGlyphComponentsById(GlyphId id, GlyphIdList componentsToPopulate) {#getGlyphComponentsById-com.aspose.font.GlyphId-com.aspose.font.GlyphIdList-}
```
public void getGlyphComponentsById(GlyphId id, GlyphIdList componentsToPopulate)
```


Hämtar en glyf med den angivna glyfid och fyller den medskickade listan med glyfidenterifierare med komponenterna för denna glyf. Glyfid är ett unikt nummer för en glyf, som beror på typsnittstyp. TTF‑typsnittets glyfid kan vara en instans av ( GlyphStringId )-klassen eller ( GlyphUInt32Id )-klassen. Namn (string) glyf‑adressering stöds för TTF‑typsnitt via Post‑tabellmappning. Om ett CFF‑typsnitt finns inuti används CFF‑strukturerna för att adressera glyfer efter namn.

--------------------

En tom samling componentsToPopulate bör skickas som kommer att innehålla listan med glyfkomponenters id.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| id | [GlyphId](../../com.aspose.font/glyphid) | Glyfid. |
| componentsToPopulate | [GlyphIdList](../../com.aspose.font/glyphidlist) | Lista med glyfidenterifierare att fylla. |

### getGlyphComponentsById(String glyphName, GlyphIdList componentsToPopulate) {#getGlyphComponentsById-java.lang.String-com.aspose.font.GlyphIdList-}
```
public void getGlyphComponentsById(String glyphName, GlyphIdList componentsToPopulate)
```


Hämtar en glyf med angivet glyfnamn och fyller den medföljande listan med glyfid med komponenterna i denna glyf.

--------------------

En tom samling componentsToPopulate bör skickas som kommer att innehålla listan med glyfkomponenters id.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| glyphName | java.lang.String | Glyfnamn. |
| componentsToPopulate | [GlyphIdList](../../com.aspose.font/glyphidlist) | Lista med glyfidenterifierare att fylla. |

### getGlyphComponentsById(long id, GlyphIdList componentsToPopulate) {#getGlyphComponentsById-long-com.aspose.font.GlyphIdList-}
```
public void getGlyphComponentsById(long id, GlyphIdList componentsToPopulate)
```


Hämtar en glyf med angivet glyfindex och fyller den medföljande listan med glyfid med komponenterna i denna glyf.

--------------------

En tom samling componentsToPopulate bör skickas som kommer att innehålla listan med glyfkomponenters id.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| id | long | Glyfindex. |
| componentsToPopulate | [GlyphIdList](../../com.aspose.font/glyphidlist) | Lista med glyfidenterifierare att fylla. |

### getGlyphIdType() {#getGlyphIdType--}
```
public GlyphIdType getGlyphIdType()
```


Hämtar specifikation för glyfid‑typ.

**Returns:**
[GlyphIdType](../../com.aspose.font/glyphidtype) - Glyph id type specification.
### getGlyphsForText(String text) {#getGlyphsForText-java.lang.String-}
```
public GlyphId[] getGlyphsForText(String text)
```


Hämta glyfrepresentation för text.

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


Hämtar Postscript-fontnamn.

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Postscript font names.
### getStyle() {#getStyle--}
```
public String getStyle()
```


Hämtar typsnittsstil. Detta är ett rått strängvärde som tillhandahålls av typsnittsfilen.

**Returns:**
java.lang.String - Typsnittsstil.
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


Hämtar TTF-tabeller.

**Returns:**
[TtfTableRepository](../../com.aspose.font/ttftablerepository) - TTF tables.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isSymbolic() {#isSymbolic--}
```
public boolean isSymbolic()
```


Returnerar true om Font är symbolisk.

**Returns:**
boolean - Sant om typsnittet är symboliskt.
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


Ställer in Font-familj.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| värde | java.lang.String | Ny fontfamilj. |

### setFontName(String value) {#setFontName-java.lang.String-}
```
public void setFontName(String value)
```


Ställer in Font face name.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| värde | java.lang.String | Nytt teckensnittsansiktsnamn. |

### setStyle(String value) {#setStyle-java.lang.String-}
```
public void setStyle(String value)
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

