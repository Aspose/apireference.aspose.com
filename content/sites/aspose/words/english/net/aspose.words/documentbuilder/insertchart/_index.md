---
title: DocumentBuilder.InsertChart
linktitle: InsertChart
articleTitle: InsertChart
second_title: Aspose.Words for .NET
description: Enhance your documents effortlessly with the DocumentBuilder InsertChart method. Seamlessly add and resize chart objects for impactful presentations.
type: docs
weight: 280
url: /net/aspose.words/documentbuilder/insertchart/
---
## InsertChart(*[ChartType](../../../aspose.words.drawing.charts/charttype/), double, double*) {#insertchart_2}

Inserts an chart object into the document and scales it to the specified size.

```csharp
public Shape InsertChart(ChartType chartType, double width, double height)
```

| Parameter | Type | Description |
| --- | --- | --- |
| chartType | ChartType | The chart type to insert into the document. |
| width | Double | The width of the image in points. Can be a negative or zero value to request 100% scale. |
| height | Double | The height of the image in points. Can be a negative or zero value to request 100% scale. |

### Return Value

The image node that was just inserted.

## Remarks

You can change the image size, location, positioning method and other settings using the [`Shape`](../../../aspose.words.drawing/shape/) object returned by this method.

## Examples

Shows how to insert a pie chart into a document.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

Chart chart = builder.InsertChart(ChartType.Pie, ConvertUtil.PixelToPoint(300),
    ConvertUtil.PixelToPoint(300)).Chart;
chart.Series.Clear();
chart.Series.Add("My fruit",
    new[] { "Apples", "Bananas", "Cherries" },
    new[] { 1.3, 2.2, 1.5 });

doc.Save(ArtifactsDir + "DocumentBuilder.InsertPieChart.docx");
```

### See Also

* class [Shape](../../../aspose.words.drawing/shape/)
* enum [ChartType](../../../aspose.words.drawing.charts/charttype/)
* class [DocumentBuilder](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)

---

## InsertChart(*[ChartType](../../../aspose.words.drawing.charts/charttype/), double, double, [ChartStyle](../../../aspose.words.drawing.charts/chartstyle/)*) {#insertchart_3}

Inserts an chart object into the document and scales it to the specified size.

```csharp
public Shape InsertChart(ChartType chartType, double width, double height, ChartStyle chartStyle)
```

| Parameter | Type | Description |
| --- | --- | --- |
| chartType | ChartType | The chart type to insert into the document. |
| width | Double | The width of the image in points. Can be a negative or zero value to request 100% scale. |
| height | Double | The height of the image in points. Can be a negative or zero value to request 100% scale. |
| chartStyle | ChartStyle | The style of the inserted chart. |

### Return Value

The image node that was just inserted.

## Remarks

You can change the image size, location, positioning method and other settings using the [`Shape`](../../../aspose.words.drawing/shape/) object returned by this method.

### See Also

* class [Shape](../../../aspose.words.drawing/shape/)
* enum [ChartType](../../../aspose.words.drawing.charts/charttype/)
* enum [ChartStyle](../../../aspose.words.drawing.charts/chartstyle/)
* class [DocumentBuilder](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)

---

## InsertChart(*[ChartType](../../../aspose.words.drawing.charts/charttype/), [RelativeHorizontalPosition](../../../aspose.words.drawing/relativehorizontalposition/), double, [RelativeVerticalPosition](../../../aspose.words.drawing/relativeverticalposition/), double, double, double, [WrapType](../../../aspose.words.drawing/wraptype/)*) {#insertchart}

Inserts an chart object into the document and scales it to the specified size.

```csharp
public Shape InsertChart(ChartType chartType, RelativeHorizontalPosition horzPos, double left, 
    RelativeVerticalPosition vertPos, double top, double width, double height, WrapType wrapType)
