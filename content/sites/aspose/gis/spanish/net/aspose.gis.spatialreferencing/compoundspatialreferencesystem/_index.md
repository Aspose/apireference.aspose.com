---
title: Class CompoundSpatialReferenceSystem
second_title: Referencia de API de Aspose.GIS para .NET
description: Aspose.Gis.SpatialReferencing.CompoundSpatialReferenceSystem clase. SRS compuesto une dos SRS subyacentes ninguno de los cuales puede ser compuesto.
type: docs
weight: 2060
url: /es/net/aspose.gis.spatialreferencing/compoundspatialreferencesystem/
---
## CompoundSpatialReferenceSystem class

SRS compuesto une dos SRS subyacentes, ninguno de los cuales puede ser compuesto.

```csharp
public class CompoundSpatialReferenceSystem : SpatialReferenceSystem
```

## Propiedades

| Nombre | Descripción |
| --- | --- |
| override [AsCompound](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/ascompound/) { get; } | Devuelve esto. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric/) { get; } | Devuelve este SRS convertido a[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/) . Uso[`Type`](../spatialreferencesystem/type/) para saber si la conversión es posible. |
| override [AsGeographic](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/asgeographic/) { get; } | Devuelve la representación geográfica de este SRS. Si este SRS compuesto realmente representa un SRS geográfico, el resultado será un SRS geográfico tridimensional (con dimensiones de longitud, latitud y altura). De lo contrario, se lanzará una excepción. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal/) { get; } | Devuelve este SRS convertido a[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) . Uso[`Type`](../spatialreferencesystem/type/) para saber si la conversión es posible. |
| override [AsProjected](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/asprojected/) { get; } | Devuelve la representación proyectada de este SRS. Si este SRS compuesto realmente representa un SRS proyectado, el resultado será un SRS proyectado tridimensional (con dimensiones de altura X, Y). De lo contrario, se lanzará una excepción. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical/) { get; } | Devuelve este SRS convertido a[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) . Uso[`Type`](../spatialreferencesystem/type/) para saber si la conversión es posible. |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/dimensionscount/) { get; } | Número de dimensiones. Para el SRS compuesto, esta es la suma del número de dimensiones del SRS subyacente. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Si el identificador de este objeto es un identificador EPSG, devuelva su código. De lo contrario, devuelva -1. |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/geographicdatum/) { get; } | Devuelve el dato geográfico de este SRS. Si ambos[`Head`](./head/) y[`Tail`](./tail/) tener dato geográfico - devuelve el dato geográfico de head. |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/hasgeographicdatum/) { get; } | El SRS compuesto tiene datum geográfico si alguno de los SRS subyacentes tiene datum geográfico. |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/hasprimemeridian/) { get; } | El SRS compuesto tiene un meridiano principal si alguno de los SRS subyacentes tiene un meridiano principal. |
| [Head](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/head/) { get; } | Primer subyacente SRS. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Identificador de este objeto identificable. |
| override [IsCompound](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/iscompound/) { get; } | Devoluciones`true` . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | Devuelve si este SRS es único (no una unión de dos SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | Igual que[`Validate`](../spatialreferencesystem/validate/) , pero no devuelva el mensaje de error. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Nombre de este objeto. |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/primemeridian/) { get; } | Devuelve el primer meridiano de este SRS. Si ambos[`Head`](./head/) y[`Tail`](./tail/) tener el primer meridiano - devolver el primer meridiano de la cabeza. |
| [Tail](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/tail/) { get; } | Segundo subyacente SRS. |
| override [Type](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/type/) { get; } | Tipo de este SRS Compuesto. Puede serGeographicif este SRS compuesto es una combinación de SRS geográfico y vertical, oProjected if este SRS compuesto es una combinación de SRS proyectado y vertical. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | Crea la transformación a partir de esto`Sistema de referencia espacial` a otro`Sistema de referencia espacial` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | Devuelve la representación de este SRS como una cadena WKT. La cadena WKT resultante coincidirá con la especificación OGC 01-009, generalmente denominada "WKT1". |
| override [GetAxis](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/getaxis/)(int) | Obtener[`Axis`](../axis/) que describe dimension. |
| override [GetUnit](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/getunit/)(int) | Obtener[`Unit`](../unit/)de dimensión. |
| override [IsEquivalent](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | Detecta si este SRS es equivalente a otro SRS. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Devuelve una cadena que representa el objeto actual. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Crea la transformación a partir de esto`Sistema de referencia espacial` a otro`Sistema de referencia espacial` . |
| override [Validate](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/validate/)(out string) | Determine si este SRS es válido. Ver[`Validate`](../spatialreferencesystem/validate/) para descripción de validez. |

### Ver también

* class [SpatialReferenceSystem](../spatialreferencesystem/)
* espacio de nombres [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* asamblea [Aspose.GIS](../../)


