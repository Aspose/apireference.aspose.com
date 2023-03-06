---
title: SpatialReferenceSystem.CreateCompound
second_title: Справочник по Aspose.GIS for .NET API
description: SpatialReferenceSystem метод. Создать составной SRS.
type: docs
weight: 340
url: /ru/net/aspose.gis.spatialreferencing/spatialreferencesystem/createcompound/
---
## SpatialReferenceSystem.CreateCompound method

Создать составной SRS.

```csharp
public static CompoundSpatialReferenceSystem CreateCompound(string name, 
    SpatialReferenceSystem head, SpatialReferenceSystem tail, Identifier identifier = null)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| name | String | Название новой SRS. |
| head | SpatialReferenceSystem | Головка СГД новой СГД. |
| tail | SpatialReferenceSystem | Хвост SRS нового SRS. |
| identifier | Identifier | Идентификатор, который будет прикреплен к SRS. Добавление идентификатора не изменит другие параметры SRS. Вы сами должны обеспечить согласованность идентификатора и параметров SRS. |

### Возвращаемое значение

Новый компаунд SRS.

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Любой аргумент, кроме*identifier* является`null` . |
| InvalidOperationException | *head* или*tail* сами являются составными SRS. |

### Смотрите также

* class [CompoundSpatialReferenceSystem](../../compoundspatialreferencesystem/)
* class [Identifier](../../identifier/)
* class [SpatialReferenceSystem](../)
* пространство имен [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* сборка [Aspose.GIS](../../../)


