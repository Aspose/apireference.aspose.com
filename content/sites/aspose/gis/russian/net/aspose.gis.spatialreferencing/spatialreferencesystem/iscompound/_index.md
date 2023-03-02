---
title: SpatialReferenceSystem.IsCompound
second_title: Справочник по Aspose.GIS for .NET API
description: SpatialReferenceSystem свойство. Возвращает является ли эта SRS составной объединение двух SRS. Допустимыми считаются следующие комбинации SRS в составной SRS Географическая SRS  Вертикальная SRS в этом случае тип составной SRS будетGeographic . Проекционная SRS  Вертикальная SRS в этом случае тип составной SRS будетProjected . Если комбинация SRS различается тип составной SRS будетUnknown .
type: docs
weight: 130
url: /ru/net/aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/
---
## SpatialReferenceSystem.IsCompound property

Возвращает, является ли эта SRS составной (объединение двух SRS). Допустимыми считаются следующие комбинации SRS в составной SRS: Географическая SRS + Вертикальная SRS, в этом случае тип составной SRS будетGeographic . Проекционная SRS + Вертикальная SRS, в этом случае тип составной SRS будетProjected . Если комбинация SRS различается, тип составной SRS будетUnknown .

```csharp
public virtual bool IsCompound { get; }
```

### Примечания

В WKT это COMPD_CS.

### Смотрите также

* class [SpatialReferenceSystem](../)
* пространство имен [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* сборка [Aspose.GIS](../../../)


