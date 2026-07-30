---
title: "Aspose::Font::TtfTables::TtfHmtxTable::get_HMetrics метод"
linktitle: "get_HMetrics"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::TtfTables::TtfHmtxTable::get_HMetrics метод. Получает горизонтальные метрики в C++."
type: docs
weight: 200
url: /ru/cpp/aspose.font.ttftables/ttfhmtxtable/get_additionaladvancewidth/
---
## TtfHmtxTable::get_AdditionalAdvanceWidth method


В таблице hmtx могут быть случаи, когда общее количество глифов не равно hhea.numberOfHMetrics. Для этих случаев таблица hmtx содержит дополнительный массив 'leftSideBearing', соответствующий свойству [LeftSidebearings](../). Однако глифы с индексами от hhea.numOfLongHorMetrics до maxp.numGlyphs также имеют ширины. И эти ширины в соответствии со спецификацией для таблицы hmtx имеют такие значения: "Here the advanceWidth is assumed to be the same as the advanceWidth for the last entry above".

```cpp
uint16_t Aspose::Font::TtfTables::TtfHmtxTable::get_AdditionalAdvanceWidth()
```

## См. также

* Class [TtfHmtxTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
