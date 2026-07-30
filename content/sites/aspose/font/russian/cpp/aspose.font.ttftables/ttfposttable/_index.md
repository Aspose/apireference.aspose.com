---
title: "Aspose::Font::TtfTables::TtfPostTable класс"
linktitle: "TtfPostTable"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::TtfTables::TtfPostTable класс. Представляет таблицу \"post\" файла шрифта TTF в C++."
type: docs
weight: 1500
url: /ru/cpp/aspose.font.ttftables/ttfposttable/
---
## TtfPostTable class


Представляет таблицу "post" файла TTF [Font](../../aspose.font/font/) файл.

```cpp
class TtfPostTable : public Aspose::Font::TtfTables::TtfTableBase
```

## Методы

| Метод | Описание |
| --- | --- |
| [get_Format](./get_format/)() | Получает фиксированный формат (версию) этой таблицы. Устарело, используйте свойство [TableFormat](../). |
| [get_HasNoPostScriptNames](./get_hasnopostscriptnames/)() | Указывает, что информация о PostScript‑именах для глифов в этом файле шрифта не предоставлена. |
| [get_IsFixedPitch](./get_isfixedpitch/)() | Получает uint32 isFixedPitch. 0, если шрифт пропорционально интервалирован, ненулевое значение, если шрифт не пропорционально интервалирован (т.е. моноширинный). |
| [get_ItalicAngle](./get_italicangle/)() | Получает фиксированный italicAngle. Наклон курсивом в градусах. |
| [get_MaxMemType1](./get_maxmemtype1/)() | Получает uint32 maxMemType1. Максимальное использование памяти, когда TrueType шрифт загружается как Type 1 [Font](../../aspose.font/font/). |
| [get_MaxMemType42](./get_maxmemtype42/)() | Получает uint32 maxMemType42. Максимальное использование памяти, когда TrueType шрифт загружается как Type 42 [Font](../../aspose.font/font/). |
| [get_MinMemType1](./get_minmemtype1/)() | Получает uint32 minMemType1. Минимальное использование памяти, когда TrueType шрифт загружается как Type 1 [Font](../../aspose.font/font/). |
| [get_MinMemType42](./get_minmemtype42/)() | Получает uint32 minMemType42. Минимальное использование памяти, когда TrueType шрифт загружается как Type 42 [Font](../../aspose.font/font/). |
| [get_TableFormat](./get_tableformat/)() | Получает фиксированный формат (версию) этой таблицы. Используйте свойства MajorNumber и MinorNUmber объекта [Version16Dot16](../) в шестнадцатеричной нотации для определения используемой версии. |
| static [get_Tag](./get_tag/)() | Получает тег таблицы. |
| [get_UnderlinePosition](./get_underlineposition/)() | Получает значение FWord underlinePosition. |
| [get_UnderlineThickness](./get_underlinethickness/)() | Получает значение FWord underlineThickness. |
| [GetAllGlyphIndexesForGlyphName](./getallglyphindexesforglyphname/)(System::String) | Получает массив индексов глифов по имени глифа. |
| [GetGlyphIndex](./getglyphindex/)(System::String) | Получает индекс глифа по имени глифа. |
| [GetGlyphName](./getglyphname/)(uint32_t) | Получает имя глифа по индексу глифа. |
## См. также

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
