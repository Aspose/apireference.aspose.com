---
title: AxisTickLabels.Offset
linktitle: Offset
articleTitle: Offset
second_title: Aspose.Words for .NET
description: Adjust AxisTickLabels Offset to customize tick label distance from the axis for enhanced clarity and visual appeal in your data visualizations.
type: docs
weight: 40
url: /net/aspose.words.drawing.charts/axisticklabels/offset/
---
## AxisTickLabels.Offset property

Gets or sets the distance of the tick labels from the axis.

```csharp
public int Offset { get; set; }
```

## Remarks

The property represents a percentage of the default label offset.

Valid range is from 0 to 1000 percent inclusive. The default value is 100%.

The property has effect only for category axes. It is not supported by MS Office 2016 new charts.

## Examples

Shows how to insert a chart and modify the appearance of its axes.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

Shape shape = builder.InsertChart(ChartType.Column, 500, 300);
Chart chart = shape.Chart;

// Clear the chart's demo data series to start with a clean chart.
chart.Series.Clear();

// Insert a chart series with categories for the X-axis and respective numeric values for the Y-axis.
chart.Series.Add("Aspose Test Series",
    new[] { "Word", "PDF", "Excel", "GoogleDocs", "Note" },
    new double[] { 640, 320, 280, 120, 150 });

// Chart axes have various options that can change their appearance,
// such as their direction, major/minor unit ticks, and tick marks.
ChartAxis xAxis = chart.AxisX;
xAxis.CategoryType = AxisCategoryType.Category;
xAxis.Crosses = AxisCrosses.Minimum;
xAxis.ReverseOrder = false;
xAxis.MajorTickMark = AxisTickMark.Inside;
xAxis.MinorTickMark = AxisTickMark.Cross;
xAxis.MajorUnit = 10.0d;
xAxis.MinorUnit = 15.0d;
xAxis.TickLabels.Offset = 50;
xAxis.TickLabels.Position = AxisTickLabelPosition.Low;
xAxis.TickLabels.IsAutoSpacing = false;
xAxis.TickMarkSpacing = 1;

Assert.That(xAxis.Document, Is.EqualTo(doc));

ChartAxis yAxis = chart.AxisY;
yAxis.CategoryType = AxisCategoryType.Automatic;
yAxis.Crosses = AxisCrosses.Maximum;
yAxis.ReverseOrder = true;
yAxis.MajorTickMark = AxisTickMark.Inside;
yAxis.MinorTickMark = AxisTickMark.Cross;
yAxis.MajorUnit = 100.0d;
yAxis.MinorUnit = 20.0d;
yAxis.TickLabels.Position = AxisTickLabelPosition.NextToAxis;
yAxis.TickLabels.Alignment = ParagraphAlignment.Center;
yAxis.TickLabels.Font.Color = Color.Red;
yAxis.TickLabels.Spacing = 1;

// Column charts do not have a Z-axis.
Assert.That(chart.AxisZ, Is.Null);

doc.Save(ArtifactsDir + "Charts.AxisProperties.docx");
```

### See Also

* class [AxisTickLabels](../)
* namespace [Aspose.Words.Drawing.Charts](../../../aspose.words.drawing.charts/)
* assembly [Aspose.Words](../../../)
