---
title: "TtfOs2Table"
second_title: "Справочник API Aspose.Font for Java"
description: "Представляет таблицу OS/2 файла шрифта TTF."
type: docs
weight: 106
url: /ru/java/com.aspose.font/ttfos2table/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfOs2Table extends TtfTableBase
```

Представляет таблицу "OS/2" файла шрифта TTF.
## Методы

| Метод | Описание |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAchVendId()](#getAchVendId--) | Получает значение AchVendId. |
| [getClass()](#getClass--) |  |
| [getFSSelection()](#getFSSelection--) | Содержит информацию о характере шаблонов шрифтов. |
| [getFSType()](#getFSType--) | Получает значение FSType. |
| [getLicenseFlags()](#getLicenseFlags--) | Получает встроенные флаги (fsType) в представлении объекта. |
| [getOffset()](#getOffset--) | Получает смещение от начала sfnt. |
| [getPanose()](#getPanose--) | Эта серия из 10 байтов используется для описания визуальных характеристик данного гарнитура. |
| [getSCapHeight()](#getSCapHeight--) | Получает значение SCapHeight. |
| [getSFamilyClass()](#getSFamilyClass--) | Этот параметр является классификацией дизайна семейства шрифтов. |
| [getSTypoAscender()](#getSTypoAscender--) | Получает значение STypoAscender. |
| [getSTypoDescender()](#getSTypoDescender--) | Получает значение STypoDescender. |
| [getSTypoLineGap()](#getSTypoLineGap--) | Получает значение STypoLineGap. |
| [getSXHeight()](#getSXHeight--) | Получает значение SXHeight. |
| [getSupportedTableVersions()](#getSupportedTableVersions--) | Получает поддерживаемые версии таблицы OS/2. |
| [getTag()](#getTag--) | Получает тег таблицы. |
| [getTtfTables()](#getTtfTables--) | Ссылка на репозиторий таблицы TTF. |
| [getULCodePageRange()](#getULCodePageRange--) | Получает значение ULCodePageRange. |
| [getULUnicodeRange()](#getULUnicodeRange--) | Получает значение ULUnicodeRange. |
| [getUSBreakChar()](#getUSBreakChar--) | Получает значение USBreakChar. |
| [getUSDefaultChar()](#getUSDefaultChar--) | Получает значение USDefaultChar. |
| [getUSFirstCharIndex()](#getUSFirstCharIndex--) | Получает значение USFirstCharIndex. |
| [getUSLastCharIndex()](#getUSLastCharIndex--) | Получает значение USLastCharIndex. |
| [getUSLowerOpticalPointSize()](#getUSLowerOpticalPointSize--) | Получает значение USLowerOpticalPointSize. |
| [getUSMaxContext()](#getUSMaxContext--) | Получает значение USMaxContext. |
| [getUSUpperOpticalPointSize()](#getUSUpperOpticalPointSize--) | Получает значение USUpperOpticalPointSize. |
| [getUSWeightClass()](#getUSWeightClass--) | Указывает визуальный вес (степень черноты или толщины штрихов) символов в шрифте. |
| [getUSWidthClass()](#getUSWidthClass--) | Указывает относительное отклонение от нормального соотношения сторон (соотношения ширины к высоте), заданного дизайнером шрифта для глифов. |
| [getUSWinAscent()](#getUSWinAscent--) | Получает значение USWinAscent. |
| [getUSWinDescent()](#getUSWinDescent--) | Получает значение USWinDescent. |
| [getVersion()](#getVersion--) | Получает значение Version. |
| [getXAvgCharWidth()](#getXAvgCharWidth--) | Получает параметр Average Character Width. |
| [getYStrikeoutPosition()](#getYStrikeoutPosition--) | Получает значение YStrikeoutPosition. |
| [getYStrikeoutSize()](#getYStrikeoutSize--) | Получает значение YStrikeoutSize. |
| [getYSubscriptXOffset()](#getYSubscriptXOffset--) | Получает значение YSubscriptXOffset. |
| [getYSubscriptXSize()](#getYSubscriptXSize--) | Получает значение YSubscriptXSize. |
| [getYSubscriptYOffset()](#getYSubscriptYOffset--) | Получает значение YSubscriptYOffset. |
| [getYSubscriptYSize()](#getYSubscriptYSize--) | Получает значение YSubscriptYSize. |
| [getYSuperscriptXOffset()](#getYSuperscriptXOffset--) | Получает значение YSuperscriptXOffset. |
| [getYSuperscriptXSize()](#getYSuperscriptXSize--) | Получает значение YSuperscriptXSize. |
| [getYSuperscriptYOffset()](#getYSuperscriptYOffset--) | Получает значение YSuperscriptYOffset. |
| [getYSuperscriptYSize()](#getYSuperscriptYSize--) | Получает значение YSuperscriptYSize. |
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
| Параметр | Тип | Описание |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getAchVendId() {#getAchVendId--}
```
public byte[] getAchVendId()
```


Получает значение AchVendId.

**Returns:**
byte[] - значение AchVendId.
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


Содержит информацию о характере шаблонов шрифтов.

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
int - Информация.
### getFSType() {#getFSType--}
```
public int getFSType()
```


Получает значение FSType.

--------------------

Указывает права лицензии на встраивание шрифта для Font.

**Returns:**
int - значение FSType.
### getLicenseFlags() {#getLicenseFlags--}
```
public LicenseFlags getLicenseFlags()
```


Получает встроенные флаги (fsType) в представлении объекта.

**Returns:**
[LicenseFlags](../../com.aspose.font/licenseflags) - Embedded flags.
### getOffset() {#getOffset--}
```
public long getOffset()
```


Получает смещение от начала sfnt.

**Returns:**
long — Смещение от начала sfnt.
### getPanose() {#getPanose--}
```
public byte[] getPanose()
```


Эта серия из 10 байтов используется для описания визуальных характеристик данного гарнитура. Эти характеристики затем используются для сопоставления шрифта с другими шрифтами схожего внешнего вида, имеющими разные имена.

**Returns:**
byte[] - визуальные характеристики данного гарнитура.
### getSCapHeight() {#getSCapHeight--}
```
public short getSCapHeight()
```


Получает значение SCapHeight.

**Returns:**
short - значение SCapHeight.
### getSFamilyClass() {#getSFamilyClass--}
```
public short getSFamilyClass()
```


Этот параметр представляет классификацию дизайна семейства шрифтов. Класс шрифта и подкласс шрифта — зарегистрированные значения, присвоенные IBM каждому семейству шрифтов. Этот параметр предназначен для выбора альтернативного шрифта, когда запрашиваемый шрифт недоступен.

**Returns:**
short - классификация дизайна семейства шрифтов.
### getSTypoAscender() {#getSTypoAscender--}
```
public short getSTypoAscender()
```


Получает значение STypoAscender.

**Returns:**
short - значение STypoAscender.
### getSTypoDescender() {#getSTypoDescender--}
```
public short getSTypoDescender()
```


Получает значение STypoDescender.

**Returns:**
short - значение STypoDescender.
### getSTypoLineGap() {#getSTypoLineGap--}
```
public short getSTypoLineGap()
```


Получает значение STypoLineGap.

**Returns:**
short - значение STypoLineGap.
### getSXHeight() {#getSXHeight--}
```
public short getSXHeight()
```


Получает значение SXHeight.

**Returns:**
short - значение SXHeight.
### getSupportedTableVersions() {#getSupportedTableVersions--}
```
public int[] getSupportedTableVersions()
```


Получает поддерживаемые версии таблицы OS/2.

**Returns:**
int[] - Поддерживаемые версии таблицы OS/2.
### getTag() {#getTag--}
```
public static String getTag()
```


Получает тег таблицы.

**Returns:**
java.lang.String - Тег таблицы.
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


Ссылка на репозиторий таблицы TTF.

**Returns:**
[TtfTableRepository](../../com.aspose.font/ttftablerepository) - Reference to TTF table repository.
### getULCodePageRange() {#getULCodePageRange--}
```
public long[] getULCodePageRange()
```


Получает значение ULCodePageRange.

**Returns:**
long[] - Значение ULCodePageRange.
### getULUnicodeRange() {#getULUnicodeRange--}
```
public long[] getULUnicodeRange()
```


Получает значение ULUnicodeRange.

**Returns:**
long[] - Значение ULUnicodeRange.
### getUSBreakChar() {#getUSBreakChar--}
```
public int getUSBreakChar()
```


Получает значение USBreakChar.

**Returns:**
int - Значение USBreakChar.
### getUSDefaultChar() {#getUSDefaultChar--}
```
public int getUSDefaultChar()
```


Получает значение USDefaultChar.

**Returns:**
int - Значение USDefaultChar.
### getUSFirstCharIndex() {#getUSFirstCharIndex--}
```
public int getUSFirstCharIndex()
```


Получает значение USFirstCharIndex.

**Returns:**
int - Значение USFirstCharIndex.
### getUSLastCharIndex() {#getUSLastCharIndex--}
```
public int getUSLastCharIndex()
```


Получает значение USLastCharIndex.

**Returns:**
int - Значение USLastCharIndex.
### getUSLowerOpticalPointSize() {#getUSLowerOpticalPointSize--}
```
public int getUSLowerOpticalPointSize()
```


Получает значение USLowerOpticalPointSize.

**Returns:**
int - Значение USLowerOpticalPointSize.
### getUSMaxContext() {#getUSMaxContext--}
```
public int getUSMaxContext()
```


Получает значение USMaxContext.

**Returns:**
int - Значение UsMaxContext.
### getUSUpperOpticalPointSize() {#getUSUpperOpticalPointSize--}
```
public int getUSUpperOpticalPointSize()
```


Получает значение USUpperOpticalPointSize.

**Returns:**
int - Значение USUpperOpticalPointSize.
### getUSWeightClass() {#getUSWeightClass--}
```
public int getUSWeightClass()
```


Указывает визуальный вес (степень черноты или толщины штрихов) символов в шрифте.

**Returns:**
int - Визуальный вес (степень черноты или толщины штрихов) символов в Font.
### getUSWidthClass() {#getUSWidthClass--}
```
public int getUSWidthClass()
```


Указывает относительное отклонение от нормального соотношения сторон (соотношения ширины к высоте), заданного дизайнером шрифта для глифов.

**Returns:**
int - Относительное изменение от нормального соотношения сторон (соотношение ширины к высоте), указанное дизайнером шрифта для глифов в Font.
### getUSWinAscent() {#getUSWinAscent--}
```
public int getUSWinAscent()
```


Получает значение USWinAscent.

**Returns:**
int - Значение USWinAscent.
### getUSWinDescent() {#getUSWinDescent--}
```
public int getUSWinDescent()
```


Получает значение USWinDescent.

**Returns:**
int - Значение USWinDescent.
### getVersion() {#getVersion--}
```
public int getVersion()
```


Получает значение Version.

**Returns:**
int - Значение Version.
### getXAvgCharWidth() {#getXAvgCharWidth--}
```
public short getXAvgCharWidth()
```


Получает параметр Average Character Width.

**Returns:**
short - Параметр Average Character Width.
### getYStrikeoutPosition() {#getYStrikeoutPosition--}
```
public short getYStrikeoutPosition()
```


Получает значение YStrikeoutPosition.

**Returns:**
short - Значение YStrikeoutPosition.
### getYStrikeoutSize() {#getYStrikeoutSize--}
```
public short getYStrikeoutSize()
```


Получает значение YStrikeoutSize.

**Returns:**
short - Значение YStrikeoutSize.
### getYSubscriptXOffset() {#getYSubscriptXOffset--}
```
public short getYSubscriptXOffset()
```


Получает значение YSubscriptXOffset.

**Returns:**
short - Значение YSubscriptXOffset.
### getYSubscriptXSize() {#getYSubscriptXSize--}
```
public short getYSubscriptXSize()
```


Получает значение YSubscriptXSize.

**Returns:**
short - Значение YSubscriptXSize.
### getYSubscriptYOffset() {#getYSubscriptYOffset--}
```
public short getYSubscriptYOffset()
```


Получает значение YSubscriptYOffset.

**Returns:**
short - Значение YSubscriptYOffset.
### getYSubscriptYSize() {#getYSubscriptYSize--}
```
public short getYSubscriptYSize()
```


Получает значение YSubscriptYSize.

**Returns:**
short - Значение YSubscriptYSize.
### getYSuperscriptXOffset() {#getYSuperscriptXOffset--}
```
public short getYSuperscriptXOffset()
```


Получает значение YSuperscriptXOffset.

**Returns:**
short - Значение YSuperscriptXOffset.
### getYSuperscriptXSize() {#getYSuperscriptXSize--}
```
public short getYSuperscriptXSize()
```


Получает значение YSuperscriptXSize.

**Returns:**
short - Значение YSuperscriptXSize.
### getYSuperscriptYOffset() {#getYSuperscriptYOffset--}
```
public short getYSuperscriptYOffset()
```


Получает значение YSuperscriptYOffset.

**Returns:**
short - Значение YSuperscriptYOffset.
### getYSuperscriptYSize() {#getYSuperscriptYSize--}
```
public short getYSuperscriptYSize()
```


Получает значение YSuperscriptYSize.

**Returns:**
короткое - значение YSuperscriptYSize.
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
| Параметр | Тип | Описание |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

