---
title: "Aspose::Page::XPS::XpsModel::XpsPath 类"
linktitle: "XpsPath"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsModel::XpsPath 类。类封装了 Path 元素的特性。此元素是向固定页面添加矢量图形和图像的唯一方式。它在 C++ 中定义了将在页面上呈现的单个矢量图形。"
type: docs
weight: 3000
url: /zh/cpp/aspose.page.xps.xpsmodel/xpspath/
---
## XpsPath class


封装 Path 元素特性的类。此元素是向固定页面添加矢量图形和图像的唯一方式。它定义将在页面上渲染的单个矢量图形。

```cpp
class XpsPath : public Aspose::Page::XPS::XpsModel::XpsContentElement
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Clone](./clone/)() | 克隆此路径。 |
| [get_Data](./get_data/)() | 返回/设置 路径的几何形状。 |
| [get_Fill](./get_fill/)() | 返回/设置 用于绘制路径的 Data 属性指定的几何形状的画刷。 |
| [get_Stroke](./get_stroke/)() | 返回/设置 用于绘制描边的画刷。 |
| [get_StrokeDashArray](./get_strokedasharray/)() const | 返回/设置 指定轮廓描边的虚线和间隙长度的数组。 |
| [get_StrokeDashCap](./get_strokedashcap/)() const | 返回/设置 指定每段虚线端点绘制方式的值。 |
| [get_StrokeDashOffset](./get_strokedashoffset/)() const | 返回/设置 用于重复虚线数组模式的起始点。如果省略此值，虚线数组将与描边的原点对齐。 |
| [get_StrokeEndLineCap](./get_strokeendlinecap/)() const | 返回/设置 定义描边中最后一段虚线末端形状的值。 |
| [get_StrokeLineJoin](./get_strokelinejoin/)() const | 返回/设置 定义描边中第一段虚线起始端形状的值。 |
| [get_StrokeMiterLimit](./get_strokemiterlimit/)() const | 返回/设置 最大斜接长度与描边厚度一半之间的比例。仅当 **StrokeLineJoin** 属性指定 **Miter** 时，此值才有意义。 |
| [get_StrokeStartLineCap](./get_strokestartlinecap/)() const | 返回/设置 定义描边中第一段虚线起始端形状的值。 |
| [get_StrokeThickness](./get_strokethickness/)() const | 返回/设置 描边的厚度，单位为有效坐标空间（包括路径的渲染变换）。描边绘制在 Path 元素的 Data 属性指定的几何边界之上。StrokeThickness 的一半延伸到 Data 属性指定的几何外部，另一半延伸到几何内部。 |
| [set_Data](./set_data/)(System::SharedPtr\<XpsPathGeometry\>) | 返回/设置 路径的几何形状。 |
| [set_Fill](./set_fill/)(System::SharedPtr\<XpsBrush\>) | 返回/设置 用于绘制路径的 Data 属性指定的几何形状的画刷。 |
| [set_Stroke](./set_stroke/)(System::SharedPtr\<XpsBrush\>) | 返回/设置 用于绘制描边的画刷。 |
| [set_StrokeDashArray](./set_strokedasharray/)(System::ArrayPtr\<float\>) | 返回/设置 指定轮廓描边的虚线和间隙长度的数组。 |
| [set_StrokeDashCap](./set_strokedashcap/)(XpsDashCap) | 返回/设置 指定每段虚线端点绘制方式的值。 |
| [set_StrokeDashOffset](./set_strokedashoffset/)(float) | 返回/设置 用于重复虚线数组模式的起始点。如果省略此值，虚线数组将与描边的原点对齐。 |
| [set_StrokeEndLineCap](./set_strokeendlinecap/)(XpsLineCap) | 返回/设置 定义描边中最后一段虚线末端形状的值。 |
| [set_StrokeLineJoin](./set_strokelinejoin/)(XpsLineJoin) | 返回/设置 定义描边中第一段虚线起始端形状的值。 |
| [set_StrokeMiterLimit](./set_strokemiterlimit/)(float) | 返回/设置 最大斜接长度与描边厚度一半之间的比例。仅当 **StrokeLineJoin** 属性指定 **Miter** 时，此值才有意义。 |
| [set_StrokeStartLineCap](./set_strokestartlinecap/)(XpsLineCap) | 返回/设置 定义描边中第一段虚线起始端形状的值。 |
| [set_StrokeThickness](./set_strokethickness/)(float) | 返回/设置 描边的厚度，单位为有效坐标空间（包括路径的渲染变换）。描边绘制在 Path 元素的 Data 属性指定的几何边界之上。StrokeThickness 的一半延伸到 Data 属性指定的几何外部，另一半延伸到几何内部。 |
## 另见

* Class [XpsContentElement](../xpscontentelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
