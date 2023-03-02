---
title: Class CsvOptions
second_title: Справочник по Aspose.GIS for .NET API
description: Aspose.Gis.Formats.Csv.CsvOptions сорт. Параметры драйвера для формата CSV.
type: docs
weight: 200
url: /ru/net/aspose.gis.formats.csv/csvoptions/
---
## CsvOptions class

Параметры драйвера для формата CSV.

```csharp
public class CsvOptions : DriverOptions
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [CsvOptions](csvoptions/)() | Создать новый экземпляр. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Определяет, закрывается ли незакрытыйLinearRing в каждой геометрии. По умолчанию`false` . |
| [ColumnM](../../aspose.gis.formats.csv/csvoptions/columnm/) { get; set; } | Получает или задает имя столбца, содержащего значение координаты M. Значение по умолчанию:`null` . |
| [ColumnWkt](../../aspose.gis.formats.csv/csvoptions/columnwkt/) { get; set; } | Получает или задает имя столбца, содержащего общеизвестный текст для представления геометрии. Значение по умолчанию:`null` . |
| [ColumnX](../../aspose.gis.formats.csv/csvoptions/columnx/) { get; set; } | Получает или задает имя столбца, содержащего значение координаты X. Значение по умолчанию:`null` . |
| [ColumnY](../../aspose.gis.formats.csv/csvoptions/columny/) { get; set; } | Получает или задает имя столбца, содержащего значение координаты Y. Значение по умолчанию:`null` . |
| [ColumnZ](../../aspose.gis.formats.csv/csvoptions/columnz/) { get; set; } | Получает или задает имя столбца, содержащего значение координаты Z. Значение по умолчанию:`null` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Определяет, добавлять ли новую точку посередине к каждому сегменту геометрии. По умолчанию`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Определяет, удалять ли ближайшие точки в каждой геометрии. По умолчанию`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Определяет расстояние для[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . По умолчанию`0` . |
| [Delimiter](../../aspose.gis.formats.csv/csvoptions/delimiter/) { get; set; } | Получает или задает символ, который используется в качестве разделителя для разделения значений. Значение по умолчанию: ','. |
| [DoubleQuoteEscape](../../aspose.gis.formats.csv/csvoptions/doublequoteescape/) { get; set; } | Получает или задает символ, который используется в качестве управляющей буквы для двойных кавычек. Значение по умолчанию: '"'. |
| [HasAttributeNames](../../aspose.gis.formats.csv/csvoptions/hasattributenames/) { get; set; } | Определяет, существует ли строка заголовка с именами атрибутов. Значение по умолчанию:`true` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | Допуск, используемый для линеаризации геометрии кривой. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | А[`PrecisionModel`](../../aspose.gis/precisionmodel/) который будет применен к координате M при добавлении геометрий в[`VectorLayer`](../../aspose.gis/vectorlayer/) или когда они читаются из[`VectorLayer`](../../aspose.gis/vectorlayer/) . Значение по умолчанию:[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Определяет, удаляются ли точки, лежащие на одном и том же сегменте в каждой геометрии. По умолчанию`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Определяет расстояние для[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . По умолчанию`0` . |
| [StartLineNumber](../../aspose.gis.formats.csv/csvoptions/startlinenumber/) { get; set; } | Получает или задает отсчитываемый от нуля номер строки, которая будет первой при чтении данных. Значение по умолчанию: 0. |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Определяет, следует ли проверять геометрию при добавлении в слой. Если установлено значение`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) вызывается для геометрии each , когда она добавляется к слою, и если проверка не пройдена ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) является`false` ),[`GisException`](../../aspose.gis/gisexception/) брошен. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Определяет, разрешено ли преобразование полигона или мультиполигона в линию. По умолчанию`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | А[`PrecisionModel`](../../aspose.gis/precisionmodel/) который будет применяться к координатам X и Y при добавлении геометрии в[`VectorLayer`](../../aspose.gis/vectorlayer/) или когда они читаются из[`VectorLayer`](../../aspose.gis/vectorlayer/) . Значение по умолчанию:[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | А[`PrecisionModel`](../../aspose.gis/precisionmodel/) который будет применен к координате Z при добавлении геометрии в[`VectorLayer`](../../aspose.gis/vectorlayer/) или когда они читаются из[`VectorLayer`](../../aspose.gis/vectorlayer/) . Значение по умолчанию:[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### Смотрите также

* class [DriverOptions](../../aspose.gis/driveroptions/)
* пространство имен [Aspose.Gis.Formats.Csv](../../aspose.gis.formats.csv/)
* сборка [Aspose.GIS](../../)


