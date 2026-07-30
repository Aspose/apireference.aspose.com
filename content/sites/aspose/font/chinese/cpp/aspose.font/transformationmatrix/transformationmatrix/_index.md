---
title: "Aspose::Font::TransformationMatrix::TransformationMatrix 构造函数"
linktitle: "TransformationMatrix"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::TransformationMatrix::TransformationMatrix 构造函数。创建标准的 1 对 1 变换矩阵: [ A B C D TX TY ] = [ 1, 0, 0, 1, 0, 0]，在 C++ 中实现。"
type: docs
weight: 100
url: /zh/cpp/aspose.font/transformationmatrix/transformationmatrix/
---
## TransformationMatrix::TransformationMatrix() constructor


创建标准的 1 对 1 变换矩阵：[ A B C D TX TY ] = [ 1, 0, 0, 1, 0, 0]。

```cpp
Aspose::Font::TransformationMatrix::TransformationMatrix()
```

## 另见

* Class [TransformationMatrix](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
## TransformationMatrix::TransformationMatrix(const System::ArrayPtr\<double\>\&) constructor


接受具有以下数组表示形式的变换矩阵: [ A B C D TX TY ]。

```cpp
Aspose::Font::TransformationMatrix::TransformationMatrix(const System::ArrayPtr<double> &matrixArray)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| matrixArray | const System::ArrayPtr\<double\>\& | 包含变换矩阵值的数组，必须有 6 个元素。 |

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TransformationMatrix](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
## TransformationMatrix::TransformationMatrix(double, double, double, double, double, double) constructor


创建变换矩阵 [ A B C D TX TY ]。

```cpp
Aspose::Font::TransformationMatrix::TransformationMatrix(double a, double b, double c, double d, double tx, double ty)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| a | double | A. |
| b | double | B. |
| c | double | C. |
| d | double | D. |
| tx | double | TX. |
| ty | double | TY. |

## 另见

* Class [TransformationMatrix](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
