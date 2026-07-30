---
title: "FontEnvironment"
second_title: "Aspose.Font für Java API-Referenz"
description: "Bietet Informationen über die aktuelle Umgebung und Plattform."
type: docs
weight: 39
url: /de/java/com.aspose.font/fontenvironment/
---
**Inheritance:**
java.lang.Object
```
public class FontEnvironment
```

Bietet Informationen über die aktuelle Umgebung und Plattform.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getCffCommonFontsSettings()](#getCffCommonFontsSettings--) | Gemeinsame Einstellungen für CFF-Schriften. |
| [getClass()](#getClass--) |  |
| [getCurrent()](#getCurrent--) | Liest die aktuelle Umgebung. |
| [getCurrentPlatformId()](#getCurrentPlatformId--) | Liest die aktuelle Plattform-ID. |
| [getFontSpecificEncodings()](#getFontSpecificEncodings--) | Speichert spezifische Kodierungen für verbraucherbewusste Schriften. |
| [getStrictness()](#getStrictness--) | Einige Schriften können unerwartete Daten, nicht spezifizierte Funktionen oder grob beschnittene Bereiche enthalten. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setStrictness(FontEnvironment.ParsingStrictness value)](#setStrictness-com.aspose.font.FontEnvironment.ParsingStrictness-) | Einige Schriften können unerwartete Daten, nicht spezifizierte Funktionen oder grob beschnittene Bereiche enthalten. |
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
### getCffCommonFontsSettings() {#getCffCommonFontsSettings--}
```
public static CffFontsSettings getCffCommonFontsSettings()
```


Gemeinsame Einstellungen für CFF-Schriften.

**Returns:**
[CffFontsSettings](../../com.aspose.font/cfffontssettings)
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getCurrent() {#getCurrent--}
```
public static FontEnvironment getCurrent()
```


Liest die aktuelle Umgebung.

**Returns:**
[FontEnvironment](../../com.aspose.font/fontenvironment) - Current environment.
### getCurrentPlatformId() {#getCurrentPlatformId--}
```
public int getCurrentPlatformId()
```


Liest die aktuelle Plattform-ID.

**Returns:**
int – aktuelle Plattform-ID.
### getFontSpecificEncodings() {#getFontSpecificEncodings--}
```
public FontSpecificEncodings getFontSpecificEncodings()
```


Speichert spezifische Kodierungen für verbraucherbewusste Schriften. Zum Beispiel verwendet PDF spezifische Kodierungen für Adobe Symbol und ZapfDingbats.

**Returns:**
[FontSpecificEncodings](../../com.aspose.font/fontspecificencodings) - Specific encodings for consumer-aware Fonts.
### getStrictness() {#getStrictness--}
```
public FontEnvironment.ParsingStrictness getStrictness()
```


Einige Schriften können unerwartete Daten, nicht spezifizierte Funktionen oder grob beschnittene Bereiche enthalten. Eine tolerante Einstellung wird für Verbraucher empfohlen, die jede Schrift öffnen möchten, ungeachtet möglicher Unzulänglichkeiten der Schrift. Interne Schriftstrukturen sind nicht garantiert konsistent. Eine strenge Einstellung wird für Verbraucher empfohlen, die überwiegend gültige und solide Schriften öffnen möchten.

**Returns:**
[ParsingStrictness](../../com.aspose.font/parsingstrictness) - Strictness.
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




### setStrictness(FontEnvironment.ParsingStrictness value) {#setStrictness-com.aspose.font.FontEnvironment.ParsingStrictness-}
```
public void setStrictness(FontEnvironment.ParsingStrictness value)
```


Einige Schriften können unerwartete Daten, nicht spezifizierte Funktionen oder grob beschnittene Bereiche enthalten. Eine tolerante Einstellung wird für Verbraucher empfohlen, die jede Schrift öffnen möchten, ungeachtet möglicher Unzulänglichkeiten der Schrift. Interne Schriftstrukturen sind nicht garantiert konsistent. Eine strenge Einstellung wird für Verbraucher empfohlen, die überwiegend gültige und solide Schriften öffnen möchten.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [ParsingStrictness](../../com.aspose.font/parsingstrictness) | Striktheit. |

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

