---
title: Projection Class
type: docs
weight: 170
url: /python-net/aspose.gis.spatialreferencing/projection/
---

**Summary:** Represents a projection method with parameters, that transforms (longitude, latitude) to (x, y).

**Module:** [aspose.gis.spatialreferencing](/psd/python-net/aspose.gis.spatialreferencing/)

**Full Name:** aspose.gis.spatialreferencing.Projection

**Inheritance:** IdentifiableObject

**Aspose.PSD Version:** 25.9.0

## **Properties**
| **Name** | **Type** | **Access** | **Description** |
| :- | :- | :- | :- |
| angular_parameters_unit | [Unit](/psd/python-net/aspose.gis.spatialreferencing/unit) | r | Unit that is used for angular parameters. |
| epsg_code | int | r | If this objects identifier is EPSG identifier - return its code. Otherwise - return -1. |
| identifier | [Identifier](/psd/python-net/aspose.gis.spatialreferencing/identifier) | r | Identifier of this identifiable object. |
| linear_parameters_unit | [Unit](/psd/python-net/aspose.gis.spatialreferencing/unit) | r | Unit that is used for linear parameters. |
| name | string | r | Name of this object. |
| parameters_names | System.Collections.Generic.IList<string> | r | Gets an enumerable collection of names of parameters given to this projection |
## **Methods**
| **Name** | **Description** |
| :- | :- |
| [get_parameter_value(name, type)](#get_parameter_value_name_type_1) | Gets parameter with specified name of this projection. |
| [is_equivalent(other)](#is_equivalent_other_2) | Determines is two projections are equivalent. Equivalent projections map (longitude, latitude) to (x, y) in the<br/>            same way. |
| [try_get_parameter_value(name, type)](#try_get_parameter_value_name_type_3) | Gets parameter with specified name of this projection. If there are no such parameter - returns <see langword="null" />. |


### Method: get_parameter_value(name, type) {#get_parameter_value_name_type_1}


```
 get_parameter_value(name, type) 
```

Gets parameter with specified name of this projection.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| name | string | Name of parameter. |
