---
title: Enum SpatialReferenceSystemType
second_title: Referencia de API de Aspose.GIS para .NET
description: Aspose.Gis.SpatialReferencing.SpatialReferenceSystemType enumeración. Representa el tipo de sistema de referencia espacial.
type: docs
weight: 2270
url: /es/net/aspose.gis.spatialreferencing/spatialreferencesystemtype/
---
## SpatialReferenceSystemType enumeration

Representa el tipo de sistema de referencia espacial.

```csharp
public enum SpatialReferenceSystemType
```

### Valores

| Nombre | Valor | Descripción |
| --- | --- | --- |
| Unknown | `0` | Valor predeterminado. Se puede devolver desde[`Type`](../spatialreferencesystem/type/) si se trata de un SRS compuesto con una combinación no válida de SRS subyacentes . Ver[`IsCompound`](../spatialreferencesystem/iscompound/) . |
| Geographic | `1` | El SRS geográfico se basa en la longitud angular y la latitud angular. El SRS geográfico se puede convertir en[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem/) vía[`AsGeographic`](../spatialreferencesystem/asgeographic/) método. |
| Geocentric | `2` | El SRS geocéntrico es un SRS cartesiano tridimensional con origen en el centro de la Tierra. El SRS geocéntrico se puede convertir en[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/) vía[`AsGeocentric`](../spatialreferencesystem/asgeocentric/) método. |
| Projected | `3` | SRS proyectado se basa en X lineal y Y lineal. Es el resultado de aplicar una proyección en unGeographic SRS. SRS proyectado se puede convertir a[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem/) vía[`AsProjected`](../spatialreferencesystem/asprojected/) método. |
| Vertical | `4` | El SRS vertical describe la coordenada de altura lineal. El SRS vertical se puede convertir en[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) vía[`AsVertical`](../spatialreferencesystem/asvertical/) método. |
| Local | `5` | El SRS local relaciona las coordenadas con algún objeto, otras con la Tierra. El SRS local se puede convertir a[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) vía[`AsLocal`](../spatialreferencesystem/aslocal/) método. |

### Ver también

* espacio de nombres [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* asamblea [Aspose.GIS](../../)


