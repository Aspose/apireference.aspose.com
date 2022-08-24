---
title: VerticalSpatialReferenceSystem
second_title: Справочник по Aspose.GIS for .NET API
description: Вертикальная SRS  это одномерная SRS описывающая координаты высоты.
type: docs
weight: 2210
url: /ru/net/aspose.gis.spatialreferencing/verticalspatialreferencesystem/
---
## VerticalSpatialReferenceSystem class

Вертикальная SRS — это одномерная SRS, описывающая координаты высоты.

```csharp
public class VerticalSpatialReferenceSystem : SpatialReferenceSystem
```

## Характеристики

| Имя | Описание |
| --- | --- |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound) { get; } | Возвращает этот SRS, преобразованный в[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem) . Использовать[`IsCompound`](../spatialreferencesystem/iscompound) чтобы узнать, возможно ли преобразование. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric) { get; } | Возвращает этот SRS, преобразованный в[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem) . Использовать[`Type`](../spatialreferencesystem/type) чтобы узнать, возможно ли преобразование. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic) { get; } | Возвращает этот SRS, преобразованный в[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem) . Использовать[`Type`](../spatialreferencesystem/type) чтобы узнать, возможно ли преобразование. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal) { get; } | Возвращает этот SRS, преобразованный в[`LocalSpatialReferenceSystem`](../localspatialreferencesystem) . Использовать[`Type`](../spatialreferencesystem/type) чтобы узнать, возможно ли преобразование. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected) { get; } | Возвращает этот SRS, преобразованный в[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem) . Использовать[`Type`](../spatialreferencesystem/type) чтобы узнать, возможно ли преобразование. |
| override [AsVertical](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/asvertical) { get; } | Возвращает этот SRS. |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/dimensionscount) { get; } | Возвращает 1, поскольку вертикальная SRS всегда одномерна. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode) { get; } | Если этот идентификатор объекта является идентификатором EPSG - вернуть его код. В противном случае - вернуть -1. |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/geographicdatum) { get; } | ВыбрасываетInvalidOperationException , так как вертикальная SRS не имеет географической системы отсчета. |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/hasgeographicdatum) { get; } | Возвращает`false` , так как вертикальная SRS не имеет географической системы отсчета. |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/hasprimemeridian) { get; } | Возвращает`false` , поскольку вертикальный SRS не имеет нулевого меридиана. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier) { get; } | Идентификатор этого идентифицируемого объекта. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound) { get; } | Возвращает, является ли эта SRS составной (объединение двух SRS). Допустимыми считаются следующие комбинации SRS в составной SRS: Географическая SRS + Вертикальная SRS, в этом случае тип составной SRS будетGeographic . Проекционная SRS + Вертикальная SRS, в этом случае тип составной SRS будетProjected . Если комбинация SRS различается, тип составной SRS будетUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle) { get; } | Возвращает, является ли эта SRS одиночной (не объединением двух SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid) { get; } | То же, что и[`Validate`](../spatialreferencesystem/validate) , но не возвращать сообщение об ошибке. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name) { get; } | Имя этого объекта. |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/primemeridian) { get; } | ВыбрасываетInvalidOperationException , поскольку вертикальный SRS не имеет нулевого меридиана. |
| override [Type](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/type) { get; } | ВозвратVertical . |
| [VerticalDatum](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/verticaldatum) { get; } | Datum, который используется в этом SRS. |
| [VerticalUnit](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/verticalunit) { get; } | Единица, используемая в этом SRS. |

## Методы

| Имя | Описание |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto)(SpatialReferenceSystem) | Создает преобразование из этого`SpatialReferenceSystem` другому`SpatialReferenceSystem` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt)() | Возвращает представление этой SRS в виде строки WKT. Результирующая строка WKT будет соответствовать спецификации OGC 01-009, обычно именуемой "WKT1". |
| override [GetAxis](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/getaxis)(int) | Получить[`Axis`](../axis) который описывает размерность. |
| override [GetUnit](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/getunit)(int) | Получить[`Unit`](../unit)размера. |
| override [IsEquivalent](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/isequivalent)(SpatialReferenceSystem) | Определяет, эквивалентен ли этот SRS другим SRS. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring)() | Возвращает строку, которая представляет текущий объект. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Создает преобразование из этого`SpatialReferenceSystem` другому`SpatialReferenceSystem` . |
| override [Validate](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/validate)(out string) | Определите, действительна ли эта SRS. Видеть[`Validate`](../spatialreferencesystem/validate) для описания действительности. |

### Смотрите также

* class [SpatialReferenceSystem](../spatialreferencesystem)
* пространство имен [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing)
* сборка [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
