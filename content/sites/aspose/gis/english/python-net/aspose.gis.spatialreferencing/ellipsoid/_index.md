---
title: Ellipsoid Class
type: docs
weight: 40
url: /python-net/aspose.gis.spatialreferencing/ellipsoid/
---

**Summary:** Ellipsoid represents an ellipsoid, which approximates earth.

**Module:** [aspose.gis.spatialreferencing](/psd/python-net/aspose.gis.spatialreferencing/)

**Full Name:** aspose.gis.spatialreferencing.Ellipsoid

**Inheritance:** IdentifiableObject

**Aspose.PSD Version:** 25.9.0

## **Constructors**
| **Name** | **Description** |
| :- | :- |
| [Ellipsoid(name, semi_major_axis, inverse_flattening, identifier)](#Ellipsoid_name_semi_major_axis_inverse_flattening_identifier_1) | Creates new Ellipsoid. |
## **Properties**
| **Name** | **Type** | **Access** | **Description** |
| :- | :- | :- | :- |
| airy [static] | [Ellipsoid](/psd/python-net/aspose.gis.spatialreferencing/ellipsoid) | r | Airy ellipsoid. |
| epsg_code | int | r | If this objects identifier is EPSG identifier - return its code. Otherwise - return -1. |
| grs80 [static] | [Ellipsoid](/psd/python-net/aspose.gis.spatialreferencing/ellipsoid) | r | GRS 1980 Ellipsoid. |
| identifier | [Identifier](/psd/python-net/aspose.gis.spatialreferencing/identifier) | r | Identifier of this identifiable object. |
| inverse_flattening | double | r | Inverse flattening of ellipsoid. 0 if this is a sphere. |
| is_sphere | bool | r | Detects whether this ellipsoid is a sphere. |
| is_valid | bool | r | Detects whether ellipsoid is valid: its semi major axis is more then 0 and inverse flattening is positive or equal to 0. |
| name | string | r | Name of this object. |
| semi_major_axis | double | r | Semi major axis of ellipsoid. |
| semi_minor_axis | double | r | Semi minor axis of ellipsoid. Equals to semi major axis if this is a sphere. |
| wgs72 [static] | [Ellipsoid](/psd/python-net/aspose.gis.spatialreferencing/ellipsoid) | r | WGS 72 Ellipsoid. |
| wgs84 [static] | [Ellipsoid](/psd/python-net/aspose.gis.spatialreferencing/ellipsoid) | r | WGS 84 Ellipsoid. |
## **Methods**
| **Name** | **Description** |
| :- | :- |
| [is_equivalent(ellipsoid1, ellipsoid2)](#is_equivalent_ellipsoid1_ellipsoid2_1) | Determines if two ellipsoids are equivalent.<br/>            If ellipsoid A is equivalent to ellipsoid B, then they have same semi major axis and inverse flattening. |
| [is_equivalent(other)](#is_equivalent_other_2) | Determines if two ellipsoids are equivalent.<br/>            If ellipsoid A is equivalent to ellipsoid B, then they have same semi major axis and inverse flattening. |


### Constructor: Ellipsoid(name, semi_major_axis, inverse_flattening, identifier) {#Ellipsoid_name_semi_major_axis_inverse_flattening_identifier_1}


```
 Ellipsoid(name, semi_major_axis, inverse_flattening, identifier) 
```

Creates new Ellipsoid.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| name | string | Name of the ellipsoid. |
| semi_major_axis | double | Semi major axis of ellipsoid. |
| inverse_flattening | double | Inverse flattening of ellipsoid. Should be 0 to create a spheroid. |
| identifier | [Identifier](/psd/python-net/aspose.gis.spatialreferencing/identifier) | Identifier of the ellipsoid. |

### Method: is_equivalent(ellipsoid1, ellipsoid2)  [static] {#is_equivalent_ellipsoid1_ellipsoid2_1}


```
 is_equivalent(ellipsoid1, ellipsoid2) 
```

Determines if two ellipsoids are equivalent.<br/>            If ellipsoid A is equivalent to ellipsoid B, then they have same semi major axis and inverse flattening.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| ellipsoid1 | [Ellipsoid](/psd/python-net/aspose.gis.spatialreferencing/ellipsoid) | First ellipsoid. |
| ellipsoid2 | [Ellipsoid](/psd/python-net/aspose.gis.spatialreferencing/ellipsoid) | Second ellipsoid. |

**Returns**

| Type | Description |
| :- | :- |
| bool | bool value, indicating whether two ellipsoids are equivalent. |


### Method: is_equivalent(other) {#is_equivalent_other_2}


```
 is_equivalent(other) 
```

Determines if two ellipsoids are equivalent.<br/>            If ellipsoid A is equivalent to ellipsoid B, then they have same semi major axis and inverse flattening.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| other | [Ellipsoid](/psd/python-net/aspose.gis.spatialreferencing/ellipsoid) | Other ellipsoid. |

**Returns**

| Type | Description |
| :- | :- |
| bool | bool value, indicating whether two ellipsoids are equivalent. |


