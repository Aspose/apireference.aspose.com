---
title: CompoundSpatialReferenceSystem
second_title: Справочник по Aspose.GIS for .NET API
description: Составная SRS объединяет две базовые SRS ни одна из которых не может быть составной.
type: docs
weight: 1960
url: /ru/net/aspose.gis.spatialreferencing/compoundspatialreferencesystem/
---
## CompoundSpatialReferenceSystem class

Составная SRS объединяет две базовые SRS, ни одна из которых не может быть составной.

```csharp
public class CompoundSpatialReferenceSystem : SpatialReferenceSystem
```

## Характеристики

| Имя | Описание |
| --- | --- |
| override [AsCompound](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/ascompound) { get; } | Вернуть это. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric) { get; } | Возвращает этот SRS, преобразованный в[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem) . Использовать[`Type`](../spatialreferencesystem/type) чтобы узнать, возможно ли преобразование. |
| override [AsGeographic](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/asgeographic) { get; } | Возвращает географическое представление этой SRS. Если эта составная SRS действительно представляет собой географическую SRS, результатом будет трехмерная географическая SRS (с измерениями долготы, широты и высоты). В противном случае будет выдано исключение. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal) { get; } | Возвращает этот SRS, преобразованный в[`LocalSpatialReferenceSystem`](../localspatialreferencesystem) . Использовать[`Type`](../spatialreferencesystem/type) чтобы узнать, возможно ли преобразование. |
| override [AsProjected](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/asprojected) { get; } | Возвращает спроецированное представление этой SRS. Если эта составная SRS действительно представляет спроецированную SRS, результатом будет трехмерная спроецированная SRS (с размерами X, Y, высоты). В противном случае будет выдано исключение. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical) { get; } | Возвращает этот SRS, преобразованный в[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem) . Использовать[`Type`](../spatialreferencesystem/type) чтобы узнать, возможно ли преобразование. |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/dimensionscount) { get; } | Количество измерений. Для составного SRS это сумма количества измерений базовой SRS. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode) { get; } | Если этот идентификатор объекта является идентификатором EPSG - вернуть его код. В противном случае - вернуть -1. |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/geographicdatum) { get; } | Возвращает географические данные этой SRS. Если оба[`Head`](./head) а также[`Tail`](./tail) иметь географические данные - вернуть географические данные головы. |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/hasgeographicdatum) { get; } | Составные SRS имеют географическую датум, если какая-либо из базовых SRS имеет географическую датум. |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/hasprimemeridian) { get; } | Составной SRS имеет нулевой меридиан, если какой-либо из базовых SRS имеет нулевой меридиан. |
| [Head](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/head) { get; } | Первый базовый SRS. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier) { get; } | Идентификатор этого идентифицируемого объекта. |
| override [IsCompound](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/iscompound) { get; } | Возвращает`true` . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle) { get; } | Возвращает, является ли эта SRS одиночной (не объединением двух SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid) { get; } | То же, что и[`Validate`](../spatialreferencesystem/validate) , но не возвращать сообщение об ошибке. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name) { get; } | Имя этого объекта. |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/primemeridian) { get; } | Вернуть нулевой меридиан этой SRS. Если оба[`Head`](./head) а также[`Tail`](./tail) Иметь нулевой меридиан - вернуть нулевой меридиан головы. |
| [Tail](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/tail) { get; } | Второй базовый SRS. |
| override [Type](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/type) { get; } | Тип данного соединения SRS. Может бытьGeographicif эта составная SRS представляет собой комбинацию географической и вертикальной SRS, илиProjected if эта составная SRS представляет собой комбинацию проекционной и вертикальной SRS. |

## Методы

| Имя | Описание |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto)(SpatialReferenceSystem) | Создает преобразование из этого`SpatialReferenceSystem` другому`SpatialReferenceSystem` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt)() | Возвращает представление этой SRS в виде строки WKT. Результирующая строка WKT будет соответствовать спецификации OGC 01-009, обычно именуемой "WKT1". |
| override [GetAxis](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/getaxis)(int) | Получить[`Axis`](../axis) который описывает размерность. |
| override [GetUnit](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/getunit)(int) | Получить[`Unit`](../unit)размера. |
| override [IsEquivalent](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/isequivalent)(SpatialReferenceSystem) | Определяет, эквивалентен ли этот SRS другим SRS. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring)() | Возвращает строку, которая представляет текущий объект. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Создает преобразование из этого`SpatialReferenceSystem` другому`SpatialReferenceSystem` . |
| override [Validate](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/validate)(out string) | Определите, действительна ли эта SRS. Видеть[`Validate`](../spatialreferencesystem/validate) для описания действительности. |

### Смотрите также

* class [SpatialReferenceSystem](../spatialreferencesystem)
* пространство имен [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing)
* сборка [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
