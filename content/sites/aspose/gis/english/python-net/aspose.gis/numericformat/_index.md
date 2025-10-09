---
title: NumericFormat Class
type: docs
weight: 2870
url: /python-net/aspose.gis/numericformat/
---

**Summary:** [NumericFormat](/psd/python-net/aspose.gis/numericformat/) are used to format common numeric types in text.

**Module:** [aspose.gis](/psd/python-net/aspose.gis/)

**Full Name:** aspose.gis.NumericFormat

**Aspose.PSD Version:** 25.9.0

## **Properties**
| **Name** | **Type** | **Access** | **Description** |
| :- | :- | :- | :- |
| round_trip [static] | [NumericFormat](/psd/python-net/aspose.gis/numericformat) | r | Converts and attempts to ensure that a numeric value that is converted to<br/>            a string is parsed back into the same numeric value. |
## **Methods**
| **Name** | **Description** |
| :- | :- |
| [flat(significant_digits)](#flat_significant_digits_1) | Converts a number to a fixed-point text without a scientific notation. |
| [general(precision)](#general_precision_2) | Converts a number to the more compact of either fixed-point or scientific notation,<br/>            depending on the type of the number and whether a precision specifier is present. Recommended to use. |


### Method: flat(significant_digits)  [static] {#flat_significant_digits_1}


```
 flat(significant_digits) 
```

Converts a number to a fixed-point text without a scientific notation.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| significant_digits | int | Number of significant digits. The maximum available precision is "308" |

**Returns**

| Type | Description |
| :- | :- |
| [NumericFormat](/psd/python-net/aspose.gis/numericformat) | The Rounding Precision Specifier. |


### Method: general(precision)  [static] {#general_precision_2}


```
 general(precision) 
```

Converts a number to the more compact of either fixed-point or scientific notation,<br/>            depending on the type of the number and whether a precision specifier is present. Recommended to use.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| precision | int | The precision defines the maximum number of significant digits that can appear in the result string.<br/>            If the precision is zero, the value "15" is used. The maximum available precision is "17". |

**Returns**

| Type | Description |
| :- | :- |
| [NumericFormat](/psd/python-net/aspose.gis/numericformat) | The General Format Specifier. |


