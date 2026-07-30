---
title: "Aspose::Font::TtfTables::TtfCMapTable class"
linktitle: "TtfCMapTable"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::TtfTables::TtfCMapTable класс. Представляет таблицу \"cmap\" файла шрифта TTF в C++."
type: docs
weight: 200
url: /ru/cpp/aspose.font.ttftables/ttfcmaptable/
---
## TtfCMapTable class


Представляет таблицу "cmap" файла TTF [Font](../../aspose.font/font/)

```cpp
class TtfCMapTable : public Aspose::Font::TtfTables::TtfTableBase
```

## Nested classes

* Class [TtfCMapSubtableDescription](./ttfcmapsubtabledescription/)
## Методы

| Метод | Описание |
| --- | --- |
| [FindUnicodeTable](./findunicodetable/)() | Ищет и возвращает Unicode CMap. Если существует CMap ucs-4 — возвращает её первой; иначе — возвращает любой найденный Unicode CMap. |
| static [get_Tag](./get_tag/)() | Получает тег таблицы. |
| [GetAllSubtables](./getallsubtables/)() | Возвращает все подтаблицы из таблицы CMap. |
| [GetPlatformTables](./getplatformtables/)(uint16_t, uint16_t) | Возвращает подтаблицы CMap для planformId и platformSpecificId. |
## См. также

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
