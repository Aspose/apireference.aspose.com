---
title: InterpolationFilterType
second_title: Aspose.OCR for Java API Reference
description: 
type: docs
weight: 39
url: /java/com.aspose.ocr/interpolationfiltertype/
---

**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum InterpolationFilterType extends Enum<InterpolationFilterType>
```
## Fields

| Field | Description |
| --- | --- |
| [Box](#Box) | The 'Box' Or 'Nearest Neighbor' filter |
| [Triangle](#Triangle) | The 'Triangle' or 'Bilinear' interpolation filter just takes the interpolation of the nearest neighbourhood one step further. |
| [Bicubic](#Bicubic) |  |
## Methods

| Method | Description |
| --- | --- |
| [values()](#values--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
### Box {#Box}
```
public static final InterpolationFilterType Box
```


The 'Box' Or 'Nearest Neighbor' filter

### Triangle {#Triangle}
```
public static final InterpolationFilterType Triangle
```


The 'Triangle' or 'Bilinear' interpolation filter just takes the interpolation of the nearest neighbourhood one step further.

### Bicubic {#Bicubic}
```
public static final InterpolationFilterType Bicubic
```




### values() {#values--}
```
public static InterpolationFilterType[] values()
```




**Returns:**
com.aspose.ocr.InterpolationFilterType[]
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static InterpolationFilterType valueOf(String name)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String |  |

**Returns:**
[InterpolationFilterType](../../com.aspose.ocr/interpolationfiltertype)
