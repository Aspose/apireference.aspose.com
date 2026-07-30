---
title: "TtfOs2Table"
second_title: "Aspose.Font für Java API-Referenz"
description: "Stellt die OS/2-Tabelle der TTF-Schriftdatei dar."
type: docs
weight: 106
url: /de/java/com.aspose.font/ttfos2table/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfOs2Table extends TtfTableBase
```

Stellt die "OS/2"-Tabelle der TTF-Schriftdatei dar.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAchVendId()](#getAchVendId--) | Ruft den AchVendId-Wert ab. |
| [getClass()](#getClass--) |  |
| [getFSSelection()](#getFSSelection--) | Enthält Informationen über die Beschaffenheit der Schriftmuster. |
| [getFSType()](#getFSType--) | Ruft den FSType-Wert ab. |
| [getLicenseFlags()](#getLicenseFlags--) | Ruft eingebettete Flags (fsType) in der Objektrepräsentation ab. |
| [getOffset()](#getOffset--) | Liefert den Offset vom Anfang des sfnt. |
| [getPanose()](#getPanose--) | Diese 10-Byte‑Zahlenreihe wird verwendet, um die visuellen Merkmale einer bestimmten Schriftart zu beschreiben. |
| [getSCapHeight()](#getSCapHeight--) | Ruft den SCapHeight-Wert ab. |
| [getSFamilyClass()](#getSFamilyClass--) | Dieser Parameter ist eine Klassifizierung des Schriftfamilien-Designs. |
| [getSTypoAscender()](#getSTypoAscender--) | Ruft den STypoAscender-Wert ab. |
| [getSTypoDescender()](#getSTypoDescender--) | Ruft den STypoDescender-Wert ab. |
| [getSTypoLineGap()](#getSTypoLineGap--) | Ruft den STypoLineGap-Wert ab. |
| [getSXHeight()](#getSXHeight--) | Ruft den SXHeight-Wert ab. |
| [getSupportedTableVersions()](#getSupportedTableVersions--) | Ruft die unterstützten Versionen der OS/2-Tabelle ab. |
| [getTag()](#getTag--) | Liest das Tabellen-Tag. |
| [getTtfTables()](#getTtfTables--) | Verweis auf das TTF-Tabellen-Repository. |
| [getULCodePageRange()](#getULCodePageRange--) | Ruft den ULCodePageRange-Wert ab. |
| [getULUnicodeRange()](#getULUnicodeRange--) | Ruft den ULUnicodeRange-Wert ab. |
| [getUSBreakChar()](#getUSBreakChar--) | Ruft den USBreakChar-Wert ab. |
| [getUSDefaultChar()](#getUSDefaultChar--) | Ruft den USDefaultChar-Wert ab. |
| [getUSFirstCharIndex()](#getUSFirstCharIndex--) | Ruft den USFirstCharIndex-Wert ab. |
| [getUSLastCharIndex()](#getUSLastCharIndex--) | Ruft den USLastCharIndex-Wert ab. |
| [getUSLowerOpticalPointSize()](#getUSLowerOpticalPointSize--) | Ruft den USLowerOpticalPointSize-Wert ab. |
| [getUSMaxContext()](#getUSMaxContext--) | Ruft den USMaxContext-Wert ab. |
| [getUSUpperOpticalPointSize()](#getUSUpperOpticalPointSize--) | Ruft den USUpperOpticalPointSize-Wert ab. |
| [getUSWeightClass()](#getUSWeightClass--) | Gibt das visuelle Gewicht (Grad der Schwärzung oder Strichstärke) der Zeichen in der Schrift an. |
| [getUSWidthClass()](#getUSWidthClass--) | Gibt eine relative Änderung des normalen Seitenverhältnisses (Breite‑zu‑Höhe‑Verhältnis) an, wie sie von einem Schriftgestalter für die Glyphen einer Schrift festgelegt wurde. |
| [getUSWinAscent()](#getUSWinAscent--) | Ruft den USWinAscent-Wert ab. |
| [getUSWinDescent()](#getUSWinDescent--) | Ruft den USWinDescent-Wert ab. |
| [getVersion()](#getVersion--) | Ruft den Versionswert ab. |
| [getXAvgCharWidth()](#getXAvgCharWidth--) | Ruft den Parameter für die durchschnittliche Zeichenbreite ab. |
| [getYStrikeoutPosition()](#getYStrikeoutPosition--) | Ruft den Wert YStrikeoutPosition ab. |
| [getYStrikeoutSize()](#getYStrikeoutSize--) | Ruft den Wert YStrikeoutSize ab. |
| [getYSubscriptXOffset()](#getYSubscriptXOffset--) | Ruft den Wert YSubscriptXOffset ab. |
| [getYSubscriptXSize()](#getYSubscriptXSize--) | Ruft den Wert YSubscriptXSize ab. |
| [getYSubscriptYOffset()](#getYSubscriptYOffset--) | Ruft den Wert YSubscriptYOffset ab. |
| [getYSubscriptYSize()](#getYSubscriptYSize--) | Ruft den Wert YSubscriptYSize ab. |
| [getYSuperscriptXOffset()](#getYSuperscriptXOffset--) | Ruft den Wert YSuperscriptXOffset ab. |
| [getYSuperscriptXSize()](#getYSuperscriptXSize--) | Ruft den Wert YSuperscriptXSize ab. |
| [getYSuperscriptYOffset()](#getYSuperscriptYOffset--) | Ruft den Wert YSuperscriptYOffset ab. |
| [getYSuperscriptYSize()](#getYSuperscriptYSize--) | Ruft den Wert YSuperscriptYSize ab. |
| [hashCode()](#hashCode--) |  |
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
### getAchVendId() {#getAchVendId--}
```
public byte[] getAchVendId()
```


Ruft den AchVendId-Wert ab.

**Returns:**
byte[] - AchVendId-Wert.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getFSSelection() {#getFSSelection--}
```
public int getFSSelection()
```


Enthält Informationen über die Beschaffenheit der Schriftmuster.

> ```
> 0	bit 1	ITALIC	Font contains Italic characters, otherwise they are upright.
>  1	 	    UNDERSCORE	Characters are underscored.
>  2	 	    NEGATIVE	Characters have their foreground and background reversed.
>  3	 	    OUTLINED	Outline (hollow) characters, otherwise they are solid.
>  4	 	    STRIKEOUT	Characters are overstruck.
>  5	bit 0	BOLD	Characters are emboldened.
>  6	 	    REGULAR	Characters are in the standard weight/style for the font.
> ```

**Returns:**
int - Die Information.
### getFSType() {#getFSType--}
```
public int getFSType()
```


Ruft den FSType-Wert ab.

--------------------

Gibt die Lizenzrechte für das Einbetten der Schriftart an.

**Returns:**
int - FSType-Wert.
### getLicenseFlags() {#getLicenseFlags--}
```
public LicenseFlags getLicenseFlags()
```


Ruft eingebettete Flags (fsType) in der Objektrepräsentation ab.

**Returns:**
[LicenseFlags](../../com.aspose.font/licenseflags) - Embedded flags.
### getOffset() {#getOffset--}
```
public long getOffset()
```


Liefert den Offset vom Anfang des sfnt.

**Returns:**
long - Offset vom Anfang des sfnt.
### getPanose() {#getPanose--}
```
public byte[] getPanose()
```


Diese 10‑Byte‑Reihe von Zahlen wird verwendet, um die visuellen Merkmale eines bestimmten Schriftsatzes zu beschreiben. Diese Merkmale werden anschließend genutzt, um die Schriftart mit anderen Schriftarten ähnlichen Aussehens, aber unterschiedlicher Namen, zu verknüpfen.

**Returns:**
byte[] - Die visuellen Merkmale eines bestimmten Schriftsatzes.
### getSCapHeight() {#getSCapHeight--}
```
public short getSCapHeight()
```


Ruft den SCapHeight-Wert ab.

**Returns:**
short - SCapHeight-Wert.
### getSFamilyClass() {#getSFamilyClass--}
```
public short getSFamilyClass()
```


Dieser Parameter ist eine Klassifizierung des Schriftfamilien‑Designs. Die Schriftklasse und die Schriftunterklasse sind von IBM für jede Schriftfamilie registrierte Werte. Dieser Parameter ist dafür vorgesehen, bei Nichtverfügbarkeit der angeforderten Schriftart eine alternative Schriftart auszuwählen.

**Returns:**
short - Klassifizierung des Schriftfamilien‑Designs.
### getSTypoAscender() {#getSTypoAscender--}
```
public short getSTypoAscender()
```


Ruft den STypoAscender-Wert ab.

**Returns:**
short - STypoAscender-Wert.
### getSTypoDescender() {#getSTypoDescender--}
```
public short getSTypoDescender()
```


Ruft den STypoDescender-Wert ab.

**Returns:**
short - STypoDescender-Wert.
### getSTypoLineGap() {#getSTypoLineGap--}
```
public short getSTypoLineGap()
```


Ruft den STypoLineGap-Wert ab.

**Returns:**
short - STypoLineGap-Wert.
### getSXHeight() {#getSXHeight--}
```
public short getSXHeight()
```


Ruft den SXHeight-Wert ab.

**Returns:**
short - SXHeight-Wert.
### getSupportedTableVersions() {#getSupportedTableVersions--}
```
public int[] getSupportedTableVersions()
```


Ruft die unterstützten Versionen der OS/2-Tabelle ab.

**Returns:**
int[] - Unterstützte Versionen der OS/2‑Tabelle.
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
### getULCodePageRange() {#getULCodePageRange--}
```
public long[] getULCodePageRange()
```


Ruft den ULCodePageRange-Wert ab.

**Returns:**
long[] - ULCodePageRange‑Wert.
### getULUnicodeRange() {#getULUnicodeRange--}
```
public long[] getULUnicodeRange()
```


Ruft den ULUnicodeRange-Wert ab.

**Returns:**
long[] - ULUnicodeRange‑Wert.
### getUSBreakChar() {#getUSBreakChar--}
```
public int getUSBreakChar()
```


Ruft den USBreakChar-Wert ab.

**Returns:**
int - USBreakChar‑Wert.
### getUSDefaultChar() {#getUSDefaultChar--}
```
public int getUSDefaultChar()
```


Ruft den USDefaultChar-Wert ab.

**Returns:**
int - USDefaultChar‑Wert.
### getUSFirstCharIndex() {#getUSFirstCharIndex--}
```
public int getUSFirstCharIndex()
```


Ruft den USFirstCharIndex-Wert ab.

**Returns:**
int - USFirstCharIndex‑Wert.
### getUSLastCharIndex() {#getUSLastCharIndex--}
```
public int getUSLastCharIndex()
```


Ruft den USLastCharIndex-Wert ab.

**Returns:**
int - USLastCharIndex‑Wert.
### getUSLowerOpticalPointSize() {#getUSLowerOpticalPointSize--}
```
public int getUSLowerOpticalPointSize()
```


Ruft den USLowerOpticalPointSize-Wert ab.

**Returns:**
int - Der USLowerOpticalPointSize‑Wert.
### getUSMaxContext() {#getUSMaxContext--}
```
public int getUSMaxContext()
```


Ruft den USMaxContext-Wert ab.

**Returns:**
int - UsMaxContext‑Wert.
### getUSUpperOpticalPointSize() {#getUSUpperOpticalPointSize--}
```
public int getUSUpperOpticalPointSize()
```


Ruft den USUpperOpticalPointSize-Wert ab.

**Returns:**
int - Der USUpperOpticalPointSize‑Wert.
### getUSWeightClass() {#getUSWeightClass--}
```
public int getUSWeightClass()
```


Gibt das visuelle Gewicht (Grad der Schwärzung oder Strichstärke) der Zeichen in der Schrift an.

**Returns:**
int - Das visuelle Gewicht (Grad der Schwärze oder Strichstärke) der Zeichen in der Font.
### getUSWidthClass() {#getUSWidthClass--}
```
public int getUSWidthClass()
```


Gibt eine relative Änderung des normalen Seitenverhältnisses (Breite‑zu‑Höhe‑Verhältnis) an, wie sie von einem Schriftgestalter für die Glyphen einer Schrift festgelegt wurde.

**Returns:**
int - Eine relative Änderung des normalen Seitenverhältnisses (Breite‑zu‑Höhe‑Verhältnis), wie von einem Schriftgestalter für die Glyphen in einer Font angegeben.
### getUSWinAscent() {#getUSWinAscent--}
```
public int getUSWinAscent()
```


Ruft den USWinAscent-Wert ab.

**Returns:**
int - USWinAscent‑Wert.
### getUSWinDescent() {#getUSWinDescent--}
```
public int getUSWinDescent()
```


Ruft den USWinDescent-Wert ab.

**Returns:**
int - USWinDescent‑Wert.
### getVersion() {#getVersion--}
```
public int getVersion()
```


Ruft den Versionswert ab.

**Returns:**
int - Versionswert.
### getXAvgCharWidth() {#getXAvgCharWidth--}
```
public short getXAvgCharWidth()
```


Ruft den Parameter für die durchschnittliche Zeichenbreite ab.

**Returns:**
short - Der Parameter für die durchschnittliche Zeichenbreite.
### getYStrikeoutPosition() {#getYStrikeoutPosition--}
```
public short getYStrikeoutPosition()
```


Ruft den Wert YStrikeoutPosition ab.

**Returns:**
short - YStrikeoutPosition‑Wert.
### getYStrikeoutSize() {#getYStrikeoutSize--}
```
public short getYStrikeoutSize()
```


Ruft den Wert YStrikeoutSize ab.

**Returns:**
short - YStrikeoutSize‑Wert.
### getYSubscriptXOffset() {#getYSubscriptXOffset--}
```
public short getYSubscriptXOffset()
```


Ruft den Wert YSubscriptXOffset ab.

**Returns:**
short - YSubscriptXOffset‑Wert.
### getYSubscriptXSize() {#getYSubscriptXSize--}
```
public short getYSubscriptXSize()
```


Ruft den Wert YSubscriptXSize ab.

**Returns:**
short - YSubscriptXSize‑Wert.
### getYSubscriptYOffset() {#getYSubscriptYOffset--}
```
public short getYSubscriptYOffset()
```


Ruft den Wert YSubscriptYOffset ab.

**Returns:**
short - YSubscriptYOffset‑Wert.
### getYSubscriptYSize() {#getYSubscriptYSize--}
```
public short getYSubscriptYSize()
```


Ruft den Wert YSubscriptYSize ab.

**Returns:**
short - YSubscriptYSize‑Wert.
### getYSuperscriptXOffset() {#getYSuperscriptXOffset--}
```
public short getYSuperscriptXOffset()
```


Ruft den Wert YSuperscriptXOffset ab.

**Returns:**
short - YSuperscriptXOffset‑Wert.
### getYSuperscriptXSize() {#getYSuperscriptXSize--}
```
public short getYSuperscriptXSize()
```


Ruft den Wert YSuperscriptXSize ab.

**Returns:**
short - YSuperscriptXSize‑Wert.
### getYSuperscriptYOffset() {#getYSuperscriptYOffset--}
```
public short getYSuperscriptYOffset()
```


Ruft den Wert YSuperscriptYOffset ab.

**Returns:**
short - YSuperscriptYOffset‑Wert.
### getYSuperscriptYSize() {#getYSuperscriptYSize--}
```
public short getYSuperscriptYSize()
```


Ruft den Wert YSuperscriptYSize ab.

**Returns:**
Kurz - YSuperscriptYSize Wert.
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

