---
title: "FontCharactersMerger"
second_title: "Aspose.Font för Java API-referens"
description: "Deklarerar funktionalitet för att slå samman teckensnitt av olika typer."
type: docs
weight: 35
url: /sv/java/com.aspose.font/fontcharactersmerger/
---
**Inheritance:**
java.lang.Object
```
public abstract class FontCharactersMerger
```

Deklarerar funktionalitet för att slå ihop teckensnitt av olika typer. Ett teckensnittspar behövs för sammanslagningsoperationen. Ett teckensnitt i detta par betraktas som primärt. Det innebär att många egenskaper relaterade till det slutliga sammanslagna teckensnittet, såsom metriker, kodningsstruktur och andra, tas från detta primära teckensnitt. Det andra teckensnittet i paret (sekundärt) tillhandahåller endast glyfer för det slutliga sammanslagna teckensnittet.
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getPrimaryFont()](#getPrimaryFont--) | Hämtar primärt teckensnitt. |
| [getSecondaryFont()](#getSecondaryFont--) | Hämtar sekundärt teckensnitt. |
| [hashCode()](#hashCode--) |  |
| [mergeFonts(GlyphId[] primaryFontGlyphs, GlyphId[] secondaryFontGlyphs, String newFontName)](#mergeFonts-com.aspose.font.GlyphId---com.aspose.font.GlyphId---java.lang.String-) | Slår samman teckensnitt baserat på de överförda glyflistorna. |
| [mergeFonts(int[] primaryFontCharCodes, int[] secondaryFontCharCodes, String newFontName)](#mergeFonts-int---int---java.lang.String-) | Slår samman teckensnitt baserat på de överförda teckenkodlistorna. |
| [mergeFonts(Map<Integer,GlyphId> primaryFontDict, Map<Integer,GlyphId> secondaryFontDict, String newFontName)](#mergeFonts-java.util.Map-java.lang.Integer-com.aspose.font.GlyphId--java.util.Map-java.lang.Integer-com.aspose.font.GlyphId--java.lang.String-) | Denna metodversion är avsedd för fall där du vill ange teckenkoder för glyfer i det resulterande teckensnittet explicit. |
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
| Parameter | Typ | Beskrivning |
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


Hämtar primärt teckensnitt.

**Returns:**
[Font](../../com.aspose.font/font) - The primary font.
### getSecondaryFont() {#getSecondaryFont--}
```
public abstract Font getSecondaryFont()
```


Hämtar sekundärt teckensnitt.

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


Slår samman teckensnitt baserat på de överförda glyflistorna. Söker efter en teckenkod för varje överförd glyf och lägger till den hittade teckenkoden med motsvarande glyf i det nya resulterande teckensnittet.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| primaryFontGlyphs | [GlyphId\[\]](../../com.aspose.font/glyphid) | Lista över glyfer att ta från primärt teckensnitt. |
| secondaryFontGlyphs | [GlyphId\[\]](../../com.aspose.font/glyphid) | Lista över glyfer att ta från sekundärt teckensnitt. |
| newFontName | java.lang.String | Önskat namn för det resulterande teckensnittet. |

**Returns:**
[Font](../../com.aspose.font/font) - Merged font
### mergeFonts(int[] primaryFontCharCodes, int[] secondaryFontCharCodes, String newFontName) {#mergeFonts-int---int---java.lang.String-}
```
public abstract Font mergeFonts(int[] primaryFontCharCodes, int[] secondaryFontCharCodes, String newFontName)
```


Slår samman teckensnitt baserat på de överförda teckenkodlistorna. För att skapa det önskade resulterande teckensnittet, skicka bara symbolkoder från de ursprungliga teckensnitten du vill inkludera i det resulterande teckensnittet. Glyfer relaterade till de överförda koderna kommer att hittas automatiskt. Till exempel, om du vill inkludera glyfer relaterade till bokstäverna A och B från det första teckensnittet och glyfer relaterade till bokstäverna C och D från det andra teckensnittet, anropa bara den här metoden så här: `mergeFonts(new uint[] { 'A', 'B' }, new uint[] { 'C', 'D' }, "NewFont")`

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| primaryFontCharCodes | int[] | Koder att ta från det primära teckensnittet. |
| secondaryFontCharCodes | int[] | Koder att ta från det sekundära teckensnittet. |
| newFontName | java.lang.String | Önskat namn för det resulterande teckensnittet. |

**Returns:**
[Font](../../com.aspose.font/font) - Merged font.
### mergeFonts(Map<Integer,GlyphId> primaryFontDict, Map<Integer,GlyphId> secondaryFontDict, String newFontName) {#mergeFonts-java.util.Map-java.lang.Integer-com.aspose.font.GlyphId--java.util.Map-java.lang.Integer-com.aspose.font.GlyphId--java.lang.String-}
```
public abstract Font mergeFonts(Map<Integer,GlyphId> primaryFontDict, Map<Integer,GlyphId> secondaryFontDict, String newFontName)
```


Denna metodversion är avsedd för fall där du vill ange teckenkoder för glyfer i det resulterande teckensnittet explicit. Det är inte ett krav att koden för den glyf du angav finns i det ursprungliga teckensnittet. Syftet med den överförda koden är att den ska associeras med motsvarande glyfid i det resulterande teckensnittet. Därför är regeln för att bearbeta varje par som skickas via ordboksparametern [kod, glyfid] att endast glyfid hämtas från det ursprungliga teckensnittet och sedan länkas till den motsvarande koden i det resulterande teckensnittet. Detta kan vara användbart när vissa koder från det första teckensnittet krockar med samma koder från det andra teckensnittet.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| primaryFontDict | java.util.Map<java.lang.Integer,com.aspose.font.GlyphId> | Ordbok med par [symbolkod, glyfid] från det primära teckensnittet. |
| secondaryFontDict | java.util.Map<java.lang.Integer,com.aspose.font.GlyphId> | Ordbok med par [symbolkod, glyfid] från det sekundära teckensnittet. |
| newFontName | java.lang.String | Önskat namn för det resulterande teckensnittet. |

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

