---
title: PrecisionModel Class
type: docs
weight: 3200
url: /python-net/aspose.gis/precisionmodel/
---

**Summary:** [PrecisionModel](/psd/python-net/aspose.gis/precisionmodel/) specifies a number of significant digits in a coordinate.

**Module:** [aspose.gis](/psd/python-net/aspose.gis/)

**Full Name:** aspose.gis.PrecisionModel

**Aspose.PSD Version:** 25.9.0

## **Properties**
| **Name** | **Type** | **Access** | **Description** |
| :- | :- | :- | :- |
| exact [static] | [PrecisionModel](/psd/python-net/aspose.gis/precisionmodel) | r | Returns an exact precision model.<br/>            According to exact precision model all digits in a double value are significant. |
| is_exact | bool | r | Gets a value indicating whether this precision model is exact. |
| is_rounding | bool | r | Gets a value indicating whether this precision model is rounding. |
| significant_digits | int | r | Gets a number of significant digits in a precision model if it is rounding. |
## **Methods**
| **Name** | **Description** |
| :- | :- |
| [rounding(significant_digits)](#rounding_significant_digits_1) | Returns a rounding precision model.<br/>            According to rounding precision model only a limited number of digits are significant. |


### Method: rounding(significant_digits)  [static] {#rounding_significant_digits_1}


```
 rounding(significant_digits) 
```

Returns a rounding precision model.<br/>            According to rounding precision model only a limited number of digits are significant.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| significant_digits | int | Number of significant digits. |

**Returns**

| Type | Description |
| :- | :- |
| [PrecisionModel](/psd/python-net/aspose.gis/precisionmodel) | Rounding Precision model. |


