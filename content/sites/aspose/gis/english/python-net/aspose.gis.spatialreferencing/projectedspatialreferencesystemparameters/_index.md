---
title: ProjectedSpatialReferenceSystemParameters Class
type: docs
weight: 160
url: /python-net/aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/
---

**Summary:** Parameters to create projected SRS. Some of parameters have defaults.<br/>            Some parameters have reasonable defaults, so you don't have to assign only them.<br/>            If you assign <see langword="null" /> to those parameters, a default value will be used.<br/>            [ProjectedSpatialReferenceSystemParameters.projection_method_name](/psd/python-net/aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/) and [ProjectedSpatialReferenceSystemParameters.base](/psd/python-net/aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/) don't have defaults -<br/>            you have to assign some non <see langword="null" /> value to this properties.

**Module:** [aspose.gis.spatialreferencing](/psd/python-net/aspose.gis.spatialreferencing/)

**Full Name:** aspose.gis.spatialreferencing.ProjectedSpatialReferenceSystemParameters

**Aspose.PSD Version:** 25.9.0

## **Constructors**
| **Name** | **Description** |
| :- | :- |
| [ProjectedSpatialReferenceSystemParameters()](#ProjectedSpatialReferenceSystemParameters__1) | Creates new instance. |
## **Properties**
| **Name** | **Type** | **Access** | **Description** |
| :- | :- | :- | :- |
| axises_order | [ProjectedAxisesOrder](/psd/python-net/aspose.gis.spatialreferencing/projectedaxisesorder) | r/w | Order of axises. Defaults to [ProjectedAxisesOrder.XY](/psd/python-net/aspose.gis.spatialreferencing/projectedaxisesorder/). |
| base | [GeographicSpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/geographicspatialreferencesystem) | r/w | Base geographic SRS (SRS to which projection is applied).<br/>            You MUST set this property to not <see langword="null" /> value in order to create valid SRS,<br/>            this property does not have any default. |
| linear_unit | [Unit](/psd/python-net/aspose.gis.spatialreferencing/unit) | r/w | Units to be used in this SRS. Default is [Unit.meter](/psd/python-net/aspose.gis.spatialreferencing/unit/). |
| name | string | r/w | Name of projected SRS. Default is "Unnamed". |
| projection_method_identifier | [Identifier](/psd/python-net/aspose.gis.spatialreferencing/identifier) | r/w | Identifier of projection method. There is no default value, you might set this parameter to not <see langword="null" /> value,<br/>            if you want attach identifier to projection. If you do so - its up to you to ensure that identifier in consistent projection method<br/>            name (projection method name will not change when you set this property). |
| projection_method_name | string | r/w | Name of projection method. There is no default and you MUST set this parameter to not <see langword="null" /> value, since<br/>            projected SRS with no projection name is useless. |
| x_axis | [Axis](/psd/python-net/aspose.gis.spatialreferencing/axis) | r/w | Axis that describes X (horizontal) dimension. Defaults to axis with east direction. |
| y_axis | [Axis](/psd/python-net/aspose.gis.spatialreferencing/axis) | r/w | Axis that describes Y (vertical) dimension. Defaults to axis with north direction. |
## **Methods**
| **Name** | **Description** |
| :- | :- |
| [add_projection_parameter(parameter_name, value)](#add_projection_parameter_parameter_name_value_1) | Adds projection parameter to this SRS. If parameter with such name already was added - update it. |
| [get_projection_parameter(parameter_name)](#get_projection_parameter_parameter_name_2) | Gets projection parameter with specified name. |


### Constructor: ProjectedSpatialReferenceSystemParameters() {#ProjectedSpatialReferenceSystemParameters__1}


```
 ProjectedSpatialReferenceSystemParameters() 
```

Creates new instance.

### Method: add_projection_parameter(parameter_name, value) {#add_projection_parameter_parameter_name_value_1}


```
 add_projection_parameter(parameter_name, value) 
```

Adds projection parameter to this SRS. If parameter with such name already was added - update it.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| parameter_name | string | Name of projection parameter. |
| value | double | Value of parameter. Unit of value should be in [ProjectedSpatialReferenceSystemParameters.linear_unit](/psd/python-net/aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/)<br/>            or [GeographicSpatialReferenceSystem.angular_unit](/psd/python-net/aspose.gis.spatialreferencing/geographicspatialreferencesystem/) of [ProjectedSpatialReferenceSystemParameters.base](/psd/python-net/aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/). |

### Method: get_projection_parameter(parameter_name) {#get_projection_parameter_parameter_name_2}


```
 get_projection_parameter(parameter_name) 
```

Gets projection parameter with specified name.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| parameter_name | string | Name of parameter. |

**Returns**

| Type | Description |
| :- | :- |
| double | Projection parameter value. |


