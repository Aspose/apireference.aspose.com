---
title: ChartDataLabelCollection.ShowCategoryName
linktitle: ShowCategoryName
articleTitle: ShowCategoryName
second_title: Aspose.Words for .NET
description: Discover the ShowCategoryName property in ChartDataLabelCollection. Control data label visibility for your series and enhance your chart's clarity!
type: docs
weight: 110
url: /net/aspose.words.drawing.charts/chartdatalabelcollection/showcategoryname/
---
## ChartDataLabelCollection.ShowCategoryName property

Allows to specify whether category name is to be displayed for the data labels of the entire series. Default value is `false`.

```csharp
public bool ShowCategoryName { get; set; }
```

## Remarks

Value defined for this property can be overridden for an individual data label with using the [`ShowCategoryName`](../../chartdatalabel/showcategoryname/) property.

## Examples

Shows how to work with data labels of a bubble chart.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

Chart chart = builder.InsertChart(ChartType.Bubble, 500, 300).Chart;

// Clear the chart's demo data series to start with a clean chart.
chart.Series.Clear();

// Add a custom series with X/Y coordinates and diameter of each of the bubbles. 
ChartSeries series = chart.Series.Add("Aspose Test Series",
    new[] { 2.9, 3.5, 1.1, 4.0, 4.0 },
    new[] { 1.9, 8.5, 2.1, 6.0, 1.5 },
    new[] { 9.0, 4.5, 2.5, 8.0, 5.0 });

// Enable data labels, and then modify their appearance.
series.HasDataLabels = true;
ChartDataLabelCollection dataLabels = series.DataLabels;
dataLabels.ShowBubbleSize = true;
dataLabels.ShowCategoryName = true;
dataLabels.ShowSeriesName = true;
dataLabels.Separator = " & ";

doc.Save(ArtifactsDir + "Charts.DataLabelsBubbleChart.docx");
```

### See Also

* class [ChartDataLabelCollection](../)
* namespace [Aspose.Words.Drawing.Charts](../../../aspose.words.drawing.charts/)
* assembly [Aspose.Words](../../../)
