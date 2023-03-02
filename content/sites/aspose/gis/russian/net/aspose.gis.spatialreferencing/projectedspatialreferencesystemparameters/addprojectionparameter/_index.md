---
title: ProjectedSpatialReferenceSystemParameters.AddProjectionParameter
second_title: Справочник по Aspose.GIS for .NET API
description: ProjectedSpatialReferenceSystemParameters метод. Добавляет параметр проекции к этому SRS. Если параметр с таким именем уже был добавлен  обновите его.
type: docs
weight: 100
url: /ru/net/aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/addprojectionparameter/
---
## ProjectedSpatialReferenceSystemParameters.AddProjectionParameter method

Добавляет параметр проекции к этому SRS. Если параметр с таким именем уже был добавлен - обновите его.

```csharp
public void AddProjectionParameter(string parameterName, double value)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| parameterName | String | Имя параметра проекции. |
| value | Double | Значение параметра. Единица стоимости должна быть в[`LinearUnit`](../linearunit/) или[`AngularUnit`](../../geographicspatialreferencesystem/angularunit/) из[`Base`](../base/) . |

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | *parameterName* нулевой. |

### Смотрите также

* class [ProjectedSpatialReferenceSystemParameters](../)
* пространство имен [Aspose.Gis.SpatialReferencing](../../projectedspatialreferencesystemparameters/)
* сборка [Aspose.GIS](../../../)


