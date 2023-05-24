---
title: ResizeType enumeration
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 750
url: /aspose.cad/resizetype/
is_root: false
---

## ResizeType enumeration

Specifies the resize type.



The ResizeType type exposes the following members:

### Fields
| Field | Description |
| :- | :- |
| NONE | The pixels are not preserved during resize operation. |
| LEFT_TOP_TO_LEFT_TOP | Left top point of the new image will coincide with the left top point of the original image. Crop will occur if required. |
| RIGHT_TOP_TO_RIGHT_TOP | Right top point of the new image will coincide with the right top point of the original image. Crop will occur if required. |
| RIGHT_BOTTOM_TO_RIGHT_BOTTOM | Right bottom point of the new image will coincide with the right bottom point of the original image. Crop will occur if required. |
| LEFT_BOTTOM_TO_LEFT_BOTTOM | Left bottom point of the new image will coincide with the left bottom point of the original image. Crop will occur if required. |
| CENTER_TO_CENTER | Center of the new image will coincide with the center of the original image. Crop will occur if required. |
| LANCZOS_RESAMPLE | Resample using lanczos algorithm with a=3. |
| NEAREST_NEIGHBOUR_RESAMPLE | Resample using nearest neighbour algorithm. |
| ADAPTIVE_RESAMPLE | Resample using adaptive algorithm based on weighted and blended rational function and lanczos3 interpolation algorithms. |
| BILINEAR_RESAMPLE | Resample using bilinear interpolation. Image pre-filtering is allowed to remove the noice before resample, when needed |



### See Also
* module [`aspose.cad`](..)
