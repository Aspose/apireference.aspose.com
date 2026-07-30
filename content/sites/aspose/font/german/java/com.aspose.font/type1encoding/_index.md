---
title: "Type1Encoding"
second_title: "Aspose.Font für Java API-Referenz"
description: "Stellt die Type1-Schriftkodierung dar."
type: docs
weight: 114
url: /de/java/com.aspose.font/type1encoding/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IFontEncoding](../../com.aspose.font/ifontencoding), [com.aspose.font.ISupportsNameAddressing](../../com.aspose.font/isupportsnameaddressing)
```
public class Type1Encoding implements IFontEncoding, ISupportsNameAddressing
```

Stellt die Type1-Schriftkodierung dar.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [decodeToGid(long charCode)](#decodeToGid-long-) | Dekodiert Gid zu Unicode. |
| [decodeToGidParameterized(IEncodingParameters parameters, long charCode)](#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-) | Parametrisierte Dekodiermethode. |
| [encode(long gid, long charCode)](#encode-long-long-) | Kodiert den Glyph. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getNameToCharCodeIndex()](#getNameToCharCodeIndex--) | Gibt die Zuordnung von Namen zu Zeichencode‑Kodierung zurück. |
| [gidToUnicode(GlyphId gid)](#gidToUnicode-com.aspose.font.GlyphId-) | Dekodiert Gid zu Unicode. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [unicodeToGid(long unicode)](#unicodeToGid-long-) | Gibt GlyphId für Unicode zurück. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### decodeToGid(long charCode) {#decodeToGid-long-}
```
public GlyphId decodeToGid(long charCode)
```


Dekodiert Gid zu Unicode. Glyph‑Id ist eine eindeutige Nummer für ein Glyph, die vom Font‑Typ abhängt. Zum Beispiel: Die Id von Type1 ist ein Glyph‑Name, eine Instanz der Klasse ( GlyphStringId ). Die Id von TTF ist ein int‑Index, eine Instanz der Klasse ( GlyphUInt32Id ).

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| charCode | long | Zeichencode, für den der Glyph‑Bezeichner ermittelt werden soll. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to character code passed.
### decodeToGidParameterized(IEncodingParameters parameters, long charCode) {#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-}
```
public GlyphId decodeToGidParameterized(IEncodingParameters parameters, long charCode)
```


Parametrisierte Dekodiermethode. Nicht unterstützt für den Font‑Typ Type1.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| parameters | [IEncodingParameters](../../com.aspose.font/iencodingparameters) | Nicht unterstützt für den Font‑Typ Type1. |
| charCode | long | Nicht unterstützt für den Font‑Typ Type1. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Not supported for Type1 Font type.
### encode(long gid, long charCode) {#encode-long-long-}
```
public void encode(long gid, long charCode)
```


Kodiert das Glyph. Für TTF‑Fonts ist der Zeichencode Unicode. Nicht unterstützt für Font‑Typen vom Typ Type1.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| gid | long | Glyph-ID. |
| charCode | long | Zeichencode, der mit der Glyph‑Id verknüpft ist. |

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
### getNameToCharCodeIndex() {#getNameToCharCodeIndex--}
```
public NameToCodeMap getNameToCharCodeIndex()
```


Gibt die Zuordnung von Namen zu Zeichencode‑Kodierung zurück. Hinweis: Der Zeichencode ist kein Unicode. Der Zeichencode ist ein Zeichen‑Index in der Font‑Kodierungstabelle "table".

**Returns:**
[NameToCodeMap](../../com.aspose.font/nametocodemap) - Name to character code encoding map.
### gidToUnicode(GlyphId gid) {#gidToUnicode-com.aspose.font.GlyphId-}
```
public long gidToUnicode(GlyphId gid)
```


Dekodiert Gid zu Unicode. Glyph‑Id ist eine eindeutige Nummer für ein Glyph, die vom Font‑Typ abhängt. Zum Beispiel: Die Id von Type1 ist ein Glyph‑Name, eine Instanz der Klasse ( GlyphStringId ). Die Id von TTF ist ein int‑Index, eine Instanz der Klasse ( GlyphUInt32Id ).

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| gid | [GlyphId](../../com.aspose.font/glyphid) | Glyph‑Bezeichner des zu dekodierenden Symbols. |

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


Gibt GlyphId für Unicode zurück. Oder notdef, falls das Font keinen Glyph für das Unicode enthält. Glyph‑Id ist eine eindeutige Nummer für ein Glyph, die vom Font‑Typ abhängt. Zum Beispiel: Die Id von Type1 ist ein Glyph‑Name, eine Instanz der Klasse ( GlyphStringId ). Die Id von TTF ist ein int‑Index, eine Instanz der Klasse ( GlyphUInt32Id ).

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

