---
title: GmlOptions
second_title: Справочник по Aspose.GIS for .NET API
description: Параметры драйвера для формата GML.
type: docs
weight: 300
url: /ru/net/aspose.gis.formats.gml/gmloptions/
---
## GmlOptions class

Параметры драйвера для формата GML.

```csharp
public class GmlOptions : DriverOptions
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [GmlOptions](gmloptions)() | Создать новый экземпляр. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring) { get; set; } | Определяет, закрывается ли незакрытыйLinearRing в каждой геометрии. По умолчанию`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints) { get; set; } | Определяет, добавлять ли новую точку посередине к каждому сегменту геометрии. По умолчанию`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints) { get; set; } | Определяет, удалять ли ближайшие точки в каждой геометрии. По умолчанию`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance) { get; set; } | Определяет расстояние для[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints) . По умолчанию`0` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance) { get; set; } | Допуск, используемый для линеаризации геометрии кривой. |
| [LoadSchemasFromInternet](../../aspose.gis.formats.gml/gmloptions/loadschemasfrominternet) { get; set; } | Определяет, разрешено ли Aspose.GIS загружать схему XML из Интернета. Если установлено значение`false` , схемы с абсолютными URI, которые не начинаются с 'file://', не будут загружены. Значение по умолчанию:`false` . |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel) { get; set; } | А[`PrecisionModel`](../../aspose.gis/precisionmodel) который будет применен к координате M при добавлении геометрий в[`VectorLayer`](../../aspose.gis/vectorlayer) или когда они читаются из[`VectorLayer`](../../aspose.gis/vectorlayer) . Значение по умолчанию:[`Exact`](../../aspose.gis/precisionmodel/exact) . |
| [NestedPropertiesSeparator](../../aspose.gis.formats.gml/gmloptions/nestedpropertiesseparator) { get; set; } | Получает или задает строку, используемую для разделения компонентов вложенных атрибутов. Значение по умолчанию: "_". |
| [RestoreSchema](../../aspose.gis.formats.gml/gmloptions/restoreschema) { get; set; } | Определяет, разрешено ли Aspose.GIS анализировать атрибуты в файле Gml, в котором схема XML отсутствует или не может быть загружена. Если установлено значение`true` , Для чтения Aspose.GIS не требуется наличие XML-схемы. Значение по умолчанию:`false` . |
| [SchemaLocation](../../aspose.gis.formats.gml/gmloptions/schemalocation) { get; set; } | Список пар URI, разделенных пробелами. Первый URI в каждой паре — это URI пространства имен, второй URI — это путь к XML-схеме пространства имен. Если установлено значение`null` ,[`GmlDriver`](../gmldriver) попытается прочитать schemaLocation из корневого элемента документа. Значение по умолчанию:`null` . |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments) { get; set; } | Определяет, удаляются ли точки, лежащие на одном и том же сегменте в каждой геометрии. По умолчанию`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance) { get; set; } | Определяет расстояние для[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments) . По умолчанию`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite) { get; set; } | Определяет, следует ли проверять геометрию при добавлении в слой. Если установлено значение`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid)вызывается для геометрии each , когда она добавляется к слою, и если проверка не пройдена ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid) является`false` ),[`GisException`](../../aspose.gis/gisexception) брошен. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines) { get; set; } | Определяет, разрешено ли преобразование полигона или мультиполигона в линию. По умолчанию`false` . |
| [XmlResolver](../../aspose.gis.formats.gml/gmloptions/xmlresolver) { get; set; } | А[`XmlResolver`](./xmlresolver) используется для разрешения внешних ресурсов. По умолчаниюXmlUrlResolver . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel) { get; set; } | А[`PrecisionModel`](../../aspose.gis/precisionmodel)который будет применяться к координатам X и Y при добавлении геометрии в[`VectorLayer`](../../aspose.gis/vectorlayer) или когда они читаются из[`VectorLayer`](../../aspose.gis/vectorlayer) . Значение по умолчанию:[`Exact`](../../aspose.gis/precisionmodel/exact) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel) { get; set; } | А[`PrecisionModel`](../../aspose.gis/precisionmodel) который будет применен к координате Z при добавлении геометрии в[`VectorLayer`](../../aspose.gis/vectorlayer) или когда они читаются из[`VectorLayer`](../../aspose.gis/vectorlayer) . Значение по умолчанию:[`Exact`](../../aspose.gis/precisionmodel/exact) . |

### Смотрите также

* class [DriverOptions](../../aspose.gis/driveroptions)
* пространство имен [Aspose.Gis.Formats.Gml](../../aspose.gis.formats.gml)
* сборка [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
