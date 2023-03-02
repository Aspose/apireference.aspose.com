---
title: Class Unit
second_title: Справочник по Aspose.GIS for .NET API
description: Aspose.Gis.SpatialReferencing.Unit сорт. Представляет единицу измерения.
type: docs
weight: 2290
url: /ru/net/aspose.gis.spatialreferencing/unit/
---
## Unit class

Представляет единицу измерения.

```csharp
public class Unit : IdentifiableObject
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [Unit](unit/)(string, double, Identifier) | Создать новый экземпляр. |

## Характеристики

| Имя | Описание |
| --- | --- |
| static [Degree](../../aspose.gis.spatialreferencing/unit/degree/) { get; } | Получите единицу измерения, представляющую градусы. |
| static [Meter](../../aspose.gis.spatialreferencing/unit/meter/) { get; } | Получите Unit, который представляет метры. |
| static [Radian](../../aspose.gis.spatialreferencing/unit/radian/) { get; } | Получить единицу измерения, представляющую радианы. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Если этот идентификатор объекта является идентификатором EPSG - вернуть его код. В противном случае - вернуть -1. |
| [Factor](../../aspose.gis.spatialreferencing/unit/factor/) { get; } | Коэффициент в метрах, если это единица длины, коэффициент в радианах, если это единица измерения угла. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Идентификатор этого идентифицируемого объекта. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Имя этого объекта. |

## Методы

| Имя | Описание |
| --- | --- |
| [Apply](../../aspose.gis.spatialreferencing/unit/apply/)(double) | Преобразует аргумент в единицу измерения, описанную данным экземпляром. |
| [Deapply](../../aspose.gis.spatialreferencing/unit/deapply/)(double) | Преобразует аргумент из единиц, описываемых данным экземпляром, в радианы или метры. |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Возвращает строку, которая представляет текущий объект. |

### Смотрите также

* class [IdentifiableObject](../identifiableobject/)
* пространство имен [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* сборка [Aspose.GIS](../../)


