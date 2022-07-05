---
title: ProjectedSpatialReferenceSystem
second_title: Справочник по Aspose.GIS for .NET API
description: Прогнозируемая СКР является результатом применения проекции к географической СКР. Спроецированная SRS может быть двумерной или трехмерной. Если спроецированная СКР трехмерна то на самом деле это составная СКР двумерной спроецированной СКР и одномерной вертикальной ССО.
type: docs
weight: 2110
url: /ru/net/aspose.gis.spatialreferencing/projectedspatialreferencesystem/
---
## ProjectedSpatialReferenceSystem class

Прогнозируемая СКР является результатом применения проекции к географической СКР. Спроецированная SRS может быть двумерной или трехмерной. Если спроецированная СКР трехмерна, то на самом деле это составная СКР двумерной спроецированной СКР и одномерной вертикальной ССО.

```csharp
public abstract class ProjectedSpatialReferenceSystem : SpatialReferenceSystem
```

## Характеристики

| Имя | Описание |
| --- | --- |
| abstract [AngularUnit](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/angularunit) { get; } | Единица, которая используется для угловых значений в этой SRS и для угловых параметров[`Projection`](./projection). Соответствует угловой единице[`Base`](./base). |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound) { get; } | Возвращает этот SRS, преобразованный в[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem). Используйте[`IsCompound`](../spatialreferencesystem/iscompound), чтобы узнать, возможно ли преобразование. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric) { get; } | Возвращает этот SRS, преобразованный в[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem). Используйте[`Type`](../spatialreferencesystem/type), чтобы узнать, возможно ли преобразование. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic) { get; } | Возвращает этот SRS, преобразованный в[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem). Используйте[`Type`](../spatialreferencesystem/type), чтобы узнать, возможно ли преобразование. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal) { get; } | Возвращает этот SRS, преобразованный в[`LocalSpatialReferenceSystem`](../localspatialreferencesystem). Используйте[`Type`](../spatialreferencesystem/type), чтобы узнать, возможно ли преобразование. |
| [AsProjected](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/asprojected) { get; } | Верните это. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical) { get; } | Возвращает этот SRS, преобразованный в[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem). Используйте[`Type`](../spatialreferencesystem/type), чтобы узнать, возможно ли преобразование. |
| abstract [AxisesOrder](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/axisesorder) { get; } | Порядок осей в этом SRS. Если эта SRS недействительна и имеет неправильные направления осей,Invalidвозвращается. |
| abstract [Base](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/base) { get; } | Географический SRS, к которому[`Projection`](./projection)был применен для получения этого SRS. |
| abstract [DimensionsCount](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/dimensionscount) { get; } | Возвращает количество измерений в этом SRS. Для проектируемого СКР это может быть: два - если это один проектируемый СКР. три - если это составная СКР, состоящая из одинарной, двумерной, проекционной ССО и вертикальной ССО, то добавляется третье измерение. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode) { get; } | Если этот идентификатор объекта является идентификатором EPSG - вернуть его код. В противном случае - вернуть -1. |
| abstract [GeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/geographicdatum) { get; } | Возвращает географические данные этой SRS. |
| [HasGeographicDatum](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/hasgeographicdatum) { get; } | Возвращает истину, так как проекция SRS всегда имеет нулевой меридиан. |
| [HasPrimeMeridian](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/hasprimemeridian) { get; } | Возвращает истину, так как проекция SRS всегда имеет нулевой меридиан. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier) { get; } | Идентификатор этого идентифицируемого объекта. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound) { get; } | Возвращает, является ли эта SRS составной (объединение двух SRS). Следующие комбинации СГД в составной ССО считаются допустимыми: Географическая ССО + Вертикальная ССО, в этом случае тип составной ССО будетGeographic. Проецируемая SRS + Вертикальная SRS, в этом случае тип составной SRS будетProjected. Если комбинация SRS различается, тип составной SRS будетUnknown. |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle) { get; } | Возвращает, является ли этот SRS одиночным (не объединением двух SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid) { get; } | То же, что и[`Validate`](../spatialreferencesystem/validate), но не возвращает сообщение об ошибке . |
| abstract [LinearUnit](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/linearunit) { get; } | Единица, которая используется для линейных размеров в этой SRS и для линейных параметров[`Projection`](./projection). |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name) { get; } | Имя этого объекта. |
| abstract [PrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/primemeridian) { get; } | Возвращает нулевой меридиан этого SRS. |
| abstract [Projection](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/projection) { get; } | Проекция, примененная к[`Base`](./base)для получения этой SRS. |
| [Type](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/type) { get; } | ВозвращаетProjected. |

## Методы

| Имя | Описание |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto)(SpatialReferenceSystem) | Создает преобразование из этой` SpatialReferenceSystem` в другую` SpatialReferenceSystem` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt)() | Возвращает представление этого SRS в виде строки WKT. Результирующая строка WKT будет соответствовать спецификации OGC 01-009, обычно называемой "WKT1". |
| abstract [GetAxis](../../aspose.gis.spatialreferencing/spatialreferencesystem/getaxis)(int) | Get[`Axis`](../axis), описывающий размерность. |
| abstract [GetUnit](../../aspose.gis.spatialreferencing/spatialreferencesystem/getunit)(int) | Get[`Unit`](../unit)измерения. |
| virtual [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent)(SpatialReferenceSystem) | Определяет, эквивалентен ли этот SRS другим SRS.. |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring)() | Возвращает строку, представляющую текущий объект. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Создает преобразование из этой` SpatialReferenceSystem` в другую` SpatialReferenceSystem` . |
| abstract [Validate](../../aspose.gis.spatialreferencing/spatialreferencesystem/validate)(out string) | Определите, действителен ли этот SRS. |

### Смотрите также

* class [SpatialReferenceSystem](../spatialreferencesystem)
* пространство имен [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing)
* сборка [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
