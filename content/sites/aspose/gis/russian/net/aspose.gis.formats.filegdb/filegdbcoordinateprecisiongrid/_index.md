---
title: Class FileGdbCoordinatePrecisionGrid
second_title: Справочник по Aspose.GIS for .NET API
description: Aspose.Gis.Formats.FileGdb.FileGdbCoordinatePrecisionGrid сорт. Сетка точности координат внутри слоя FileGDB.
type: docs
weight: 250
url: /ru/net/aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/
---
## FileGdbCoordinatePrecisionGrid class

Сетка точности координат внутри слоя FileGDB.

```csharp
public sealed class FileGdbCoordinatePrecisionGrid
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [FileGdbCoordinatePrecisionGrid](filegdbcoordinateprecisiongrid/)() | Конструктор по умолчанию. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [MOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/morigin/) { get; set; } | Получает или задает начало координат М. Если установлено`null` используется значение по умолчанию. |
| [MScale](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/mscale/) { get; set; } | Получает или задает масштаб М-координаты. Если установлено`null` используется значение по умолчанию. |
| [XOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/xorigin/) { get; set; } | Получает или задает начало координаты X. Если установлено`null` используется значение по умолчанию. |
| [XYScale](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/xyscale/) { get; set; } | Получает или задает масштаб координат X и Y. Если установлено`null` используется значение по умолчанию. |
| [YOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/yorigin/) { get; set; } | Получает или задает начало координаты Y. Если установлено`null` используется значение по умолчанию. |
| [ZOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/zorigin/) { get; set; } | Получает или задает начало координаты Z. Если установлено`null` используется значение по умолчанию. |
| [ZScale](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/zscale/) { get; set; } | Получает или задает масштаб координаты Z. Если установлено`null` используется значение по умолчанию. |

## Методы

| Имя | Описание |
| --- | --- |
| static [CreateFromRectangle](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/createfromrectangle/)(IPoint, IPoint) | Создает новый`FileGdbCoordinatePrecisionGrid` так что все значения внутри прямоугольника могут быть представлены. |

### Примечания

Сетка точности координат определяет действительный домен и разрешение координат в слое FileGDB. Начало определяет путь к сетке точности координат в пространстве. Масштаб определяет разрешение (чем больше масштаб , тем точнее записываются значения). Точность сетки определяет допустимый диапазон значений координат: Каждая координата в[`VectorLayer`](../../aspose.gis/vectorlayer/)должны находиться в этом диапазоне. Координаты, выходящие за пределы диапазона, могут позже вызвать ошибки чтения и будут неправильно обработаны ArcGIS. Если вы не укажете какие-либо свойства (сохраните их`null` ) будут использоваться значения по умолчанию. Значения по умолчанию зависят от[`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) принадлежащий[`VectorLayer`](../../aspose.gis/vectorlayer/) . Для географических[`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) значения по умолчанию: Для проекции[`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) значения по умолчанию: где`XYДопуск` ,`ZДопуск` и`МТтолерантность` значения из[`FileGdbOptions`](../filegdboptions/) .

```csharp
XMin = XOrigin
YMin = YOrigin
ZMin = ZOrigin
MMin = MOrigin
XMax = XOrigin + 9e+15 / XYScale
YMax = YOrigin + 9e+15 / XYScale
ZMax = ZOrigin + 9e+15 / ZScale
MMax = MOrigin + 9e+15 / MScale
```

```csharp
XOrigin = -400
YOrigin = -400
ZOrigin = -1e5
MOrigin = -1e5
XYScale = 1e9
ZScale  = 1 / ZTolerance * 10
MScale  = 1 / MTolerance * 10
```

```csharp
XOrigin = -2147483647
YOrigin = -2147483647
ZOrigin = -1e5
MOrigin = -1e5
XYScale = 1 / XYTolerance * 10
ZScale  = 1 / ZTolerance  * 10
MScale  = 1 / MTolerance  * 10
```

### Смотрите также

* пространство имен [Aspose.Gis.Formats.FileGdb](../../aspose.gis.formats.filegdb/)
* сборка [Aspose.GIS](../../)


