---
title: Class SpatialReferenceSystem
second_title: Referencia de API de Aspose.GIS para .NET
description: Aspose.Gis.SpatialReferencing.SpatialReferenceSystem clase. El sistema de referencia espacial asigna coordenadas a lugares de la Tierra. Hay diferentes tipos de SRS consulteType . Además si el tipo de SRS esGeographic o Projected SRS puede ser compuesto o simple verIsCompound .
type: docs
weight: 2250
url: /es/net/aspose.gis.spatialreferencing/spatialreferencesystem/
---
## SpatialReferenceSystem class

El sistema de referencia espacial asigna coordenadas a lugares de la Tierra. Hay diferentes tipos de SRS, consulte[`Type`](./type/) . Además, si el tipo de SRS esGeographic o Projected SRS puede ser compuesto o simple, ver[`IsCompound`](./iscompound/) .

```csharp
public abstract class SpatialReferenceSystem : IdentifiableObject
```

## Propiedades

| Nombre | Descripción |
| --- | --- |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound/) { get; } | Devuelve este SRS convertido a[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem/) . Uso[`IsCompound`](./iscompound/) para saber si la conversión es posible. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric/) { get; } | Devuelve este SRS convertido a[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/) . Uso[`Type`](./type/) para saber si la conversión es posible. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic/) { get; } | Devuelve este SRS convertido a[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem/) . Uso[`Type`](./type/) para saber si la conversión es posible. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal/) { get; } | Devuelve este SRS convertido a[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) . Uso[`Type`](./type/) para saber si la conversión es posible. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected/) { get; } | Devuelve este SRS convertido a[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem/) . Uso[`Type`](./type/) para saber si la conversión es posible. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical/) { get; } | Devuelve este SRS convertido a[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) . Uso[`Type`](./type/) para saber si la conversión es posible. |
| abstract [DimensionsCount](../../aspose.gis.spatialreferencing/spatialreferencesystem/dimensionscount/) { get; } | Devuelve el número de dimensiones en este SRS. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Si el identificador de este objeto es un identificador EPSG, devuelva su código. De lo contrario, devuelva -1. |
| abstract [GeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/geographicdatum/) { get; } | Devuelve el dato geográfico de este SRS. |
| abstract [HasGeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/hasgeographicdatum/) { get; } | Determina si este SRS tiene datum geográfico. Esto es cierto para todo SRS geográfico, proyectado y geocéntrico. |
| abstract [HasPrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/hasprimemeridian/) { get; } | Devuelve si este SRS tiene meridiano principal. Esto es cierto para todos los SRS geográficos, proyectados y geocéntricos. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Identificador de este objeto identificable. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/) { get; } | Devuelve si este SRS es compuesto (unión de dos SRS). Se consideran válidas las siguientes combinaciones de SRS en SRS compuesto: SRS Geográfico + SRS Vertical, en este caso el tipo de SRS compuesto seráGeographic . SRS Proyectado + SRS Vertical, en este caso el tipo de SRS compuesto seráProjected . Si la combinación de SRS difiere, el tipo de SRS compuesto seráUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | Devuelve si este SRS es único (no una unión de dos SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | Igual que[`Validate`](./validate/) , pero no devuelva el mensaje de error. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Nombre de este objeto. |
| abstract [PrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/primemeridian/) { get; } | Devuelve el primer meridiano de este SRS. |
| abstract [Type](../../aspose.gis.spatialreferencing/spatialreferencesystem/type/) { get; } | Obtiene el tipo de este SRS, consulte[`SpatialReferenceSystemType`](../spatialreferencesystemtype/) . |
| static [Etrs89](../../aspose.gis.spatialreferencing/spatialreferencesystem/etrs89/) { get; } | Sistema de referencia espacial ETRS 89 (EPSG:4258). |
| static [Etrs89LambertAzimuthalEqualArea](../../aspose.gis.spatialreferencing/spatialreferencesystem/etrs89lambertazimuthalequalarea/) { get; } | Sistema de referencia espacial ETRS 89 / ETRS Lambert Azimuthal Equal Area (EPSG:3035). |
| static [Etrs89LambertConformalConic](../../aspose.gis.spatialreferencing/spatialreferencesystem/etrs89lambertconformalconic/) { get; } | Sistema de referencia espacial ETRS 89 / Lambert Conformal Conic (EPSG:3034). |
| static [Nad83](../../aspose.gis.spatialreferencing/spatialreferencesystem/nad83/) { get; } | Sistema de referencia espacial NAD 83 (EPSG:4269). |
| static [Osgb36](../../aspose.gis.spatialreferencing/spatialreferencesystem/osgb36/) { get; } | Sistema de referencia espacial OSGB 36 (EPSG:4277). |
| static [Osgb36BritishNationalGrid](../../aspose.gis.spatialreferencing/spatialreferencesystem/osgb36britishnationalgrid/) { get; } | Sistema de referencia espacial OSGB 36 / British National Grid (EPSG:27700). |
| static [WebMercator](../../aspose.gis.spatialreferencing/spatialreferencesystem/webmercator/) { get; } | Sistema de referencia espacial Web Mercator (EPSG:3857). |
| static [Wgs72](../../aspose.gis.spatialreferencing/spatialreferencesystem/wgs72/) { get; } | Sistema de referencia espacial WGS 72 (EPSG:4322). |
| static [Wgs84](../../aspose.gis.spatialreferencing/spatialreferencesystem/wgs84/) { get; } | Sistema de referencia espacial WGS 84 (EPSG:4326). |

## Métodos

| Nombre | Descripción |
| --- | --- |
| static [CreateFromEpsg](../../aspose.gis.spatialreferencing/spatialreferencesystem/createfromepsg/)(int) | Crear un sistema de referencia espacial basado en el código EPSG especificado. |
| static [CreateFromWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/createfromwkt/)(string) | Crea un nuevo`Sistema de referencia espacial` basado en la cadena WKT (texto conocido). |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | Crea la transformación a partir de esto`Sistema de referencia espacial` a otro`Sistema de referencia espacial` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | Devuelve la representación de este SRS como una cadena WKT. La cadena WKT resultante coincidirá con la especificación OGC 01-009, generalmente denominada "WKT1". |
| abstract [GetAxis](../../aspose.gis.spatialreferencing/spatialreferencesystem/getaxis/)(int) | Obtener[`Axis`](../axis/) que describe dimension. |
| abstract [GetUnit](../../aspose.gis.spatialreferencing/spatialreferencesystem/getunit/)(int) | Obtener[`Unit`](../unit/)de dimensión. |
| virtual [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | Detecta si este SRS es equivalente a otro SRS. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Devuelve una cadena que representa el objeto actual. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Crea la transformación a partir de esto`Sistema de referencia espacial` a otro`Sistema de referencia espacial` . |
| abstract [Validate](../../aspose.gis.spatialreferencing/spatialreferencesystem/validate/)(out string) | Determinar si este SRS es válido. |
| static [CreateCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/createcompound/)(string, SpatialReferenceSystem, SpatialReferenceSystem, Identifier) | Crear compuesto SRS. |
| static [CreateGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/creategeocentric/)(GeocentricSpatialReferenceSystemParameters, Identifier) | Crear SRS geocéntrico a partir de parámetros personalizados. |
| static [CreateGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/creategeographic/)(GeographicSpatialReferenceSystemParameters, Identifier) | Crear SRS geográfico a partir de parámetros personalizados. |
| static [CreateLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/createlocal/)(string, LocalDatum, Unit, ICollection&lt;Axis&gt;, Identifier) | Crear SRS local. |
| static [CreateProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/createprojected/)(ProjectedSpatialReferenceSystemParameters, Identifier) | Crear SRS proyectado a partir de parámetros personalizados. |
| static [CreateVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/createvertical/)(string, VerticalDatum, Unit, Axis, Identifier) | Crear SRS vertical. |
| static [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent/)(SpatialReferenceSystem, SpatialReferenceSystem) | Determina si dos SRS son equivalentes. Las mismas coordenadas del SRS equivalente coinciden con el mismo lugar en la Tierra. Algunos parámetros del SRS equivalente pueden ser diferentes, por ejemplo[`Name`](../identifiableobject/name/) . |
| static [TryCreateFromEpsg](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatefromepsg/)(int, out SpatialReferenceSystem) | Crear un sistema de referencia espacial basado en el código EPSG especificado. |
| static [TryCreateFromWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatefromwkt/)(string, out SpatialReferenceSystem) | Crea un nuevo`Sistema de referencia espacial` basado en la cadena WKT (texto conocido). |

### Ver también

* class [IdentifiableObject](../identifiableobject/)
* espacio de nombres [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* asamblea [Aspose.GIS](../../)


