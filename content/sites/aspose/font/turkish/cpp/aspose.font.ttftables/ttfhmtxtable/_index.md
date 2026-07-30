---
title: "Aspose::Font::TtfTables::TtfHmtxTable sınıfı"
linktitle: "TtfHmtxTable"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::TtfTables::TtfHmtxTable sınıfı. C++'da TTF Font dosyasının \"hmtx\" tablosunu temsil eder."
type: docs
weight: 900
url: /tr/cpp/aspose.font.ttftables/ttfhmtxtable/
---
## TtfHmtxTable class


TTF [Font](../../aspose.font/font/) dosyasının "hmtx" tablosunu temsil eder.

```cpp
class TtfHmtxTable : public Aspose::Font::TtfTables::TtfTableBase
```

## Nested classes

* Class [LongHorMetric](./longhormetric/)
* Class [MetricList](./metriclist/)
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_AdditionalAdvanceWidth](./get_additionaladvancewidth/)() | hmtx tablosunda, gliflerin toplam sayısının hhea.numberOfHMetrics değerine eşit olmaması durumları olabilir. Bu durumlar için hmtx tablosu, [LeftSidebearings](../) özelliğine karşılık gelen ek 'leftSideBearing' dizisini içerir. Ancak hhea.numOfLongHorMetrics ile maxp.numGlyphs arasındaki indekslere sahip gliflerin de genişlikleri vardır. Ve bu genişlikler, hmtx tablosu için spesifikasyona göre şu değerlere sahiptir: "Here the advanceWidth is assumed to be the same as the advanceWidth for the last entry above". |
| [get_HMetrics](./get_hmetrics/)() | Yatay metrikleri alır. |
| [get_LeftSidebearings](./get_leftsidebearings/)() | Sol yan boşlukları alır. |
| static [get_Tag](./get_tag/)() | Tablo etiketini alır. |
## Ayrıca Bakınız

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
