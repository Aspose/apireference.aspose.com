---
title: ProjectedSpatialReferenceSystem
second_title: Справочник по Aspose.GIS for .NET API
description: Спроецированная SRS является результатом применения проекции к географической SRS. Спроецированная SRS может быть двухмерной или трехмерной. Если спроецированная SRS трехмерна то она на самом деле является составной SRS из двухмерной проекции SRS и одномерной вертикальной SRS.
type: docs
weight: 2120
url: /ru/net/aspose.gis.spatialreferencing/projectedspatialreferencesystem/
---
## ProjectedSpatialReferenceSystem class

Спроецированная SRS является результатом применения проекции к географической SRS. Спроецированная SRS может быть двухмерной или трехмерной. Если спроецированная SRS трехмерна, то она на самом деле является составной SRS из двухмерной проекции SRS и одномерной вертикальной SRS.

```csharp
public abstract class ProjectedSpatialReferenceSystem : SpatialReferenceSystem
```

## Характеристики

| Имя | Описание |
| --- | --- |
| abstract [AngularUnit](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/angularunit) { get; } | Единица, которая используется для угловых значений в этой SRS и для угловых параметров[`Projection`](./projection) . Соответствует угловой единице[`Base`](./base) . |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound) { get; } | Возвращает этот SRS, преобразованный в[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem) . Использовать[`IsCompound`](../spatialreferencesystem/iscompound) чтобы узнать, возможно ли преобразование. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric) { get; } | Возвращает этот SRS, преобразованный в[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem) . Использовать[`Type`](../spatialreferencesystem/type) чтобы узнать, возможно ли преобразование. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic) { get; } | Возвращает этот SRS, преобразованный в[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem) . Использовать[`Type`](../spatialreferencesystem/type) чтобы узнать, возможно ли преобразование. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal) { get; } | Возвращает этот SRS, преобразованный в[`LocalSpatialReferenceSystem`](../localspatialreferencesystem) . Использовать[`Type`](../spatialreferencesystem/type) чтобы узнать, возможно ли преобразование. |
| [AsProjected](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/asprojected) { get; } | Вернуть это. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical) { get; } | Возвращает этот SRS, преобразованный в[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem) . Использовать[`Type`](../spatialreferencesystem/type) чтобы узнать, возможно ли преобразование. |
| abstract [AxisesOrder](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/axisesorder) { get; } | Порядок осей в этой SRS. Если эта SRS недействительна и имеет неправильное направление осей,Invalid возвращается. |
| abstract [Base](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/base) { get; } | Географическая СГД, к которой[`Projection`](./projection) был применен для получения этого SRS. |
| abstract [DimensionsCount](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/dimensionscount) { get; } | Возвращает количество измерений в этой SRS. Для спроецированной СКР это может быть: два - если это одиночная спроецированная ССО. три - если это составная ССО, которая состоит из одинарной, двумерной, спроецированной ССО и вертикальной ССО, добавляющей третье измерение. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode) { get; } | Если этот идентификатор объекта является идентификатором EPSG - вернуть его код. В противном случае - вернуть -1. |
| abstract [GeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/geographicdatum) { get; } | Возвращает географические данные этой SRS. |
| [HasGeographicDatum](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/hasgeographicdatum) { get; } | Возвращает значение true, так как проекция SRS всегда имеет нулевой меридиан. |
| [HasPrimeMeridian](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/hasprimemeridian) { get; } | Возвращает значение true, так как проекция SRS всегда имеет нулевой меридиан. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier) { get; } | Идентификатор этого идентифицируемого объекта. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound) { get; } | Возвращает, является ли эта SRS составной (объединение двух SRS). Допустимыми считаются следующие комбинации SRS в составной SRS: Географическая SRS + Вертикальная SRS, в этом случае тип составной SRS будетGeographic . Проекционная SRS + Вертикальная SRS, в этом случае тип составной SRS будетProjected . Если комбинация SRS различается, тип составной SRS будетUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle) { get; } | Возвращает, является ли эта SRS одиночной (не объединением двух SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid) { get; } | То же, что и[`Validate`](../spatialreferencesystem/validate) , но не возвращать сообщение об ошибке. |
| abstract [LinearUnit](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/linearunit) { get; } | Единица, которая используется для линейных размеров в этой СГД и для линейных параметров[`Projection`](./projection) . |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name) { get; } | Имя этого объекта. |
| abstract [PrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/primemeridian) { get; } | Возвращает нулевой меридиан этой SRS. |
| abstract [Projection](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/projection) { get; } | Проекция, примененная к[`Base`](./base) чтобы получить этот SRS. |
| [Type](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/type) { get; } | ВозвращаетProjected . |

## Методы

| Имя | Описание |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto)(SpatialReferenceSystem) | Создает преобразование из этого`SpatialReferenceSystem` другому`SpatialReferenceSystem` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt)() | Возвращает представление этой SRS в виде строки WKT. Результирующая строка WKT будет соответствовать спецификации OGC 01-009, обычно именуемой "WKT1". |
| abstract [GetAxis](../../aspose.gis.spatialreferencing/spatialreferencesystem/getaxis)(int) | Получить[`Axis`](../axis) который описывает размерность. |
| abstract [GetUnit](../../aspose.gis.spatialreferencing/spatialreferencesystem/getunit)(int) | Получить[`Unit`](../unit)размера. |
| virtual [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent)(SpatialReferenceSystem) | Определяет, эквивалентен ли этот SRS другим SRS. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring)() | Возвращает строку, которая представляет текущий объект. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Создает преобразование из этого`SpatialReferenceSystem` другому`SpatialReferenceSystem` . |
| abstract [Validate](../../aspose.gis.spatialreferencing/spatialreferencesystem/validate)(out string) | Определите, действительна ли эта SRS. |

### Смотрите также

* class [SpatialReferenceSystem](../spatialreferencesystem)
* пространство имен [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing)
* сборка [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
