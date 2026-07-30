---
title: "TtfEncoding"
second_title: "Aspose.Font für Java API-Referenz"
description: "Stellt die TTF Schriftkodierung dar."
type: docs
weight: 92
url: /de/java/com.aspose.font/ttfencoding/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IFontEncoding](../../com.aspose.font/ifontencoding)
```
public class TtfEncoding implements IFontEncoding
```

Stellt die TTF Schriftkodierung dar.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [decodeToGid(long unicode)](#decodeToGid-long-) | Die DecodeToGlyphId-Implementierung der TTF-Schrift findet die Unicode-Tabelle und gibt die Glyph-ID für das Unicode-Zeichen zurück. |
| [decodeToGidParameterized(IEncodingParameters parameters, long charCode)](#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-) | Die parametrische Version ermöglicht die Verwendung einer spezifischen CMap-Tabelle (nicht Unicode). |
| [encode(long gid, long charCode)](#encode-long-long-) | Kodiert den Glyph. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [gidToUnicode(GlyphId glyphId)](#gidToUnicode-com.aspose.font.GlyphId-) | Dekodiert Glyph-ID zu Unicode. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [unicodeToGid(long unicode)](#unicodeToGid-long-) | Dekodiert ein Unicode-Zeichen und gibt die Glyph-ID zurück. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### decodeToGid(long unicode) {#decodeToGid-long-}
```
public GlyphId decodeToGid(long unicode)
```


Die DecodeToGlyphId-Implementierung der TTF-Schrift findet die Unicode-Tabelle und gibt die Glyph-ID für das Unicode-Zeichen zurück. Die Glyph-ID ist eine eindeutige Nummer für ein Glyph, die vom Schrifttyp abhängt. Zum Beispiel: Die ID von Type1 ist ein Glyph-Name, eine Instanz der Klasse ( GlyphStringId ). Die ID von TTF ist ein int-Index, eine Instanz der Klasse ( GlyphUInt32Id ).

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| unicode | long | Zeichencode, für den der Glyph‑Bezeichner ermittelt werden soll. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to character code passed.
### decodeToGidParameterized(IEncodingParameters parameters, long charCode) {#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-}
```
public GlyphId decodeToGidParameterized(IEncodingParameters parameters, long charCode)
```


Die parametrische Version ermöglicht die Verwendung einer spezifischen CMap-Tabelle (nicht Unicode).

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| parameters | [IEncodingParameters](../../com.aspose.font/iencodingparameters) | Implementierung des Interfaces IEncodingParameters. |
| charCode | long | Zeichencode, um den Glyph-Bezeichner zu erhalten. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to character code passed.
### encode(long gid, long charCode) {#encode-long-long-}
```
public void encode(long gid, long charCode)
```


Kodiert das Glyph. Bei TTF-Schriften ist der Zeichencode Unicode.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| gid | long | Glyph‑Bezeichner. |
| charCode | long | Zeichencode. |

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
### gidToUnicode(GlyphId glyphId) {#gidToUnicode-com.aspose.font.GlyphId-}
```
public long gidToUnicode(GlyphId glyphId)
```


Dekodiert Glyph-ID zu Unicode. Die Glyph-ID ist eine eindeutige Nummer für ein Glyph, die vom Schrifttyp abhängt. Zum Beispiel: Die ID von Type1 ist ein Glyph-Name, eine Instanz der Klasse ( GlyphStringId ). Die ID von TTF ist ein int-Index, eine Instanz der Klasse ( GlyphUInt32Id ).

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | Glyph‑Bezeichner des zu dekodierenden Symbols. |

**Returns:**
long – Unicode‑Wert, der zur übergebenen Glyph‑Id gehört.
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




### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### unicodeToGid(long unicode) {#unicodeToGid-long-}
```
public GlyphId unicodeToGid(long unicode)
```


Dekodiert ein Unicode-Zeichen und gibt die Glyph-ID zurück.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| unicode | long | Unicode, für den der Glyph‑Bezeichner ermittelt werden soll. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to unicode passed.
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

