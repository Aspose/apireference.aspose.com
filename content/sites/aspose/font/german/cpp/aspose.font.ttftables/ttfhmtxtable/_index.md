---
title: "Aspose::Font::TtfTables::TtfHmtxTable Klasse"
linktitle: "TtfHmtxTable"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::TtfTables::TtfHmtxTable Klasse. Stellt die \"hmtx\"-Tabelle der TTF-Schriftdatei in C++ dar."
type: docs
weight: 900
url: /de/cpp/aspose.font.ttftables/ttfhmtxtable/
---
## TtfHmtxTable class


Stellt die "hmtx"-Tabelle der TTF [Font](../../aspose.font/font/) Datei dar.

```cpp
class TtfHmtxTable : public Aspose::Font::TtfTables::TtfTableBase
```

## Nested classes

* Class [LongHorMetric](./longhormetric/)
* Class [MetricList](./metriclist/)
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_AdditionalAdvanceWidth](./get_additionaladvancewidth/)() | In der hmtx‑Tabelle können Fälle auftreten, in denen die Gesamtzahl der Glyphen nicht gleich hhea.numberOfHMetrics ist. Für diese Fälle enthält die hmtx‑Tabelle ein zusätzliches Array 'leftSideBearing', das der Eigenschaft [LeftSidebearings](../) entspricht. Aber Glyphen mit Indizes von hhea.numOfLongHorMetrics bis maxp.numGlyphs haben ebenfalls Breiten. Und diese Breiten haben gemäß der Spezifikation für die hmtx‑Tabelle folgende Werte: "Hier wird angenommen, dass die advanceWidth dieselbe ist wie die advanceWidth für den letzten Eintrag oben". |
| [get_HMetrics](./get_hmetrics/)() | Liefert horizontale Metriken. |
| [get_LeftSidebearings](./get_leftsidebearings/)() | Liefert linke Seitenabstände. |
| static [get_Tag](./get_tag/)() | Liefert das Tabellentag. |
## Siehe auch

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
