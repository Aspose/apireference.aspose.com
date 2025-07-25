---
title: ChartAxis Class
linktitle: ChartAxis
articleTitle: ChartAxis
second_title: Aspose.Words for .NET
description: Discover the Aspose.Words.Drawing.Charts.ChartAxis class for customizable chart axis options. Enhance your data visualization effortlessly!
type: docs
weight: 880
url: /net/aspose.words.drawing.charts/chartaxis/
---
## ChartAxis class

Represents the axis options of the chart.

To learn more, visit the [Working with Charts](https://docs.aspose.com/words/net/working-with-charts/) documentation article.

```csharp
public class ChartAxis
```

## Properties

| Name | Description |
| --- | --- |
| [AxisBetweenCategories](../../aspose.words.drawing.charts/chartaxis/axisbetweencategories/) { get; set; } | Gets or sets a flag indicating whether the value axis crosses the category axis between categories. |
| [BaseTimeUnit](../../aspose.words.drawing.charts/chartaxis/basetimeunit/) { get; set; } | Returns or sets the smallest time unit that is represented on the time category axis. |
| [CategoryType](../../aspose.words.drawing.charts/chartaxis/categorytype/) { get; set; } | Gets or sets type of the category axis. |
| [Crosses](../../aspose.words.drawing.charts/chartaxis/crosses/) { get; set; } | Specifies how this axis crosses the perpendicular axis. |
| [CrossesAt](../../aspose.words.drawing.charts/chartaxis/crossesat/) { get; set; } | Specifies where on the perpendicular axis the axis crosses. |
| [DisplayUnit](../../aspose.words.drawing.charts/chartaxis/displayunit/) { get; } | Specifies the scaling value of the display units for the value axis. |
| [Document](../../aspose.words.drawing.charts/chartaxis/document/) { get; } | Returns the document containing the parent chart. |
| [Format](../../aspose.words.drawing.charts/chartaxis/format/) { get; } | Provides access to line formatting of the axis and fill of the tick labels. |
| [HasMajorGridlines](../../aspose.words.drawing.charts/chartaxis/hasmajorgridlines/) { get; set; } | Gets or sets a flag indicating whether the axis has major gridlines. |
| [HasMinorGridlines](../../aspose.words.drawing.charts/chartaxis/hasminorgridlines/) { get; set; } | Gets or sets a flag indicating whether the axis has minor gridlines. |
| [Hidden](../../aspose.words.drawing.charts/chartaxis/hidden/) { get; set; } | Gets or sets a flag indicating whether this axis is hidden or not. |
| [MajorTickMark](../../aspose.words.drawing.charts/chartaxis/majortickmark/) { get; set; } | Returns or sets the major tick marks. |
| [MajorUnit](../../aspose.words.drawing.charts/chartaxis/majorunit/) { get; set; } | Returns or sets the distance between major tick marks. |
| [MajorUnitIsAuto](../../aspose.words.drawing.charts/chartaxis/majorunitisauto/) { get; set; } | Gets or sets a flag indicating whether default distance between major tick marks shall be used. |
| [MajorUnitScale](../../aspose.words.drawing.charts/chartaxis/majorunitscale/) { get; set; } | Returns or sets the scale value for major tick marks on the time category axis. |
| [MinorTickMark](../../aspose.words.drawing.charts/chartaxis/minortickmark/) { get; set; } | Returns or sets the minor tick marks for the axis. |
| [MinorUnit](../../aspose.words.drawing.charts/chartaxis/minorunit/) { get; set; } | Returns or sets the distance between minor tick marks. |
| [MinorUnitIsAuto](../../aspose.words.drawing.charts/chartaxis/minorunitisauto/) { get; set; } | Gets or sets a flag indicating whether default distance between minor tick marks shall be used. |
| [MinorUnitScale](../../aspose.words.drawing.charts/chartaxis/minorunitscale/) { get; set; } | Returns or sets the scale value for minor tick marks on the time category axis. |
| [NumberFormat](../../aspose.words.drawing.charts/chartaxis/numberformat/) { get; } | Returns a [`ChartNumberFormat`](../chartnumberformat/) object that allows defining number formats for the axis. |
| [ReverseOrder](../../aspose.words.drawing.charts/chartaxis/reverseorder/) { get; set; } | Returns or sets a flag indicating whether values of axis should be displayed in reverse order, i.e. from max to min. |
| [Scaling](../../aspose.words.drawing.charts/chartaxis/scaling/) { get; } | Provides access to the scaling options of the axis. |
| [TickLabels](../../aspose.words.drawing.charts/chartaxis/ticklabels/) { get; } | Provides access to the properties of the axis tick mark labels. |
| [TickMarkSpacing](../../aspose.words.drawing.charts/chartaxis/tickmarkspacing/) { get; set; } | Gets or sets the interval, at which tick marks are drawn. |
| [Title](../../aspose.words.drawing.charts/chartaxis/title/) { get; } | Provides access to the axis title properties. |
| [Type](../../aspose.words.drawing.charts/chartaxis/type/) { get; } | Returns type of the axis. |

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

* namespace [Aspose.Words.Drawing.Charts](../../aspose.words.drawing.charts/)
* assembly [Aspose.Words](../../)
