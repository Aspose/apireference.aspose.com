---
title: ChartYValueCollection.FormatCode
linktitle: FormatCode
articleTitle: FormatCode
second_title: Aspose.Words for .NET
description: Discover the ChartYValueCollection FormatCode property to easily customize Y value formatting. Enhance your data visualization with precision!
type: docs
weight: 20
url: /net/aspose.words.drawing.charts/chartyvaluecollection/formatcode/
---
## ChartYValueCollection.FormatCode property

Gets or sets the format code applied to the Y values.

```csharp
public string FormatCode { get; set; }
```

## Remarks

Number formatting is used to change the way values appears in the chart. The examples of number formats:

Number - "#,##0.00"

Currency - "\"$\"#,##0.00"

Time - "[$-x-systime]h:mm:ss AM/PM"

Date - "d/mm/yyyy"

Percentage - "0.00%"

Fraction - "# ?/?"

Scientific - "0.00E+00"

Accounting - "_-\"$\"* #,##0.00_-;-\"$\"* #,##0.00_-;_-\"$\"* \"-\"??_-;_-@_-"

Custom with color - "[Red]-#,##0.0"

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

* class [ChartYValueCollection](../)
* namespace [Aspose.Words.Drawing.Charts](../../../aspose.words.drawing.charts/)
* assembly [Aspose.Words](../../../)
