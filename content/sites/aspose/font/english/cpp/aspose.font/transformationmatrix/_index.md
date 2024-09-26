---
title: Aspose::Font::TransformationMatrix class
linktitle: TransformationMatrix
second_title: Aspose.Font for C++
description: 'Aspose::Font::TransformationMatrix class. Represents 3x3 transformation matrix | A B 0 | | C D 0 | | TX TY 1 | in C++.'
type: docs
weight: 2900
url: /cpp/aspose.font/transformationmatrix/
---
## TransformationMatrix class


Represents 3x3 transformation matrix | A B 0 | | C D 0 | | TX TY 1 |.

```cpp
class TransformationMatrix : public System::ICloneable
```

## Methods

| Method | Description |
| --- | --- |
| [get_A](./get_a/)() | Gets A transformation matrix value. |
| [get_B](./get_b/)() | Gets B transformation matrix value. |
| [get_C](./get_c/)() | Gets C transformation matrix value. |
| [get_D](./get_d/)() | Gets D transformation matrix value. |
| [get_TX](./get_tx/)() | Gets TX transformation matrix value. |
| [get_TY](./get_ty/)() | Gets TY transformation matrix value. |
| [idx_get](./idx_get/)(int32_t) | Provides access to underlying array. |
| [Multiply](./multiply/)(System::SharedPtr\<TransformationMatrix\>) | Multiplies with another transformation matrix. Doesn't change original transformation matrix, returns a new [TransformationMatrix](./) object. |
| [Scale](./scale/)(double, double, double\&, double\&) | Scales x and y with the transformation matrix: x1 = A*x + C*y; y1 = B*x + D*y. |
| [set_A](./set_a/)(double) | Sets A transformation matrix value. |
| [set_B](./set_b/)(double) | Sets B transformation matrix value. |
| [set_C](./set_c/)(double) | Sets C transformation matrix value. |
| [set_D](./set_d/)(double) | Sets D transformation matrix value. |
| [set_TX](./set_tx/)(double) | Sets TX transformation matrix value. |
| [set_TY](./set_ty/)(double) | Sets TY transformation matrix value. |
| [ToArray](./toarray/)() | Allocates new array, copies the transformation matrix and returns it. |
| [Transform](./transform/)(double, double, double\&, double\&) | Transforms x and y with the transformation matrix: x1 = A*x + C*y + TX; y1 = B*x + D*y + TY. |
| [TransformationMatrix](./transformationmatrix/)() | Creates standard 1 to 1 transformation matrix: [ A B C D TX TY ] = [ 1, 0, 0, 1, 0, 0]. |
| [TransformationMatrix](./transformationmatrix/)(System::ArrayPtr\<double\>) | Accepts a transformation matrix with following array representation: [ A B C D TX TY ]. |
| [UnScale](./unscale/)(double, double, double\&, double\&) | Scales back x1 and y1 and returns x and y before the transformation matrix. |
| [UnTransform](./untransform/)(double, double, double\&, double\&) | Transforms back x1 and y1 and returns x and y before the transformation matrix. |
## Remarks


Transforms coordinates in the following way: x1 = A*x + C*y + TX; y1 = B*x + D*y + TY. 
## See Also

* Class [ICloneable](../../system/icloneable/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
