---
title: Format
second_title: Aspose.Sildes for .NET API Reference
description: Represents formatting properties of data point level. Read/write IFormataspose.slides.charts/iformat.
type: docs
weight: 10
url: /net/aspose.slides.charts/ichartdatapointlevel/format/
---
## IChartDataPointLevel.Format property

Represents formatting properties of data point level. Read/write [`IFormat`](../../iformat).

```csharp
public IFormat Format { get; }
```

### Examples

```csharp
using (Presentation pres = new Presentation())
{
    IChart chart = pres.Slides[0].Shapes.AddChart(ChartType.Treemap, 50, 50, 500, 400);
    IChartSeries series = chart.ChartData.Series[0];

    IChartDataPointLevel dataPointLevel = series.DataPoints[7].DataPointLevels[2];
    dataPointLevel.Format.Fill.FillType = FillType.Solid;
    dataPointLevel.Format.Fill.SolidFillColor.Color = Color.Red;
}
```

### See Also

* interface [IFormat](../../iformat)
* interface [IChartDataPointLevel](../../ichartdatapointlevel)
* namespace [Aspose.Slides.Charts](../../ichartdatapointlevel)
* assembly [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
