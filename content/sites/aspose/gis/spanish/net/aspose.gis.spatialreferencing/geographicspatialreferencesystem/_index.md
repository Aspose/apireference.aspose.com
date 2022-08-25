---
title: GeographicSpatialReferenceSystem
second_title: Referencia de API de Aspose.GIS para .NET
description: Un SRS geográfico es un SRS que se basa en la longitud y la latitud. Un SRS geográfico puede ser bidimensional o tridimensional. Si el SRS geográfico es tridimensional entonces en realidad es un SRS compuesto de SRS bidimensional y SRS vertical.
type: docs
weight: 2030
url: /es/net/aspose.gis.spatialreferencing/geographicspatialreferencesystem/
---
## GeographicSpatialReferenceSystem class

Un SRS geográfico es un SRS que se basa en la longitud y la latitud. Un SRS geográfico puede ser bidimensional o tridimensional. Si el SRS geográfico es tridimensional, entonces en realidad es un SRS compuesto de SRS bidimensional y SRS vertical.

```csharp
public abstract class GeographicSpatialReferenceSystem : SpatialReferenceSystem
```

## Propiedades

| Nombre | Descripción |
| --- | --- |
| abstract [AngularUnit](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/angularunit) { get; } | Unidad, utilizada para dimensiones angulares, en este SRS. |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound) { get; } | Devuelve este SRS convertido a[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem) . Uso[`IsCompound`](../spatialreferencesystem/iscompound) para saber si la conversión es posible. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric) { get; } | Devuelve este SRS convertido a[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem) . Uso[`Type`](../spatialreferencesystem/type) para saber si la conversión es posible. |
| [AsGeographic](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/asgeographic) { get; } | Devuelve esto. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal) { get; } | Devuelve este SRS convertido a[`LocalSpatialReferenceSystem`](../localspatialreferencesystem) . Uso[`Type`](../spatialreferencesystem/type) para saber si la conversión es posible. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected) { get; } | Devuelve este SRS convertido a[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem) . Uso[`Type`](../spatialreferencesystem/type) para saber si la conversión es posible. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical) { get; } | Devuelve este SRS convertido a[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem) . Uso[`Type`](../spatialreferencesystem/type) para saber si la conversión es posible. |
| abstract [AxisesOrder](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/axisesorder) { get; } | Orden de los ejes en este SRS. Si este SRS no es válido y tiene direcciones de ejes incorrectas,Invalid se devuelve. |
| abstract [DimensionsCount](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/dimensionscount) { get; } | Devuelve el recuento de dimensiones en este SRS. Para el SRS geográfico, esto puede ser: dos: si se trata de un SRS geográfico único. tres: si se trata de un SRS compuesto, que consiste en un SRS geográfico único, bidimensional y un SRS vertical, que agrega una tercera dimensión. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode) { get; } | Si el identificador de este objeto es un identificador EPSG, devuelva su código. De lo contrario, devuelva -1. |
| abstract [GeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/geographicdatum) { get; } | Devuelve el dato geográfico de este SRS. |
| [HasGeographicDatum](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/hasgeographicdatum) { get; } | Devoluciones`true` , ya que el SRS geográfico siempre tiene el primer meridiano. |
| [HasPrimeMeridian](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/hasprimemeridian) { get; } | Devoluciones`true` , ya que el SRS geográfico siempre tiene el primer meridiano. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier) { get; } | Identificador de este objeto identificable. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound) { get; } | Devuelve si este SRS es compuesto (unión de dos SRS). Se consideran válidas las siguientes combinaciones de SRS en SRS compuesto: SRS Geográfico + SRS Vertical, en este caso el tipo de SRS compuesto seráGeographic . SRS Proyectado + SRS Vertical, en este caso el tipo de SRS compuesto seráProjected . Si la combinación de SRS difiere, el tipo de SRS compuesto seráUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle) { get; } | Devuelve si este SRS es único (no una unión de dos SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid) { get; } | Igual que[`Validate`](../spatialreferencesystem/validate) , pero no devuelva el mensaje de error. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name) { get; } | Nombre de este objeto. |
| abstract [PrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/primemeridian) { get; } | Devuelve el primer meridiano de este SRS. |
| [Type](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/type) { get; } | DevolucionesGeographic . |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto)(SpatialReferenceSystem) | Crea la transformación a partir de esto`Sistema de referencia espacial` a otro`Sistema de referencia espacial` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt)() | Devuelve la representación de este SRS como una cadena WKT. La cadena WKT resultante coincidirá con la especificación OGC 01-009, generalmente denominada "WKT1". |
| abstract [GetAxis](../../aspose.gis.spatialreferencing/spatialreferencesystem/getaxis)(int) | Obtener[`Axis`](../axis) que describe dimension. |
| abstract [GetUnit](../../aspose.gis.spatialreferencing/spatialreferencesystem/getunit)(int) | Obtener[`Unit`](../unit)de dimensión. |
| virtual [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent)(SpatialReferenceSystem) | Detecta si este SRS es equivalente a otro SRS. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring)() | Devuelve una cadena que representa el objeto actual. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Crea la transformación a partir de esto`Sistema de referencia espacial` a otro`Sistema de referencia espacial` . |
| abstract [Validate](../../aspose.gis.spatialreferencing/spatialreferencesystem/validate)(out string) | Determinar si este SRS es válido. |

### Ver también

* class [SpatialReferenceSystem](../spatialreferencesystem)
* espacio de nombres [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing)
* asamblea [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
