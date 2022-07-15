---
title: TtfOs2Table
second_title: Справочник по API Aspose.Font для .NET
description: Представляет таблицу OS/2 файла шрифта TTF.
type: docs
weight: 980
url: /ru/net/aspose.font.ttftables/ttfos2table/
---
## TtfOs2Table class

Представляет таблицу "OS/2" файла шрифта TTF.

```csharp
public class TtfOs2Table : TtfTableBase
```

## Характеристики

| Имя | Описание |
| --- | --- |
| [AchVendId](../../aspose.font.ttftables/ttfos2table/achvendid) { get; } | Получает значение AchVendId. |
| [FSSelection](../../aspose.font.ttftables/ttfos2table/fsselection) { get; } | Содержит информацию о характере рисунков шрифта. 0 bit 1 ITALIC Шрифт содержит курсивные символы, в противном случае они расположены вертикально. 1 UNDERSCORE Символы подчеркиваются. 2 ОТРИЦАТЕЛЬНЫЕ У персонажей передний план и фон перевернуты. 3 КОНТУР Контурные (пустые) символы, в противном случае они сплошные. 4 УДАР Персонажи перегружены. 5 бит 0 BOLD Символы выделены жирным шрифтом. 6 ОБЫЧНЫЕ Символы имеют стандартный вес/начертание для Шрифта. |
| [FSType](../../aspose.font.ttftables/ttfos2table/fstype) { get; } | Получает значение FSType. |
| [Offset](../../aspose.font.ttftables/ttftablebase/offset) { get; } | Получает смещение от начала sfnt. |
| [Panose](../../aspose.font.ttftables/ttfos2table/panose) { get; } | Этот 10-байтовый ряд чисел используется для описания визуальных характеристик данного шрифта. Эти характеристики затем используются для связывания шрифта с другими шрифтами с похожим внешним видом, но с другими именами. |
| [SCapHeight](../../aspose.font.ttftables/ttfos2table/scapheight) { get; } | Получает значение SCapHeight. |
| [SFamilyClass](../../aspose.font.ttftables/ttfos2table/sfamilyclass) { get; } | Этот параметр является классификацией дизайна семейства шрифтов. Класс шрифта и подкласс шрифта являются зарегистрированными значениями, присвоенными IBM каждому семейству шрифтов. Этот параметр предназначен для использования при выборе альтернативного шрифта, когда запрошенный шрифт недоступен. |
| [STypoAscender](../../aspose.font.ttftables/ttfos2table/stypoascender) { get; } | Получает значение STypoAscender. |
| [STypoDescender](../../aspose.font.ttftables/ttfos2table/stypodescender) { get; } | Получает значение STypoDescender. |
| [STypoLineGap](../../aspose.font.ttftables/ttfos2table/stypolinegap) { get; } | Получает значение STypoLineGap. |
| [SupportedTableVersions](../../aspose.font.ttftables/ttfos2table/supportedtableversions) { get; } | Получает поддерживаемые версии таблицы OS/2. |
| [SXHeight](../../aspose.font.ttftables/ttfos2table/sxheight) { get; } | Получает значение SXHeight. |
| [TtfTables](../../aspose.font.ttftables/ttftablebase/ttftables) { get; } | Ссылка на репозиторий таблиц TTF. |
| [ULCodePageRange](../../aspose.font.ttftables/ttfos2table/ulcodepagerange) { get; } | Получает значение ULCodePageRange. |
| [ULUnicodeRange](../../aspose.font.ttftables/ttfos2table/ulunicoderange) { get; } | Получает значение ULUnicodeRange. |
| [USBreakChar](../../aspose.font.ttftables/ttfos2table/usbreakchar) { get; } | Получает значение USBreakChar. |
| [USDefaultChar](../../aspose.font.ttftables/ttfos2table/usdefaultchar) { get; } | Получает значение USDefaultChar. |
| [USFirstCharIndex](../../aspose.font.ttftables/ttfos2table/usfirstcharindex) { get; } | Получает значение USFirstCharIndex. |
| [USLastCharIndex](../../aspose.font.ttftables/ttfos2table/uslastcharindex) { get; } | Получает значение USLastCharIndex. |
| [USMaxContext](../../aspose.font.ttftables/ttfos2table/usmaxcontext) { get; } | Получает значение USMaxContext. |
| [USWeightClass](../../aspose.font.ttftables/ttfos2table/usweightclass) { get; } | Указывает визуальный вес (степень черноты или толщина штрихов) символов в Шрифте. |
| [USWidthClass](../../aspose.font.ttftables/ttfos2table/uswidthclass) { get; } | Указывает относительное отклонение от нормального соотношения сторон (отношение ширины к высоте), как указано разработчиком шрифта для глифов в шрифте. |
| [USWinAscent](../../aspose.font.ttftables/ttfos2table/uswinascent) { get; } | Получает значение USWinAscent. |
| [USWinDescent](../../aspose.font.ttftables/ttfos2table/uswindescent) { get; } | Получает значение USWinDescent. |
| [Version](../../aspose.font.ttftables/ttfos2table/version) { get; } | Получает значение версии. |
| [XAvgCharWidth](../../aspose.font.ttftables/ttfos2table/xavgcharwidth) { get; } | Получает параметр средней ширины символов. |
| [YStrikeoutPosition](../../aspose.font.ttftables/ttfos2table/ystrikeoutposition) { get; } | Получает значение YStrikeoutPosition. |
| [YStrikeoutSize](../../aspose.font.ttftables/ttfos2table/ystrikeoutsize) { get; } | Получает значение YStrikeoutSize. |
| [YSubscriptXOffset](../../aspose.font.ttftables/ttfos2table/ysubscriptxoffset) { get; } | Получает значение YSubscriptXOffset. |
| [YSubscriptXSize](../../aspose.font.ttftables/ttfos2table/ysubscriptxsize) { get; } | Получает значение YSubscriptXSize. |
| [YSubscriptYOffset](../../aspose.font.ttftables/ttfos2table/ysubscriptyoffset) { get; } | Получает значение YSubscriptYOffset. |
| [YSubscriptYSize](../../aspose.font.ttftables/ttfos2table/ysubscriptysize) { get; } | Получает значение YSubscriptYSize. |
| [YSuperscriptXOffset](../../aspose.font.ttftables/ttfos2table/ysuperscriptxoffset) { get; } | Получает значение YSuperscriptXOffset. |
| [YSuperscriptXSize](../../aspose.font.ttftables/ttfos2table/ysuperscriptxsize) { get; } | Получает значение YSuperscriptXSize. |
| [YSuperscriptYOffset](../../aspose.font.ttftables/ttfos2table/ysuperscriptyoffset) { get; } | Получает значение YSuperscriptYOffset. |
| [YSuperscriptYSize](../../aspose.font.ttftables/ttfos2table/ysuperscriptysize) { get; } | Получает значение YSuperscriptYSize. |
| static [Tag](../../aspose.font.ttftables/ttfos2table/tag) { get; } | Получает тег таблицы. |

## Методы

| Имя | Описание |
| --- | --- |
| [GetLicenseFlags](../../aspose.font.ttftables/ttfos2table/getlicenseflags)() | Получает встроенные флаги (fsType) в представлении объекта. |

### Смотрите также

* class [TtfTableBase](../ttftablebase)
* пространство имен [Aspose.Font.TtfTables](../../aspose.font.ttftables)
* сборка [Aspose.Font](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Font.dll -->
