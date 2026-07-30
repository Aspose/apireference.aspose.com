---
title: "класс Aspose::Font::TtfTables::TtfHmtxTable"
linktitle: "TtfHmtxTable"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::TtfTables::TtfHmtxTable класс. Представляет таблицу \"hmtx\" файла шрифта TTF в C++."
type: docs
weight: 900
url: /ru/cpp/aspose.font.ttftables/ttfhmtxtable/
---
## TtfHmtxTable class


Представляет таблицу "hmtx" файла TTF [Font](../../aspose.font/font/) файл.

```cpp
class TtfHmtxTable : public Aspose::Font::TtfTables::TtfTableBase
```

## Nested classes

* Class [LongHorMetric](./longhormetric/)
* Class [MetricList](./metriclist/)
## Методы

| Метод | Описание |
| --- | --- |
| [get_AdditionalAdvanceWidth](./get_additionaladvancewidth/)() | В таблице hmtx могут быть случаи, когда общее количество глифов не равно hhea.numberOfHMetrics. Для этих случаев таблица hmtx содержит дополнительный массив 'leftSideBearing', соответствующий свойству [LeftSidebearings](../). Однако глифы с индексами от hhea.numOfLongHorMetrics до maxp.numGlyphs также имеют ширины. И эти ширины в соответствии со спецификацией для таблицы hmtx имеют такие значения: "Here the advanceWidth is assumed to be the same as the advanceWidth for the last entry above". |
| [get_HMetrics](./get_hmetrics/)() | Получает горизонтальные метрики. |
| [get_LeftSidebearings](./get_leftsidebearings/)() | Получает левосторонние отступы. |
| static [get_Tag](./get_tag/)() | Получает тег таблицы. |
## См. также

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
