---
title: CompoundSpatialReferenceSystem
second_title: Справочник по Aspose.GIS for .NET API
description: Составной SRS объединяет два базовых SRS ни один из которых не может быть составным.
type: docs
weight: 1950
url: /ru/net/aspose.gis.spatialreferencing/compoundspatialreferencesystem/
---
## CompoundSpatialReferenceSystem class

Составной SRS объединяет два базовых SRS, ни один из которых не может быть составным.

```csharp
public class CompoundSpatialReferenceSystem : SpatialReferenceSystem
```

## Характеристики

| Имя | Описание |
| --- | --- |
| override [AsCompound](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/ascompound) { get; } | Верните это. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric) { get; } | Возвращает этот SRS, преобразованный в[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem). Используйте[`Type`](../spatialreferencesystem/type), чтобы узнать, возможно ли преобразование. |
| override [AsGeographic](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/asgeographic) { get; } | Вернуть географическое представление этой SRS. Если эта составная SRS действительно представляет собой географическую SRS, результатом будет трехмерная географическая SRS (с измерениями долготы, широты и высоты). В противном случае будет выброшено исключение. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal) { get; } | Возвращает этот SRS, преобразованный в[`LocalSpatialReferenceSystem`](../localspatialreferencesystem). Используйте[`Type`](../spatialreferencesystem/type), чтобы узнать, возможно ли преобразование. |
| override [AsProjected](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/asprojected) { get; } | Возвратите спроецированное представление этого SRS. Если эта составная SRS действительно представляет спроецированную SRS, результатом будет трехмерная спроецированная SRS (с размерами X, Y, высоты). В противном случае будет выброшено исключение. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical) { get; } | Возвращает этот SRS, преобразованный в[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem). Используйте[`Type`](../spatialreferencesystem/type), чтобы узнать, возможно ли преобразование. |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/dimensionscount) { get; } | Количество измерений. Для составной SRS это сумма количества измерений базовой SRS. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode) { get; } | Если этот идентификатор объекта является идентификатором EPSG - вернуть его код. В противном случае - вернуть -1. |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/geographicdatum) { get; } | Возвращает географические данные этой SRS. Если оба[`Head`](./head)и[`Tail`](./tail)имеют географические датум - вернуть географические данные головы. |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/hasgeographicdatum) { get; } | Составные SRS имеют географическую датум, если любая из лежащих в основе SRS имеет географическую датум. |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/hasprimemeridian) { get; } | Составной SRS имеет нулевой меридиан, если любой из лежащих в его основе SRS имеет нулевой меридиан. |
| [Head](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/head) { get; } | Первый базовый SRS. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier) { get; } | Идентификатор этого идентифицируемого объекта. |
| override [IsCompound](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/iscompound) { get; } | Возвращает`true`. |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle) { get; } | Возвращает, является ли этот SRS одиночным (не объединением двух SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid) { get; } | То же, что и[`Validate`](../spatialreferencesystem/validate), но не возвращает сообщение об ошибке . |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name) { get; } | Имя этого объекта. |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/primemeridian) { get; } | Возврат нулевого меридиана этого SRS. Если оба[`Head`](./head)и[`Tail`](./tail)имеют простое число меридиан - обратный нулевой меридиан головы. |
| [Tail](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/tail) { get; } | Второй базовый SRS. |
| override [Type](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/type) { get; } | Тип этого соединения SRS. Может бытьGeographicif эта составная SRS является комбинацией географической и вертикальной SRS, илиProjectedif этот составной SRS представляет собой комбинацию проекционного и вертикального SRS. |

## Методы

| Имя | Описание |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto)(SpatialReferenceSystem) | Создает преобразование из этой` SpatialReferenceSystem` в другую` SpatialReferenceSystem` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt)() | Возвращает представление этого SRS в виде строки WKT. Результирующая строка WKT будет соответствовать спецификации OGC 01-009, обычно называемой "WKT1". |
| override [GetAxis](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/getaxis)(int) | Get[`Axis`](../axis), описывающий размерность. |
| override [GetUnit](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/getunit)(int) | Get[`Unit`](../unit)измерения. |
| override [IsEquivalent](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/isequivalent)(SpatialReferenceSystem) | Определяет, эквивалентен ли этот SRS другим SRS.. |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring)() | Возвращает строку, представляющую текущий объект. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Создает преобразование из этой` SpatialReferenceSystem` в другую` SpatialReferenceSystem` . |
| override [Validate](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/validate)(out string) | Определите, действителен ли этот SRS. См.[`Validate`](../spatialreferencesystem/validate)для описания достоверности. |

### Смотрите также

* class [SpatialReferenceSystem](../spatialreferencesystem)
* пространство имен [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing)
* сборка [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
