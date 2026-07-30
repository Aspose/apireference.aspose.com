---
title: "Schriftart"
second_title: "Aspose.Font für Java API-Referenz"
description: "Stellt die Basisklasse Font dar."
type: docs
weight: 32
url: /de/java/com.aspose.font/font/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IFont](../../com.aspose.font/ifont), [com.aspose.font.IGlyphAccessor](../../com.aspose.font/iglyphaccessor), [com.aspose.font.IFontSaver](../../com.aspose.font/ifontsaver)
```
public abstract class Font implements IFont, IGlyphAccessor, IFontSaver
```

Stellt die Basisklasse Font dar.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [convert(FontType fontType)](#convert-com.aspose.font.FontType-) | Konvertiert die Font in ein anderes Format. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAllGlyphIds()](#getAllGlyphIds--) | Gibt alle Glyphen-IDs zurück, die in der Schrift verfügbar sind. |
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
| [getGlyphById(GlyphId id)](#getGlyphById-com.aspose.font.GlyphId-) | Gibt das Glyph anhand der Glyph‑ID zurück. |
| [getGlyphIdType()](#getGlyphIdType--) | Glyph id Typenspezifikation. |
| [getGlyphsForText(String text)](#getGlyphsForText-java.lang.String-) | Liest Glyphenrepräsentation für Text. |
| [getMetrics()](#getMetrics--) | Liefert Font‑Metriken. |
| [getNumGlyphs()](#getNumGlyphs--) | Ermittelt die Anzahl der Glyphen im Font. |
| [getPostscriptNames()](#getPostscriptNames--) | Ermittelt PostScript-Schriftartenamen. |
| [getStyle()](#getStyle--) | Liefert Font‑Stil. |
| [hashCode()](#hashCode--) |  |
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
public abstract Font convert(FontType fontType)
```


Konvertiert die Font in ein anderes Format.

--------------------

> ```
> Note: TTF Font type is now supported only.
> ```

fontType Schriftformattyp, in den konvertiert werden soll.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) |  |

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
public abstract GlyphId[] getAllGlyphIds()
```


Gibt alle Glyphen-IDs zurück, die in der Schrift verfügbar sind. Eine Glyphen-ID ist eine eindeutige Nummer für eine Glyphe, die vom Schriftarttyp abhängt. Zum Beispiel: Die ID von Type1 ist ein Glyphenname, eine Instanz der Klasse ( GlyphStringId ). Die ID von TTF ist ein int-Index, eine Instanz der Klasse ( GlyphInt32Id ).

**Returns:**
com.aspose.font.GlyphId[] - Glyph‑Bezeichner.
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


Liefert Font‑Kodierung.

**Returns:**
[IFontEncoding](../../com.aspose.font/ifontencoding) - Font encoding.
### getFontDefinition() {#getFontDefinition--}
```
public abstract FontDefinition getFontDefinition()
```


Liefert Font‑Definition.

**Returns:**
[FontDefinition](../../com.aspose.font/fontdefinition) - Font definition.
### getFontFamily() {#getFontFamily--}
```
public abstract String getFontFamily()
```


Liefert Font‑Familie.

**Returns:**
java.lang.String - Font‑Familie.
### getFontName() {#getFontName--}
```
public abstract String getFontName()
```


Liefert Font‑Face‑Name.

**Returns:**
java.lang.String - Font‑Face‑Name.
### getFontNames() {#getFontNames--}
```
public abstract MultiLanguageString getFontNames()
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
public abstract int getFontStyle()
```


Ermittelt den Font-Stil. Dies ist ein Wert, der berechnet und in einem generalisierten Typ dargestellt wird.

**Returns:**
int - Font-Stil. In der Regel eine Kombination von Konstanten‑Flag‑Werten der FontStyle‑Klasse oder 0.
### getFontType() {#getFontType--}
```
public abstract FontType getFontType()
```


Liefert Font‑Typ.

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


Schriftzeichen-Glyph-Zugriff. Ruft Glyphs und Glyph-Identifikatoren ab.

**Returns:**
[IGlyphAccessor](../../com.aspose.font/iglyphaccessor) - Font glyph accessor.
### getGlyphById(GlyphId id) {#getGlyphById-com.aspose.font.GlyphId-}
```
public abstract Glyph getGlyphById(GlyphId id)
```


Gibt die Glyphe anhand ihrer Glyphen-ID zurück. Eine Glyphen-ID ist eine eindeutige Nummer für eine Glyphe, die vom Schriftarttyp abhängt. GlyphId – abgeleitetes Objekt. Zum Beispiel: Die ID von Type1 ist ein Glyphenname, eine Instanz der Klasse ( GlyphStringId ). Die ID von TTF ist ein int-Index, eine Instanz der Klasse ( GlyphInt32Id ).

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| id | [GlyphId](../../com.aspose.font/glyphid) | Glyph-ID. |

**Returns:**
[Glyph](../../com.aspose.font/glyph) - Glyph.
### getGlyphIdType() {#getGlyphIdType--}
```
public abstract GlyphIdType getGlyphIdType()
```


Spezifikation des Glyphen-ID-Typs. Für Verbraucher, die den tatsächlichen Typ von 'bytes[]' kennen müssen.

**Returns:**
[GlyphIdType](../../com.aspose.font/glyphidtype) - Id type specification
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
### getMetrics() {#getMetrics--}
```
public abstract IFontMetrics getMetrics()
```


Liefert Font‑Metriken.

**Returns:**
[IFontMetrics](../../com.aspose.font/ifontmetrics) - Font metrics.
### getNumGlyphs() {#getNumGlyphs--}
```
public abstract int getNumGlyphs()
```


Ermittelt die Anzahl der Glyphen im Font.

**Returns:**
int – Anzahl der Glyphs in der Schrift.
### getPostscriptNames() {#getPostscriptNames--}
```
public abstract MultiLanguageString getPostscriptNames()
```


Ermittelt PostScript-Schriftartenamen.

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Postscript font names.
### getStyle() {#getStyle--}
```
public abstract String getStyle()
```


Ermittelt den Schriftstil. Dies ist ein Roh-String-Wert, der von der Schriftdatei bereitgestellt wird.

**Returns:**
java.lang.String – Schriftstil.
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
public abstract void setFontFamily(String value)
```


Setzt die Font-Familie.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | Neue Schriftfamilie. |

### setFontName(String value) {#setFontName-java.lang.String-}
```
public abstract void setFontName(String value)
```


Setzt den Font-Face-Namen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | Neuer Schriftartname. |

### setStyle(String value) {#setStyle-java.lang.String-}
```
public abstract void setStyle(String value)
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

