---
title: Class EsriAsciiOptions
second_title: Aspose.GIS for .NET API 参考
description: Aspose.Gis.Formats.EsriAscii.EsriAsciiOptions 班级. EsriAscii 格式的特定于驱动程序的选项
type: docs
weight: 220
url: /zh/net/aspose.gis.formats.esriascii/esriasciioptions/
---
## EsriAsciiOptions class

EsriAscii 格式的特定于驱动程序的选项。

```csharp
public class EsriAsciiOptions : RasterDriverOptions
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [EsriAsciiOptions](esriasciioptions/)() | 创建新实例. |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | 确定是否关闭未关闭LinearRing在每个几何体中。默认为`false`. |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | 确定是否在每个几何段的中间添加一个新点。默认为`false`. |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | 确定是否删除每个几何中的近点。默认为`false`. |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | 确定距离[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/).默认为`0`. |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | 用于线性化曲线几何的公差。 |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | 一个[`PrecisionModel`](../../aspose.gis/precisionmodel/)将几何添加到 M coordinate [`VectorLayer`](../../aspose.gis/vectorlayer/)或者当他们从[`VectorLayer`](../../aspose.gis/vectorlayer/). 默认值为[`Exact`](../../aspose.gis/precisionmodel/exact/). |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | 确定是否删除位于每个几何图形中同一线段上的点。默认为`false`. |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | 确定距离[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/).默认为`0`. |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | 确定在将几何图形添加到图层时是否应对其进行验证。 如果设置为`true`,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/)在将每个 几何图形添加到图层时调用该几何图形，并且如果验证失败（[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/)是`false`),[`GisException`](../../aspose.gis/gisexception/)被抛出. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | 确定是否允许将多边形或多边形转换为线串。默认为`false`. |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | 一个[`PrecisionModel`](../../aspose.gis/precisionmodel/)当几何体被添加到[`VectorLayer`](../../aspose.gis/vectorlayer/)或者当他们从[`VectorLayer`](../../aspose.gis/vectorlayer/). 默认值为[`Exact`](../../aspose.gis/precisionmodel/exact/). |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | 一个[`PrecisionModel`](../../aspose.gis/precisionmodel/)当几何被添加到时，将应用于 Z 坐标 [`VectorLayer`](../../aspose.gis/vectorlayer/)或者当他们从[`VectorLayer`](../../aspose.gis/vectorlayer/). 默认值为[`Exact`](../../aspose.gis/precisionmodel/exact/). |

### 也可以看看

* class [RasterDriverOptions](../../aspose.gis/rasterdriveroptions/)
* 命名空间 [Aspose.Gis.Formats.EsriAscii](../../aspose.gis.formats.esriascii/)
* 部件 [Aspose.GIS](../../)


