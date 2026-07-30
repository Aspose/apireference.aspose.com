---
title: "FontEnvironment"
second_title: "Aspose.Font för Java API-referens"
description: "Tillhandahåller information om den aktuella miljön och plattformen."
type: docs
weight: 39
url: /sv/java/com.aspose.font/fontenvironment/
---
**Inheritance:**
java.lang.Object
```
public class FontEnvironment
```

Tillhandahåller information om den aktuella miljön och plattformen.
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getCffCommonFontsSettings()](#getCffCommonFontsSettings--) | Inställningar gemensamma för CFF-teckensnitt. |
| [getClass()](#getClass--) |  |
| [getCurrent()](#getCurrent--) | Hämtar aktuell miljö. |
| [getCurrentPlatformId()](#getCurrentPlatformId--) | Hämtar aktuellt plattforms-ID. |
| [getFontSpecificEncodings()](#getFontSpecificEncodings--) | Lagrar specifika kodningar för konsumentmedvetna teckensnitt. |
| [getStrictness()](#getStrictness--) | Vissa teckensnitt kan innehålla oväntade data, ospecificerade funktioner eller kan vara grovt beskurna. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setStrictness(FontEnvironment.ParsingStrictness value)](#setStrictness-com.aspose.font.FontEnvironment.ParsingStrictness-) | Vissa teckensnitt kan innehålla oväntade data, ospecificerade funktioner eller kan vara grovt beskurna. |
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
### getCffCommonFontsSettings() {#getCffCommonFontsSettings--}
```
public static CffFontsSettings getCffCommonFontsSettings()
```


Inställningar gemensamma för CFF-teckensnitt.

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


Hämtar aktuell miljö.

**Returns:**
[FontEnvironment](../../com.aspose.font/fontenvironment) - Current environment.
### getCurrentPlatformId() {#getCurrentPlatformId--}
```
public int getCurrentPlatformId()
```


Hämtar aktuellt plattforms-ID.

**Returns:**
int - Aktuellt plattforms-ID.
### getFontSpecificEncodings() {#getFontSpecificEncodings--}
```
public FontSpecificEncodings getFontSpecificEncodings()
```


Lagrar specifika kodningar för konsumentmedvetna teckensnitt. Till exempel använder PDF specifika kodningar för Adobe Symbol och ZapfDingbats.

**Returns:**
[FontSpecificEncodings](../../com.aspose.font/fontspecificencodings) - Specific encodings for consumer-aware Fonts.
### getStrictness() {#getStrictness--}
```
public FontEnvironment.ParsingStrictness getStrictness()
```


Vissa teckensnitt kan innehålla oväntade data, ospecificerade funktioner eller kan vara grovt beskurna. En tolerant inställning rekommenderas för konsumenter som vill öppna vilket teckensnitt som helst oavsett eventuell otillräcklighet. Teckensnittens interna strukturer garanteras inte att vara konsekventa. En strikt inställning rekommenderas för konsumenter som vill öppna mestadels giltiga och solida teckensnitt.

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


Vissa teckensnitt kan innehålla oväntade data, ospecificerade funktioner eller kan vara grovt beskurna. En tolerant inställning rekommenderas för konsumenter som vill öppna vilket teckensnitt som helst oavsett eventuell otillräcklighet. Teckensnittens interna strukturer garanteras inte att vara konsekventa. En strikt inställning rekommenderas för konsumenter som vill öppna mestadels giltiga och solida teckensnitt.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | [ParsingStrictness](../../com.aspose.font/parsingstrictness) | Strikthet. |

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

