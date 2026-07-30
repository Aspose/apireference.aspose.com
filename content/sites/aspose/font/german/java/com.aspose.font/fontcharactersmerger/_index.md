---
title: "FontCharactersMerger"
second_title: "Aspose.Font für Java API-Referenz"
description: "Deklariert Funktionalität zum Zusammenführen von Schriftarten verschiedener Typen."
type: docs
weight: 35
url: /de/java/com.aspose.font/fontcharactersmerger/
---
**Inheritance:**
java.lang.Object
```
public abstract class FontCharactersMerger
```

Deklariert die Funktionalität zum Zusammenführen von Schriften verschiedener Typen. Ein Schriftpaar wird für den Merge‑Vorgang benötigt. Eine Schrift dieses Paares wird als primär betrachtet. Das bedeutet, dass viele Eigenschaften der endgültig zusammengeführten Schrift, wie Metriken, Kodierungsstruktur und weitere, von dieser primären Schrift übernommen werden. Die andere Schrift dieses Paares (sekundär) liefert nur Glyphen für die endgültig zusammengeführte Schrift.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getPrimaryFont()](#getPrimaryFont--) | Liest die primäre Schrift. |
| [getSecondaryFont()](#getSecondaryFont--) | Erhält sekundäre Schriftart. |
| [hashCode()](#hashCode--) |  |
| [mergeFonts(GlyphId[] primaryFontGlyphs, GlyphId[] secondaryFontGlyphs, String newFontName)](#mergeFonts-com.aspose.font.GlyphId---com.aspose.font.GlyphId---java.lang.String-) | Führt Schriftarten basierend auf übergebenen Glyphenlisten zusammen. |
| [mergeFonts(int[] primaryFontCharCodes, int[] secondaryFontCharCodes, String newFontName)](#mergeFonts-int---int---java.lang.String-) | Führt Schriftarten basierend auf übergebenen Zeichenkodierungslisten zusammen. |
| [mergeFonts(Map<Integer,GlyphId> primaryFontDict, Map<Integer,GlyphId> secondaryFontDict, String newFontName)](#mergeFonts-java.util.Map-java.lang.Integer-com.aspose.font.GlyphId--java.util.Map-java.lang.Integer-com.aspose.font.GlyphId--java.lang.String-) | Diese Methodenvariante ist für Fälle gedacht, in denen Sie Zeichencodes für Glyphen in der resultierenden Schriftart explizit festlegen möchten. |
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
| Parameter | Typ | Beschreibung |
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


Liest die primäre Schrift.

**Returns:**
[Font](../../com.aspose.font/font) - The primary font.
### getSecondaryFont() {#getSecondaryFont--}
```
public abstract Font getSecondaryFont()
```


Erhält sekundäre Schriftart.

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


Führt Schriftarten basierend auf übergebenen Glyphenlisten zusammen. Sucht für jede übergebene Glyphe nach einem Zeichencode und fügt den gefundenen Zeichencode mit der entsprechenden Glyphe in die neue resultierende Schriftart ein.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| primaryFontGlyphs | [GlyphId\[\]](../../com.aspose.font/glyphid) | Liste der Glyphen, die aus der primären Schriftart übernommen werden sollen. |
| secondaryFontGlyphs | [GlyphId\[\]](../../com.aspose.font/glyphid) | Liste der Glyphen, die aus der sekundären Schriftart übernommen werden sollen. |
| newFontName | java.lang.String | Gewünschter Name für die resultierende Schriftart. |

**Returns:**
[Font](../../com.aspose.font/font) - Merged font
### mergeFonts(int[] primaryFontCharCodes, int[] secondaryFontCharCodes, String newFontName) {#mergeFonts-int---int---java.lang.String-}
```
public abstract Font mergeFonts(int[] primaryFontCharCodes, int[] secondaryFontCharCodes, String newFontName)
```


Führt Schriftarten basierend auf übergebenen Zeichenkodierungslisten zusammen. Um die gewünschte resultierende Schriftart zu erstellen, übergeben Sie einfach die Symbolcodes aus den Originalschriftarten, die Sie in die resultierende Schriftart aufnehmen möchten. Glyphen, die zu den übergebenen Codes gehören, werden automatisch gefunden. Beispiel: Wenn Sie Glyphen für die Buchstaben A und B aus der ersten Schriftart und Glyphen für die Buchstaben C und D aus der zweiten Schriftart einbeziehen möchten, rufen Sie diese Methode wie folgt auf: `mergeFonts(new uint[] { 'A', 'B' }, new uint[] { 'C', 'D' }, "NewFont")`

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| primaryFontCharCodes | int[] | Codes, die aus der primären Schriftart übernommen werden sollen. |
| secondaryFontCharCodes | int[] | Codes, die aus der sekundären Schriftart übernommen werden sollen. |
| newFontName | java.lang.String | Gewünschter Name für die resultierende Schriftart. |

**Returns:**
[Font](../../com.aspose.font/font) - Merged font.
### mergeFonts(Map<Integer,GlyphId> primaryFontDict, Map<Integer,GlyphId> secondaryFontDict, String newFontName) {#mergeFonts-java.util.Map-java.lang.Integer-com.aspose.font.GlyphId--java.util.Map-java.lang.Integer-com.aspose.font.GlyphId--java.lang.String-}
```
public abstract Font mergeFonts(Map<Integer,GlyphId> primaryFontDict, Map<Integer,GlyphId> secondaryFontDict, String newFontName)
```


Diese Methodenvariante ist für Fälle gedacht, in denen Sie Zeichencodes für Glyphen in der resultierenden Schriftart explizit festlegen möchten. Es ist nicht zwingend erforderlich, dass der für die bereitgestellte Glyphe angegebene Code in der Originalschriftart enthalten ist. Der Zweck des übergebenen Codes besteht darin, ihn mit dem entsprechenden Glyphen‑Identifikator in der resultierenden Schriftart zu verknüpfen. Daher lautet die Regel zur Verarbeitung jedes Paars, das über den Wörterbuchparameter [code, glyph identifier] übergeben wird: Es wird nur der Glyphen‑Identifikator aus der Originalschriftart genommen und anschließend mit dem entsprechenden Code in der resultierenden Schriftart verknüpft. Dies kann hilfreich sein, wenn einige Codes der ersten Schriftart mit denselben Codes der zweiten Schriftart kollidieren.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| primaryFontDict | java.util.Map<java.lang.Integer,com.aspose.font.GlyphId> | Wörterbuch mit Paaren [symbol code, glyph identifier] aus der primären Schriftart. |
| secondaryFontDict | java.util.Map<java.lang.Integer,com.aspose.font.GlyphId> | Wörterbuch mit Paaren [symbol code, glyph identifier] aus der sekundären Schriftart. |
| newFontName | java.lang.String | Gewünschter Name für die resultierende Schriftart. |

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
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

