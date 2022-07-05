---
title: CsvOptions
second_title: Справочник по Aspose.GIS for .NET API
description: Параметры драйвера для формата CSV.
type: docs
weight: 190
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
| [CsvOptions](csvoptions)() | Создать новый экземпляр. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring) { get; set; } | Определяет, закрывается ли незамкнутыйLinearRingв каждой геометрии. По умолчанию`false`. |
| [ColumnM](../../aspose.gis.formats.csv/csvoptions/columnm) { get; set; } | Получает или задает имя столбца, содержащего значение координаты M. По умолчанию:`null`. |
| [ColumnWkt](../../aspose.gis.formats.csv/csvoptions/columnwkt) { get; set; } | Получает или задает имя столбца, содержащего общеизвестный текст для представления геометрии. По умолчанию:`null`. |
| [ColumnX](../../aspose.gis.formats.csv/csvoptions/columnx) { get; set; } | Получает или задает имя столбца, содержащего значение координаты X. По умолчанию:`null`. |
| [ColumnY](../../aspose.gis.formats.csv/csvoptions/columny) { get; set; } | Получает или задает имя столбца, содержащего значение координаты Y. По умолчанию:`null`. |
| [ColumnZ](../../aspose.gis.formats.csv/csvoptions/columnz) { get; set; } | Получает или задает имя столбца, содержащего значение координаты Z. По умолчанию:`null`. |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints) { get; set; } | Определяет, добавлять ли новую точку посередине к каждому сегменту геометрии. По умолчанию`false`. |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints) { get; set; } | Определяет, удалять ли ближайшие точки в каждой геометрии. По умолчанию`false`. |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance) { get; set; } | Определяет расстояние для[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints). По умолчанию`0`. |
| [Delimiter](../../aspose.gis.formats.csv/csvoptions/delimiter) { get; set; } | Получает или задает символ, который используется в качестве разделителя для разделения значений. По умолчанию ','. |
| [DoubleQuoteEscape](../../aspose.gis.formats.csv/csvoptions/doublequoteescape) { get; set; } | Получает или задает символ, который используется в качестве управляющей буквы для двойных кавычек. По умолчанию '"'. |
| [HasAttributeNames](../../aspose.gis.formats.csv/csvoptions/hasattributenames) { get; set; } | Определяет, существует ли строка заголовка с именами атрибутов. По умолчанию:`true`. |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance) { get; set; } | Допуск, используемый для линеаризации геометрии кривых. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel)который будет применен к координате M при добавлении геометрии к[`VectorLayer`](../../aspose.gis/vectorlayer)или когда они читаются из[`VectorLayer`](../../aspose.gis/vectorlayer). Значение по умолчанию:[`Exact`](../../aspose.gis/precisionmodel/exact). |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments) { get; set; } | Определяет, удаляются ли точки, лежащие на одном сегменте в каждой геометрии. По умолчанию`false`. |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance) { get; set; } | Определяет расстояние для[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments). По умолчанию`0`. |
| [StartLineNumber](../../aspose.gis.formats.csv/csvoptions/startlinenumber) { get; set; } | Получает или задает отсчитываемый от нуля номер строки, которая будет первой при чтении данных. По умолчанию 0. |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite) { get; set; } | Определяет, следует ли проверять геометрию при ее добавлении в слой. Если установлено значение`true`,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid)вызывается для каждого геометрия, когда она добавляется к слою, и если проверка не пройдена ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid)is`false`),TВыбрасывается:Aspose.Gis.GisException. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines) { get; set; } | Определяет, разрешено ли преобразование полигона или мультиполигона в строку. По умолчанию`false`. |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel)который будет применяться к координатам X и Y когда геометрия добавляются в[`VectorLayer`](../../aspose.gis/vectorlayer)или когда они считываются из[`VectorLayer`](../../aspose.gis/vectorlayer). Значение по умолчанию:[`Exact`](../../aspose.gis/precisionmodel/exact). |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel)который будет применен к координате Z при добавлении геометрии к[`VectorLayer`](../../aspose.gis/vectorlayer)или когда они читаются из[`VectorLayer`](../../aspose.gis/vectorlayer). Значение по умолчанию:[`Exact`](../../aspose.gis/precisionmodel/exact). |

### Смотрите также

* class [DriverOptions](../../aspose.gis/driveroptions)
* пространство имен [Aspose.Gis.Formats.Csv](../../aspose.gis.formats.csv)
* сборка [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
