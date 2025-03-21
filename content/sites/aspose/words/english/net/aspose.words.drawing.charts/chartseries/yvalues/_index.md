---
title: ChartSeries.YValues
linktitle: YValues
articleTitle: YValues
second_title: Aspose.Words for .NET
description: Discover the ChartSeries YValues property to access a powerful collection of Y values, enhancing your data visualization and analysis capabilities.
type: docs
weight: 150
url: /net/aspose.words.drawing.charts/chartseries/yvalues/
---
## ChartSeries.YValues property

Gets a collection of Y values for this chart series.

```csharp
public ChartYValueCollection YValues { get; }
```

## Examples

Shows how to work with the format code of the chart data.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Insert a Bubble chart.
Shape shape = builder.InsertChart(ChartType.Bubble, 432, 252);
Chart chart = shape.Chart;

// Delete default generated series.
chart.Series.Clear();

ChartSeries series = chart.Series.Add(
    "Series1",
    new double[] { 1, 1.9, 2.45, 3 },
    new double[] { 1, -0.9, 1.82, 0 },
    new double[] { 2, 1.1, 2.95, 2 });

// Show data labels.
series.HasDataLabels = true;
series.DataLabels.ShowCategoryName = true;
series.DataLabels.ShowValue = true;
series.DataLabels.ShowBubbleSize = true;

// Set data format codes.
series.XValues.FormatCode = "#,##0.0#";
series.YValues.FormatCode = "#,##0.0#;[Red]\\-#,##0.0#";
series.BubbleSizes.FormatCode = "#,##0.0#";

doc.Save(ArtifactsDir + "Charts.FormatCode.docx");
```

### See Also

* class [ChartYValueCollection](../../chartyvaluecollection/)
* class [ChartSeries](../)
* namespace [Aspose.Words.Drawing.Charts](../../../aspose.words.drawing.charts/)
* assembly [Aspose.Words](../../../)
