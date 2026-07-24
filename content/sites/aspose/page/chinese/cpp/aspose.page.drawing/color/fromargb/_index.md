---
title: "Aspose::Page::Drawing::Color::FromArgb 方法"
linktitle: "FromArgb"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::Drawing::Color::FromArgb 方法。根据指定的 T:Aspose::Page::Drawing::Color 结构创建一个 T:Aspose::Page::Drawing::Color 结构，但使用新的指定 alpha 值。虽然此方法允许为 alpha 值传递 32 位值，但在 C++ 中该值限制为 8 位。"
type: docs
weight: 100
url: /zh/cpp/aspose.page.drawing/color/fromargb/
---
## Color::FromArgb(int32_t, Aspose::Page::Drawing::Color) method


从指定的 [T:Aspose::Page::Drawing::Color](../) 结构创建一个 [T:Aspose::Page::Drawing::Color](../) 结构，但使用新的指定 alpha 值。虽然此方法允许为 alpha 值传入 32 位值，但该值限制为 8 位。

```cpp
static Aspose::Page::Drawing::Color Aspose::Page::Drawing::Color::FromArgb(int32_t alpha, Aspose::Page::Drawing::Color baseColor)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| alpha | int32_t | 新的 [T:Aspose::Page::Drawing::Color](../) 的 alpha 值。有效值范围为 0 到 255。 |
| baseColor | Aspose::Page::Drawing::Color | 用于创建新的 [T:Aspose::Page::Drawing::Color](../) 的 [T:Aspose::Page::Drawing::Color](../)。 |

### ReturnValue

此方法创建的 [T:Aspose::Page::Drawing::Color](../)。

## 另见

* Class [Color](../)
* Class [Color](../)
* Namespace [Aspose::Page::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Color::FromArgb(int32_t, int32_t, int32_t, int32_t) method


从四个 ARGB 分量（alpha、red、green 和 blue）值创建一个 [T:Aspose::Page::Drawing::Color](../) 结构。虽然此方法允许为每个分量传入 32 位值，但每个分量的值限制为 8 位。

```cpp
static Aspose::Page::Drawing::Color Aspose::Page::Drawing::Color::FromArgb(int32_t alpha, int32_t red, int32_t green, int32_t blue)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| alpha | int32_t | alpha 组件。有效值范围为 0 到 255。 |
| red | int32_t | 红色组件。有效值范围为 0 到 255。 |
| green | int32_t | 绿色组件。有效值范围为 0 到 255。 |
| 蓝色 | int32_t | 蓝色组件。有效值范围为 0 到 255。 |

### ReturnValue

此方法创建的 [T:Aspose::Page::Drawing::Color](../)。

## 另见

* Class [Color](../)
* Class [Color](../)
* Namespace [Aspose::Page::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Color::FromArgb(int32_t) method


从 32 位 ARGB 值创建一个 [T:Aspose::Page::Drawing::Color](../) 结构。

```cpp
static Aspose::Page::Drawing::Color Aspose::Page::Drawing::Color::FromArgb(int32_t argb)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| argb | int32_t | 指定 32 位 ARGB 值的参数。 |

### ReturnValue

此方法创建的 [T:Aspose::Page::Drawing::Color](../) 结构。

## 另见

* Class [Color](../)
* Class [Color](../)
* Namespace [Aspose::Page::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Color::FromArgb(int32_t, int32_t, int32_t) method


从指定的 8 位颜色值（red、green、blue）创建一个 [T:Aspose::Page::Drawing::Color](../) 结构。alpha 值隐式为 255（完全不透明）。虽然此方法允许为每个颜色分量传入 32 位值，但每个分量的值限制为 8 位。

```cpp
static Aspose::Page::Drawing::Color Aspose::Page::Drawing::Color::FromArgb(int32_t red, int32_t green, int32_t blue)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| red | int32_t | 新的 [T:Aspose::Page::Drawing::Color](../) 的红色组件值。有效值范围为 0 到 255。 |
| green | int32_t | 新的 [T:Aspose::Page::Drawing::Color](../) 的绿色组件值。有效值范围为 0 到 255。 |
| blue | int32_t | 新的 [T:Aspose::Page::Drawing::Color](../) 的蓝色组件值。有效值范围为 0 到 255。 |

### ReturnValue

此方法创建的 [T:Aspose::Page::Drawing::Color](../)。

## 另见

* Class [Color](../)
* Class [Color](../)
* Namespace [Aspose::Page::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
