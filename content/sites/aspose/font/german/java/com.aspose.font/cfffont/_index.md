---
title: "CffFont"
second_title: "Aspose.Font für Java API-Referenz"
description: "Stellt das Compact Font Format CFF dar."
type: docs
weight: 19
url: /de/java/com.aspose.font/cfffont/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.Font](../../com.aspose.font/font)
```
public class CffFont extends Font
```

Stellt das Compact Font Format (CFF) dar.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [convert(FontType fontType)](#convert-com.aspose.font.FontType-) | Konvertiert die Font in ein anderes Format. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAllGlyphIds()](#getAllGlyphIds--) | Gibt ein Array aller Glyph-IDs zurück, die in der Font verfügbar sind. |
| [getClass()](#getClass--) |  |
| [getCommonFontsSettings()](#getCommonFontsSettings--) | Liest Einstellungen, die für CFF-Schriften gemeinsam sind. |
| [getEncoding()](#getEncoding--) | Liefert Font‑Kodierung. |
| [getFontDefinition()](#getFontDefinition--) | Liest Schriftdefinition. |
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
| [getGlyphIdType()](#getGlyphIdType--) | Liefert Glyph-ID‑Typ‑Spezifikation. |
| [getGlyphsForText(String text)](#getGlyphsForText-java.lang.String-) | Liest Glyphenrepräsentation für Text. |
| [getIndexDataProvider(CffIndexProviderType indexType)](#getIndexDataProvider-com.aspose.font.CffIndexProviderType-) | Liest Anbieter für den angegebenen CFF INDEX-Strukturtyp. |
| [getMetrics()](#getMetrics--) | Liefert Font‑Metriken. |
| [getNumGlyphs()](#getNumGlyphs--) | Ermittelt die Anzahl der Glyphen im Font. |
| [getPostscriptNames()](#getPostscriptNames--) | Liest Postscript-Schriftnamen. |
| [getStyle()](#getStyle--) | Liefert Font‑Stil. |
| [getTopDictDataProvider()](#getTopDictDataProvider--) |  |
| [hashCode()](#hashCode--) |  |
| [isCidKeyedFont()](#isCidKeyedFont--) | Liest Wert, der anzeigt, dass die Schrift cid-gebunden ist. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [open(FontDefinition fontDefinition)](#open-com.aspose.font.FontDefinition-) | Öffnet einen Font mithilfe eines FontDefinition-Objekts. |
| [open(FontType fontType, byte[] fontData)](#open-com.aspose.font.FontType-byte---) | Öffnet einen Font mithilfe des Font-Typs und eines Byte-Arrays mit Font-Daten. |
| [open(FontType fontType, StreamSource fontStreamSource)](#open-com.aspose.font.FontType-com.aspose.font.StreamSource-) | Öffnet einen Font mithilfe des Font-Typs und einer Stream-Quelle. |
| [open(FontType fontType, String fileName)](#open-com.aspose.font.FontType-java.lang.String-) | Öffnet einen Font mithilfe des Font-Typs und des Font-Dateinamens. |
| [save(OutputStream stream)](#save-java.io.OutputStream-) | Speichert den Font im Originalformat. |
| [save(String fileName)](#save-java.lang.String-) | Speichert den Font im Originalformat. |
| [saveToFormat(OutputStream stream, FontSavingFormats outFormat)](#saveToFormat-java.io.OutputStream-com.aspose.font.FontSavingFormats-) | Speichert den Font im angegebenen Format. |
| [setCommonFontsSettings(CffFontsSettings value)](#setCommonFontsSettings-com.aspose.font.CffFontsSettings-) | Legt Einstellungen fest, die für CFF-Schriften gemeinsam sind. |
| [setFontFamily(String value)](#setFontFamily-java.lang.String-) | Der Setter für die Schriftfamilie ist noch nicht implementiert. |
| [setFontName(String value)](#setFontName-java.lang.String-) | Der Setter für den Schriftartnamen ist noch nicht implementiert. |
| [setStyle(String value)](#setStyle-java.lang.String-) | Der Setter für den Stil ist noch nicht implementiert. |
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


Gibt ein Array aller Glyph-IDs zurück, die in der Schrift verfügbar sind. Eine Glyph-ID ist eine eindeutige Nummer für ein Glyph, die vom Schrifttyp abhängt. Eine CFF-Schrift-Glyph-ID kann eine Instanz der Klasse ( GlyphStringId ) oder der Klasse ( GlyphUInt32Id ) sein.

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


Liest Einstellungen, die für CFF-Schriften gemeinsam sind. Diese Einstellungen werden in verschiedenen Szenarien verwendet und können für jede einzelne Schrift geändert werden.

**Returns:**
[CffFontsSettings](../../com.aspose.font/cfffontssettings) - Font definition.
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


Liest Schriftdefinition.

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
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Font names.
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


Liest Schrifttyp. Gibt den Wert FontType.CFF zurück.

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


Gibt ein Glyph anhand seiner Glyph-ID zurück. Eine Glyph-ID ist eine eindeutige Nummer für ein Glyph, die vom Schrifttyp abhängt. Eine CFF-Schrift-Glyph-ID kann eine Instanz der Klasse ( GlyphStringId ) oder der Klasse ( GlyphInt32Id ) sein.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| id | [GlyphId](../../com.aspose.font/glyphid) | Glyph-ID. |

**Returns:**
[Glyph](../../com.aspose.font/glyph) - Glyph.
### getGlyphById(String glyphName) {#getGlyphById-java.lang.String-}
```
public Glyph getGlyphById(String glyphName)
```


Gibt Glyph nach Glyph-Namen zurück.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| glyphName | java.lang.String | Glyph-Name. |

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
| id | long | Glyph-ID. |

**Returns:**
[Glyph](../../com.aspose.font/glyph) - Glyph.
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


Liest Glyphenrepräsentation für Text.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| text | java.lang.String | Eingabetext. |

**Returns:**
com.aspose.font.GlyphId[] – GlyphId-Array.
### getIndexDataProvider(CffIndexProviderType indexType) {#getIndexDataProvider-com.aspose.font.CffIndexProviderType-}
```
public ICffIndexDataProvider getIndexDataProvider(CffIndexProviderType indexType)
```


Liest Anbieter für den angegebenen CFF INDEX-Strukturtyp.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| indexType | [CffIndexProviderType](../../com.aspose.font/cffindexprovidertype) | Typ der INDEX-Struktur. |

**Returns:**
[ICffIndexDataProvider](../../com.aspose.font/icffindexdataprovider) - Implementation of ( ICffIndexDataProvider ) interface.
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


Liest Postscript-Schriftnamen.

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Postscript Font names.
### getStyle() {#getStyle--}
```
public String getStyle()
```


Ermittelt den Schriftstil. Dies ist ein Roh-String-Wert, der von der Schriftdatei bereitgestellt wird.

**Returns:**
java.lang.String – Schriftstil.
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


Liest Wert, der anzeigt, dass die Schrift cid-gebunden ist.

**Returns:**
boolean - Wert, der anzeigt, dass die Schrift cid-gebunden ist.
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

### setCommonFontsSettings(CffFontsSettings value) {#setCommonFontsSettings-com.aspose.font.CffFontsSettings-}
```
public void setCommonFontsSettings(CffFontsSettings value)
```


Legt Einstellungen fest, die für CFF-Schriften gemeinsam sind.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [CffFontsSettings](../../com.aspose.font/cfffontssettings) | Schriftdefinition. |

### setFontFamily(String value) {#setFontFamily-java.lang.String-}
```
public void setFontFamily(String value)
```


Der Setter für die Schriftfamilie ist noch nicht implementiert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | Neue Schriftfamilie. |

### setFontName(String value) {#setFontName-java.lang.String-}
```
public void setFontName(String value)
```


Der Setter für den Schriftartnamen ist noch nicht implementiert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | Neuer Schriftartname. |

### setStyle(String value) {#setStyle-java.lang.String-}
```
public void setStyle(String value)
```


Der Setter für den Stil ist noch nicht implementiert.

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

