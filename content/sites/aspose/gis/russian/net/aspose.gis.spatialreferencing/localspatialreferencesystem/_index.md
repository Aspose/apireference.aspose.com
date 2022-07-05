---
title: LocalSpatialReferenceSystem
second_title: Справочник по Aspose.GIS for .NET API
description: Локальные координаты SRS относящиеся к какому-то объекту а не земле.
type: docs
weight: 2070
url: /ru/net/aspose.gis.spatialreferencing/localspatialreferencesystem/
---
## LocalSpatialReferenceSystem class

Локальные координаты SRS, относящиеся к какому-то объекту, а не земле.

```csharp
public class LocalSpatialReferenceSystem : SpatialReferenceSystem
```

## Характеристики

| Имя | Описание |
| --- | --- |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound) { get; } | Возвращает этот SRS, преобразованный в[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem). Используйте[`IsCompound`](../spatialreferencesystem/iscompound), чтобы узнать, возможно ли преобразование. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric) { get; } | Возвращает этот SRS, преобразованный в[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem). Используйте[`Type`](../spatialreferencesystem/type), чтобы узнать, возможно ли преобразование. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic) { get; } | Возвращает этот SRS, преобразованный в[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem). Используйте[`Type`](../spatialreferencesystem/type), чтобы узнать, возможно ли преобразование. |
| override [AsLocal](../../aspose.gis.spatialreferencing/localspatialreferencesystem/aslocal) { get; } | Верните это. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected) { get; } | Возвращает этот SRS, преобразованный в[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem). Используйте[`Type`](../spatialreferencesystem/type), чтобы узнать, возможно ли преобразование. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical) { get; } | Возвращает этот SRS, преобразованный в[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem). Используйте[`Type`](../spatialreferencesystem/type), чтобы узнать, возможно ли преобразование. |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/localspatialreferencesystem/dimensionscount) { get; } | Количество измерений в этой SRS. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode) { get; } | Если этот идентификатор объекта является идентификатором EPSG - вернуть его код. В противном случае - вернуть -1. |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/localspatialreferencesystem/geographicdatum) { get; } | ВыдаетInvalidOperationException, так как Local SRS не имеет географических данных. |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/localspatialreferencesystem/hasgeographicdatum) { get; } | Возвращает`false`, так как Local SRS не имеет географических данных. |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/localspatialreferencesystem/hasprimemeridian) { get; } | Возвращает`false`, так как Local SRS не имеет нулевого меридиана. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier) { get; } | Идентификатор этого идентифицируемого объекта. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound) { get; } | Возвращает, является ли эта SRS составной (объединение двух SRS). Следующие комбинации СГД в составной ССО считаются допустимыми: Географическая ССО + Вертикальная ССО, в этом случае тип составной ССО будетGeographic. Проецируемая SRS + Вертикальная SRS, в этом случае тип составной SRS будетProjected. Если комбинация SRS различается, тип составной SRS будетUnknown. |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle) { get; } | Возвращает, является ли этот SRS одиночным (не объединением двух SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid) { get; } | То же, что и[`Validate`](../spatialreferencesystem/validate), но не возвращает сообщение об ошибке . |
| [LocalDatum](../../aspose.gis.spatialreferencing/localspatialreferencesystem/localdatum) { get; } | Датум, описывающий метод измерений. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name) { get; } | Имя этого объекта. |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/localspatialreferencesystem/primemeridian) { get; } | ВыдаетInvalidOperationException, так как Local SRS не имеет нулевого меридиана. |
| override [Type](../../aspose.gis.spatialreferencing/localspatialreferencesystem/type) { get; } | ВозвратLocal. |
| [Unit](../../aspose.gis.spatialreferencing/localspatialreferencesystem/unit) { get; } | Единица этого SRS. |

## Методы

| Имя | Описание |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto)(SpatialReferenceSystem) | Создает преобразование из этой` SpatialReferenceSystem` в другую` SpatialReferenceSystem` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt)() | Возвращает представление этого SRS в виде строки WKT. Результирующая строка WKT будет соответствовать спецификации OGC 01-009, обычно называемой "WKT1". |
| override [GetAxis](../../aspose.gis.spatialreferencing/localspatialreferencesystem/getaxis)(int) | Get[`Axis`](../axis), описывающий размерность. |
| override [GetUnit](../../aspose.gis.spatialreferencing/localspatialreferencesystem/getunit)(int) | Get[`Unit`](./unit)измерения. |
| override [IsEquivalent](../../aspose.gis.spatialreferencing/localspatialreferencesystem/isequivalent)(SpatialReferenceSystem) | Определяет, эквивалентен ли этот SRS другим SRS.. |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring)() | Возвращает строку, представляющую текущий объект. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Создает преобразование из этой` SpatialReferenceSystem` в другую` SpatialReferenceSystem` . |
| override [Validate](../../aspose.gis.spatialreferencing/localspatialreferencesystem/validate)(out string) | Определите, действителен ли этот SRS. См.[`Validate`](../spatialreferencesystem/validate)для описания достоверности. |

### Смотрите также

* class [SpatialReferenceSystem](../spatialreferencesystem)
* пространство имен [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing)
* сборка [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
