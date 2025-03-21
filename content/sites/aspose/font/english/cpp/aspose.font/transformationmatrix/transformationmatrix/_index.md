---
title: Aspose::Font::TransformationMatrix::TransformationMatrix constructor
linktitle: TransformationMatrix
second_title: Aspose.Font for C++
description: 'Aspose::Font::TransformationMatrix::TransformationMatrix constructor. Creates standard 1 to 1 transformation matrix: [ A B C D TX TY ] = [ 1, 0, 0, 1, 0, 0] in C++.'
type: docs
weight: 100
url: /cpp/aspose.font/transformationmatrix/transformationmatrix/
---
## TransformationMatrix::TransformationMatrix() constructor


Creates standard 1 to 1 transformation matrix: [ A B C D TX TY ] = [ 1, 0, 0, 1, 0, 0].

```cpp
Aspose::Font::TransformationMatrix::TransformationMatrix()
```

## See Also

* Class [TransformationMatrix](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
## TransformationMatrix::TransformationMatrix(const System::ArrayPtr\<double\>\&) constructor


Accepts a transformation matrix with following array representation: [ A B C D TX TY ].

```cpp
Aspose::Font::TransformationMatrix::TransformationMatrix(const System::ArrayPtr<double> &matrixArray)
```


| Parameter | Type | Description |
| --- | --- | --- |
| matrixArray | const System::ArrayPtr\<double\>\& | Array with transformation matrix values, must have 6 elements. |

## See Also

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TransformationMatrix](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
## TransformationMatrix::TransformationMatrix(double, double, double, double, double, double) constructor


Creates transformation matrix [ A B C D TX TY ].

```cpp
Aspose::Font::TransformationMatrix::TransformationMatrix(double a, double b, double c, double d, double tx, double ty)
```


| Parameter | Type | Description |
| --- | --- | --- |
| a | double | A. |
| b | double | B. |
| c | double | C. |
| d | double | D. |
| tx | double | TX. |
| ty | double | TY. |

## See Also

* Class [TransformationMatrix](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
