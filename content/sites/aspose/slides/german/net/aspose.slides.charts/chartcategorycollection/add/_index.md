---
title: Add
second_title: Aspose.Slides für .NET-API-Referenz
description: Wenn die Kategorie in der Sammlung vorhanden ist geben Sie sie zurück. Sonst erstellt eine neue Diagrammkategorie aus IChartDataCellaspose.slides.charts/ichartdatacell und fügt es der Sammlung hinzu.
type: docs
weight: 70
url: /de/net/aspose.slides.charts/chartcategorycollection/add/
---
## Add(IChartDataCell) {#add}

Wenn die Kategorie in der Sammlung vorhanden ist, geben Sie sie zurück. Sonst erstellt eine neue Diagrammkategorie aus [`IChartDataCell`](../../ichartdatacell) und fügt es der Sammlung hinzu.

```csharp
public IChartCategory Add(IChartDataCell chartDataCell)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| chartDataCell | IChartDataCell | Zelle, die zum Erstellen der Diagrammkategorie verwendet wird. |

### Rückgabewert

Hinzugefügte oder vorhandene Kategorie.

### Siehe auch

* interface [IChartCategory](../../ichartcategory)
* interface [IChartDataCell](../../ichartdatacell)
* class [ChartCategoryCollection](../../chartcategorycollection)
* namensraum [Aspose.Slides.Charts](../../chartcategorycollection)
* Montage [Aspose.Slides](../../../)

---

## Add(object) {#add_1}

Erstellt neu[`ChartCategory`](../../chartcategory) vom Wert und fügt es der Sammlung hinzu.

```csharp
public IChartCategory Add(object value)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | Object | Der Wert. |

### Rückgabewert

Hinzugefügt[`IChartCategory`](../../ichartcategory).

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| InvalidOperationException | wenn Grenze überschritten |

### Bemerkungen

Diese Methode fügt ein Arbeitsblatt mit dem Namen AUTO_DATA hinzu und fügt dort alle Werte hinzu. Wenn du benutzt[`ChartDataWorkbook`](../../chartdataworkbook) Stellen Sie zum Hinzufügen oder Bearbeiten von Zellenwerten sicher, dass Sie dieses Arbeitsblatt nicht verwenden Die maximale Anzahl der mit dieser Methode hinzugefügten Werte darf 16711680 nicht überschreiten

### Siehe auch

* interface [IChartCategory](../../ichartcategory)
* class [ChartCategoryCollection](../../chartcategorycollection)
* namensraum [Aspose.Slides.Charts](../../chartcategorycollection)
* Montage [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
