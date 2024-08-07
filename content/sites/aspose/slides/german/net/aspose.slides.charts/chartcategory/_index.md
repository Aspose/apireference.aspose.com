---
title: ChartCategory
second_title: Aspose.Slides für .NET-API-Referenz
description: Stellt Diagrammkategorien dar.
type: docs
weight: 1150
url: /de/net/aspose.slides.charts/chartcategory/
---
## ChartCategory class

Stellt Diagrammkategorien dar.

```csharp
public class ChartCategory : IChartCategory
```

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [AsCell](../../aspose.slides.charts/chartcategory/ascell) { get; set; } | Gibt das IChartDataCell-Objekt zurück oder legt es fest. Wenn die Kategorie mehrstufig ist, wird das IChartDataCell-Objekt für Ebene "0" verwendet. Lesen/Schreiben[`IChartDataCell`](../ichartdatacell) . |
| [AsLiteral](../../aspose.slides.charts/chartcategory/asliteral) { get; set; } | Gibt ein AsLiteral-Objekt zurück oder legt es fest. Lesen/SchreibenObject . |
| [GroupingLevels](../../aspose.slides.charts/chartcategory/groupinglevels) { get; } | Verwalteter Container der Werte der Gruppierungsebenen der Diagrammkategorie. Mehrstufige Kategorien enthalten mehr als eine Gruppierungsebene. Die Indizierung der Gruppierungsebenen ist nullbasiert. Schreibgeschützt[`IChartCategoryLevelsManager`](../ichartcategorylevelsmanager) . |
| [UseCell](../../aspose.slides.charts/chartcategory/usecell) { get; } | Wenn wahr, dann ist die AsCell-Eigenschaft tatsächlich. Mit anderen Worten, das Arbeitsblatt wird zum Speichern der Kategorie verwendet (dieser Fall unterstützt eine Kategorie mit mehreren Ebenen). Wenn falsch, dann ist die AsLiteral-Eigenschaft tatsächlich. Mit anderen Worten, das Arbeitsblatt wird NICHT zum Speichern von Kategorien verwendet (und dieser Fall unterstützt keine Kategorien mit mehreren Ebenen). SchreibgeschütztBoolean . |
| [Value](../../aspose.slides.charts/chartcategory/value) { get; set; } | Wenn UseCell wahr ist, repräsentiert diese Eigenschaft die Eigenschaft AsCell.Value. Wenn UseCell falsch ist, repräsentiert diese Eigenschaft die Eigenschaft AsLiteral. Lesen/SchreibenObject . |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [Remove](../../aspose.slides.charts/chartcategory/remove)() | Entfernt Kategorie aus Diagramm. |

### Siehe auch

* interface [IChartCategory](../ichartcategory)
* namensraum [Aspose.Slides.Charts](../../aspose.slides.charts)
* Montage [Aspose.Slides](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
