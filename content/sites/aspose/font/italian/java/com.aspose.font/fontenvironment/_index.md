---
title: "FontEnvironment"
second_title: "Riferimento API Aspose.Font per Java"
description: "Fornisce informazioni sull'ambiente e sulla piattaforma corrente."
type: docs
weight: 39
url: /it/java/com.aspose.font/fontenvironment/
---
**Inheritance:**
java.lang.Object
```
public class FontEnvironment
```

Fornisce informazioni sull'ambiente e sulla piattaforma corrente.
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getCffCommonFontsSettings()](#getCffCommonFontsSettings--) | Impostazioni comuni ai font CFF. |
| [getClass()](#getClass--) |  |
| [getCurrent()](#getCurrent--) | Ottiene l'ambiente corrente. |
| [getCurrentPlatformId()](#getCurrentPlatformId--) | Ottiene l'ID della piattaforma corrente. |
| [getFontSpecificEncodings()](#getFontSpecificEncodings--) | Memorizza codifiche specifiche per i Font orientati al consumatore. |
| [getStrictness()](#getStrictness--) | Alcuni Font possono contenere dati inattesi, funzionalità non specificate o possono essere approssimativamente ritagliati. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setStrictness(FontEnvironment.ParsingStrictness value)](#setStrictness-com.aspose.font.FontEnvironment.ParsingStrictness-) | Alcuni Font possono contenere dati inattesi, funzionalità non specificate o possono essere approssimativamente ritagliati. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getCffCommonFontsSettings() {#getCffCommonFontsSettings--}
```
public static CffFontsSettings getCffCommonFontsSettings()
```


Impostazioni comuni ai font CFF.

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


Ottiene l'ambiente corrente.

**Returns:**
[FontEnvironment](../../com.aspose.font/fontenvironment) - Current environment.
### getCurrentPlatformId() {#getCurrentPlatformId--}
```
public int getCurrentPlatformId()
```


Ottiene l'ID della piattaforma corrente.

**Returns:**
int - ID della piattaforma corrente.
### getFontSpecificEncodings() {#getFontSpecificEncodings--}
```
public FontSpecificEncodings getFontSpecificEncodings()
```


Memorizza codifiche specifiche per i Font orientati al consumatore. Ad esempio, PDF utilizza codifiche specifiche Adobe Symbol e ZapfDingbats.

**Returns:**
[FontSpecificEncodings](../../com.aspose.font/fontspecificencodings) - Specific encodings for consumer-aware Fonts.
### getStrictness() {#getStrictness--}
```
public FontEnvironment.ParsingStrictness getStrictness()
```


Alcuni Font possono contenere dati inattesi, funzionalità non specificate o possono essere approssimativamente ritagliati. Si consiglia l'impostazione tollerante per i consumatori che desiderano aprire qualsiasi font indipendentemente da eventuali inadeguatezze del Font. Le strutture interne dei Font non sono garantite come coerenti. Si consiglia l'impostazione rigorosa per i consumatori che desiderano aprire principalmente Font validi e solidi.

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


Alcuni Font possono contenere dati inattesi, funzionalità non specificate o possono essere approssimativamente ritagliati. Si consiglia l'impostazione tollerante per i consumatori che desiderano aprire qualsiasi font indipendentemente da eventuali inadeguatezze del Font. Le strutture interne dei Font non sono garantite come coerenti. Si consiglia l'impostazione rigorosa per i consumatori che desiderano aprire principalmente Font validi e solidi.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | [ParsingStrictness](../../com.aspose.font/parsingstrictness) | Rigorosità. |

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
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

