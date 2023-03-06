---
title: FileDriver.SupportsSpatialReferenceSystem
second_title: Справочник по Aspose.GIS for .NET API
description: FileDriver метод. Определяет поддерживается ли драйвером указанная система пространственной привязки.
type: docs
weight: 100
url: /ru/net/aspose.gis/filedriver/supportsspatialreferencesystem/
---
## FileDriver.SupportsSpatialReferenceSystem method

Определяет, поддерживается ли драйвером указанная система пространственной привязки.

```csharp
public abstract bool SupportsSpatialReferenceSystem(SpatialReferenceSystem spatialReferenceSystem)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| spatialReferenceSystem | SpatialReferenceSystem | Пространственная система отсчета. |

### Возвращаемое значение

Логическое значение, указывающее, поддерживается ли указанная система пространственной привязки драйвером. `null` считается поддерживаемым любым драйвером.

### Примечания

Если система пространственной привязки не поддерживается, и вы передаете ее в[`CreateLayer`](../createlayer/) метод, аNotSupportedException будет брошен.

### Смотрите также

* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* пространство имен [Aspose.Gis](../../filedriver/)
* сборка [Aspose.GIS](../../../)


