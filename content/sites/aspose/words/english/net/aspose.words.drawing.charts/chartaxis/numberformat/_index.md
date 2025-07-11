---
title: ChartAxis.NumberFormat
linktitle: NumberFormat
articleTitle: NumberFormat
second_title: Aspose.Words for .NET
description: Discover the ChartAxis NumberFormat property to customize your chart's number formats effortlessly with the ChartNumberFormat object for enhanced data visualization.
type: docs
weight: 200
url: /net/aspose.words.drawing.charts/chartaxis/numberformat/
---
## ChartAxis.NumberFormat property

Returns a [`ChartNumberFormat`](../../chartnumberformat/) object that allows defining number formats for the axis.

```csharp
public ChartNumberFormat NumberFormat { get; }
```

## Examples

Shows how to set formatting for chart values.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

Shape shape = builder.InsertChart(ChartType.Column, 500, 300);
Chart chart = shape.Chart;

// Clear the chart's demo data series to start with a clean chart.
chart.Series.Clear();

// Add a custom series to the chart with categories for the X-axis,
// and large respective numeric values for the Y-axis. 
chart.Series.Add("Aspose Test Series",
    new[] { "Word", "PDF", "Excel", "GoogleDocs", "Note" },
    new double[] { 1900000, 850000, 2100000, 600000, 1500000 });

// Set the number format of the Y-axis tick labels to not group digits with commas. 
chart.AxisY.NumberFormat.FormatCode = "#,##0";

// This flag can override the above value and draw the number format from the source cell.
Assert.That(chart.AxisY.NumberFormat.IsLinkedToSource, Is.False);

doc.Save(ArtifactsDir + "Charts.SetNumberFormatToChartAxis.docx");
```

### See Also

* class [ChartNumberFormat](../../chartnumberformat/)
* class [ChartAxis](../)
* namespace [Aspose.Words.Drawing.Charts](../../../aspose.words.drawing.charts/)
* assembly [Aspose.Words](../../../)
