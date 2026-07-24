---
title: "Aspose::Page::XPS::XpsDocument::CreateRadialGradientBrush 方法"
linktitle: "CreateRadialGradientBrush"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsDocument::CreateRadialGradientBrush 方法。创建一个新的径向渐变刷子（radial gradient brush）在 C++ 中。"
type: docs
weight: 2700
url: /zh/cpp/aspose.page.xps/xpsdocument/createradialgradientbrush/
---
## XpsDocument::CreateRadialGradientBrush(System::Drawing::PointF, System::Drawing::PointF, float, float) method


创建一个新的径向渐变画刷。

```cpp
System::SharedPtr<XpsModel::XpsRadialGradientBrush> Aspose::Page::XPS::XpsDocument::CreateRadialGradientBrush(System::Drawing::PointF center, System::Drawing::PointF gradientOrigin, float radiusX, float radiusY)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| center | System::Drawing::PointF | 径向渐变的中心点（即椭圆的中心）。 |
| gradientOrigin | System::Drawing::PointF | 径向渐变的起始点。 |
| radiusX | 单精度浮点数 | 定义径向渐变的椭圆在 X 方向的半径。 |
| radiusY | 单精度浮点数 | 定义径向渐变的椭圆在 y 维度上的半径。 |

### ReturnValue

新的径向渐变画刷。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsRadialGradientBrush](../../../aspose.page.xps.xpsmodel/xpsradialgradientbrush/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateRadialGradientBrush(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF, float, float) method


创建一个新的径向渐变画刷。

```cpp
System::SharedPtr<XpsModel::XpsRadialGradientBrush> Aspose::Page::XPS::XpsDocument::CreateRadialGradientBrush(System::SharedPtr<System::Collections::Generic::List<System::SharedPtr<XpsModel::XpsGradientStop>>> gradientStops, System::Drawing::PointF center, System::Drawing::PointF gradientOrigin, float radiusX, float radiusY)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| gradientStops | System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\> | 渐变停止点的列表。 |
| center | System::Drawing::PointF | 径向渐变的中心点（即椭圆的中心）。 |
| gradientOrigin | System::Drawing::PointF | 径向渐变的起始点。 |
| radiusX | 单精度浮点数 | 定义径向渐变的椭圆在 X 方向的半径。 |
| radiusY | 单精度浮点数 | 定义径向渐变的椭圆在 y 维度上的半径。 |

### ReturnValue

新的径向渐变画刷。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsRadialGradientBrush](../../../aspose.page.xps.xpsmodel/xpsradialgradientbrush/)
* Class [List](../../../system.collections.generic/list/)
* Class [XpsGradientStop](../../../aspose.page.xps.xpsmodel/xpsgradientstop/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
