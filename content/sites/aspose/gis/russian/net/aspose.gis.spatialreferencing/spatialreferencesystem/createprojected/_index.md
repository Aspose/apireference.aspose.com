---
title: SpatialReferenceSystem.CreateProjected
second_title: Справочник по Aspose.GIS for .NET API
description: SpatialReferenceSystem метод. Создать проекцию SRS из пользовательских параметров.
type: docs
weight: 380
url: /ru/net/aspose.gis.spatialreferencing/spatialreferencesystem/createprojected/
---
## SpatialReferenceSystem.CreateProjected method

Создать проекцию SRS из пользовательских параметров.

```csharp
public static ProjectedSpatialReferenceSystem CreateProjected(
    ProjectedSpatialReferenceSystemParameters parameters, Identifier identifier = null)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| parameters | ProjectedSpatialReferenceSystemParameters | Параметры для создания. |
| identifier | Identifier | Идентификатор, который будет прикреплен к SRS. Добавление идентификатора не изменит другие параметры SRS. Вы сами должны обеспечить согласованность идентификатора и параметров SRS. |

### Возвращаемое значение

Новая проектируемая СГД.

### Исключения

| исключение | условие |
| --- | --- |
| InvalidOperationException | База SRS в параметрах есть`null` . Метод проекции в параметрах есть`null` . |

### Смотрите также

* class [ProjectedSpatialReferenceSystem](../../projectedspatialreferencesystem/)
* class [ProjectedSpatialReferenceSystemParameters](../../projectedspatialreferencesystemparameters/)
* class [Identifier](../../identifier/)
* class [SpatialReferenceSystem](../)
* пространство имен [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* сборка [Aspose.GIS](../../../)


