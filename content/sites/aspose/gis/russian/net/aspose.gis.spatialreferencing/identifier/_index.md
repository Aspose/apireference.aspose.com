---
title: Class Identifier
second_title: Справочник по Aspose.GIS for .NET API
description: Aspose.Gis.SpatialReferencing.Identifier сорт. Представляет идентификатор  ссылку на внешнее описание объекта. Если вы создаете SRS из WKTIdentifier соответствует ключевому слову AUTHORITY.
type: docs
weight: 2160
url: /ru/net/aspose.gis.spatialreferencing/identifier/
---
## Identifier class

Представляет идентификатор - ссылку на внешнее описание объекта. Если вы создаете SRS из WKT,`Identifier` соответствует ключевому слову "AUTHORITY".

```csharp
public class Identifier : IEquatable<Identifier>
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [Identifier](identifier/)(string, string) | Создать новый экземпляр. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [AuthorityName](../../aspose.gis.spatialreferencing/identifier/authorityname/) { get; } | Имя органа, давшего[`AuthorityUniqueIdentifier`](./authorityuniqueidentifier/) . |
| [AuthorityUniqueIdentifier](../../aspose.gis.spatialreferencing/identifier/authorityuniqueidentifier/) { get; } | Уникальный способ представления объекта в[`AuthorityName`](./authorityname/) . |

## Методы

| Имя | Описание |
| --- | --- |
| static [Epsg](../../aspose.gis.spatialreferencing/identifier/epsg/)(int) | Создает новый идентификатор, который представляет идентификатор EPSG с кодом*epsgCode* . |
| [Equals](../../aspose.gis.spatialreferencing/identifier/equals/#equals)(Identifier) | Указывает, равен ли текущий объект другому объекту того же типа. |
| override [Equals](../../aspose.gis.spatialreferencing/identifier/equals/#equals_1)(object) | Определяет, равен ли указанный объект текущему объекту. |
| [GetEpsgCode](../../aspose.gis.spatialreferencing/identifier/getepsgcode/)() | Если этот объект представляет действительный идентификатор EPSG (например, имя органа власти "EPSG" и уникальный идентификатор органа власти целое число), - вернуть его. В противном случае - вернуть -1. |
| override [GetHashCode](../../aspose.gis.spatialreferencing/identifier/gethashcode/)() | Служит хеш-функцией по умолчанию. |
| [operator ==](../../aspose.gis.spatialreferencing/identifier/op_equality/) | Реализует оператор ==. |
| [operator !=](../../aspose.gis.spatialreferencing/identifier/op_inequality/) | Реализует оператор !=. |

### Примеры

WGS 84 Пространственная система отсчета имеет код EPSG 4326, поэтому может содержать идентификатор: Эллипсоид WGS 84 имеет код EPSG 7030 и может содержать идентификатор:

```csharp
new  {  = "EPSG",  = 4326 };
```

```csharp
new  {  = "EPSG",  = 7030 };
```

### Смотрите также

* пространство имен [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* сборка [Aspose.GIS](../../)


