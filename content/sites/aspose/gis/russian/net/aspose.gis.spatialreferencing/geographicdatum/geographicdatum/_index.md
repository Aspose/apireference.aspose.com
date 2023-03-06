---
title: GeographicDatum.GeographicDatum
second_title: Справочник по Aspose.GIS for .NET API
description: GeographicDatum строитель. Создает новый экземпляр.
type: docs
weight: 10
url: /ru/net/aspose.gis.spatialreferencing/geographicdatum/geographicdatum/
---
## GeographicDatum constructor

Создает новый экземпляр.

```csharp
public GeographicDatum(string name, Ellipsoid ellipsoid, 
    BursaWolfParameters toWgs84Parameters = null, Identifier identifier = null)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| name | String | Имя этого датума. |
| ellipsoid | Ellipsoid | Эллипсоид этого датума. Не может быть нулевым. |
| toWgs84Parameters | BursaWolfParameters | Параметры, которые можно указать в формуле bursa wolf для преобразования координат в этой системе отсчета в координаты от точки WGS84. null, для ToWgs84 будет установлено значение[`IsNull`](../../bursawolfparameters/isnull/) параметры. |
| identifier | Identifier | Идентификатор этого элемента данных. |

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | ellipsoid нулевой. |

### Смотрите также

* class [Ellipsoid](../../ellipsoid/)
* class [BursaWolfParameters](../../bursawolfparameters/)
* class [Identifier](../../identifier/)
* class [GeographicDatum](../)
* пространство имен [Aspose.Gis.SpatialReferencing](../../geographicdatum/)
* сборка [Aspose.GIS](../../../)


