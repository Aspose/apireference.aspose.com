---
title: IMatrix class
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 110
url: /python-net/aspose.svg.drawing/imatrix/
is_root: false
---

## IMatrix class

Represents a matrix used for transformations.



The IMatrix type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [is_identity](/svg/python-net/aspose.svg.drawing/imatrix/is_identity) | Gets a value indicating whether this matrix is the identity matrix. |
| [m11](/svg/python-net/aspose.svg.drawing/imatrix/m11) | Gets or sets the value in the first row and first column of the matrix. |
| [m12](/svg/python-net/aspose.svg.drawing/imatrix/m12) | Gets or sets the value in the first row and second column of the matrix. |
| [m21](/svg/python-net/aspose.svg.drawing/imatrix/m21) | Gets or sets the value in the second row and first column of the matrix. |
| [m22](/svg/python-net/aspose.svg.drawing/imatrix/m22) | Gets or sets the value in the second row and second column of the matrix. |
| [m31](/svg/python-net/aspose.svg.drawing/imatrix/m31) | Gets or sets the value in the third row and first column of the matrix. |
| [m32](/svg/python-net/aspose.svg.drawing/imatrix/m32) | Gets or sets the value in the third row and second column of the matrix. |
| [is_invertible](/svg/python-net/aspose.svg.drawing/imatrix/is_invertible) | Gets a value indicating whether this matrix is invertible. |


### Methods
| Method | Description |
| :- | :- |
| [scale](/svg/python-net/aspose.svg.drawing/imatrix/scale/#float-float-aspose.svg.drawing.WebMatrixOrder) | Scales the matrix by the specified scale factors in the specified order. |
| [scale](/svg/python-net/aspose.svg.drawing/imatrix/scale/#float-float) | Scales the matrix by the specified scale factors uniformly. |
| [translate](/svg/python-net/aspose.svg.drawing/imatrix/translate/#float-float-aspose.svg.drawing.WebMatrixOrder) | Translates the matrix by the specified offset values in the specified order. |
| [translate](/svg/python-net/aspose.svg.drawing/imatrix/translate/#float-float) | Translates the matrix by the specified offset values. |
| [multiply](/svg/python-net/aspose.svg.drawing/imatrix/multiply/#aspose.svg.drawing.IMatrix-aspose.svg.drawing.WebMatrixOrder) | Multiplies this matrix by another matrix in the specified order. |
| [multiply](/svg/python-net/aspose.svg.drawing/imatrix/multiply/#aspose.svg.drawing.IMatrix) | Multiplies this matrix by another matrix. |
| [rotate](/svg/python-net/aspose.svg.drawing/imatrix/rotate/#float-aspose.svg.drawing.WebMatrixOrder) | Rotates the matrix by the specified angle in the specified order. |
| [rotate](/svg/python-net/aspose.svg.drawing/imatrix/rotate/#float) | Rotates the matrix by the specified angle. |
| [rotate_at](/svg/python-net/aspose.svg.drawing/imatrix/rotate_at/#float-aspose.pydrawing.PointF-aspose.svg.drawing.WebMatrixOrder) | Rotates the matrix by the specified angle around the specified point in the specified order. |
| [rotate_at](/svg/python-net/aspose.svg.drawing/imatrix/rotate_at/#float-aspose.pydrawing.PointF) | Rotates the matrix by the specified angle around the specified point. |
| [invert](/svg/python-net/aspose.svg.drawing/imatrix/invert/#) | Inverts this matrix. |
| [get_elements](/svg/python-net/aspose.svg.drawing/imatrix/get_elements/#) | Gets the elements of the matrix as an array. |
| [transform_point](/svg/python-net/aspose.svg.drawing/imatrix/transform_point/#aspose.pydrawing.PointF) | Transforms the specified point using this matrix. |
| [transform_points](/svg/python-net/aspose.svg.drawing/imatrix/transform_points/#aspose.pydrawing.PointF[]) | Transforms an array of points using this matrix. |
| [transform_rectangle](/svg/python-net/aspose.svg.drawing/imatrix/transform_rectangle/#aspose.pydrawing.RectangleF) | Transforms the specified rectangle using this matrix. |
| [skew](/svg/python-net/aspose.svg.drawing/imatrix/skew/#float-float) | Applies a skew transformation to the matrix. |
| [reset](/svg/python-net/aspose.svg.drawing/imatrix/reset/#) | Resets the matrix to the identity matrix. |
| [clone](/svg/python-net/aspose.svg.drawing/imatrix/clone/#) | Creates a copy of this matrix. |



### See Also
* module [`aspose.svg.drawing`](..)
