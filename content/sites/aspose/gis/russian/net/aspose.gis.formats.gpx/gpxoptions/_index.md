---
title: GpxOptions
second_title: Справочник по Aspose.GIS for .NET API
description: Параметры драйвера для формата GPX.
type: docs
weight: 320
url: /ru/net/aspose.gis.formats.gpx/gpxoptions/
---
## GpxOptions class

Параметры драйвера для формата GPX.

```csharp
public class GpxOptions : DriverOptions
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [GpxOptions](gpxoptions)() | Создать новый экземпляр. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring) { get; set; } | Определяет, закрывается ли незамкнутыйLinearRingв каждой геометрии. По умолчанию`false`. |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints) { get; set; } | Определяет, добавлять ли новую точку посередине к каждому сегменту геометрии. По умолчанию`false`. |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints) { get; set; } | Определяет, удалять ли ближайшие точки в каждой геометрии. По умолчанию`false`. |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance) { get; set; } | Определяет расстояние для[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints). По умолчанию`0`. |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance) { get; set; } | Допуск, используемый для линеаризации геометрии кривых. |
| [MAttribute](../../aspose.gis.formats.gpx/gpxoptions/mattribute) { get; set; } | Определяет, какой атрибут GPX будет экспортирован как координата 'M' путевых точек, точек маршрута и точек трека. Поведение такое же, как и у[`ZAttribute`](./zattribute), по умолчанию`null`. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel)который будет применен к координате M при добавлении геометрии к[`VectorLayer`](../../aspose.gis/vectorlayer)или когда они читаются из[`VectorLayer`](../../aspose.gis/vectorlayer). Значение по умолчанию:[`Exact`](../../aspose.gis/precisionmodel/exact). |
| [NestedAttributeSeparator](../../aspose.gis.formats.gpx/gpxoptions/nestedattributeseparator) { get; } | Строка для разделения имени вложенного атрибута и его индексов. По умолчанию используется двойное подчеркивание «__». |
| [ReadNestedAttributes](../../aspose.gis.formats.gpx/gpxoptions/readnestedattributes) { get; set; } | Определяет, содержат ли точки GPX, такие как 'trkpt' и 'rtept', внутренние атрибуты и должны ли они быть прочитаны. По умолчанию`false`. |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments) { get; set; } | Определяет, удаляются ли точки, лежащие на одном сегменте в каждой геометрии. По умолчанию`false`. |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance) { get; set; } | Определяет расстояние для[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments). По умолчанию`0`. |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite) { get; set; } | Определяет, следует ли проверять геометрию при ее добавлении в слой. Если установлено значение`true`,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid)вызывается для каждого геометрия, когда она добавляется к слою, и если проверка не пройдена ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid)is`false`),TВыбрасывается:Aspose.Gis.GisException. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines) { get; set; } | Определяет, разрешено ли преобразование полигона или мультиполигона в строку. По умолчанию`false`. |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel)который будет применяться к координатам X и Y когда геометрия добавляются в[`VectorLayer`](../../aspose.gis/vectorlayer)или когда они считываются из[`VectorLayer`](../../aspose.gis/vectorlayer). Значение по умолчанию:[`Exact`](../../aspose.gis/precisionmodel/exact). |
| [ZAttribute](../../aspose.gis.formats.gpx/gpxoptions/zattribute) { get; set; } | Определяет, какой атрибут GPX будет экспортироваться как координата 'Z' путевых точек, точек маршрута и точек трека. If`null`- никакие атрибуты не будут экспортированы как координата 'Z'. По умолчанию "ele". Возможные значения - имена всех атрибутов GPX XML, которые могут быть представлены как двойные (например, "скорость", "magvar", "geoidheight" и т.д.) |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel)который будет применен к координате Z при добавлении геометрии к[`VectorLayer`](../../aspose.gis/vectorlayer)или когда они читаются из[`VectorLayer`](../../aspose.gis/vectorlayer). Значение по умолчанию:[`Exact`](../../aspose.gis/precisionmodel/exact). |

### Смотрите также

* class [DriverOptions](../../aspose.gis/driveroptions)
* пространство имен [Aspose.Gis.Formats.Gpx](../../aspose.gis.formats.gpx)
* сборка [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
