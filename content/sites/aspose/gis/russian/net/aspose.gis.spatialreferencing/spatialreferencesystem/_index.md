---
title: SpatialReferenceSystem
second_title: Справочник по Aspose.GIS for .NET API
description: Пространственная система отсчета отображает координаты мест на Земле. Существуют различные типы SRS см.Type./spatialreferencesystem/type . Более того если тип SRSGeographic или Projected SRS может быть составным или одинарным см.IsCompound./spatialreferencesystem/iscompound .
type: docs
weight: 2150
url: /ru/net/aspose.gis.spatialreferencing/spatialreferencesystem/
---
## SpatialReferenceSystem class

Пространственная система отсчета отображает координаты мест на Земле. Существуют различные типы SRS, см.[`Type`](./type) . Более того, если тип SRSGeographic или Projected SRS может быть составным или одинарным, см.[`IsCompound`](./iscompound) .

```csharp
public abstract class SpatialReferenceSystem : IdentifiableObject
```

## Характеристики

| Имя | Описание |
| --- | --- |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound) { get; } | Возвращает этот SRS, преобразованный в[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem) . Использовать[`IsCompound`](./iscompound) чтобы узнать, возможно ли преобразование. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric) { get; } | Возвращает этот SRS, преобразованный в[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem) . Использовать[`Type`](./type) чтобы узнать, возможно ли преобразование. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic) { get; } | Возвращает этот SRS, преобразованный в[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem) . Использовать[`Type`](./type) чтобы узнать, возможно ли преобразование. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal) { get; } | Возвращает этот SRS, преобразованный в[`LocalSpatialReferenceSystem`](../localspatialreferencesystem) . Использовать[`Type`](./type) чтобы узнать, возможно ли преобразование. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected) { get; } | Возвращает этот SRS, преобразованный в[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem) . Использовать[`Type`](./type) чтобы узнать, возможно ли преобразование. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical) { get; } | Возвращает этот SRS, преобразованный в[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem) . Использовать[`Type`](./type) чтобы узнать, возможно ли преобразование. |
| abstract [DimensionsCount](../../aspose.gis.spatialreferencing/spatialreferencesystem/dimensionscount) { get; } | Возвращает количество измерений в этом SRS. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode) { get; } | Если этот идентификатор объекта является идентификатором EPSG - вернуть его код. В противном случае - вернуть -1. |
| abstract [GeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/geographicdatum) { get; } | Возвращает географические данные этой SRS. |
| abstract [HasGeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/hasgeographicdatum) { get; } | Определяет, имеет ли эта SRS географическую датум. Это верно для каждой географической, прогнозируемой и геоцентрической SRS. |
| abstract [HasPrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/hasprimemeridian) { get; } | Возвращает, имеет ли эта SRS нулевой меридиан. Это верно для каждой географической, прогнозируемой и геоцентрической SRS. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier) { get; } | Идентификатор этого идентифицируемого объекта. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound) { get; } | Возвращает, является ли эта SRS составной (объединение двух SRS). Допустимыми считаются следующие комбинации SRS в составной SRS: Географическая SRS + Вертикальная SRS, в этом случае тип составной SRS будетGeographic . Проекционная SRS + Вертикальная SRS, в этом случае тип составной SRS будетProjected . Если комбинация SRS различается, тип составной SRS будетUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle) { get; } | Возвращает, является ли эта SRS одиночной (не объединением двух SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid) { get; } | То же, что и[`Validate`](./validate) , но не возвращать сообщение об ошибке. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name) { get; } | Имя этого объекта. |
| abstract [PrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/primemeridian) { get; } | Возвращает нулевой меридиан этой SRS. |
| abstract [Type](../../aspose.gis.spatialreferencing/spatialreferencesystem/type) { get; } | Получает тип этой SRS, см.[`SpatialReferenceSystemType`](../spatialreferencesystemtype) . |
| static [Etrs89](../../aspose.gis.spatialreferencing/spatialreferencesystem/etrs89) { get; } | Система пространственной привязки ETRS 89 (EPSG:4258). |
| static [Etrs89LambertAzimuthalEqualArea](../../aspose.gis.spatialreferencing/spatialreferencesystem/etrs89lambertazimuthalequalarea) { get; } | Система пространственной привязки ETRS 89 / ETRS Lambert Azimuthal Equal Area (EPSG:3035). |
| static [Etrs89LambertConformalConic](../../aspose.gis.spatialreferencing/spatialreferencesystem/etrs89lambertconformalconic) { get; } | Система пространственной привязки ETRS 89 / Lambert Conformal Conic (EPSG:3034). |
| static [Nad83](../../aspose.gis.spatialreferencing/spatialreferencesystem/nad83) { get; } | Система пространственной привязки NAD 83 (EPSG:4269). |
| static [Osgb36](../../aspose.gis.spatialreferencing/spatialreferencesystem/osgb36) { get; } | Система пространственной привязки OSGB 36 (EPSG:4277). |
| static [Osgb36BritishNationalGrid](../../aspose.gis.spatialreferencing/spatialreferencesystem/osgb36britishnationalgrid) { get; } | Система пространственной привязки OSGB 36 / British National Grid (EPSG: 27700). |
| static [WebMercator](../../aspose.gis.spatialreferencing/spatialreferencesystem/webmercator) { get; } | Система пространственной привязки Web Mercator (EPSG:3857). |
| static [Wgs72](../../aspose.gis.spatialreferencing/spatialreferencesystem/wgs72) { get; } | Система пространственной привязки WGS 72 (EPSG:4322). |
| static [Wgs84](../../aspose.gis.spatialreferencing/spatialreferencesystem/wgs84) { get; } | Система пространственной привязки WGS 84 (EPSG:4326). |

