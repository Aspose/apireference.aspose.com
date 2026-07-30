---
title: "System::Drawing::Drawing2D::GraphicsPath::Flatten 方法"
linktitle: "展平"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Drawing2D::GraphicsPath::Flatten 方法。通过将路径中的每条曲线转换为一系列相连的直线来展平它们。C++ 中使用的平整度值为 0.25。"
type: docs
weight: 2100
url: /zh/cpp/system.drawing.drawing2d/graphicspath/flatten/
---
## GraphicsPath::Flatten() method


通过将路径中的每条曲线转换为一系列相连的直线来将其扁平化。使用的平整度值为 0.25。

```cpp
void System::Drawing::Drawing2D::GraphicsPath::Flatten()
```

## 另见

* Class [GraphicsPath](../)
* Namespace [System::Drawing::Drawing2D](../../)
* Library [Aspose.Font for C++](../../../)
## GraphicsPath::Flatten(const MatrixPtr\&) method


通过将路径中的每条曲线转换为一系列相连的直线来将其扁平化。使用的平整度值为 0.25。

```cpp
void System::Drawing::Drawing2D::GraphicsPath::Flatten(const MatrixPtr &matrix)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 矩阵 | const MatrixPtr\& | 在展平之前应用于路径的变换矩阵 |

## 另见

* Typedef [MatrixPtr](../../matrixptr/)
* Class [GraphicsPath](../)
* Namespace [System::Drawing::Drawing2D](../../)
* Library [Aspose.Font for C++](../../../)
## GraphicsPath::Flatten(const MatrixPtr\&, float) method


通过将路径中的每条曲线转换为一系列相连的直线来将其扁平化。

```cpp
void System::Drawing::Drawing2D::GraphicsPath::Flatten(const MatrixPtr &matrix, float flatness)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 矩阵 | const MatrixPtr\& | 在展平之前应用于路径的变换矩阵 |
| 平整度 | float | 指定曲线与其展平近似之间允许的最大误差 |

## 另见

* Typedef [MatrixPtr](../../matrixptr/)
* Class [GraphicsPath](../)
* Namespace [System::Drawing::Drawing2D](../../)
* Library [Aspose.Font for C++](../../../)
