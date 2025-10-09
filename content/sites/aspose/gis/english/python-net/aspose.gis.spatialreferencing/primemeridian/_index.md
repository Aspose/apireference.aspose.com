---
title: PrimeMeridian Class
type: docs
weight: 140
url: /python-net/aspose.gis.spatialreferencing/primemeridian/
---

**Summary:** PrimeMeridian represents a meridian at which longitude is defined to be 0.

**Module:** [aspose.gis.spatialreferencing](/psd/python-net/aspose.gis.spatialreferencing/)

**Full Name:** aspose.gis.spatialreferencing.PrimeMeridian

**Inheritance:** IdentifiableObject

**Aspose.PSD Version:** 25.9.0

## **Constructors**
| **Name** | **Description** |
| :- | :- |
| [PrimeMeridian(name, longitude, identifier)](#PrimeMeridian_name_longitude_identifier_1) | Creates new instance. |
## **Properties**
| **Name** | **Type** | **Access** | **Description** |
| :- | :- | :- | :- |
| epsg_code | int | r | If this objects identifier is EPSG identifier - return its code. Otherwise - return -1. |
| greenwich [static] | [PrimeMeridian](/psd/python-net/aspose.gis.spatialreferencing/primemeridian) | r | Greenwich meridian. |
| identifier | [Identifier](/psd/python-net/aspose.gis.spatialreferencing/identifier) | r | Identifier of this identifiable object. |
| longitude | double | r | Distance from Greenwich meridian to prime meridian in degrees. |
| name | string | r | Name of this object. |


### Constructor: PrimeMeridian(name, longitude, identifier) {#PrimeMeridian_name_longitude_identifier_1}


```
 PrimeMeridian(name, longitude, identifier) 
```

Creates new instance.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| name | string | Name of this prime meridian. |
| longitude | double | Longitude of prime meridian relative to Greenwich in degrees. |
| identifier | [Identifier](/psd/python-net/aspose.gis.spatialreferencing/identifier) | Identifier of prime meridian. |

