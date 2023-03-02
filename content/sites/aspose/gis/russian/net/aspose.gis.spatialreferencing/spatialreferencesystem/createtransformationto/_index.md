---
title: SpatialReferenceSystem.CreateTransformationTo
second_title: Справочник по Aspose.GIS for .NET API
description: SpatialReferenceSystem метод. Создает преобразование из этогоSpatialReferenceSystem другомуSpatialReferenceSystem .
type: docs
weight: 180
url: /ru/net/aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/
---
## SpatialReferenceSystem.CreateTransformationTo method

Создает преобразование из этого`SpatialReferenceSystem` другому`SpatialReferenceSystem` .

```csharp
public SpatialReferenceSystemTransformation CreateTransformationTo(SpatialReferenceSystem targetSrs)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| targetSrs | SpatialReferenceSystem | Другой`SpatialReferenceSystem`. |

### Возвращаемое значение

Трансформация из этого`SpatialReferenceSystem` другому`SpatialReferenceSystem`.

### Исключения

| исключение | условие |
| --- | --- |
| NotSupportedException | Трансформация между этим`SpatialReferenceSystem` и аргумент не поддерживается. Это может произойти из-за того, что одна из проекций не поддерживается, или одна из систем[`VerticalSpatialReferenceSystem`](../../verticalspatialreferencesystem/) или [`LocalSpatialReferenceSystem`](../../localspatialreferencesystem/) . |
| [TransformationException](../../transformationexception/) | Не удалось создать преобразование из-за неверных параметров внутри`SpatialReferenceSystem` . |

### Смотрите также

* method [TryCreateTransformationTo](../trycreatetransformationto/)
* class [SpatialReferenceSystemTransformation](../../spatialreferencesystemtransformation/)
* class [SpatialReferenceSystem](../)
* пространство имен [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* сборка [Aspose.GIS](../../../)


