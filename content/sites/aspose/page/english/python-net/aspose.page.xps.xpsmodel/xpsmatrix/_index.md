---
title: XpsMatrix class
second_title: Aspose.Page for Python via .NET API References
description: 
type: docs
weight: 210
url: /python-net/aspose.page.xps.xpsmodel/xpsmatrix/
is_root: false
---

## XpsMatrix class

Class incapsulating MatrixTransform property element features.
This element defines an arbitrary affine matrix transformation used to manipulate the coordinate
systems of elements.



**Inheritance:** [`XpsMatrix`](/page/python-net/aspose.page.xps.xpsmodel/xpsmatrix) → 
[`XpsObject`](/page/python-net/aspose.page.xps.xpsmodel/xpsobject)



The XpsMatrix type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [m11](/page/python-net/aspose.page.xps.xpsmodel/xpsmatrix/m11) | Gets the M11 element. |
| [m12](/page/python-net/aspose.page.xps.xpsmodel/xpsmatrix/m12) | Gets the M12 element. |
| [m21](/page/python-net/aspose.page.xps.xpsmodel/xpsmatrix/m21) | Gets the M21 element. |
| [m22](/page/python-net/aspose.page.xps.xpsmodel/xpsmatrix/m22) | Gets the M22 element. |
| [m31](/page/python-net/aspose.page.xps.xpsmodel/xpsmatrix/m31) | Gets the M31 element. |
| [m32](/page/python-net/aspose.page.xps.xpsmodel/xpsmatrix/m32) | Gets the M32 element. |
| [is_identity](/page/python-net/aspose.page.xps.xpsmodel/xpsmatrix/is_identity) | Gets a value indicating whether this instance is identity matrix. |


### Methods
| Method | Description |
| :- | :- |
| [transform_points](/page/python-net/aspose.page.xps.xpsmodel/xpsmatrix/transform_points/#aspose.pydrawing.PointF[]-int-int) | Applies the affine transformation represented by this Matrix to a specified part of array of points. |
| [transform_points](/page/python-net/aspose.page.xps.xpsmodel/xpsmatrix/transform_points/#aspose.pydrawing.PointF[]) | Applies the affine transformation represented by this Matrix to a specified array of points. |
| [scale](/page/python-net/aspose.page.xps.xpsmodel/xpsmatrix/scale/#float-float-aspose.pydrawing.drawing2d.MatrixOrder) | Applies the specified scale vector (scaleX and scaleY) to this Matrix in order<br/>specified by `matrix_order`. |
| [scale](/page/python-net/aspose.page.xps.xpsmodel/xpsmatrix/scale/#float-float) | Applies the specified scale vector (scaleX and scaleY) to this Matrix in default (Prepend) order. |
| [translate](/page/python-net/aspose.page.xps.xpsmodel/xpsmatrix/translate/#float-float-aspose.pydrawing.drawing2d.MatrixOrder) | Applies the specified translation vector to this Matrix in order specified by `matrix_order`. |
| [translate](/page/python-net/aspose.page.xps.xpsmodel/xpsmatrix/translate/#float-float) | Applies the specified translation vector to this Matrix. |
| [multiply](/page/python-net/aspose.page.xps.xpsmodel/xpsmatrix/multiply/#aspose.pydrawing.drawing2d.Matrix-aspose.pydrawing.drawing2d.MatrixOrder) | Multiplies this matrix by the matrix specified by the `matrix`<br/>in order specified by `matrix_order`. |
| [multiply](/page/python-net/aspose.page.xps.xpsmodel/xpsmatrix/multiply/#aspose.pydrawing.drawing2d.Matrix) | Multiplies this matrix by the matrix specified by the `matrix`<br/>in default (Prepend) order. |
| [multiply](/page/python-net/aspose.page.xps.xpsmodel/xpsmatrix/multiply/#aspose.page.xps.xpsmodel.XpsMatrix-aspose.pydrawing.drawing2d.MatrixOrder) | Multiplies this matrix by the matrix specified by the `matrix`<br/>in order specified by `matrix_order`. |
| [multiply](/page/python-net/aspose.page.xps.xpsmodel/xpsmatrix/multiply/#aspose.page.xps.xpsmodel.XpsMatrix) | Multiplies this matrix by the matrix specified by the `matrix`<br/>in default (Prepend) order. |
| [rotate](/page/python-net/aspose.page.xps.xpsmodel/xpsmatrix/rotate/#float-aspose.pydrawing.drawing2d.MatrixOrder) | Applies clockwise rotation by `angle` to this Matrix in order<br/>specified by `matrix_order`. |
| [rotate](/page/python-net/aspose.page.xps.xpsmodel/xpsmatrix/rotate/#float) | Applies clockwise rotation by `angle` to this Matrix in default (Prepend) order. |
| [rotate_around](/page/python-net/aspose.page.xps.xpsmodel/xpsmatrix/rotate_around/#float-aspose.pydrawing.PointF-aspose.pydrawing.drawing2d.MatrixOrder) | Applies clockwise rotation by `angle` around the `pivot`<br/>to this Matrix in order specified by `matrix_order`. |
| [rotate_around](/page/python-net/aspose.page.xps.xpsmodel/xpsmatrix/rotate_around/#float-aspose.pydrawing.PointF) | Applies clockwise rotation by `angle` around the `pivot`<br/>to this Matrix in default (Prepend) order. |
| [transform_point](/page/python-net/aspose.page.xps.xpsmodel/xpsmatrix/transform_point/#aspose.pydrawing.PointF) | Applies the affine transformation represented by this Matrix to a specified point. |
| [transform](/page/python-net/aspose.page.xps.xpsmodel/xpsmatrix/transform/#aspose.pydrawing.RectangleF) | Applies the affine transformation represented by this Matrix to a specified rectangle. |
| [skew](/page/python-net/aspose.page.xps.xpsmodel/xpsmatrix/skew/#float-float) | Applies specified skew transformation to this Matrix. |
| [reset](/page/python-net/aspose.page.xps.xpsmodel/xpsmatrix/reset/#) | Resets this Matrix to identity matrix. |
| [equals](/page/python-net/aspose.page.xps.xpsmodel/xpsmatrix/equals/#aspose.page.xps.xpsmodel.XpsMatrix-aspose.page.xps.xpsmodel.XpsMatrix) | The actual implementation. |
| [clone](/page/python-net/aspose.page.xps.xpsmodel/xpsmatrix/clone/#) | Clones this transformation matrix. |



### See Also
* module [`aspose.page.xps.xpsmodel`](..)
* class [`XpsMatrix`](/page/python-net/aspose.page.xps.xpsmodel/xpsmatrix)
* class [`XpsObject`](/page/python-net/aspose.page.xps.xpsmodel/xpsobject)
