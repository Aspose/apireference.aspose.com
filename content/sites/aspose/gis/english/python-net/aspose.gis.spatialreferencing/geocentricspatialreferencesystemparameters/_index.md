---
title: GeocentricSpatialReferenceSystemParameters Class
type: docs
weight: 60
url: /python-net/aspose.gis.spatialreferencing/geocentricspatialreferencesystemparameters/
---

**Summary:** Parameters to create geocentric SRS.<br/>            Parameters have reasonable defaults, so you will have to assign only some of them.<br/>            If you assign <see langword="null" /> to any parameter, a default value will be used.

**Module:** [aspose.gis.spatialreferencing](/psd/python-net/aspose.gis.spatialreferencing/)

**Full Name:** aspose.gis.spatialreferencing.GeocentricSpatialReferenceSystemParameters

**Aspose.PSD Version:** 25.9.0

## **Constructors**
| **Name** | **Description** |
| :- | :- |
| [GeocentricSpatialReferenceSystemParameters()](#GeocentricSpatialReferenceSystemParameters__1) | Initializes a new instance of the GeocentricSpatialReferenceSystemParameters class |
## **Properties**
| **Name** | **Type** | **Access** | **Description** |
| :- | :- | :- | :- |
| axises_order | [GeocentricAxisesOrder](/psd/python-net/aspose.gis.spatialreferencing/geocentricaxisesorder) | r/w | Order of axises. Defaults to [GeocentricAxisesOrder.XYZ](/psd/python-net/aspose.gis.spatialreferencing/geocentricaxisesorder/). |
| datum | [GeographicDatum](/psd/python-net/aspose.gis.spatialreferencing/geographicdatum) | r/w | Datum of geocentric SRS. Default is [GeographicDatum.wgs84](/psd/python-net/aspose.gis.spatialreferencing/geographicdatum/). |
| linear_unit | [Unit](/psd/python-net/aspose.gis.spatialreferencing/unit) | r/w | Units to be used in this SRS. Defaults to [Unit.meter](/psd/python-net/aspose.gis.spatialreferencing/unit/). |
| name | string | r/w | Name of geocentric SRS. Default is "Unnamed". |
| prime_meridian | [PrimeMeridian](/psd/python-net/aspose.gis.spatialreferencing/primemeridian) | r/w | Prime meridian of this SRS. Default is [PrimeMeridian.greenwich](/psd/python-net/aspose.gis.spatialreferencing/primemeridian/). |
| x_axis | [Axis](/psd/python-net/aspose.gis.spatialreferencing/axis) | r/w | Axis of geocentric SRS that describes 'X' dimension (axis that points at prime meridian). |
| y_axis | [Axis](/psd/python-net/aspose.gis.spatialreferencing/axis) | r/w | Axis of geocentric SRS that describes 'Y' dimension (axis that points to the left or to the right of X axis on equatorial plane).<br/>            Defaults to axis with [AxisDirection.EAST](/psd/python-net/aspose.gis.spatialreferencing/axisdirection/) direction. |
| z_axis | [Axis](/psd/python-net/aspose.gis.spatialreferencing/axis) | r/w | Axis of geocentric SRS that describes 'Z' dimension (axis that points to the north or south pole).<br/>            Defaults to axis with [AxisDirection.NORTH](/psd/python-net/aspose.gis.spatialreferencing/axisdirection/) direction. |


### Constructor: GeocentricSpatialReferenceSystemParameters() {#GeocentricSpatialReferenceSystemParameters__1}


```
 GeocentricSpatialReferenceSystemParameters() 
```

Initializes a new instance of the GeocentricSpatialReferenceSystemParameters class

