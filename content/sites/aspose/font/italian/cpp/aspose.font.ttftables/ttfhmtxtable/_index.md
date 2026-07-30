---
title: "Aspose::Font::TtfTables::TtfHmtxTable classe"
linktitle: "TtfHmtxTable"
second_title: "Aspose.Font per C++"
description: "classe Aspose::Font::TtfTables::TtfHmtxTable. Rappresenta la tabella \"hmtx\" del file Font TTF in C++."
type: docs
weight: 900
url: /it/cpp/aspose.font.ttftables/ttfhmtxtable/
---
## TtfHmtxTable class


Rappresenta la tabella "hmtx" del file [Font](../../aspose.font/font/) TTF.

```cpp
class TtfHmtxTable : public Aspose::Font::TtfTables::TtfTableBase
```

## Nested classes

* Class [LongHorMetric](./longhormetric/)
* Class [MetricList](./metriclist/)
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_AdditionalAdvanceWidth](./get_additionaladvancewidth/)() | Nella tabella hmtx possono verificarsi casi in cui il numero totale di glifi non è uguale a hhea.numberOfHMetrics. Per questi casi la tabella hmtx contiene un array aggiuntivo 'leftSideBearing' che corrisponde alla proprietà [LeftSidebearings](../). Tuttavia i glifi con indici da hhea.numOfLongHorMetrics a maxp.numGlyphs hanno anche larghezze. E queste larghezze, secondo la specifica per la tabella hmtx, hanno i seguenti valori: "Qui l'advanceWidth è considerato uguale all'advanceWidth per l'ultima voce sopra". |
| [get_HMetrics](./get_hmetrics/)() | Ottiene le metriche orizzontali. |
| [get_LeftSidebearings](./get_leftsidebearings/)() | Ottiene le sporgenze laterali sinistre. |
| static [get_Tag](./get_tag/)() | Ottiene il tag della tabella. |
## Vedi anche

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
