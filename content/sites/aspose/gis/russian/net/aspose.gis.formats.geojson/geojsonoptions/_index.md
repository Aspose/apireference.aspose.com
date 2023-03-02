---
title: Class GeoJsonOptions
second_title: Справочник по Aspose.GIS for .NET API
description: Aspose.Gis.Formats.GeoJson.GeoJsonOptions сорт. Параметры драйвера для формата GeoJSON.
type: docs
weight: 310
url: /ru/net/aspose.gis.formats.geojson/geojsonoptions/
---
## GeoJsonOptions class

Параметры драйвера для формата GeoJSON.

```csharp
public class GeoJsonOptions : DriverOptions
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [GeoJsonOptions](geojsonoptions/)() | Создать новый экземпляр. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [ArrayAsString](../../aspose.gis.formats.geojson/geojsonoptions/arrayasstring/) { get; set; } | Выставлять ли массивы JSon строк, целых чисел или вещественных чисел как строку. |
| [AttributesSkip](../../aspose.gis.formats.geojson/geojsonoptions/attributesskip/) { get; set; } | управляет переводом атрибутов: да - пропустить все атрибуты |
| [AutoId](../../aspose.gis.formats.geojson/geojsonoptions/autoid/) { get; set; } | Автоматически генерировать идентификаторы |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Определяет, закрывается ли незакрытыйLinearRing в каждой геометрии. По умолчанию`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Определяет, добавлять ли новую точку посередине к каждому сегменту геометрии. По умолчанию`false` . |
| [DateAsString](../../aspose.gis.formats.geojson/geojsonoptions/dateasstring/) { get; set; } | Отображать ли дату/время/дату-время JSon в виде строки. |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Определяет, удалять ли ближайшие точки в каждой геометрии. По умолчанию`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Определяет расстояние для[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . По умолчанию`0` . |
| [Description](../../aspose.gis.formats.geojson/geojsonoptions/description/) { get; set; } | Описание на уровне коллекции объектов (для создания слоя) |
| [GeometryAsCollection](../../aspose.gis.formats.geojson/geojsonoptions/geometryascollection/) { get; set; } | управлять трансляцией геометрий: да - обертывать геометрии с помощью GeometryCollection type |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | Допуск, используемый для линеаризации геометрии кривой. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | А[`PrecisionModel`](../../aspose.gis/precisionmodel/) который будет применен к координате M при добавлении геометрий в[`VectorLayer`](../../aspose.gis/vectorlayer/) или когда они читаются из[`VectorLayer`](../../aspose.gis/vectorlayer/) . Значение по умолчанию:[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [Name](../../aspose.gis.formats.geojson/geojsonoptions/name/) { get; set; } | Имя на уровне набора объектов (для создания слоя) |
| [NestedPropertiesSeparator](../../aspose.gis.formats.geojson/geojsonoptions/nestedpropertiesseparator/) { get; set; } | Получает или задает строку, используемую для разделения компонентов вложенных атрибутов. Значение по умолчанию: "_". |
| [ReadBoundingBoxes](../../aspose.gis.formats.geojson/geojsonoptions/readboundingboxes/) { get; set; } | Определяет, должны ли ограничивающие рамки («bbox») считываться как атрибуты с именем «bbox_0», «bbox_1» и т. д. Значение по умолчанию:`false` . [`NestedPropertiesSeparator`](./nestedpropertiesseparator/) строка используется в bbox_0, bbox_1,.. именах. |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Определяет, удаляются ли точки, лежащие на одном и том же сегменте в каждой геометрии. По умолчанию`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Определяет расстояние для[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . По умолчанию`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Определяет, следует ли проверять геометрию при добавлении в слой. Если установлено значение`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) вызывается для геометрии each , когда она добавляется к слою, и если проверка не пройдена ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) является`false` ),[`GisException`](../../aspose.gis/gisexception/) брошен. |
| [WriteBoundingBoxes](../../aspose.gis.formats.geojson/geojsonoptions/writeboundingboxes/) { get; set; } | Определяет, следует ли включать в объекты GeoJSON информацию о диапазоне координат для своих геометрий. Если установлено значение`true` , элемент "bbox" создается для каждой геометрии (не нулевой), когда она добавляется к слою. Значение по умолчанию:`false` . |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Определяет, разрешено ли преобразование полигона или мультиполигона в линию. По умолчанию`false` . |
| [WriteUnsetAttribute](../../aspose.gis.formats.geojson/geojsonoptions/writeunsetattribute/) { get; set; } | Нужно ли записывать неустановленные атрибуты, добавляя «нулевое» значение |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | А[`PrecisionModel`](../../aspose.gis/precisionmodel/) который будет применяться к координатам X и Y при добавлении геометрии в[`VectorLayer`](../../aspose.gis/vectorlayer/) или когда они читаются из[`VectorLayer`](../../aspose.gis/vectorlayer/) . Значение по умолчанию:[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | А[`PrecisionModel`](../../aspose.gis/precisionmodel/) который будет применен к координате Z при добавлении геометрии в[`VectorLayer`](../../aspose.gis/vectorlayer/) или когда они читаются из[`VectorLayer`](../../aspose.gis/vectorlayer/) . Значение по умолчанию:[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### Смотрите также

* class [DriverOptions](../../aspose.gis/driveroptions/)
* пространство имен [Aspose.Gis.Formats.GeoJson](../../aspose.gis.formats.geojson/)
* сборка [Aspose.GIS](../../)


