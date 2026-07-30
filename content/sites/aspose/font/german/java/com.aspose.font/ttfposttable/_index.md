---
title: "TtfPostTable"
second_title: "Aspose.Font für Java API-Referenz"
description: "Stellt die post-Tabelle der TTF-Schriftdatei dar"
type: docs
weight: 107
url: /de/java/com.aspose.font/ttfposttable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfPostTable extends TtfTableBase
```

Stellt die "post"-Tabelle der TTF-Schriftdatei dar
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAllGlyphIndexesForGlyphName(String glyphName)](#getAllGlyphIndexesForGlyphName-java.lang.String-) | Liefert ein Array von Glyphenindizes nach Glyphennamen |
| [getClass()](#getClass--) |  |
| [getFormat()](#getFormat--) | Liefert das feste Format (Version) dieser Tabelle. |
| [getGlyphIndex(String glyphName)](#getGlyphIndex-java.lang.String-) | Liefert den Glyphenindex nach Glyphennamen. |
| [getGlyphName(long glyphIndex)](#getGlyphName-long-) | Liefert den Glyphennamen nach Glyphenindex. |
| [getItalicAngle()](#getItalicAngle--) | Liest den festen italicAngle Italic-Winkel in Grad. |
| [getMaxMemType1()](#getMaxMemType1--) | Liest uint32 maxMemType1 Maximale Speichernutzung, wenn eine TrueType-Schrift als Type-1-Schrift heruntergeladen wird. |
| [getMaxMemType42()](#getMaxMemType42--) | Liest uint32 maxMemType42 Maximale Speichernutzung, wenn eine TrueType-Schrift als Type-42-Schrift heruntergeladen wird. |
| [getMinMemType1()](#getMinMemType1--) | Liest uint32 minMemType1 Minimale Speichernutzung, wenn eine TrueType-Schrift als Type-1-Schrift heruntergeladen wird. |
| [getMinMemType42()](#getMinMemType42--) | Liest uint32 minMemType42 Minimale Speichernutzung, wenn eine TrueType-Schrift als Type-42-Schrift heruntergeladen wird. |
| [getOffset()](#getOffset--) | Liefert den Offset vom Anfang des sfnt. |
| [getTableFormat()](#getTableFormat--) | Liest das feste Format (Version) dieser Tabelle. |
| [getTag()](#getTag--) | Liest das Tabellen-Tag. |
| [getTtfTables()](#getTtfTables--) | Verweis auf das TTF-Tabellen-Repository. |
| [getUnderlinePosition()](#getUnderlinePosition--) | Liest FWord underlinePosition Unterstreichungsposition. |
| [getUnderlineThickness()](#getUnderlineThickness--) | Liest FWord underlineThickness Unterstreichungsstärke. |
| [hasNoPostScriptNames()](#hasNoPostScriptNames--) | Gibt an, dass keine PostScript‑Namensinformationen für die Glyphen in dieser Schriftdatei bereitgestellt werden. |
| [hashCode()](#hashCode--) |  |
| [isFixedPitch()](#isFixedPitch--) | Liest uint32 isFixedPitch. 0, wenn die Schrift proportional proportioniert ist, ungleich Null, wenn die Schrift nicht proportional proportioniert ist (d. h. monospaced). |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
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
### getAllGlyphIndexesForGlyphName(String glyphName) {#getAllGlyphIndexesForGlyphName-java.lang.String-}
```
public long[] getAllGlyphIndexesForGlyphName(String glyphName)
```


Liefert ein Array von Glyphenindizes nach Glyphennamen

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| glyphName | java.lang.String | Glyph-Name |

**Returns:**
long[] – Array von Glyphen‑Indizes
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getFormat() {#getFormat--}
```
public float getFormat()
```


Liefert das feste Format (Version) dieser Tabelle.

**Returns:**
float – Festes Format (Version) dieser Tabelle.
### getGlyphIndex(String glyphName) {#getGlyphIndex-java.lang.String-}
```
public long getGlyphIndex(String glyphName)
```


Liefert den Glyphenindex nach Glyphennamen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| glyphName | java.lang.String | Glyph-Name. |

**Returns:**
long – Glyphen‑Index. Wenn keine PostScript‑Namensinformationen für die Glyphen in dieser Schriftdatei bereitgestellt werden, wird der Index 0 zurückgegeben, der das undefinierte Glyph oder das ".notdef"‑Glyph ist.
### getGlyphName(long glyphIndex) {#getGlyphName-long-}
```
public String getGlyphName(long glyphIndex)
```


Liefert den Glyphennamen nach Glyphenindex.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| glyphIndex | long | Glyph-Index. |

**Returns:**
java.lang.String – Glyph‑Name. Wenn keine PostScript‑Namensinformationen für die Glyphen in dieser Schriftdatei bereitgestellt werden, wird null zurückgegeben.
### getItalicAngle() {#getItalicAngle--}
```
public float getItalicAngle()
```


Liest den festen italicAngle Italic-Winkel in Grad.

**Returns:**
float – Festes italicAngle Italic‑Winkel in Grad.
### getMaxMemType1() {#getMaxMemType1--}
```
public long getMaxMemType1()
```


Liest uint32 maxMemType1 Maximale Speichernutzung, wenn eine TrueType-Schrift als Type-1-Schrift heruntergeladen wird.

**Returns:**
long – UInt32 maxMemType1 Maximale Speichernutzung, wenn eine TrueType‑Schrift als Type‑1‑Schrift heruntergeladen wird.
### getMaxMemType42() {#getMaxMemType42--}
```
public long getMaxMemType42()
```


Liest uint32 maxMemType42 Maximale Speichernutzung, wenn eine TrueType-Schrift als Type-42-Schrift heruntergeladen wird.

**Returns:**
long – UInt32 maxMemType42 Maximale Speichernutzung, wenn eine TrueType‑Schrift als Type‑42‑Schrift heruntergeladen wird.
### getMinMemType1() {#getMinMemType1--}
```
public long getMinMemType1()
```


Liest uint32 minMemType1 Minimale Speichernutzung, wenn eine TrueType-Schrift als Type-1-Schrift heruntergeladen wird.

**Returns:**
long – UInt32 minMemType1 Minimale Speichernutzung, wenn eine TrueType‑Schrift als Type‑1‑Schrift heruntergeladen wird.
### getMinMemType42() {#getMinMemType42--}
```
public long getMinMemType42()
```


Liest uint32 minMemType42 Minimale Speichernutzung, wenn eine TrueType-Schrift als Type-42-Schrift heruntergeladen wird.

**Returns:**
long – UInt32 minMemType42 Minimale Speichernutzung, wenn eine TrueType‑Schrift als Type‑42‑Schrift heruntergeladen wird.
### getOffset() {#getOffset--}
```
public long getOffset()
```


Liefert den Offset vom Anfang des sfnt.

**Returns:**
long - Offset vom Anfang des sfnt.
### getTableFormat() {#getTableFormat--}
```
public Version16Dot16 getTableFormat()
```


Liest das feste Format (Version) dieser Tabelle. Verwenden Sie die Eigenschaften MajorNumber und MinorNumber des Objekts Version16Dot16 in hexadezimaler Schreibweise, um die verwendete Version zu ermitteln.

**Returns:**
[Version16Dot16](../../com.aspose.font/version16dot16) - Fixed format (version) of this table.
### getTag() {#getTag--}
```
public static String getTag()
```


Liest das Tabellen-Tag.

**Returns:**
java.lang.String - Tabellen‑Tag.
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


Verweis auf das TTF-Tabellen-Repository.

**Returns:**
[TtfTableRepository](../../com.aspose.font/ttftablerepository) - Reference to TTF table repository.
### getUnderlinePosition() {#getUnderlinePosition--}
```
public short getUnderlinePosition()
```


Liest FWord underlinePosition Unterstreichungsposition.

**Returns:**
short – FWord underlinePosition Unterstreichungsposition.
### getUnderlineThickness() {#getUnderlineThickness--}
```
public short getUnderlineThickness()
```


Liest FWord underlineThickness Unterstreichungsstärke.

**Returns:**
short – FWord underlineThickness Unterstreichungsstärke.
### hasNoPostScriptNames() {#hasNoPostScriptNames--}
```
public boolean hasNoPostScriptNames()
```


Gibt an, dass keine PostScript‑Namensinformationen für die Glyphen in dieser Schriftdatei bereitgestellt werden.

**Returns:**
boolean – Wahr, wenn keine PostScript‑Namensinformationen für die Glyphen in dieser Schriftdatei bereitgestellt werden; sonst falsch.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isFixedPitch() {#isFixedPitch--}
```
public long isFixedPitch()
```


Liest uint32 isFixedPitch. 0, wenn die Schrift proportional proportioniert ist, ungleich Null, wenn die Schrift nicht proportional proportioniert ist (d. h. monospaced).

**Returns:**
long – UInt32 isFixedPitch. 0, wenn die Schrift proportional proportioniert ist, ungleich Null, wenn die Schrift nicht proportional proportioniert ist (d. h. monospaced).
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

