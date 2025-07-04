---
title: ChartLegendEntryCollection Class
linktitle: ChartLegendEntryCollection
articleTitle: ChartLegendEntryCollection
second_title: Aspose.Words for .NET
description: Explore Aspose.Words.ChartLegendEntryCollection to efficiently manage chart legend entries and enhance your document visuals with ease.
type: docs
weight: 1020
url: /net/aspose.words.drawing.charts/chartlegendentrycollection/
---
## ChartLegendEntryCollection class

Represents a collection of chart legend entries.

To learn more, visit the [Working with Charts](https://docs.aspose.com/words/net/working-with-charts/) documentation article.

```csharp
public class ChartLegendEntryCollection : IEnumerable<ChartLegendEntry>
```

## Properties

| Name | Description |
| --- | --- |
| [Count](../../aspose.words.drawing.charts/chartlegendentrycollection/count/) { get; } | Returns the number of [`ChartLegendEntry`](../chartlegendentry/) in this collection. |
| [Item](../../aspose.words.drawing.charts/chartlegendentrycollection/item/) { get; } | Returns [`ChartLegendEntry`](../chartlegendentry/) for the specified index. |

## Methods

| Name | Description |
| --- | --- |
| [GetEnumerator](../../aspose.words.drawing.charts/chartlegendentrycollection/getenumerator/)() | Returns an enumerator object. |

## Examples

Shows how to work with a legend entry for chart series.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

Shape shape = builder.InsertChart(ChartType.Column, 432, 252);

Chart chart = shape.Chart;
ChartSeriesCollection series = chart.Series;
series.Clear();

string[] categories = new string[] { "AW Category 1", "AW Category 2" };

ChartSeries series1 = series.Add("Series 1", categories, new double[] { 1, 2 });
series.Add("Series 2", categories, new double[] { 3, 4 });
series.Add("Series 3", categories, new double[] { 5, 6 });
series.Add("Series 4", categories, new double[] { 0, 0 });

ChartLegendEntryCollection legendEntries = chart.Legend.LegendEntries;
legendEntries[3].IsHidden = true;

doc.Save(ArtifactsDir + "Charts.LegendEntries.docx");
```

### See Also

* class [ChartLegendEntry](../chartlegendentry/)
* namespace [Aspose.Words.Drawing.Charts](../../aspose.words.drawing.charts/)
* assembly [Aspose.Words](../../)
