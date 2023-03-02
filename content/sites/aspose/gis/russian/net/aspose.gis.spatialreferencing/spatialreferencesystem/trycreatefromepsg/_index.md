---
title: SpatialReferenceSystem.TryCreateFromEpsg
second_title: Справочник по Aspose.GIS for .NET API
description: SpatialReferenceSystem метод. Создать систему пространственной привязки на основе указанного кода EPSG.
type: docs
weight: 400
url: /ru/net/aspose.gis.spatialreferencing/spatialreferencesystem/trycreatefromepsg/
---
## SpatialReferenceSystem.TryCreateFromEpsg method

Создать систему пространственной привязки на основе указанного кода EPSG.

```csharp
public static bool TryCreateFromEpsg(int epsg, out SpatialReferenceSystem value)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| epsg | Int32 | Код EPSG системы пространственной отсчета. |
| value | SpatialReferenceSystem& | Когда этот метод возвращает`true` , содержит SRS с указанным кодом EPSG; в противном случае содержит`null` . |

### Возвращаемое значение

`true` известен ли указанный код EPSG и создана SRS;`false` в противном случае.

### Смотрите также

* method [CreateFromEpsg](../createfromepsg/)
* class [SpatialReferenceSystem](../)
* пространство имен [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* сборка [Aspose.GIS](../../../)


