---
title: GeocentricSpatialReferenceSystem
second_title: Справочник по Aspose.GIS for .NET API
description: Геоцентрическая SRS представляет собой трехмерную декартову SRS с началом в центре Земли.
type: docs
weight: 1980
url: /ru/net/aspose.gis.spatialreferencing/geocentricspatialreferencesystem/
---
## GeocentricSpatialReferenceSystem class

Геоцентрическая SRS представляет собой трехмерную декартову SRS с началом в центре Земли.

```csharp
public class GeocentricSpatialReferenceSystem : SpatialReferenceSystem
```

## Характеристики

| Имя | Описание |
| --- | --- |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound) { get; } | Возвращает этот SRS, преобразованный в[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem). Используйте[`IsCompound`](../spatialreferencesystem/iscompound), чтобы узнать, возможно ли преобразование. |
| override [AsGeocentric](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/asgeocentric) { get; } | Верните это. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic) { get; } | Возвращает этот SRS, преобразованный в[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem). Используйте[`Type`](../spatialreferencesystem/type), чтобы узнать, возможно ли преобразование. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal) { get; } | Возвращает этот SRS, преобразованный в[`LocalSpatialReferenceSystem`](../localspatialreferencesystem). Используйте[`Type`](../spatialreferencesystem/type), чтобы узнать, возможно ли преобразование. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected) { get; } | Возвращает этот SRS, преобразованный в[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem). Используйте[`Type`](../spatialreferencesystem/type), чтобы узнать, возможно ли преобразование. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical) { get; } | Возвращает этот SRS, преобразованный в[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem). Используйте[`Type`](../spatialreferencesystem/type), чтобы узнать, возможно ли преобразование. |
| [AxisesOrder](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/axisesorder) { get; } | Порядок осей в этом SRS. Если эта SRS недействительна и имеет неправильные направления осей,Invalidвозвращается. |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/dimensionscount) { get; } | Возвратите 3, так как геоцентрическая SRS всегда трехмерна. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode) { get; } | Если этот идентификатор объекта является идентификатором EPSG - вернуть его код. В противном случае - вернуть -1. |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/geographicdatum) { get; } | Возвращает географические данные этой SRS. |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/hasgeographicdatum) { get; } | Возврат`true`, так как геоцентрические SRS всегда имеют географическую датум. |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/hasprimemeridian) { get; } | Возврат`true`, так как геоцентрические СКИ всегда имеют нулевой меридиан. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier) { get; } | Идентификатор этого идентифицируемого объекта. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound) { get; } | Возвращает, является ли эта SRS составной (объединение двух SRS). Следующие комбинации СГД в составной ССО считаются допустимыми: Географическая ССО + Вертикальная ССО, в этом случае тип составной ССО будетGeographic. Проецируемая SRS + Вертикальная SRS, в этом случае тип составной SRS будетProjected. Если комбинация SRS различается, тип составной SRS будетUnknown. |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle) { get; } | Возвращает, является ли этот SRS одиночным (не объединением двух SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid) { get; } | То же, что и[`Validate`](../spatialreferencesystem/validate), но не возвращает сообщение об ошибке . |
| [LinearUnit](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/linearunit) { get; } | Блок, используемый в этом SRS. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name) { get; } | Имя этого объекта. |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/primemeridian) { get; } | Возврат нулевого меридиана этого SRS. |
| override [Type](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/type) { get; } | ВозвратGeocentric. |

## Методы

| Имя | Описание |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto)(SpatialReferenceSystem) | Создает преобразование из этой` SpatialReferenceSystem` в другую` SpatialReferenceSystem` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt)() | Возвращает представление этого SRS в виде строки WKT. Результирующая строка WKT будет соответствовать спецификации OGC 01-009, обычно называемой "WKT1". |
| override [GetAxis](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/getaxis)(int) | Get[`Axis`](../axis), описывающий размерность. |
| override [GetUnit](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/getunit)(int) | Get[`Unit`](../unit)измерения. |
| virtual [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent)(SpatialReferenceSystem) | Определяет, эквивалентен ли этот SRS другим SRS.. |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring)() | Возвращает строку, представляющую текущий объект. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Создает преобразование из этой` SpatialReferenceSystem` в другую` SpatialReferenceSystem` . |
| override [Validate](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/validate)(out string) | Определите, действителен ли этот SRS. См.[`Validate`](../spatialreferencesystem/validate)для описания достоверности. |

### Смотрите также

* class [SpatialReferenceSystem](../spatialreferencesystem)
* пространство имен [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing)
* сборка [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
