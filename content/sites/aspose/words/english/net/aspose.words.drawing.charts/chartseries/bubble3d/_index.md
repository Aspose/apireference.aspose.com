---
title: ChartSeries.Bubble3D
linktitle: Bubble3D
articleTitle: Bubble3D
second_title: Aspose.Words for .NET
description: Enhance your Bubble chart with ChartSeries Bubble3D! Add stunning 3D effects to your bubbles for an eye-catching visual impact.
type: docs
weight: 10
url: /net/aspose.words.drawing.charts/chartseries/bubble3d/
---
## ChartSeries.Bubble3D property

Specifies whether the bubbles in Bubble chart should have a 3-D effect applied to them.

```csharp
public bool Bubble3D { get; set; }
```

## Examples

Shows how to use 3D effects with bubble charts.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

Shape shape = builder.InsertChart(ChartType.Bubble3D, 500, 350);
Chart chart = shape.Chart;

Assert.That(chart.Series.Count, Is.EqualTo(1));
Assert.That(chart.Series[0].Name, Is.EqualTo("Y-Values"));
Assert.That(chart.Series[0].Bubble3D, Is.True);

// Apply a data label to each bubble that displays its diameter.
for (int i = 0; i < 3; i++)
{
    chart.Series[0].HasDataLabels = true;
    chart.Series[0].DataLabels[i].ShowBubbleSize = true;
    chart.Series[0].DataLabels[i].Font.Size = 12;
}

doc.Save(ArtifactsDir + "Charts.Bubble3D.docx");
```

### See Also

* class [ChartSeries](../)
* namespace [Aspose.Words.Drawing.Charts](../../../aspose.words.drawing.charts/)
* assembly [Aspose.Words](../../../)
