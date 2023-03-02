---
title: Class TopoJsonOptions
second_title: Справочник по Aspose.GIS for .NET API
description: Aspose.Gis.Formats.TopoJson.TopoJsonOptions сорт. Параметры драйвера для формата TopoJSON.
type: docs
weight: 710
url: /ru/net/aspose.gis.formats.topojson/topojsonoptions/
---
## TopoJsonOptions class

Параметры драйвера для формата TopoJSON.

```csharp
public class TopoJsonOptions : DriverOptions
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [TopoJsonOptions](topojsonoptions/)() | Создать новый экземпляр. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Определяет, закрывается ли незакрытыйLinearRing в каждой геометрии. По умолчанию`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Определяет, добавлять ли новую точку посередине к каждому сегменту геометрии. По умолчанию`false` . |
| [DefaultObjectName](../../aspose.gis.formats.topojson/topojsonoptions/defaultobjectname/) { get; set; } | Имя объекта, в который по умолчанию помещаются функции. |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Определяет, удалять ли ближайшие точки в каждой геометрии. По умолчанию`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Определяет расстояние для[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . По умолчанию`0` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | Допуск, используемый для линеаризации геометрии кривой. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | А[`PrecisionModel`](../../aspose.gis/precisionmodel/) который будет применен к координате M при добавлении геометрий в[`VectorLayer`](../../aspose.gis/vectorlayer/) или когда они читаются из[`VectorLayer`](../../aspose.gis/vectorlayer/) . Значение по умолчанию:[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [NestedPropertiesSeparator](../../aspose.gis.formats.topojson/topojsonoptions/nestedpropertiesseparator/) { get; set; } | Получает или задает строку, используемую для разделения компонентов вложенных атрибутов. Значение по умолчанию: "_". |
| [ObjectNameAttribute](../../aspose.gis.formats.topojson/topojsonoptions/objectnameattribute/) { get; set; } | Имя атрибута, отражающее имя объекта, содержащего признак. |
| [QuantizationNumber](../../aspose.gis.formats.topojson/topojsonoptions/quantizationnumber/) { get; set; } | Определяет номер квантования, используемый для квантования координат и дельта-кодирования дуг в выходных данных TopoJSON. |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Определяет, удаляются ли точки, лежащие на одном и том же сегменте в каждой геометрии. По умолчанию`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Определяет расстояние для[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . По умолчанию`0` . |
| [Transform](../../aspose.gis.formats.topojson/topojsonoptions/transform/) { get; set; } | Определяет объект преобразования, используемый для квантования координат и дельта-кодирования дуг в выходных данных TopoJSON. |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Определяет, следует ли проверять геометрию при добавлении в слой. Если установлено значение`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) вызывается для геометрии each , когда она добавляется к слою, и если проверка не пройдена ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) является`false` ),[`GisException`](../../aspose.gis/gisexception/) брошен. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Определяет, разрешено ли преобразование полигона или мультиполигона в линию. По умолчанию`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | А[`PrecisionModel`](../../aspose.gis/precisionmodel/) который будет применяться к координатам X и Y при добавлении геометрии в[`VectorLayer`](../../aspose.gis/vectorlayer/) или когда они читаются из[`VectorLayer`](../../aspose.gis/vectorlayer/) . Значение по умолчанию:[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | А[`PrecisionModel`](../../aspose.gis/precisionmodel/) который будет применен к координате Z при добавлении геометрии в[`VectorLayer`](../../aspose.gis/vectorlayer/) или когда они читаются из[`VectorLayer`](../../aspose.gis/vectorlayer/) . Значение по умолчанию:[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### Смотрите также

* class [DriverOptions](../../aspose.gis/driveroptions/)
* пространство имен [Aspose.Gis.Formats.TopoJson](../../aspose.gis.formats.topojson/)
* сборка [Aspose.GIS](../../)


