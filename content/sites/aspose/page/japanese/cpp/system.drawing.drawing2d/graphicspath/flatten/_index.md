---
title: "System::Drawing::Drawing2D::GraphicsPath::Flatten method"
linktitle: "Flatten"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Drawing2D::GraphicsPath::Flatten メソッド。パス内の各曲線を連続した直線の系列に変換して平坦化します。フラットネス値 0.25 が使用されます（C++）。"
type: docs
weight: 2100
url: /ja/cpp/system.drawing.drawing2d/graphicspath/flatten/
---
## GraphicsPath::Flatten() method


パス内の各曲線を、接続された直線の系列に変換して平坦化します。フラットネス値 0.25 が使用されます。

```cpp
void System::Drawing::Drawing2D::GraphicsPath::Flatten()
```

## 参照

* Class [GraphicsPath](../)
* Namespace [System::Drawing::Drawing2D](../../)
* Library [Aspose.Page for C++](../../../)
## GraphicsPath::Flatten(const MatrixPtr\&) method


パス内の各曲線を、接続された直線の系列に変換して平坦化します。フラットネス値 0.25 が使用されます。

```cpp
void System::Drawing::Drawing2D::GraphicsPath::Flatten(const MatrixPtr &matrix)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 行列 | const MatrixPtr\& | 平坦化する前にパスに適用する変換行列 |

## 参照

* Typedef [MatrixPtr](../../matrixptr/)
* Class [GraphicsPath](../)
* Namespace [System::Drawing::Drawing2D](../../)
* Library [Aspose.Page for C++](../../../)
## GraphicsPath::Flatten(const MatrixPtr\&, float) method


パス内の各曲線を、接続された直線の系列に変換して平坦化します。

```cpp
void System::Drawing::Drawing2D::GraphicsPath::Flatten(const MatrixPtr &matrix, float flatness)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 行列 | const MatrixPtr\& | 平坦化する前にパスに適用する変換行列 |
| フラットネス | 単精度浮動小数点数 | 曲線とその平坦化近似との間の許容最大誤差を指定します |

## 参照

* Typedef [MatrixPtr](../../matrixptr/)
* Class [GraphicsPath](../)
* Namespace [System::Drawing::Drawing2D](../../)
* Library [Aspose.Page for C++](../../../)
