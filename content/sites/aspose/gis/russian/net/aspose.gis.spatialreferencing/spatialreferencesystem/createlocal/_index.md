---
title: SpatialReferenceSystem.CreateLocal
second_title: Справочник по Aspose.GIS for .NET API
description: SpatialReferenceSystem метод. Создать локальную SRS.
type: docs
weight: 370
url: /ru/net/aspose.gis.spatialreferencing/spatialreferencesystem/createlocal/
---
## SpatialReferenceSystem.CreateLocal method

Создать локальную SRS.

```csharp
public static LocalSpatialReferenceSystem CreateLocal(string name, LocalDatum datum, Unit unit, 
    ICollection<Axis> axises, Identifier identifier = null)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| name | String | Название СРС. |
| datum | LocalDatum | Datum для использования в SRS. |
| unit | Unit | Единица, используемая в SRS. |
| axises | ICollection`1 | Оси для использования в SRS. Должен быть не пустым |
| identifier | Identifier | Идентификатор, который будет прикреплен к SRS. Добавление идентификатора не изменит другие параметры SRS. Вы сами должны обеспечить согласованность идентификатора и параметров SRS. |

### Возвращаемое значение

Новая местная СГД.

### Исключения

| исключение | условие |
| --- | --- |
| InvalidOperationException | *axises* пусто. |
| ArgumentNullException | Любой аргумент, кроме*identifier* нулевой. |

### Смотрите также

* class [LocalSpatialReferenceSystem](../../localspatialreferencesystem/)
* class [LocalDatum](../../localdatum/)
* class [Unit](../../unit/)
* class [Axis](../../axis/)
* class [Identifier](../../identifier/)
* class [SpatialReferenceSystem](../)
* пространство имен [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* сборка [Aspose.GIS](../../../)


