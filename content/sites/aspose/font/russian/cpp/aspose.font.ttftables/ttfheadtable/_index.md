---
title: "Aspose::Font::TtfTables::TtfHeadTable класс"
linktitle: "TtfHeadTable"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::TtfTables::TtfHeadTable класс. Представляет таблицу \\\"head\\\" шрифта TTF в C++."
type: docs
weight: 700
url: /ru/cpp/aspose.font.ttftables/ttfheadtable/
---
## TtfHeadTable class


Представляет таблицу \"head\" TTF [Font](../../aspose.font/font/) файла.

```cpp
class TtfHeadTable : public Aspose::Font::TtfTables::TtfTableBase
```

## Методы

| Метод | Описание |
| --- | --- |
| [get_CheckSumAdjustment](./get_checksumadjustment/)() const | Получает uint32 checkSumAdjustment. Для вычисления: установить его в 0, вычислить контрольную сумму для таблицы 'head' и поместить её в каталог таблиц, просуммировать весь шрифт как uint32, затем сохранить B1B0AFBA - сумма. Контрольная сумма для таблицы 'head' не будет ошибочной. Это нормально. |
| [get_Created](./get_created/)() const | Получает longDateTime дату создания в международном формате. |
| [get_Flags](./get_flags/)() const | Получает uint16 flags. |
| [get_FontDirectionHint](./get_fontdirectionhint/)() const | Получает int16 fontDirectionHint. 0 Смешанные направленные глифы; 1 Только явно слева направо; 2 Как 1, но также содержит нейтральные; -1 Только явно справа налево; -2 Как -1, но также содержит нейтральные. |
| [get_FontRevision](./get_fontrevision/)() const | Получает фиксированный fontRevision, установленный производителем шрифта. |
| [get_GlyphDataFormat](./get_glyphdataformat/)() const | Получает int16 glyphDataFormat, 0 для текущего формата. |
| [get_IndexToLocFormat](./get_indextolocformat/)() const | Получает int16 indexToLocFormat, 0 для коротких смещений, 1 для длинных. |
| [get_LowestRecPPEM](./get_lowestrecppem/)() const | Получает uint16 lowestRecPPEM — минимальный читаемый размер в пикселях. |
| [get_MacStyle](./get_macstyle/)() const | Получает uint16 macStyle. |
| [get_MagicNumber](./get_magicnumber/)() const | Получает uint32 magicNumber, установленный в 0x5F0F3CF5. |
| [get_Modified](./get_modified/)() const | Получает longDateTime дату изменения в международном формате. |
| static [get_Tag](./get_tag/)() | Получает тег таблицы. |
| [get_UnitsPerEM](./get_unitsperem/)() const | Получает uint16 unitsPerEm в диапазоне от 64 до 16384. |
| [get_Version](./get_version/)() const | Фиксированная версия 0x00010000, если (версия 1.0). |
| [get_XMax](./get_xmax/)() const | Получает FWord xMax для всех ограничительных рамок глифов. |
| [get_XMin](./get_xmin/)() const | Получает FWord xMin для всех ограничительных рамок глифов. |
| [get_YMax](./get_ymax/)() const | Получает FWord yMax для всех ограничительных рамок глифов. |
| [get_YMin](./get_ymin/)() const | Получает FWord yMin для всех ограничительных рамок глифов. |
## См. также

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
