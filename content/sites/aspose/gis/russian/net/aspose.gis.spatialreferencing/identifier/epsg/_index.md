---
title: Identifier.Epsg
second_title: Справочник по Aspose.GIS for .NET API
description: Identifier метод. Создает новый идентификатор который представляет идентификатор EPSG с кодомepsgCode .
type: docs
weight: 20
url: /ru/net/aspose.gis.spatialreferencing/identifier/epsg/
---
## Identifier.Epsg method

Создает новый идентификатор, который представляет идентификатор EPSG с кодом*epsgCode* .

```csharp
public static Identifier Epsg(int epsgCode)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| epsgCode | Int32 | EPSG-код. |

### Возвращаемое значение

Новый идентификатор с[`AuthorityName`](../authorityname/) "ЭПСГ" и[`AuthorityUniqueIdentifier`](../authorityuniqueidentifier/)*epsgCode* . Если*epsgCode* меньше 0 - возврат`null` ;

### Смотрите также

* class [Identifier](../)
* пространство имен [Aspose.Gis.SpatialReferencing](../../identifier/)
* сборка [Aspose.GIS](../../../)


