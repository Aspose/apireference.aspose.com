---
title: Class OsmXmlOptions
second_title: Справочник по Aspose.GIS for .NET API
description: Aspose.Gis.Formats.OsmXml.OsmXmlOptions сорт. Параметры драйвера для формата OSM XML.
type: docs
weight: 630
url: /ru/net/aspose.gis.formats.osmxml/osmxmloptions/
---
## OsmXmlOptions class

Параметры драйвера для формата OSM XML.

```csharp
public class OsmXmlOptions : DriverOptions
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [OsmXmlOptions](osmxmloptions/)() | Создать новый экземпляр. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Определяет, закрывается ли незакрытыйLinearRing в каждой геометрии. По умолчанию`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Определяет, добавлять ли новую точку посередине к каждому сегменту геометрии. По умолчанию`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Определяет, удалять ли ближайшие точки в каждой геометрии. По умолчанию`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Определяет расстояние для[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . По умолчанию`0` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | Допуск, используемый для линеаризации геометрии кривой. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | А[`PrecisionModel`](../../aspose.gis/precisionmodel/) который будет применен к координате M при добавлении геометрий в[`VectorLayer`](../../aspose.gis/vectorlayer/) или когда они читаются из[`VectorLayer`](../../aspose.gis/vectorlayer/) . Значение по умолчанию:[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ReportAllNodes](../../aspose.gis.formats.osmxml/osmxmloptions/reportallnodes/) { get; set; } | Сообщать обо всех узлах как о функциях, даже если у них нет важных тегов. |
| [ReportAllWays](../../aspose.gis.formats.osmxml/osmxmloptions/reportallways/) { get; set; } | Отмечать все пути как функции, даже если они не имеют важных тегов или узлов. |
| [ReportCommonAttributes](../../aspose.gis.formats.osmxml/osmxmloptions/reportcommonattributes/) { get; set; } | Отчет об общих атрибутах OSM: visible, version, changeset, timestamp, user и uid. Общие атрибуты будут представлены как атрибуты функций с префиксом «osm_», например, osm_user, osm_timestamp и т. д. |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Определяет, удаляются ли точки, лежащие на одном и том же сегменте в каждой геометрии. По умолчанию`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Определяет расстояние для[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . По умолчанию`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Определяет, следует ли проверять геометрию при добавлении в слой. Если установлено значение`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) вызывается для геометрии each , когда она добавляется к слою, и если проверка не пройдена ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) является`false` ),[`GisException`](../../aspose.gis/gisexception/) брошен. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Определяет, разрешено ли преобразование полигона или мультиполигона в линию. По умолчанию`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | А[`PrecisionModel`](../../aspose.gis/precisionmodel/) который будет применяться к координатам X и Y при добавлении геометрии в[`VectorLayer`](../../aspose.gis/vectorlayer/) или когда они читаются из[`VectorLayer`](../../aspose.gis/vectorlayer/) . Значение по умолчанию:[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | А[`PrecisionModel`](../../aspose.gis/precisionmodel/) который будет применен к координате Z при добавлении геометрии в[`VectorLayer`](../../aspose.gis/vectorlayer/) или когда они читаются из[`VectorLayer`](../../aspose.gis/vectorlayer/) . Значение по умолчанию:[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### Смотрите также

* class [DriverOptions](../../aspose.gis/driveroptions/)
* пространство имен [Aspose.Gis.Formats.OsmXml](../../aspose.gis.formats.osmxml/)
* сборка [Aspose.GIS](../../)


