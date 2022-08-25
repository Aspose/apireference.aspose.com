---
title: VerticalSpatialReferenceSystem
second_title: Referencia de API de Aspose.GIS para .NET
description: Vertical SRS es un SRS unidimensional que describe coordenadas de altura.
type: docs
weight: 2210
url: /es/net/aspose.gis.spatialreferencing/verticalspatialreferencesystem/
---
## VerticalSpatialReferenceSystem class

Vertical SRS es un SRS unidimensional que describe coordenadas de altura.

```csharp
public class VerticalSpatialReferenceSystem : SpatialReferenceSystem
```

## Propiedades

| Nombre | Descripción |
| --- | --- |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound) { get; } | Devuelve este SRS convertido a[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem) . Uso[`IsCompound`](../spatialreferencesystem/iscompound) para saber si la conversión es posible. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric) { get; } | Devuelve este SRS convertido a[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem) . Uso[`Type`](../spatialreferencesystem/type) para saber si la conversión es posible. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic) { get; } | Devuelve este SRS convertido a[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem) . Uso[`Type`](../spatialreferencesystem/type) para saber si la conversión es posible. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal) { get; } | Devuelve este SRS convertido a[`LocalSpatialReferenceSystem`](../localspatialreferencesystem) . Uso[`Type`](../spatialreferencesystem/type) para saber si la conversión es posible. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected) { get; } | Devuelve este SRS convertido a[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem) . Uso[`Type`](../spatialreferencesystem/type) para saber si la conversión es posible. |
| override [AsVertical](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/asvertical) { get; } | Devuelve este SRS. |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/dimensionscount) { get; } | Devuelve 1, ya que el SRS vertical siempre es unidimensional. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode) { get; } | Si el identificador de este objeto es un identificador EPSG, devuelva su código. De lo contrario, devuelva -1. |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/geographicdatum) { get; } | LanzaInvalidOperationException , ya que Vertical SRS no tiene datum geográfico. |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/hasgeographicdatum) { get; } | Devoluciones`false` , ya que Vertical SRS no tiene datum geográfico. |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/hasprimemeridian) { get; } | Devoluciones`false` , ya que Vertical SRS no tiene primer meridiano. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier) { get; } | Identificador de este objeto identificable. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound) { get; } | Devuelve si este SRS es compuesto (unión de dos SRS). Se consideran válidas las siguientes combinaciones de SRS en SRS compuesto: SRS Geográfico + SRS Vertical, en este caso el tipo de SRS compuesto seráGeographic . SRS Proyectado + SRS Vertical, en este caso el tipo de SRS compuesto seráProjected . Si la combinación de SRS difiere, el tipo de SRS compuesto seráUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle) { get; } | Devuelve si este SRS es único (no una unión de dos SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid) { get; } | Igual que[`Validate`](../spatialreferencesystem/validate) , pero no devuelva el mensaje de error. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name) { get; } | Nombre de este objeto. |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/primemeridian) { get; } | LanzaInvalidOperationException , ya que Vertical SRS no tiene primer meridiano. |
| override [Type](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/type) { get; } | VolverVertical . |
| [VerticalDatum](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/verticaldatum) { get; } | Datum que se utiliza en este SRS. |
| [VerticalUnit](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/verticalunit) { get; } | Unidad que se utiliza en este SRS. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto)(SpatialReferenceSystem) | Crea la transformación a partir de esto`Sistema de referencia espacial` a otro`Sistema de referencia espacial` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt)() | Devuelve la representación de este SRS como una cadena WKT. La cadena WKT resultante coincidirá con la especificación OGC 01-009, generalmente denominada "WKT1". |
| override [GetAxis](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/getaxis)(int) | Obtener[`Axis`](../axis) que describe dimension. |
| override [GetUnit](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/getunit)(int) | Obtener[`Unit`](../unit)de dimensión. |
| override [IsEquivalent](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/isequivalent)(SpatialReferenceSystem) | Detecta si este SRS es equivalente a otro SRS. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring)() | Devuelve una cadena que representa el objeto actual. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Crea la transformación a partir de esto`Sistema de referencia espacial` a otro`Sistema de referencia espacial` . |
| override [Validate](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/validate)(out string) | Determine si este SRS es válido. Ver[`Validate`](../spatialreferencesystem/validate) para descripción de validez. |

### Ver también

* class [SpatialReferenceSystem](../spatialreferencesystem)
* espacio de nombres [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing)
* asamblea [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
