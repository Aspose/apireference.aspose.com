---
title: Class GeographicSpatialReferenceSystem
second_title: Справочник по Aspose.GIS for .NET API
description: Aspose.Gis.SpatialReferencing.GeographicSpatialReferenceSystem сорт. Географическая SRS  это SRS основанная на долготе и широте. Географическая SRS может быть двухмерной или трехмерной. Если географическая SRS является трехмерной то на самом деле это составная SRS из двухмерной SRS и вертикальной SRS.
type: docs
weight: 2130
url: /ru/net/aspose.gis.spatialreferencing/geographicspatialreferencesystem/
---
## GeographicSpatialReferenceSystem class

Географическая SRS — это SRS, основанная на долготе и широте. Географическая SRS может быть двухмерной или трехмерной. Если географическая SRS является трехмерной, то на самом деле это составная SRS из двухмерной SRS и вертикальной SRS.

```csharp
public abstract class GeographicSpatialReferenceSystem : SpatialReferenceSystem
```

## Характеристики

| Имя | Описание |
| --- | --- |
| abstract [AngularUnit](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/angularunit/) { get; } | Единица, используемая для угловых размеров в этой SRS. |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound/) { get; } | Возвращает этот SRS, преобразованный в[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem/) . Использовать[`IsCompound`](../spatialreferencesystem/iscompound/) чтобы узнать, возможно ли преобразование. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric/) { get; } | Возвращает этот SRS, преобразованный в[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/) . Использовать[`Type`](../spatialreferencesystem/type/) чтобы узнать, возможно ли преобразование. |
| [AsGeographic](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/asgeographic/) { get; } | Возвращает это. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal/) { get; } | Возвращает этот SRS, преобразованный в[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) . Использовать[`Type`](../spatialreferencesystem/type/) чтобы узнать, возможно ли преобразование. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected/) { get; } | Возвращает этот SRS, преобразованный в[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem/) . Использовать[`Type`](../spatialreferencesystem/type/) чтобы узнать, возможно ли преобразование. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical/) { get; } | Возвращает этот SRS, преобразованный в[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) . Использовать[`Type`](../spatialreferencesystem/type/) чтобы узнать, возможно ли преобразование. |
| abstract [AxisesOrder](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/axisesorder/) { get; } | Порядок осей в этой SRS. Если эта SRS недействительна и имеет неправильное направление осей,Invalid возвращается. |
| abstract [DimensionsCount](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/dimensionscount/) { get; } | Возвращает количество измерений в этой SRS. Для географической SRS это может быть: два - если это одна географическая SRS. три - если это составная SRS, которая состоит из одиночной, двумерной, географической SRS и вертикальной SRS, что добавляет третье измерение. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Если этот идентификатор объекта является идентификатором EPSG - вернуть его код. В противном случае - вернуть -1. |
| abstract [GeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/geographicdatum/) { get; } | Возвращает географические данные этой SRS. |
| [HasGeographicDatum](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/hasgeographicdatum/) { get; } | Возвращает`true` , так как географические СКИ всегда имеют нулевой меридиан. |
| [HasPrimeMeridian](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/hasprimemeridian/) { get; } | Возвращает`true` , так как географические СКИ всегда имеют нулевой меридиан. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Идентификатор этого идентифицируемого объекта. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/) { get; } | Возвращает, является ли эта SRS составной (объединение двух SRS). Допустимыми считаются следующие комбинации SRS в составной SRS: Географическая SRS + Вертикальная SRS, в этом случае тип составной SRS будетGeographic . Проекционная SRS + Вертикальная SRS, в этом случае тип составной SRS будетProjected . Если комбинация SRS различается, тип составной SRS будетUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | Возвращает, является ли эта SRS одиночной (не объединением двух SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | То же, что и[`Validate`](../spatialreferencesystem/validate/) , но не возвращать сообщение об ошибке. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Имя этого объекта. |
| abstract [PrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/primemeridian/) { get; } | Возвращает нулевой меридиан этой SRS. |
| [Type](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/type/) { get; } | ВозвращаетGeographic . |

## Методы

| Имя | Описание |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | Создает преобразование из этого`SpatialReferenceSystem` другому`SpatialReferenceSystem` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | Возвращает представление этой SRS в виде строки WKT. Результирующая строка WKT будет соответствовать спецификации OGC 01-009, обычно именуемой "WKT1". |
| abstract [GetAxis](../../aspose.gis.spatialreferencing/spatialreferencesystem/getaxis/)(int) | Получить[`Axis`](../axis/) который описывает размерность. |
| abstract [GetUnit](../../aspose.gis.spatialreferencing/spatialreferencesystem/getunit/)(int) | Получить[`Unit`](../unit/)размера. |
| virtual [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | Определяет, эквивалентен ли этот SRS другим SRS. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Возвращает строку, которая представляет текущий объект. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Создает преобразование из этого`SpatialReferenceSystem` другому`SpatialReferenceSystem` . |
| abstract [Validate](../../aspose.gis.spatialreferencing/spatialreferencesystem/validate/)(out string) | Определите, действительна ли эта SRS. |

### Смотрите также

* class [SpatialReferenceSystem](../spatialreferencesystem/)
* пространство имен [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* сборка [Aspose.GIS](../../)