```

| Parameter | Type | Description |
| --- | --- | --- |
| chartType | ChartType | The chart type to insert into the document. |
| horzPos | RelativeHorizontalPosition | Specifies where the distance to the image is measured from. |
| left | Double | Distance in points from the origin to the left side of the image. |
| vertPos | RelativeVerticalPosition | Specifies where the distance to the image measured from. |
| top | Double | Distance in points from the origin to the top side of the image. |
| width | Double | The width of the image in points. Can be a negative or zero value to request 100% scale. |
| height | Double | The height of the image in points. Can be a negative or zero value to request 100% scale. |
| wrapType | WrapType | Specifies how to wrap text around the image. |

### Return Value

The image node that was just inserted.

## Remarks

You can change the image size, location, positioning method and other settings using the [`Shape`](../../../aspose.words.drawing/shape/) object returned by this method.

## Examples

Shows how to specify position and wrapping while inserting a chart.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.InsertChart(ChartType.Pie, RelativeHorizontalPosition.Margin, 100, RelativeVerticalPosition.Margin,
    100, 200, 100, WrapType.Square);

doc.Save(ArtifactsDir + "DocumentBuilder.InsertedChartRelativePosition.docx");
```

### See Also

* class [Shape](../../../aspose.words.drawing/shape/)
* enum [ChartType](../../../aspose.words.drawing.charts/charttype/)
* enum [RelativeHorizontalPosition](../../../aspose.words.drawing/relativehorizontalposition/)
* enum [RelativeVerticalPosition](../../../aspose.words.drawing/relativeverticalposition/)
* enum [WrapType](../../../aspose.words.drawing/wraptype/)
* class [DocumentBuilder](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)

---

## InsertChart(*[ChartType](../../../aspose.words.drawing.charts/charttype/), [RelativeHorizontalPosition](../../../aspose.words.drawing/relativehorizontalposition/), double, [RelativeVerticalPosition](../../../aspose.words.drawing/relativeverticalposition/), double, double, double, [WrapType](../../../aspose.words.drawing/wraptype/), [ChartStyle](../../../aspose.words.drawing.charts/chartstyle/)*) {#insertchart_1}

Inserts an chart object into the document and scales it to the specified size.

```csharp
public Shape InsertChart(ChartType chartType, RelativeHorizontalPosition horzPos, double left, 
    RelativeVerticalPosition vertPos, double top, double width, double height, WrapType wrapType, 
    ChartStyle chartStyle)
```

| Parameter | Type | Description |
| --- | --- | --- |
| chartType | ChartType | The chart type to insert into the document. |
| horzPos | RelativeHorizontalPosition | Specifies where the distance to the image is measured from. |
| left | Double | Distance in points from the origin to the left side of the image. |
| vertPos | RelativeVerticalPosition | Specifies where the distance to the image measured from. |
| top | Double | Distance in points from the origin to the top side of the image. |
| width | Double | The width of the image in points. Can be a negative or zero value to request 100% scale. |
| height | Double | The height of the image in points. Can be a negative or zero value to request 100% scale. |
| wrapType | WrapType | Specifies how to wrap text around the image. |
| chartStyle | ChartStyle | The style of the inserted chart. |

### Return Value

The image node that was just inserted.

## Remarks

You can change the image size, location, positioning method and other settings using the [`Shape`](../../../aspose.words.drawing/shape/) object returned by this method.

### See Also

* class [Shape](../../../aspose.words.drawing/shape/)
* enum [ChartType](../../../aspose.words.drawing.charts/charttype/)
* enum [RelativeHorizontalPosition](../../../aspose.words.drawing/relativehorizontalposition/)
* enum [RelativeVerticalPosition](../../../aspose.words.drawing/relativeverticalposition/)
* enum [WrapType](../../../aspose.words.drawing/wraptype/)
* enum [ChartStyle](../../../aspose.words.drawing.charts/chartstyle/)
* class [DocumentBuilder](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
