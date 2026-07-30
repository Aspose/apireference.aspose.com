---
title: "Класс Aspose::Font::TtfTables::TtfMaxpTable"
linktitle: "TtfMaxpTable"
second_title: "Aspose.Font для C++"
description: "Класс Aspose::Font::TtfTables::TtfMaxpTable. Представляет таблицу \"maxp\" файла шрифта TTF в C++."
type: docs
weight: 1200
url: /ru/cpp/aspose.font.ttftables/ttfmaxptable/
---
## TtfMaxpTable class


Представляет таблицу "maxp" файла TTF [Font](../../aspose.font/font/).

```cpp
class TtfMaxpTable : public Aspose::Font::TtfTables::TtfTableBase
```

## Методы

| Метод | Описание |
| --- | --- |
| [get_MaxComponentContours](./get_maxcomponentcontours/)() const | Получает uint16 maxComponentContours — контуры в составном глифе. |
| [get_MaxComponentDepth](./get_maxcomponentdepth/)() const | Получает uint16 maxComponentDepth — уровни рекурсии, устанавливается в 0, если шрифт содержит только простые глифы. |
| [get_MaxComponentElements](./get_maxcomponentelements/)() const | Получает uint16 maxComponentElements — количество глифов, ссылок на верхнем уровне. |
| [get_MaxComponentPoints](./get_maxcomponentpoints/)() const | Получает uint16 maxComponentPoints — точки в составном глифе. |
| [get_MaxContours](./get_maxcontours/)() const | Получает uint16 maxContours — контуры в несоставном глифе. |
| [get_MaxFunctionDefs](./get_maxfunctiondefs/)() const | Получает uint16 maxFunctionDefs — количество FDEF. |
| [get_MaxInstructionDefs](./get_maxinstructiondefs/)() const | Получает количество IDEFs uint16 maxInstructionDefs. |
| [get_MaxPoints](./get_maxpoints/)() const | Получает количество точек uint16 maxPoints в несоставном глифе. |
| [get_MaxSizeOfInstructions](./get_maxsizeofinstructions/)() const | Получает количество байтов uint16 maxSizeOfInstructions для инструкций глифа. |
| [get_MaxStackElements](./get_maxstackelements/)() const | Получает максимальную глубину стека uint16 maxStackElements. |
| [get_MaxStorage](./get_maxstorage/)() const | Получает количество мест в области хранения uint16 maxStorage. |
| [get_MaxTwilightPoints](./get_maxtwilightpoints/)() const | Получает количество точек uint16 maxTwilightPoints, используемых в зоне сумерек (Twilight Zone, Z0). |
| [get_MaxZones](./get_maxzones/)() const | Получает значение uint16 maxZones, установленное в 2. |
| [get_NumGlyphs](./get_numglyphs/)() const | Получает количество глифов uint16 numGlyphs в [Font](../../aspose.font/font/). |
| [get_TableVersion](./get_tableversion/)() const | Получает версию формата. Используйте свойства MajorNumber и MinorNUmber объекта [Version16Dot16](../) в шестнадцатеричной нотации для определения используемой версии. |
| static [get_Tag](./get_tag/)() | Получает тег таблицы. |
| [get_Version](./get_version/)() const | Получает фиксированную версию 0x00010000, если (версия 1.0). Устарело, используйте свойство [TableVersion](../) вместо этого. |
## См. также

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
