---
title: "TtfOs2Table"
second_title: "Aspose.Font för Java API-referens"
description: "Representerar OS/2‑tabellen i TTF‑teckensnittsfilen."
type: docs
weight: 106
url: /sv/java/com.aspose.font/ttfos2table/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfOs2Table extends TtfTableBase
```

Representerar "OS/2"-tabellen i TTF-typsnittsfilen.
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAchVendId()](#getAchVendId--) | Hämtar AchVendId‑värdet. |
| [getClass()](#getClass--) |  |
| [getFSSelection()](#getFSSelection--) | Innehåller information om teckensnittsmönstrens natur. |
| [getFSType()](#getFSType--) | Hämtar FSType‑värdet. |
| [getLicenseFlags()](#getLicenseFlags--) | Hämtar en inbäddad flagga (fsType) i objektrepresentation. |
| [getOffset()](#getOffset--) | Hämtar förskjutning från början av sfnt. |
| [getPanose()](#getPanose--) | Denna serie av 10 byte med siffror används för att beskriva de visuella egenskaperna hos ett givet teckensnitt. |
| [getSCapHeight()](#getSCapHeight--) | Hämtar SCapHeight‑värdet. |
| [getSFamilyClass()](#getSFamilyClass--) | Denna parameter är en klassificering av teckensnittsfamiljens design. |
| [getSTypoAscender()](#getSTypoAscender--) | Hämtar STypoAscender‑värdet. |
| [getSTypoDescender()](#getSTypoDescender--) | Hämtar STypoDescender‑värdet. |
| [getSTypoLineGap()](#getSTypoLineGap--) | Hämtar STypoLineGap‑värdet. |
| [getSXHeight()](#getSXHeight--) | Hämtar SXHeight‑värdet. |
| [getSupportedTableVersions()](#getSupportedTableVersions--) | Hämtar de stödjade versionerna av OS/2‑tabellen. |
| [getTag()](#getTag--) | Hämtar tabellens tagg. |
| [getTtfTables()](#getTtfTables--) | Referens till TTF-tabellarkivet. |
| [getULCodePageRange()](#getULCodePageRange--) | Hämtar ULCodePageRange‑värdet. |
| [getULUnicodeRange()](#getULUnicodeRange--) | Hämtar ULUnicodeRange‑värdet. |
| [getUSBreakChar()](#getUSBreakChar--) | Hämtar USBreakChar‑värdet. |
| [getUSDefaultChar()](#getUSDefaultChar--) | Hämtar USDefaultChar‑värdet. |
| [getUSFirstCharIndex()](#getUSFirstCharIndex--) | Hämtar USFirstCharIndex‑värdet. |
| [getUSLastCharIndex()](#getUSLastCharIndex--) | Hämtar USLastCharIndex‑värdet. |
| [getUSLowerOpticalPointSize()](#getUSLowerOpticalPointSize--) | Hämtar USLowerOpticalPointSize‑värdet. |
| [getUSMaxContext()](#getUSMaxContext--) | Hämtar USMaxContext‑värdet. |
| [getUSUpperOpticalPointSize()](#getUSUpperOpticalPointSize--) | Hämtar USUpperOpticalPointSize‑värdet. |
| [getUSWeightClass()](#getUSWeightClass--) | Anger den visuella vikten (grad av mörkhet eller tjocklek på strecken) för tecknen i teckensnittet. |
| [getUSWidthClass()](#getUSWidthClass--) | Anger en relativ förändring från det normala bildförhållandet (bredd‑till‑höjd‑förhållande) som specificerats av en teckensnittsdesigner för glyferna i ett teckensnitt. |
| [getUSWinAscent()](#getUSWinAscent--) | Hämtar USWinAscent‑värdet. |
| [getUSWinDescent()](#getUSWinDescent--) | Hämtar USWinDescent‑värdet. |
| [getVersion()](#getVersion--) | Hämtar Version-värde. |
| [getXAvgCharWidth()](#getXAvgCharWidth--) | Hämtar parametern för genomsnittlig teckenbredd. |
| [getYStrikeoutPosition()](#getYStrikeoutPosition--) | Hämtar YStrikeoutPosition-värde. |
| [getYStrikeoutSize()](#getYStrikeoutSize--) | Hämtar YStrikeoutSize-värde. |
| [getYSubscriptXOffset()](#getYSubscriptXOffset--) | Hämtar YSubscriptXOffset-värde. |
| [getYSubscriptXSize()](#getYSubscriptXSize--) | Hämtar YSubscriptXSize-värde. |
| [getYSubscriptYOffset()](#getYSubscriptYOffset--) | Hämtar YSubscriptYOffset-värde. |
| [getYSubscriptYSize()](#getYSubscriptYSize--) | Hämtar YSubscriptYSize-värde. |
| [getYSuperscriptXOffset()](#getYSuperscriptXOffset--) | Hämtar YSuperscriptXOffset-värde. |
| [getYSuperscriptXSize()](#getYSuperscriptXSize--) | Hämtar YSuperscriptXSize-värde. |
| [getYSuperscriptYOffset()](#getYSuperscriptYOffset--) | Hämtar YSuperscriptYOffset-värde. |
| [getYSuperscriptYSize()](#getYSuperscriptYSize--) | Hämtar YSuperscriptYSize-värde. |
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
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getAchVendId() {#getAchVendId--}
```
public byte[] getAchVendId()
```


Hämtar AchVendId‑värdet.

**Returns:**
byte[] - AchVendId-värde.
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


Innehåller information om teckensnittsmönstrens natur.

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
int - Informationen.
### getFSType() {#getFSType--}
```
public int getFSType()
```


Hämtar FSType‑värdet.

--------------------

Anger licensrättigheter för inbäddning av teckensnittet.

**Returns:**
int - FSType-värde.
### getLicenseFlags() {#getLicenseFlags--}
```
public LicenseFlags getLicenseFlags()
```


Hämtar en inbäddad flagga (fsType) i objektrepresentation.

**Returns:**
[LicenseFlags](../../com.aspose.font/licenseflags) - Embedded flags.
### getOffset() {#getOffset--}
```
public long getOffset()
```


Hämtar förskjutning från början av sfnt.

**Returns:**
long - Förskjutning från början av sfnt.
### getPanose() {#getPanose--}
```
public byte[] getPanose()
```


Denna serie på 10 byte med siffror används för att beskriva de visuella egenskaperna hos ett givet typsnitt. Dessa egenskaper används sedan för att associera teckensnittet med andra teckensnitt med liknande utseende men olika namn.

**Returns:**
byte[] - De visuella egenskaperna för ett givet typsnitt.
### getSCapHeight() {#getSCapHeight--}
```
public short getSCapHeight()
```


Hämtar SCapHeight‑värdet.

**Returns:**
short - SCapHeight-värde.
### getSFamilyClass() {#getSFamilyClass--}
```
public short getSFamilyClass()
```


Denna parameter är en klassificering av teckensnittsfamiljens design. Teckensnittsklassen och teckensnittsubklassen är registrerade värden som tilldelats av IBM till varje teckensnittsfamilj. Denna parameter är avsedd att användas för att välja ett alternativt teckensnitt när det begärda teckensnittet inte är tillgängligt.

**Returns:**
short - Klassificering av teckensnittsfamiljens design.
### getSTypoAscender() {#getSTypoAscender--}
```
public short getSTypoAscender()
```


Hämtar STypoAscender‑värdet.

**Returns:**
short - STypoAscender-värde.
### getSTypoDescender() {#getSTypoDescender--}
```
public short getSTypoDescender()
```


Hämtar STypoDescender‑värdet.

**Returns:**
short - STypoDescender-värde.
### getSTypoLineGap() {#getSTypoLineGap--}
```
public short getSTypoLineGap()
```


Hämtar STypoLineGap‑värdet.

**Returns:**
short - STypoLineGap-värde.
### getSXHeight() {#getSXHeight--}
```
public short getSXHeight()
```


Hämtar SXHeight‑värdet.

**Returns:**
short - SXHeight-värde.
### getSupportedTableVersions() {#getSupportedTableVersions--}
```
public int[] getSupportedTableVersions()
```


Hämtar de stödjade versionerna av OS/2‑tabellen.

**Returns:**
int[] - Stödda versioner av OS/2-tabellen.
### getTag() {#getTag--}
```
public static String getTag()
```


Hämtar tabellens tagg.

**Returns:**
java.lang.String - Tabellens tagg.
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


Referens till TTF-tabellarkivet.

**Returns:**
[TtfTableRepository](../../com.aspose.font/ttftablerepository) - Reference to TTF table repository.
### getULCodePageRange() {#getULCodePageRange--}
```
public long[] getULCodePageRange()
```


Hämtar ULCodePageRange‑värdet.

**Returns:**
long[] - ULCodePageRange‑värde.
### getULUnicodeRange() {#getULUnicodeRange--}
```
public long[] getULUnicodeRange()
```


Hämtar ULUnicodeRange‑värdet.

**Returns:**
long[] - ULUnicodeRange‑värde.
### getUSBreakChar() {#getUSBreakChar--}
```
public int getUSBreakChar()
```


Hämtar USBreakChar‑värdet.

**Returns:**
int - USBreakChar‑värde.
### getUSDefaultChar() {#getUSDefaultChar--}
```
public int getUSDefaultChar()
```


Hämtar USDefaultChar‑värdet.

**Returns:**
int - USDefaultChar‑värde.
### getUSFirstCharIndex() {#getUSFirstCharIndex--}
```
public int getUSFirstCharIndex()
```


Hämtar USFirstCharIndex‑värdet.

**Returns:**
int - USFirstCharIndex‑värde.
### getUSLastCharIndex() {#getUSLastCharIndex--}
```
public int getUSLastCharIndex()
```


Hämtar USLastCharIndex‑värdet.

**Returns:**
int - USLastCharIndex‑värde.
### getUSLowerOpticalPointSize() {#getUSLowerOpticalPointSize--}
```
public int getUSLowerOpticalPointSize()
```


Hämtar USLowerOpticalPointSize‑värdet.

**Returns:**
int - USLowerOpticalPointSize‑värdet.
### getUSMaxContext() {#getUSMaxContext--}
```
public int getUSMaxContext()
```


Hämtar USMaxContext‑värdet.

**Returns:**
int - UsMaxContext‑värde.
### getUSUpperOpticalPointSize() {#getUSUpperOpticalPointSize--}
```
public int getUSUpperOpticalPointSize()
```


Hämtar USUpperOpticalPointSize‑värdet.

**Returns:**
int - USUpperOpticalPointSize‑värdet.
### getUSWeightClass() {#getUSWeightClass--}
```
public int getUSWeightClass()
```


Anger den visuella vikten (grad av mörkhet eller tjocklek på strecken) för tecknen i teckensnittet.

**Returns:**
int - Den visuella vikten (grad av svarthet eller tjocklek på strecken) för tecknen i teckensnittet.
### getUSWidthClass() {#getUSWidthClass--}
```
public int getUSWidthClass()
```


Anger en relativ förändring från det normala bildförhållandet (bredd‑till‑höjd‑förhållande) som specificerats av en teckensnittsdesigner för glyferna i ett teckensnitt.

**Returns:**
int - En relativ förändring från det normala bildförhållandet (bredd‑till‑höjd‑förhållande) enligt vad en teckensnittsdesigner specificerat för glyferna i ett teckensnitt.
### getUSWinAscent() {#getUSWinAscent--}
```
public int getUSWinAscent()
```


Hämtar USWinAscent‑värdet.

**Returns:**
int - USWinAscent‑värde.
### getUSWinDescent() {#getUSWinDescent--}
```
public int getUSWinDescent()
```


Hämtar USWinDescent‑värdet.

**Returns:**
int - USWinDescent‑värde.
### getVersion() {#getVersion--}
```
public int getVersion()
```


Hämtar Version-värde.

**Returns:**
int - Version‑värde.
### getXAvgCharWidth() {#getXAvgCharWidth--}
```
public short getXAvgCharWidth()
```


Hämtar parametern för genomsnittlig teckenbredd.

**Returns:**
short - Genomsnittlig teckenbredd‑parameter.
### getYStrikeoutPosition() {#getYStrikeoutPosition--}
```
public short getYStrikeoutPosition()
```


Hämtar YStrikeoutPosition-värde.

**Returns:**
short - YStrikeoutPosition‑värde.
### getYStrikeoutSize() {#getYStrikeoutSize--}
```
public short getYStrikeoutSize()
```


Hämtar YStrikeoutSize-värde.

**Returns:**
short - YStrikeoutSize‑värde.
### getYSubscriptXOffset() {#getYSubscriptXOffset--}
```
public short getYSubscriptXOffset()
```


Hämtar YSubscriptXOffset-värde.

**Returns:**
short - YSubscriptXOffset‑värde.
### getYSubscriptXSize() {#getYSubscriptXSize--}
```
public short getYSubscriptXSize()
```


Hämtar YSubscriptXSize-värde.

**Returns:**
short - YSubscriptXSize‑värde.
### getYSubscriptYOffset() {#getYSubscriptYOffset--}
```
public short getYSubscriptYOffset()
```


Hämtar YSubscriptYOffset-värde.

**Returns:**
short - YSubscriptYOffset‑värde.
### getYSubscriptYSize() {#getYSubscriptYSize--}
```
public short getYSubscriptYSize()
```


Hämtar YSubscriptYSize-värde.

**Returns:**
short - YSubscriptYSize‑värde.
### getYSuperscriptXOffset() {#getYSuperscriptXOffset--}
```
public short getYSuperscriptXOffset()
```


Hämtar YSuperscriptXOffset-värde.

**Returns:**
short - YSuperscriptXOffset‑värde.
### getYSuperscriptXSize() {#getYSuperscriptXSize--}
```
public short getYSuperscriptXSize()
```


Hämtar YSuperscriptXSize-värde.

**Returns:**
short - YSuperscriptXSize‑värde.
### getYSuperscriptYOffset() {#getYSuperscriptYOffset--}
```
public short getYSuperscriptYOffset()
```


Hämtar YSuperscriptYOffset-värde.

**Returns:**
short - YSuperscriptYOffset‑värde.
### getYSuperscriptYSize() {#getYSuperscriptYSize--}
```
public short getYSuperscriptYSize()
```


Hämtar YSuperscriptYSize-värde.

**Returns:**
kort - YSuperscriptYSize värde.
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

