---
title: SpatialReferenceSystem.CreateFromEpsg
second_title: Справочник по Aspose.GIS for .NET API
description: SpatialReferenceSystem метод. Создать систему пространственной привязки на основе указанного кода EPSG.
type: docs
weight: 10
url: /ru/net/aspose.gis.spatialreferencing/spatialreferencesystem/createfromepsg/
---
## SpatialReferenceSystem.CreateFromEpsg method

Создать систему пространственной привязки на основе указанного кода EPSG.

```csharp
public static SpatialReferenceSystem CreateFromEpsg(int epsg)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| epsg | Int32 | Код EPSG системы пространственной отсчета. |

### Возвращаемое значение

Новая система пространственной привязки с указанным кодом EPSG.

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentOutOfRangeException | Аргумент не положительный. |
| NotSupportedException | Указанный код EPSG неизвестен. |

### Смотрите также

* method [TryCreateFromEpsg](../trycreatefromepsg/)
* class [SpatialReferenceSystem](../)
* пространство имен [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* сборка [Aspose.GIS](../../../)


