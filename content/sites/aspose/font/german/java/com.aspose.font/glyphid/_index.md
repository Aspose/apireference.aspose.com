---
title: "GlyphId"
second_title: "Aspose.Font für Java API-Referenz"
description: "Stellt Glyph-IDs dar, die in der Schriftart verfügbar sind."
type: docs
weight: 50
url: /de/java/com.aspose.font/glyphid/
---
**Inheritance:**
java.lang.Object
```
public abstract class GlyphId
```

Stellt Glyph-IDs dar, die in der Schriftart verfügbar sind. Eine Glyph-ID ist eine eindeutige Nummer für ein Glyph, die vom Schriftarttyp abhängt. Zum Beispiel: Die ID von Type1 ist ein Glyph-Name, eine Instanz der Klasse ( GlyphStringId ). Die ID von TTF ist ein int-Index, eine Instanz der Klasse ( GlyphUInt32Id ).
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object obj)](#equals-java.lang.Object-) | Gibt true zurück, wenn zwei Glyph-IDs ungleich sind. |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) | Gibt den Hashcode des Objekts zurück. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [op_Equality(GlyphId obj1, Object obj2)](#op-Equality-com.aspose.font.GlyphId-java.lang.Object-) | Gibt true zurück, wenn zwei Glyph-IDs gleich sind. |
| [op_Inequality(GlyphId obj1, Object obj2)](#op-Inequality-com.aspose.font.GlyphId-java.lang.Object-) | Gibt true zurück, wenn zwei Glyph-IDs ungleich sind. |
| [toGlyphStringId()](#toGlyphStringId--) | Virtueller Cast zu GlyphStringId. |
| [toGlyphUInt32Id()](#toGlyphUInt32Id--) | Virtuelle Umwandlung zu GlyphUInt32Id. |
| [toString()](#toString--) | Gibt die String-Darstellung der Glyph-ID zurück. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Gibt true zurück, wenn zwei Glyph-IDs ungleich sind.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | java.lang.Object | Glyph-Identifikator zum Vergleichen. |

**Returns:**
boolean - Vergleichsergebnis.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### hashCode() {#hashCode--}
```
public abstract int hashCode()
```


Gibt den Hashcode des Objekts zurück.

**Returns:**
int - Hashcode des Objekts.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### op_Equality(GlyphId obj1, Object obj2) {#op-Equality-com.aspose.font.GlyphId-java.lang.Object-}
```
public static boolean op_Equality(GlyphId obj1, Object obj2)
```


Gibt true zurück, wenn zwei Glyph-IDs gleich sind.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj1 | [GlyphId](../../com.aspose.font/glyphid) | Erster Glyph-Bezeichner zum Vergleichen. |
| obj2 | java.lang.Object | Zweiter Glyph-Bezeichner zum Vergleichen. |

**Returns:**
boolean - Vergleichsergebnis.
### op_Inequality(GlyphId obj1, Object obj2) {#op-Inequality-com.aspose.font.GlyphId-java.lang.Object-}
```
public static boolean op_Inequality(GlyphId obj1, Object obj2)
```


Gibt true zurück, wenn zwei Glyph-IDs ungleich sind.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj1 | [GlyphId](../../com.aspose.font/glyphid) | Erster Glyph-Bezeichner zum Vergleichen. |
| obj2 | java.lang.Object | Zweiter Glyph-Bezeichner zum Vergleichen. |

**Returns:**
boolean - Vergleichsergebnis.
### toGlyphStringId() {#toGlyphStringId--}
```
public GlyphStringId toGlyphStringId()
```


Virtueller Cast zu GlyphStringId. GlyphStringId überschreibt, um eine Instanz zurückzugeben.

**Returns:**
[GlyphStringId](../../com.aspose.font/glyphstringid) - null
### toGlyphUInt32Id() {#toGlyphUInt32Id--}
```
public GlyphUInt32Id toGlyphUInt32Id()
```


Virtuelle Umwandlung zu GlyphUInt32Id. GlyphUInt32Id überschreibt, um die Instanz zurückzugeben.

**Returns:**
[GlyphUInt32Id](../../com.aspose.font/glyphuint32id) - null
### toString() {#toString--}
```
public abstract String toString()
```


Gibt die String-Darstellung der Glyph-ID zurück.

**Returns:**
java.lang.String - Glyph-Bezeichner
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

