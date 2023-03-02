---
title: Class ProjectedSpatialReferenceSystem
second_title: Referencia de API de Aspose.GIS para .NET
description: Aspose.Gis.SpatialReferencing.ProjectedSpatialReferenceSystem clase. El SRS proyectado es el resultado de la aplicación de una proyección al SRS geográfico. Un SRS proyectado puede ser bidimensional o tridimensional. Si el SRS proyectado es tridimensional entonces en realidad es un SRS compuesto de SRS proyectado bidimensional y vertical unidimensional. SRS.
type: docs
weight: 2220
url: /es/net/aspose.gis.spatialreferencing/projectedspatialreferencesystem/
---
## ProjectedSpatialReferenceSystem class

El SRS proyectado es el resultado de la aplicación de una proyección al SRS geográfico. Un SRS proyectado puede ser bidimensional o tridimensional. Si el SRS proyectado es tridimensional, entonces en realidad es un SRS compuesto de SRS proyectado bidimensional y vertical unidimensional. SRS.

```csharp
public abstract class ProjectedSpatialReferenceSystem : SpatialReferenceSystem
```

## Propiedades

| Nombre | Descripción |
| --- | --- |
| abstract [AngularUnit](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/angularunit/) { get; } | Unidad, que se utiliza para valores angulares en este SRS y para parámetros angulares de[`Projection`](./projection/) . Coincide con la unidad angular de[`Base`](./base/) . |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound/) { get; } | Devuelve este SRS convertido a[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem/) . Uso[`IsCompound`](../spatialreferencesystem/iscompound/) para saber si la conversión es posible. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric/) { get; } | Devuelve este SRS convertido a[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/) . Uso[`Type`](../spatialreferencesystem/type/) para saber si la conversión es posible. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic/) { get; } | Devuelve este SRS convertido a[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem/) . Uso[`Type`](../spatialreferencesystem/type/) para saber si la conversión es posible. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal/) { get; } | Devuelve este SRS convertido a[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) . Uso[`Type`](../spatialreferencesystem/type/) para saber si la conversión es posible. |
| [AsProjected](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/asprojected/) { get; } | Devuelve esto. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical/) { get; } | Devuelve este SRS convertido a[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) . Uso[`Type`](../spatialreferencesystem/type/) para saber si la conversión es posible. |
| abstract [AxisesOrder](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/axisesorder/) { get; } | Orden de los ejes en este SRS. Si este SRS no es válido y tiene direcciones de ejes incorrectas,Invalid se devuelve. |
| abstract [Base](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/base/) { get; } | SRS geográfico al que[`Projection`](./projection/) se aplicó para obtener este SRS. |
| abstract [DimensionsCount](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/dimensionscount/) { get; } | Devuelve el recuento de dimensiones en este SRS. Para el SRS proyectado, esto puede ser: dos: si se trata de un SRS proyectado simple. tres: si se trata de un SRS compuesto, que consiste en un SRS proyectado simple, bidimensional y un SRS vertical, que agrega una tercera dimensión. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Si el identificador de este objeto es un identificador EPSG, devuelva su código. De lo contrario, devuelva -1. |
| abstract [GeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/geographicdatum/) { get; } | Devuelve el dato geográfico de este SRS. |
| [HasGeographicDatum](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/hasgeographicdatum/) { get; } | Devuelve verdadero, ya que el SRS proyectado siempre tiene el primer meridiano. |
| [HasPrimeMeridian](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/hasprimemeridian/) { get; } | Devuelve verdadero, ya que el SRS proyectado siempre tiene el primer meridiano. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Identificador de este objeto identificable. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/) { get; } | Devuelve si este SRS es compuesto (unión de dos SRS). Se consideran válidas las siguientes combinaciones de SRS en SRS compuesto: SRS Geográfico + SRS Vertical, en este caso el tipo de SRS compuesto seráGeographic . SRS Proyectado + SRS Vertical, en este caso el tipo de SRS compuesto seráProjected . Si la combinación de SRS difiere, el tipo de SRS compuesto seráUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | Devuelve si este SRS es único (no una unión de dos SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | Igual que[`Validate`](../spatialreferencesystem/validate/) , pero no devuelva el mensaje de error. |
| abstract [LinearUnit](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/linearunit/) { get; } | Unidad, que se utiliza para dimensiones lineales en este SRS y para parámetros lineales de[`Projection`](./projection/) . |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Nombre de este objeto. |
| abstract [PrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/primemeridian/) { get; } | Devuelve el primer meridiano de este SRS. |
| abstract [Projection](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/projection/) { get; } | Proyección, que se aplicó a[`Base`](./base/) para obtener este SRS. |
| [Type](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/type/) { get; } | DevolucionesProjected . |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | Crea la transformación a partir de esto`Sistema de referencia espacial` a otro`Sistema de referencia espacial` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | Devuelve la representación de este SRS como una cadena WKT. La cadena WKT resultante coincidirá con la especificación OGC 01-009, generalmente denominada "WKT1". |
| abstract [GetAxis](../../aspose.gis.spatialreferencing/spatialreferencesystem/getaxis/)(int) | Obtener[`Axis`](../axis/) que describe dimension. |
| abstract [GetUnit](../../aspose.gis.spatialreferencing/spatialreferencesystem/getunit/)(int) | Obtener[`Unit`](../unit/)de dimensión. |
| virtual [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | Detecta si este SRS es equivalente a otro SRS. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Devuelve una cadena que representa el objeto actual. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Crea la transformación a partir de esto`Sistema de referencia espacial` a otro`Sistema de referencia espacial` . |
| abstract [Validate](../../aspose.gis.spatialreferencing/spatialreferencesystem/validate/)(out string) | Determinar si este SRS es válido. |

### Ver también

* class [SpatialReferenceSystem](../spatialreferencesystem/)
* espacio de nombres [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* asamblea [Aspose.GIS](../../)


