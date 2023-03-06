---
title: Class RasterDriverOptions
second_title: Справочник по Aspose.GIS for .NET API
description: Aspose.Gis.RasterDriverOptions сорт. Параметры дляRasterDriver .
type: docs
weight: 1470
url: /ru/net/aspose.gis/rasterdriveroptions/
---
## RasterDriverOptions class

Параметры для[`RasterDriver`](../rasterdriver/) .

```csharp
public abstract class RasterDriverOptions : DriverOptions
```

## Характеристики

| Имя | Описание |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Определяет, закрывается ли незакрытыйLinearRing в каждой геометрии. По умолчанию`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Определяет, добавлять ли новую точку посередине к каждому сегменту геометрии. По умолчанию`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Определяет, удалять ли ближайшие точки в каждой геометрии. По умолчанию`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Определяет расстояние для[`DeleteNearPoints`](../driveroptions/deletenearpoints/) . По умолчанию`0` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | Допуск, используемый для линеаризации геометрии кривой. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | А[`PrecisionModel`](../precisionmodel/) который будет применен к координате M при добавлении геометрий в[`VectorLayer`](../vectorlayer/) или когда они читаются из[`VectorLayer`](../vectorlayer/) . Значение по умолчанию:[`Exact`](../precisionmodel/exact/) . |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Определяет, удаляются ли точки, лежащие на одном и том же сегменте в каждой геометрии. По умолчанию`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Определяет расстояние для[`SimplifySegments`](../driveroptions/simplifysegments/) . По умолчанию`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Определяет, следует ли проверять геометрию при добавлении в слой. Если установлено значение`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) вызывается для геометрии each , когда она добавляется к слою, и если проверка не пройдена ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) является`false` ),[`GisException`](../gisexception/) брошен. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Определяет, разрешено ли преобразование полигона или мультиполигона в линию. По умолчанию`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | А[`PrecisionModel`](../precisionmodel/) который будет применяться к координатам X и Y при добавлении геометрии в[`VectorLayer`](../vectorlayer/) или когда они читаются из[`VectorLayer`](../vectorlayer/) . Значение по умолчанию:[`Exact`](../precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | А[`PrecisionModel`](../precisionmodel/) который будет применен к координате Z при добавлении геометрии в[`VectorLayer`](../vectorlayer/) или когда они читаются из[`VectorLayer`](../vectorlayer/) . Значение по умолчанию:[`Exact`](../precisionmodel/exact/) . |

### Смотрите также

* class [DriverOptions](../driveroptions/)
* пространство имен [Aspose.Gis](../../aspose.gis/)
* сборка [Aspose.GIS](../../)


