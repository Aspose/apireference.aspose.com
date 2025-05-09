---
title: ChartLegend.Overlay
linktitle: Overlay
articleTitle: Overlay
second_title: Aspose.Words for .NET
description: Control chart element overlap with the ChartLegend Overlay property. Enhance your data visualization with customizable legend settings for clearer insights.
type: docs
weight: 40
url: /net/aspose.words.drawing.charts/chartlegend/overlay/
---
## ChartLegend.Overlay property

Determines whether other chart elements shall be allowed to overlap legend. Default value is `false`.

```csharp
public bool Overlay { get; set; }
```

## Examples

Shows how to edit the appearance of a chart's legend.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

Shape shape = builder.InsertChart(ChartType.Line, 450, 300);
Chart chart = shape.Chart;

Assert.AreEqual(3, chart.Series.Count);
Assert.AreEqual("Series 1", chart.Series[0].Name);
Assert.AreEqual("Series 2", chart.Series[1].Name);
Assert.AreEqual("Series 3", chart.Series[2].Name);

// Move the chart's legend to the top right corner.
ChartLegend legend = chart.Legend;
legend.Position = LegendPosition.TopRight;

// Give other chart elements, such as the graph, more room by allowing them to overlap the legend.
legend.Overlay = true;

doc.Save(ArtifactsDir + "Charts.ChartLegend.docx");
```

### See Also

* class [ChartLegend](../)
* namespace [Aspose.Words.Drawing.Charts](../../../aspose.words.drawing.charts/)
* assembly [Aspose.Words](../../../)