## Методы

| Имя | Описание |
| --- | --- |
| static [CreateFromEpsg](../../aspose.gis.spatialreferencing/spatialreferencesystem/createfromepsg)(int) | Создать систему пространственной привязки на основе указанного кода EPSG. |
| static [CreateFromWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/createfromwkt)(string) | Создает новый`SpatialReferenceSystem` на основе строки WKT (общеизвестный текст). |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto)(SpatialReferenceSystem) | Создает преобразование из этого`SpatialReferenceSystem` другому`SpatialReferenceSystem` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt)() | Возвращает представление этой SRS в виде строки WKT. Результирующая строка WKT будет соответствовать спецификации OGC 01-009, обычно именуемой "WKT1". |
| abstract [GetAxis](../../aspose.gis.spatialreferencing/spatialreferencesystem/getaxis)(int) | Получить[`Axis`](../axis) который описывает размерность. |
| abstract [GetUnit](../../aspose.gis.spatialreferencing/spatialreferencesystem/getunit)(int) | Получить[`Unit`](../unit)размера. |
| virtual [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent)(SpatialReferenceSystem) | Определяет, эквивалентен ли этот SRS другим SRS. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring)() | Возвращает строку, которая представляет текущий объект. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Создает преобразование из этого`SpatialReferenceSystem` другому`SpatialReferenceSystem` . |
| abstract [Validate](../../aspose.gis.spatialreferencing/spatialreferencesystem/validate)(out string) | Определите, действительна ли эта SRS. |
| static [CreateCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/createcompound)(string, SpatialReferenceSystem, SpatialReferenceSystem, Identifier) | Создать составной SRS. |
| static [CreateGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/creategeocentric)(GeocentricSpatialReferenceSystemParameters, Identifier) | Создать геоцентрическую SRS из пользовательских параметров. |
| static [CreateGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/creategeographic)(GeographicSpatialReferenceSystemParameters, Identifier) | Создать географическую SRS из пользовательских параметров. |
| static [CreateLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/createlocal)(string, LocalDatum, Unit, ICollection&lt;Axis&gt;, Identifier) | Создать локальную SRS. |
| static [CreateProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/createprojected)(ProjectedSpatialReferenceSystemParameters, Identifier) | Создать проекцию SRS из пользовательских параметров. |
| static [CreateVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/createvertical)(string, VerticalDatum, Unit, Axis, Identifier) | Создать вертикальную SRS. |
| static [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent)(SpatialReferenceSystem, SpatialReferenceSystem) | Определяет эквивалентность двух SRS. Одни и те же координаты эквивалентных SRS совпадают с одним и тем же местом на Земле. Некоторые параметры эквивалентных SRS могут отличаться, например[`Name`](../identifiableobject/name) . |
| static [TryCreateFromEpsg](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatefromepsg)(int, out SpatialReferenceSystem) | Создать систему пространственной привязки на основе указанного кода EPSG. |
| static [TryCreateFromWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatefromwkt)(string, out SpatialReferenceSystem) | Создает новый`SpatialReferenceSystem` на основе строки WKT (общеизвестный текст). |

### Смотрите также

* class [IdentifiableObject](../identifiableobject)
* пространство имен [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing)
* сборка [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
