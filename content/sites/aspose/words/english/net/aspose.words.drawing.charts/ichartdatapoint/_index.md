---
title: IChartDataPoint Interface
linktitle: IChartDataPoint
articleTitle: IChartDataPoint
second_title: Aspose.Words for .NET
description: Explore Aspose.Words.Drawing.Charts.IChartDataPoint interface for detailed chart data point properties. Enhance your data visualization effortlessly!
type: docs
weight: 1210
url: /net/aspose.words.drawing.charts/ichartdatapoint/
---
## IChartDataPoint interface

Contains properties of a single data point on the chart.

```csharp
public interface IChartDataPoint
```

## Properties

| Name | Description |
| --- | --- |
| [Bubble3D](../../aspose.words.drawing.charts/ichartdatapoint/bubble3d/) { get; set; } | Specifies whether the bubbles in Bubble chart should have a 3-D effect applied to them. |
| [Explosion](../../aspose.words.drawing.charts/ichartdatapoint/explosion/) { get; set; } | Specifies the amount the data point shall be moved from the center of the pie. Can be negative, negative means that property is not set and no explosion should be applied. Applies only to Pie charts. |
| [InvertIfNegative](../../aspose.words.drawing.charts/ichartdatapoint/invertifnegative/) { get; set; } | Specifies whether the parent element shall inverts its colors if the value is negative. |
| [Marker](../../aspose.words.drawing.charts/ichartdatapoint/marker/) { get; } | Specifies a data marker. Marker is automatically created when requested. |

## Examples

Shows how to work with data points on a line chart.

```csharp
public void ChartDataPoint()
{
    Document doc = new Document();
    DocumentBuilder builder = new DocumentBuilder(doc);

    Shape shape = builder.InsertChart(ChartType.Line, 500, 350);
    Chart chart = shape.Chart;

    Assert.That(chart.Series.Count, Is.EqualTo(3));
    Assert.That(chart.Series[0].Name, Is.EqualTo("Series 1"));
    Assert.That(chart.Series[1].Name, Is.EqualTo("Series 2"));
    Assert.That(chart.Series[2].Name, Is.EqualTo("Series 3"));

    // Emphasize the chart's data points by making them appear as diamond shapes.
    foreach (ChartSeries series in chart.Series)
        ApplyDataPoints(series, 4, MarkerSymbol.Diamond, 15);

    // Smooth out the line that represents the first data series.
    chart.Series[0].Smooth = true;

    // Verify that data points for the first series will not invert their colors if the value is negative.
    using (IEnumerator<ChartDataPoint> enumerator = chart.Series[0].DataPoints.GetEnumerator())
    {
        while (enumerator.MoveNext())
        {
            Assert.That(enumerator.Current.InvertIfNegative, Is.False);
        }
    }

    ChartDataPoint dataPoint = chart.Series[1].DataPoints[2];
    dataPoint.Format.Fill.Color = Color.Red;

    // For a cleaner looking graph, we can clear format individually.
    dataPoint.ClearFormat();

    // We can also strip an entire series of data points at once.
    chart.Series[2].DataPoints.ClearFormat();

    doc.Save(ArtifactsDir + "Charts.ChartDataPoint.docx");
}

/// <summary>
/// Applies a number of data points to a series.
/// </summary>
private static void ApplyDataPoints(ChartSeries series, int dataPointsCount, MarkerSymbol markerSymbol, int dataPointSize)
{
    for (int i = 0; i < dataPointsCount; i++)
    {
        ChartDataPoint point = series.DataPoints[i];
        point.Marker.Symbol = markerSymbol;
        point.Marker.Size = dataPointSize;

        Assert.That(point.Index, Is.EqualTo(i));
    }
}
```

### See Also

* namespace [Aspose.Words.Drawing.Charts](../../aspose.words.drawing.charts/)
* assembly [Aspose.Words](../../)
