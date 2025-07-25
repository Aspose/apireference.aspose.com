---
title: IChartDataPoint.Explosion
linktitle: Explosion
articleTitle: Explosion
second_title: Aspose.Words for .NET
description: Discover the IChartDataPoint Explosion property for Pie charts. Control data point positioning with precision—enhance your visual data storytelling today!
type: docs
weight: 20
url: /net/aspose.words.drawing.charts/ichartdatapoint/explosion/
---
## IChartDataPoint.Explosion property

Specifies the amount the data point shall be moved from the center of the pie. Can be negative, negative means that property is not set and no explosion should be applied. Applies only to Pie charts.

```csharp
public int Explosion { get; set; }
```

## Examples

Shows how to move the slices of a pie chart away from the center.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

Shape shape = builder.InsertChart(ChartType.Pie, 500, 350);
Chart chart = shape.Chart;

Assert.That(chart.Series.Count, Is.EqualTo(1));
Assert.That(chart.Series[0].Name, Is.EqualTo("Sales"));

// "Slices" of a pie chart may be moved away from the center by a distance via the respective data point's Explosion attribute.
// Add a data point to the first portion of the pie chart and move it away from the center by 10 points.
// Aspose.Words create data points automatically if them does not exist.
ChartDataPoint dataPoint = chart.Series[0].DataPoints[0];
dataPoint.Explosion = 10;

// Displace the second portion by a greater distance.
dataPoint = chart.Series[0].DataPoints[1];
dataPoint.Explosion = 40;

doc.Save(ArtifactsDir + "Charts.PieChartExplosion.docx");
```

### See Also

* interface [IChartDataPoint](../)
* namespace [Aspose.Words.Drawing.Charts](../../../aspose.words.drawing.charts/)
* assembly [Aspose.Words](../../../)
