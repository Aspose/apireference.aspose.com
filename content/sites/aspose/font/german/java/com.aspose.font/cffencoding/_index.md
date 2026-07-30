---
title: "CffEncoding"
second_title: "Aspose.Font für Java API-Referenz"
description: "Stellt die CFF _font-Kodierung dar."
type: docs
weight: 18
url: /de/java/com.aspose.font/cffencoding/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IFontEncoding](../../com.aspose.font/ifontencoding), [com.aspose.font.ISupportsNameAddressing](../../com.aspose.font/isupportsnameaddressing)
```
public class CffEncoding implements IFontEncoding, ISupportsNameAddressing
```

Stellt die CFF \_font‑Kodierung dar.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [decodeToGid(long charCode)](#decodeToGid-long-) | Liefert Gid für übergebenen charCode. |
| [decodeToGidParameterized(IEncodingParameters parameters, long charCode)](#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-) | Parametrisierte Dekodiermethode. |
| [encode(long gid, long charCode)](#encode-long-long-) | Kodiert den Glyph. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getNameToCharCodeIndex()](#getNameToCharCodeIndex--) | Gibt die Zuordnung von Namen zu Zeichencode‑Kodierung zurück. |
| [getNameToGidIndex()](#getNameToGidIndex--) | Gibt die Zuordnung von Namen zu Zeichencode‑Kodierung zurück. |
| [getNameToSidIndex()](#getNameToSidIndex--) | Gibt die Zuordnung von Namen zu Zeichencode‑Kodierung zurück. |
| [getSidName(int sid)](#getSidName-int-) | Liefert Namen für die angegebene SID. |
| [gidToUnicode(GlyphId gid)](#gidToUnicode-com.aspose.font.GlyphId-) | Dekodiert Gid zu Unicode. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [unicodeToGid(long unicode)](#unicodeToGid-long-) | Dekodiert ein Unicode-Zeichen und gibt die Glyph-ID zurück. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### decodeToGid(long charCode) {#decodeToGid-long-}
```
public GlyphId decodeToGid(long charCode)
```


Liefert Gid für übergebenen charCode. Diese Methode ist für CFF CIDFonts konzipiert, bei denen charCode einen gültigen CID-Wert darstellen muss. Glyph id ist eine eindeutige Nummer für ein Glyph, die vom \_font-Typ abhängt. CFF Font Glyph id kann eine Instanz der Klasse ( GlyphStringId ) oder der Klasse ( GlyphUInt32Id ) sein.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| charCode | long | Zeichencode (CID), für den ein Glyph-Identifikator ermittelt werden soll. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to CID passed.
### decodeToGidParameterized(IEncodingParameters parameters, long charCode) {#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-}
```
public GlyphId decodeToGidParameterized(IEncodingParameters parameters, long charCode)
```


Parametrisierte Dekodiermethode. Nicht unterstützt für den CFF Font-Typ.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| parameters | [IEncodingParameters](../../com.aspose.font/iencodingparameters) | Implementierung des Interfaces IEncodingParameters. |
| charCode | long | Zeichencode, für den der Glyph‑Bezeichner ermittelt werden soll. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to charCode passed.
### encode(long gid, long charCode) {#encode-long-long-}
```
public void encode(long gid, long charCode)
```


Kodiert das Glyph. Nicht unterstützt für CFF Font-Typen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| gid | long | Glyph id |
| charCode | long | CharCode, der mit der Glyph id verknüpft ist. |

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


Gibt die Zuordnung von Namen zu Zeichencode‑Kodierung zurück. Hinweis: Zeichencode ist kein Unicode. Zeichencode ist ein Zeichen‑Index in der Font‑Kodierung „table“.

**Returns:**
[NameToCodeMap](../../com.aspose.font/nametocodemap) - Name to character code encoding map.
### getNameToGidIndex() {#getNameToGidIndex--}
```
public NameToCodeMap getNameToGidIndex()
```


Gibt die Zuordnung von Namen zu Zeichencode‑Kodierung zurück. Hinweis: Zeichencode ist kein Unicode. Zeichencode ist ein Zeichen‑Index in der Font‑Kodierung „table“.

**Returns:**
[NameToCodeMap](../../com.aspose.font/nametocodemap) - Name to character code encoding map.
### getNameToSidIndex() {#getNameToSidIndex--}
```
public NameToCodeMap getNameToSidIndex()
```


Gibt die Zuordnung von Namen zu Zeichencode‑Kodierung zurück. Hinweis: Zeichencode ist kein Unicode. Zeichencode ist ein Zeichen‑Index in der Font‑Kodierung „table“.

**Returns:**
[NameToCodeMap](../../com.aspose.font/nametocodemap) - Name to character code encoding map.
### getSidName(int sid) {#getSidName-int-}
```
public String getSidName(int sid)
```


Liefert Namen für die angegebene SID.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| sid | int | String‑Bezeichner. |

**Returns:**
java.lang.String – Name aus dem String‑INDEX, falls gefunden.
### gidToUnicode(GlyphId gid) {#gidToUnicode-com.aspose.font.GlyphId-}
```
public long gidToUnicode(GlyphId gid)
```


Dekodiert Gid zu Unicode. Glyph id ist eine eindeutige Nummer für ein Glyph, die vom \_font‑Typ abhängt. CFF Font Glyph id kann eine Instanz der Klasse ( GlyphStringId ) oder der Klasse ( GlyphUInt32Id ) sein.

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


Dekodiert ein Unicode und gibt die Glyph id zurück. Glyph id ist eine eindeutige Nummer für ein Glyph, die vom \_font‑Typ abhängt. CFF Font Glyph id kann eine Instanz der Klasse ( GlyphStringId ) oder der Klasse ( GlyphUInt32Id ) sein.

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

