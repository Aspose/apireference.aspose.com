---
title: "TtfFont"
second_title: "Aspose.Font für Java API-Referenz"
description: "Stellt TrueType Font TTF dar."
type: docs
weight: 94
url: /de/java/com.aspose.font/ttffont/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.Font](../../com.aspose.font/font)
```
public class TtfFont extends Font
```

Stellt die TrueType Schrift (TTF) dar.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [convert(FontType fontType)](#convert-com.aspose.font.FontType-) | Konvertiert die Font in ein anderes Format. |
| [convert(FontType fontType, Collection<Integer> limitingCharacterSet)](#convert-com.aspose.font.FontType-java.util.Collection-java.lang.Integer--) | Konvertiert die Font in ein anderes Format mit begrenztem Zeichensatz  *Hinweis: TTF Font-Typ wird jetzt nur noch unterstützt.* |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAllGlyphIds()](#getAllGlyphIds--) | Gibt ein Array aller Glyph-IDs zurück, die in der Font verfügbar sind. |
| [getCffFont()](#getCffFont--) | Liefert CFF Font, falls vorhanden. |
| [getClass()](#getClass--) |  |
| [getEncoding()](#getEncoding--) | Liefert Font‑Kodierung. |
| [getFontDefinition()](#getFontDefinition--) | Liefert Font‑Definition. |
| [getFontFamily()](#getFontFamily--) | Liefert Font‑Familie. |
| [getFontName()](#getFontName--) | Liefert Font‑Face‑Name. |
| [getFontNames()](#getFontNames--) | Liefert Font‑Namen. |
| [getFontSaver()](#getFontSaver--) | Liefert Font‑Speicherfunktionalität. |
| [getFontStyle()](#getFontStyle--) | Liefert Font‑Stil. |
| [getFontType()](#getFontType--) | Liefert Font‑Typ. |
| [getGlyphAccessor()](#getGlyphAccessor--) | Font‑Glyph‑Zugriff. |
| [getGlyphById(GlyphId id)](#getGlyphById-com.aspose.font.GlyphId-) | Gibt Glyph nach Glyph-ID zurück. |
| [getGlyphById(String glyphName)](#getGlyphById-java.lang.String-) | Gibt Glyph nach Glyph-Namen zurück. |
| [getGlyphById(long id)](#getGlyphById-long-) | Gibt Glyph nach Glyph-ID zurück. |
| [getGlyphComponentsById(GlyphId id, GlyphIdList componentsToPopulate)](#getGlyphComponentsById-com.aspose.font.GlyphId-com.aspose.font.GlyphIdList-) | Liefert ein Glyph anhand der übergebenen Glyph‑Kennung und füllt die übergebene Liste von Glyph‑Kennungen mit den Komponenten dieses Glyphs. |
| [getGlyphComponentsById(String glyphName, GlyphIdList componentsToPopulate)](#getGlyphComponentsById-java.lang.String-com.aspose.font.GlyphIdList-) | Liefert ein Glyph anhand des übergebenen Glyph‑Namens und füllt die übergebene Liste von Glyph‑Kennungen mit den Komponenten dieses Glyphs. |
| [getGlyphComponentsById(long id, GlyphIdList componentsToPopulate)](#getGlyphComponentsById-long-com.aspose.font.GlyphIdList-) | Liefert ein Glyph anhand des übergebenen Glyph‑Index und füllt die übergebene Liste von Glyph‑Kennungen mit den Komponenten dieses Glyphs. |
| [getGlyphIdType()](#getGlyphIdType--) | Liefert Glyph-ID‑Typ‑Spezifikation. |
| [getGlyphsForText(String text)](#getGlyphsForText-java.lang.String-) | Erhalte Glyph‑Darstellung für Text. |
| [getMetrics()](#getMetrics--) | Liefert Font‑Metriken. |
| [getNumGlyphs()](#getNumGlyphs--) | Ermittelt die Anzahl der Glyphen im Font. |
| [getPostscriptNames()](#getPostscriptNames--) | Ermittelt die Postscript-Fontnamen. |
| [getStyle()](#getStyle--) | Liefert Font‑Stil. |
| [getTtfTables()](#getTtfTables--) | Ermittelt TTF-Tabellen. |
| [hashCode()](#hashCode--) |  |
| [isSymbolic()](#isSymbolic--) | Gibt true zurück, falls der Font symbolisch ist. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [open(FontDefinition fontDefinition)](#open-com.aspose.font.FontDefinition-) | Öffnet einen Font mithilfe eines FontDefinition-Objekts. |
| [open(FontType fontType, byte[] fontData)](#open-com.aspose.font.FontType-byte---) | Öffnet einen Font mithilfe des Font-Typs und eines Byte-Arrays mit Font-Daten. |
| [open(FontType fontType, StreamSource fontStreamSource)](#open-com.aspose.font.FontType-com.aspose.font.StreamSource-) | Öffnet einen Font mithilfe des Font-Typs und einer Stream-Quelle. |
| [open(FontType fontType, String fileName)](#open-com.aspose.font.FontType-java.lang.String-) | Öffnet einen Font mithilfe des Font-Typs und des Font-Dateinamens. |
| [save(OutputStream stream)](#save-java.io.OutputStream-) | Speichert den Font im Originalformat. |
| [save(String fileName)](#save-java.lang.String-) | Speichert den Font im Originalformat. |
| [saveToFormat(OutputStream stream, FontSavingFormats outFormat)](#saveToFormat-java.io.OutputStream-com.aspose.font.FontSavingFormats-) | Speichert den Font im angegebenen Format. |
| [setFontFamily(String value)](#setFontFamily-java.lang.String-) | Setzt die Font-Familie. |
| [setFontName(String value)](#setFontName-java.lang.String-) | Setzt den Font-Face-Namen. |
| [setStyle(String value)](#setStyle-java.lang.String-) | Setzt den Font-Stil. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### convert(FontType fontType) {#convert-com.aspose.font.FontType-}
```
public Font convert(FontType fontType)
```


Konvertiert den Font in ein anderes Format. Hinweis: Der TTF-Fonttyp wird derzeit nur unterstützt.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Font-Formattyp, in den konvertiert werden soll. |

**Returns:**
[Font](../../com.aspose.font/font) - Font converted into new format.
### convert(FontType fontType, Collection<Integer> limitingCharacterSet) {#convert-com.aspose.font.FontType-java.util.Collection-java.lang.Integer--}
```
public Font convert(FontType fontType, Collection<Integer> limitingCharacterSet)
```


Konvertiert die Font in ein anderes Format mit begrenztem Zeichensatz  *Hinweis: TTF Font-Typ wird jetzt nur noch unterstützt.*

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Font-Formattyp, in den konvertiert werden soll. |
| limitingCharacterSet | java.util.Collection<java.lang.Integer> | Begrenzender Zeichensatz. |

**Returns:**
[Font](../../com.aspose.font/font) - Font converted into new format.
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
### getAllGlyphIds() {#getAllGlyphIds--}
```
public GlyphId[] getAllGlyphIds()
```


Gibt ein Array aller Glyph‑IDs zurück, die im Font verfügbar sind. Eine Glyph‑ID ist eine eindeutige Nummer für eine Glyphe, die vom Font‑Typ abhängt. Eine TTF‑Font‑Glyph‑ID kann eine Instanz der Klasse ( GlyphStringId ) oder der Klasse ( GlyphUInt32Id ) sein. Die Glyph‑Adressierung nach Name (string) wird für TTF‑Fonts über das Post‑Tabellen‑Mapping unterstützt. Im Falle eines CFF‑Fonts werden die CFF‑Strukturen verwendet, um Glyphen per Name zu adressieren.

**Returns:**
com.aspose.font.GlyphId[] - Glyph‑Bezeichner.
### getCffFont() {#getCffFont--}
```
public Font getCffFont()
```


Liefert CFF Font, falls vorhanden.

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


Liefert Font‑Kodierung.

**Returns:**
[IFontEncoding](../../com.aspose.font/ifontencoding) - Font encoding.
### getFontDefinition() {#getFontDefinition--}
```
public FontDefinition getFontDefinition()
```


Liefert Font‑Definition.

**Returns:**
[FontDefinition](../../com.aspose.font/fontdefinition) - Font definition.
### getFontFamily() {#getFontFamily--}
```
public String getFontFamily()
```


Liefert Font‑Familie.

**Returns:**
java.lang.String - Font‑Familie.
### getFontName() {#getFontName--}
```
public String getFontName()
```


Liefert Font‑Face‑Name.

**Returns:**
java.lang.String - Font‑Face‑Name.
### getFontNames() {#getFontNames--}
```
public MultiLanguageString getFontNames()
```


Liefert Font‑Namen.

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Font names
### getFontSaver() {#getFontSaver--}
```
public IFontSaver getFontSaver()
```


Liefert Font‑Speicherfunktionalität.

**Returns:**
[IFontSaver](../../com.aspose.font/ifontsaver) - Font save functionality.
### getFontStyle() {#getFontStyle--}
```
public int getFontStyle()
```


Ermittelt den Font-Stil. Dies ist ein Wert, der berechnet und in einem generalisierten Typ dargestellt wird.

**Returns:**
int - Font-Stil. In der Regel eine Kombination von Konstanten‑Flag‑Werten der FontStyle‑Klasse oder 0.
### getFontType() {#getFontType--}
```
public FontType getFontType()
```


Ermittelt den Font-Typ. Gibt den Wert FontType.TTF zurück.

**Returns:**
[FontType](../../com.aspose.font/fonttype) - Font type.
### getGlyphAccessor() {#getGlyphAccessor--}
```
public IGlyphAccessor getGlyphAccessor()
```


Schriftzeichen-Glyph-Zugriff. Ruft Glyphs und Glyph-Identifikatoren ab.

**Returns:**
[IGlyphAccessor](../../com.aspose.font/iglyphaccessor) - Font glyph accessor.
### getGlyphById(GlyphId id) {#getGlyphById-com.aspose.font.GlyphId-}
```
public Glyph getGlyphById(GlyphId id)
```


Gibt ein Glyph anhand der Glyph-ID zurück. Die Glyph-ID ist eine eindeutige Nummer für ein Glyph, die vom Schriftarttyp abhängt. Die Glyph-ID einer TTF-Schrift kann eine Instanz der Klasse ( GlyphStringId ) oder der Klasse ( GlyphUInt32Id ) sein. Die Namens-(String-)Glyph-Adressierung wird für TTF-Schriften über die Post-Tabellen-Zuordnung unterstützt. Im Falle einer CFF-Schrift werden die CFF-Strukturen verwendet, um Glyphs über ihren Namen anzusprechen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| id | [GlyphId](../../com.aspose.font/glyphid) |  |

**Returns:**
[Glyph](../../com.aspose.font/glyph)
### getGlyphById(String glyphName) {#getGlyphById-java.lang.String-}
```
public Glyph getGlyphById(String glyphName)
```


Gibt ein Glyph anhand des Glyph-Namens zurück. Die Namens-(String-)Glyph-Adressierung wird für TTF-Schriften über die Post-Tabellen-Zuordnung unterstützt. Im Falle einer CFF-Schrift werden die CFF-Strukturen verwendet, um Glyphs über ihren Namen anzusprechen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| glyphName | java.lang.String | Glyph-String-Identifikator. |

**Returns:**
[Glyph](../../com.aspose.font/glyph) - Glyph.
### getGlyphById(long id) {#getGlyphById-long-}
```
public Glyph getGlyphById(long id)
```


Gibt Glyph nach Glyph-ID zurück.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| id | long | Glyph-Index. |

**Returns:**
[Glyph](../../com.aspose.font/glyph) - Glyph.
### getGlyphComponentsById(GlyphId id, GlyphIdList componentsToPopulate) {#getGlyphComponentsById-com.aspose.font.GlyphId-com.aspose.font.GlyphIdList-}
```
public void getGlyphComponentsById(GlyphId id, GlyphIdList componentsToPopulate)
```


Ermittelt ein Glyph anhand der übergebenen Glyph-Identifikator und füllt die übergebene Liste von Glyph-Identifikatoren mit den Komponenten dieses Glyphs. Die Glyph-ID ist eine eindeutige Nummer für ein Glyph, die vom Schriftarttyp abhängt. Die Glyph-ID einer TTF-Schrift kann eine Instanz der Klasse ( GlyphStringId ) oder der Klasse ( GlyphUInt32Id ) sein. Die Namens-(String-)Glyph-Adressierung wird für TTF-Schriften über die Post-Tabellen-Zuordnung unterstützt. Im Falle einer CFF-Schrift werden die CFF-Strukturen verwendet, um Glyphs über ihren Namen anzusprechen.

--------------------

Eine leere Sammlung componentsToPopulate sollte übergeben werden, die die Glyph-Komponenten-ID-Liste enthält.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| id | [GlyphId](../../com.aspose.font/glyphid) | Glyph-ID. |
| componentsToPopulate | [GlyphIdList](../../com.aspose.font/glyphidlist) | Liste der zu füllenden Glyph-Identifikatoren. |

### getGlyphComponentsById(String glyphName, GlyphIdList componentsToPopulate) {#getGlyphComponentsById-java.lang.String-com.aspose.font.GlyphIdList-}
```
public void getGlyphComponentsById(String glyphName, GlyphIdList componentsToPopulate)
```


Liefert ein Glyph anhand des übergebenen Glyph‑Namens und füllt die übergebene Liste von Glyph‑Kennungen mit den Komponenten dieses Glyphs.

--------------------

Eine leere Sammlung componentsToPopulate sollte übergeben werden, die die Glyph-Komponenten-ID-Liste enthält.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| glyphName | java.lang.String | Glyph-Name. |
| componentsToPopulate | [GlyphIdList](../../com.aspose.font/glyphidlist) | Liste der zu füllenden Glyph-Identifikatoren. |

### getGlyphComponentsById(long id, GlyphIdList componentsToPopulate) {#getGlyphComponentsById-long-com.aspose.font.GlyphIdList-}
```
public void getGlyphComponentsById(long id, GlyphIdList componentsToPopulate)
```


Liefert ein Glyph anhand des übergebenen Glyph‑Index und füllt die übergebene Liste von Glyph‑Kennungen mit den Komponenten dieses Glyphs.

--------------------

Eine leere Sammlung componentsToPopulate sollte übergeben werden, die die Glyph-Komponenten-ID-Liste enthält.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| id | long | Glyph-Index. |
| componentsToPopulate | [GlyphIdList](../../com.aspose.font/glyphidlist) | Liste der zu füllenden Glyph-Identifikatoren. |

### getGlyphIdType() {#getGlyphIdType--}
```
public GlyphIdType getGlyphIdType()
```


Liefert Glyph-ID‑Typ‑Spezifikation.

**Returns:**
[GlyphIdType](../../com.aspose.font/glyphidtype) - Glyph id type specification.
### getGlyphsForText(String text) {#getGlyphsForText-java.lang.String-}
```
public GlyphId[] getGlyphsForText(String text)
```


Erhalte Glyph‑Darstellung für Text.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| text | java.lang.String | Eingabetext. |

**Returns:**
com.aspose.font.GlyphId[] – GlyphId-Array.
### getMetrics() {#getMetrics--}
```
public IFontMetrics getMetrics()
```


Liefert Font‑Metriken.

**Returns:**
[IFontMetrics](../../com.aspose.font/ifontmetrics) - Font metrics.
### getNumGlyphs() {#getNumGlyphs--}
```
public int getNumGlyphs()
```


Ermittelt die Anzahl der Glyphen im Font.

**Returns:**
int – Anzahl der Glyphs in der Schrift.
### getPostscriptNames() {#getPostscriptNames--}
```
public MultiLanguageString getPostscriptNames()
```


Ermittelt die Postscript-Fontnamen.

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Postscript font names.
### getStyle() {#getStyle--}
```
public String getStyle()
```


Ermittelt den Schriftstil. Dies ist ein Roh-String-Wert, der von der Schriftdatei bereitgestellt wird.

**Returns:**
java.lang.String – Schriftstil.
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


Ermittelt TTF-Tabellen.

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


Gibt true zurück, falls der Font symbolisch ist.

**Returns:**
boolean – Wahr, falls die Schrift symbolisch ist.
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


Öffnet einen Font mithilfe eines FontDefinition-Objekts.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fontDefinition | [FontDefinition](../../com.aspose.font/fontdefinition) | Schriftdefinitions-Objekt. |

**Returns:**
[Font](../../com.aspose.font/font) - Font loaded.
### open(FontType fontType, byte[] fontData) {#open-com.aspose.font.FontType-byte---}
```
public static Font open(FontType fontType, byte[] fontData)
```


Öffnet einen Font mithilfe des Font-Typs und eines Byte-Arrays mit Font-Daten.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Schrifttyp. |
| fontData | byte[] | Byte-Array, aus dem die Schrift geladen wird. |

**Returns:**
[Font](../../com.aspose.font/font) - Font loaded.
### open(FontType fontType, StreamSource fontStreamSource) {#open-com.aspose.font.FontType-com.aspose.font.StreamSource-}
```
public static Font open(FontType fontType, StreamSource fontStreamSource)
```


Öffnet einen Font mithilfe des Font-Typs und einer Stream-Quelle.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Schrifttyp. |
| fontStreamSource | [StreamSource](../../com.aspose.font/streamsource) | Stream-Quelle für die Schrift. |

**Returns:**
[Font](../../com.aspose.font/font) - Font loaded.
### open(FontType fontType, String fileName) {#open-com.aspose.font.FontType-java.lang.String-}
```
public static Font open(FontType fontType, String fileName)
```


Öffnet einen Font mithilfe des Font-Typs und des Font-Dateinamens.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Schrifttyp. |
| fileName | java.lang.String | Schriftdateiname. |

**Returns:**
[Font](../../com.aspose.font/font) - Font loaded.
### save(OutputStream stream) {#save-java.io.OutputStream-}
```
public void save(OutputStream stream)
```


Speichert den Font im Originalformat.

--------------------

> ```
> Note: following Font types are supported for saving:
>  New TTF fonts;
>  TTF Font subsets;
>  CFF Font subsets;
>  Type1 Font subsets.
> ```

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stream | java.io.OutputStream | Stream zum Speichern der Schrift. |

### save(String fileName) {#save-java.lang.String-}
```
public void save(String fileName)
```


Speichert den Font im Originalformat.

--------------------

> ```
> Note: following Font types are supported for saving:
>  New TTF fonts;
>  TTF Font subsets;
>  CFF Font subsets;
>  Type1 Font subsets.
> ```

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fileName | java.lang.String | Datei zum Speichern der Schrift. |

### saveToFormat(OutputStream stream, FontSavingFormats outFormat) {#saveToFormat-java.io.OutputStream-com.aspose.font.FontSavingFormats-}
```
public void saveToFormat(OutputStream stream, FontSavingFormats outFormat)
```


Speichert den Font im angegebenen Format.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stream | java.io.OutputStream | Stream zum Speichern der Schrift |
| outFormat | [FontSavingFormats](../../com.aspose.font/fontsavingformats) | gewünschtes Format |

### setFontFamily(String value) {#setFontFamily-java.lang.String-}
```
public void setFontFamily(String value)
```


Setzt die Font-Familie.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | Neue Schriftfamilie. |

### setFontName(String value) {#setFontName-java.lang.String-}
```
public void setFontName(String value)
```


Setzt den Font-Face-Namen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | Neuer Schriftartname. |

### setStyle(String value) {#setStyle-java.lang.String-}
```
public void setStyle(String value)
```


Setzt Schriftstil. Dies ist ein Rohzeichenfolgenwert, der von der Schriftdatei bereitgestellt wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | Neuer Schriftstil. |

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

