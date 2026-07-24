---
title: "System::Drawing::Drawing2D::GraphicsPath::Flatten 方法"
linktitle: "Flatten"
second_title: "Aspose.Page 适用于 C++"
description: "System::Drawing::Drawing2D::GraphicsPath::Flatten 方法。通过将路径中的每条曲线转换为一系列相连的直线来展平它们。在 C++ 中使用 0.25 的平整度值。"
type: docs
weight: 2100
url: /zh/cpp/system.drawing.drawing2d/graphicspath/flatten/
---
## GraphicsPath::Flatten() method


通过将路径中的每条曲线转换为一系列相连的直线来将其展平。使用的平整度值为 0.25。

```cpp
void System::Drawing::Drawing2D::GraphicsPath::Flatten()
```

## 另见

* Class [GraphicsPath](../)
* Namespace [System::Drawing::Drawing2D](../../)
* Library [Aspose.Page for C++](../../../)
## GraphicsPath::Flatten(const MatrixPtr\&) method


通过将路径中的每条曲线转换为一系列相连的直线来将其展平。使用的平整度值为 0.25。

```cpp
void System::Drawing::Drawing2D::GraphicsPath::Flatten(const MatrixPtr &matrix)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| matrix | const MatrixPtr\& | 在展平之前应用于路径的变换矩阵 |

## 另见

* Typedef [MatrixPtr](../../matrixptr/)
* Class [GraphicsPath](../)
* Namespace [System::Drawing::Drawing2D](../../)
* Library [Aspose.Page for C++](../../../)
## GraphicsPath::Flatten(const MatrixPtr\&, float) method


通过将路径中的每条曲线转换为一系列相连的直线来将其展平。

```cpp
void System::Drawing::Drawing2D::GraphicsPath::Flatten(const MatrixPtr &matrix, float flatness)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| matrix | const MatrixPtr\& | 在展平之前应用于路径的变换矩阵 |
| flatness | 单精度浮点数 | 指定曲线与其展平近似之间允许的最大误差 |

## 另见

* Typedef [MatrixPtr](../../matrixptr/)
* Class [GraphicsPath](../)
* Namespace [System::Drawing::Drawing2D](../../)
* Library [Aspose.Page for C++](../../../)
