---
title: ChartDataLabelCollection.ShowLeaderLines
linktitle: ShowLeaderLines
articleTitle: ShowLeaderLines
second_title: Aspose.Words for .NET
description: Discover the ChartDataLabelCollection ShowLeaderLines property to enhance your data visualizations. Easily control leader lines for clearer insights!
type: docs
weight: 130
url: /net/aspose.words.drawing.charts/chartdatalabelcollection/showleaderlines/
---
## ChartDataLabelCollection.ShowLeaderLines property

Allows to specify whether data label leader lines need be shown for the data labels of the entire series. Default value is `false`.

```csharp
public bool ShowLeaderLines { get; set; }
```

## Remarks

Applies to Pie charts only. Leader lines create a visual connection between a data label and its corresponding data point.

Value defined for this property can be overridden for an individual data label with using the [`ShowLeaderLines`](../../chartdatalabel/showleaderlines/) property.

## Examples

Shows how to work with data labels of a pie chart.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

Chart chart = builder.InsertChart(ChartType.Pie, 500, 300).Chart;

// Clear the chart's demo data series to start with a clean chart.
chart.Series.Clear();

// Insert a custom chart series with a category name for each of the sectors, and their frequency table.
ChartSeries series = chart.Series.Add("Aspose Test Series",
    new[] { "Word", "PDF", "Excel" },
    new[] { 2.7, 3.2, 0.8 });

// Enable data labels that will display both percentage and frequency of each sector, and modify their appearance.
series.HasDataLabels = true;
ChartDataLabelCollection dataLabels = series.DataLabels;
dataLabels.ShowLeaderLines = true;
dataLabels.ShowLegendKey = true;
dataLabels.ShowPercentage = true;
dataLabels.ShowValue = true;
dataLabels.Separator = "; ";

doc.Save(ArtifactsDir + "Charts.DataLabelsPieChart.docx");
```

### See Also

* class [ChartDataLabelCollection](../)
* namespace [Aspose.Words.Drawing.Charts](../../../aspose.words.drawing.charts/)
* assembly [Aspose.Words](../../../)
