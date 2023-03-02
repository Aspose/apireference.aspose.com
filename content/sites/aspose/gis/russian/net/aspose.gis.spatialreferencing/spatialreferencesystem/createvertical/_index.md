---
title: SpatialReferenceSystem.CreateVertical
second_title: Справочник по Aspose.GIS for .NET API
description: SpatialReferenceSystem метод. Создать вертикальную SRS.
type: docs
weight: 390
url: /ru/net/aspose.gis.spatialreferencing/spatialreferencesystem/createvertical/
---
## SpatialReferenceSystem.CreateVertical method

Создать вертикальную SRS.

```csharp
public static VerticalSpatialReferenceSystem CreateVertical(string name, 
    VerticalDatum verticalDatum, Unit verticalUnit = null, Axis verticalAxis = null, 
    Identifier identifier = null)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| name | String | Название СРС. Если`null` . |
| verticalDatum | VerticalDatum | Datum для использования в SRS. |
| verticalUnit | Unit | Единица, используемая в SRS. Если`null` ,[`Meter`](../../unit/meter/) будет использоваться. |
| verticalAxis | Axis | Ось с направлением "вверх" или "вниз", для использования в SRS. Если`null` , будет использоваться ось с направлением вверх. |
| identifier | Identifier | Идентификатор, который будет прикреплен к SRS. Добавление идентификатора не изменит другие параметры SRS. Вы сами должны обеспечить согласованность идентификатора и параметров SRS. |

### Возвращаемое значение

Новая вертикальная SRS.

### Исключения

| исключение | условие |
| --- | --- |
| InvalidOperationException | *verticalAxis* направление не вверх или вниз. |
| ArgumentNullException | Некоторые из обязательных параметров имеют значение null. |

### Смотрите также

* class [VerticalSpatialReferenceSystem](../../verticalspatialreferencesystem/)
* class [VerticalDatum](../../verticaldatum/)
* class [Unit](../../unit/)
* class [Axis](../../axis/)
* class [Identifier](../../identifier/)
* class [SpatialReferenceSystem](../)
* пространство имен [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* сборка [Aspose.GIS](../../../)


