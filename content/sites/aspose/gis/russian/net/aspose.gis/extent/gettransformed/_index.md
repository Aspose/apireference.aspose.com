---
title: Extent.GetTransformed
second_title: Справочник по Aspose.GIS for .NET API
description: Extent метод. Возвращает новый экстент в указанномSpatialReferenceSystem который содержит этот экстент.
type: docs
weight: 150
url: /ru/net/aspose.gis/extent/gettransformed/
---
## Extent.GetTransformed method

Возвращает новый экстент в указанном[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) который содержит этот экстент.

```csharp
public Extent GetTransformed(SpatialReferenceSystem targetSrs)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| targetSrs | SpatialReferenceSystem | [`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) превратиться в. |

### Возвращаемое значение

Результат преобразования этого экстента в указанный SRS.

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Аргумент`null` . |
| NotSupportedException | Преобразование в предоставленную SRS не поддерживается. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | Преобразование не удалось. |
| InvalidOperationException | [`SpatialReferenceSystem`](../spatialreferencesystem/) этого размера`null` . |

### Смотрите также

* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Extent](../)
* пространство имен [Aspose.Gis](../../extent/)
* сборка [Aspose.GIS](../../../)


