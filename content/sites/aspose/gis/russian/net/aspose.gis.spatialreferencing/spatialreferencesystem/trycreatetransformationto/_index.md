---
title: SpatialReferenceSystem.TryCreateTransformationTo
second_title: Справочник по Aspose.GIS for .NET API
description: SpatialReferenceSystem метод. Создает преобразование из этогоSpatialReferenceSystem другомуSpatialReferenceSystem .
type: docs
weight: 230
url: /ru/net/aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/
---
## SpatialReferenceSystem.TryCreateTransformationTo method

Создает преобразование из этого`SpatialReferenceSystem` другому`SpatialReferenceSystem` .

```csharp
public bool TryCreateTransformationTo(SpatialReferenceSystem targetSrs, 
    out SpatialReferenceSystemTransformation value)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| targetSrs | SpatialReferenceSystem | Другой`SpatialReferenceSystem`. |
| value | SpatialReferenceSystemTransformation& | Когда этот метод возвращает`true` , содержит преобразование; в противном случае содержит`null` . |

### Возвращаемое значение

Трансформация из этого`SpatialReferenceSystem` другому`SpatialReferenceSystem`.

`true` если преобразование было создано успешно;`false` в противном случае.

### Смотрите также

* method [CreateTransformationTo](../createtransformationto/)
* class [SpatialReferenceSystemTransformation](../../spatialreferencesystemtransformation/)
* class [SpatialReferenceSystem](../)
* пространство имен [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* сборка [Aspose.GIS](../../../)


