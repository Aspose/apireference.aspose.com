---
title: "Aspose::Font::TtfTables::TtfHmtxTable classe"
linktitle: "TtfHmtxTable"
second_title: "Aspose.Font pour C++"
description: "Aspose::Font::TtfTables::TtfHmtxTable classe. Représente la table \"hmtx\" du fichier de police TTF en C++."
type: docs
weight: 900
url: /fr/cpp/aspose.font.ttftables/ttfhmtxtable/
---
## TtfHmtxTable class


Représente la table "hmtx" du fichier [Font](../../aspose.font/font/) TTF.

```cpp
class TtfHmtxTable : public Aspose::Font::TtfTables::TtfTableBase
```

## Nested classes

* Class [LongHorMetric](./longhormetric/)
* Class [MetricList](./metriclist/)
## Méthodes

| Méthode | Description |
| --- | --- |
| [get_AdditionalAdvanceWidth](./get_additionaladvancewidth/)() | Dans la table hmtx il peut y avoir des cas où le nombre total de glyphes n’est pas égal à hhea.numberOfHMetrics. Pour ces cas, la table hmtx contient un tableau supplémentaire 'leftSideBearing' qui correspond à la propriété [LeftSidebearings](../). Mais les glyphes avec des index de hhea.numOfLongHorMetrics à maxp.numGlyphs ont également des largeurs. Et ces largeurs, conformément à la spécification de la table hmtx, ont les valeurs suivantes : "Here the advanceWidth is assumed to be the same as the advanceWidth for the last entry above". |
| [get_HMetrics](./get_hmetrics/)() | Obtient les métriques horizontales. |
| [get_LeftSidebearings](./get_leftsidebearings/)() | Obtient les décalages latéraux. |
| static [get_Tag](./get_tag/)() | Obtient le tag de la table. |
## Voir aussi

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
