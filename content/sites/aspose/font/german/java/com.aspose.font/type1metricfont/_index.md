---
title: "Type1MetricFont"
second_title: "Aspose.Font für Java API-Referenz"
description: "Type1-Metrik-Schriftimplementierung."
type: docs
weight: 117
url: /de/java/com.aspose.font/type1metricfont/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.Font](../../com.aspose.font/font), [com.aspose.font.Type1Font](../../com.aspose.font/type1font)
```
public class Type1MetricFont extends Type1Font
```

Type1-Metrik-Schriftart-Implementierung. Diese Type1-Schriftart wird ausschließlich anhand von Metriken erstellt. Glyph‑Abruffunktionen und einige andere, die eine echte Schriftart benötigen, sind nicht erlaubt; nicht erlaubte Funktionen werfen die Ausnahme Type1NotSupportedException. Andere Eigenschaften (FontName, Weight, Metrics und Encoding) werden aus der Metrikdatei übernommen.

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
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [convert(FontType fontType)](#convert-com.aspose.font.FontType-) | Konvertiert die Font in ein anderes Format. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAllGlyphIds()](#getAllGlyphIds--) | Gibt alle Glyph‑IDs zurück, die in der Font verfügbar sind. |
| [getClass()](#getClass--) |  |
| [getEncoding()](#getEncoding--) | Kodierung ist in der Metrikdatei definiert. |
| [getFontDefinition()](#getFontDefinition--) | Liefert Font‑Definition. |
| [getFontFamily()](#getFontFamily--) | Liefert Font‑Familie. |
| [getFontName()](#getFontName--) | Ermittelt den Font‑Namen. |
| [getFontNames()](#getFontNames--) | Liefert Font‑Namen. |
| [getFontSaver()](#getFontSaver--) | Liefert Font‑Speicherfunktionalität. |
| [getFontStyle()](#getFontStyle--) | Liefert Font‑Stil. |
| [getFontType()](#getFontType--) | Liefert Font‑Typ. |
| [getGlyphAccessor()](#getGlyphAccessor--) | Font‑Glyph‑Zugriff. |
| [getGlyphById(GlyphId id)](#getGlyphById-com.aspose.font.GlyphId-) | Gibt das Glyph anhand der Glyph‑ID zurück. |
| [getGlyphById(String id)](#getGlyphById-java.lang.String-) | Gibt das Glyph anhand der Glyph‑ID zurück. |
| [getGlyphById(long id)](#getGlyphById-long-) | Gibt Glyph nach Glyph-ID zurück. |
| [getGlyphIdType()](#getGlyphIdType--) | Glyph id Typenspezifikation. |
| [getGlyphsForText(String text)](#getGlyphsForText-java.lang.String-) | Liest Glyphenrepräsentation für Text. |
| [getMetrics()](#getMetrics--) | Liefert Font‑Metriken. |
| [getNumGlyphs()](#getNumGlyphs--) | Ermittelt die Anzahl der Glyphen im Font. |
| [getPostscriptNames()](#getPostscriptNames--) | Liest Postscript-Schriftnamen. |
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


Konvertiert die Font in ein anderes Format.

> ```
> Note: TTF Font type is now supported only.
> ```

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


Gibt alle Glyph‑IDs zurück, die in der Font verfügbar sind. Nicht unterstützt für den Typ Type1MetricFont.

**Returns:**
com.aspose.font.GlyphId[] - Alle Glyph‑Bezeichner, die in der Font verfügbar sind.
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


Kodierung ist in der Metrikdatei definiert. StandardAdobeEncoding: Die Kodierung wird automatisch gefüllt.

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


Ermittelt den Font‑Namen.

**Returns:**
java.lang.String - Schriftartname.
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
int - Ermittelt den Font‑Stil. In der Regel eine Kombination von Konstanten‑Flag‑Werten der FontStyle‑Klasse oder 0.
### getFontType() {#getFontType--}
```
public FontType getFontType()
```


Ermittelt den Font-Typ. Gibt den Wert FontType.Type1 zurück.

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


Gibt das Glyph anhand der Glyph‑ID zurück. Nicht unterstützt für den Typ (@code Type1MetricFont\}.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| id | [GlyphId](../../com.aspose.font/glyphid) | Glyph‑Bezeichner. |

**Returns:**
[Glyph](../../com.aspose.font/glyph) - Glyph.
### getGlyphById(String id) {#getGlyphById-java.lang.String-}
```
public Glyph getGlyphById(String id)
```


Gibt das Glyph anhand der Glyph‑ID zurück. Nicht unterstützt für den Typ (@code Type1MetricFont\}.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| id | java.lang.String | Glyph‑Bezeichner. |

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


Glyph id Typenspezifikation.

**Returns:**
[GlyphIdType](../../com.aspose.font/glyphidtype)
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
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Postscript Font names
### getStyle() {#getStyle--}
```
public String getStyle()
```


Liefert Font‑Stil.

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


Der Style-Setter ist noch nicht implementiert. Dies ist ein Rohzeichenfolgenwert, der von der Font-Datei bereitgestellt wird.

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

