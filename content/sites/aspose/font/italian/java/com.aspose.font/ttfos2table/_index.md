---
title: "TtfOs2Table"
second_title: "Riferimento API Aspose.Font per Java"
description: "Rappresenta la tabella OS/2 del file Font TTF."
type: docs
weight: 106
url: /it/java/com.aspose.font/ttfos2table/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfOs2Table extends TtfTableBase
```

Rappresenta la tabella "OS/2" del file di font TTF.
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAchVendId()](#getAchVendId--) | Ottiene il valore AchVendId. |
| [getClass()](#getClass--) |  |
| [getFSSelection()](#getFSSelection--) | Contiene informazioni sulla natura dei pattern del font. |
| [getFSType()](#getFSType--) | Ottiene il valore FSType. |
| [getLicenseFlags()](#getLicenseFlags--) | Ottiene i flag incorporati (fsType) nella rappresentazione dell'oggetto. |
| [getOffset()](#getOffset--) | Ottiene l'offset dall'inizio di sfnt. |
| [getPanose()](#getPanose--) | Questa serie di 10 byte di numeri è usata per descrivere le caratteristiche visive di un determinato tipo di carattere. |
| [getSCapHeight()](#getSCapHeight--) | Ottiene il valore SCapHeight. |
| [getSFamilyClass()](#getSFamilyClass--) | Questo parametro è una classificazione del design della famiglia di font. |
| [getSTypoAscender()](#getSTypoAscender--) | Ottiene il valore STypoAscender. |
| [getSTypoDescender()](#getSTypoDescender--) | Ottiene il valore STypoDescender. |
| [getSTypoLineGap()](#getSTypoLineGap--) | Ottiene il valore STypoLineGap. |
| [getSXHeight()](#getSXHeight--) | Ottiene il valore SXHeight. |
| [getSupportedTableVersions()](#getSupportedTableVersions--) | Ottiene le versioni supportate della tabella OS/2. |
| [getTag()](#getTag--) | Ottiene l'etichetta della tabella. |
| [getTtfTables()](#getTtfTables--) | Riferimento al repository della tabella TTF. |
| [getULCodePageRange()](#getULCodePageRange--) | Ottiene il valore ULCodePageRange. |
| [getULUnicodeRange()](#getULUnicodeRange--) | Ottiene il valore ULUnicodeRange. |
| [getUSBreakChar()](#getUSBreakChar--) | Ottiene il valore USBreakChar. |
| [getUSDefaultChar()](#getUSDefaultChar--) | Ottiene il valore USDefaultChar. |
| [getUSFirstCharIndex()](#getUSFirstCharIndex--) | Ottiene il valore USFirstCharIndex. |
| [getUSLastCharIndex()](#getUSLastCharIndex--) | Ottiene il valore USLastCharIndex. |
| [getUSLowerOpticalPointSize()](#getUSLowerOpticalPointSize--) | Ottiene il valore USLowerOpticalPointSize. |
| [getUSMaxContext()](#getUSMaxContext--) | Ottiene il valore USMaxContext. |
| [getUSUpperOpticalPointSize()](#getUSUpperOpticalPointSize--) | Ottiene il valore USUpperOpticalPointSize. |
| [getUSWeightClass()](#getUSWeightClass--) | Indica il peso visivo (grado di oscurità o spessore dei tratti) dei caratteri nel Font. |
| [getUSWidthClass()](#getUSWidthClass--) | Indica una variazione relativa dal rapporto d'aspetto normale (rapporto larghezza/altezza) come specificato da un designer di font per i glifi in un Font. |
| [getUSWinAscent()](#getUSWinAscent--) | Ottiene il valore USWinAscent. |
| [getUSWinDescent()](#getUSWinDescent--) | Ottiene il valore USWinDescent. |
| [getVersion()](#getVersion--) | Ottiene il valore Version. |
| [getXAvgCharWidth()](#getXAvgCharWidth--) | Ottiene il parametro Average Character Width. |
| [getYStrikeoutPosition()](#getYStrikeoutPosition--) | Ottiene il valore YStrikeoutPosition. |
| [getYStrikeoutSize()](#getYStrikeoutSize--) | Ottiene il valore YStrikeoutSize. |
| [getYSubscriptXOffset()](#getYSubscriptXOffset--) | Ottiene il valore YSubscriptXOffset. |
| [getYSubscriptXSize()](#getYSubscriptXSize--) | Ottiene il valore YSubscriptXSize. |
| [getYSubscriptYOffset()](#getYSubscriptYOffset--) | Ottiene il valore YSubscriptYOffset. |
| [getYSubscriptYSize()](#getYSubscriptYSize--) | Ottiene il valore YSubscriptYSize. |
| [getYSuperscriptXOffset()](#getYSuperscriptXOffset--) | Ottiene il valore YSuperscriptXOffset. |
| [getYSuperscriptXSize()](#getYSuperscriptXSize--) | Ottiene il valore YSuperscriptXSize. |
| [getYSuperscriptYOffset()](#getYSuperscriptYOffset--) | Ottiene il valore YSuperscriptYOffset. |
| [getYSuperscriptYSize()](#getYSuperscriptYSize--) | Ottiene il valore YSuperscriptYSize. |
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
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getAchVendId() {#getAchVendId--}
```
public byte[] getAchVendId()
```


Ottiene il valore AchVendId.

**Returns:**
byte[] - valore AchVendId.
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


Contiene informazioni sulla natura dei pattern del font.

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
int - L'informazione.
### getFSType() {#getFSType--}
```
public int getFSType()
```


Ottiene il valore FSType.

--------------------

Indica i diritti di licenza per l'incorporamento del font per il Font.

**Returns:**
int - valore FSType.
### getLicenseFlags() {#getLicenseFlags--}
```
public LicenseFlags getLicenseFlags()
```


Ottiene i flag incorporati (fsType) nella rappresentazione dell'oggetto.

**Returns:**
[LicenseFlags](../../com.aspose.font/licenseflags) - Embedded flags.
### getOffset() {#getOffset--}
```
public long getOffset()
```


Ottiene l'offset dall'inizio di sfnt.

**Returns:**
long - Offset dall'inizio di sfnt.
### getPanose() {#getPanose--}
```
public byte[] getPanose()
```


Questa serie di 10 byte di numeri è usata per descrivere le caratteristiche visive di un determinato tipo di carattere. Queste caratteristiche sono poi utilizzate per associare il font ad altri font di aspetto simile con nomi diversi.

**Returns:**
byte[] - Le caratteristiche visive di un determinato tipo di carattere.
### getSCapHeight() {#getSCapHeight--}
```
public short getSCapHeight()
```


Ottiene il valore SCapHeight.

**Returns:**
short - valore SCapHeight.
### getSFamilyClass() {#getSFamilyClass--}
```
public short getSFamilyClass()
```


Questo parametro è una classificazione del design della famiglia di font. La classe di font e la sottoclasse di font sono valori registrati assegnati da IBM a ciascuna famiglia di font. Questo parametro è destinato all'uso per selezionare un font alternativo quando il font richiesto non è disponibile.

**Returns:**
short - Classificazione del design della famiglia di font.
### getSTypoAscender() {#getSTypoAscender--}
```
public short getSTypoAscender()
```


Ottiene il valore STypoAscender.

**Returns:**
short - valore STypoAscender.
### getSTypoDescender() {#getSTypoDescender--}
```
public short getSTypoDescender()
```


Ottiene il valore STypoDescender.

**Returns:**
short - valore STypoDescender.
### getSTypoLineGap() {#getSTypoLineGap--}
```
public short getSTypoLineGap()
```


Ottiene il valore STypoLineGap.

**Returns:**
short - valore STypoLineGap.
### getSXHeight() {#getSXHeight--}
```
public short getSXHeight()
```


Ottiene il valore SXHeight.

**Returns:**
short - valore SXHeight.
### getSupportedTableVersions() {#getSupportedTableVersions--}
```
public int[] getSupportedTableVersions()
```


Ottiene le versioni supportate della tabella OS/2.

**Returns:**
int[] - Versioni supportate della tabella OS/2.
### getTag() {#getTag--}
```
public static String getTag()
```


Ottiene l'etichetta della tabella.

**Returns:**
java.lang.String - Etichetta della tabella.
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


Riferimento al repository della tabella TTF.

**Returns:**
[TtfTableRepository](../../com.aspose.font/ttftablerepository) - Reference to TTF table repository.
### getULCodePageRange() {#getULCodePageRange--}
```
public long[] getULCodePageRange()
```


Ottiene il valore ULCodePageRange.

**Returns:**
long[] - Valore ULCodePageRange.
### getULUnicodeRange() {#getULUnicodeRange--}
```
public long[] getULUnicodeRange()
```


Ottiene il valore ULUnicodeRange.

**Returns:**
long[] - Valore ULUnicodeRange.
### getUSBreakChar() {#getUSBreakChar--}
```
public int getUSBreakChar()
```


Ottiene il valore USBreakChar.

**Returns:**
int - Valore USBreakChar.
### getUSDefaultChar() {#getUSDefaultChar--}
```
public int getUSDefaultChar()
```


Ottiene il valore USDefaultChar.

**Returns:**
int - Valore USDefaultChar.
### getUSFirstCharIndex() {#getUSFirstCharIndex--}
```
public int getUSFirstCharIndex()
```


Ottiene il valore USFirstCharIndex.

**Returns:**
int - Valore USFirstCharIndex.
### getUSLastCharIndex() {#getUSLastCharIndex--}
```
public int getUSLastCharIndex()
```


Ottiene il valore USLastCharIndex.

**Returns:**
int - Valore USLastCharIndex.
### getUSLowerOpticalPointSize() {#getUSLowerOpticalPointSize--}
```
public int getUSLowerOpticalPointSize()
```


Ottiene il valore USLowerOpticalPointSize.

**Returns:**
int - Il valore USLowerOpticalPointSize.
### getUSMaxContext() {#getUSMaxContext--}
```
public int getUSMaxContext()
```


Ottiene il valore USMaxContext.

**Returns:**
int - Valore UsMaxContext.
### getUSUpperOpticalPointSize() {#getUSUpperOpticalPointSize--}
```
public int getUSUpperOpticalPointSize()
```


Ottiene il valore USUpperOpticalPointSize.

**Returns:**
int - Il valore USUpperOpticalPointSize.
### getUSWeightClass() {#getUSWeightClass--}
```
public int getUSWeightClass()
```


Indica il peso visivo (grado di oscurità o spessore dei tratti) dei caratteri nel Font.

**Returns:**
int - Il peso visivo (grado di oscurità o spessore dei tratti) dei caratteri nel Font.
### getUSWidthClass() {#getUSWidthClass--}
```
public int getUSWidthClass()
```


Indica una variazione relativa dal rapporto d'aspetto normale (rapporto larghezza/altezza) come specificato da un designer di font per i glifi in un Font.

**Returns:**
int - Una variazione relativa dal rapporto d'aspetto normale (rapporto larghezza/altezza) come specificato da un designer di font per i glifi in un Font.
### getUSWinAscent() {#getUSWinAscent--}
```
public int getUSWinAscent()
```


Ottiene il valore USWinAscent.

**Returns:**
int - Valore USWinAscent.
### getUSWinDescent() {#getUSWinDescent--}
```
public int getUSWinDescent()
```


Ottiene il valore USWinDescent.

**Returns:**
int - Valore USWinDescent.
### getVersion() {#getVersion--}
```
public int getVersion()
```


Ottiene il valore Version.

**Returns:**
int - Valore Versione.
### getXAvgCharWidth() {#getXAvgCharWidth--}
```
public short getXAvgCharWidth()
```


Ottiene il parametro Average Character Width.

**Returns:**
short - Il parametro Larghezza Media Carattere.
### getYStrikeoutPosition() {#getYStrikeoutPosition--}
```
public short getYStrikeoutPosition()
```


Ottiene il valore YStrikeoutPosition.

**Returns:**
short - Valore YStrikeoutPosition.
### getYStrikeoutSize() {#getYStrikeoutSize--}
```
public short getYStrikeoutSize()
```


Ottiene il valore YStrikeoutSize.

**Returns:**
short - Valore YStrikeoutSize.
### getYSubscriptXOffset() {#getYSubscriptXOffset--}
```
public short getYSubscriptXOffset()
```


Ottiene il valore YSubscriptXOffset.

**Returns:**
short - Valore YSubscriptXOffset.
### getYSubscriptXSize() {#getYSubscriptXSize--}
```
public short getYSubscriptXSize()
```


Ottiene il valore YSubscriptXSize.

**Returns:**
short - Valore YSubscriptXSize.
### getYSubscriptYOffset() {#getYSubscriptYOffset--}
```
public short getYSubscriptYOffset()
```


Ottiene il valore YSubscriptYOffset.

**Returns:**
short - Valore YSubscriptYOffset.
### getYSubscriptYSize() {#getYSubscriptYSize--}
```
public short getYSubscriptYSize()
```


Ottiene il valore YSubscriptYSize.

**Returns:**
short - Valore YSubscriptYSize.
### getYSuperscriptXOffset() {#getYSuperscriptXOffset--}
```
public short getYSuperscriptXOffset()
```


Ottiene il valore YSuperscriptXOffset.

**Returns:**
short - Valore YSuperscriptXOffset.
### getYSuperscriptXSize() {#getYSuperscriptXSize--}
```
public short getYSuperscriptXSize()
```


Ottiene il valore YSuperscriptXSize.

**Returns:**
short - Valore YSuperscriptXSize.
### getYSuperscriptYOffset() {#getYSuperscriptYOffset--}
```
public short getYSuperscriptYOffset()
```


Ottiene il valore YSuperscriptYOffset.

**Returns:**
short - Valore YSuperscriptYOffset.
### getYSuperscriptYSize() {#getYSuperscriptYSize--}
```
public short getYSuperscriptYSize()
```


Ottiene il valore YSuperscriptYSize.

**Returns:**
short - valore YSuperscriptYSize.
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

