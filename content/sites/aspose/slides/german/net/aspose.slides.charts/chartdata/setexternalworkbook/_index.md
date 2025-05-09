---
title: SetExternalWorkbook
second_title: Aspose.Slides für .NET-API-Referenz
description: Legt eine externe Arbeitsmappe als Datenquelle für das Diagramm fest. Diagrammdaten werden aus der Zielarbeitsmappe aktualisiert.
type: docs
weight: 110
url: /de/net/aspose.slides.charts/chartdata/setexternalworkbook/
---
## SetExternalWorkbook(string) {#setexternalworkbook}

Legt eine externe Arbeitsmappe als Datenquelle für das Diagramm fest. Diagrammdaten werden aus der Zielarbeitsmappe aktualisiert.

```csharp
public void SetExternalWorkbook(string workbookPath)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| workbookPath | String | Pfad zur Zielarbeitsmappe |

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| InvalidOperationException | Externe Arbeitsmappe ist nicht verfügbar oder kann nicht geladen werden. |

### Beispiele

```csharp
[C#]
using (Presentation pres = new Presentation())

   IChart chart = pres.Slides[0].Shapes.AddChart(ChartType.Pie, 50, 50, 400, 600, true);
   IChartData chartData = chart.ChartData;
   (chartData as ChartData).SetExternalWorkbook("../../workbook.xlsx");

```

### Siehe auch

* class [ChartData](../../chartdata)
* namensraum [Aspose.Slides.Charts](../../chartdata)
* Montage [Aspose.Slides](../../../)

---

## SetExternalWorkbook(string, bool) {#setexternalworkbook_1}

Legt eine externe Arbeitsmappe als Datenquelle für das Diagramm fest.

```csharp
public void SetExternalWorkbook(string workbookPath, bool updateChartData)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| workbookPath | String | Pfad zur Zielarbeitsmappe |
| updateChartData | Boolean | Wenn der Wert falsch ist, wird nur der Arbeitsmappenpfad aktualisiert. Diagrammdaten werden nicht aus der Zielarbeitsmappe geladen und aktualisiert. Kann verwendet werden, wenn die Zielarbeitsmappe nicht vorhanden oder nicht verfügbar ist. Wenn der Wert wahr ist, werden die Diagrammdaten aus der Zielarbeitsmappe aktualisiert. |

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| InvalidOperationException | Externe Arbeitsmappe ist nicht verfügbar oder kann nicht geladen werden. |

### Beispiele

```csharp
[C#]
using (Presentation pres = new Presentation())

   IChart chart = pres.Slides[0].Shapes.AddChart(ChartType.Pie, 50, 50, 400, 600, true);
   IChartData chartData = chart.ChartData;

   (chartData as ChartData).SetExternalWorkbook("http://Pfad/nicht/existiert", false);


```

### Siehe auch

* class [ChartData](../../chartdata)
* namensraum [Aspose.Slides.Charts](../../chartdata)
* Montage [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
