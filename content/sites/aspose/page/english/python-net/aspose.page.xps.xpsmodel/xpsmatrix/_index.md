---
title: XpsMatrix class
second_title: Aspose.Page for Python via .NET API Reference
description: 
type: docs
weight: 210
url: /python-net/aspose.page.xps.xpsmodel/xpsmatrix/
---

## XpsMatrix class

Class incapsulating MatrixTransform property element features.<br/>            This element defines an arbitrary affine matrix transformation used to manipulate the coordinate<br/>            systems of elements.

**Inheritance:** `XpsMatrix` → [`XpsObject`](/page/python-net/aspose.page.xps.xpsmodel/xpsobject)

The XpsMatrix type exposes the following members:
## Properties
| Name | Description |
| :- | :- |
| `m11` | Gets the M11 element. |
| `m12` | Gets the M12 element. |
| `m21` | Gets the M21 element. |
| `m22` | Gets the M22 element. |
| `m31` | Gets the M31 element. |
| `m32` | Gets the M32 element. |
| `is_identity` | Gets a value indicating whether this instance is identity matrix. |
## Methods
| Name | Description |
| :- | :- |
| `transform_points(points, start_index, number_of_points)` | Applies the affine transformation represented by this Matrix to a specified part of array of points. |
| `transform_points(points)` | Applies the affine transformation represented by this Matrix to a specified part of array of points. |
| `scale(scale_x, scale_y, matrix_order)` | Applies the specified scale vector (scaleX and scaleY) to this Matrix in order<br/>            specified by |
| `scale(scale_x, scale_y)` | Applies the specified scale vector (scaleX and scaleY) to this Matrix in order<br/>            specified by |
| `translate(offset_x, offset_y, matrix_order)` | Applies the specified translation vector to this Matrix in order specified by |
| `translate(offset_x, offset_y)` | Applies the specified translation vector to this Matrix in order specified by |
| `multiply(matrix, matrix_order)` | Multiplies this matrix by the matrix specified by the |
| `multiply(matrix)` | Multiplies this matrix by the matrix specified by the |
| `multiply(matrix, matrix_order)` | Multiplies this matrix by the matrix specified by the |
| `multiply(matrix)` | Multiplies this matrix by the matrix specified by the |
| `rotate(angle, matrix_order)` | Applies clockwise rotation by |
| `rotate(angle)` | Applies clockwise rotation by |
| `rotate_around(angle, pivot, matrix_order)` | Applies clockwise rotation by |
| `rotate_around(angle, pivot)` | Applies clockwise rotation by |
| `transform_point(point)` | Applies the affine transformation represented by this Matrix to a specified part of array of points. |
| `transform(rect)` | Applies the affine transformation represented by this Matrix to a specified rectangle. |
| `skew(skew_x, skew_y)` | Applies specified skew transformation to this Matrix. |
| `reset()` | Resets this Matrix to identity matrix. |
| `equals(a, b)` | Determines whether the specified object is equal to this instance. |
| `clone()` | Clones this transformation matrix. |

### See Also

* module [`aspose.page.xps.xpsmodel`](/page/python-net/aspose.page.xps.xpsmodel/)
* package [`aspose.page`](/page/python-net/)

