---
title: Enum SpatialReferenceSystemType
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.SpatialReferencing.SpatialReferenceSystemType enum. Represents type of spatial reference system
type: docs
weight: 4720
url: /net/aspose.gis.spatialreferencing/spatialreferencesystemtype/
---
## SpatialReferenceSystemType enumeration

Represents type of spatial reference system.

```csharp
public enum SpatialReferenceSystemType
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| Unknown | `0` | Default value. Can be returned from [`Type`](../spatialreferencesystem/type/) if this is a compound SRS with invalid combination of underlying SRSs. See [`IsCompound`](../spatialreferencesystem/iscompound/). |
| Geographic | `1` | Geographic SRS is based on angular longitude and angular latitude. Geographic SRS can be converted to [`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem/) via [`AsGeographic`](../spatialreferencesystem/asgeographic/) method. |
| Geocentric | `2` | Geocentric SRS is three dimensional cartesian SRS with origin at Earth center. Geocentric SRS can be converted to [`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/) via [`AsGeocentric`](../spatialreferencesystem/asgeocentric/) method. |
| Projected | `3` | Projected SRS is based on linear X and linear Y. It is the result of application a projection on a Geographic SRS. Projected SRS can be converted to [`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem/) via [`AsProjected`](../spatialreferencesystem/asprojected/) method. |
| Vertical | `4` | Vertical SRS describes linear height coordinate. Vertical SRS can be converted to [`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) via [`AsVertical`](../spatialreferencesystem/asvertical/) method. |
| Local | `5` | Local SRS relates coordinates to some object, other them Earth. Local SRS can be converted to [`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) via [`AsLocal`](../spatialreferencesystem/aslocal/) method. |

### See Also

* namespace [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* assembly [Aspose.GIS](../../)


