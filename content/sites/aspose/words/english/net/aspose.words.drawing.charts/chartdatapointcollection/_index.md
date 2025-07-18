---
title: ChartDataPointCollection Class
linktitle: ChartDataPointCollection
articleTitle: ChartDataPointCollection
second_title: Aspose.Words for .NET
description: Discover the Aspose.Words.Drawing.Charts.ChartDataPointCollection class, your key to managing ChartDataPoint collections effortlessly for enhanced data visualization.
type: docs
weight: 970
url: /net/aspose.words.drawing.charts/chartdatapointcollection/
---
## ChartDataPointCollection class

Represents collection of a [`ChartDataPoint`](../chartdatapoint/).

To learn more, visit the [Working with Charts](https://docs.aspose.com/words/net/working-with-charts/) documentation article.

```csharp
public class ChartDataPointCollection : IEnumerable<ChartDataPoint>
```

## Properties

| Name | Description |
| --- | --- |
| [Count](../../aspose.words.drawing.charts/chartdatapointcollection/count/) { get; } | Returns the number of [`ChartDataPoint`](../chartdatapoint/) in this collection. |
| [Item](../../aspose.words.drawing.charts/chartdatapointcollection/item/) { get; } | Returns [`ChartDataPoint`](../chartdatapoint/) for the specified index. |

## Methods

| Name | Description |
| --- | --- |
| [ClearFormat](../../aspose.words.drawing.charts/chartdatapointcollection/clearformat/)() | Clears format of all [`ChartDataPoint`](../chartdatapoint/) in this collection. |
| [CopyFormat](../../aspose.words.drawing.charts/chartdatapointcollection/copyformat/)(*int, int*) | Copies format from the source data point to the destination data point. |
| [GetEnumerator](../../aspose.words.drawing.charts/chartdatapointcollection/getenumerator/)() | Returns an enumerator object. |
| [HasDefaultFormat](../../aspose.words.drawing.charts/chartdatapointcollection/hasdefaultformat/)(*int*) | Gets a flag indicating whether the data point at the specified index has default format. |

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

* class [ChartDataPoint](../chartdatapoint/)
* namespace [Aspose.Words.Drawing.Charts](../../aspose.words.drawing.charts/)
* assembly [Aspose.Words](../../)
